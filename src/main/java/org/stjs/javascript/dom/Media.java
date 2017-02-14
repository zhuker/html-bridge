package org.stjs.javascript.dom;

import org.stjs.javascript.Promise;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.media.TimeRanges;
import org.stjs.javascript.eme.MediaKeys;

/**
 * common parent class for audio and video
 *
 * @author acraciun
 */
@SyntheticType
abstract public class Media extends Element {
    public final static int HAVE_FUTURE_DATA = 3;
    public final static int HAVE_ENOUGH_DATA = 4;
    // audioTracks
    public boolean autoplay;
    public TimeRanges buffered;
    // controller
    public boolean controls;
    public boolean loop;
    public boolean muted;
    public String poster;
    /**
     * use preload=auto
     */
    @Deprecated
    public boolean autobuffer;
    public String preload;
    public String src;

    // crossOrigin
    public String currentSrc;
    public double currentTime;
    public boolean defaultMuted;
    public double defaultPlaybackRate;
    public double duration;
    public boolean ended;
    // error
    public String mediaGroup;
    public int networkState;
    public boolean paused;
    public double playbackRate;
    public TimeRanges played;
    public int readyState;
    public TimeRanges seekable;
    public boolean seeking;
    // startDate
    // textTracks
    // videoTracks
    public double volume;
    public MediaError error;
    public Boolean webkitPreservesPitch;
    public Boolean preservesPitch;
    public Boolean mozPreservesPitch;

    /**
     * Returns a MediaKeys object or null.
     * MediaKeys is a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
     */
    public MediaKeys mediaKeys;

    // addTextTrack()
    public native String canPlayType(String type);

    public native void load();

    public native void play();

    public native void pause();

    /**
     * HTMLMediaElement.setMediaKeys()
     * Returns Promise. Sets the MediaKeys keys to use when decrypting media during playback.
     */
    public native Promise setMediaKeys(MediaKeys mediaKeys);
}
