package com.resilient.re.rule.condition;


import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class PatternCondition implements Condition {

    private Pattern delegate;

    public PatternCondition(String pattern) {
        this(Pattern.compile(pattern));
    }

    public PatternCondition(Pattern pattern) {
        this.delegate = pattern;
    }

    @Override
    public boolean isSatisfiedBy(int fieldId, Event event) {
        String value = event.getField(fieldId);
        return delegate.matcher(value).matches();
    }

    @Override
    public String toString() {
        if (delegate == Patterns.NUMERIC) {
            return "is numeric";
        } else if (delegate == Patterns.ALPHANUMERIC) {
            return "is alphanumeric";
        }

        return String.format("must match pattern %s", delegate.toString());
    }
}
