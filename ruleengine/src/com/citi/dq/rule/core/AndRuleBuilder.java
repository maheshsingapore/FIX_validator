package com.citi.dq.rule.core;



import com.citi.dq.rule.condition.AndCondition;



/**

 * Created by mv29256 on 10/22/2015.

 */

public class AndRuleBuilder extends RuleBuilder {



    public AndRuleBuilder(RuleBuilder lhsCondition, RuleBuilder rhsCondition) {

        super(lhsCondition.getTagNumber(), new AndCondition(lhsCondition, rhsCondition));

    }



}


