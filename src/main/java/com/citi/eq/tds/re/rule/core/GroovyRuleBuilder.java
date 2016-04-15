package com.citi.eq.tds.re.rule.core;

import com.citi.eq.tds.re.rule.condition.BetweenCondition;
import com.citi.eq.tds.re.rule.condition.Condition;
import com.citi.eq.tds.re.rule.condition.ContainsCondition;
import com.citi.eq.tds.re.rule.condition.EqualsCondition;
import com.citi.eq.tds.re.rule.event.Event;
import com.citi.eq.tds.re.rule.type.TypeInferer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.citi.eq.tds.re.rule.condition.Conditions.*;
import static com.citi.eq.tds.re.rule.core.Constants.EMPTY_ARRAY;

/**
 * Created by mv29256 on 10/15/2015.
 */
public class GroovyRuleBuilder implements RuleBuilder {

    protected final Tag tag;
    protected final List<Condition> conditions;

    public GroovyRuleBuilder(Tag t, Condition... conditions) {
        this.tag = t;
        this.conditions = new ArrayList<>();

        for (Condition c : conditions) {
            this.conditions.add(c);
        }
    }

    public GroovyRuleBuilder(Tag t) {
        this.tag = t;
        this.conditions = new ArrayList<>(5);
    }

    public GroovyRuleBuilder getPresent() {
        this.conditions.add(IS_PRESENT);
        return this;
    }

    public GroovyRuleBuilder getAbsent() {
        this.conditions.add(IS_ABSENT);
        return this;
    }

    public GroovyRuleBuilder getNumeric() {
        this.conditions.add(IS_NUMERIC);
        return this;
    }

    public GroovyRuleBuilder oneOf(String... values) {
        this.conditions.add(new ContainsCondition(values));
        return this;
    }

    public GroovyRuleBuilder oneOf(int... values) {
        this.conditions.add(new ContainsCondition(values));
        return this;
    }

    public GroovyRuleBuilder lessThan(int i) {
        this.conditions.add(new BetweenCondition(Integer.MIN_VALUE, i));
        return this;
    }

    public GroovyRuleBuilder lessThan(Double i) {
        this.conditions.add(new BetweenCondition(Integer.MIN_VALUE, i));
        return this;
    }

    public GroovyRuleBuilder greaterThan(int i) {
        this.conditions.add(new BetweenCondition(i, Integer.MAX_VALUE));
        return this;
    }

    public GroovyRuleBuilder greaterThan(Double i) {
        this.conditions.add(new BetweenCondition(i, Integer.MAX_VALUE));
        return this;
    }

    public GroovyRuleBuilder getMandatory() {
        this.conditions.add(MANDATORY);
        return this;
    }

    public GroovyRuleBuilder onlyIf(RuleBuilder ifCondition) {
        RuleBuilder thenCondition = this;
        return new IfThenRuleBuilder(ifCondition, thenCondition);
    }

    @Override
    public Rule<Event> build() {
        return new ConditionalRule(this, this.conditions);
    }

    @Override
    public RuleBuilder and(RuleBuilder another) {
        return getAnd();
    }

    @Override
    public RuleBuilder or(RuleBuilder another) {
        return getOr();
    }

    /*TODO*/
    public GroovyRuleBuilder getConsistent() {
        return this;
    }

    public GroovyRuleBuilder getAnd() {
        return new AndRuleBuilder(this);
    }

    public GroovyRuleBuilder getOr() {
        return new OrRuleBuilder(this);
    }

    public GroovyRuleBuilder equalTo(Object another) {
        this.conditions.add(new EqualsCondition(TypeInferer.infer(another)));
        return this;
    }

    @Override
    public String toString() {
        return String.format("tag %d %s", tag.number(), conditions.toString());
    }

    @Override
    public List<Condition> getConditions() {
        return conditions;
    }

    public void addCondition(Condition condition) {
        this.conditions.add(condition);
    }

    class ConditionalRule implements Rule<Event> {

        private final RuleBuilder parent;
        private final List<Condition> conditions;

        private ConditionalRule(RuleBuilder parent, List<Condition> conditions) {
            this.parent = parent;
            this.conditions = conditions;
        }

        @Override
        public int forTag() {
            return parent.getTag().number();
        }

        @Override
        public boolean apply(Event event) {
            boolean matches = true;
            Iterator<Condition> iterator = conditions.iterator();

            while (iterator.hasNext() && matches) {
                Condition c = iterator.next();
                matches = matches && c.isSatisfiedBy(parent.getTag().number(), event);
            }

            return matches;
        }

        public List<Condition> getConditions() {
            return conditions;
        }

        @Override
        public String toString() {
            return conditions != null ? String.format("tag %s %s", parent.getTag().number(), conditions) : EMPTY_ARRAY;
        }


    }

    public Tag getTag() {
        return tag;
    }

}
