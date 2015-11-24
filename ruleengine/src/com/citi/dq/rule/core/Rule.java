package com.citi.dq.rule.core;



/**

 * Created by mv29256 on 10/12/2015.

 */

public interface Rule<T> {



    int forTag();



    boolean apply(T m);



}


