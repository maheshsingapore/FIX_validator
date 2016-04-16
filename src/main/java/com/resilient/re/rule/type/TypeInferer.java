package com.resilient.re.rule.type;

import com.resilient.re.rule.core.GroovyTag;
import com.resilient.re.rule.event.FieldTransformer;
import com.resilient.re.rule.event.FieldTransformers;
import com.resilient.re.rule.util.Patterns;

import java.util.Date;
import java.util.regex.Matcher;

import static com.resilient.re.rule.util.Patterns.NUMERIC;

/**
 * Created by mv29256 on 3/16/2016.
 */
public enum TypeInferer {

    INT(Integer.class), DOUBLE(Double.class), STRING(String.class), TAG(GroovyTag.class), DATE(Date.class),
    UNKNOWN(Object.class),
    TRANSFORMER(FieldTransformer.class);

    private Class type;

    TypeInferer(Class aClass) {
        type = aClass;
    }

    public static FieldTransformer infer(Object o) {
        //AssertArgument.isNotNull(o); Groovy throws exception
        String field = String.valueOf(o);

        if (field != null) {
            if (NUMERIC.matcher(field).matches()) return new FieldTransformers.IntTransformer(field);
            else if (Patterns.DOUBLE.matcher(field).matches()) new FieldTransformers.DoubleTransformer(field);
            else if (Patterns.TAG.matcher(field).matches()) {
                Matcher matcher = Patterns.TAG.matcher(field);
                if (matcher.matches()) {
                    return new FieldTransformers.TagTransformer(Integer.parseInt(matcher.group(1)));
                }
            } else
                return new FieldTransformers.StringTransformer(field);
        }

        return FieldTransformers.UNKNOWN;
    }


    @Override
    public String toString() {
        return type.getSimpleName();
    }
}
