package com.citi.dq.rule;



import com.citi.dq.rule.core.RuleBuilder;

import groovy.util.GroovyScriptEngine;



import java.io.IOException;

import java.util.Collections;

import java.util.List;



public class DynamicRulesLoader {



    private final GroovyScriptEngine scriptEngine;



    DynamicRulesLoader(String root) throws IOException {

        scriptEngine = new GroovyScriptEngine(root);

    }



    public List<RuleBuilder> getRulesFor(String scriptName) {

        try {



            Class ruleClass = scriptEngine.loadScriptByName(scriptName);



            Object ruleClassInstance = ruleClass.newInstance();

            Object rules = ruleClass.getDeclaredMethod("getRules", new Class[]{}).invoke(ruleClassInstance, new Object[]{});



            return (List<RuleBuilder>) rules;



        } catch (Exception e) {

            e.printStackTrace();

        }



        return Collections.emptyList();

    }

}
