package com.citi.eq.tds.re.rule.condition;

import com.citi.eq.tds.re.rule.core.RuleEngine;
import com.citi.eq.tds.re.rule.core.StringRuleSet;
import com.citi.eq.tds.re.rule.result.Result;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mv29256 on 4/7/2016.
 */
public class RuleResultTest {
    private String MESSAGE = "8=FIX.4.4\u00019=954\u000135=RIO\u000156=CORE9\u000152=20160316-19:17:40.000\u0001122=20160316-19:17:40.000\u000134=1\u00011=EDJO005E\u000154=1\u0001372=8\u00018004=?\u0001581=10\u000111=BAI1702031616\u0001150=0\u000110200=BAI1702031616H90114222983817684USCORE\u000110202=CORECLIENT\u000110203=CLIENT\u000110204=1\u000110206=BAI1702031616H90114222983817684USCORE\u000110207=USCORE\u000110208=US.CORE.CL\u000114=96.0\u000115=USD\u0001100=ATDF\u000139=A\u000148=288985\u0001167=CS\u0001386=1\u0001336=9\u000117=20361\u000110054=EDJO\u000129=1\u0001-17=CORE\u000110066=20160316-19:17:40.537\u000131=0.0\u000132=0.0\u0001151=0.0\u000140=1\u0001528=A\u000137=H90114222983817684\u000138=96.0\u000122=rio\u000110005=115\u000155=VTR\u0001-14=0\u000159=0\u000175=20160316\u000160=20160316-19:17:40.537\u000110081=JAA4224 00043803354ESUS1\u0001660=103\u000110071=20160316-19:17:41.506\u0001100134=Y\u000110104=Y\u000110243=290114222983817681\u000112052=2\u000110184=290114222983817681\u00016=61.044999999999995\u000110292=735\u000110515=115\u000110518=115\u00011133=C\u000110521=1\u000110522=O\u000110523=1\u000110524=AUTO\u000110525=1\u000110526=EDJO\u000110527=1\u000111210=290114222983817681\u000110438=RIO.4.5\u00019277=O\u00011727=AUTORouter\u000110000=20160316-19:17:40.537\u000110007=20160316-19:17:40.537\u000110217=N\u000110895=1001565431\u00011527=735\u000110=000\u0001";
    private static final RuleEngine ENGINE = RuleEngine.instance();

    @Test
    public void testIntEquals() {
        mustFail("tag(9) != 954;");
        mustFail("tag(9) must not be        equal to 954;");
        mustPass("tag(9) = 954;");
        mustPass("tag(9) must be equal to 954;");
    }

    @Test
    public void testStringEquals() {
        mustPass("	tag(35) = \"RIO\";	");
        mustPass("	tag(35) must be equal to \"RIO\";	");

        mustFail("	tag(35) = \"D\";	");
        mustFail("	tag(35) must not be equal to \"RIO\";	");
    }

    @Test
    public void testInStringList() {
        mustPass("	tag(8) must be in \"FIX.4.2\",\"FIX.4.3\",\"FIX.4.4\" if tag(8) = \"FIX.4.4\";	");
//        mustPass("	tag(8) in \"FIX.4.2\",\"FIX.4.3\",\"FIX.4.4\" ;	" +
//                "tag(8) must be in \"FIX.4.2\",\"FIX.4.3\",\"FIX.4.4\" ;");
//
//        mustFail("	tag(8) must be in \"FIX.4.3\", \"FIX.4.5\";	");
    }

    @Test
    public void testInIntList() {
        mustPass("	tag(336) in 8,9,10;	");
    }

    @Test
    public void testTagEquals() {
        mustPass("	tag(37) = tag(37);	");
        mustPass("	tag(37) must be equal to tag(37);	");
        mustFail("	tag(37) must be equal to tag(31);	");
    }

    @Test
    public void testTagGreaterThan() {
        mustFail("	tag(9) > tag(9);	");
        mustPass("	tag(9) > 953;	");
        mustFail("	tag(9) > 954;	");
        mustPass("	tag(9) >= 954;	");
    }

    @Test
    public void testTagLessThan() {
        mustFail("	tag(9) < tag(9);	");
        mustFail("	tag(9) < 953;	");
        mustPass("	tag(9) <= 954;	");
    }

    @Test
    public void testPresence() {
        mustPass("tag(9) must be present;");
        mustFail("tag(9) must be absent;");
    }

    @Test
    public void testPatternMatches() {
        mustPass("	tag(52) ~= \"[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}\";	");
        mustFail("	tag(52) ~= \"[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{2}\";	");
    }

    @Test
    public void testTagConcat() {
        mustPass("	tag(10206) = tag(11) + tag(37) + tag(10207);	");
        mustFail("	tag(10206) = tag(11) + tag(37) +        tag(11);	");
    }

    @Test
    public void testOperatorPrecedence() {
        mustPass("	tag(126) must be present if tag(59) = 1;");
        mustFail("	tag(126) must be present if tag(59) = 0;");
        mustFail("	tag(126) must be present if tag(59) = 1 or { tag(9) is numeric and tag(11) is present } ;");
        mustFail("tag(126) must be present if tag(59) = 1 or { tag(9) is absent and tag(11) is present } or { tag(8) is present and tag(9) is numeric };");
        mustPass("tag(126) must be absent   if tag(59) = 1 or { tag(9) is absent and tag(11) is present } or { tag(8) is present and tag(9) is numeric };");
        mustFail("tag(126) must be present if tag(59) = 1 or { tag(9) is absent and { tag(11) is present or tag(1) is present }} or { tag(8) is present and tag(9) is numeric };");
        mustFail("tag(126) must be present if tag(59) = 1 or { tag(9) is absent and tag(9) is absent } or { tag(1) is absent or {tag(8) is present and tag(9) is present }};");
        mustPass("tag(126) must be present if tag(59) = 1 or { tag(9) is absent and tag(9) is absent } or { tag(1) is absent or {tag(8) is present and tag(9) is absent }};");
    }


    @Test
    public void testIfThen() {
        mustPass("	tag(126) must be present if tag(59) = 1 or tag(59) = 2;");
        mustPass("	tag(126) must be present if tag(59) = 1 or tag(59) = 2 or tag(52) ~= \"[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{2}\";");
        mustPass("	tag(126) must be present if tag(59) = 1 and tag(9) is numeric and tag(11) is present;");
        mustFail("	tag(126) must be present if tag(59) = 0 and tag(10206) = tag(11) + tag(37) + tag(10207);");
        mustFail("	tag(126) must be present if tag(59) = 0 and tag(9) >= tag(9);");
        mustFail("	tag(126) must be present if tag(59) = 0;");
    }

    private void mustPass(String rule) {
        Result evaluation = getResult(rule);
        assertTrue(evaluation.toString(), evaluation.failCount() == 0);
    }

    private void mustFail(String rule) {
        Result evaluation = getResult(rule);
        assertTrue(evaluation.toString(), evaluation.failCount() == 1);
    }

    private Result getResult(String rule) {
        StringRuleSet rio = new StringRuleSet("RIO", rule);
        ENGINE.add(rio);

        return ENGINE.evaluate(MESSAGE);
    }

}
