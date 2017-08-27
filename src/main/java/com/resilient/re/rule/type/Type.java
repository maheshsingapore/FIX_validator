package com.resilient.re.rule.type;

import com.resilient.re.rule.core.GroovyTag;
import com.resilient.re.rule.event.FieldTransformer;
import com.resilient.re.rule.util.Patterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

/**
 * Created by mahesh on 3/17/2016.
 */
public class Type implements Comparable {
    private static final SimpleDateFormat[] FORMATS = new SimpleDateFormat[22];

    private static final SimpleDateFormat F1 = new SimpleDateFormat("yyyyMMdd-HH:mm:SS");
    private static final SimpleDateFormat F2 = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");

    static {
        FORMATS[F1.toPattern().length()] = F1;
        FORMATS[F2.toPattern().length()] = F2;
    }

    private Object value;

    public Type(FieldTransformer preprocessor, TypeInferer inferer) {
        this.inferer = inferer;
    }

    public TypeInferer getInferer() {
        return inferer;
    }

    public Object getValue() {
        return value;
    }

    private final TypeInferer inferer;

    public Type(String v, TypeInferer inferer) {
        switch (inferer) {
            case DATE:
                value = getDate(v);
                break;
            case DOUBLE:
                value = getDouble(v);
                break;
            case TAG:
                value = getTag(v);
                break;
            case INT:
                value = getInt(v);
                break;
            default:
                value = v;
        }

        this.inferer = inferer;
    }

    public Integer getInt(String field) {
        return Integer.parseInt(field);
    }

    public Double getDouble(String field) {
        return Double.parseDouble(field);
    }

    public Date getDate(String field) {
        SimpleDateFormat f = FORMATS[field.length()];
        try {
            return f.parse(field);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public GroovyTag getTag(String field) {
        Matcher matcher = Patterns.TAG.matcher(field);
        if (matcher.matches()) {
            return new GroovyTag(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", value, inferer);
    }
}
