package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class KeyboardEvent extends DOMEvent {

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key
     * 
     * The KeyboardEvent.key read-only property returns the value of a key or
     * keys pressed by the user.
     */
    public String key;

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/keyIdentifier
     * 
     * The deprecated KeyboardEvent.keyIdentifier read-only property returns a
     * "key identifier" string that can be used to determine what key was
     * pressed. Its non-deprecated replacement is KeyboardEvent.key.
     */
    @Deprecated
    public String keyIdentifier;
}
