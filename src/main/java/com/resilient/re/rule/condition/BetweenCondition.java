package com.resilient.re.rule.condition;


import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/16/2015.
 */
public class BetweenCondition implements Condition {


    private final double lowerBound;
    private final double upperBound;
    private final boolean isStrict;

    public BetweenCondition(double lowerBound, double upperBound) {
        this(lowerBound, upperBound, true);
    }

    public BetweenCondition(double lowerBound, double upperBound, boolean isStrict) {

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.isStrict = isStrict;
    }

    @Override
    public boolean isSatisfiedBy(int fieldId, Event event) {
        String field = event.getField(fieldId);
        boolean isSatisfied = false;

        if (field != null) {
            double value = Double.parseDouble(field);

            if (isStrict) {
                isSatisfied = lowerBound < value && value < upperBound;
            } else {
                isSatisfied = lowerBound <= value && value <= upperBound;
            }
        }
        return isSatisfied;
    }


    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        if (isStrict) {
            b.append(String.format("between (%f, %f)", lowerBound, upperBound));
        } else {
            b.append(String.format("between [%f, %f]", lowerBound, upperBound));
        }

        return b.toString();
    }
}
