package org.stjs.javascript.worker;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.functions.Callback1;

public final class Worker<T> implements EventTarget {
	public Callback1<MessageEvent<T>> onmessage;
	public Callback1<ErrorEvent> onerror;

	public Worker(String s) {
		//
	}

	public native void postMessage  (T message);

    /**
     * 
     * @param message
     *            The object to deliver to the worker; this will be in the data
     *            field in the event delivered to the
     *            DedicatedWorkerGlobalScope.onmessage handler. This may be any
     *            value or JavaScript object handled by the structured clone
     *            algorithm, which includes cyclical references.
     * @param transferList
     *            An optional array of Transferable objects to transfer
     *            ownership of. If the ownership of an object is transferred, it
     *            becomes unusable (neutered) in the context it was sent from
     *            and becomes available only to the worker it was sent to.
     *            Transferable objects are instances of classes like
     *            ArrayBuffer, MessagePort or ImageBitmap objects can be
     *            transferred. null is not an acceptable value for the
     *            transferList.
     */
	public native void postMessage  (T message, Array<?> transferList);

	public native void terminate  ();

    @Override
    @Native
    public void addEventListener(String type, Callback1<? extends DOMEvent> listener) {
    }

    @Override
    @Native
    public void addEventListener(String type, Callback1<? extends DOMEvent> listener, boolean useCapture) {
    }

    @Override
    @Native
    public void removeEventListener(String type, Callback1<? extends DOMEvent> listener) {
    }

    @Override
    @Native
    public void removeEventListener(String type, Callback1<? extends DOMEvent> listener, boolean useCapture) {
    }

    @Override
    @Native
    public boolean dispatchEvent(DOMEvent event) {
        throw new RuntimeException("TODO EventTarget.dispatchEvent");
    }
}
