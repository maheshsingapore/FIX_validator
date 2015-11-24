package com.citi.dq.rule.condition;



import com.citigroup.get.quantum.intf.Message;



import java.util.Arrays;



import static com.citi.dq.rule.util.Utils.arrayContains;



/**

 * Created by mv29256 on 10/16/2015.

 */

public class ContainsCondition implements Condition {



    private static final String[] EMPTY_STRING_ARRAY = {};

    private static final int[] EMPTY_INT_ARRAY = {};



    private final int tagNumber;

    private final int[] intValues;

    private final String[] stringValues;



    public ContainsCondition(int tag, int[] values) {

        this(tag, values, EMPTY_STRING_ARRAY);

    }



    public ContainsCondition(int tag, int[] intValues, String[] stringValues) {

        this.tagNumber = tag;

        this.intValues = intValues;

        this.stringValues = stringValues;

    }



    public ContainsCondition(int tag, String[] values) {

        this(tag, EMPTY_INT_ARRAY, values);

    }

    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        if (this.intValues == EMPTY_INT_ARRAY) {

            return arrayContains(this.stringValues, message.getTag(tag));

        } else {

            return arrayContains(this.intValues, Integer.parseInt(message.getTag(tag)));

        }

    }



    @Override

    public String toString() {

        String toPrint = this.intValues == EMPTY_INT_ARRAY ? Arrays.toString(this.stringValues) : Arrays.toString

                (this.intValues);



        return String.format("one of %s", toPrint);

    }

}




