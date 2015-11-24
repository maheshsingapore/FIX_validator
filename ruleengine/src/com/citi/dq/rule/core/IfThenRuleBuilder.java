package com.citi.dq.rule.core;



import com.citi.dq.rule.condition.IfThenCondition;



/**

 * Created by mv29256 on 10/22/2015.

 */

public class IfThenRuleBuilder extends RuleBuilder {



    public IfThenRuleBuilder(RuleBuilder ifCondition, RuleBuilder thenCondition) {

        super(thenCondition.getTagNumber(), new IfThenCondition(ifCondition, thenCondition));

    }



}


