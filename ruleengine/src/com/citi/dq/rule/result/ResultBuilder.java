package com.citi.dq.rule.result;



import com.citi.dq.rule.core.Rule;



import static com.citi.dq.rule.core.Constants.NULL;



/**

 * Created by mv29256 on 10/16/2015.

 */

public class ResultBuilder {



    private StringBuilder b;



    public ResultBuilder() {

        this.b = new StringBuilder();

    }



    public ResultBuilder self(Rule rule) {

        b.append(String.format("\ttag %d: ", rule.forTag()));

        return this;

    }



    public ResultBuilder expected(Object expected) {

        b.append("Expected ").append(expected != null ? expected : NULL);

        return this;

    }



    public ResultBuilder actual(Object actual) {

        b.append(String.format(" actual [%s]", actual != null ? actual : NULL));

        return this;

    }



    public String build() {

        return b.toString();

    }

}


