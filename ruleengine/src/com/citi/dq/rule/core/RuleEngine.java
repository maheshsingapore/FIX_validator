package com.citi.dq.rule.core;



import com.citi.dq.rule.result.Result;

import com.citi.dq.rule.result.ResultBuilder;

import com.citi.dq.rule.result.Results;

import com.citi.dq.rule.util.AssertArgument;

import com.citigroup.get.quantum.intf.Message;

import com.citigroup.get.quantum.intf.MessageFactory;

import com.citigroup.get.zcc.intf.MessageFactoryImpl;



import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;



/**

 * Created by mv29256 on 10/15/2015.

 */

public class RuleEngine {



    private static final RuleEngine SINGLETON = new RuleEngine();

    private static final MessageFactory factory = new MessageFactoryImpl();

    private final Map<String, RuleSet> rules;



    private RuleEngine() {

        rules = new HashMap<>();

    }

    public static final RuleEngine instance() {

        return SINGLETON;

    }

    public Map<String, RuleSet> getRules() {

        return rules;

    }

    public void add(RuleSet set) {

        this.rules.put(set.getName(), set);

    }





    public void addRules(String message, List<RuleBuilder> rules) {

        AssertArgument.isNotNull(rules, message);



        RuleSet ruleSet = null;



        if (rules != null) {

            ruleSet = new RuleSet(message, rules.size());



            for (RuleBuilder ruleBuilder : rules) {

                Rule<Message> rule = ruleBuilder.build();

                ruleSet.add(rule);

            }

        }



        this.rules.put(message, ruleSet);

    }



    public Result evaluate(String fixMessage) {

        return evaluate(factory.getMessage(fixMessage));

    }



    public Result evaluate(Message message) {



        Result result = Results.NO_OP;



        if (message != null) {

            result = Results.ALL_OK;

            result = new Result();



            RuleSet ruleSet = this.rules.get(message.getMsgType());



            if (ruleSet != null) {

                Set<Rule<Message>> rulesForMessage = ruleSet.getRules();



                for (Rule<Message> rule : rulesForMessage) {

                    boolean matches = rule.apply(message);



                    ResultBuilder builder = new ResultBuilder();

                    if (!matches) {

                        String unmatchedRule = builder

                                .self(rule)

                                .expected(rule)

                                .actual(message.getTag(rule.forTag()))

                                .build();

                        result.addUnmatched(unmatchedRule);

                    }

                }

            } else {

                System.out.println(String.format("No rules found for messageType %s", message.getMsgType()));

            }

        }



        return result;

    }



}


