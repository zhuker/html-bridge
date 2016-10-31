package org.stjs.javascript;

import org.stjs.javascript.dom.HTMLCollection;
import org.stjs.javascript.dom.Node;

public class MutationRecord {
    /**
     * 
     * Returns "attributes" if the mutation was an attribute mutation,
     * "characterData" if it was a mutation to a CharacterData node, and
     * "childList" if it was a mutation to the tree of nodes.
     * MutationRecord.target Node Returns the node the mutation affected,
     * depending on the MutationRecord.type.
     */
    public String type;

    /**
     * For attributes, it is the element whose attribute changed.
     * 
     * For characterData, it is the CharacterData node.
     * 
     * For childList, it is the node whose children changed.
     * 
     * Return the nodes added. Will be an empty NodeList if no nodes were added.
     */

    public HTMLCollection<Node> addedNodes;

    /**
     * Return the nodes removed. Will be an empty NodeList if no nodes were
     * removed.
     */
    public HTMLCollection<Node> removedNodes;

    /**
     * Return the previous sibling of the added or removed nodes, or null.
     */
    public Node previousSibling;

    /**
     * Return the next sibling of the added or removed nodes, or null.
     */
    public Node nextSibling;

    /**
     * Returns the local name of the changed attribute, or null.
     */
    public String attributeName;

    /**
     * Returns the namespace of the changed attribute, or null.
     */
    public String attributeNamespace;

    /**
     * The return value depends on the MutationRecord.type. For attributes, it
     * is the value of the changed attribute before the change. For
     * characterData, it is the data of the changed node before the change. For
     * childList, it is null.
     */
    public String oldValue;

}
