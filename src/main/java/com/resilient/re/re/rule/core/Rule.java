package com.resilient.re.re.rule.core;

/**
 * Created by mv29256 on 10/12/2015.
 */
public interface Rule<T> {

    int forTag();

    boolean apply(T m);

}
