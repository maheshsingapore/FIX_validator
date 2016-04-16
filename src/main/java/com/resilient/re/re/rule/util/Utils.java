package com.resilient.re.re.rule.util;

/**
 * Created by mv29256 on 10/16/2015.
 */
public class Utils {
    public static <T> boolean arrayContains(final T[] array, final T v) {
        if (v == null) {
            for (final T e : array)
                if (e == null)
                    return true;
        } else {
            for (final T e : array)
                if (e == v || v.equals(e))
                    return true;
        }

        return false;
    }

    public static boolean arrayContains(final double[] array, final double v) {
        if (array != null) {
            for (double current : array) {
                if (current == v) return true;
            }
        }
        return false;
    }

    public static boolean arrayContains(final int[] array, final int v) {
        if (array != null) {
            for (int current : array) {
                if (current == v) return true;
            }
        }
        return false;
    }

    public static boolean arrayContains(final String[] array, final String v) {
        if (array != null) {
            for (String current : array) {
                if (current == v || (current != null && current.equals(v))) return true;
            }
        }
        return false;
    }

}
