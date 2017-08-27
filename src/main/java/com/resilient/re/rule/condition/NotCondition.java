package com.resilient.re.rule.condition;

import com.resilient.re.rule.event.Event;

import static java.lang.String.format;

/**
 * Created by mahesh on 3/16/2016.
 */
public class NotCondition implements Condition {

    private Condition delegate;

    public NotCondition(Condition d) {
        delegate = d;
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return !delegate.isSatisfiedBy(tag, event);
    }

    @Override
    public String toString() {
        return format("not %s", delegate);
    }
}
