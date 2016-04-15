package com.citi.eq.tds.re.ext;

import com.citi.eq.tds.re.rule.event.Event;

/**
 * Created by mv29256 on 3/15/2016.
 */
public class MessageFactory {

    public Message getMessage(String fixString) {
        return new Message(fixString);
    }

    public Event newEvent(String candidate) {
        return getMessage(candidate);
    }
}
