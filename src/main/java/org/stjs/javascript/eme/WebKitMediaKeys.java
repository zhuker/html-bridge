package org.stjs.javascript.eme;

import org.stjs.javascript.Promise;
import org.stjs.javascript.typed.Uint8Array;

public class WebKitMediaKeys {
    public WebKitMediaKeys(String keySystem) {};

    public native WebKitMediaKeySession createSession(String keySystem, Uint8Array initData);

    public native Promise setServerCertificate();

    public native static boolean isTypeSupported(String keySystem, String type);
}
