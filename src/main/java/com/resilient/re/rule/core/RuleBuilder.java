package com.resilient.re.rule.core;


import com.resilient.re.rule.condition.Condition;
import com.resilient.re.rule.event.Event;

import java.util.List;

/**
 * Created by mahesh on 2/23/2016.
 */
public interface RuleBuilder {

    Tag getTag();

    List<Condition> getConditions();

    Rule<Event> build();

    RuleBuilder and(RuleBuilder another);

    RuleBuilder or(RuleBuilder another);
}
