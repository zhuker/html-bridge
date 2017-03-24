package org.stjs.javascript.eme;

import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.typed.ArrayBuffer;
import org.w3c.dom.events.Event;

public abstract class MediaKeyMessageEvent implements Event {
    /**
     * The message from the CDM.
     */
    public ArrayBuffer message;

    /**
     * The type of the message.
     * May be one of MediaKeyMessageType
     */
    public String messageType;
}
