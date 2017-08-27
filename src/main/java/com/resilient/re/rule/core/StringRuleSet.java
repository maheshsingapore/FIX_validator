package com.resilient.re.rule.core;

import com.resilient.re.rule.loader.AntlrRulesLoader;

import java.io.StringReader;
import java.util.List;

/**
 * Created by mahesh on 4/7/2016.
 */
public class StringRuleSet extends RuleSet {

    public StringRuleSet(String name, String rule) {
        super(name, 1);
        AntlrRulesLoader loader = new AntlrRulesLoader();
        List<RuleBuilder> builders = loader.getRulesFor(new StringReader(rule));
        addAll(builders);
    }
}
