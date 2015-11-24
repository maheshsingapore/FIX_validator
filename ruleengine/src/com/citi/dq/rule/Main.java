package com.citi.dq.rule;



import com.citi.dq.rule.core.RuleBuilder;

import com.citi.dq.rule.core.RuleEngine;

import com.citi.dq.rule.result.Result;



import java.io.File;

import java.io.IOException;

import java.util.List;



/**

 * Created by mv29256 on 10/20/2015.

 */

public class Main {



    public static void main(String[] args) throws IOException {



        String root = "C:\\Users\\MV29256\\IdeaProjects\\antlr\\rule\\src\\com\\citi\\dq\\rule\\";



        DynamicRulesLoader rulesLoader = new DynamicRulesLoader(root);



        RuleEngine engine = RuleEngine.instance();



        File rulesDir = new File(root);



        String[] rulesFiles = rulesDir.list((dir, name) -> name.matches(".*Rules.groovy"));



        for (String rulesFile : rulesFiles) {

            List<RuleBuilder> rules = rulesLoader.getRulesFor(rulesFile);



            engine.addRules("D", rules);

        }



        Result evaluation = engine.evaluate("8=FIX.4.4\u00019=840\u000135=D\u000149=PTMS\u000152=20151021-16:47:24" +

                ".409\u0001122=20151021-16:47:24.000\u000160=20151021-16:47:24" +

                ".348\u0001-17=gs93748\u000154=1\u000110080=20151021-16:47:24" +

                ".000\u00011=LDA\u000111=1529427lqbl#1013891\u0001529=5\u000115=USD\u000118=1\u000137=1529427lqbl" +

                "\u000138=934.0\u000139=A\u000140=1\u0001-33=;E;" +

                "\u000148=7811315\u000155=JCI\u000159=6\u000164=20151026\u000166=DEL1021B_01BU\u00015700=\u00015701=\u000175=20151021\u000184=0.0\u0001100=NAMPTM\u0001167=CS\u0001207=NYSE\u0001284=501\u0001421=USA\u000110006=;FCCUST;DWPTELEGA;\u0001455=7811315\u000122=101\u0001456=101\u0001528=A\u0001581=9\u0001845=44.38\u000110003=-1.0\u000110005=7\u000110031=0A\u000110038=4613\u000110039=gs93748\u000110042=A\u000110045=▒\u000110073=?;SRN;\u000110075=1\u0001-27=\u0001377=N\u0001660=101\u000111210=1529438AMFt\u0001100232=501\u000110223=1\u000110203=PRGMLN\u000110204=PRGMUS2\u000110202=USPROGRAM\u000110208=US.PTE.TRADER\u0001-14=-1\u000110184=1529438AMG0\u000110292=501\u000110201=?\u000110515=36\u000110243=1529438AMG0\u000110518=36\u00011133=D\u000110438=RIO.4.5\u000110895=1000242191\u00016=0.0\u000111041=UNKNOWN_ENUM\u00011727=501,613,625,850, ,999\u0001662=44.38\u0001663=3\u0001150=A\u000114=0.0\u0001151=934.0\u000110=000\u0001");

        System.out.println(evaluation);



    }



}


