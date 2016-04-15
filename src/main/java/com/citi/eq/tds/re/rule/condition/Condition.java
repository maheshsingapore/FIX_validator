package com.citi.eq.tds.re.rule.condition;

import com.citi.eq.tds.re.rule.event.Event;

/**
 * Created by mv29256 on 10/16/2015.
 */
public interface Condition {

    boolean isSatisfiedBy(int tag, Event event);

}
