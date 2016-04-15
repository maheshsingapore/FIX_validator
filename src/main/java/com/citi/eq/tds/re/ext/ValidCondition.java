package com.citi.eq.tds.re.ext;

import com.citi.eq.tds.re.ext.db.H2;
import com.citi.eq.tds.re.rule.condition.Condition;
import com.citi.eq.tds.re.rule.core.Tag;
import com.citi.eq.tds.re.rule.core.ValuesDataSource;
import com.citi.eq.tds.re.rule.event.Event;

import java.util.Arrays;

import static com.citi.eq.tds.re.rule.util.Utils.arrayContains;

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
        return arrayContains(values, event.getField(tag));
    }

    @Override
    public String toString() {
        return String.format("one of valid values %s", Arrays.toString(values));
    }
}
