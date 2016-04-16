package com.resilient.re.rule.event;

/**
 * Created by mv29256 on 3/18/2016.
 */
public interface FieldTransformer {

    Comparable<Object> transform(Event event);
}
