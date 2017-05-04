package org.stjs.javascript.eme;

import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.typed.Uint8Array;

public abstract class WebKitMediaKeySession implements EventTarget {
    public String contentId;

    public native void update(Uint8Array data);
}
