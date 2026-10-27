package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final java.lang.String a = "EglUtils";

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.TargetApi(14)
    private static int a() {
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            r1 = r0
            javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1
            java.lang.Object r0 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r2 = r1.eglGetDisplay(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r1.eglInitialize(r2, r0)
            r0 = 7
            int[] r3 = new int[r0]
            r3 = {x0062: FILL_ARRAY_DATA , data: [12351, 12430, 12329, 0, 12339, 1, 12344} // fill-array
            r0 = 1
            javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r0]
            int[] r6 = new int[r0]
            r5 = 1
            r1.eglChooseConfig(r2, r3, r4, r5, r6)
            r3 = 0
            r5 = r6[r3]
            if (r5 != 0) goto L28
            return r3
        L28:
            r4 = r4[r3]
            r5 = 12375(0x3057, float:1.7341E-41)
            r6 = 12374(0x3056, float:1.734E-41)
            r7 = 64
            r8 = 12344(0x3038, float:1.7298E-41)
            int[] r5 = new int[]{r5, r7, r6, r7, r8}
            javax.microedition.khronos.egl.EGLSurface r5 = r1.eglCreatePbufferSurface(r2, r4, r5)
            r6 = 12440(0x3098, float:1.7432E-41)
            int[] r6 = new int[]{r6, r0, r8}
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r4 = r1.eglCreateContext(r2, r4, r7, r6)
            r1.eglMakeCurrent(r2, r5, r5, r4)
            int[] r0 = new int[r0]
            r6 = 3379(0xd33, float:4.735E-42)
            android.opengl.GLES10.glGetIntegerv(r6, r0, r3)
            javax.microedition.khronos.egl.EGLSurface r6 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            r1.eglMakeCurrent(r2, r6, r6, r7)
            r1.eglDestroySurface(r2, r5)
            r1.eglDestroyContext(r2, r4)
            r1.eglTerminate(r2)
            r0 = r0[r3]
            return r0
    }

    @android.annotation.TargetApi(17)
    private static int b() {
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r9 = 2
            int[] r2 = new int[r9]
            r10 = 1
            android.opengl.EGL14.eglInitialize(r1, r2, r0, r2, r10)
            r2 = 9
            int[] r2 = new int[r2]
            r2 = {x005e: FILL_ARRAY_DATA , data: [12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344} // fill-array
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r10]
            int[] r7 = new int[r10]
            r6 = 1
            r8 = 0
            r3 = 0
            r5 = 0
            android.opengl.EGL14.eglChooseConfig(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = r7[r0]
            if (r2 != 0) goto L23
            return r0
        L23:
            r2 = r4[r0]
            r3 = 12375(0x3057, float:1.7341E-41)
            r4 = 12374(0x3056, float:1.734E-41)
            r5 = 64
            r6 = 12344(0x3038, float:1.7298E-41)
            int[] r3 = new int[]{r3, r5, r4, r5, r6}
            android.opengl.EGLSurface r3 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r2, r3, r0)
            r4 = 12440(0x3098, float:1.7432E-41)
            int[] r4 = new int[]{r4, r9, r6}
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglCreateContext(r1, r2, r5, r4, r0)
            android.opengl.EGL14.eglMakeCurrent(r1, r3, r3, r2)
            int[] r4 = new int[r10]
            r5 = 3379(0xd33, float:4.735E-42)
            android.opengl.GLES20.glGetIntegerv(r5, r4, r0)
            android.opengl.EGLSurface r5 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r6 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r1, r5, r5, r6)
            android.opengl.EGL14.eglDestroySurface(r1, r3)
            android.opengl.EGL14.eglDestroyContext(r1, r2)
            android.opengl.EGL14.eglTerminate(r1)
            r0 = r4[r0]
            return r0
    }

    public static int c() {
            int r0 = b()     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }
}
