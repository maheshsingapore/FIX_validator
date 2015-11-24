package com.citi.dq.rule.core;



import com.citigroup.get.quantum.intf.Message;



import java.util.HashSet;

import java.util.Set;



/**

 * Created by mv29256 on 10/15/2015.

 */

public class RuleSet {



    private final Set<Rule<Message>> rules;

    private final String name;



    public RuleSet(String name) {

        this(name, 10);

    }



    public RuleSet(String name, int size) {

        this.name = name;

        rules = new HashSet<>(size);

    }



    public Set<Rule<Message>> getRules() {

        return this.rules;

    }



    public String getName() {

        return name;

    }



    public void add(Rule<Message> r) {

        this.rules.add(r);

    }



    @Override

    public String toString() {

        StringBuilder b = new StringBuilder(String.format("Ruleset [%d rules]: ", rules.size()));

        b.append(rules);

        return b.toString();

    }

}


