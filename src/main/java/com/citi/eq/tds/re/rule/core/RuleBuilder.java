package com.citi.eq.tds.re.rule.core;


import com.citi.eq.tds.re.rule.condition.Condition;
import com.citi.eq.tds.re.rule.event.Event;

import java.util.List;

/**
 * Created by mv29256 on 2/23/2016.
 */
public interface RuleBuilder {

    Tag getTag();

    List<Condition> getConditions();

    Rule<Event> build();

    RuleBuilder and(RuleBuilder another);

    RuleBuilder or(RuleBuilder another);
}
