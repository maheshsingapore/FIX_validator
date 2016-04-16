// Generated from C:/MaheshVibhute/projects/self/kaizen/src/main/resources\FixRules.g4 by ANTLR 4.5.1
package com.resilient.re.ext.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FixRulesParser}.
 */
public interface FixRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(FixRulesParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(FixRulesParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(FixRulesParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(FixRulesParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(FixRulesParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(FixRulesParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FixRulesParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FixRulesParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(FixRulesParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(FixRulesParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#tagStmt}.
	 * @param ctx the parse tree
	 */
	void enterTagStmt(FixRulesParser.TagStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#tagStmt}.
	 * @param ctx the parse tree
	 */
	void exitTagStmt(FixRulesParser.TagStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#monoOperandOperator}.
	 * @param ctx the parse tree
	 */
	void enterMonoOperandOperator(FixRulesParser.MonoOperandOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#monoOperandOperator}.
	 * @param ctx the parse tree
	 */
	void exitMonoOperandOperator(FixRulesParser.MonoOperandOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#monoOperand}.
	 * @param ctx the parse tree
	 */
	void enterMonoOperand(FixRulesParser.MonoOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#monoOperand}.
	 * @param ctx the parse tree
	 */
	void exitMonoOperand(FixRulesParser.MonoOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(FixRulesParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(FixRulesParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(FixRulesParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(FixRulesParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#biOperandOperator}.
	 * @param ctx the parse tree
	 */
	void enterBiOperandOperator(FixRulesParser.BiOperandOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#biOperandOperator}.
	 * @param ctx the parse tree
	 */
	void exitBiOperandOperator(FixRulesParser.BiOperandOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#biOperand}.
	 * @param ctx the parse tree
	 */
	void enterBiOperand(FixRulesParser.BiOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#biOperand}.
	 * @param ctx the parse tree
	 */
	void exitBiOperand(FixRulesParser.BiOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#listOperator}.
	 * @param ctx the parse tree
	 */
	void enterListOperator(FixRulesParser.ListOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#listOperator}.
	 * @param ctx the parse tree
	 */
	void exitListOperator(FixRulesParser.ListOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FixRulesParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FixRulesParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#logicalCondition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalCondition(FixRulesParser.LogicalConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#logicalCondition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalCondition(FixRulesParser.LogicalConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(FixRulesParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(FixRulesParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#logicalOperand}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperand(FixRulesParser.LogicalOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#logicalOperand}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperand(FixRulesParser.LogicalOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#stringOperand}.
	 * @param ctx the parse tree
	 */
	void enterStringOperand(FixRulesParser.StringOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#stringOperand}.
	 * @param ctx the parse tree
	 */
	void exitStringOperand(FixRulesParser.StringOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#andOr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(FixRulesParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#andOr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(FixRulesParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(FixRulesParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(FixRulesParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FixRulesParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FixRulesParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(FixRulesParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(FixRulesParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#is}.
	 * @param ctx the parse tree
	 */
	void enterIs(FixRulesParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#is}.
	 * @param ctx the parse tree
	 */
	void exitIs(FixRulesParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#mustBe}.
	 * @param ctx the parse tree
	 */
	void enterMustBe(FixRulesParser.MustBeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#mustBe}.
	 * @param ctx the parse tree
	 */
	void exitMustBe(FixRulesParser.MustBeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#mustNotBe}.
	 * @param ctx the parse tree
	 */
	void enterMustNotBe(FixRulesParser.MustNotBeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#mustNotBe}.
	 * @param ctx the parse tree
	 */
	void exitMustNotBe(FixRulesParser.MustNotBeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(FixRulesParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(FixRulesParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#equalTo}.
	 * @param ctx the parse tree
	 */
	void enterEqualTo(FixRulesParser.EqualToContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#equalTo}.
	 * @param ctx the parse tree
	 */
	void exitEqualTo(FixRulesParser.EqualToContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(FixRulesParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(FixRulesParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(FixRulesParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(FixRulesParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(FixRulesParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(FixRulesParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#present}.
	 * @param ctx the parse tree
	 */
	void enterPresent(FixRulesParser.PresentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#present}.
	 * @param ctx the parse tree
	 */
	void exitPresent(FixRulesParser.PresentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#absent}.
	 * @param ctx the parse tree
	 */
	void enterAbsent(FixRulesParser.AbsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#absent}.
	 * @param ctx the parse tree
	 */
	void exitAbsent(FixRulesParser.AbsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(FixRulesParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(FixRulesParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void enterMandatory(FixRulesParser.MandatoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#mandatory}.
	 * @param ctx the parse tree
	 */
	void exitMandatory(FixRulesParser.MandatoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#valid}.
	 * @param ctx the parse tree
	 */
	void enterValid(FixRulesParser.ValidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#valid}.
	 * @param ctx the parse tree
	 */
	void exitValid(FixRulesParser.ValidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#consistent}.
	 * @param ctx the parse tree
	 */
	void enterConsistent(FixRulesParser.ConsistentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#consistent}.
	 * @param ctx the parse tree
	 */
	void exitConsistent(FixRulesParser.ConsistentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(FixRulesParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(FixRulesParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#before}.
	 * @param ctx the parse tree
	 */
	void enterBefore(FixRulesParser.BeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#before}.
	 * @param ctx the parse tree
	 */
	void exitBefore(FixRulesParser.BeforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#after}.
	 * @param ctx the parse tree
	 */
	void enterAfter(FixRulesParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#after}.
	 * @param ctx the parse tree
	 */
	void exitAfter(FixRulesParser.AfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#dateToday}.
	 * @param ctx the parse tree
	 */
	void enterDateToday(FixRulesParser.DateTodayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#dateToday}.
	 * @param ctx the parse tree
	 */
	void exitDateToday(FixRulesParser.DateTodayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#dateTomorrow}.
	 * @param ctx the parse tree
	 */
	void enterDateTomorrow(FixRulesParser.DateTomorrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#dateTomorrow}.
	 * @param ctx the parse tree
	 */
	void exitDateTomorrow(FixRulesParser.DateTomorrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#dateYesterday}.
	 * @param ctx the parse tree
	 */
	void enterDateYesterday(FixRulesParser.DateYesterdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#dateYesterday}.
	 * @param ctx the parse tree
	 */
	void exitDateYesterday(FixRulesParser.DateYesterdayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(FixRulesParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(FixRulesParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#onlyIf}.
	 * @param ctx the parse tree
	 */
	void enterOnlyIf(FixRulesParser.OnlyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#onlyIf}.
	 * @param ctx the parse tree
	 */
	void exitOnlyIf(FixRulesParser.OnlyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(FixRulesParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(FixRulesParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link FixRulesParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(FixRulesParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link FixRulesParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(FixRulesParser.CloseBracketContext ctx);
}