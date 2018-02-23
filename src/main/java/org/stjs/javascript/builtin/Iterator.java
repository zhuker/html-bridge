package org.stjs.javascript.builtin;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Iterator<T> {
    public native T next();
}
