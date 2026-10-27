package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j0 {
    private com.huawei.hms.scankit.p.e0 a;
    private com.huawei.hms.scankit.p.j0.d b;
    private com.huawei.hms.scankit.p.j0.b c;
    private android.hardware.Camera.PreviewCallback d;
    private java.lang.ref.WeakReference<android.content.Context> e;
    private com.huawei.hms.scankit.p.i0 f;
    private com.huawei.hms.scankit.p.h0 g;
    private com.huawei.hms.scankit.p.n0 h;
    private com.huawei.hms.scankit.p.l0 i;
    private android.hardware.Camera j;
    private com.huawei.hms.scankit.p.f0 k;
    private java.lang.String l;
    private com.huawei.hms.scankit.p.j0.c m;
    private int n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(android.graphics.Point r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum c extends java.lang.Enum<com.huawei.hms.scankit.p.j0.c> {
        public static final com.huawei.hms.scankit.p.j0.c b = null;
        public static final com.huawei.hms.scankit.p.j0.c c = null;
        public static final com.huawei.hms.scankit.p.j0.c d = null;
        public static final com.huawei.hms.scankit.p.j0.c e = null;
        public static final com.huawei.hms.scankit.p.j0.c f = null;
        private static final /* synthetic */ com.huawei.hms.scankit.p.j0.c[] g = null;
        private final int a;

        static {
                com.huawei.hms.scankit.p.j0$c r0 = new com.huawei.hms.scankit.p.j0$c
                java.lang.String r1 = "CAMERA_CLOSED"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.huawei.hms.scankit.p.j0.c.b = r0
                com.huawei.hms.scankit.p.j0$c r1 = new com.huawei.hms.scankit.p.j0$c
                java.lang.String r4 = "CAMERA_OPENED"
                r5 = 2
                r1.<init>(r4, r3, r5)
                com.huawei.hms.scankit.p.j0.c.c = r1
                com.huawei.hms.scankit.p.j0$c r4 = new com.huawei.hms.scankit.p.j0$c
                java.lang.String r6 = "CAMERA_INITIALED"
                r7 = 3
                r4.<init>(r6, r5, r7)
                com.huawei.hms.scankit.p.j0.c.d = r4
                com.huawei.hms.scankit.p.j0$c r6 = new com.huawei.hms.scankit.p.j0$c
                java.lang.String r8 = "PREVIEW_STARTED"
                r9 = 4
                r6.<init>(r8, r7, r9)
                com.huawei.hms.scankit.p.j0.c.e = r6
                com.huawei.hms.scankit.p.j0$c r8 = new com.huawei.hms.scankit.p.j0$c
                java.lang.String r10 = "PREVIEW_STOPPED"
                r11 = 5
                r8.<init>(r10, r9, r11)
                com.huawei.hms.scankit.p.j0.c.f = r8
                com.huawei.hms.scankit.p.j0$c[] r10 = new com.huawei.hms.scankit.p.j0.c[r11]
                r10[r2] = r0
                r10[r3] = r1
                r10[r5] = r4
                r10[r7] = r6
                r10[r9] = r8
                com.huawei.hms.scankit.p.j0.c.g = r10
                return
        }

        c(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        public static com.huawei.hms.scankit.p.j0.c valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.scankit.p.j0$c> r0 = com.huawei.hms.scankit.p.j0.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.scankit.p.j0$c r1 = (com.huawei.hms.scankit.p.j0.c) r1
                return r1
        }

        public static com.huawei.hms.scankit.p.j0.c[] values() {
                com.huawei.hms.scankit.p.j0$c[] r0 = com.huawei.hms.scankit.p.j0.c.g
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.scankit.p.j0$c[] r0 = (com.huawei.hms.scankit.p.j0.c[]) r0
                return r0
        }

        public int a() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a();

        void b();

        void c();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a(byte[] r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class f implements android.hardware.Camera.PreviewCallback {
        private f() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ f(com.huawei.hms.scankit.p.j0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] r1, android.hardware.Camera r2) {
                r0 = this;
                return
        }
    }

    public j0(android.content.Context r2, com.huawei.hms.scankit.p.e0 r3) {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.b
            r1.m = r0
            r0 = -1
            r1.n = r0
            if (r2 == 0) goto L3a
            if (r3 == 0) goto L3a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.e = r0
            r1.a = r3
            java.lang.String r2 = r3.f()
            r1.l = r2
            com.huawei.hms.scankit.p.f0 r2 = new com.huawei.hms.scankit.p.f0
            r2.<init>()
            r1.k = r2
            com.huawei.hms.scankit.p.h0 r2 = new com.huawei.hms.scankit.p.h0
            r2.<init>()
            r1.g = r2
            com.huawei.hms.scankit.p.n0 r2 = new com.huawei.hms.scankit.p.n0
            r2.<init>()
            r1.h = r2
            com.huawei.hms.scankit.p.l0 r2 = new com.huawei.hms.scankit.p.l0
            r2.<init>()
            r1.i = r2
            return
        L3a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "CameraManager constructor param invalid"
            r2.<init>(r3)
            throw r2
    }

    private int a(int r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L7
            r1 = 1
            if (r6 == r1) goto L7
            return r0
        L7:
            int r1 = android.hardware.Camera.getNumberOfCameras()     // Catch: java.lang.Throwable -> L1e
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.Throwable -> L1e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
        L11:
            if (r3 >= r1) goto L1e
            android.hardware.Camera.getCameraInfo(r3, r2)     // Catch: java.lang.Throwable -> L1e
            int r4 = r2.facing     // Catch: java.lang.Throwable -> L1e
            if (r4 != r6) goto L1b
            return r3
        L1b:
            int r3 = r3 + 1
            goto L11
        L1e:
            return r0
    }

    public synchronized void a() {
            r1 = this;
            monitor-enter(r1)
            com.huawei.hms.scankit.p.i0 r0 = r1.f     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r0.e()     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r1.f = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public synchronized void a(android.graphics.Rect r7, boolean r8) {
            r6 = this;
            monitor-enter(r6)
            android.hardware.Camera r0 = r6.j     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            com.huawei.hms.scankit.p.i0 r0 = r6.f     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            com.huawei.hms.scankit.p.i0 r0 = new com.huawei.hms.scankit.p.i0     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r1 = r6.j     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r6.f = r0     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r7 = r0
            goto L3f
        L18:
            com.huawei.hms.scankit.p.i0 r0 = r6.f     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.f0 r1 = r6.k     // Catch: java.lang.Throwable -> L15
            android.graphics.Point r1 = r1.a()     // Catch: java.lang.Throwable -> L15
            int r2 = r1.x     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.f0 r1 = r6.k     // Catch: java.lang.Throwable -> L15
            android.graphics.Point r1 = r1.a()     // Catch: java.lang.Throwable -> L15
            int r3 = r1.y     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.e0 r1 = r6.a     // Catch: java.lang.Throwable -> L15
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            r4 = 1
            if (r1 != r4) goto L37
            r5 = 1
        L34:
            r1 = r7
            r4 = r8
            goto L3a
        L37:
            r4 = 0
            r5 = 0
            goto L34
        L3a:
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)
            return
        L3f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            throw r7
    }

    public synchronized void a(android.view.TextureView r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L60
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L15
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> L15
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L15
            if (r0 == r1) goto L17
            r2.m()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L68
        L17:
            com.huawei.hms.scankit.p.h0 r0 = r2.g     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r1 = r2.j     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.n0 r0 = r2.h     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r1 = r2.j     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.l0 r0 = r2.i     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r1 = r2.j     // Catch: java.lang.Throwable -> L15
            r0.a(r1)     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L37
            android.graphics.SurfaceTexture r3 = r3.getSurfaceTexture()     // Catch: java.lang.Throwable -> L15
            r0.setPreviewTexture(r3)     // Catch: java.lang.Throwable -> L15
        L37:
            com.huawei.hms.scankit.p.f0 r3 = r2.k     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.e0 r1 = r2.a     // Catch: java.lang.Throwable -> L15
            r3.a(r0, r1)     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r3 = r2.j     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L4d
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L15
            int r0 = r0.d()     // Catch: java.lang.Throwable -> L15
            r3.setDisplayOrientation(r0)     // Catch: java.lang.Throwable -> L15
        L4d:
            com.huawei.hms.scankit.p.j0$b r3 = r2.c     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L5a
            com.huawei.hms.scankit.p.f0 r0 = r2.k     // Catch: java.lang.Throwable -> L15
            android.graphics.Point r0 = r0.a()     // Catch: java.lang.Throwable -> L15
            r3.a(r0)     // Catch: java.lang.Throwable -> L15
        L5a:
            com.huawei.hms.scankit.p.j0$c r3 = com.huawei.hms.scankit.p.j0.c.d     // Catch: java.lang.Throwable -> L15
            r2.m = r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L60:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "CameraManager::initCamera SurfaceHolder is null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15
            throw r3     // Catch: java.lang.Throwable -> L15
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public synchronized void a(com.huawei.hms.scankit.p.j0.d r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L9
            r1.b = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = "CameraManager::setCameraStatusListener param invalid"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7
            throw r2     // Catch: java.lang.Throwable -> L7
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized void a(com.huawei.hms.scankit.p.j0.e r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto Le
            com.huawei.hms.scankit.p.f6 r0 = new com.huawei.hms.scankit.p.f6     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r1.d = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            goto L16
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "CameraManager::setFrameCallback param invalid"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public synchronized void a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            if (r0 == 0) goto L39
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            if (r0 != r1) goto L14
            goto L39
        L14:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            if (r0 != 0) goto L28
            java.lang.String r0 = "torch"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            if (r0 != 0) goto L28
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            goto L3b
        L28:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            r0.setFlashMode(r3)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            android.hardware.Camera r1 = r2.j     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            r1.setParameters(r0)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            r2.l = r3     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L3d
            goto L3d
        L39:
            monitor-exit(r2)
            return
        L3b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3
        L3d:
            monitor-exit(r2)
            return
    }

    public synchronized void a(java.util.List<com.huawei.hms.scankit.p.k0.a> r3) {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1b
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1b
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L14
            goto L1d
        L14:
            com.huawei.hms.scankit.p.l0 r0 = r2.i     // Catch: java.lang.Throwable -> L1b
            r0.a(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized com.huawei.hms.scankit.p.g0 b() {
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.j     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L21
            com.huawei.hms.scankit.p.j0$c r0 = r3.m     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1d
            com.huawei.hms.scankit.p.j0$c r2 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L1d
            if (r0 != r2) goto L15
            goto L21
        L15:
            com.huawei.hms.scankit.p.h0 r0 = r3.g     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            com.huawei.hms.scankit.p.g0 r0 = r0.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            monitor-exit(r3)
            return r0
        L1d:
            r0 = move-exception
            goto L23
        L1f:
            monitor-exit(r3)
            return r1
        L21:
            monitor-exit(r3)
            return r1
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public synchronized void b(int r3) {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L22
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L22
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> L22
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r0 < r1) goto L24
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L22
            r0.a(r3)     // Catch: java.lang.Throwable -> L22
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L22 java.lang.Throwable -> L24
            r0.setDisplayOrientation(r3)     // Catch: java.lang.Throwable -> L22 java.lang.Throwable -> L24
            goto L24
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r2)
            return
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    public synchronized com.huawei.hms.scankit.p.k0 c() {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1c
            if (r0 != r1) goto L14
            goto L1e
        L14:
            com.huawei.hms.scankit.p.l0 r0 = r2.i     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.k0 r0 = r0.a()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return r0
        L1c:
            r0 = move-exception
            goto L21
        L1e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    public synchronized void c(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1b
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1b
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L14
            goto L1d
        L14:
            com.huawei.hms.scankit.p.h0 r0 = r2.g     // Catch: java.lang.Throwable -> L1b
            r0.a(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized int d() {
            r1 = this;
            monitor-enter(r1)
            com.huawei.hms.scankit.p.e0 r0 = r1.a     // Catch: java.lang.Throwable -> L9
            int r0 = r0.d()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void d(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1b
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1b
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L14
            goto L1d
        L14:
            com.huawei.hms.scankit.p.n0 r0 = r2.h     // Catch: java.lang.Throwable -> L1b
            r0.a(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized android.graphics.Point e() {
            r1 = this;
            monitor-enter(r1)
            com.huawei.hms.scankit.p.f0 r0 = r1.k     // Catch: java.lang.Throwable -> L9
            android.graphics.Point r0 = r0.a()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized com.huawei.hms.scankit.p.j0.c f() {
            r1 = this;
            monitor-enter(r1)
            com.huawei.hms.scankit.p.j0$c r0 = r1.m     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized com.huawei.hms.scankit.p.m0 g() {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1c
            if (r0 != r1) goto L14
            goto L1e
        L14:
            com.huawei.hms.scankit.p.n0 r0 = r2.h     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.m0 r0 = r0.a()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return r0
        L1c:
            r0 = move-exception
            goto L21
        L1e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    public synchronized java.lang.String h() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.l     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized boolean i() {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L15
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L15
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> L15
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L15
            if (r0 < r1) goto L17
            r0 = 1
            goto L18
        L15:
            r0 = move-exception
            goto L1a
        L17:
            r0 = 0
        L18:
            monitor-exit(r2)
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public synchronized boolean j() {
            r1 = this;
            monitor-enter(r1)
            com.huawei.hms.scankit.p.n0 r0 = r1.h     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void k() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.c = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public synchronized void l() {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.e     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            if (r0 != r1) goto L1c
            r2.a()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r2.q()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r2.m = r0     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            goto L1c
        L1a:
            r0 = move-exception
            goto L5b
        L1c:
            java.lang.String r0 = r2.h()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            java.lang.String r1 = "torch"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            if (r0 == 0) goto L2d
            java.lang.String r0 = "off"
            r2.a(r0)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
        L2d:
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            if (r0 < r1) goto L5d
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r2.m = r0     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            if (r0 == 0) goto L53
            r1 = 0
            r0.setPreviewCallback(r1)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r0.stopPreview()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r0.release()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            r2.j = r1     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
        L53:
            com.huawei.hms.scankit.p.j0$d r0 = r2.b     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            if (r0 == 0) goto L5d
            r0.c()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L5d
            goto L5d
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L5d:
            monitor-exit(r2)
            return
    }

    public synchronized void m() {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> Ld
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.b     // Catch: java.lang.Throwable -> Ld
            if (r0 == r1) goto Lf
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> Ld
            if (r0 == r1) goto Lf
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            goto L3d
        Lf:
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.b()     // Catch: java.lang.Throwable -> Ld
            int r0 = r2.a(r0)     // Catch: java.lang.Throwable -> Ld
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            r2.j = r0     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            goto L24
        L20:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Ld
        L24:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L30
            com.huawei.hms.scankit.p.j0$d r0 = r2.b     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L3b
            r0.b()     // Catch: java.lang.Throwable -> Ld
            goto L3b
        L30:
            com.huawei.hms.scankit.p.j0$d r0 = r2.b     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L37
            r0.a()     // Catch: java.lang.Throwable -> Ld
        L37:
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> Ld
            r2.m = r0     // Catch: java.lang.Throwable -> Ld
        L3b:
            monitor-exit(r2)
            return
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public synchronized void n() {
            r3 = this;
            monitor-enter(r3)
            com.huawei.hms.scankit.p.j0$c r0 = r3.m     // Catch: java.lang.Throwable -> L27
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L27
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.c     // Catch: java.lang.Throwable -> L27
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L27
            if (r0 >= r1) goto L11
            monitor-exit(r3)
            return
        L11:
            com.huawei.hms.scankit.p.e0 r0 = r3.a     // Catch: java.lang.Throwable -> L27
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            android.hardware.Camera r0 = r3.j     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            com.huawei.hms.scankit.p.j0$f r1 = new com.huawei.hms.scankit.p.j0$f     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            r0.setPreviewCallback(r1)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r3)
            return
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public synchronized void o() {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            if (r0 != r1) goto L1e
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> L1c
            if (r0 != r1) goto L12
            monitor-exit(r2)
            return
        L12:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L4a
            android.hardware.Camera$PreviewCallback r1 = r2.d     // Catch: java.lang.Throwable -> L1c
            r0.setOneShotPreviewCallback(r1)     // Catch: java.lang.Throwable -> L1c
            goto L4a
        L1c:
            r0 = move-exception
            goto L4c
        L1e:
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L30
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> L1c
            if (r0 != r1) goto L4a
            r2.p()     // Catch: java.lang.Throwable -> L1c
            goto L4a
        L30:
            com.huawei.hms.scankit.p.e0 r0 = r2.a     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L1c
            r1 = 2
            if (r0 != r1) goto L4a
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> L1c
            if (r0 != r1) goto L41
            monitor-exit(r2)
            return
        L41:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L4a
            android.hardware.Camera$PreviewCallback r1 = r2.d     // Catch: java.lang.Throwable -> L1c
            r0.setPreviewCallback(r1)     // Catch: java.lang.Throwable -> L1c
        L4a:
            monitor-exit(r2)
            return
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    public synchronized void p() {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.d     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            if (r0 >= r1) goto L11
            monitor-exit(r2)
            return
        L11:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            if (r0 == 0) goto L20
            r0.startPreview()     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.e     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            r2.m = r0     // Catch: java.lang.Throwable -> L1d java.lang.RuntimeException -> L20
            goto L20
        L1d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            monitor-exit(r2)
            return
    }

    public synchronized void q() {
            r2 = this;
            monitor-enter(r2)
            com.huawei.hms.scankit.p.j0$c r0 = r2.m     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            int r0 = r0.a()     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            com.huawei.hms.scankit.p.j0$c r1 = com.huawei.hms.scankit.p.j0.c.e     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            if (r0 >= r1) goto L11
            monitor-exit(r2)
            return
        L11:
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            if (r0 == 0) goto L26
            r1 = 0
            r0.setPreviewCallback(r1)     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            android.hardware.Camera r0 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            r0.stopPreview()     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            com.huawei.hms.scankit.p.j0$c r0 = com.huawei.hms.scankit.p.j0.c.f     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            r2.m = r0     // Catch: java.lang.Throwable -> L23 java.lang.RuntimeException -> L26
            goto L26
        L23:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r0
        L26:
            monitor-exit(r2)
            return
    }
}
