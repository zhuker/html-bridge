package org.stjs.javascript.dom;

public class XPathResult {
    /**
     * readonly
     */
    public boolean booleanValue;

    /**
     * readonly
     */
    public boolean invalidIteratorState;

    /**
     * readonly
     */
    public float numberValue;

    /**
     * readonly integer
     */
    public short resultType;

    /**
     * readonly
     */
    public Node singleNodeValue;

    /**
     * readonly
     */
    public Integer snapshotLength;

    /**
     * readonly
     */
    public String stringValue;
    /**
     * A result set containing whatever type naturally results from evaluation
     * of the expression. Note that if the result is a node-set then
     * UNORDERED_NODE_ITERATOR_TYPE is always the resulting type.
     */
    public static final int ANY_TYPE = 0;

    /**
     * A result containing a single number. This is useful for example, in an
     * XPath expression using the count() function.
     */
    public static final int NUMBER_TYPE = 1;

    /** A result containing a single string. */
    public static final int STRING_TYPE = 2;

    /**
     * A result containing a single boolean value. This is useful for example,
     * in an XPath expression using the not() function.
     */
    public static final int BOOLEAN_TYPE = 3;

    /**
     * A result node-set containing all the nodes matching the expression. The
     * nodes may not necessarily be in the same order that they appear in the
     * document.
     */
    public static final int UNORDERED_NODE_ITERATOR_TYPE = 4;
    /**
     * A result node-set containing all the nodes matching the expression. The
     * nodes in the result set are in the same order that they appear in the
     * document.
     */
    public static final int ORDERED_NODE_ITERATOR_TYPE = 5;
    /**
     * A result node-set containing snapshots of all the nodes matching the
     * expression. The nodes may not necessarily be in the same order that they
     * appear in the document.
     */
    public static final int UNORDERED_NODE_SNAPSHOT_TYPE = 6;
    /**
     * A result node-set containing snapshots of all the nodes matching the
     * expression. The nodes in the result set are in the same order that they
     * appear in the document.
     */
    public static final int ORDERED_NODE_SNAPSHOT_TYPE = 7;
    /**
     * A result node-set containing any single node that matches the expression.
     * The node is not necessarily the first node in the document that matches
     * the expression.
     */
    public static final int ANY_UNORDERED_NODE_TYPE = 8;
    /**
     * A result node-set containing the first node in the document that matches
     * the expression.
     */
    public static final int FIRST_ORDERED_NODE_TYPE = 9;
}
