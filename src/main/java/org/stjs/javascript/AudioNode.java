package org.stjs.javascript;

import org.stjs.javascript.annotation.Native;

public class AudioNode {
    /**
     * Read only Returns the associated AudioContext, that is the object
     * representing the processing graph the node is participating in.
     */
    public AudioContext context;
    /**
     * Read only Returns the number of inputs feeding the node. Source nodes are
     * defined as nodes having a numberOfInputs property with a value of 0.
     */
    public int numberOfInputs;
    /**
     * Read only Returns the number of outputs coming out of the node.
     * Destination nodes — like AudioDestinationNode — have a value of 0 for
     * this attribute.
     */
    public int numberOfOutputs;
    /**
     * Represents an integer used to determine how many channels are used when
     * up-mixing and down-mixing connections to any inputs to the node. Its
     * usage and precise definition depend on the value of
     * AudioNode.channelCountMode.
     */
    public int channelCount;
    /**
     * Represents an enumerated value describing the way channels must be
     * matched between the node's inputs and outputs.
     * AudioNode.channelInterpretation Represents an enumerated value describing
     * the meaning of the channels. This interpretation will define how audio
     * up-mixing and down-mixing will happen. The possible values are "speakers"
     * or "discrete".
     */
    public String channelCountMode;

    /**
     * Allows us to connect one output of this node to one input of another
     * node.
     */
    @Native
    public void connect(AudioNode node) {
    }

    @Native
    /**
     * Allows us to connect one output of this node to one input of an audio
     * parameter.
     */
    public void connect(AudioParam param) {
    }

    /**
     * Allows us to disconnect the current node from another one it is already
     * connected to.
     */
    public void disconnect() {
    }
}
