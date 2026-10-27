package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public static final java.lang.String H = "b";
    public static volatile com.huawei.hms.scankit.p.v3 I;
    public static volatile com.huawei.hms.scankit.p.w3 J;
    private boolean A;
    private boolean B;
    private boolean C;
    private com.huawei.hms.hmsscankit.api.IOnErrorCallback D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final android.graphics.Rect a;
    private final int b;
    private final boolean c;
    private android.content.Context d;
    private com.huawei.hms.scankit.a e;
    private com.huawei.hms.scankit.p.f5 f;
    private com.huawei.hms.scankit.p.j0 g;
    private com.huawei.hms.scankit.ViewfinderView h;
    public android.view.TextureView i;
    private android.view.TextureView.SurfaceTextureListener j;
    private java.util.Collection<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> k;
    private java.util.Map<com.huawei.hms.scankit.p.l1, ?> l;
    private java.lang.String m;
    private boolean n;
    private java.lang.String o;
    private boolean p;
    private float q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private com.huawei.hms.feature.dynamic.IObjectWrapper x;
    private com.huawei.hms.scankit.p.e5 y;
    private com.huawei.hms.hmsscankit.api.IOnResultCallback z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hms.scankit.b a;

        a(com.huawei.hms.scankit.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.huawei.hms.scankit.b r0 = r1.a
                com.huawei.hms.scankit.p.j0 r0 = com.huawei.hms.scankit.b.a(r0)
                r0.m()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.scankit.b$b, reason: collision with other inner class name */
    class C0004b implements com.huawei.hms.scankit.p.j0.d {
        final /* synthetic */ com.huawei.hms.scankit.b a;

        C0004b(com.huawei.hms.scankit.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void a() {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void b() {
                r2 = this;
                com.huawei.hms.scankit.b r0 = r2.a
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = com.huawei.hms.scankit.b.b(r0)
                if (r0 == 0) goto L1b
                com.huawei.hms.scankit.b r0 = r2.a     // Catch: android.os.RemoteException -> L14
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = com.huawei.hms.scankit.b.b(r0)     // Catch: android.os.RemoteException -> L14
                r1 = -1000(0xfffffffffffffc18, float:NaN)
                r0.onError(r1)     // Catch: android.os.RemoteException -> L14
                return
            L14:
                java.lang.String r0 = com.huawei.hms.scankit.b.H
                java.lang.String r1 = "RemoteException"
                com.huawei.hms.scankit.p.o4.b(r0, r1)
            L1b:
                return
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void c() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.TextureView.SurfaceTextureListener {
        final /* synthetic */ com.huawei.hms.scankit.b a;

        c(com.huawei.hms.scankit.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r3, int r4, int r5) {
                r2 = this;
                com.huawei.hms.scankit.b r4 = r2.a
                r5 = 0
                com.huawei.hms.scankit.b.a(r4, r5)
                if (r3 != 0) goto Lf
                java.lang.String r3 = com.huawei.hms.scankit.b.H
                java.lang.String r4 = "*** WARNING *** surfaceCreated() gave us a null surface!"
                com.huawei.hms.scankit.p.o4.b(r3, r4)
            Lf:
                com.huawei.hms.scankit.b r3 = r2.a
                boolean r3 = com.huawei.hms.scankit.b.c(r3)
                if (r3 != 0) goto L67
                com.huawei.hms.scankit.b r3 = r2.a
                r4 = 1
                com.huawei.hms.scankit.b.b(r3, r4)
                com.huawei.hms.scankit.b r3 = r2.a
                android.content.Context r3 = com.huawei.hms.scankit.b.d(r3)
                int r5 = android.os.Process.myPid()
                int r0 = android.os.Process.myUid()
                java.lang.String r1 = "android.permission.CAMERA"
                int r3 = r3.checkPermission(r1, r5, r0)
                if (r3 != 0) goto L3b
                com.huawei.hms.scankit.b r3 = r2.a
                android.view.TextureView r4 = r3.i
                com.huawei.hms.scankit.b.a(r3, r4)
                return
            L3b:
                com.huawei.hms.scankit.b r3 = r2.a
                boolean r3 = com.huawei.hms.scankit.b.e(r3)
                if (r3 != 0) goto L67
                com.huawei.hms.scankit.b r3 = r2.a
                android.content.Context r3 = com.huawei.hms.scankit.b.d(r3)
                boolean r3 = r3 instanceof android.app.Activity
                if (r3 == 0) goto L67
                int r3 = android.os.Build.VERSION.SDK_INT
                r5 = 23
                if (r3 < r5) goto L67
                com.huawei.hms.scankit.b r3 = r2.a
                com.huawei.hms.scankit.b.a(r3, r4)
                com.huawei.hms.scankit.b r3 = r2.a
                android.content.Context r3 = com.huawei.hms.scankit.b.d(r3)
                android.app.Activity r3 = (android.app.Activity) r3
                java.lang.String[] r5 = new java.lang.String[]{r1}
                com.bytedance.msdk.core.vl.a.a(r3, r5, r4)
            L67:
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r2) {
                r1 = this;
                com.huawei.hms.scankit.b r2 = r1.a
                r0 = 0
                com.huawei.hms.scankit.b.b(r2, r0)
                r2 = 1
                return r2
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.huawei.hms.scankit.p.f5 {
        final /* synthetic */ com.huawei.hms.scankit.b a;

        d(com.huawei.hms.scankit.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.huawei.hms.scankit.p.f5
        public void a(com.huawei.hms.ml.scan.HmsScan[] r1, android.graphics.Bitmap r2, float r3) {
                r0 = this;
                com.huawei.hms.scankit.b r3 = r0.a
                r3.a(r1, r2)
                return
        }
    }

    static {
            return
    }

    public b(android.content.Context r3, android.view.TextureView r4, com.huawei.hms.scankit.ViewfinderView r5, android.graphics.Rect r6, int r7, com.huawei.hms.feature.dynamic.IObjectWrapper r8, boolean r9, java.lang.String r10, boolean r11) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.p = r0
            r2.r = r0
            r1 = 0
            r2.s = r1
            r2.t = r0
            r2.A = r1
            r2.B = r1
            r2.E = r0
            r2.F = r1
            r2.G = r1
            r2.d = r3
            r2.h = r5
            r2.x = r8
            r2.i = r4
            r2.n = r1
            r2.a = r6
            r2.b = r7
            r2.c = r9
            r2.o = r10
            r2.C = r1
            r2.v = r11
            return
    }

    private float a(android.view.MotionEvent r5) {
            r4 = this;
            r0 = 0
            float r1 = r5.getX(r0)
            r2 = 1
            float r3 = r5.getX(r2)
            float r1 = r1 - r3
            float r0 = r5.getY(r0)
            float r5 = r5.getY(r2)
            float r0 = r0 - r5
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            boolean r5 = java.lang.Double.isInfinite(r0)
            if (r5 != 0) goto L34
            boolean r5 = java.lang.Double.isNaN(r0)
            if (r5 == 0) goto L2b
            goto L34
        L2b:
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r0)
            float r5 = r5.floatValue()
            return r5
        L34:
            r5 = 0
            return r5
    }

    private com.huawei.hms.scankit.p.e0 a(android.content.Context r10) {
            r9 = this;
            r0 = r10
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.WindowManager r1 = r0.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            r2 = 90
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1080(0x438, float:1.513E-42)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto Lb2
            if (r1 == r5) goto L8f
            r7 = 2
            if (r1 == r7) goto L6a
            r7 = 3
            if (r1 == r7) goto L45
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r3, r4)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r2)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
            goto Ld4
        L45:
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r3, r4)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            r7 = 180(0xb4, float:2.52E-43)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
            goto Ld4
        L6a:
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r3, r4)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            r7 = 270(0x10e, float:3.78E-43)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
            goto Ld4
        L8f:
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r3, r4)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
            goto Ld4
        Lb2:
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r3, r4)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r2)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
        Ld4:
            boolean r7 = com.huawei.hms.scankit.p.w7.f(r10)
            if (r7 != 0) goto Le6
            boolean r7 = com.huawei.hms.scankit.p.w7.b(r0)
            if (r7 != 0) goto Le6
            boolean r7 = com.huawei.hms.scankit.p.w7.e(r10)
            if (r7 == 0) goto Lf0
        Le6:
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r4, r4)
            r1.a(r7)
            r9.F = r5
        Lf0:
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r8 = "ceres-c3"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L118
            com.huawei.hms.scankit.p.e0$b r1 = new com.huawei.hms.scankit.p.e0$b
            r1.<init>()
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r4, r3)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r7)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0$b r1 = r1.b(r6)
            com.huawei.hms.scankit.p.e0$b r1 = r1.a(r5)
            com.huawei.hms.scankit.p.e0 r1 = r1.a()
        L118:
            boolean r3 = com.huawei.hms.scankit.p.w7.b()
            boolean r7 = com.huawei.hms.scankit.p.w7.e()
            boolean r10 = com.huawei.hms.scankit.p.w7.e(r10)
            if (r10 == 0) goto L128
            if (r3 == 0) goto L130
        L128:
            boolean r10 = com.huawei.hms.scankit.p.w7.b(r0)
            if (r10 == 0) goto L155
            if (r7 != 0) goto L155
        L130:
            com.huawei.hms.scankit.p.e0$b r10 = new com.huawei.hms.scankit.p.e0$b
            r10.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r4, r4)
            com.huawei.hms.scankit.p.e0$b r10 = r10.a(r0)
            com.huawei.hms.scankit.p.e0$b r10 = r10.a(r5)
            com.huawei.hms.scankit.p.e0$b r10 = r10.b(r2)
            com.huawei.hms.scankit.p.e0$b r10 = r10.b(r6)
            com.huawei.hms.scankit.p.e0$b r10 = r10.a(r5)
            com.huawei.hms.scankit.p.e0 r10 = r10.a()
            r9.F = r5
            return r10
        L155:
            return r1
    }

    static /* synthetic */ com.huawei.hms.scankit.p.j0 a(com.huawei.hms.scankit.b r0) {
            com.huawei.hms.scankit.p.j0 r0 = r0.g
            return r0
    }

    private void a(android.view.TextureView r13) {
            r12 = this;
            if (r13 == 0) goto L86
            android.graphics.SurfaceTexture r0 = r13.getSurfaceTexture()
            if (r0 != 0) goto La
            goto L86
        La:
            com.huawei.hms.scankit.p.j0 r0 = r12.g     // Catch: java.lang.Exception -> L71
            r0.a(r13)     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.j0 r13 = r12.g     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.k0$a r0 = new com.huawei.hms.scankit.p.k0$a     // Catch: java.lang.Exception -> L71
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Exception -> L71
            r2 = 150(0x96, float:2.1E-43)
            r3 = -150(0xffffffffffffff6a, float:NaN)
            r1.<init>(r3, r3, r2, r2)     // Catch: java.lang.Exception -> L71
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L71
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L71
            r13.a(r0)     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.j0 r13 = r12.g     // Catch: java.lang.Exception -> L2e
            r13.n()     // Catch: java.lang.Exception -> L2e
            goto L35
        L2e:
            java.lang.String r13 = com.huawei.hms.scankit.b.H     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = "initCamera() get exception"
            com.huawei.hms.scankit.p.o4.b(r13, r0)     // Catch: java.lang.Exception -> L71
        L35:
            com.huawei.hms.scankit.a r13 = r12.e     // Catch: java.lang.Exception -> L71
            if (r13 != 0) goto L85
            com.huawei.hms.scankit.a r0 = new com.huawei.hms.scankit.a     // Catch: java.lang.Exception -> L71
            android.content.Context r1 = r12.d     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.ViewfinderView r2 = r12.h     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.f5 r3 = r12.f     // Catch: java.lang.Exception -> L71
            java.util.Collection<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r4 = r12.k     // Catch: java.lang.Exception -> L71
            java.util.Map<com.huawei.hms.scankit.p.l1, ?> r5 = r12.l     // Catch: java.lang.Exception -> L71
            java.lang.String r6 = r12.m     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.j0 r7 = r12.g     // Catch: java.lang.Exception -> L71
            android.graphics.Rect r8 = r12.a     // Catch: java.lang.Exception -> L71
            int r9 = r12.b     // Catch: java.lang.Exception -> L71
            boolean r10 = r12.v     // Catch: java.lang.Exception -> L71
            boolean r11 = r12.E     // Catch: java.lang.Exception -> L71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L71
            r12.e = r0     // Catch: java.lang.Exception -> L71
            boolean r13 = r12.u     // Catch: java.lang.Exception -> L71
            r0.c(r13)     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.a r13 = r12.e     // Catch: java.lang.Exception -> L71
            boolean r0 = r12.w     // Catch: java.lang.Exception -> L71
            r13.a(r0)     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.a r13 = r12.e     // Catch: java.lang.Exception -> L71
            boolean r0 = r12.r     // Catch: java.lang.Exception -> L71
            r13.b(r0)     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.a r13 = r12.e     // Catch: java.lang.Exception -> L71
            com.huawei.hms.scankit.p.e5 r0 = r12.y     // Catch: java.lang.Exception -> L71
            r13.a(r0)     // Catch: java.lang.Exception -> L71
            goto L85
        L71:
            r0 = move-exception
            r13 = r0
            com.huawei.hms.scankit.p.v3 r0 = com.huawei.hms.scankit.b.I
            if (r0 == 0) goto L7e
            com.huawei.hms.scankit.p.v3 r0 = com.huawei.hms.scankit.b.I
            r1 = -1002(0xfffffffffffffc16, float:NaN)
            r0.c(r1)
        L7e:
            java.lang.String r0 = com.huawei.hms.scankit.b.H
            java.lang.String r1 = "initCamera IOException"
            com.huawei.hms.scankit.p.o4.a(r0, r1, r13)
        L85:
            return
        L86:
            java.lang.String r13 = com.huawei.hms.scankit.b.H
            java.lang.String r0 = "initCamera() no surface view"
            com.huawei.hms.scankit.p.o4.e(r13, r0)
            return
    }

    static /* synthetic */ void a(com.huawei.hms.scankit.b r0, android.view.TextureView r1) {
            r0.a(r1)
            return
    }

    private void a(boolean r3, com.huawei.hms.scankit.p.j0 r4) {
            r2 = this;
            com.huawei.hms.scankit.p.m0 r0 = r4.g()     // Catch: java.lang.RuntimeException -> L30
            boolean r1 = r4.j()     // Catch: java.lang.RuntimeException -> L30
            if (r1 == 0) goto L29
            int r1 = r0.c()     // Catch: java.lang.RuntimeException -> L30
            int r0 = r0.b()     // Catch: java.lang.RuntimeException -> L30
            if (r3 == 0) goto L19
            if (r0 >= r1) goto L19
            int r0 = r0 + 1
            goto L25
        L19:
            if (r0 <= 0) goto L1e
            int r0 = r0 + (-1)
            goto L25
        L1e:
            java.lang.String r3 = com.huawei.hms.scankit.b.H     // Catch: java.lang.RuntimeException -> L30
            java.lang.String r1 = "handleZoom  zoom not change"
            com.huawei.hms.scankit.p.o4.d(r3, r1)     // Catch: java.lang.RuntimeException -> L30
        L25:
            r4.d(r0)     // Catch: java.lang.RuntimeException -> L30
            return
        L29:
            java.lang.String r3 = com.huawei.hms.scankit.b.H     // Catch: java.lang.RuntimeException -> L30
            java.lang.String r4 = "zoom not supported"
            com.huawei.hms.scankit.p.o4.d(r3, r4)     // Catch: java.lang.RuntimeException -> L30
        L30:
            return
    }

    static /* synthetic */ boolean a(com.huawei.hms.scankit.b r0, boolean r1) {
            r0.B = r1
            return r1
    }

    static /* synthetic */ com.huawei.hms.hmsscankit.api.IOnErrorCallback b(com.huawei.hms.scankit.b r0) {
            com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = r0.D
            return r0
    }

    static /* synthetic */ boolean b(com.huawei.hms.scankit.b r0, boolean r1) {
            r0.n = r1
            return r1
    }

    static /* synthetic */ boolean c(com.huawei.hms.scankit.b r0) {
            boolean r0 = r0.n
            return r0
    }

    static /* synthetic */ android.content.Context d(com.huawei.hms.scankit.b r0) {
            android.content.Context r0 = r0.d
            return r0
    }

    static /* synthetic */ boolean e(com.huawei.hms.scankit.b r0) {
            boolean r0 = r0.G
            return r0
    }

    private void j() {
            r1 = this;
            com.huawei.hms.scankit.a r0 = r1.e
            if (r0 == 0) goto La
            r0.e()
            r0 = 0
            r1.e = r0
        La:
            com.huawei.hms.scankit.p.j0 r0 = r1.g
            r0.l()
            return
    }

    public com.huawei.hms.scankit.b a(com.huawei.hms.scankit.p.e5 r1) {
            r0 = this;
            r0.y = r1
            return r0
    }

    public com.huawei.hms.scankit.b a(boolean r2) {
            r1 = this;
            r1.w = r2
            com.huawei.hms.scankit.a r0 = r1.e
            if (r0 == 0) goto L9
            r0.a(r2)
        L9:
            return r1
    }

    public com.huawei.hms.scankit.p.j0 a() {
            r1 = this;
            com.huawei.hms.scankit.p.j0 r0 = r1.g
            return r0
    }

    public void a(com.huawei.hms.hmsscankit.api.IOnErrorCallback r1) {
            r0 = this;
            r0.D = r1
            return
    }

    public void a(com.huawei.hms.hmsscankit.api.IOnResultCallback r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void a(com.huawei.hms.ml.scan.HmsScan[] r7, android.graphics.Bitmap r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "decode time:"
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "scan-time"
            com.huawei.hms.scankit.p.o4.a(r1, r0)
            java.lang.String r0 = com.huawei.hms.scankit.b.H     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            java.lang.String r1 = "result onResult"
            com.huawei.hms.scankit.p.o4.d(r0, r1)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            com.huawei.hms.scankit.p.e5 r1 = r6.y     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            boolean r1 = r1.a()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto L35
            java.lang.String r7 = "result intercepted"
            com.huawei.hms.scankit.p.o4.d(r0, r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            return
        L2f:
            r7 = move-exception
            goto Lf3
        L32:
            r7 = move-exception
            goto Lf7
        L35:
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto L3e
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r1.a(r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        L3e:
            boolean r1 = r6.c     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 != 0) goto L46
            com.huawei.hms.ml.scan.HmsScan[] r7 = com.huawei.hms.scankit.p.w7.a(r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        L46:
            com.huawei.hms.scankit.p.e5 r1 = r6.y     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r2 = 0
            if (r1 == 0) goto L81
            com.huawei.hms.scankit.ViewfinderView r1 = r6.h     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto L7c
            int r1 = r7.length     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 <= 0) goto L7c
            r1 = r7[r2]     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto L7c
            java.lang.String r1 = "result draw result point"
            com.huawei.hms.scankit.p.o4.d(r0, r1)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            android.content.Context r1 = r6.d     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            boolean r1 = r1 instanceof android.app.Activity     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto L7a
            com.huawei.hms.scankit.ViewfinderView r1 = r6.h     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r3 = r7[r2]     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            android.graphics.Rect r3 = r3.getBorderRect()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            android.content.Context r4 = r6.d     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            boolean r4 = com.huawei.hms.scankit.p.w7.c(r4)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            com.huawei.hms.scankit.p.j0 r5 = r6.g     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            android.graphics.Point r5 = r5.e()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r1.a(r3, r4, r5)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        L7a:
            r6.C = r2     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        L7c:
            com.huawei.hms.scankit.p.e5 r1 = r6.y     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r1.a(r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        L81:
            com.huawei.hms.hmsscankit.api.IOnResultCallback r1 = r6.z     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r1 == 0) goto Lfa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            r1.<init>()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            java.lang.String r3 = "result callback end: pauseStatus"
            r1.append(r3)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            boolean r3 = r6.C     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            r1.append(r3)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            com.huawei.hms.scankit.p.o4.d(r0, r1)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            boolean r0 = r6.C     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            if (r0 != 0) goto Lfa
            boolean r0 = r6.w     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            if (r0 == 0) goto Lcb
            if (r7 == 0) goto Lcb
            int r0 = r7.length     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            if (r0 <= 0) goto Lcb
            r0 = r7[r2]     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            if (r0 == 0) goto Lcb
            android.content.Context r0 = r6.d     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            boolean r1 = r0 instanceof android.app.Activity     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            if (r1 == 0) goto Lcb
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            int r0 = r0.getRotation()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            r1 = r7[r2]     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            android.graphics.Bitmap r8 = com.huawei.hms.scankit.p.w7.a(r8, r0)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            r1.originalBitmap = r8     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            goto Lcb
        Lc9:
            r7 = move-exception
            goto Ld1
        Lcb:
            com.huawei.hms.hmsscankit.api.IOnResultCallback r8 = r6.z     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            r8.onResult(r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32 android.os.RemoteException -> Lc9
            return
        Ld1:
            com.huawei.hms.scankit.p.v3 r8 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            if (r8 == 0) goto Ldc
            com.huawei.hms.scankit.p.v3 r8 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            r8.c(r0)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
        Ldc:
            java.lang.String r8 = "CaptureHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r0.<init>()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            java.lang.String r1 = "onResult  RemoteException  e:"
            r0.append(r1)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            r0.append(r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            com.huawei.hms.scankit.p.o4.e(r8, r7)     // Catch: java.lang.Exception -> L2f java.lang.RuntimeException -> L32
            goto Lfa
        Lf3:
            r7.toString()
            goto Lfa
        Lf7:
            r7.toString()
        Lfa:
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.E = r1
            return
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.F
            return r0
    }

    public boolean b(android.view.MotionEvent r6) {
            r5 = this;
            com.huawei.hms.scankit.p.j0 r0 = r5.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r5.p
            if (r2 == 0) goto L5e
            com.huawei.hms.scankit.p.j0$c r0 = r0.f()
            int r0 = r0.a()
            com.huawei.hms.scankit.p.j0$c r2 = com.huawei.hms.scankit.p.j0.c.c
            int r2 = r2.a()
            if (r0 < r2) goto L5e
            int r0 = r6.getPointerCount()
            r2 = 1
            if (r0 <= r2) goto L5e
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 2
            if (r0 == r3) goto L35
            r1 = 5
            if (r0 == r1) goto L2e
            goto L5d
        L2e:
            float r6 = r5.a(r6)
            r5.q = r6
            goto L5d
        L35:
            float r6 = r5.a(r6)
            float r0 = r5.q
            r3 = 1086324736(0x40c00000, float:6.0)
            float r4 = r0 + r3
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L49
            com.huawei.hms.scankit.p.j0 r0 = r5.g
            r5.a(r2, r0)
            goto L5b
        L49:
            float r0 = r0 - r3
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L54
            com.huawei.hms.scankit.p.j0 r0 = r5.g
            r5.a(r1, r0)
            goto L5b
        L54:
            java.lang.String r0 = "CaptureHelper"
            java.lang.String r1 = "MotionEvent.ACTION_MOVE no handleZoom"
            com.huawei.hms.scankit.p.o4.d(r0, r1)
        L5b:
            r5.q = r6
        L5d:
            return r2
        L5e:
            return r1
    }

    public void c() {
            r3 = this;
            r0 = 0
            r3.C = r0
            com.huawei.hms.feature.dynamic.IObjectWrapper r0 = r3.x     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            com.huawei.hms.scankit.p.w3 r1 = new com.huawei.hms.scankit.p.w3     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            java.lang.String r2 = r3.o     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            com.huawei.hms.scankit.b.J = r1     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            java.lang.String r1 = "single"
            r0.a(r1)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L24
            goto L2b
        L1c:
            java.lang.String r0 = com.huawei.hms.scankit.b.H
            java.lang.String r1 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L2b
        L24:
            java.lang.String r0 = com.huawei.hms.scankit.b.H
            java.lang.String r1 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L2b:
            android.content.Context r0 = r3.d
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            if (r0 == 0) goto L42
            android.content.Context r0 = r3.d
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.camera"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 != 0) goto L42
            return
        L42:
            android.content.Context r0 = r3.d
            com.huawei.hms.scankit.p.e0 r0 = r3.a(r0)
            com.huawei.hms.scankit.p.j0 r1 = new com.huawei.hms.scankit.p.j0
            android.content.Context r2 = r3.d
            r1.<init>(r2, r0)
            r3.g = r1
            java.lang.Thread r0 = new java.lang.Thread
            com.huawei.hms.scankit.b$a r1 = new com.huawei.hms.scankit.b$a
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            com.huawei.hms.scankit.p.j0 r0 = r3.g
            com.huawei.hms.scankit.b$b r1 = new com.huawei.hms.scankit.b$b
            r1.<init>(r3)
            r0.a(r1)
            com.huawei.hms.scankit.b$c r0 = new com.huawei.hms.scankit.b$c
            r0.<init>(r3)
            r3.j = r0
            com.huawei.hms.scankit.b$d r0 = new com.huawei.hms.scankit.b$d
            r0.<init>(r3)
            r3.f = r0
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.G = r1
            return
    }

    public void d() {
            r2 = this;
            r0 = 1
            r2.C = r0
            android.view.TextureView r0 = r2.i
            r1 = 0
            r0.setSurfaceTextureListener(r1)
            com.huawei.hms.scankit.p.j0 r0 = r2.g
            r0.k()
            com.huawei.hms.scankit.p.w3 r0 = com.huawei.hms.scankit.b.J
            com.huawei.hms.scankit.p.w3$d r0 = r0.l
            r0.b()
            com.huawei.hms.scankit.b.J = r1
            return
    }

    public void e() {
            r1 = this;
            r0 = 1
            r1.C = r0
            boolean r0 = r1.A
            if (r0 != 0) goto La
            r1.j()
        La:
            return
    }

    public void f() {
            r5 = this;
            r0 = 0
            r5.C = r0
            com.huawei.hms.feature.dynamic.IObjectWrapper r1 = r5.x     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            java.lang.Object r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            com.huawei.hms.scankit.p.v3 r2 = new com.huawei.hms.scankit.p.v3     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            java.lang.String r3 = r5.o     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            com.huawei.hms.scankit.b.I = r2     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            com.huawei.hms.scankit.p.v3 r1 = com.huawei.hms.scankit.b.I     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            r1.h()     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L22
            goto L29
        L1a:
            java.lang.String r1 = com.huawei.hms.scankit.b.H
            java.lang.String r2 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r1, r2)
            goto L29
        L22:
            java.lang.String r1 = com.huawei.hms.scankit.b.H
            java.lang.String r2 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r1, r2)
        L29:
            boolean r1 = r5.A
            if (r1 != 0) goto L4b
            boolean r1 = r5.n
            if (r1 != 0) goto L4b
            android.view.TextureView r1 = r5.i
            if (r1 == 0) goto L4b
            android.view.TextureView$SurfaceTextureListener r2 = r5.j
            r1.setSurfaceTextureListener(r2)
            boolean r1 = r5.n
            if (r1 == 0) goto L44
            android.view.TextureView r1 = r5.i
            r5.a(r1)
            goto L4b
        L44:
            android.view.TextureView r1 = r5.i
            android.view.TextureView$SurfaceTextureListener r2 = r5.j
            r1.setSurfaceTextureListener(r2)
        L4b:
            boolean r1 = r5.B
            if (r1 == 0) goto L6a
            android.content.Context r1 = r5.d
            int r2 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = "android.permission.CAMERA"
            int r1 = r1.checkPermission(r4, r2, r3)
            if (r1 != 0) goto L6a
            android.view.TextureView r1 = r5.i
            if (r1 == 0) goto L6a
            r5.B = r0
            r5.a(r1)
        L6a:
            return
    }

    public void g() {
            r2 = this;
            r0 = 0
            r2.C = r0
            android.view.TextureView r0 = r2.i
            if (r0 == 0) goto L20
            android.view.TextureView$SurfaceTextureListener r1 = r2.j
            r0.setSurfaceTextureListener(r1)
            r0 = 1
            r2.A = r0
            boolean r0 = r2.n
            if (r0 == 0) goto L19
            android.view.TextureView r0 = r2.i
            r2.a(r0)
            return
        L19:
            android.view.TextureView r0 = r2.i
            android.view.TextureView$SurfaceTextureListener r1 = r2.j
            r0.setSurfaceTextureListener(r1)
        L20:
            return
    }

    public void h() {
            r1 = this;
            r0 = 1
            r1.C = r0
            com.huawei.hms.scankit.p.v3 r0 = com.huawei.hms.scankit.b.I
            if (r0 == 0) goto Lc
            com.huawei.hms.scankit.p.v3 r0 = com.huawei.hms.scankit.b.I
            r0.i()
        Lc:
            r0 = 0
            com.huawei.hms.scankit.b.I = r0
            boolean r0 = r1.A
            if (r0 == 0) goto L16
            r1.j()
        L16:
            return
    }

    public void i() {
            r2 = this;
            com.huawei.hms.scankit.p.j0 r0 = r2.g     // Catch: java.lang.Exception -> L9 java.lang.RuntimeException -> L11
            if (r0 == 0) goto L18
            r1 = 1
            r0.d(r1)     // Catch: java.lang.Exception -> L9 java.lang.RuntimeException -> L11
            return
        L9:
            java.lang.String r0 = com.huawei.hms.scankit.b.H
            java.lang.String r1 = "Exception in reset zoomValue"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto L18
        L11:
            java.lang.String r0 = com.huawei.hms.scankit.b.H
            java.lang.String r1 = "RuntimeException in reset zoomValue"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        L18:
            return
    }
}
