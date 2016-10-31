package org.stjs.javascript;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class MutationObserverInit {

    /**
     * Set to true if additions and removals of the target node's child elements
     * (including text nodes) are to be observed.
     */
    public Boolean childList;

    /**
     * Set to true if mutations to target's attributes are to be observed.
     */
    public Boolean attributes;

    /**
     * Set to true if mutations to target's data are to be observed.
     */
    public Boolean characterData;

    /**
     * Set to true if mutations to target and target's descendants are to be
     * observed.
     */
    public Boolean subtree;

    /**
     * Set to true if attributes is set to true and target's attribute value
     * before the mutation needs to be recorded.
     */
    public Boolean attributeOldValue;

    /**
     * Set to true if characterData is set to true and target's data before the
     * mutation needs to be recorded.
     */
    public Boolean characterDataOldValue;

    /**
     * Set to an array of attribute local names (without namespace) if not all
     * attribute mutations need to be observed.
     */
    public Array<String> attributeFilter;
}
