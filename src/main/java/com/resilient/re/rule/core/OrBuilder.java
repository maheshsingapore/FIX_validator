package com.resilient.re.rule.core;


import com.resilient.re.rule.event.Event;

/**
 * Created by mv29256 on 10/22/2015.
 */
public class OrBuilder extends GroovyRuleBuilder {

    private Rule<Event> lhs;
    private Rule<Event> rhs;
    private final RuleBuilder lhsBuilder;
    private final RuleBuilder rhsBuilder;

    public OrBuilder(RuleBuilder lhsBuilder, RuleBuilder rhsBuilder) {
        super(new GroovyTag(0));
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
                return 0;
            }

            @Override
            public boolean apply(Event event) {
                return lhs.apply(event) || rhs.apply(event);
            }

            @Override
            public String toString() {
                return String.format("{%s or %s}", lhs, rhs);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("{%s or %s}", lhsBuilder, rhsBuilder);
    }
}
