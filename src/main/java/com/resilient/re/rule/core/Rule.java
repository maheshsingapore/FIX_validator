package com.resilient.re.rule.core;

/**
 * Created by mahesh on 10/12/2015.
 */
public interface Rule<T> {

    int forTag();

    boolean apply(T m);

}
