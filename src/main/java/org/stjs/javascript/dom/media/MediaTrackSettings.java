package org.stjs.javascript.dom.media;

public class MediaTrackSettings {
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
     * A long integer value indicating the current value of the channelCount
     * property, specifying the number of audio channels present on the track
     * (therefore indicating how many audio samples exist in each audio frame).
     * This is 1 for mono, 2 for stereo, and so forth.
     */
    public long channelCount;
    /**
     * A Boolean indicating the current value of the echoCancellation property,
     * specifying true if echo cancellation is enabled, otherwise false.
     */
    public boolean echoCancellation;
    /**
     * A double-precision floating point value indicating the current value of
     * the latency property, specifying the audio latency, in seconds. Latency
     * is the amount of time which elapses between the start of processing the
     * audio and the data being available to the next stop in the audio
     * utilization process. This value is a target value; actual latency may
     * vary to some extent for various reasons.
     */
    public double latency;
    /**
     * A long integer value indicating the current value of the sampleRate
     * property, specifying the sample rate in samples per second of the audio
     * data. Standard CD-quality audio, for example, has a sample rate of 41,000
     * samples per second.
     */
    public long sampleRate;
    /**
     * A long integer value indicating the current value of the sampleSize
     * property, specifying the linear size, in bits, of each audio sample.
     * CD-quality audio, for example, is 16-bit, so this value would be 16 in
     * that case.
     */
    public long sampleSize;
    /**
     * A double-precision floating point value indicating the current value of
     * the volume property, specifying the volume level of the track. This value
     * will be between 0.0 (silent) to 1.0 (maximum supported volume).
     */
    public double volume;

    //Properties of video tracks
    /**
     * A double-precision floating point value indicating the current value of
     * the aspectRatio property, specified precisely to 10 decimal places. This
     * is the width of the image in pixels divided by its height in pixels.
     * Common values include 1.3333333333 (for the classic televison 4:3
     * "standard" aspect ratio, also used on tablets such as Apple's iPad),
     * 1.7777777778 (for the 16:9 high-definition widescreen aspect ratio), and
     * 1.6 (for the 16:10 aspect ratio common among widescreen computers and
     * tablets).
     */
    public double aspectRatio;
    /**
     * A DOMString indicating the current value of the facingMode property,
     * specifying the direction the camera is facing. The value will be one of:
     * "user" A camera facing the user (commonly known as a "selfie cam"), used
     * for self-portraiture and video calling. "environment" A camera facing
     * away from the user (when the user is looking at the screen). This is
     * typically the highest quality camera on the device, used for general
     * photography. "left" A camera facing toward the environment to the user's
     * left. "right" A camera facing toward the environment to the user's right.
     */
    public String facingMode;
    /**
     * A double-precision floating point value indicating the current value of
     * the frameRate property, specifying how many frames of video per second
     * the track includes. If the value can't be determined for any reason, the
     * value will match the vertical sync rate of the device the user agent is
     * running on.
     */
    public double frameRate;
    /**
     * A long integer value indicating the current value of the height property,
     * specifying the height of the track's video data in pixels.
     */
    public long height;
    /**
     * A long integer value indicating the current value of the width property,
     * specifying the width of the track's video data in pixels.
     */
    public long width;
}
