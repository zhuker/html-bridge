package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.file.FileSystemEntry;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
/**
 * The DataTransferItem object represents one drag data item. During a drag
 * operation, each drag event has a dataTransfer property which contains a list
 * of drag data items. Each item in the list is a DataTransferItem object. This
 * interface has no constructor.
 */
public class DataTransferItem {

    /** The kind of drag data item, string or file. */
    public String kind;

    /**
     * The drag data item'stype, typically a MIME type.
     */
    public String type;

    /**
     * @return Returns the File object associated with the drag data item (or
     *         null if the drag item is not a file).
     */
    @Native
    public File getAsFile() {
        return null;
    }

    /**
     * Invokes the specified callback with the drag data item string as its
     * argument
     * 
     * @param callback
     */
    @Native
    public void getAsString(Callback1<String> callback) {

    }

    /**
     * @return Returns an object based on FileSystemEntry representing the
     *         selected file's entry in its file system. This will generally be
     *         either a FileSystemFileEntry or FileSystemDirectoryEntry object.
     */
    @Native
    public FileSystemEntry webkitGetAsEntry() {
        return null;
    }

}
