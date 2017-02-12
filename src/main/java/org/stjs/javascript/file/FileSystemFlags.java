package org.stjs.javascript.file;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class FileSystemFlags {
    /**
     * If this property is true, and the requested file or directory doesn't
     * exist, the user agent should create it. The default is false. The parent
     * directory must already exist.
     */
    public Boolean create;
    /**
     * If true, and the create option is also true, the file must not exist
     * prior to issuing the call. Instead, it must be possible for it to be
     * created newly at call time. The default is false.
     */
    public Boolean exclusive;

}
