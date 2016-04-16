package com.resilient.re.re.rule.core;


import com.resilient.re.re.rule.condition.Condition;
import com.resilient.re.re.rule.event.Event;

/**
 * Created by mv29256 on 10/22/2015.
 */
public class OrRuleBuilder extends GroovyRuleBuilder implements Condition {

    private final Rule<Event> lhs;

    public OrRuleBuilder(RuleBuilder lhsCondition) {
        super(new GroovyTag(0));
        lhs = lhsCondition.build();
        addCondition(this);
    }

    //TODO
    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return lhs.apply(event) || build().apply(event);
    }

    @Override
    public String toString() {
        return String.format("%s or %s", lhs, build());
    }
}
