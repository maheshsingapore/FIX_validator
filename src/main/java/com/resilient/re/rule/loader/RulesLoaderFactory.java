package com.resilient.re.rule.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

import static java.text.MessageFormat.format;

/**
 * Created by mahesh on 3/15/2016.
 */
public class RulesLoaderFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(RulesLoaderFactory.class);

    public static RulesLoader getLoaderFor(File rulesDir, String pattern) {
        try {
            return new AntlrRulesLoader(rulesDir.getAbsolutePath());
        } catch (IOException e) {
            LOGGER.error(format("Failed to load rules from %s", rulesDir), e);
        }
        return null;
    }

    public static RulesLoader zgetLoaderFor(File rulesDir, String pattern) {
        try {
            return new GroovyRulesLoader(rulesDir.getAbsolutePath());
        } catch (IOException e) {
            LOGGER.error(format("Failed to load rules from %s", rulesDir), e);
        }
        return null;
    }
}
