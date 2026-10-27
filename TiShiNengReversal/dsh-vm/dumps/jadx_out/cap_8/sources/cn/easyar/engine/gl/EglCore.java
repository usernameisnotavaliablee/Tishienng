package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class EglCore {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private static final java.lang.String TAG = "easyar.GlUtil";
    private android.opengl.EGLConfig mEGLConfig;
    private android.opengl.EGLContext mEGLContext;
    private android.opengl.EGLDisplay mEGLDisplay;
    private int mGlVersion;

    public EglCore() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public EglCore(android.opengl.EGLContext r11, int r12) {
            r10 = this;
            r10.<init>()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r10.mEGLDisplay = r0
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            r10.mEGLContext = r1
            r1 = 0
            r10.mEGLConfig = r1
            r2 = -1
            r10.mGlVersion = r2
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r0 != r2) goto L9b
            if (r11 != 0) goto L19
            android.opengl.EGLContext r11 = android.opengl.EGL14.EGL_NO_CONTEXT
        L19:
            r0 = 0
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.eglGetDisplay(r0)
            r10.mEGLDisplay = r2
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r2 == r3) goto L93
            r3 = 2
            int[] r4 = new int[r3]
            r5 = 1
            boolean r2 = android.opengl.EGL14.eglInitialize(r2, r4, r0, r4, r5)
            if (r2 == 0) goto L89
            r1 = r12 & 2
            r2 = 12344(0x3038, float:1.7298E-41)
            r4 = 12440(0x3098, float:1.7432E-41)
            if (r1 == 0) goto L55
            r1 = 3
            android.opengl.EGLConfig r6 = r10.getConfig(r12, r1)
            if (r6 == 0) goto L55
            int[] r7 = new int[]{r4, r1, r2}
            android.opengl.EGLDisplay r8 = r10.mEGLDisplay
            android.opengl.EGLContext r7 = android.opengl.EGL14.eglCreateContext(r8, r6, r11, r7, r0)
            int r8 = android.opengl.EGL14.eglGetError()
            r9 = 12288(0x3000, float:1.7219E-41)
            if (r8 != r9) goto L55
            r10.mEGLConfig = r6
            r10.mEGLContext = r7
            r10.mGlVersion = r1
        L55:
            android.opengl.EGLContext r1 = r10.mEGLContext
            android.opengl.EGLContext r6 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r1 != r6) goto L7f
            android.opengl.EGLConfig r12 = r10.getConfig(r12, r3)
            if (r12 == 0) goto L77
            int[] r1 = new int[]{r4, r3, r2}
            android.opengl.EGLDisplay r2 = r10.mEGLDisplay
            android.opengl.EGLContext r11 = android.opengl.EGL14.eglCreateContext(r2, r12, r11, r1, r0)
            java.lang.String r1 = "eglCreateContext"
            r10.checkEglError(r1)
            r10.mEGLConfig = r12
            r10.mEGLContext = r11
            r10.mGlVersion = r3
            goto L7f
        L77:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Unable to find a suitable EGLConfig"
            r11.<init>(r12)
            throw r11
        L7f:
            int[] r11 = new int[r5]
            android.opengl.EGLDisplay r12 = r10.mEGLDisplay
            android.opengl.EGLContext r1 = r10.mEGLContext
            android.opengl.EGL14.eglQueryContext(r12, r1, r4, r11, r0)
            return
        L89:
            r10.mEGLDisplay = r1
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "unable to initialize EGL14"
            r11.<init>(r12)
            throw r11
        L93:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "unable to get EGL14 display"
            r11.<init>(r12)
            throw r11
        L9b:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "EGL already set up"
            r11.<init>(r12)
            throw r11
    }

    public EglCore(android.opengl.EGLDisplay r5, android.opengl.EGLSurface r6, int r7) {
            r4 = this;
            r4.<init>()
            android.opengl.EGLDisplay r6 = android.opengl.EGL14.EGL_NO_DISPLAY
            r4.mEGLDisplay = r6
            android.opengl.EGLContext r6 = android.opengl.EGL14.EGL_NO_CONTEXT
            r4.mEGLContext = r6
            r6 = 0
            r4.mEGLConfig = r6
            r6 = -1
            r4.mGlVersion = r6
            r4.mEGLDisplay = r5
            r6 = r7 & 2
            if (r6 == 0) goto L3b
            r6 = 3
            android.opengl.EGLConfig r0 = r4.getConfig(r7, r6)
            if (r0 == 0) goto L3b
            r1 = 12440(0x3098, float:1.7432E-41)
            r2 = 12344(0x3038, float:1.7298E-41)
            int[] r1 = new int[]{r1, r6, r2}
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            r3 = 0
            android.opengl.EGLContext r5 = android.opengl.EGL14.eglCreateContext(r5, r0, r2, r1, r3)
            int r1 = android.opengl.EGL14.eglGetError()
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r1 != r2) goto L3b
            r4.mEGLConfig = r0
            r4.mEGLContext = r5
            r4.mGlVersion = r6
        L3b:
            android.opengl.EGLContext r5 = r4.mEGLContext
            android.opengl.EGLContext r6 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r5 != r6) goto L60
            r5 = 2
            android.opengl.EGLConfig r6 = r4.getConfig(r7, r5)
            if (r6 == 0) goto L58
            android.opengl.EGLContext r7 = android.opengl.EGL14.eglGetCurrentContext()
            r4.mEGLContext = r7
            java.lang.String r7 = "eglCreateContext"
            r4.checkEglError(r7)
            r4.mEGLConfig = r6
            r4.mGlVersion = r5
            return
        L58:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Unable to find a suitable EGLConfig"
            r5.<init>(r6)
            throw r5
        L60:
            return
    }

    private void checkEglError(java.lang.String r4) {
            r3 = this;
            int r0 = android.opengl.EGL14.eglGetError()
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = ": EGL error: 0x"
            r2.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    private android.opengl.EGLConfig getConfig(int r13, int r14) {
            r12 = this;
            r0 = 4
            r1 = 3
            if (r14 < r1) goto L7
            r14 = 68
            goto L8
        L7:
            r14 = 4
        L8:
            r2 = 13
            int[] r4 = new int[r2]
            r2 = 12324(0x3024, float:1.727E-41)
            r11 = 0
            r4[r11] = r2
            r2 = 1
            r3 = 8
            r4[r2] = r3
            r5 = 2
            r6 = 12323(0x3023, float:1.7268E-41)
            r4[r5] = r6
            r4[r1] = r3
            r1 = 12322(0x3022, float:1.7267E-41)
            r4[r0] = r1
            r0 = 5
            r4[r0] = r3
            r0 = 6
            r1 = 12321(0x3021, float:1.7265E-41)
            r4[r0] = r1
            r0 = 7
            r4[r0] = r3
            r0 = 12352(0x3040, float:1.7309E-41)
            r4[r3] = r0
            r0 = 9
            r4[r0] = r14
            r14 = 10
            r0 = 12344(0x3038, float:1.7298E-41)
            r4[r14] = r0
            r1 = 11
            r4[r1] = r11
            r3 = 12
            r4[r3] = r0
            r13 = r13 & r2
            if (r13 == 0) goto L4b
            r13 = 12610(0x3142, float:1.767E-41)
            r4[r14] = r13
            r4[r1] = r2
        L4b:
            r8 = 1
            android.opengl.EGLConfig[] r6 = new android.opengl.EGLConfig[r8]
            int[] r9 = new int[r2]
            android.opengl.EGLDisplay r3 = r12.mEGLDisplay
            r7 = 0
            r10 = 0
            r5 = 0
            boolean r13 = android.opengl.EGL14.eglChooseConfig(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != 0) goto L5d
            r13 = 0
            return r13
        L5d:
            r13 = r6[r11]
            return r13
    }

    public static android.opengl.EGLSurface getCurrentSurface(int r0) {
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglGetCurrentSurface(r0)
            return r0
    }

    public static void logCurrent(java.lang.String r2) {
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.eglGetCurrentDisplay()
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
            r1 = 12377(0x3059, float:1.7344E-41)
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglGetCurrentSurface(r1)
            java.util.Objects.toString(r2)
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r1)
            return
    }

    public android.opengl.EGLSurface createOffscreenSurface(int r4, int r5) {
            r3 = this;
            r0 = 12374(0x3056, float:1.734E-41)
            r1 = 12344(0x3038, float:1.7298E-41)
            r2 = 12375(0x3057, float:1.7341E-41)
            int[] r4 = new int[]{r2, r4, r0, r5, r1}
            android.opengl.EGLDisplay r5 = r3.mEGLDisplay
            android.opengl.EGLConfig r0 = r3.mEGLConfig
            r1 = 0
            android.opengl.EGLSurface r4 = android.opengl.EGL14.eglCreatePbufferSurface(r5, r0, r4, r1)
            java.lang.String r5 = "eglCreatePbufferSurface"
            r3.checkEglError(r5)
            if (r4 == 0) goto L1b
            return r4
        L1b:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "surface was null"
            r4.<init>(r5)
            throw r4
    }

    public android.opengl.EGLSurface createWindowSurface(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 != 0) goto L20
            boolean r0 = r5 instanceof android.graphics.SurfaceTexture
            if (r0 == 0) goto L9
            goto L20
        L9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid surface: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L20:
            r0 = 12344(0x3038, float:1.7298E-41)
            int[] r0 = new int[]{r0}
            android.opengl.EGLDisplay r1 = r4.mEGLDisplay
            android.opengl.EGLConfig r2 = r4.mEGLConfig
            r3 = 0
            android.opengl.EGLSurface r5 = android.opengl.EGL14.eglCreateWindowSurface(r1, r2, r5, r0, r3)
            java.lang.String r0 = "eglCreateWindowSurface"
            r4.checkEglError(r0)
            if (r5 == 0) goto L37
            return r5
        L37:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "surface was null"
            r5.<init>(r0)
            throw r5
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.mEGLDisplay     // Catch: java.lang.Throwable -> La
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch: java.lang.Throwable -> La
            if (r0 == r1) goto Lc
            r2.release()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r0 = move-exception
            goto L10
        Lc:
            super.finalize()
            return
        L10:
            super.finalize()
            throw r0
    }

    public int getGlVersion() {
            r1 = this;
            int r0 = r1.mGlVersion
            return r0
    }

    public boolean isCurrent(android.opengl.EGLSurface r3) {
            r2 = this;
            android.opengl.EGLContext r0 = r2.mEGLContext
            android.opengl.EGLContext r1 = android.opengl.EGL14.eglGetCurrentContext()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = 12377(0x3059, float:1.7344E-41)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglGetCurrentSurface(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public void makeCurrent(android.opengl.EGLSurface r3) {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.mEGLDisplay
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            android.opengl.EGLContext r1 = r2.mEGLContext
            boolean r3 = android.opengl.EGL14.eglMakeCurrent(r0, r3, r3, r1)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "eglMakeCurrent failed"
            r3.<init>(r0)
            throw r3
    }

    public void makeCurrent(android.opengl.EGLSurface r3, android.opengl.EGLSurface r4) {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.mEGLDisplay
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            android.opengl.EGLContext r1 = r2.mEGLContext
            boolean r3 = android.opengl.EGL14.eglMakeCurrent(r0, r3, r4, r1)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "eglMakeCurrent(draw,read) failed"
            r3.<init>(r4)
            throw r3
    }

    public void makeNothingCurrent() {
            r3 = this;
            android.opengl.EGLDisplay r0 = r3.mEGLDisplay
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "eglMakeCurrent failed"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String queryString(int r2) {
            r1 = this;
            android.opengl.EGLDisplay r0 = r1.mEGLDisplay
            java.lang.String r2 = android.opengl.EGL14.eglQueryString(r0, r2)
            return r2
    }

    public int querySurface(android.opengl.EGLSurface r4, int r5) {
            r3 = this;
            r0 = 1
            int[] r0 = new int[r0]
            android.opengl.EGLDisplay r1 = r3.mEGLDisplay
            r2 = 0
            android.opengl.EGL14.eglQuerySurface(r1, r4, r5, r0, r2)
            r4 = r0[r2]
            return r4
    }

    public void release() {
            r3 = this;
            android.opengl.EGLDisplay r0 = r3.mEGLDisplay
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r0 == r1) goto L1c
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r0, r1, r1, r2)
            android.opengl.EGLDisplay r0 = r3.mEGLDisplay
            android.opengl.EGLContext r1 = r3.mEGLContext
            android.opengl.EGL14.eglDestroyContext(r0, r1)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r3.mEGLDisplay
            android.opengl.EGL14.eglTerminate(r0)
        L1c:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r3.mEGLDisplay = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r3.mEGLContext = r0
            r0 = 0
            r3.mEGLConfig = r0
            return
    }

    public void releaseSurface(android.opengl.EGLSurface r2) {
            r1 = this;
            android.opengl.EGLDisplay r0 = r1.mEGLDisplay
            android.opengl.EGL14.eglDestroySurface(r0, r2)
            return
    }

    public void setPresentationTime(android.opengl.EGLSurface r2, long r3) {
            r1 = this;
            android.opengl.EGLDisplay r0 = r1.mEGLDisplay
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r2, r3)
            return
    }

    public boolean swapBuffers(android.opengl.EGLSurface r2) {
            r1 = this;
            android.opengl.EGLDisplay r0 = r1.mEGLDisplay
            boolean r2 = android.opengl.EGL14.eglSwapBuffers(r0, r2)
            return r2
    }
}
