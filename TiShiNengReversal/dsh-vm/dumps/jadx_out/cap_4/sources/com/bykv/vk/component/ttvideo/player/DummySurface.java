package com.bykv.vk.component.ttvideo.player;

@android.annotation.TargetApi(17)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class DummySurface extends android.view.Surface {
    private static final java.lang.String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final java.lang.String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final java.lang.String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final com.bykv.vk.component.ttvideo.player.DummySurface.DummySurfaceThread thread;
    private boolean threadReleased;

    /* renamed from: com.bykv.vk.component.ttvideo.player.DummySurface$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class DummySurfaceThread extends android.os.HandlerThread implements android.os.Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture eglSurfaceTexture;
        private android.os.Handler handler;
        private java.lang.Error initError;
        private java.lang.RuntimeException initException;
        private com.bykv.vk.component.ttvideo.player.DummySurface surface;

        public DummySurfaceThread() {
                r1 = this;
                java.lang.String r0 = "dummySurface"
                r1.<init>(r0)
                return
        }

        private void initInternal(int r4) {
                r3 = this;
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r0 = r3.eglSurfaceTexture
                r0.getClass()
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r0 = r3.eglSurfaceTexture
                r0.init(r4)
                com.bykv.vk.component.ttvideo.player.DummySurface r0 = new com.bykv.vk.component.ttvideo.player.DummySurface
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r1 = r3.eglSurfaceTexture
                android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()
                if (r4 == 0) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                r2 = 0
                r0.<init>(r3, r1, r4, r2)
                r3.surface = r0
                return
        }

        private void releaseInternal() {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r0 = r1.eglSurfaceTexture
                r0.getClass()
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r0 = r1.eglSurfaceTexture
                r0.release()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L1f
                r4 = 2
                if (r0 == r4) goto L9
                return r1
            L9:
                r3.releaseInternal()     // Catch: java.lang.Throwable -> L10
            Lc:
                r3.quit()
                goto L19
            L10:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to release dummy surface"
                com.bytedance.sdk.component.utils.vl.cw(r0, r2, r4)     // Catch: java.lang.Throwable -> L1a
                goto Lc
            L19:
                return r1
            L1a:
                r4 = move-exception
                r3.quit()
                throw r4
            L1f:
                int r4 = r4.arg1     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f java.lang.RuntimeException -> L31
                r3.initInternal(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f java.lang.RuntimeException -> L31
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                goto L53
            L2a:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                throw r4
            L2d:
                r4 = move-exception
                goto L57
            L2f:
                r4 = move-exception
                goto L33
            L31:
                r4 = move-exception
                goto L45
            L33:
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                com.bytedance.sdk.component.utils.vl.cw(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.initError = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L42
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
                goto L53
            L42:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
                throw r4
            L45:
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                com.bytedance.sdk.component.utils.vl.cw(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.initException = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L54
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            L53:
                return r1
            L54:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
                throw r4
            L57:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L5d
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
                throw r4
            L5d:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
                throw r4
        }

        public com.bykv.vk.component.ttvideo.player.DummySurface init(int r4) {
                r3 = this;
                r3.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = r3.getLooper()
                r0.<init>(r1, r3)
                r3.handler = r0
                com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture r0 = new com.bykv.vk.component.ttvideo.player.EGLSurfaceTexture
                android.os.Handler r1 = r3.handler
                r0.<init>(r1)
                r3.eglSurfaceTexture = r0
                monitor-enter(r3)
                android.os.Handler r0 = r3.handler     // Catch: java.lang.Throwable -> L33
                r1 = 1
                r2 = 0
                android.os.Message r4 = r0.obtainMessage(r1, r4, r2)     // Catch: java.lang.Throwable -> L33
                r4.sendToTarget()     // Catch: java.lang.Throwable -> L33
            L23:
                com.bykv.vk.component.ttvideo.player.DummySurface r4 = r3.surface     // Catch: java.lang.Throwable -> L33
                if (r4 != 0) goto L37
                java.lang.RuntimeException r4 = r3.initException     // Catch: java.lang.Throwable -> L33
                if (r4 != 0) goto L37
                java.lang.Error r4 = r3.initError     // Catch: java.lang.Throwable -> L33
                if (r4 != 0) goto L37
                r3.wait()     // Catch: java.lang.Throwable -> L33 java.lang.InterruptedException -> L35
                goto L23
            L33:
                r4 = move-exception
                goto L53
            L35:
                r2 = 1
                goto L23
            L37:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                if (r2 == 0) goto L41
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                r4.interrupt()
            L41:
                java.lang.RuntimeException r4 = r3.initException
                if (r4 != 0) goto L52
                java.lang.Error r4 = r3.initError
                if (r4 != 0) goto L51
                com.bykv.vk.component.ttvideo.player.DummySurface r4 = r3.surface
                r4.getClass()
                com.bykv.vk.component.ttvideo.player.DummySurface r4 = r3.surface
                return r4
            L51:
                throw r4
            L52:
                throw r4
            L53:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                throw r4
        }

        public void release() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                r0.getClass()
                android.os.Handler r0 = r2.handler
                r1 = 2
                r0.sendEmptyMessage(r1)
                return
        }
    }

    private DummySurface(com.bykv.vk.component.ttvideo.player.DummySurface.DummySurfaceThread r1, android.graphics.SurfaceTexture r2, boolean r3) {
            r0 = this;
            r0.<init>(r2)
            r0.thread = r1
            r0.secure = r3
            return
    }

    /* synthetic */ DummySurface(com.bykv.vk.component.ttvideo.player.DummySurface.DummySurfaceThread r1, android.graphics.SurfaceTexture r2, boolean r3, com.bykv.vk.component.ttvideo.player.DummySurface.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static void assertApiLevel17OrHigher() {
            return
    }

    @android.annotation.TargetApi(24)
    private static int getSecureModeV24(android.content.Context r2) {
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            r1 = 0
            if (r2 >= r0) goto L1c
            java.lang.String r2 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1b
            java.lang.String r2 = "XT1650"
            java.lang.String r0 = android.os.Build.MODEL
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.eglGetDisplay(r1)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r2 = android.opengl.EGL14.eglQueryString(r2, r0)
            if (r2 != 0) goto L29
            return r1
        L29:
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L32
            return r1
        L32:
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L3c
            r2 = 1
            return r2
        L3c:
            r2 = 2
            return r2
    }

    public static synchronized boolean isSecureSupported(android.content.Context r5) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.DummySurface> r0 = com.bykv.vk.component.ttvideo.player.DummySurface.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.player.DummySurface.secureModeInitialized     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1a
            r4 = 24
            if (r1 >= r4) goto L11
            r5 = 0
            goto L15
        L11:
            int r5 = getSecureModeV24(r5)     // Catch: java.lang.Throwable -> L1a
        L15:
            com.bykv.vk.component.ttvideo.player.DummySurface.secureMode = r5     // Catch: java.lang.Throwable -> L1a
            com.bykv.vk.component.ttvideo.player.DummySurface.secureModeInitialized = r2     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L23
        L1c:
            int r5 = com.bykv.vk.component.ttvideo.player.DummySurface.secureMode     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r3
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
    }

    public static com.bykv.vk.component.ttvideo.player.DummySurface newInstanceV17(boolean r1) {
            assertApiLevel17OrHigher()
            com.bykv.vk.component.ttvideo.player.DummySurface$DummySurfaceThread r0 = new com.bykv.vk.component.ttvideo.player.DummySurface$DummySurfaceThread
            r0.<init>()
            if (r1 == 0) goto Ld
            int r1 = com.bykv.vk.component.ttvideo.player.DummySurface.secureMode
            goto Le
        Ld:
            r1 = 0
        Le:
            com.bykv.vk.component.ttvideo.player.DummySurface r1 = r0.init(r1)
            return r1
    }

    @Override // android.view.Surface
    public void release() {
            r2 = this;
            super.release()
            com.bykv.vk.component.ttvideo.player.DummySurface$DummySurfaceThread r0 = r2.thread
            monitor-enter(r0)
            boolean r1 = r2.threadReleased     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.component.ttvideo.player.DummySurface$DummySurfaceThread r1 = r2.thread     // Catch: java.lang.Throwable -> L13
            r1.release()     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r2.threadReleased = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
