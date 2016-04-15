package com.citi.eq.tds.re.rule.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class Result {

    private static final String ALL_OK = "ok";
    private List<String> unmatched;

    public void addUnmatched(String unmatched) {

        if (this.unmatched == null) {
            this.unmatched = new ArrayList<>(10);
        }

        this.unmatched.add(unmatched);
    }

    @Override
    public String toString() {
        String toReturn = ALL_OK;

        if (this.unmatched != null) {
            StringBuilder builder = new StringBuilder("Unmatched rules:").append(System.lineSeparator());

            Iterator<String> unmatchedRules = this.unmatched.iterator();
            while (unmatchedRules.hasNext()) {
                builder.append(unmatchedRules.next()).append(System.lineSeparator());
            }

            toReturn = builder.toString();
        }

        return toReturn;
    }

    public int failCount() {
        return unmatched != null ? unmatched.size() : 0;
    }

    public List<String> getUnmatched() {
        Collections.sort(unmatched);
        return unmatched;
    }
}
