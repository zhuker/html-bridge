package org.stjs.javascript.dom;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.canvas.CanvasRenderingContext2D;

abstract public class Canvas extends Element {
    public int height;
    public int width;

    public native CanvasRenderingContext2D getContext(String type, Map<String, Boolean> contextAttributes);

    public native String toDataURL(String type);
}
