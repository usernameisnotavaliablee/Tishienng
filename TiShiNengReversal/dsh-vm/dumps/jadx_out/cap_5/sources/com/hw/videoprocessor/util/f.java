package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(16)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final int n = 4;
    private static final int o = 12440;
    private javax.microedition.khronos.egl.EGL10 a;
    private javax.microedition.khronos.egl.EGLDisplay b;
    private javax.microedition.khronos.egl.EGLContext c;
    private javax.microedition.khronos.egl.EGLSurface d;
    private android.graphics.SurfaceTexture e;
    private android.view.Surface f;
    private final java.lang.Object g;
    private boolean h;
    private com.hw.videoprocessor.util.h i;
    private int j;
    private int k;
    private int l;
    private java.nio.ByteBuffer m;

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.g = r0
            r0 = 0
            r1.l = r0
            r1.j()
            return
    }

    public f(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.g = r0
            r0 = 0
            r1.l = r0
            if (r2 <= 0) goto L37
            if (r3 <= 0) goto L37
            r1.j = r2
            r1.k = r3
            r1.l = r4
            int r4 = r2 * r3
            int r4 = r4 * 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            r1.m = r4
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r0)
            r1.e(r2, r3)
            r1.h()
            r1.j()
            return
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    private void c(java.lang.String r2) {
            r1 = this;
            javax.microedition.khronos.egl.EGL10 r2 = r1.a
            int r2 = r2.eglGetError()
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r2 != r0) goto Lb
            return
        Lb:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "EGL error encountered (see log)"
            r2.<init>(r0)
            throw r2
    }

    private void e(int r9, int r10) {
            r8 = this;
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r8.a = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r8.b = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r0 == r1) goto L95
            javax.microedition.khronos.egl.EGL10 r1 = r8.a
            r2 = 0
            boolean r0 = r1.eglInitialize(r0, r2)
            if (r0 == 0) goto L8b
            r0 = 13
            int[] r3 = new int[r0]
            r3 = {x009e: FILL_ARRAY_DATA , data: [12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344} // fill-array
            r5 = 1
            javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r0 = 1
            int[] r6 = new int[r0]
            javax.microedition.khronos.egl.EGL10 r1 = r8.a
            javax.microedition.khronos.egl.EGLDisplay r2 = r8.b
            boolean r0 = r1.eglChooseConfig(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L83
            r0 = 12440(0x3098, float:1.7432E-41)
            r1 = 2
            r2 = 12344(0x3038, float:1.7298E-41)
            int[] r0 = new int[]{r0, r1, r2}
            javax.microedition.khronos.egl.EGL10 r1 = r8.a
            javax.microedition.khronos.egl.EGLDisplay r3 = r8.b
            r5 = 0
            r6 = r4[r5]
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r0 = r1.eglCreateContext(r3, r6, r7, r0)
            r8.c = r0
            java.lang.String r0 = "eglCreateContext"
            r8.c(r0)
            javax.microedition.khronos.egl.EGLContext r0 = r8.c
            if (r0 == 0) goto L7b
            r0 = 12375(0x3057, float:1.7341E-41)
            r1 = 12374(0x3056, float:1.734E-41)
            int[] r9 = new int[]{r0, r9, r1, r10, r2}
            javax.microedition.khronos.egl.EGL10 r10 = r8.a
            javax.microedition.khronos.egl.EGLDisplay r0 = r8.b
            r1 = r4[r5]
            javax.microedition.khronos.egl.EGLSurface r9 = r10.eglCreatePbufferSurface(r0, r1, r9)
            r8.d = r9
            java.lang.String r9 = "eglCreatePbufferSurface"
            r8.c(r9)
            javax.microedition.khronos.egl.EGLSurface r9 = r8.d
            if (r9 == 0) goto L73
            return
        L73:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "surface was null"
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "null context"
            r9.<init>(r10)
            throw r9
        L83:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "unable to find RGB888+pbuffer EGL config"
            r9.<init>(r10)
            throw r9
        L8b:
            r8.b = r2
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "unable to initialize EGL10"
            r9.<init>(r10)
            throw r9
        L95:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "unable to get EGL10 display"
            r9.<init>(r10)
            throw r9
    }

    private void j() {
            r2 = this;
            com.hw.videoprocessor.util.h r0 = new com.hw.videoprocessor.util.h
            int r1 = r2.l
            r0.<init>(r1)
            r2.i = r0
            r0.g()
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            com.hw.videoprocessor.util.h r1 = r2.i
            int r1 = r1.e()
            r0.<init>(r1)
            r2.e = r0
            r0.setOnFrameAvailableListener(r2)
            android.view.Surface r0 = new android.view.Surface
            android.graphics.SurfaceTexture r1 = r2.e
            r0.<init>(r1)
            r2.f = r0
            return
    }

    public void a() {
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
        L3:
            boolean r1 = r4.h     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L24
            java.lang.Object r1 = r4.g     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            boolean r1 = r4.h     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r1 == 0) goto L13
            goto L3
        L13:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.lang.String r2 = "Surface frame wait timed out"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
        L1b:
            r1 = move-exception
            goto L35
        L1d:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L24:
            r1 = 0
            r4.h = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            com.hw.videoprocessor.util.h r0 = r4.i
            java.lang.String r1 = "before updateTexImage"
            r0.b(r1)
            android.graphics.SurfaceTexture r0 = r4.e
            r0.updateTexImage()
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public void b(java.lang.String r2) {
            r1 = this;
            com.hw.videoprocessor.util.h r0 = r1.i
            r0.a(r2)
            return
    }

    public void d(boolean r3) {
            r2 = this;
            com.hw.videoprocessor.util.h r0 = r2.i
            android.graphics.SurfaceTexture r1 = r2.e
            r0.d(r1, r3)
            return
    }

    public java.nio.ByteBuffer f() {
            r8 = this;
            java.nio.ByteBuffer r0 = r8.m
            r0.rewind()
            int r3 = r8.j
            int r4 = r8.k
            r6 = 5121(0x1401, float:7.176E-42)
            java.nio.ByteBuffer r7 = r8.m
            r1 = 0
            r2 = 0
            r5 = 6408(0x1908, float:8.98E-42)
            android.opengl.GLES20.glReadPixels(r1, r2, r3, r4, r5, r6, r7)
            java.nio.ByteBuffer r0 = r8.m
            return r0
    }

    public android.view.Surface g() {
            r1 = this;
            android.view.Surface r0 = r1.f
            return r0
    }

    public void h() {
            r4 = this;
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            if (r0 == 0) goto L20
            java.lang.String r0 = "before makeCurrent"
            r4.c(r0)
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            javax.microedition.khronos.egl.EGLDisplay r1 = r4.b
            javax.microedition.khronos.egl.EGLSurface r2 = r4.d
            javax.microedition.khronos.egl.EGLContext r3 = r4.c
            boolean r0 = r0.eglMakeCurrent(r1, r2, r2, r3)
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "eglMakeCurrent failed"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "not configured for makeCurrent"
            r0.<init>(r1)
            throw r0
    }

    public void i() {
            r4 = this;
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            if (r0 == 0) goto L2d
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
            javax.microedition.khronos.egl.EGLContext r1 = r4.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            javax.microedition.khronos.egl.EGLDisplay r1 = r4.b
            javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r0.eglMakeCurrent(r1, r2, r2, r3)
        L1b:
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            javax.microedition.khronos.egl.EGLDisplay r1 = r4.b
            javax.microedition.khronos.egl.EGLSurface r2 = r4.d
            r0.eglDestroySurface(r1, r2)
            javax.microedition.khronos.egl.EGL10 r0 = r4.a
            javax.microedition.khronos.egl.EGLDisplay r1 = r4.b
            javax.microedition.khronos.egl.EGLContext r2 = r4.c
            r0.eglDestroyContext(r1, r2)
        L2d:
            android.view.Surface r0 = r4.f
            r0.release()
            r0 = 0
            r4.b = r0
            r4.c = r0
            r4.d = r0
            r4.a = r0
            r4.i = r0
            r4.f = r0
            r4.e = r0
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture r3) {
            r2 = this;
            java.lang.Object r3 = r2.g
            monitor-enter(r3)
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            r0 = 1
            r2.h = r0     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r2.g     // Catch: java.lang.Throwable -> L11
            r0.notifyAll()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            goto L1b
        L13:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "mFrameAvailable already set, frame could be dropped"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }
}
