package com.resilient.re.re.rule.loader;

import com.resilient.re.re.ext.gen.FixRulesLexer;
import com.resilient.re.re.ext.gen.FixRulesParser;
import com.resilient.re.re.rule.antlr.FixRulesBuilder;
import com.resilient.re.re.rule.core.RuleBuilder;
import com.resilient.re.re.rule.error.FixRulesErrorHandler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Collections;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by mv29256 on 3/16/2016.
 */
public class AntlrRulesLoader implements RulesLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(AntlrRulesLoader.class);
    private File root;

    public AntlrRulesLoader(String absolutePath) throws FileNotFoundException {
        root = new File(absolutePath);
        if (!root.exists()) throw new FileNotFoundException();
    }

    public AntlrRulesLoader() {
    }

    @Override
    public List<RuleBuilder> getRulesFor(File rulesFile) {
        FixRulesLexer lexer;
        CommonTokenStream tokens;
        FixRulesParser parser;

        CommonTokenStream stream = null;
        try {
            stream = new CommonTokenStream(new FixRulesLexer(new ANTLRInputStream(new FileReader(rulesFile))));
            parser = new FixRulesParser(stream);
            parser.setErrorHandler(new FixRulesErrorHandler());

            ParseTree tree = parser.rules();

            ParseTreeWalker walker = new ParseTreeWalker();
            FixRulesBuilder rulesBuilder = new FixRulesBuilder();
            walker.walk(rulesBuilder, tree);

            return rulesBuilder.getRuleBuilders();

        } catch (IOException e) {
            LOGGER.error(format("Failed to load rules from [%s]", rulesFile), e);
        }
        return Collections.emptyList();
    }

    @Override
    public List<RuleBuilder> getRulesFor(Reader in) {
        FixRulesLexer lexer;
        CommonTokenStream tokens;
        FixRulesParser parser;

        CommonTokenStream stream = null;
        try {
            stream = new CommonTokenStream(new FixRulesLexer(new ANTLRInputStream(in)));
            parser = new FixRulesParser(stream);
            parser.setErrorHandler(new FixRulesErrorHandler());

            ParseTree tree = parser.rules();

            ParseTreeWalker walker = new ParseTreeWalker();
            FixRulesBuilder rulesBuilder = new FixRulesBuilder();
            walker.walk(rulesBuilder, tree);

            return rulesBuilder.getRuleBuilders();

        } catch (IOException e) {
            LOGGER.error("Failed to load rules from stream", e);
        }
        return Collections.emptyList();
    }
}
