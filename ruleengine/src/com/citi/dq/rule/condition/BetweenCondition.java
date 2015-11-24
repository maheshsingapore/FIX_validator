package com.citi.dq.rule.condition;



import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/16/2015.

 */

public class BetweenCondition implements Condition {





    private final double lowerBound;

    private final double upperBound;

    private final boolean isStrict;



    public BetweenCondition(double lowerBound, double upperBound) {

        this(lowerBound, upperBound, true);

    }



    public BetweenCondition(double lowerBound, double upperBound, boolean isStrict) {



        this.lowerBound = lowerBound;

        this.upperBound = upperBound;

        this.isStrict = isStrict;

    }



    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        double value = Double.parseDouble(message.getTag(tag));

        boolean isSatisfied;



        if (isStrict) {

            isSatisfied = lowerBound < value && value < upperBound;

        } else {

            isSatisfied = lowerBound <= value && value <= upperBound;

        }

        return isSatisfied;

    }





    @Override

    public String toString() {

        StringBuilder b = new StringBuilder();



        if (isStrict) {

            b.append(String.format("Expected (%d, %d)", lowerBound, upperBound));

        } else {

            b.append(String.format("Expected [%d, %d]", lowerBound, upperBound));

        }



        return b.toString();

    }

}


