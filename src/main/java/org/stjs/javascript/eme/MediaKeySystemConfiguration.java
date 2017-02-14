package org.stjs.javascript.eme;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
@STJSBridge
public class MediaKeySystemConfiguration {
    /**
     * MediaKeySystemConfiguration.initDataTypes Read only
     * Returns a list of supported initialization data type names. An initialization data type is a string indicating the format of the initialization data.
     */
    public Array<String> initDataTypes;

    /**
     * MediaKeySystemConfiguration.audioCapabilities Read only
     * Returns a list of supported audio type and capability pairs.
     */
    public Map<String, String> audioCapabilities;

    /**
     * MediaKeySystemConfiguration.videoCapabilities Read only
     * Returns a list of supported video type and capability pairs.
     */
    public Map<String, String> videoCapabilities;

    /**
     * MediaKeySystemConfiguration.distinctiveIdentifier Read only
     * Indicates whether a persistent distinctive identifier is required.
     */
    public String distinctiveIdentifier;

    /**
     * MediaKeySystemConfiguration.persistentState Read only
     * Indicates whether the ability to persist state is required.
     */
    public Object persistentState;

    public MediaKeySystemConfiguration(Array<String> initDataTypes, Map<String, String> videoCapabilities) {
        this.initDataTypes = initDataTypes;
        this.videoCapabilities = videoCapabilities;
    }
}
