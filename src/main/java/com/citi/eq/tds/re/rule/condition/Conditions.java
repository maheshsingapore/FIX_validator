package com.citi.eq.tds.re.rule.condition;


import com.citi.eq.tds.re.rule.event.Event;

import static com.citi.eq.tds.re.rule.util.Patterns.ALPHANUMERIC;
import static com.citi.eq.tds.re.rule.util.Patterns.NUMERIC;

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

    public static final Condition IS_NUMERIC = new PatternCondition(NUMERIC);

    public static final Condition NOT = new Condition() {
        @Override
        public boolean isSatisfiedBy(int tag, Event event) {
            return false;
        }

        public  Condition forDelegate(Condition delegate){
                return null;
        };
    };

    public static final Condition IS_ALPHANUMERIC = new PatternCondition(ALPHANUMERIC);

}
