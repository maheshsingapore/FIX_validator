package com.resilient.re.rule.condition;


import com.resilient.re.rule.core.Rule;
import com.resilient.re.rule.core.RuleBuilder;
import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.util.AssertArgument;

/**
 * Created by mahesh on 10/22/2015.
 */
public class IfThenCondition implements Condition {

    private final RuleBuilder ifBuilder;
    private final RuleBuilder thenBuilder;
    private Rule<Event> ifRule;
    private Rule<Event> thenRule;

    public IfThenCondition(RuleBuilder ifBuilder, RuleBuilder thenBuilder) {
        this.ifBuilder = ifBuilder;
        this.thenBuilder = thenBuilder;

        AssertArgument.isNotNull(ifBuilder, thenBuilder);

        ifRule = ifBuilder.build();
        thenRule = thenBuilder.build();
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        boolean ifConditionSatisfied = ifRule.apply(event);
        return ifConditionSatisfied ? thenRule.apply(event) : true;
    }


    public int getTagNumber() {
        return ifRule.forTag();
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        b.append("if ").append(ifBuilder);
        b.append(", then ").append(thenBuilder);

        return b.toString();
    }
}
