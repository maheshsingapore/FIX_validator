package com.citi.eq.tds.re.rule.condition;

import com.citi.eq.tds.re.ext.Message;
import com.citi.eq.tds.re.rule.core.GroovyRuleBuilder;
import com.citi.eq.tds.re.rule.core.GroovyTag;
import com.citi.eq.tds.re.rule.core.RuleBuilder;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mv29256 on 4/7/2016.
 */
public class AndConditionTest {

    @Test
    public void testIsSatisfiedBy() throws Exception {

        RuleBuilder lhs = new GroovyRuleBuilder(new GroovyTag(8), Conditions.IS_ABSENT);
        RuleBuilder rhs = new GroovyRuleBuilder(new GroovyTag(8), Conditions.IS_PRESENT);

        String message = "8=FIX.4.4";
        assertFalse(new AndCondition(lhs, rhs).isSatisfiedBy(8, new Message(message)));

        lhs = new GroovyRuleBuilder(new GroovyTag(8), Conditions.IS_PRESENT);
        assertTrue(new AndCondition(lhs, rhs).isSatisfiedBy(8, new Message(message)));
    }


}