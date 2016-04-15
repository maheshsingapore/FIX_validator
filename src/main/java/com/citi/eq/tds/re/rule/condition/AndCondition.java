package com.citi.eq.tds.re.rule.condition;


import com.citi.eq.tds.re.rule.core.Rule;
import com.citi.eq.tds.re.rule.core.RuleBuilder;
import com.citi.eq.tds.re.rule.event.Event;

/**
 * Created by mv29256 on 10/22/2015.
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
