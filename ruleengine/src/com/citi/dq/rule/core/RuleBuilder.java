package com.citi.dq.rule.core;



import com.citi.dq.rule.condition.BetweenCondition;

import com.citi.dq.rule.condition.Condition;

import com.citi.dq.rule.condition.ContainsCondition;

import com.citi.dq.rule.condition.EqualsCondition;

import com.citi.dq.rule.util.AssertArgument;

import com.citigroup.get.quantum.intf.Message;



import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



import static com.citi.dq.rule.condition.Conditions.*;

import static com.citi.dq.rule.core.Constants.EMPTY_ARRAY;



/**

 * Created by mv29256 on 10/15/2015.

 */

public class RuleBuilder {



    protected final int tagNumber;

    protected final List<Condition> conditions;



    public RuleBuilder(int tagNumber, Condition... conditions) {

        AssertArgument.isNotNull(conditions);

        this.tagNumber = tagNumber;

        this.conditions = new ArrayList<>();



        for (Condition c : conditions) {

            this.conditions.add(c);

        }

    }



    public RuleBuilder(int tagNumber) {

        this.tagNumber = tagNumber;

        this.conditions = new ArrayList<>(5);

    }



    public RuleBuilder getPresent() {

        this.conditions.add(IS_PRESENT);

        return this;

    }



    public RuleBuilder getAbsent() {

        this.conditions.add(IS_ABSENT);

        return this;

    }



    public RuleBuilder getNumeric() {

        this.conditions.add(IS_NUMERIC);

        return this;

    }



    public RuleBuilder oneOf(String... values) {

        this.conditions.add(new ContainsCondition(this.tagNumber, values));

        return this;

    }



    public RuleBuilder oneOf(int... values) {

        this.conditions.add(new ContainsCondition(this.tagNumber, values));

        return this;

    }



    public RuleBuilder lessThan(int i) {

        this.conditions.add(new BetweenCondition(Integer.MIN_VALUE, i));

        return this;

    }



    public RuleBuilder greaterThan(Double i) {

        this.conditions.add(new BetweenCondition(i, Integer.MAX_VALUE));

        return this;

    }



    public RuleBuilder getMandatory() {

        this.conditions.add(MANDATORY);

        return this;

    }



    public RuleBuilder onlyIf(RuleBuilder ifCondition) {

        RuleBuilder thenCondition = this;

        return new IfThenRuleBuilder(ifCondition, thenCondition);

    }



    public Rule<Message> build() {

        return new ConditionalRule(this, this.conditions);

    }



    public RuleBuilder getConsistent() {

        return this;

    }



    public RuleBuilder getAnd() {

        return this;

    }



    public RuleBuilder or(RuleBuilder another) {



        return new OrRuleBuilder(this, another);

    }



    public RuleBuilder equalTo(String another) {

        this.conditions.add(new EqualsCondition(another));

        return this;

    }



    public RuleBuilder equalTo(int another) {

        this.conditions.add(new EqualsCondition(another));

        return this;

    }



    public RuleBuilder equalTo(Tag another) {

        this.conditions.add(new EqualsCondition(another));

        return this;

    }



    public RuleBuilder equalTo(Enum another) {

        this.conditions.add(new EqualsCondition(another));

        return this;

    }



    public int getTagNumber() {

        return tagNumber;

    }





    @Override

    public String toString() {

        return String.format("tag %d %s", tagNumber, conditions.toString());

    }



    public List<Condition> getConditions() {

        return conditions;

    }



    class ConditionalRule implements Rule<Message> {



        private final RuleBuilder parent;

        private final List<Condition> conditions;



        private ConditionalRule(RuleBuilder parent, List<Condition> conditions) {

            this.parent = parent;

            this.conditions = conditions;

        }



        @Override

        public int forTag() {

            return parent.getTagNumber();

        }



        @Override

        public boolean apply(Message message) {

            boolean matches = true;

            Iterator<Condition> iterator = conditions.iterator();



            while (iterator.hasNext() && matches) {

                Condition c = iterator.next();

                matches = matches && c.isSatisfiedBy(parent.getTagNumber(), message);

            }



            return matches;

        }

        public List<Condition> getConditions() {

            return conditions;

        }

        @Override

        public String toString() {

            return conditions != null ? conditions.toString() : EMPTY_ARRAY;

        }





    }

}


