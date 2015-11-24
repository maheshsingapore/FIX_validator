package com.citi.dq.rule.core;



import com.citigroup.get.quantum.intf.Message;



/**

 * Created by mv29256 on 10/15/2015.

 */

public class Tag {



    private final int number;    public int getNumber() {

        return number;

    }



    public Tag(int i) {

        number = i;

    }

    public RuleBuilder getMustBe() {

        return new RuleBuilder(this.number);

    }

    public RuleBuilder getIs() {

        return new RuleBuilder(this.number);

    }

    public RuleBuilder getMustNotBe() {

        return new RuleBuilder(this.number) {



            @Override

            public Rule<Message> build() {

                return NegationRule(super.build());

            }



            private Rule<Message> NegationRule(Rule<Message> delegate) {



                return new Rule<Message>() {

                    @Override

                    public int forTag() {

                        return delegate.forTag();

                    }



                    @Override

                    public boolean apply(Message m) {

                        return !delegate.apply(m);

                    }



                    @Override

                    public String toString() {

                        return String.format("NOT %s", delegate.toString());

                    }

                };

            }

        };



    }









    @Override

    public String toString() {

        return String.format("tag %d", this.getNumber());

    }

}
