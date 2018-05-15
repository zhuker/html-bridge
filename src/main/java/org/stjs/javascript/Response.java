package org.stjs.javascript;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Response {
	@Native
	public Promise<Object> json(){
		return null;
	}
}
