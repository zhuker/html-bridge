package org.stjs.javascript.dom.media;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Native;

public class MediaStream {
    @Native
    public MediaStream() {

    }

    @Native
    public MediaStream(MediaStream stream) {

    }

    @Native
    public MediaStream(Array<MediaStreamTrack> tracks) {

    }

    /**
     * Read only A Boolean value that returns true if the MediaStream is active,
     * or false otherwise.
     */
    public boolean active;

    /**
     * Read only A Boolean value set to true if the end of the stream has been
     * reached. This has been removed from the specification; you should instead
     * check the value of MediaStreamTrack.readyState to see if its value is
     * "ended" for the track or tracks you want to ensure have finished playing.
     */
    public boolean ended;
    /**
     * Read only A DOMString containing 36 characters denoting a universally
     * unique identifier (UUID) for the object.
     */
    public String id;

    /**
     * Stores a copy of the MediaStreamTrack given as argument. If the track has
     * already been added to the MediaStream object, nothing happens.
     */
    public void addTrack() {
    }

    /**
     * Returns a clone of the MediaStream object. The clone will, however, have
     * a unique value for id.
     */
    public MediaStream clone() {
        return null;
    }

    /**
     * Returns a list of the MediaStreamTrack objects stored in the MediaStream
     * object that have their kind attribute set to "audio". The order is not
     * defined, and may not only vary from one browser to another, but also from
     * one call to another.
     */
    public Array<MediaStreamTrack> getAudioTracks() {
        return null;
    }

    /**
     * Returns the track whose ID corresponds to the one given in parameters,
     * trackid. If no parameter is given, or if no track with that ID does
     * exist, it returns null. If several tracks have the same ID, it returns
     * the first one.
     */
    public MediaStreamTrack getTrackById() {
        return null;
    }

    /**
     * Returns a list of all MediaStreamTrack objects stored in the MediaStream
     * object, regardless of the value of the kind attribute. The order is not
     * defined, and may not only vary from one browser to another, but also from
     * one call to another.
     */
    public Array<MediaStreamTrack> getTracks() {
        return null;
    }

    /**
     * Returns a list of the MediaStreamTrack objects stored in the MediaStream
     * object that have their kind attribute set to "video". The order is not
     * defined, and may not only vary from one browser to another, but also from
     * one call to another.
     */
    public Array<MediaStreamTrack> getVideoTracks() {
        return null;
    }

    /**
     * Removes the MediaStreamTrack given as argument. If the track is not part
     * of the MediaStream object, nothing happens.
     */
    public void removeTrack() {
    }
}
