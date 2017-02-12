package org.stjs.javascript.worker;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge
public class ErrorEvent extends DOMEvent {
    @Native
    public ErrorEvent(String type) {
    }

    @SyntheticType
    public static class ErrorEventInit {
        public String message;
        public String filename;
        public long lineno;
        public long colno;
        public Object error;
    }

    @Native
    public ErrorEvent(String type, ErrorEventInit init) {
    }

    /**
     * Is a DOMString containing a human-readable error message describing the
     * problem.
     */
    public String message;
    /**
     * Is a DOMString containing the name of the script file in which the error
     * occurred.
     */
    public String filename;
    /**
     * Is an integer containing the line number of the script file on which the
     * error occurred.
     */
    public Integer lineno;
    /**
     * Is an integer containing the column number of the script file on which
     * the error occurred.
     */
    public Integer colno;

    /** Is a JavaScript Object that is concerned by the event. */
    public Object error;

}
