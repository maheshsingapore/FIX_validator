package com.resilient.re.ext;

import com.resilient.re.rule.event.Event;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mv29256 on 3/15/2016.
 */
public class Message implements Event {

    private static final Map<Integer, String> values = new HashMap<>();
    private final String msgType;

    public Message(String fixString) {

        Scanner scanner = new Scanner(fixString);
        scanner.useDelimiter("\u0001");

        while (scanner.hasNext()) {
            String kv = scanner.next();
            if (kv != null) {
                String[] tagValue = kv.split("=");

                if (tagValue != null && tagValue.length > 1) {
                    values.put(Integer.valueOf(tagValue[0]), tagValue[1]);
                }
            }
        }
        this.msgType = values.get(35);
    }

    public String getTag(int tag) {
        return values.get(tag);
    }

    public String setTag(int tag, String value) {
        return values.put(tag, value);
    }

    @Override
    public String getField(int tag) {
        return getTag(tag);
    }

    @Override
    public String getEventId() {
        return getMsgType();
    }

    public String getMsgType() {
        return msgType;
    }
}
