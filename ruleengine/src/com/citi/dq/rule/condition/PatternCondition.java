package com.citi.dq.rule.condition;



import com.citi.dq.rule.util.Patterns;

import com.citigroup.get.quantum.intf.Message;



import java.util.regex.Pattern;



/**

 * Created by mv29256 on 10/16/2015.

 */

public class PatternCondition implements Condition {



    private Pattern delegate;



    public PatternCondition(Pattern pattern) {

        this.delegate = pattern;

    }



    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        String value = message.getTag(tag);

        return delegate.matcher(value).matches();

    }



    @Override

    public String toString() {

        if (delegate == Patterns.NUMERIC) {

            return "is numeric";

        }

        return String.format("must match pattern %s", delegate.toString());

    }

}


