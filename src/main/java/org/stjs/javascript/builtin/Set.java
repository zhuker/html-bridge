package org.stjs.javascript.builtin;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

/**
 * The Set object lets you store unique values of any type, whether primitive values or object references.
 * Set objects are collections of values. You can iterate through the elements
 * of a set in insertion order. A value in the Set may only occur once; it is
 * unique in the Set's collection.
 */
@STJSBridge
public class Set<P2> {
    /** Returns the number of values in the Set object. */
    public int size;

    /**
     * Appends a new element with the given value to the Set object. Returns the
     * Set object.
     */
    public Set<P2> add(Object value) {
        return null;
    }

    /** Removes all elements from the Set object. */
    public void clear() {
    }

    /**
     * Removes the element associated to the value and returns the value that
     * Set.prototype.has(value) would have previously returned.
     * Set.prototype.has(value) will return false afterwards.
     */
    public boolean delete(P2 value) {
        return false;
    }

    /**
     * Returns a new Iterator object that contains an array of [value, value]
     * for each element in the Set object, in insertion order. This is kept
     * similar to the Map object, so that each entry has the same value for its
     * key and value here.
     */
    public Iterator entries() {
        return null;
    }

    /**
     * Calls callbackFn once for each value present in the Set object, in
     * insertion order. If a thisArg parameter is provided to forEach, it will
     * be used as the this value for each callback.
     * 
     * @return
     */
    public void forEach(Callback1<P2> callbackFn) {
    }

    /**
     * Returns a boolean asserting whether an element is present with the given
     * value in the Set object or not.
     */
    public boolean has(P2 value) {
        return false;
    }

    /**
     * Is the same function as the values() function and returns a new Iterator
     * object that contains the values for each element in the Set object in
     * insertion order.
     */
    public Iterator keys() {
        return null;
    }

    /**
     * Returns a new Iterator object that contains the values for each element
     * in the Set object in insertion order.
     */
    public Iterator values() {
        return null;
    }

}
