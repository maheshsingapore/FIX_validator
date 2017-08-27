package com.resilient.re.rule.event;

import com.resilient.re.rule.type.TypeInferer;
import com.resilient.re.rule.util.Patterns;
import com.resilient.re.rule.core.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahesh on 3/18/2016.
 */
public class FieldTransformers {

    public static class IntTransformer implements FieldTransformer {

        private final Object field;

        public IntTransformer(Object field) {
            this.field = field;
        }

        @Override
        public Comparable transform(Event event) {
            return Integer.parseInt(String.valueOf(field));
        }

        @Override
        public String toString() {
            return String.format("%s", field);
        }
    }

    public static class DoubleTransformer implements FieldTransformer {

        private final Object field;

        public DoubleTransformer(Object field) {
            this.field = field;
        }

        @Override
        public Comparable transform(Event event) {
            return Double.parseDouble(String.valueOf(field));
        }

        @Override
        public String toString() {
            return String.format("%s", field);
        }
    }

    private static final SimpleDateFormat[] FORMATS = new SimpleDateFormat[22];

    private static final SimpleDateFormat F1 = new SimpleDateFormat("yyyyMMdd-HH:mm:SS");
    private static final SimpleDateFormat F2 = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");

    static {
        FORMATS[F1.toPattern().length()] = F1;
        FORMATS[F2.toPattern().length()] = F2;
    }

    public static class DateTransformer implements FieldTransformer {

        private final Object field;

        public DateTransformer(Object field) {
            this.field = field;
        }

        @Override
        public Comparable transform(Event event) {

            if (field != null) {
                String candidate = String.valueOf(field);
                SimpleDateFormat f = FORMATS[candidate.length()];

                try {
                    return f.parse(candidate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        public String toString() {
            return String.format("date (%s)", field);
        }
    }

    public static class TagTransformer implements FieldTransformer {

        private int tag;

        public TagTransformer(int tag) {
            this.tag = tag;
        }

        @Override
        public Comparable transform(Event event) {
            FieldTransformer infered = TypeInferer.infer(event.getField(tag));
            return infered.transform(event);
        }

        @Override
        public String toString() {
            return String.format("tag (%d)", tag);
        }
    }

    public static class StringTransformer implements FieldTransformer {

        private final String field;

        public StringTransformer(String field) {
            this.field = field;
        }

        @Override
        public Comparable transform(Event event) {
            return field;
        }

        @Override
        public String toString() {
            return String.format("%s", field);
        }
    }

    public final static FieldTransformer UNKNOWN = new FieldTransformer() {
        @Override
        public Comparable transform(Event event) {
            return null;
        }

        @Override
        public String toString() {
            return "unknown transformer";
        }
    };

    public static class TagConcatenator implements FieldTransformer {

        private List<Integer> toConcat;

        public void concat(Integer i) {
            if (toConcat == null) toConcat = new ArrayList<>();
            toConcat.add(i);
        }

        public void concat(String text) {
            if (Patterns.NUMERIC.matcher(text).matches()) {
                concat(Integer.parseInt(text));
            }
        }

        @Override
        public Comparable transform(Event event) {
            if (toConcat != null && toConcat.size() > 0) {
                StringBuilder b = new StringBuilder();

                for (Integer i : toConcat)
                    b.append(event.getField(i));

                return b.toString();
            }
            return Constants.EMPTY_STRING;
        }

        @Override
        public String toString() {
            return String.format("concat of %s", toConcat);
        }
    }
}
