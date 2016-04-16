package com.resilient.re.ext;

import com.resilient.re.ext.db.H2;
import com.resilient.re.rule.condition.Condition;
import com.resilient.re.rule.core.Tag;
import com.resilient.re.rule.core.ValuesDataSource;
import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.util.Utils;

import java.util.Arrays;

import static com.resilient.re.rule.util.Utils.arrayContains;

/**
 * Created by mv29256 on 3/28/2016.
 */
public class ValidCondition implements Condition {
    private String[] values;
    private ValuesDataSource tagValues = H2.getInstance();

    public ValidCondition(Tag tag) {
        values = tagValues.getFor(tag.number());
    }

    @Override
    public boolean isSatisfiedBy(int tag, Event event) {
        return Utils.arrayContains(values, event.getField(tag));
    }

    @Override
    public String toString() {
        return String.format("one of valid values %s", Arrays.toString(values));
    }
}
