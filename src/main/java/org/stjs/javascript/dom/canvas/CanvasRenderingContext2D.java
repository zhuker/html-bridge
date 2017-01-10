package org.stjs.javascript.dom.canvas;

import org.stjs.javascript.Array;
import org.stjs.javascript.dom.Canvas;
import org.stjs.javascript.dom.Image;

public final class CanvasRenderingContext2D {

	public static GLenum TEXTURE_CUBE_MAP_NEGATIVE_Z;
	public static GLenum TEXTURE_CUBE_MAP_POSITIVE_Z;
	public static GLenum TEXTURE_CUBE_MAP_NEGATIVE_Y;
	public static GLenum TEXTURE_CUBE_MAP_POSITIVE_Y;
	public static GLenum TEXTURE_CUBE_MAP_NEGATIVE_X;
	public static GLenum UNSIGNED_BYTE;
	public static GLint RGB;
	public static GLenum TEXTURE_CUBE_MAP_POSITIVE_X;
	public static GLenum TEXTURE_WRAP_S;
	public static GLenum CLAMP_TO_EDGE;
	public static GLenum TEXTURE_WRAP_T;
	public static GLenum TEXTURE_MAG_FILTER;
	public static GLenum NEAREST;
	public static GLenum TEXTURE_MIN_FILTER;
    public static WebGLTexture TEXTURE_CUBE_MAP;
	public static GLenum ONE_MINUS_SRC_ALPHA;
	public static GLenum DEPTH_TEST;
	public static GLenum SRC_ALPHA;
	
	public Canvas canvas;

	public Object fillStyle;

	public String font;

	public double globalAlpha;

	public String globalCompositeOperation;

	public String lineCap;

	public int lineDashOffset;

	public String lineJoin;

	public double lineWidth;

	public double miterLimit;

	public String msFillRule;

	// public boolean msImageSmoothingEnabled;

	public double shadowBlur;

	public String shadowColor;

	public int shadowOffsetX;

	public int shadowOffsetY;

	public Object strokeStyle;

	public String textAlign;

	public String textBaseline;
	public int drawingBufferWidth;
	public int drawingBufferHeight;

	public native void arc(int x, int y, double radius, double startAngle, double endAngle, boolean anticlockwise);

	public native void arcTo(int x1, int y1, int x2, int y2, double radius);

	public native void beginPath();

	public native void bezierCurveTo(int cp1x, int cp1y, int cp2x, int cp2y, int x, int y);

	public native void clearRect(int x, int y, int w, int h);

	public native void clip();

	public native void clip(String fillRule);

	public native void closePath();

	public native CanvasImageData createImageData(int width, int height);

	public native CanvasGradient createLinearGradient(int x0, int y0, int x1, int y1);

	public native CanvasPattern createPattern(Object image, String repetition);

	public native CanvasGradient createRadialGradient(int x0, int y0, double r0, int x1, int y1, double r1);

	public native void drawImage(Object image, int dx, int dy);

	public native void drawImage(Object image, int sx, int sy, int dx, int dy);

	public native void drawImage(Object image, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh);

	public native void fill();

	public native void fill(String fillRule);

	public native void fillRect(int x, int y, int w, int h);

	public native void fillText(String text, double x, double y, double maxWidth);

	public native CanvasImageData getImageData(int sx, int sy, int sw, int sh);

	public native void getLineDash(Array<Integer> dashList);

	public native boolean isPointInPath(int x, int y, String fillRule);

	public native boolean isPointInPath(int x, int y);

	public native void lineTo(double x, double y);

	public native CanvasTextMetrics measureText(String text);

	public native void moveTo(double x, double y);

	public native void putImageData(CanvasImageData imagedata, int dx, int dy, int dirtyX, int dirtyY, int dirtyWidth,
			int dirtyHeight);

	public native void putImageData(CanvasImageData imagedata, int dx, int dy);

	public native void quadraticCurveTo(int cp1x, int cp1y, int x, int y);

	public native void rect(int x, int y, int w, int h);

	public native void restore();

	public native void rotate(double angle);

	public native void save();

	public native void scale(double x, double y);

	public native void setLineDash(Array<Integer> dashList);

	public native void setTransform(double m11, double m12, double m21, double m22, double dx, double dy);

	public native void stroke();

	public native void strokeRect(int x, int y, int w, int h);

	public native void strokeText(String text, int x, int y, int maxWidth);

	public native void transform(double m11, double m12, double m21, double m22, double dx, double dy);

	public native void translate(double x, double y);

	public native void viewport(int x, int y, int width, int heigth);

	public native Object getExtension(String name);

	public native void clearColor(double x, double y, double w, double h);

	public native void enable(GLenum depthTest);

	public native void blendFunc(GLenum srcAlpha, GLenum oneMinusSrcAlpha);

	public native WebGLTexture createTexture();

	public native void bindTexture(WebGLTexture textureMap, WebGLTexture texture);

	public native void texParameteri(WebGLTexture textureCubeMap, GLenum textureMinFilter, GLenum nearest);

	public native void texImage2D(GLenum textureCubeMapPositiveX, int i, GLint rgb, GLint rgb1, GLenum unsignedByte, Image image);
}
