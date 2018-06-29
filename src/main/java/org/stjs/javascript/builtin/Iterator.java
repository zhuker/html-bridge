package org.stjs.javascript.builtin;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Iterator<T> {
    public native IteratorResult<T> next();

    @STJSBridge
    public static class IteratorResult<T> {
        public boolean done;
        public T value;
    }
}
