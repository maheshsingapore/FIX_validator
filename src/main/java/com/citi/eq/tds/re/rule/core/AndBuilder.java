package com.citi.eq.tds.re.rule.core;


import com.citi.eq.tds.re.rule.event.Event;

/**
 * Created by mv29256 on 10/22/2015.
 */
public class AndBuilder extends GroovyRuleBuilder {

    private final RuleBuilder lhsBuilder;
    private final RuleBuilder rhsBuilder;
    private Rule<Event> lhs;
    private Rule<Event> rhs;

    public AndBuilder(RuleBuilder lhsBuilder, RuleBuilder rhsBuilder) {
        super(Tags.UNDEFINED);

        this.lhsBuilder = lhsBuilder;
        this.rhsBuilder = rhsBuilder;

        //addCondition(this);
    }

    @Override
    public Rule<Event> build() {
        lhs = lhsBuilder.build();
        rhs = rhsBuilder.build();

        return new Rule<Event>() {

            @Override
            public int forTag() {
                return Tags.UNDEFINED.number();
            }

            @Override
            public boolean apply(Event event) {
                return lhs.apply(event) && rhs.apply(event);
            }

            @Override
            public String toString() {
                return String.format("{%s and %s}", lhs, rhs);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("{%s and %s}", lhsBuilder, rhsBuilder);
    }
}
