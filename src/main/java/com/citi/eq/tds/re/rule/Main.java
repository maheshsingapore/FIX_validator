package com.citi.eq.tds.re.rule;

import com.citi.eq.tds.re.rule.core.RuleEngine;
import com.citi.eq.tds.re.rule.core.RuleSet;
import com.citi.eq.tds.re.rule.result.Result;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by mv29256 on 10/20/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        List<RuleSet> ruleSets = RuleSet.loadFrom(new File("src\\main\\resources\\OATS"), ".*\\.rules");

        RuleEngine engine = RuleEngine.instance().addAll(ruleSets);

        Result evaluation = engine.evaluate("8=FIX.4.4\u00019=954\u000135=RIO\u000156=CORE9\u000152=20160316-19:17:40.000\u0001122=20160316-19:17:40.000\u000134=1\u00011=EDJO005E\u000154=1\u0001372=8\u00018004=?\u0001581=10\u000111=BAI1702031616\u0001150=0\u000110200=BAI1702031616H90114222983817684USCORE\u000110202=CORECLIENT\u000110203=CLIENT\u000110204=1\u000110206=BAI1702031616H90114222983817684USCORE\u000110207=USCORE\u000110208=US.CORE.CL\u000114=96.0\u000115=USD\u0001100=ATDF\u000139=A\u000148=288985\u0001167=CS\u0001386=1\u0001336=9\u000117=20361\u000110054=EDJO\u000129=1\u0001-17=CORE\u000110066=20160316-19:17:40.537\u000131=0.0\u000132=0.0\u0001151=0.0\u000140=1\u0001528=A\u000137=H90114222983817684\u000138=96.0\u000122=s\u000110005=115\u000155=VTR\u0001-14=0\u000159=0\u000175=20160316\u000160=20160316-19:17:40.537\u000110081=JAA4224 00043803354ESUS1\u0001660=103\u000110071=20160316-19:17:41.506\u0001100134=Y\u000110104=Y\u000110243=290114222983817681\u000112052=2\u000110184=290114222983817681\u00016=61.044999999999995\u000110292=735\u000110515=115\u000110518=115\u00011133=C\u000110521=1\u000110522=O\u000110523=1\u000110524=AUTO\u000110525=1\u000110526=EDJO\u000110527=1\u000111210=290114222983817681\u000110438=RIO.4.5\u00019277=O\u00011727=AUTORouter\u000110000=20160316-19:17:40.537\u000110007=20160316-19:17:40.537\u000110217=N\u000110895=1001565431\u00011527=735\u000110=000\u0001");
        System.out.println(evaluation);

    }
}
