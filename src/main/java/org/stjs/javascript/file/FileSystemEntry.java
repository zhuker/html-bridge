package org.stjs.javascript.file;

import org.stjs.javascript.Error;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class FileSystemEntry {
    /**
     * A FileSystem object representing the file system in which the entry is
     * located.
     */
    public FileSystem filesystem;
    /**
     * A USVString object which provides the full, absolute path from the file
     * system's root to the entry; it can also be thought of as a path which is
     * relative to the root directory, prepended with a "/" character.
     */
    public String fullPath;

    /**
     * A Boolean which is true if the entry represents a directory; otherwise,
     * it's false.
     */
    public boolean isDirectory;
    /**
     * A Boolean which is true if the entry represents a file. If it's not a
     * file, this value is false.
     */
    public boolean isFile;
    /**
     * A USVString containing the name of the entry (the final part of the path,
     * after the last "/" character).
     */
    public String name;

    /**
     * Copies the file or directory to a new location on the file system.
     */
    @Native
    public void copyTo(FileSystemDirectoryEntry newParent, String newName, Callback1 successCallback,
            Callback1 errorCallback) {

    }

    /**
     * Obtains metadata about the file, such as its modification date and size.
     */
    @Native
    public void getMetadata(Callback1<Metadata> successCallback, Callback1<Error> errorCallback) {

    }

    /**
     * Returns a FileSystemDirectoryEntry representing the entry's parent
     * directory.
     */
    @Native
    public void getParent(Callback1<FileSystemDirectoryEntry> successCallback, Callback1<Error> errorCallback) {

    }

    /**
     * Moves the file or directory to a new location on the file system, or
     * renames the file or directory.
     */
    @Native
    public void moveTo(FileSystemDirectoryEntry newParent, String newName, Callback1<FileSystemEntry> successCallback,
            Callback1<Error> errorCallback) {
    }

    /**
     * Removes the specified file or directory. You can only remove directories
     * which are empty.
     */
    @Native
    public void remove(Callback0 successCallback, Callback1<Error> errorCallback) {

    }

    /**
     * Creates and returns a URL which identifies the entry. This URL uses the
     * URL scheme "filesystem:".
     */
    @Native
    public String toURL(String mimeType) {
        return null;
    }
}
