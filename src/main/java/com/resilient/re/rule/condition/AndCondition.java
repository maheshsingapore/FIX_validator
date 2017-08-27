package com.resilient.re.rule.condition;


import com.resilient.re.rule.core.Rule;
import com.resilient.re.rule.core.RuleBuilder;
import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/22/2015.
 */
public class AndCondition implements Condition {

    private final Rule<Event> lhsRule;
    private final Rule<Event> rhsRule;

    public AndCondition(RuleBuilder lhsBuilder, RuleBuilder rhsBuilder) {
        this.lhsRule = lhsBuilder.build();
        this.rhsRule = rhsBuilder.build();
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return lhsRule.apply(event) && rhsRule.apply(event);
    }

    @Override
    public String toString() {
        return String.format("%s and %s", lhsRule, rhsRule);
    }
}
