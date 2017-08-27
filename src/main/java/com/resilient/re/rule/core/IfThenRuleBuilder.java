package com.resilient.re.rule.core;


import com.resilient.re.rule.event.Event;

/**
 * Created by mahesh on 10/22/2015.
 */
public class IfThenRuleBuilder extends GroovyRuleBuilder {

    private final RuleBuilder ifBuilder;
    private final RuleBuilder thenBuilder;

    public IfThenRuleBuilder(RuleBuilder ifBuilder, RuleBuilder thenBuilder) {
        super(thenBuilder.getTag());

        this.ifBuilder = ifBuilder;
        this.thenBuilder = thenBuilder;
    }

    @Override
    public Rule<Event> build() {
        Rule<Event> ifRule = ifBuilder.build();
        Rule<Event> thenRule = thenBuilder.build();

        return new Rule<Event>() {
            @Override
            public int forTag() {
                return thenBuilder.getTag().number();
            }

            @Override
            public boolean apply(Event event) {
                boolean ifConditionSatisfied = ifRule.apply(event);
                return ifConditionSatisfied ? thenRule.apply(event) : true;
            }


            @Override
            public String toString() {
                return String.format("if %s, then %s", ifRule, thenRule);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("if %s, then %s", ifBuilder, thenBuilder);
    }
}
