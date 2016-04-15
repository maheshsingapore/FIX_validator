package com.citi.eq.tds.re.rule.core;


import com.citi.eq.tds.re.rule.condition.Condition;
import com.citi.eq.tds.re.rule.event.Event;
import com.citi.eq.tds.re.rule.event.FieldTransformer;

import java.util.Collections;
import java.util.List;

/**
 * Created by mv29256 on 10/15/2015.
 */
public class GroovyTag implements Tag, FieldTransformer {

    private final int number;

    public GroovyTag(int i) {
        number = i;
    }

    public static GroovyTag tag(int t) {
        return new GroovyTag(t);
    }

    @Override
    public int number() {
        return number;
    }

    public GroovyRuleBuilder getMustBe() {
        return new GroovyRuleBuilder(this);
    }

    public GroovyRuleBuilder getIs() {
        return getMustBe();
    }

    public GroovyRuleBuilder getMustNotBe() {
        return new GroovyRuleBuilder(this) {

            @Override
            public Rule<Event> build() {
                return NegationRule(super.build());
            }

            private Rule<Event> NegationRule(Rule<Event> delegate) {

                return new Rule<Event>() {
                    @Override
                    public int forTag() {
                        return delegate.forTag();
                    }

                    @Override
                    public boolean apply(Event m) {
                        return !delegate.apply(m);
                    }

                    @Override
                    public String toString() {
                        return String.format("not %s", delegate.toString());
                    }
                };
            }
        };

    }


    @Override
    public String toString() {
        return String.format("tag %d", this.number());
    }

    @Override
    public Comparable transform(Event event) {
        return event.getField(number());
    }

    public static final RuleBuilder PLACEHOLDER_BUILDER = new RuleBuilder() {
        @Override
        public Tag getTag() {
            return null;
        }

        @Override
        public List<Condition> getConditions() {
            return Collections.emptyList();
        }

        @Override
        public Rule<Event> build() {
            return null;
        }

        @Override
        public RuleBuilder and(RuleBuilder another) {
            return null;
        }

        @Override
        public RuleBuilder or(RuleBuilder another) {
            return null;
        }
    };
}