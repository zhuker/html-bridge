package org.stjs.javascript.dom;

public class MediaError {

    /**
     * The fetching process for the media resource was aborted by the user agent
     * at the user's request.
     */
    public static final int MEDIA_ERR_ABORTED = 1;
    /**
     * A network error of some description caused the user agent to stop
     * fetching the media resource, after the resource was established to be
     * usable.
     */
    public static final int MEDIA_ERR_NETWORK = 2;
    /**
     * An error of some description occurred while decoding the media resource,
     * after the resource was established to be usable.
     */
    public static final int MEDIA_ERR_DECODE = 3;

    /** The media resource indicated by the src attribute was not suitable. */
    public static final int MEDIA_ERR_SRC_NOT_SUPPORTED = 4;

    /** Media is encrypted. Safari. */
    public static final int MEDIA_ERR_ENCRYPTED = 5;

    public int code;

}
