package com.resilient.re.rule.condition;

import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/16/2015.
 */
public interface Condition {

    boolean isSatisfiedBy(int tag, Event event);

}
