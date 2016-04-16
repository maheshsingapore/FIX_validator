package com.resilient.re.rule.core;


import com.resilient.re.rule.event.Event;
import com.resilient.re.rule.loader.RulesLoader;
import com.resilient.re.rule.loader.RulesLoaderFactory;
import com.resilient.re.rule.util.AssertArgument;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;

/**
 * Created by mv29256 on 10/15/2015.
 */
public class RuleSet {

    private static final Logger LOGGER = LoggerFactory.getLogger(RuleSet.class);
    private static final RuleSet EMPTY_RULESET = new RuleSet("Empty ruleset");
    protected final Set<Rule<Event>> rules;
    private final String name;

    private RuleSet(String name) {
        this(name, 10);
    }

    public RuleSet(String name, int size) {
        this.name = name;
        rules = new HashSet<>(size);
    }

    public static List<RuleSet> loadFrom(File rulesDir, String pattern) {
        AssertArgument.isNotNull(rulesDir, pattern);
        RulesLoader rulesLoader = RulesLoaderFactory.getLoaderFor(rulesDir, pattern);

        File[] rulesFiles = rulesDir.listFiles((dir, name) -> {
            return name.matches(pattern);
        });

        List<RuleSet> loaded = rulesFiles != null ? new ArrayList<>(rulesFiles.length) : Collections.emptyList();
        if (rulesFiles != null) {
            for (File rulesFile : rulesFiles) {
                String ruleset = FilenameUtils.removeExtension(rulesFile.getName());
                RuleSet set = new RuleSet(ruleset);

                if (rulesLoader != null) {
                    List<RuleBuilder> rules = rulesLoader.getRulesFor(rulesFile);
                    set.addAll(rules);
                }

                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info(format("Loaded %d rule(s) for [%s] from [%s]", set.getRules().size(), ruleset, rulesFile));
                }
                loaded.add(set);
            }
        }

        return loaded;
    }

    public Set<Rule<Event>> getRules() {
        return this.rules;
    }

    public String getName() {
        return name;
    }

    public void add(Rule<Event> r) {
        this.rules.add(r);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(format("Ruleset [%d rules]: ", rules.size()));
        b.append(rules);
        return b.toString();
    }

    protected void addAll(List<RuleBuilder> rules) {
        this.rules.addAll(rules.stream().map(RuleBuilder::build).collect(Collectors.toList()));
    }
}
