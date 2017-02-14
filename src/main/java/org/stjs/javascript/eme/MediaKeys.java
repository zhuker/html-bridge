package org.stjs.javascript.eme;

import org.stjs.javascript.Promise;

public interface MediaKeys {
    /**
     * MediaKeys.createSession()
     * Returns a new MediaKeySession object, which represents a context for message exchange with a content decryption module (CDM).
     */
    MediaKeySession createSession();

    /**
     * MediaKeys.setServerCertificate()
     * Returns a Promise to a server certificate to be used to encrypt messages to the license server.
     */

    Promise setServerCertificate();
}
