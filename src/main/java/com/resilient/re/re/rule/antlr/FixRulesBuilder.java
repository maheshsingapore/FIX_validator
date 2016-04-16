package com.resilient.re.re.rule.antlr;


import com.resilient.re.re.ext.ValidCondition;
import com.resilient.re.re.ext.gen.FixRulesBaseListener;
import com.resilient.re.re.ext.gen.FixRulesParser;
import com.resilient.re.re.rule.condition.*;
import com.resilient.re.re.rule.event.FieldTransformer;
import com.resilient.re.re.rule.event.FieldTransformers;
import com.resilient.re.re.rule.type.TypeInferer;
import com.resilient.re.re.rule.core.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by maheshvibhute on 3/13/16.
 */
public class FixRulesBuilder extends FixRulesBaseListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(FixRulesBuilder.class);
    private Stack<BHolder> branchStack = new Stack<>();
    private Stack<Stack<BHolder>> rootStack = new Stack<>();

    private GroovyTag tag;
    private GroovyRuleBuilder builder;

    private boolean createNewTagRule = true;
    private List<RuleBuilder> ruleBuilders;

    @Override
    public void enterRules(FixRulesParser.RulesContext ctx) {
        ruleBuilders = new ArrayList<>();
    }

    @Override
    public void enterAbsent(FixRulesParser.AbsentContext ctx) {
        builder.addCondition(IS_ABSENT);
    }

    @Override
    public void enterPresent(FixRulesParser.PresentContext ctx) {
        builder.addCondition(IS_PRESENT);
    }

    @Override
    public void enterMandatory(FixRulesParser.MandatoryContext ctx) {
        builder.addCondition(MANDATORY);
    }

    @Override
    public void enterNumeric(FixRulesParser.NumericContext ctx) {
        builder.addCondition(IS_NUMERIC);
    }

    @Override
    public void enterAlphanumeric(FixRulesParser.AlphanumericContext ctx) {
        builder.addCondition(IS_ALPHANUMERIC);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        //System.out.println("enterEveryRule: " + ctx.getText());
    }

    @Override
    public void enterList(FixRulesParser.ListContext ctx) {
        String listOperand = ctx.getText();
        String listOperator = ctx.getParent().getChild(0).getText();

        listOperand = listOperand.replaceAll("\\[|\\]|\"", "");
        String[] listOperands = listOperand.split(Constants.COMMA);

        switch (listOperator) {
            case "not in":
                builder.addCondition(new NotCondition(new ContainsCondition(listOperands)));
                break;
            case "in":
                builder.oneOf(listOperands);
                break;
            default:
                System.out.println("unrecognized list operator: " + listOperator);
        }
    }

    @Override
    public void enterListOperator(FixRulesParser.ListOperatorContext ctx) {
        String listOperator = ctx.getText();
    }

    @Override
    public void enterBiOperand(FixRulesParser.BiOperandContext ctx) {
        String text = ctx.getText();
        text = text.replaceAll("\\)|\\(", "");

        String[] operands = text.split(Constants.COMMA);
        if (operands != null && operands.length == 2) {
            String op1 = operands[0];
            String op2 = operands[1];

            builder.addCondition(new BetweenCondition(Double.parseDouble(op1), Double.parseDouble(op2)));
        }
    }

    @Override
    public void enterTagStmt(FixRulesParser.TagStmtContext ctx) {
        List<FixRulesParser.TagContext> tags = ctx.tag();

        String operator = ctx.getParent().getChild(0).getText();
        String operand = ctx.getText();

        FieldTransformers.TagConcatenator concatenator = new FieldTransformers.TagConcatenator();
        for (FixRulesParser.TagContext t : tags) {
            String tag = t.INT().getText();
            concatenator.concat(tag);
        }

        switch (operator) {
            case "equal to":
            case "=":
                builder.addCondition(new EqualsCondition(concatenator));
                break;
            default:
                System.out.println("unrecognized tag operator: " + operator);
        }
    }

    @Override
    public void enterOnlyIf(FixRulesParser.OnlyIfContext ctx) {
        //  System.out.println("onlyIf");
    }

    @Override
    public void enterValid(FixRulesParser.ValidContext ctx) {
        builder.addCondition(new ValidCondition(builder.getTag()));
    }

    @Override
    public void enterAnd(FixRulesParser.AndContext ctx) {
        createNewTagRule = true;
        branchStack.push(new BHolder("and", builder));
        builder = builder.getAnd();
    }

    @Override
    public void enterOr(FixRulesParser.OrContext ctx) {
        createNewTagRule = true;
        branchStack.push(new BHolder("or", builder));
        builder = builder.getOr();
    }

    @Override
    public void exitAnd(FixRulesParser.AndContext ctx) {

    }

    @Override
    public void enterTag(FixRulesParser.TagContext ctx) {
        String tagNumber = ctx.INT().getText();

        if (createNewTagRule) {
            this.tag = new GroovyTag(Integer.parseInt(tagNumber));
            this.builder = tag.getMustBe();
        }
        createNewTagRule = false;
    }

    @Override
    public void enterOpenBracket(FixRulesParser.OpenBracketContext ctx) {
        rootStack.push(branchStack);
        branchStack = new Stack<>();
    }

    @Override
    public void enterCloseBracket(FixRulesParser.CloseBracketContext ctx) {
        Iterator<Stack<BHolder>> iterator = rootStack.iterator();

        while (iterator.hasNext()) {
            processStack();
            branchStack = rootStack.pop();
        }
    }

    @Override
    public void enterIfRule(FixRulesParser.IfRuleContext ctx) {
        createNewTagRule = true;
        GroovyRuleBuilder thenCondition = builder;
        branchStack.push(new BHolder("if", thenCondition));
    }

    @Override
    public void exitIfRule(FixRulesParser.IfRuleContext ctx) {

    }

    @Override
    public void enterMustBe(FixRulesParser.MustBeContext ctx) {
        builder = builder == null ? tag.getMustBe() : builder;
    }

    //TODO
    @Override
    public void enterMustNotBe(FixRulesParser.MustNotBeContext ctx) {
        builder = tag.getMustNotBe();
    }

    @Override
    public void enterIs(FixRulesParser.IsContext ctx) {
        builder = builder == null ? builder = tag.getIs() : builder;
    }

    private boolean conditionalStmt() {
        return branchStack != null;
    }

    @Override
    public void enterLogicalCondition(FixRulesParser.LogicalConditionContext ctx) {
        //System.out.println("logicalCondition:" + ctx.getText());
    }

    @Override
    public void enterMonoOperand(FixRulesParser.MonoOperandContext ctx) {
        ParserRuleContext parent = ctx.getParent();

        String operator = parent.getChild(0).getText();
        String operand = ctx.getText();

        operand = operand.replaceAll("\"", "");
        FieldTransformer transformed = TypeInferer.infer(operand);

        switch (operator) {
            case "match":
            case "~=":
                builder.addCondition(new PatternCondition(operand));
                break;
            case "equal to":
            case "=":
                builder.addCondition(new EqualsCondition(transformed));
                break;
            case "greater than":
            case ">":
                builder.addCondition(new GreaterThanCondition(transformed));
                break;
            case "greater than equals":
            case ">=":
                builder.addCondition(new GreaterThanCondition(transformed, false));
                break;
            case "less than":
            case "<":
                builder.addCondition(new LessThanCondition(transformed));
                break;
            case "less than equals":
            case "<=":
                builder.addCondition(new LessThanCondition(transformed, false));
                break;
            case "!=":
                builder.addCondition(new NotCondition(new EqualsCondition(transformed)));
                break;
            default:
                System.out.println("unrecognized mono operator: " + operator);
        }
    }

    @Override
    public void enterMonoOperandOperator(FixRulesParser.MonoOperandOperatorContext ctx) {
        //used by child
    }

    private boolean isPresent(FixRulesParser.LogicalOperatorContext logicalOperator) {
        return logicalOperator != null;
    }

    @Override
    public void enterAction(FixRulesParser.ActionContext ctx) {
    }

    @Override
    public void enterRule(FixRulesParser.RuleContext ctx) {
        String tagNumber = ctx.tag().INT().getText();

        createNewTagRule = true;

        branchStack.removeAllElements();
        rootStack.removeAllElements();

        this.tag = new GroovyTag(Integer.parseInt(tagNumber));
        builder = this.tag.getMustBe();
    }

    @Override
    public void exitRule(FixRulesParser.RuleContext ctx) {
        processStack();

        if (builder != null) {
            if (LOGGER.isInfoEnabled())
                LOGGER.info(String.format("New rule: %s", builder));

            ruleBuilders.add(builder);
        }
    }

    public List<RuleBuilder> getRuleBuilders() {
        return ruleBuilders;
    }

    private void processStack() {
        if (branchStack.size() > 0) {

            Iterator<BHolder> iter = branchStack.iterator();

            while (iter.hasNext()) {
                BHolder holder = branchStack.pop();
                String type = holder.getType();

                switch (type) {
                    case "if":
                        GroovyRuleBuilder thenBuilder = holder.builder;
                        GroovyRuleBuilder ifBuilder = builder;
                        builder = new IfThenRuleBuilder(ifBuilder, thenBuilder);
                        break;
                    case "or":
                        GroovyRuleBuilder lhsOr = holder.builder;
                        GroovyRuleBuilder rhsOr = builder;
                        builder = new OrBuilder(lhsOr, rhsOr);
                        break;
                    case "and":
                        GroovyRuleBuilder lhs = holder.builder;
                        GroovyRuleBuilder rhs = builder;
                        builder = new AndBuilder(lhs, rhs);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    class BHolder {

        private final String type;
        private final GroovyRuleBuilder builder;

        public BHolder(String type, GroovyRuleBuilder builder) {
            this.type = type;
            this.builder = builder;
        }

        public String getType() {
            return type;
        }
    }

}
