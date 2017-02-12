package org.stjs.javascript.worker;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge
public class ErrorEvent extends DOMEvent {
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
