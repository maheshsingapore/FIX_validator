package com.citi.eq.tds.re.rule.loader;

import com.citi.eq.tds.re.rule.core.RuleBuilder;

import java.io.File;
import java.io.Reader;
import java.util.List;

/**
 * Created by mv29256 on 3/15/2016.
 */
public interface RulesLoader {

    List<RuleBuilder> getRulesFor(File rulesFile);

    List<RuleBuilder> getRulesFor(Reader in);
}
