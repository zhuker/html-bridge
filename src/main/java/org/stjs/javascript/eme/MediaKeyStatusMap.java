package org.stjs.javascript.eme;

import org.stjs.javascript.Array;
import org.stjs.javascript.builtin.Iterator;
import org.stjs.javascript.functions.Callback1;

public abstract class MediaKeyStatusMap {
    /**
     * MediaKeyStatusMap.size Read only
     * Returns the number of key/value pars in the status map.
     */
    public int size;

    /**
     * MediaKeyStatusMap.entries() Read only
     * Returns a new Iterator object containing an array of [key, value] for each element in the status map, in insertion order.
     */
    public native Iterator<Array> entries();

    /**
     * MediaKeyStatusMap.forEach(callback[, argument]) Read only
     * Calls callback once for each key-value pair in the status map, in insertion order. If argument is present it will be passed to the callback.
     */
    public native void forEach(Callback1 callback);

    /**
     * MediaKeyStatusMap.get() Read only
     * Returns the value associated with the given key, or undefined if there is none.
     */
    public native Object get(String key);

    /**
     * MediaKeyStatusMap.has() Read only
     * Returns a boolean asserting whether a value has been associated with the given key.
     */

    public native boolean has(String key);

    /**
     * MediaKeyStatusMap.keys() Read only
     * Returns a new Iterator object containing keys for each element in the status map, in insertion order.
     */
    public native Iterator<Array> keys();

    /**
     * MediaKeyStatusMap.values() Read only
     * Returns a new Iterator object containing values for each element in the status map, in insertion order.
     */
    public native Iterator<Array> values();

    /**
     * MediaKeyStatusMap.[@@iterator]() Read only
     * Returns a new Iterator object containing an array of [key, value] for each element in the status map, in insertion order.
     */
    public native Iterator<Array> iterator();
}
