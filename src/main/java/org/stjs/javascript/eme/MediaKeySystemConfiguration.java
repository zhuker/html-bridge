package org.stjs.javascript.eme;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
@STJSBridge
public class MediaKeySystemConfiguration {
    /**
     * An optional label that will be preserved in the MediaKeySystemConfiguration returned from the getConfiguration() method of MediaKeySystemAccess.
     */
    public String label;

    /**
     * Returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
     */
    public Array<String> initDataTypes;

    /**
     * A list of supported audio type and capability pairs.
     */
    public Array<MediaKeySystemMediaCapability> audioCapabilities;

    /**
     * A list of supported video type and capability pairs.
     */
    public Array<MediaKeySystemMediaCapability> videoCapabilities;

    /**
     * Indicates whether a persistent distinctive identifier is required.
     * On of MediaKeysRequirement
     */
    public String distinctiveIdentifier;

    /**
     * Indicates whether the ability to persist state is required.
     * On of MediaKeysRequirement
     */
    public String persistentState;

    /**
     * A list of MediaKeySessionTypes that must be supported.
     */
    public Array<String> sessionTypes;
}
