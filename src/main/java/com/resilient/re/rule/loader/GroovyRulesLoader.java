package com.resilient.re.rule.loader;


import com.resilient.re.rule.core.RuleBuilder;
import com.resilient.re.rule.util.AssertArgument;
import groovy.util.GroovyScriptEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.List;

import static java.lang.String.format;

public class GroovyRulesLoader implements RulesLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(GroovyRulesLoader.class);
    private GroovyScriptEngine scriptEngine;

    public GroovyRulesLoader(String root) throws IOException {
        scriptEngine = new GroovyScriptEngine(root);
    }

    public List<RuleBuilder> getRulesFor(String scriptName) {
        return getRulesFor(new File(scriptName));
    }

    @Override
    public List<RuleBuilder> getRulesFor(File rulesFile) {
        AssertArgument.isNotNull(rulesFile);

        try {

            scriptEngine = new GroovyScriptEngine(rulesFile.getParent());
            Class ruleClass = scriptEngine.loadScriptByName(rulesFile.getName());

            Object ruleClassInstance = ruleClass.newInstance();
            Object rules = ruleClass.getDeclaredMethod("getRules", new Class[]{}).invoke(ruleClassInstance, new Object[]{});

            List<RuleBuilder> loaded = (List<RuleBuilder>) rules;

            if (LOGGER.isInfoEnabled()) {
                LOGGER.info(format("getRulesFor(): Loaded [%d] rules from [%s]", loaded.size(), rulesFile));
            }

            return loaded;

        } catch (Exception e) {
            LOGGER.error(format("Failed to load rules from [%s]", rulesFile), e);
        }

        return Collections.emptyList();
    }

    //TODO
    @Override
    public List<RuleBuilder> getRulesFor(Reader in) {
        return null;
    }
}