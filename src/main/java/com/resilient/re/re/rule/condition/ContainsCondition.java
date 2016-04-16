package com.resilient.re.re.rule.condition;

import com.resilient.re.re.rule.event.Event;

import java.util.Arrays;

import static com.resilient.re.re.rule.util.Utils.arrayContains;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class ContainsCondition implements Condition {

    protected static final String[] EMPTY_STRING_ARRAY = {};
    protected static final int[] EMPTY_INT_ARRAY = {};

    protected final int[] intValues;
    protected final String[] stringValues;

    public ContainsCondition(int[] values) {
        this(values, EMPTY_STRING_ARRAY);
    }

    public ContainsCondition(int[] intValues, String[] stringValues) {
        this.intValues = intValues;
        this.stringValues = stringValues;
    }

    public ContainsCondition(String[] values) {
        this(EMPTY_INT_ARRAY, values);
    }

    @Override
    public boolean isSatisfiedBy(int fieldId, Event event) {
        if (this.intValues == EMPTY_INT_ARRAY) {
            return arrayContains(this.stringValues, event.getField(fieldId));
        } else {
            return arrayContains(this.intValues, Integer.parseInt(event.getField(fieldId)));
        }
    }

    @Override
    public String toString() {
        String toPrint = this.intValues == EMPTY_INT_ARRAY ? Arrays.toString(this.stringValues) : Arrays.toString
                (this.intValues);

        return String.format("is one of %s", toPrint);
    }
}

