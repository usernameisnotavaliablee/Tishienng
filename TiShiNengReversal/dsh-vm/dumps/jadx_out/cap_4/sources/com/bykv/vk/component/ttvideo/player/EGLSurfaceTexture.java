package com.bykv.vk.component.ttvideo.player;

@android.annotation.TargetApi(17)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class EGLSurfaceTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = null;
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
    private android.opengl.EGLContext context;
    private android.opengl.EGLDisplay display;
    private final android.os.Handler handler;
    private android.opengl.EGLSurface surface;
    private android.graphics.SurfaceTexture texture;
    private final int[] textureIdHolder;

    /* renamed from: com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public static final class GlException extends java.lang.RuntimeException {
        private GlException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ GlException(java.lang.String r1, com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    static {
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12344} // fill-array
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture.EGL_CONFIG_ATTRIBUTES = r0
            return
    }

    public EGLSurfaceTexture(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            r1 = 1
            int[] r1 = new int[r1]
            r0.textureIdHolder = r1
            return
    }

    private static android.opengl.EGLConfig chooseEGLConfig(android.opengl.EGLDisplay r9) {
            r0 = 1
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r0]
            int[] r7 = new int[r0]
            int[] r2 = com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture.EGL_CONFIG_ATTRIBUTES
            r6 = 1
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            boolean r9 = android.opengl.EGL14.eglChooseConfig(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            if (r9 == 0) goto L1c
            r2 = r7[r1]
            if (r2 <= 0) goto L1c
            r2 = r4[r1]
            if (r2 == 0) goto L1c
            return r2
        L1c:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r2 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r5 = r7[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4 = r4[r1]
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r9
            r6[r0] = r5
            r9 = 2
            r6[r9] = r4
            java.lang.String r9 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"
            java.lang.String r9 = java.lang.String.format(r3, r9, r6)
            r0 = 0
            r2.<init>(r9, r0)
            throw r2
    }

    private static android.opengl.EGLContext createEGLContext(android.opengl.EGLDisplay r6, android.opengl.EGLConfig r7, int r8) {
            r0 = 12344(0x3038, float:1.7298E-41)
            r1 = 12440(0x3098, float:1.7432E-41)
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 2
            if (r8 != 0) goto L13
            int[] r8 = new int[r2]
            r8[r4] = r1
            r8[r3] = r5
            r8[r5] = r0
            goto L23
        L13:
            r8 = 5
            int[] r8 = new int[r8]
            r8[r4] = r1
            r8[r3] = r5
            r1 = 12992(0x32c0, float:1.8206E-41)
            r8[r5] = r1
            r8[r2] = r3
            r1 = 4
            r8[r1] = r0
        L23:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r6 = android.opengl.EGL14.eglCreateContext(r6, r7, r0, r8, r4)
            if (r6 == 0) goto L2c
            return r6
        L2c:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r6 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.String r7 = "eglCreateContext failed"
            r8 = 0
            r6.<init>(r7, r8)
            throw r6
    }

    private static android.opengl.EGLSurface createEGLSurface(android.opengl.EGLDisplay r10, android.opengl.EGLConfig r11, android.opengl.EGLContext r12, int r13) {
            r0 = 0
            r1 = 1
            if (r13 != r1) goto L7
            android.opengl.EGLSurface r11 = android.opengl.EGL14.EGL_NO_SURFACE
            goto L3b
        L7:
            r2 = 12344(0x3038, float:1.7298E-41)
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 12374(0x3056, float:1.734E-41)
            r7 = 12375(0x3057, float:1.7341E-41)
            r8 = 0
            r9 = 2
            if (r13 != r9) goto L29
            r13 = 7
            int[] r13 = new int[r13]
            r13[r8] = r7
            r13[r1] = r1
            r13[r9] = r6
            r13[r5] = r1
            r5 = 12992(0x32c0, float:1.8206E-41)
            r13[r4] = r5
            r13[r3] = r1
            r1 = 6
            r13[r1] = r2
            goto L35
        L29:
            int[] r13 = new int[r3]
            r13[r8] = r7
            r13[r1] = r1
            r13[r9] = r6
            r13[r5] = r1
            r13[r4] = r2
        L35:
            android.opengl.EGLSurface r11 = android.opengl.EGL14.eglCreatePbufferSurface(r10, r11, r13, r8)
            if (r11 == 0) goto L4a
        L3b:
            boolean r10 = android.opengl.EGL14.eglMakeCurrent(r10, r11, r11, r12)
            if (r10 == 0) goto L42
            return r11
        L42:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r10 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.String r11 = "eglMakeCurrent failed"
            r10.<init>(r11, r0)
            throw r10
        L4a:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r10 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.String r11 = "eglCreatePbufferSurface failed"
            r10.<init>(r11, r0)
            throw r10
    }

    private static void generateTextureIds(int[] r3) {
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r3, r1)
            int r3 = android.opengl.GLES20.glGetError()
            if (r3 != 0) goto Lc
            return
        Lc:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r0 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "glGenTextures failed. Error: "
            r1.<init>(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            r0.<init>(r3, r1)
            throw r0
    }

    private static android.opengl.EGLDisplay getDefaultDisplay() {
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r2 = 0
            if (r1 == 0) goto L1b
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r1, r3, r0, r3, r4)
            if (r0 == 0) goto L13
            return r1
        L13:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r0 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.String r1 = "eglInitialize failed"
            r0.<init>(r1, r2)
            throw r0
        L1b:
            com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException r0 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture$GlException
            java.lang.String r1 = "eglGetDisplay failed"
            r0.<init>(r1, r2)
            throw r0
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.texture
            r0.getClass()
            android.graphics.SurfaceTexture r0 = r1.texture
            return r0
    }

    public void init(int r4) {
            r3 = this;
            android.opengl.EGLDisplay r0 = getDefaultDisplay()
            r3.display = r0
            android.opengl.EGLConfig r0 = chooseEGLConfig(r0)
            android.opengl.EGLDisplay r1 = r3.display
            android.opengl.EGLContext r1 = createEGLContext(r1, r0, r4)
            r3.context = r1
            android.opengl.EGLDisplay r2 = r3.display
            android.opengl.EGLSurface r4 = createEGLSurface(r2, r0, r1, r4)
            r3.surface = r4
            int[] r4 = r3.textureIdHolder
            generateTextureIds(r4)
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            int[] r0 = r3.textureIdHolder
            r1 = 0
            r0 = r0[r1]
            r4.<init>(r0)
            r3.texture = r4
            r4.setOnFrameAvailableListener(r3)
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture r1) {
            r0 = this;
            android.os.Handler r1 = r0.handler
            r1.post(r0)
            return
    }

    public void release() {
            r5 = this;
            android.os.Handler r0 = r5.handler
            r0.removeCallbacks(r5)
            r0 = 0
            android.graphics.SurfaceTexture r1 = r5.texture     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            r1.release()     // Catch: java.lang.Throwable -> L15
            int[] r1 = r5.textureIdHolder     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r3 = 1
            android.opengl.GLES20.glDeleteTextures(r3, r1, r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L54
        L17:
            android.opengl.EGLDisplay r1 = r5.display
            if (r1 == 0) goto L2c
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2c
            android.opengl.EGLDisplay r1 = r5.display
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r3 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r1, r2, r2, r3)
        L2c:
            android.opengl.EGLSurface r1 = r5.surface
            if (r1 == 0) goto L3f
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            android.opengl.EGLDisplay r1 = r5.display
            android.opengl.EGLSurface r2 = r5.surface
            android.opengl.EGL14.eglDestroySurface(r1, r2)
        L3f:
            android.opengl.EGLContext r1 = r5.context
            if (r1 == 0) goto L48
            android.opengl.EGLDisplay r2 = r5.display
            android.opengl.EGL14.eglDestroyContext(r2, r1)
        L48:
            android.opengl.EGL14.eglReleaseThread()
            r5.display = r0
            r5.context = r0
            r5.surface = r0
            r5.texture = r0
            return
        L54:
            android.opengl.EGLDisplay r2 = r5.display
            if (r2 == 0) goto L69
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L69
            android.opengl.EGLDisplay r2 = r5.display
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r4 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4)
        L69:
            android.opengl.EGLSurface r2 = r5.surface
            if (r2 == 0) goto L7c
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7c
            android.opengl.EGLDisplay r2 = r5.display
            android.opengl.EGLSurface r3 = r5.surface
            android.opengl.EGL14.eglDestroySurface(r2, r3)
        L7c:
            android.opengl.EGLContext r2 = r5.context
            if (r2 == 0) goto L85
            android.opengl.EGLDisplay r3 = r5.display
            android.opengl.EGL14.eglDestroyContext(r3, r2)
        L85:
            android.opengl.EGL14.eglReleaseThread()
            r5.display = r0
            r5.context = r0
            r5.surface = r0
            r5.texture = r0
            throw r1
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.texture
            if (r0 == 0) goto L7
            r0.updateTexImage()
        L7:
            return
    }
}
