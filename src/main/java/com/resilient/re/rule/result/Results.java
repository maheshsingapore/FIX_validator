package com.resilient.re.rule.result;

/**
 * Created by mahesh on 10/16/2015.
 */
public interface Results {

    public static final Result NO_OP = new Result(
    ) {
        @Override
        public void addUnmatched(String unmatched) {
            super.addUnmatched(unmatched);
        }
    };
    public static final Result ALL_OK = new Result();
}
