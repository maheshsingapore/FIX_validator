package com.resilient.re.rule.error;

import com.resilient.re.ext.gen.FixRulesParser;
import org.antlr.v4.runtime.*;

/**
 * Created by mahesh on 3/28/2016.
 */
public class FixRulesErrorHandler extends DefaultErrorStrategy {

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {

        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == Token.EOF) input = "<EOF>";
            else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
        } else {
            input = "<unknown input>";
        }

        RuleContext c = e.getCtx();
        while (c.getParent() != null) {
            c = c.getParent();
            if (c instanceof FixRulesParser.RuleContext) break;
        }

        String msg = String.format("Failed to understand %s, ignoring rule [%s]", escapeWSAndQuote(input), c.getText());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }


    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        super.reportError(recognizer, e);
    }
}
