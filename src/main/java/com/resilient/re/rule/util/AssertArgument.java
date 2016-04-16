package com.resilient.re.rule.util;

/**
 * Created by mv29256 on 10/15/2015.
 */
public class AssertArgument {
    public static void isNotNull(Object... args) {

        if (args != null) {
            for (int i = 0; i < args.length; i++)
                if (args[i] == null) throw new IllegalArgumentException(String.format("Argument number %s was null",
                        i));
        } else
            throw new IllegalArgumentException("Argument was null");
    }
}
