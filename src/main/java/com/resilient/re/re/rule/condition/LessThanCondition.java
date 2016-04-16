package com.resilient.re.re.rule.condition;

import com.resilient.re.re.rule.event.Event;
import com.resilient.re.re.rule.event.FieldTransformer;
import com.resilient.re.re.rule.type.TypeInferer;

public class LessThanCondition implements Condition {
    private FieldTransformer transformer;
    private final boolean isStrict;

    public LessThanCondition(FieldTransformer t) {
        this(t, true);
    }

    public LessThanCondition(FieldTransformer t, boolean isStrict) {
        this.transformer = t;
        this.isStrict = isStrict;
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        Comparable<Object> expected;
        Comparable<Object> actual;

        expected = transformer.transform(event);
        actual = TypeInferer.infer(event.getField(tag)).transform(event);

        boolean isSatisfied;
        if (isStrict) {
            isSatisfied = expected.compareTo(actual) > 0;
        } else {
            isSatisfied = expected.compareTo(actual) >= 0;
        }
        return isSatisfied;
    }

    @Override
    public String toString() {
        String toReturn;
        if (isStrict) {
            toReturn = String.format("less than (%s)", transformer);
        } else {
            toReturn = String.format("less than [%s]", transformer);
        }

        return toReturn;
    }
}