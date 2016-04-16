package com.resilient.re.re.rule.condition;


import com.resilient.re.re.rule.event.Event;
import com.resilient.re.re.rule.util.Patterns;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class Conditions {

    public static final Condition MANDATORY = new Condition() {
        @Override
        public boolean isSatisfiedBy(int tag, Event event) {
            return event.getField(tag) != null;
        }

        @Override
        public String toString() {
            return "is present";
        }
    };

    public static final Condition IS_PRESENT = MANDATORY;

    public static final Condition IS_ABSENT = new Condition() {
        @Override
        public boolean isSatisfiedBy(int fieldId, Event event) {
            String field = event.getField(fieldId);
            return field == null || field.length() == 0;
        }

        @Override
        public String toString() {
            return "is absent";
        }
    };

    public static final Condition IS_NUMERIC = new PatternCondition(Patterns.NUMERIC);

    public static final Condition NOT = new Condition() {
        @Override
        public boolean isSatisfiedBy(int tag, Event event) {
            return false;
        }

        public  Condition forDelegate(Condition delegate){
                return null;
        };
    };

    public static final Condition IS_ALPHANUMERIC = new PatternCondition(Patterns.ALPHANUMERIC);

}
