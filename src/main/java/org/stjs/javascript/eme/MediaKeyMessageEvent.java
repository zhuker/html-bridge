package org.stjs.javascript.eme;

import org.stjs.javascript.typed.ArrayBuffer;
import org.w3c.dom.events.Event;

abstract class MediaKeyMessageEvent implements Event {
    ArrayBuffer message = null;

    /**
     * May be one of license-request, license-renewal, license-renewal, or individualization-request.
     */
    String messageType;
}
