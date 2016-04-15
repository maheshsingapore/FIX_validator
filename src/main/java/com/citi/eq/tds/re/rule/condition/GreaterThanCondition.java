package com.citi.eq.tds.re.rule.condition;

import com.citi.eq.tds.re.rule.event.Event;
import com.citi.eq.tds.re.rule.event.FieldTransformer;
import com.citi.eq.tds.re.rule.type.TypeInferer;

public class GreaterThanCondition implements Condition {

    private FieldTransformer transformer;
    private final boolean isStrict;

    public GreaterThanCondition(FieldTransformer t) {
        this(t, true);
    }

    public GreaterThanCondition(FieldTransformer t, boolean isStrict) {
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
            isSatisfied = expected.compareTo(actual) < 0;
        } else {
            isSatisfied = expected.compareTo(actual) <= 0;
        }
        return isSatisfied;
    }

    @Override
    public String toString() {
        String toReturn;
        if (isStrict) {
            toReturn = String.format("greater than %s", transformer);
        } else {
            toReturn = String.format("greater than or equal to %s", transformer);
        }

        return toReturn;
    }
}