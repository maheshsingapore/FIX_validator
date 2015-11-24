package com.citi.dq.rule.condition;



import com.citigroup.get.quantum.intf.Message;



import static com.citi.dq.rule.util.Patterns.NUMERIC;



/**

 * Created by mv29256 on 10/16/2015.

 */

public class Conditions {



    public static final Condition MANDATORY = new Condition() {

        @Override

        public boolean isSatisfiedBy(int tag, Message message) {

            return message.getTag(tag) != null;

        }



        @Override

        public String toString() {

            return "is present";

        }

    };



    public static final Condition IS_PRESENT = MANDATORY;



    public static final Condition IS_ABSENT = new Condition() {

        @Override

        public boolean isSatisfiedBy(int tag, Message message) {

            return message.getTag(tag) == null;

        }



        @Override

        public String toString() {

            return "is present";

        }

    };



    public static final Condition IS_NUMERIC = new PatternCondition(NUMERIC);



}


