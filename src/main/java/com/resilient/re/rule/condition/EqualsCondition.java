package com.resilient.re.rule.condition;

import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.event.FieldTransformer;
import com.resilient.re.rule.type.TypeInferer;
import com.resilient.re.rule.util.AssertArgument;

import static java.lang.String.format;

/**
 * Created by mahesh on 10/21/2015.
 */
public class EqualsCondition implements Condition {

    private FieldTransformer transformer;

    public EqualsCondition(FieldTransformer t) {
        AssertArgument.isNotNull(t);
        transformer = t;
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        Object expected;
        Object actual;

        expected = transformer.transform(event);
        actual = TypeInferer.infer(event.getField(tag)).transform(event);

        return expected != null && expected.equals(actual);
    }

    @Override
    public String toString() {
        return format("is equal to %s", transformer);
    }
}
