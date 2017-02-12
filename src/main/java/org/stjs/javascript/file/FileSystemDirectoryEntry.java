package org.stjs.javascript.file;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class FileSystemDirectoryEntry extends FileSystemEntry {
//    Creates a FileSystemDirectoryReader object which can be used to read the entries in this directory.

    @Native
    public FileSystemDirectoryReader createReader() {
        return null;
    }

    /**
     * Returns a FileSystemDirectoryEntry object representing a directory
     * located at a given path, relative to the directory on which the method is
     * called.
     */
    @Native
    public void getDirectory(String path, FileSystemFlags options, Callback1<FileSystemDirectoryEntry> successCallback,
            Callback1<Error> errorCallback) {
    }

    /**
     * Returns a FileSystemFileEntry object representing a file located within
     * the directory's hierarchy, given a path relative to the directory on
     * which the method is called.
     */
    public void getFile(String path, FileSystemFlags options, Callback1<FileSystemFileEntry> successCallback,
            Callback1<Error> errorCallback) {

    }
}
