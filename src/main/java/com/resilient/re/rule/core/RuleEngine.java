package com.resilient.re.rule.core;


import com.resilient.re.ext.MessageFactory;
import com.resilient.re.ext.MessageFactoryImpl;
import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.result.Result;
import com.resilient.re.rule.result.ResultBuilder;
import com.resilient.re.rule.result.Results;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mahesh on 10/15/2015.
 */
public class RuleEngine {

    private static final RuleEngine SINGLETON = new RuleEngine();
    private static final MessageFactory factory = new MessageFactoryImpl();
    private final Map<String, RuleSet> rules;

    private RuleEngine() {
        rules = new HashMap<>();
    }

    public static RuleEngine instance() {
        return SINGLETON;
    }

    public Map<String, RuleSet> getRules() {
        return rules;
    }

    public RuleEngine add(RuleSet set) {
        this.rules.put(set.getName(), set);
        return SINGLETON;
    }

    public RuleEngine addAll(List<RuleSet> sets) {
        for (RuleSet r : sets) {
            this.rules.put(r.getName(), r);
        }

        return SINGLETON;
    }

    public Result evaluate(String candidate) {
        return evaluate(factory.newEvent(candidate));
    }

    public Result evaluate(Event event) {

        Result result = Results.NO_OP;

        if (event != null) {
            result = new Result();

            RuleSet ruleSet = this.rules.get(event.getEventId());

            if (ruleSet != null) {
                Set<Rule<Event>> rulesForMessage = ruleSet.getRules();

                for (Rule<Event> rule : rulesForMessage) {
                    boolean matches = rule.apply(event);

                    ResultBuilder builder = new ResultBuilder();
                    if (!matches) {
                        String unmatchedRule = builder
                                .self(rule)
                                .expected(rule)
                                .actual(event.getField(rule.forTag()))
                                .build();
                        result.addUnmatched(unmatchedRule);
                    }
                }
            } else {
                System.out.println(String.format("No rules found for messageType %s", event.getEventId()));
            }
        }

        return result;
    }

}
