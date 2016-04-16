package com.resilient.re.rule.antlr;


import com.resilient.re.ext.gen.FixRulesParser;
import com.resilient.re.ext.gen.FixRulesLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;

/**
 * Created by mv29256 on 3/4/2015.
 */
public class FixRules {
    public static void main(String[] args) throws Exception {
        FixRulesLexer lexer;
        CommonTokenStream tokens;
        FixRulesParser parser;

        CommonTokenStream stream = new CommonTokenStream(new FixRulesLexer(new ANTLRInputStream(new FileReader("src\\main\\resources\\MoF\\D.rules"))));
        parser = new FixRulesParser(stream);

        ParseTree tree = parser.rules();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new FixRulesBuilder(), tree);

    }
}

