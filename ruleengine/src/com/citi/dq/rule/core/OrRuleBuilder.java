package com.citi.dq.rule.core;



import com.citi.dq.rule.condition.OrCondition;



/**

 * Created by mv29256 on 10/22/2015.

 */

public class OrRuleBuilder extends RuleBuilder {



    public OrRuleBuilder(RuleBuilder lhsCondition, RuleBuilder rhsCondition) {

        super(lhsCondition.getTagNumber(), new OrCondition(lhsCondition, rhsCondition));

    }



}


