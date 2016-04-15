package com.citi.eq.tds.re.rule.result;


import com.citi.eq.tds.re.rule.core.Rule;

import static com.citi.eq.tds.re.rule.core.Constants.IS_ABSENT;
import static java.lang.String.format;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class ResultBuilder {

    private StringBuilder b;

    public ResultBuilder() {
        this.b = new StringBuilder();
    }

    public ResultBuilder self(Rule rule) {
        b.append(format("\ttag %-5d: ", rule.forTag()));
        return this;
    }

    public ResultBuilder expected(Object expected) {
        b.append("Expected ").append(expected != null ? expected : IS_ABSENT);
        return this;
    }

    public ResultBuilder actual(Object actual) {
        b.append(format(" actual [%s]", actual != null ? actual : IS_ABSENT));
        return this;
    }

    public String build() {
        return b.toString();
    }
}
