package org.stjs.javascript.file;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public abstract class FileSystemDirectoryReader {
    /**
     * Returns a an array containing some number of the directory's entries.
     * Each item in the array is an object based on FileSystemEntry—typically
     * either FileSystemFileEntry or FileSystemDirectoryEntry.
     */
    @Native
    public void readEntries(Callback1<Array<FileSystemEntry>> successCallback, Callback1<Error> errorCallback) {
        
    }
}
