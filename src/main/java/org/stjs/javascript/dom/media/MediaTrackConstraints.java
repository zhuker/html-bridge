package org.stjs.javascript.dom.media;

public class MediaTrackConstraints {
    //Properties of all media tracks

    /**
     * A ConstrainDOMString object specifying a device ID or an array of device
     * IDs which are acceptable and/or required.
     */
    public String deviceId;
    /**
     * A ConstrainDOMString object specifying a group ID or an array of group
     * IDs which are acceptable and/or required.
     */
    public String groupId;

    //Properties of audio tracks

    /**
     * A ConstrainLong specifying the channel count or range of channel counts
     * which are acceptable and/or required.
     */
    public long channelCount;
    /**
     * A ConstrainBoolean object specifying whether or not echo cancellation is
     * required or preferred and/or required.
     */
    public boolean echoCancellation;
    /**
     * A ConstrainDouble specifying the latency or range of latencies which are
     * acceptable and/or required.
     */
    public double latency;
    /**
     * A ConstrainLong specifying the sample rate or range of sample rates which
     * are acceptable and/or required.
     */
    public long sampleRate;
    /**
     * A ConstrainLong specifying the sample size or range of sample sizes which
     * are acceptable and/or required.
     */
    public long sampleSize;
    /**
     * A ConstrainDouble specifying the volume or range of volumes which are
     * acceptable and/or required.
     */
    public double volume;

    //Properties of video tracks
    /**
     * A ConstrainDouble specifying the video aspect ratio or range of aspect
     * ratios which are acceptable and/or required.
     */
    public double aspectRatio;
    /**
     * A ConstrainDOMString object specifying a facing or an array of facings
     * which are acceptable and/or required.
     */
    public String facingMode;
    /**
     * A ConstrainDouble specifying the frame rate or range of frame rates which
     * are acceptable and/or required.
     */
    public double frameRate;
    /**
     * A ConstrainLong specifying the video height or range of heights which are
     * acceptable and/or required.
     */
    public long height;
    /**
     * A ConstrainLong specifying the video width or range of widths which are
     * acceptable and/or required.
     */
    public long width;
}
