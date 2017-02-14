package org.stjs.javascript.eme;


import org.stjs.javascript.Promise;

public abstract class MediaKeySystemAccess {
    /*
    MediaKeySystemAccess.keySystem Read only
    Returns a DOMString identifying the key system being used.
     */
    public final String keySystem = "readyonly";

    /*
    MediaKeySystemAccess.createMediaKeys()
    Returns a Promise that resolves to a new MediaKeys object.
     */
    public native Promise<MediaKeys> createMediaKeys();

    /*
    MediaKeySystemAccess.getConfiguration()
    Returns a MediaKeySystemConfiguration object with the supported combination of configuration options.
     */
    public native MediaKeySystemConfiguration getConfiguration();
}
