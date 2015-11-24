package com.citi.dq.rule.condition;



import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/16/2015.

 */

public interface Condition {



    boolean isSatisfiedBy(int tag, Message message);



}


