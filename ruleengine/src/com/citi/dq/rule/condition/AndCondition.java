package com.citi.dq.rule.condition;



import com.citi.dq.rule.core.Rule;

import com.citi.dq.rule.core.RuleBuilder;

import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/22/2015.

 */

public class AndCondition implements Condition {



    private Rule<Message> lhsRule;

    private Rule<Message> rhsRule;



    public AndCondition(RuleBuilder lhsCondition, RuleBuilder rhsCondition) {

        this.lhsRule = lhsCondition.build();

        this.rhsRule = rhsCondition.build();

    }



    @Override

    public boolean isSatisfiedBy(int tag, Message message) {

        return lhsRule.apply(message) && rhsRule.apply(message);

    }



}


