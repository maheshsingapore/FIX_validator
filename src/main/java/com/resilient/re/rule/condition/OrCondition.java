package com.resilient.re.rule.condition;


import com.resilient.re.rule.core.Rule;
import com.resilient.re.rule.core.RuleBuilder;
import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/22/2015.
 */
public class OrCondition implements Condition {

    private final RuleBuilder lhsCondition;
    private final RuleBuilder rhsCondition;
    private Rule<Event> lhsRule;
    private Rule<Event> rhsRule;

    public OrCondition(RuleBuilder lhsCondition, RuleBuilder rhsCondition) {
        this.lhsCondition = lhsCondition;
        this.rhsCondition = rhsCondition;
        this.lhsRule = lhsCondition.build();
        this.rhsRule = rhsCondition.build();
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return lhsRule.apply(event) || rhsRule.apply(event);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(lhsCondition);
        b.append(" or ");
        b.append(rhsCondition);
        return b.toString();
    }
}
