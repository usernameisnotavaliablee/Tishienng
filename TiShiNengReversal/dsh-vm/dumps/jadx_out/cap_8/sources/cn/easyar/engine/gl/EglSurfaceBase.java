package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EglSurfaceBase {
    protected static final java.lang.String TAG = "easyar.GlUtil";
    private android.opengl.EGLSurface mEGLSurface;
    protected cn.easyar.engine.gl.EglCore mEglCore;
    private int mHeight;
    private int mWidth;

    protected EglSurfaceBase(cn.easyar.engine.gl.EglCore r2) {
            r1 = this;
            r1.<init>()
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r1.mEGLSurface = r0
            r0 = -1
            r1.mWidth = r0
            r1.mHeight = r0
            r1.mEglCore = r2
            return
    }

    public void createOffscreenSurface(int r3, int r4) {
            r2 = this;
            android.opengl.EGLSurface r0 = r2.mEGLSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L13
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r0 = r0.createOffscreenSurface(r3, r4)
            r2.mEGLSurface = r0
            r2.mWidth = r3
            r2.mHeight = r4
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "surface already created"
            r3.<init>(r4)
            throw r3
    }

    public void createWindowSurface(java.lang.Object r3) {
            r2 = this;
            android.opengl.EGLSurface r0 = r2.mEGLSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto Lf
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r3 = r0.createWindowSurface(r3)
            r2.mEGLSurface = r3
            return
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "surface already created"
            r3.<init>(r0)
            throw r3
    }

    public int getHeight() {
            r3 = this;
            int r0 = r3.mHeight
            if (r0 >= 0) goto Le
            cn.easyar.engine.gl.EglCore r0 = r3.mEglCore
            android.opengl.EGLSurface r1 = r3.mEGLSurface
            r2 = 12374(0x3056, float:1.734E-41)
            int r0 = r0.querySurface(r1, r2)
        Le:
            return r0
    }

    public int getWidth() {
            r3 = this;
            int r0 = r3.mWidth
            if (r0 >= 0) goto Le
            cn.easyar.engine.gl.EglCore r0 = r3.mEglCore
            android.opengl.EGLSurface r1 = r3.mEGLSurface
            r2 = 12375(0x3057, float:1.7341E-41)
            int r0 = r0.querySurface(r1, r2)
        Le:
            return r0
    }

    public void makeCurrent() {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            r0.makeCurrent(r1)
            return
    }

    public void makeCurrentReadFrom(android.opengl.EGLSurface r3) {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            r0.makeCurrent(r1, r3)
            return
    }

    public void makeCurrentReadFrom(cn.easyar.engine.gl.EglSurfaceBase r3) {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            android.opengl.EGLSurface r3 = r3.mEGLSurface
            r0.makeCurrent(r1, r3)
            return
    }

    public void releaseEglSurface() {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            r0.releaseSurface(r1)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r2.mEGLSurface = r0
            r0 = -1
            r2.mHeight = r0
            r2.mWidth = r0
            return
    }

    public void saveFrame(java.io.File r8) throws java.io.IOException {
            r7 = this;
            cn.easyar.engine.gl.EglCore r0 = r7.mEglCore
            android.opengl.EGLSurface r1 = r7.mEGLSurface
            boolean r0 = r0.isCurrent(r1)
            if (r0 == 0) goto L62
            java.lang.String r8 = r8.toString()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r0 = r2 * r3
            int r0 = r0 * 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r0)
            r4 = 6408(0x1908, float:8.98E-42)
            r5 = 5121(0x1401, float:7.176E-42)
            r0 = 0
            r1 = 0
            android.opengl.GLES20.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "glReadPixels"
            cn.easyar.engine.gl.GlUtil.checkGlError(r0)
            r6.rewind()
            r1 = 0
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L5a
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L56
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r2, r3, r8)     // Catch: java.lang.Throwable -> L56
            r8.copyPixelsFromBuffer(r6)     // Catch: java.lang.Throwable -> L56
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L56
            r1 = 90
            r8.compress(r0, r1, r4)     // Catch: java.lang.Throwable -> L56
            r8.recycle()     // Catch: java.lang.Throwable -> L56
            r4.close()
            return
        L56:
            r0 = move-exception
            r8 = r0
            r1 = r4
            goto L5c
        L5a:
            r0 = move-exception
            r8 = r0
        L5c:
            if (r1 == 0) goto L61
            r1.close()
        L61:
            throw r8
        L62:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Expected EGL context/surface is not current"
            r8.<init>(r0)
            throw r8
    }

    public void setPresentationTime(long r3) {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            r0.setPresentationTime(r1, r3)
            return
    }

    public boolean swapBuffers() {
            r2 = this;
            cn.easyar.engine.gl.EglCore r0 = r2.mEglCore
            android.opengl.EGLSurface r1 = r2.mEGLSurface
            boolean r0 = r0.swapBuffers(r1)
            return r0
    }
}
