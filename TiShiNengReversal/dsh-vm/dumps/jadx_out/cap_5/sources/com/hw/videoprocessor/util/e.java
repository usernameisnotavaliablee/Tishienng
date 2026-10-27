package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static final boolean e = false;
    private static final int f = 12610;
    private static final int g = 4;
    private android.opengl.EGLDisplay a;
    private android.opengl.EGLContext b;
    private android.opengl.EGLSurface c;
    private android.view.Surface d;

    public e(android.view.Surface r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.d = r1
            r0.b()
            return
    }

    private void a(java.lang.String r3) {
            r2 = this;
            r3 = 0
        L1:
            int r0 = android.opengl.EGL14.eglGetError()
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 == r1) goto Lb
            r3 = 1
            goto L1
        Lb:
            if (r3 != 0) goto Le
            return
        Le:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "EGL error encountered (see log)"
            r3.<init>(r0)
            throw r3
    }

    private void b() {
            r13 = this;
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r13.a = r1
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r1 == r2) goto L86
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            boolean r1 = android.opengl.EGL14.eglInitialize(r1, r3, r0, r3, r4)
            if (r1 == 0) goto L7b
            r1 = 11
            int[] r6 = new int[r1]
            r6 = {x008e: FILL_ARRAY_DATA , data: [12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344} // fill-array
            r10 = 1
            android.opengl.EGLConfig[] r8 = new android.opengl.EGLConfig[r10]
            int[] r11 = new int[r4]
            android.opengl.EGLDisplay r5 = r13.a
            r9 = 0
            r12 = 0
            r7 = 0
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 == 0) goto L73
            r1 = 12440(0x3098, float:1.7432E-41)
            r3 = 12344(0x3038, float:1.7298E-41)
            int[] r1 = new int[]{r1, r2, r3}
            android.opengl.EGLDisplay r2 = r13.a
            r4 = r8[r0]
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r1 = android.opengl.EGL14.eglCreateContext(r2, r4, r5, r1, r0)
            r13.b = r1
            java.lang.String r1 = "eglCreateContext"
            r13.a(r1)
            android.opengl.EGLContext r1 = r13.b
            if (r1 == 0) goto L6b
            int[] r1 = new int[]{r3}
            android.opengl.EGLDisplay r2 = r13.a
            r3 = r8[r0]
            android.view.Surface r4 = r13.d
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r2, r3, r4, r1, r0)
            r13.c = r0
            java.lang.String r0 = "eglCreateWindowSurface"
            r13.a(r0)
            android.opengl.EGLSurface r0 = r13.c
            if (r0 == 0) goto L63
            return
        L63:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "surface was null"
            r0.<init>(r1)
            throw r0
        L6b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "null context"
            r0.<init>(r1)
            throw r0
        L73:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unable to find RGB888+recordable ES2 EGL config"
            r0.<init>(r1)
            throw r0
        L7b:
            r0 = 0
            r13.a = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unable to initialize EGL14"
            r0.<init>(r1)
            throw r0
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unable to get EGL14 display"
            r0.<init>(r1)
            throw r0
    }

    public android.view.Surface c() {
            r1 = this;
            android.view.Surface r0 = r1.d
            return r0
    }

    public void d() {
            r3 = this;
            android.opengl.EGLDisplay r0 = r3.a
            android.opengl.EGLSurface r1 = r3.c
            android.opengl.EGLContext r2 = r3.b
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "eglMakeCurrent failed"
            r0.<init>(r1)
            throw r0
    }

    public void e() {
            r3 = this;
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            android.opengl.EGLDisplay r0 = r3.a
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2)
        L15:
            android.opengl.EGLDisplay r0 = r3.a
            android.opengl.EGLSurface r1 = r3.c
            android.opengl.EGL14.eglDestroySurface(r0, r1)
            android.opengl.EGLDisplay r0 = r3.a
            android.opengl.EGLContext r1 = r3.b
            android.opengl.EGL14.eglDestroyContext(r0, r1)
            android.view.Surface r0 = r3.d
            r0.release()
            r0 = 0
            r3.a = r0
            r3.b = r0
            r3.c = r0
            r3.d = r0
            return
    }

    public void f(long r3) {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.a
            android.opengl.EGLSurface r1 = r2.c
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r3)
            return
    }

    public boolean g() {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.a
            android.opengl.EGLSurface r1 = r2.c
            boolean r0 = android.opengl.EGL14.eglSwapBuffers(r0, r1)
            return r0
    }
}
