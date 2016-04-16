package com.resilient.re.re.rule.util;

import java.util.regex.Pattern;

/**
 * Created by mv29256 on 10/22/2015.
 */
public interface Patterns {

    Pattern ALPHANUMERIC = Pattern.compile("[a-zA-Z0-9]+");
    Pattern NUMERIC = Pattern.compile("-?\\d+");
    Pattern DOUBLE = Pattern.compile("\\d+\\.\\d+");
    Pattern TAG = Pattern.compile("tag\\((-?\\d+)\\)");
    Pattern UTC_TIMESTAMP = Pattern.compile("[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}");
}
