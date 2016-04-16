package com.resilient.re.re.rule.condition;

import com.resilient.re.re.rule.event.Event;

/**
 * Created by mv29256 on 10/16/2015.
 */
public interface Condition {

    boolean isSatisfiedBy(int tag, Event event);

}
