package com.citi.dq.rule.condition;



import com.citi.dq.rule.core.Rule;

import com.citi.dq.rule.core.RuleBuilder;

import com.citi.dq.rule.util.AssertArgument;

import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/22/2015.

 */

public class IfThenCondition implements Condition {



    private final RuleBuilder ifBuilder;

    private final RuleBuilder thenBuilder;

    private Rule<Message> ifRule;

    private Rule<Message> thenRule;



    public IfThenCondition(RuleBuilder ifBuilder, RuleBuilder thenBuilder) {

        this.ifBuilder = ifBuilder;

        this.thenBuilder = thenBuilder;



        AssertArgument.isNotNull(ifBuilder, thenBuilder);



        ifRule = ifBuilder.build();

        thenRule = thenBuilder.build();

    }



    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        boolean ifConditionSatisfied = ifRule.apply(message);

        return ifConditionSatisfied ? thenRule.apply(message) : true;

    }





    public int getTagNumber() {

        return ifRule.forTag();

    }



    @Override

    public String toString() {

        StringBuilder b = new StringBuilder();



        b.append("if ").append(ifBuilder);

        b.append(" then ").append(thenBuilder);



        return b.toString();

    }

}


