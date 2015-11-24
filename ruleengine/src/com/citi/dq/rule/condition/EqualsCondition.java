package com.citi.dq.rule.condition;



import com.citi.dq.rule.core.Tag;

import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/21/2015.

 */

public class EqualsCondition implements Condition {



    private final Tag referenceTag;

    private final int referenceInt;

    private final String referenceString;

    private final Enum referenceEnum;



    public EqualsCondition(Tag reference) {

        this(null, Integer.MIN_VALUE, reference, null);

    }



    private EqualsCondition(String referenceString, int referenceInt, Tag another, Enum referenceEnum) {

        this.referenceString = referenceString;

        this.referenceInt = referenceInt;

        this.referenceTag = another;

        this.referenceEnum = referenceEnum;

    }



    public EqualsCondition(int reference) {

        this(null, reference, null, null);

    }



    public EqualsCondition(String reference) {

        this(reference, Integer.MIN_VALUE, null, null);

    }



    public EqualsCondition(Enum reference) {

        this(null, Integer.MIN_VALUE, null, reference);

    }

    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        String rhs = message.getTag(tag);

        String lhs = getRHS(message);



        return lhs != null && lhs.equals(rhs);

    }



    private String getRHS(Message message) {

        return referenceTag != null ? message.getTag(referenceTag.getNumber()) : referenceString != null ? referenceString :

                referenceEnum != null ? referenceEnum.toString() : String.valueOf

                        (referenceInt);

    }



    @Override

    public String toString() {

        String toPrint;

        if (referenceTag != null) {

            toPrint = referenceTag.toString();

        } else if (referenceString != null) {

            toPrint = referenceString;

        } else {

            toPrint = String.valueOf(referenceInt);

        }



        return String.format("is equal to %s", toPrint);

    }

}


