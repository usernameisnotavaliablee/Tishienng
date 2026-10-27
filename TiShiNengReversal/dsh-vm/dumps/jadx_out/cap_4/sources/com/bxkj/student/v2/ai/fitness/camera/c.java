package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {

    /* renamed from: m, reason: collision with root package name */
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int f1305m = 0;

    /* renamed from: n, reason: collision with root package name */
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int f1306n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f1307o = 17;

    /* renamed from: p, reason: collision with root package name */
    public static final int f1308p = 480;

    /* renamed from: q, reason: collision with root package name */
    public static final int f1309q = 360;

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.String f1310r = "MIDemoApp:CameraSource";

    /* renamed from: s, reason: collision with root package name */
    private static final int f1311s = 100;

    /* renamed from: t, reason: collision with root package name */
    private static final float f1312t = 0.01f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f1313u = 30.0f;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f1314v = true;
    protected android.app.Activity a;
    private android.hardware.Camera b;
    private int c;
    private int d;
    private com.google.android.gms.common.images.Size e;
    private android.graphics.SurfaceTexture f;
    private final com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay g;
    private java.lang.Thread h;
    private final com.bxkj.student.v2.ai.fitness.camera.c.b i;
    private final java.lang.Object j;
    private com.bxkj.student.v2.ai.fitness.camera.m k;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> f1315l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements android.hardware.Camera.PreviewCallback {
        final /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.c a;

        private a(com.bxkj.student.v2.ai.fitness.camera.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.bxkj.student.v2.ai.fitness.camera.c r1, com.bxkj.student.v2.ai.fitness.camera.d r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] r2, android.hardware.Camera r3) {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.c r0 = r1.a
                com.bxkj.student.v2.ai.fitness.camera.c$b r0 = com.bxkj.student.v2.ai.fitness.camera.c.f(r0)
                r0.b(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.lang.Runnable {
        private final java.lang.Object a;
        private boolean b;
        private java.nio.ByteBuffer c;
        final /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.c d;

        b(com.bxkj.student.v2.ai.fitness.camera.c r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.a = r1
                r1 = 1
                r0.b = r1
                return
        }

        void a(boolean r2) {
                r1 = this;
                java.lang.Object r0 = r1.a
                monitor-enter(r0)
                r1.b = r2     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> Lc
                r2.notifyAll()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }

        void b(byte[] r3, android.hardware.Camera r4) {
                r2 = this;
                java.lang.Object r0 = r2.a
                monitor-enter(r0)
                java.nio.ByteBuffer r1 = r2.c     // Catch: java.lang.Throwable -> L12
                if (r1 == 0) goto L14
                byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L12
                r4.addCallbackBuffer(r1)     // Catch: java.lang.Throwable -> L12
                r4 = 0
                r2.c = r4     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r3 = move-exception
                goto L37
            L14:
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r2.d     // Catch: java.lang.Throwable -> L12
                java.util.IdentityHashMap r4 = com.bxkj.student.v2.ai.fitness.camera.c.a(r4)     // Catch: java.lang.Throwable -> L12
                boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L12
                if (r4 != 0) goto L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L22:
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r2.d     // Catch: java.lang.Throwable -> L12
                java.util.IdentityHashMap r4 = com.bxkj.student.v2.ai.fitness.camera.c.a(r4)     // Catch: java.lang.Throwable -> L12
                java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L12
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Throwable -> L12
                r2.c = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r3 = r2.a     // Catch: java.lang.Throwable -> L12
                r3.notifyAll()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L37:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r3
        }

        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"InlinedApi"})
        public void run() {
                r5 = this;
            L0:
                java.lang.Object r0 = r5.a
                monitor-enter(r0)
            L3:
                boolean r1 = r5.b     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto L16
                java.nio.ByteBuffer r2 = r5.c     // Catch: java.lang.Throwable -> L11
                if (r2 != 0) goto L16
                java.lang.Object r1 = r5.a     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L14
                r1.wait()     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L14
                goto L3
            L11:
                r1 = move-exception
                goto L95
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                goto L19
            L16:
                if (r1 != 0) goto L1a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            L19:
                return
            L1a:
                java.nio.ByteBuffer r1 = r5.c     // Catch: java.lang.Throwable -> L11
                r2 = 0
                r5.c = r2     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.d     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L86
                java.lang.Object r0 = com.bxkj.student.v2.ai.fitness.camera.c.g(r0)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L86
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L86
                com.bxkj.student.v2.ai.fitness.camera.c r2 = r5.d     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.m r2 = com.bxkj.student.v2.ai.fitness.camera.c.c(r2)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.f$a r3 = new com.bxkj.student.v2.ai.fitness.camera.f$a     // Catch: java.lang.Throwable -> L74
                r3.<init>()     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r5.d     // Catch: java.lang.Throwable -> L74
                com.google.android.gms.common.images.Size r4 = com.bxkj.student.v2.ai.fitness.camera.c.e(r4)     // Catch: java.lang.Throwable -> L74
                int r4 = r4.getWidth()     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.f$a r3 = r3.d(r4)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r5.d     // Catch: java.lang.Throwable -> L74
                com.google.android.gms.common.images.Size r4 = com.bxkj.student.v2.ai.fitness.camera.c.e(r4)     // Catch: java.lang.Throwable -> L74
                int r4 = r4.getHeight()     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.f$a r3 = r3.b(r4)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r5.d     // Catch: java.lang.Throwable -> L74
                int r4 = com.bxkj.student.v2.ai.fitness.camera.c.h(r4)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.f$a r3 = r3.c(r4)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.f r3 = r3.a()     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.c r4 = r5.d     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r4 = com.bxkj.student.v2.ai.fitness.camera.c.d(r4)     // Catch: java.lang.Throwable -> L74
                r2.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L74
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
                com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.d
                android.hardware.Camera r0 = com.bxkj.student.v2.ai.fitness.camera.c.b(r0)
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L0
            L74:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
                throw r2     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L86
            L77:
                r0 = move-exception
                com.bxkj.student.v2.ai.fitness.camera.c r2 = r5.d
                android.hardware.Camera r2 = com.bxkj.student.v2.ai.fitness.camera.c.b(r2)
                byte[] r1 = r1.array()
                r2.addCallbackBuffer(r1)
                throw r0
            L86:
                com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.d
                android.hardware.Camera r0 = com.bxkj.student.v2.ai.fitness.camera.c.b(r0)
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L0
            L95:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.v2.ai.fitness.camera.c$c, reason: collision with other inner class name */
    public static class C0141c {
        public final com.google.android.gms.common.images.Size a;

        @androidx.annotation.Nullable
        public final com.google.android.gms.common.images.Size b;

        C0141c(android.hardware.Camera.Size r3, @androidx.annotation.Nullable android.hardware.Camera.Size r4) {
                r2 = this;
                r2.<init>()
                com.google.android.gms.common.images.Size r0 = new com.google.android.gms.common.images.Size
                int r1 = r3.width
                int r3 = r3.height
                r0.<init>(r1, r3)
                r2.a = r0
                if (r4 == 0) goto L1a
                com.google.android.gms.common.images.Size r3 = new com.google.android.gms.common.images.Size
                int r0 = r4.width
                int r4 = r4.height
                r3.<init>(r0, r4)
                goto L1b
            L1a:
                r3 = 0
            L1b:
                r2.b = r3
                return
        }

        public C0141c(com.google.android.gms.common.images.Size r1, @androidx.annotation.Nullable com.google.android.gms.common.images.Size r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    public c(android.app.Activity r2, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.j = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.f1315l = r0
            r1.a = r2
            r1.g = r3
            r3.h()
            com.bxkj.student.v2.ai.fitness.camera.c$b r2 = new com.bxkj.student.v2.ai.fitness.camera.c$b
            r2.<init>(r1)
            r1.i = r2
            return
    }

    static /* bridge */ /* synthetic */ java.util.IdentityHashMap a(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r0 = r0.f1315l
            return r0
    }

    static /* bridge */ /* synthetic */ android.hardware.Camera b(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            android.hardware.Camera r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.m c(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            com.bxkj.student.v2.ai.fitness.camera.m r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay d(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r0.g
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.images.Size e(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            com.google.android.gms.common.images.Size r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.c.b f(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            com.bxkj.student.v2.ai.fitness.camera.c$b r0 = r0.i
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object g(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            java.lang.Object r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ int h(com.bxkj.student.v2.ai.fitness.camera.c r0) {
            int r0 = r0.d
            return r0
    }

    private void i() {
            r1 = this;
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.g
            r0.h()
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private android.hardware.Camera j() throws java.io.IOException {
            r6 = this;
            int r0 = r6.c
            int r0 = n(r0)
            r1 = -1
            if (r0 == r1) goto Lb6
            android.hardware.Camera r1 = android.hardware.Camera.open(r0)
            android.app.Activity r2 = r6.a
            com.bxkj.student.v2.ai.fitness.camera.c$c r2 = com.bxkj.student.v2.ai.fitness.preference.a.a(r2, r0)
            if (r2 != 0) goto L1d
            r2 = 480(0x1e0, float:6.73E-43)
            r3 = 360(0x168, float:5.04E-43)
            com.bxkj.student.v2.ai.fitness.camera.c$c r2 = r(r1, r2, r3)
        L1d:
            if (r2 == 0) goto Lae
            com.google.android.gms.common.images.Size r3 = r2.a
            r6.e = r3
            com.google.android.gms.common.images.Size r3 = r6.e
            java.util.Objects.toString(r3)
            r3 = 1106247680(0x41f00000, float:30.0)
            int[] r3 = q(r1, r3)
            if (r3 == 0) goto La6
            android.hardware.Camera$Parameters r4 = r1.getParameters()
            com.google.android.gms.common.images.Size r2 = r2.b
            if (r2 == 0) goto L46
            r2.toString()
            int r5 = r2.getWidth()
            int r2 = r2.getHeight()
            r4.setPictureSize(r5, r2)
        L46:
            com.google.android.gms.common.images.Size r2 = r6.e
            int r2 = r2.getWidth()
            com.google.android.gms.common.images.Size r5 = r6.e
            int r5 = r5.getHeight()
            r4.setPreviewSize(r2, r5)
            r2 = 0
            r2 = r3[r2]
            r5 = 1
            r3 = r3[r5]
            r4.setPreviewFpsRange(r2, r3)
            r2 = 17
            r4.setPreviewFormat(r2)
            r6.u(r1, r4, r0)
            java.util.List r0 = r4.getSupportedFocusModes()
            java.lang.String r2 = "continuous-video"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L75
            r4.setFocusMode(r2)
        L75:
            r1.setParameters(r4)
            com.bxkj.student.v2.ai.fitness.camera.c$a r0 = new com.bxkj.student.v2.ai.fitness.camera.c$a
            r2 = 0
            r0.<init>(r6, r2)
            r1.setPreviewCallbackWithBuffer(r0)
            com.google.android.gms.common.images.Size r0 = r6.e
            byte[] r0 = r6.k(r0)
            r1.addCallbackBuffer(r0)
            com.google.android.gms.common.images.Size r0 = r6.e
            byte[] r0 = r6.k(r0)
            r1.addCallbackBuffer(r0)
            com.google.android.gms.common.images.Size r0 = r6.e
            byte[] r0 = r6.k(r0)
            r1.addCallbackBuffer(r0)
            com.google.android.gms.common.images.Size r0 = r6.e
            byte[] r0 = r6.k(r0)
            r1.addCallbackBuffer(r0)
            return r1
        La6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find suitable preview frames per second range."
            r0.<init>(r1)
            throw r0
        Lae:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find suitable preview size."
            r0.<init>(r1)
            throw r0
        Lb6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find requested camera."
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private byte[] k(com.google.android.gms.common.images.Size r6) {
            r5 = this;
            r0 = 17
            int r0 = android.graphics.ImageFormat.getBitsPerPixel(r0)
            int r1 = r6.getHeight()
            long r1 = (long) r1
            int r6 = r6.getWidth()
            long r3 = (long) r6
            long r1 = r1 * r3
            long r3 = (long) r0
            long r1 = r1 * r3
            double r0 = (double) r1
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            int r6 = r6 + 1
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r6)
            boolean r1 = r0.hasArray()
            if (r1 == 0) goto L38
            byte[] r1 = r0.array()
            if (r1 != r6) goto L38
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r1 = r5.f1315l
            r1.put(r6, r0)
            return r6
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to create valid buffer for camera source."
            r6.<init>(r0)
            throw r6
    }

    public static java.util.List<com.bxkj.student.v2.ai.fitness.camera.c.C0141c> l(android.hardware.Camera r9) {
            android.hardware.Camera$Parameters r9 = r9.getParameters()
            java.util.List r0 = r9.getSupportedPreviewSizes()
            java.util.List r9 = r9.getSupportedPictureSizes()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()
            android.hardware.Camera$Size r3 = (android.hardware.Camera.Size) r3
            int r4 = r3.width
            float r4 = (float) r4
            int r5 = r3.height
            float r5 = (float) r5
            float r4 = r4 / r5
            java.util.Iterator r5 = r9.iterator()
        L2c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L15
            java.lang.Object r6 = r5.next()
            android.hardware.Camera$Size r6 = (android.hardware.Camera.Size) r6
            int r7 = r6.width
            float r7 = (float) r7
            int r8 = r6.height
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            r8 = 1008981770(0x3c23d70a, float:0.01)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L2c
            com.bxkj.student.v2.ai.fitness.camera.c$c r4 = new com.bxkj.student.v2.ai.fitness.camera.c$c
            r4.<init>(r3, r6)
            r1.add(r4)
            goto L15
        L55:
            int r9 = r1.size()
            if (r9 != 0) goto L75
            java.util.Iterator r9 = r0.iterator()
        L5f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r9.next()
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0
            com.bxkj.student.v2.ai.fitness.camera.c$c r2 = new com.bxkj.student.v2.ai.fitness.camera.c$c
            r3 = 0
            r2.<init>(r0, r3)
            r1.add(r2)
            goto L5f
        L75:
            return r1
    }

    private static int n(int r3) {
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            r1 = 0
        L6:
            int r2 = android.hardware.Camera.getNumberOfCameras()
            if (r1 >= r2) goto L17
            android.hardware.Camera.getCameraInfo(r1, r0)
            int r2 = r0.facing
            if (r2 != r3) goto L14
            return r1
        L14:
            int r1 = r1 + 1
            goto L6
        L17:
            r3 = -1
            return r3
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private static int[] q(android.hardware.Camera r6, float r7) {
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            android.hardware.Camera$Parameters r6 = r6.getParameters()
            java.util.List r6 = r6.getSupportedPreviewFpsRange()
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 2147483647(0x7fffffff, float:NaN)
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r6.next()
            int[] r3 = (int[]) r3
            r4 = 1
            r4 = r3[r4]
            int r4 = r7 - r4
            int r4 = java.lang.Math.abs(r4)
            r5 = 0
            r5 = r3[r5]
            if (r4 > r1) goto L18
            if (r5 > r2) goto L18
            r0 = r3
            r1 = r4
            r2 = r5
            goto L18
        L38:
            return r0
    }

    public static com.bxkj.student.v2.ai.fitness.camera.c.C0141c r(android.hardware.Camera r5, int r6, int r7) {
            java.util.List r5 = l(r5)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r5.next()
            com.bxkj.student.v2.ai.fitness.camera.c$c r2 = (com.bxkj.student.v2.ai.fitness.camera.c.C0141c) r2
            com.google.android.gms.common.images.Size r3 = r2.a
            int r4 = r3.getWidth()
            int r4 = r4 - r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3.getHeight()
            int r3 = r3 - r7
            int r3 = java.lang.Math.abs(r3)
            int r4 = r4 + r3
            if (r4 >= r1) goto Lc
            r0 = r2
            r1 = r4
            goto Lc
        L32:
            return r0
    }

    private void u(android.hardware.Camera r5, android.hardware.Camera.Parameters r6, int r7) {
            r4 = this;
            android.app.Activity r0 = r4.a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L25
            r3 = 2
            if (r0 == r3) goto L22
            r3 = 3
            if (r0 == r3) goto L1f
            goto L27
        L1f:
            r2 = 270(0x10e, float:3.78E-43)
            goto L27
        L22:
            r2 = 180(0xb4, float:2.52E-43)
            goto L27
        L25:
            r2 = 90
        L27:
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            android.hardware.Camera.getCameraInfo(r7, r0)
            int r7 = r0.facing
            if (r7 != r1) goto L3f
            int r7 = r0.orientation
            int r7 = r7 + r2
            int r7 = r7 % 360
            r4.d = r7
            int r7 = 360 - r7
            int r7 = r7 % 360
            goto L48
        L3f:
            int r7 = r0.orientation
            int r7 = r7 - r2
            int r7 = r7 + 360
            int r7 = r7 % 360
            r4.d = r7
        L48:
            r5.setDisplayOrientation(r7)
            int r5 = r4.d
            r6.setRotation(r5)
            return
    }

    public int m() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public com.google.android.gms.common.images.Size o() {
            r1 = this;
            com.google.android.gms.common.images.Size r0 = r1.e
            return r0
    }

    public void p() {
            r2 = this;
            java.lang.Object r0 = r2.j
            monitor-enter(r0)
            r2.x()     // Catch: java.lang.Throwable -> L11
            r2.i()     // Catch: java.lang.Throwable -> L11
            com.bxkj.student.v2.ai.fitness.camera.m r1 = r2.k     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r1.stop()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public synchronized void s(int r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L20
            r0 = 1
            if (r4 != r0) goto L7
            goto L20
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Invalid camera: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1e
            r1.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4 = move-exception
            goto L24
        L20:
            r3.c = r4     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public void t(com.bxkj.student.v2.ai.fitness.camera.m r3) {
            r2 = this;
            java.lang.Object r0 = r2.j
            monitor-enter(r0)
            r2.i()     // Catch: java.lang.Throwable -> Le
            com.bxkj.student.v2.ai.fitness.camera.m r1 = r2.k     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.stop()     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L14
        L10:
            r2.k = r3     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public synchronized com.bxkj.student.v2.ai.fitness.camera.c v() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return r2
        L7:
            android.hardware.Camera r0 = r2.j()     // Catch: java.lang.Throwable -> L36
            r2.b = r0     // Catch: java.lang.Throwable -> L36
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture     // Catch: java.lang.Throwable -> L36
            r1 = 100
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            r2.f = r0     // Catch: java.lang.Throwable -> L36
            android.hardware.Camera r1 = r2.b     // Catch: java.lang.Throwable -> L36
            r1.setPreviewTexture(r0)     // Catch: java.lang.Throwable -> L36
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L36
            r0.startPreview()     // Catch: java.lang.Throwable -> L36
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L36
            com.bxkj.student.v2.ai.fitness.camera.c$b r1 = r2.i     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            r2.h = r0     // Catch: java.lang.Throwable -> L36
            com.bxkj.student.v2.ai.fitness.camera.c$b r0 = r2.i     // Catch: java.lang.Throwable -> L36
            r1 = 1
            r0.a(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Thread r0 = r2.h     // Catch: java.lang.Throwable -> L36
            r0.start()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            return r2
        L36:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public synchronized com.bxkj.student.v2.ai.fitness.camera.c w(android.view.SurfaceHolder r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            android.hardware.Camera r0 = r1.b     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r1
        L7:
            android.hardware.Camera r0 = r1.j()     // Catch: java.lang.Throwable -> L2b
            r1.b = r0     // Catch: java.lang.Throwable -> L2b
            r0.setPreviewDisplay(r2)     // Catch: java.lang.Throwable -> L2b
            android.hardware.Camera r2 = r1.b     // Catch: java.lang.Throwable -> L2b
            r2.startPreview()     // Catch: java.lang.Throwable -> L2b
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> L2b
            com.bxkj.student.v2.ai.fitness.camera.c$b r0 = r1.i     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r1.h = r2     // Catch: java.lang.Throwable -> L2b
            com.bxkj.student.v2.ai.fitness.camera.c$b r2 = r1.i     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            r2.a(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Thread r2 = r1.h     // Catch: java.lang.Throwable -> L2b
            r2.start()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            return r1
        L2b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r2
    }

    public synchronized void x() {
            r2 = this;
            monitor-enter(r2)
            com.bxkj.student.v2.ai.fitness.camera.c$b r0 = r2.i     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r0.a(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Thread r0 = r2.h     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r0 == 0) goto L14
            r0.join()     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            goto L12
        L10:
            r0 = move-exception
            goto L3f
        L12:
            r2.h = r1     // Catch: java.lang.Throwable -> L10
        L14:
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L38
            r0.stopPreview()     // Catch: java.lang.Throwable -> L10
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L10
            r0.setPreviewCallbackWithBuffer(r1)     // Catch: java.lang.Throwable -> L10
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L2d
            r0.setPreviewTexture(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L2d
            r2.f = r1     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L2d
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L2d
            r0.setPreviewDisplay(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r0.toString()     // Catch: java.lang.Throwable -> L10
        L31:
            android.hardware.Camera r0 = r2.b     // Catch: java.lang.Throwable -> L10
            r0.release()     // Catch: java.lang.Throwable -> L10
            r2.b = r1     // Catch: java.lang.Throwable -> L10
        L38:
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r0 = r2.f1315l     // Catch: java.lang.Throwable -> L10
            r0.clear()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
