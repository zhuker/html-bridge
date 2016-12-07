package org.stjs.javascript.builtin;

import org.stjs.javascript.functions.Callback1;

public class Map<P1, P2> {
    /**
     * The Map object is a simple key/value map. Any value (both objects and
     * primitive values) may be used as either a key or a value.
     */

    /** Returns the number of key/value pairs in the Map object. */
    public int size;

    /** Removes all key/value pairs from the Map object. */
    public void clear() {
    }

    /**
     * Removes any value associated to the key and returns the value that
     * Map.prototype.has(key) would have previously returned.
     * Map.prototype.has(key) will return false afterwards.
     */
    public void delete(Object key) {
    }

    /**
     * Returns a new Iterator object that contains an array of [key, value] for
     * each element in the Map object in insertion order.
     */
    public Iterator entries() {
        return null;
    }

    /**
     * Calls callbackFn once for each key-value pair present in the Map object,
     * in insertion order. If a thisArg parameter is provided to forEach, it
     * will be used as the this value for each callback.
     */
    public void forEach(Callback1<Object> cb) {
    };

    /**
     * Returns the value associated to the key, or undefined if there is none.
     */
    public Object get(Object key) {
        return null;
    }

    /**
     * Returns a boolean asserting whether a value has been associated to the
     * key in the Map object or not.
     */
    public boolean has(Object key) {
        return false;
    }

    /**
     * Returns a new Iterator object that contains the keys for each element in
     * the Map object in insertion order.
     */
    public Iterator keys() {
        return null;
    }

    /** Sets the value for the key in the Map object. Returns the Map object. */
    public Map set(Object key, Object value) {
        return null;
    }

    /**
     * Returns a new Iterator object that contains the values for each element
     * in the Map object in insertion order.
     */
    public Iterator values() {
        return null;
    }
}
