package org.stjs.javascript.file;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.File;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class FileSystemFileEntry extends FileSystemEntry {
    @Native
    public void file(Callback1<File> successCallback, Callback1<Error> errorCallback) {
    }
}
