package org.stjs.javascript.eme;

import org.stjs.javascript.typed.ArrayBuffer;
import org.w3c.dom.events.Event;

public abstract class MediaEncryptedEvent implements Event {
    /**
     * Indicates the Initialization Data Type of the Initialization Data contained in the initData attribute.
     */
    public String initDataType;

    /**
     * The Initialization Data for the event.
     */
    public ArrayBuffer initData;
}
