package org.stjs.javascript.file;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class FileSystem {
    /**
     * A USVString representing the file system's name. This name is unique
     * among the entire list of exposed file systems.
     */
    public String name;
    /**
     * A FileSystemDirectoryEntry object which represents the file system's root
     * directory. Through this object, you can gain access to all files and
     * directories in the file system.
     */
    public Object root;
}
