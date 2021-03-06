package com.resilient.re.rule.core;


import com.resilient.re.rule.condition.Condition;
import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/22/2015.
 */
public class AndRuleBuilder extends GroovyRuleBuilder implements Condition {

    private final Rule<Event> lhs;

    public AndRuleBuilder(RuleBuilder lhsCondition) {
        super(new GroovyTag(0));
        lhs = lhsCondition.build();
    }


    //TODO
    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return lhs.apply(event) && build().apply(event);
    }

    //TODO
    @Override
    public String toString() {
        return String.format("%s and %s", lhs, build());
    }
}
