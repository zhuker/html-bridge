package org.stjs.javascript;

import org.stjs.javascript.dom.Node;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;

public class MutationObserver {
    public MutationObserver(Callback2<Array<MutationRecord>, MutationObserver> executor){
        
    };
    
    public native void observe( Node target, MutationObserverInit options );
    public native void disconnect();
    public native Array takeRecords();
}
