package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.file.Blob;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;
import org.w3c.dom.DOMError;

public class FileReader {
    public DOMError error;
    public String readyState;
    public java.lang.Object result; //String or ArrayBuffer

    public native void readAsDataURL(File file);

    public Function1<DOMEvent, Boolean> onabort;
    public Function1<DOMEvent, Boolean> onerror;
    public Function1<DOMEvent, Boolean> onload;
    public Function1<DOMEvent, Boolean> onloadstart;
    public Callback1<DOMEvent> onloadend;
    public Function1<DOMEvent, Boolean> onprogress;

    /**
     * Starts reading the contents of the specified Blob, once finished, the
     * result attribute contains an ArrayBuffer representing the file's data.
     */
    @Native
    public void readAsArrayBuffer(Blob blob) {
    }

}
