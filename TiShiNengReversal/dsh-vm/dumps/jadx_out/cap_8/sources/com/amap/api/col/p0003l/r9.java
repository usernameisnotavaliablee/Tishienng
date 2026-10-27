package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r9 implements com.amap.api.col.3l.z1.a, com.amap.api.col.3l.v8.a, com.autonavi.base.amap.api.mapcore.IAMapDelegate, com.autonavi.base.amap.mapcore.interfaces.IAMapListener {
    private boolean A;
    private com.amap.api.col.3l.r9.t0 A0;
    private boolean B;
    private com.amap.api.col.3l.r9.t0 B0;
    private boolean C;
    private com.amap.api.col.3l.r9.t0 C0;
    private boolean D;
    private com.amap.api.col.3l.r9.t0 D0;
    private int E;
    private com.amap.api.col.3l.r9.t0 E0;
    private boolean F;
    private com.amap.api.col.3l.r9.t0 F0;
    private boolean G;
    private com.amap.api.col.3l.r9.t0 G0;
    private android.graphics.Rect H;
    private com.amap.api.col.3l.r9.t0 H0;
    private int I;
    private com.amap.api.col.3l.r9.t0 I0;
    private com.amap.api.maps.model.MyTrafficStyle J;
    private com.amap.api.col.3l.r9.t0 J0;
    private java.lang.Thread K;
    private com.amap.api.col.3l.r9.t0 K0;
    private java.lang.Thread L;
    private com.amap.api.col.3l.r9.t0 L0;
    private com.amap.api.col.p0003l.ga M;
    private com.amap.api.col.3l.r9.t0 M0;
    private boolean N;
    private java.lang.Runnable N0;
    private boolean O;
    private com.amap.api.col.3l.r9.t0 O0;
    private int P;
    private com.autonavi.extra.b P0;
    private com.amap.api.maps.CustomRenderer Q;
    private java.lang.String Q0;
    private int R;
    private java.lang.String R0;
    private int S;
    private boolean S0;
    private java.util.List<com.amap.api.col.p0003l.e> T;
    private boolean T0;
    private com.amap.api.col.p0003l.x1 U;
    private int U0;
    private com.amap.api.col.p0003l.z1 V;
    private com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo V0;
    com.amap.api.col.p0003l.s2 W;
    android.graphics.Point W0;
    private long X;
    private long X0;
    protected android.content.Context Y;
    protected java.lang.String Y0;
    protected com.autonavi.base.ae.gmap.GLMapEngine Z;
    private com.amap.api.col.p0003l.z Z0;
    private com.amap.api.col.p0003l.aa a;

    /* renamed from: a0, reason: collision with root package name */
    private com.autonavi.base.ae.gmap.GLMapRender f3856a0;
    float[] a1;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.ba f3857b;

    /* renamed from: b0, reason: collision with root package name */
    private com.amap.api.col.p0003l.ja f3858b0;
    float[] b1;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.maps.model.AMapGestureListener f3859c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f3860c0;
    float[] c1;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.a0 f3861d;
    public int d0;
    private com.autonavi.amap.mapcore.IPoint[] d1;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.maps.UiSettings f3862e;
    public int e0;
    float[] e1;

    /* renamed from: f, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IProjectionDelegate f3863f;
    private float f0;
    java.lang.String f1;

    /* renamed from: g, reason: collision with root package name */
    private final com.amap.api.col.p0003l.i f3864g;
    private float g0;
    java.lang.String g1;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f3865h;
    private float h0;
    int h1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3866i;
    private boolean i0;

    /* renamed from: j, reason: collision with root package name */
    private final com.autonavi.base.amap.api.mapcore.IGLSurfaceView f3867j;
    private boolean j0;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.col.p0003l.i3 f3868k;
    private boolean k0;
    private final com.amap.api.maps.interfaces.IGlOverlayLayer l;
    private volatile boolean l0;
    private boolean m;
    private volatile boolean m0;
    private int n;
    private boolean n0;
    private java.util.concurrent.atomic.AtomicBoolean o;
    private boolean o0;
    private boolean p;
    private java.util.concurrent.locks.Lock p0;
    protected com.autonavi.base.amap.mapcore.MapConfig q;
    private int q0;
    private boolean r;
    private int r0;
    private boolean s;
    private int s0;
    protected com.amap.api.col.p0003l.z t;
    private com.amap.api.col.3l.r9.u0 t0;
    private com.amap.api.col.p0003l.q1 u;
    private com.amap.api.col.p0003l.v1 u0;
    private com.amap.api.maps.LocationSource v;
    private com.amap.api.maps.AMap.OnMultiPointClickListener v0;
    private boolean w;
    private com.amap.api.col.p0003l.v8 w0;
    private boolean x;
    private long x0;
    private com.amap.api.maps.model.Marker y;
    boolean y0;
    private com.amap.api.maps.model.GLTFOverlay z;
    protected final android.os.Handler z0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ double a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f3869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3870c;

        a(com.amap.api.col.p0003l.r9 r1, double r2, double r4) {
                r0 = this;
                r0.f3870c = r1
                r0.a = r2
                r0.f3869b = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 19
                r0.what = r1
                double r1 = r3.a
                int r1 = (int) r1
                r0.arg1 = r1
                double r1 = r3.f3869b
                int r1 = (int) r1
                r0.arg2 = r1
                com.amap.api.col.3l.r9 r1 = r3.f3870c
                android.os.Handler r1 = r1.z0
                r1.sendMessage(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a0 implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        a0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.a
                com.amap.api.col.3l.r9$u0 r0 = com.amap.api.col.p0003l.r9.u0(r0)
                if (r0 == 0) goto L17
                com.amap.api.col.3l.r9 r0 = r2.a
                com.amap.api.col.3l.r9$u0 r0 = com.amap.api.col.p0003l.r9.u0(r0)
                com.amap.api.col.3l.r9 r1 = r2.a
                com.amap.api.col.3l.z r1 = com.amap.api.col.p0003l.r9.w0(r1)
                r0.a(r1)
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3871j;

        b(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3871j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3871j     // Catch: java.lang.Throwable -> La
                boolean r1 = r2.f3914b     // Catch: java.lang.Throwable -> La
                r0.setTrafficEnabled(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b0 implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        b0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.a     // Catch: java.lang.Throwable -> L12
                com.amap.api.maps.interfaces.IGlOverlayLayer r0 = com.amap.api.col.p0003l.r9.W(r0)     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L14
                com.amap.api.col.3l.r9 r0 = r2.a     // Catch: java.lang.Throwable -> L12
                com.amap.api.maps.interfaces.IGlOverlayLayer r0 = com.amap.api.col.p0003l.r9.W(r0)     // Catch: java.lang.Throwable -> L12
                r0.destroy()     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r0 = move-exception
                goto L1e
            L14:
                com.amap.api.col.3l.r9 r0 = r2.a     // Catch: java.lang.Throwable -> L12
                int r1 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> L12
                r0.destroySurface(r1)     // Catch: java.lang.Throwable -> L12
                return
            L1e:
                com.amap.api.col.p0003l.b3.D(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.ed a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3872b;

        c(com.amap.api.col.p0003l.r9 r1, com.amap.api.col.p0003l.ed r2) {
                r0 = this;
                r0.f3872b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3872b
                boolean r0 = com.amap.api.col.p0003l.r9.p0(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.amap.api.col.3l.r9 r0 = r2.f3872b     // Catch: java.lang.Throwable -> L12
                com.amap.api.col.3l.z r1 = r0.t     // Catch: java.lang.Throwable -> L12
                if (r1 == 0) goto L12
                r0.setIndoorBuildingInfo(r1)     // Catch: java.lang.Throwable -> L12
            L12:
                com.amap.api.col.3l.ed r0 = r2.a
                r0.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c0 implements java.lang.Runnable {
        final /* synthetic */ com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3873b;

        c0(com.amap.api.col.p0003l.r9 r1, com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r2) {
                r0 = this;
                r0.f3873b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3873b
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                if (r1 == 0) goto L15
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r0 = r1.getOverlayBundle(r0)
                if (r0 == 0) goto L15
                com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r1 = r2.a
                r0.addOverlay(r1)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class d implements java.lang.Runnable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3874b;

        d(com.amap.api.col.p0003l.r9 r1, int r2) {
                r0 = this;
                r0.f3874b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3874b
                boolean r0 = com.amap.api.col.p0003l.r9.r0(r0)
                if (r0 == 0) goto L14
                com.amap.api.col.3l.r9 r0 = r3.f3874b
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z
                if (r0 == 0) goto L14
                int r1 = r3.a
                r2 = 0
                r0.setHighlightSubwayEnable(r1, r2)
            L14:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class d0 implements java.lang.Runnable {
        final /* synthetic */ com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3875b;

        d0(com.amap.api.col.p0003l.r9 r1, com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner r2) {
                r0 = this;
                r0.f3875b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3875b
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                if (r1 == 0) goto L15
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r0 = r1.getOverlayBundle(r0)
                if (r0 == 0) goto L15
                com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner r1 = r2.a
                r0.addOverlay(r1)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class e implements java.lang.Runnable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3878d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.autonavi.base.ae.gmap.style.StyleItem[] f3879e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3880f;

        e(com.amap.api.col.p0003l.r9 r1, int r2, int r3, int r4, boolean r5, com.autonavi.base.ae.gmap.style.StyleItem[] r6) {
                r0 = this;
                r0.f3880f = r1
                r0.a = r2
                r0.f3876b = r3
                r0.f3877c = r4
                r0.f3878d = r5
                r0.f3879e = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                com.amap.api.col.3l.r9 r0 = r7.f3880f     // Catch: java.lang.Throwable -> L11
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> L11
                int r2 = r7.a     // Catch: java.lang.Throwable -> L11
                int r3 = r7.f3876b     // Catch: java.lang.Throwable -> L11
                int r4 = r7.f3877c     // Catch: java.lang.Throwable -> L11
                boolean r5 = r7.f3878d     // Catch: java.lang.Throwable -> L11
                com.autonavi.base.ae.gmap.style.StyleItem[] r6 = r7.f3879e     // Catch: java.lang.Throwable -> L11
                r1.setMapModeAndStyle(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L11
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class e0 implements java.lang.Runnable {
        final /* synthetic */ com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3881b;

        e0(com.amap.api.col.p0003l.r9 r1, com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r2) {
                r0 = this;
                r0.f3881b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3881b
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r0 = r1.getOverlayBundle(r0)
                com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r1 = r2.a
                r0.removeOverlay(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class f implements java.lang.Runnable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3882b;

        f(com.amap.api.col.p0003l.r9 r1, int r2) {
                r0 = this;
                r0.f3882b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3882b     // Catch: java.lang.Throwable -> L13
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L13
                int r1 = r3.a     // Catch: java.lang.Throwable -> L13
                r0.clearAllMessages(r1)     // Catch: java.lang.Throwable -> L13
                com.amap.api.col.3l.r9 r0 = r3.f3882b     // Catch: java.lang.Throwable -> L13
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L13
                int r1 = r3.a     // Catch: java.lang.Throwable -> L13
                r2 = 1
                r0.clearAnimations(r1, r2)     // Catch: java.lang.Throwable -> L13
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class f0 implements java.util.concurrent.Callable<java.lang.Integer> {
        final /* synthetic */ java.util.List a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3883b;

        f0(com.amap.api.col.p0003l.r9 r1, java.util.List r2) {
                r0 = this;
                r0.f3883b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        private java.lang.Integer a() throws java.lang.Exception {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3883b
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z
                java.util.List r1 = r2.a
                int r0 = r0.hideBuildings(r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
                r1 = this;
                java.lang.Integer r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class g implements java.lang.Runnable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3885c;

        g(com.amap.api.col.p0003l.r9 r1, int r2, boolean r3) {
                r0 = this;
                r0.f3885c = r1
                r0.a = r2
                r0.f3884b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3885c     // Catch: java.lang.Throwable -> Lb
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> Lb
                int r1 = r3.a     // Catch: java.lang.Throwable -> Lb
                boolean r2 = r3.f3884b     // Catch: java.lang.Throwable -> Lb
                r0.setBuildingEnable(r1, r2)     // Catch: java.lang.Throwable -> Lb
            Lb:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class g0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3886j;

        g0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3886j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3886j     // Catch: java.lang.Throwable -> La
                byte[] r1 = r2.f3920h     // Catch: java.lang.Throwable -> La
                r0.setTrafficStyleWithTextureData(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class h implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3888c;

        h(com.amap.api.col.p0003l.r9 r1, boolean r2, int r3) {
                r0 = this;
                r0.f3888c = r1
                r0.a = r2
                r0.f3887b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.3l.r9 r0 = r4.f3888c
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z
                if (r0 == 0) goto L20
                boolean r1 = r4.a
                r2 = 0
                if (r1 == 0) goto L12
                int r1 = r4.f3887b
                r3 = 1
                r0.setAllContentEnable(r1, r3)
                goto L17
            L12:
                int r1 = r4.f3887b
                r0.setAllContentEnable(r1, r2)
            L17:
                com.amap.api.col.3l.r9 r0 = r4.f3888c
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z
                int r1 = r4.f3887b
                r0.setSimple3DEnable(r1, r2)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class h0 implements java.lang.Runnable {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3889b;

        h0(com.amap.api.col.p0003l.r9 r1, int r2) {
                r0 = this;
                r0.f3889b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3889b
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z
                int r1 = r2.a
                r0.showHideBuildings(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class i implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3891c;

        i(com.amap.api.col.p0003l.r9 r1, boolean r2, int r3) {
                r0 = this;
                r0.f3891c = r1
                r0.a = r2
                r0.f3890b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                boolean r0 = r3.a     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto Lf
                com.amap.api.col.3l.r9 r0 = r3.f3891c     // Catch: java.lang.Throwable -> L19
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L19
                int r1 = r3.f3890b     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r0.setBuildingTextureEnable(r1, r2)     // Catch: java.lang.Throwable -> L19
                return
            Lf:
                com.amap.api.col.3l.r9 r0 = r3.f3891c     // Catch: java.lang.Throwable -> L19
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L19
                int r1 = r3.f3890b     // Catch: java.lang.Throwable -> L19
                r2 = 0
                r0.setBuildingTextureEnable(r1, r2)     // Catch: java.lang.Throwable -> L19
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class i0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3892j;

        i0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3892j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3892j
                boolean r1 = r2.f3914b
                r0.setMapCustomEnable(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class j implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.maps.model.LatLngBounds.Builder a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3893b;

        j(com.amap.api.col.p0003l.r9 r1, com.amap.api.maps.model.LatLngBounds.Builder r2) {
                r0 = this;
                r0.f3893b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3893b     // Catch: java.lang.Throwable -> L11
                com.amap.api.maps.model.LatLngBounds$Builder r1 = r3.a     // Catch: java.lang.Throwable -> L11
                com.amap.api.maps.model.LatLngBounds r1 = r1.build()     // Catch: java.lang.Throwable -> L11
                r2 = 50
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.i(r1, r2)     // Catch: java.lang.Throwable -> L11
                r0.moveCamera(r1)     // Catch: java.lang.Throwable -> L11
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class j0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3894j;

        j0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3894j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r3.f3894j
                int r1 = r3.f3917e
                boolean r2 = r3.f3914b
                r0.k(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class k extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        k(com.amap.api.col.p0003l.r9 r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r9) {
                r8 = this;
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r0 = r8.a
                java.util.concurrent.atomic.AtomicBoolean r0 = com.amap.api.col.p0003l.r9.d(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L10
                goto L3ed
            L10:
                int r0 = r9.what     // Catch: java.lang.Throwable -> L5e
                r1 = 2
                if (r0 == r1) goto L3db
                r1 = 30
                if (r0 == r1) goto L3d1
                r1 = 0
                switch(r0) {
                    case 10: goto L38c;
                    case 11: goto L325;
                    case 12: goto L309;
                    case 13: goto L2f7;
                    case 14: goto L2b6;
                    case 15: goto L12d;
                    case 16: goto Le4;
                    case 17: goto Lc4;
                    case 18: goto Lb2;
                    case 19: goto L61;
                    case 20: goto L1f;
                    default: goto L1d;
                }
            L1d:
                goto L3ed
            L1f:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L54
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L54
                java.lang.Class<com.amap.api.maps.AMap$OnPOIClickListener> r2 = com.amap.api.maps.AMap.OnPOIClickListener.class
                int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L54
                java.util.List r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L54
                if (r0 == 0) goto L3ed
                int r2 = r0.size()     // Catch: java.lang.Throwable -> L54
                if (r2 <= 0) goto L3ed
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L54
            L38:
                int r2 = r0.size()     // Catch: java.lang.Throwable -> L4e
                if (r1 >= r2) goto L50
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L4e
                com.amap.api.maps.AMap$OnPOIClickListener r2 = (com.amap.api.maps.AMap.OnPOIClickListener) r2     // Catch: java.lang.Throwable -> L4e
                java.lang.Object r3 = r9.obj     // Catch: java.lang.Throwable -> L4e
                com.amap.api.maps.model.Poi r3 = (com.amap.api.maps.model.Poi) r3     // Catch: java.lang.Throwable -> L4e
                r2.onPOIClick(r3)     // Catch: java.lang.Throwable -> L4e
                int r1 = r1 + 1
                goto L38
            L4e:
                r9 = move-exception
                goto L52
            L50:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
                return
            L52:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
                throw r9     // Catch: java.lang.Throwable -> L54
            L54:
                r9 = move-exception
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "OnPOIClickListener.onPOIClick"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            L5e:
                r9 = move-exception
                goto L3e6
            L61:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L5e
                java.lang.Class<com.amap.api.maps.AMap$OnMapClickListener> r1 = com.amap.api.maps.AMap.OnMapClickListener.class
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L5e
                java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L5e
                if (r0 == 0) goto L3ed
                com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.r9 r2 = r8.a     // Catch: java.lang.Throwable -> L5e
                int r3 = r9.arg1     // Catch: java.lang.Throwable -> L5e
                int r9 = r9.arg2     // Catch: java.lang.Throwable -> L5e
                r2.getPixel2LatLng(r3, r9, r1)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r0)     // Catch: java.lang.Throwable -> La5
                java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L9e
            L85:
                boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto La0
                java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L9e
                com.amap.api.maps.AMap$OnMapClickListener r2 = (com.amap.api.maps.AMap.OnMapClickListener) r2     // Catch: java.lang.Throwable -> L9e
                com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L9e
                double r4 = r1.y     // Catch: java.lang.Throwable -> L9e
                double r6 = r1.x     // Catch: java.lang.Throwable -> L9e
                r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L9e
                r2.onMapClick(r3)     // Catch: java.lang.Throwable -> L9e
                goto L85
            L9e:
                r9 = move-exception
                goto La7
            La0:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
                r1.recycle()     // Catch: java.lang.Throwable -> La5
                return
            La5:
                r9 = move-exception
                goto La9
            La7:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
                throw r9     // Catch: java.lang.Throwable -> La5
            La9:
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "OnMapClickListener.onMapClick"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            Lb2:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.a0 r9 = com.amap.api.col.p0003l.r9.i0(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.a0 r9 = com.amap.api.col.p0003l.r9.i0(r9)     // Catch: java.lang.Throwable -> L5e
                r9.r()     // Catch: java.lang.Throwable -> L5e
                return
            Lc4:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r9.Z     // Catch: java.lang.Throwable -> L5e
                int r9 = com.amap.api.col.p0003l.r9.g0(r9)     // Catch: java.lang.Throwable -> L5e
                boolean r9 = r0.isInMapAnimation(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.maps.interfaces.IGlOverlayLayer r9 = com.amap.api.col.p0003l.r9.W(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.maps.interfaces.IGlOverlayLayer r9 = com.amap.api.col.p0003l.r9.W(r9)     // Catch: java.lang.Throwable -> L5e
                r9.setFlingState(r1)     // Catch: java.lang.Throwable -> L5e
                return
            Le4:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L10f
                com.amap.api.col.3l.ba r9 = com.amap.api.col.p0003l.r9.w(r9)     // Catch: java.lang.Throwable -> L10f
                java.lang.Class<com.amap.api.maps.AMap$OnMapLoadedListener> r0 = com.amap.api.maps.AMap.OnMapLoadedListener.class
                int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L10f
                java.util.List r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L10f
                if (r9 == 0) goto L11a
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L10f
            Lf7:
                int r0 = r9.size()     // Catch: java.lang.Throwable -> L109
                if (r1 >= r0) goto L10b
                java.lang.Object r0 = r9.get(r1)     // Catch: java.lang.Throwable -> L109
                com.amap.api.maps.AMap$OnMapLoadedListener r0 = (com.amap.api.maps.AMap.OnMapLoadedListener) r0     // Catch: java.lang.Throwable -> L109
                r0.onMapLoaded()     // Catch: java.lang.Throwable -> L109
                int r1 = r1 + 1
                goto Lf7
            L109:
                r0 = move-exception
                goto L10d
            L10b:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L109
                goto L11a
            L10d:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L109
                throw r0     // Catch: java.lang.Throwable -> L10f
            L10f:
                r9 = move-exception
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "onMapLoaded"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.p0003l.b3.D(r9)     // Catch: java.lang.Throwable -> L5e
            L11a:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                r9.i()     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            L12d:
                java.lang.Object r0 = r9.obj     // Catch: java.lang.Throwable -> L5e
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L5e
                int r9 = r9.arg1     // Catch: java.lang.Throwable -> L5e
                r2 = 0
                if (r0 == 0) goto L212
                com.amap.api.col.3l.r9 r3 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r3 = com.amap.api.col.p0003l.r9.F(r3)     // Catch: java.lang.Throwable -> L5e
                if (r3 == 0) goto L212
                android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L5e
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.r9 r4 = r8.a     // Catch: java.lang.Throwable -> L5e
                boolean r4 = com.amap.api.col.p0003l.r9.N(r4)     // Catch: java.lang.Throwable -> L5e
                if (r4 == 0) goto L15a
                com.amap.api.col.3l.r9 r4 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r4 = com.amap.api.col.p0003l.r9.F(r4)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.el r4 = r4.f()     // Catch: java.lang.Throwable -> L5e
                if (r4 == 0) goto L15a
                r4.onDraw(r3)     // Catch: java.lang.Throwable -> L5e
            L15a:
                com.amap.api.col.3l.r9 r4 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r4 = com.amap.api.col.p0003l.r9.F(r4)     // Catch: java.lang.Throwable -> L5e
                r4.m(r3)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.r9 r3 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$onMapPrintScreenListener> r4 = com.amap.api.maps.AMap.onMapPrintScreenListener.class
                int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.util.List r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L3ed
                if (r3 == 0) goto L17b
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ed
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L3ed
                goto L17c
            L17b:
                r4 = r2
            L17c:
                com.amap.api.col.3l.r9 r3 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$OnMapScreenShotListener> r5 = com.amap.api.maps.AMap.OnMapScreenShotListener.class
                int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.util.List r3 = r3.a(r5)     // Catch: java.lang.Throwable -> L3ed
                if (r3 == 0) goto L193
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ed
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L3ed
            L193:
                com.amap.api.col.3l.r9 r3 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$onMapPrintScreenListener> r5 = com.amap.api.maps.AMap.onMapPrintScreenListener.class
                int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ed
                r3.d(r5)     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.r9 r3 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$OnMapScreenShotListener> r5 = com.amap.api.maps.AMap.OnMapScreenShotListener.class
                int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ed
                r3.d(r5)     // Catch: java.lang.Throwable -> L3ed
                if (r4 == 0) goto L1e8
                int r3 = r4.size()     // Catch: java.lang.Throwable -> L3ed
                if (r3 <= 0) goto L1e8
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L3ed
                r3 = 0
            L1c3:
                int r5 = r4.size()     // Catch: java.lang.Throwable -> L1e2
                if (r3 >= r5) goto L1e4
                java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L1e2
                com.amap.api.maps.AMap$onMapPrintScreenListener r5 = (com.amap.api.maps.AMap.onMapPrintScreenListener) r5     // Catch: java.lang.Throwable -> L1e2
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L1e2
                com.amap.api.col.3l.r9 r7 = r8.a     // Catch: java.lang.Throwable -> L1e2
                android.content.Context r7 = r7.Y     // Catch: java.lang.Throwable -> L1e2
                android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L1e2
                r6.<init>(r7, r0)     // Catch: java.lang.Throwable -> L1e2
                r5.onMapPrint(r6)     // Catch: java.lang.Throwable -> L1e2
                int r3 = r3 + 1
                goto L1c3
            L1e2:
                r9 = move-exception
                goto L1e6
            L1e4:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e2
                goto L1e8
            L1e6:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e2
                throw r9     // Catch: java.lang.Throwable -> L3ed
            L1e8:
                if (r2 == 0) goto L3ed
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L3ed
                if (r3 <= 0) goto L3ed
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L3ed
            L1f1:
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L20c
                if (r1 >= r3) goto L20e
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L20c
                com.amap.api.maps.AMap$OnMapScreenShotListener r3 = (com.amap.api.maps.AMap.OnMapScreenShotListener) r3     // Catch: java.lang.Throwable -> L20c
                r3.onMapScreenShot(r0)     // Catch: java.lang.Throwable -> L20c
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L20c
                com.amap.api.maps.AMap$OnMapScreenShotListener r3 = (com.amap.api.maps.AMap.OnMapScreenShotListener) r3     // Catch: java.lang.Throwable -> L20c
                r3.onMapScreenShot(r0, r9)     // Catch: java.lang.Throwable -> L20c
                int r1 = r1 + 1
                goto L1f1
            L20c:
                r9 = move-exception
                goto L210
            L20e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20c
                return
            L210:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20c
                throw r9     // Catch: java.lang.Throwable -> L3ed
            L212:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$onMapPrintScreenListener> r3 = com.amap.api.maps.AMap.onMapPrintScreenListener.class
                int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.util.List r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L3ed
                if (r0 == 0) goto L22a
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ed
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L3ed
                goto L22b
            L22a:
                r3 = r2
            L22b:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$OnMapScreenShotListener> r4 = com.amap.api.maps.AMap.OnMapScreenShotListener.class
                int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.util.List r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L3ed
                if (r0 == 0) goto L243
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ed
                r4.<init>(r0)     // Catch: java.lang.Throwable -> L3ed
                goto L244
            L243:
                r4 = r2
            L244:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$onMapPrintScreenListener> r5 = com.amap.api.maps.AMap.onMapPrintScreenListener.class
                int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ed
                r0.d(r5)     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L3ed
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L3ed
                java.lang.Class<com.amap.api.maps.AMap$OnMapScreenShotListener> r5 = com.amap.api.maps.AMap.OnMapScreenShotListener.class
                int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L3ed
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3ed
                r0.d(r5)     // Catch: java.lang.Throwable -> L3ed
                if (r3 == 0) goto L28c
                int r0 = r3.size()     // Catch: java.lang.Throwable -> L3ed
                if (r0 <= 0) goto L28c
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L3ed
                r0 = 0
            L274:
                int r5 = r3.size()     // Catch: java.lang.Throwable -> L286
                if (r0 >= r5) goto L288
                java.lang.Object r5 = r3.get(r0)     // Catch: java.lang.Throwable -> L286
                com.amap.api.maps.AMap$onMapPrintScreenListener r5 = (com.amap.api.maps.AMap.onMapPrintScreenListener) r5     // Catch: java.lang.Throwable -> L286
                r5.onMapPrint(r2)     // Catch: java.lang.Throwable -> L286
                int r0 = r0 + 1
                goto L274
            L286:
                r9 = move-exception
                goto L28a
            L288:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L286
                goto L28c
            L28a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L286
                throw r9     // Catch: java.lang.Throwable -> L3ed
            L28c:
                if (r4 == 0) goto L3ed
                int r0 = r4.size()     // Catch: java.lang.Throwable -> L3ed
                if (r0 <= 0) goto L3ed
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L3ed
            L295:
                int r0 = r4.size()     // Catch: java.lang.Throwable -> L2b0
                if (r1 >= r0) goto L2b2
                java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L2b0
                com.amap.api.maps.AMap$OnMapScreenShotListener r0 = (com.amap.api.maps.AMap.OnMapScreenShotListener) r0     // Catch: java.lang.Throwable -> L2b0
                r0.onMapScreenShot(r2)     // Catch: java.lang.Throwable -> L2b0
                java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L2b0
                com.amap.api.maps.AMap$OnMapScreenShotListener r0 = (com.amap.api.maps.AMap.OnMapScreenShotListener) r0     // Catch: java.lang.Throwable -> L2b0
                r0.onMapScreenShot(r2, r9)     // Catch: java.lang.Throwable -> L2b0
                int r1 = r1 + 1
                goto L295
            L2b0:
                r9 = move-exception
                goto L2b4
            L2b2:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b0
                return
            L2b4:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b0
                throw r9     // Catch: java.lang.Throwable -> L3ed
            L2b6:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L2ed
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L2ed
                java.lang.Class<com.amap.api.maps.AMap$OnMapTouchListener> r1 = com.amap.api.maps.AMap.OnMapTouchListener.class
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L2ed
                java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L2ed
                if (r0 == 0) goto L3ed
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L2ed
                if (r1 <= 0) goto L3ed
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L2ed
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L2e7
            L2d3:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e7
                if (r2 == 0) goto L2e9
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2e7
                com.amap.api.maps.AMap$OnMapTouchListener r2 = (com.amap.api.maps.AMap.OnMapTouchListener) r2     // Catch: java.lang.Throwable -> L2e7
                java.lang.Object r3 = r9.obj     // Catch: java.lang.Throwable -> L2e7
                android.view.MotionEvent r3 = (android.view.MotionEvent) r3     // Catch: java.lang.Throwable -> L2e7
                r2.onTouch(r3)     // Catch: java.lang.Throwable -> L2e7
                goto L2d3
            L2e7:
                r9 = move-exception
                goto L2eb
            L2e9:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e7
                return
            L2eb:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e7
                throw r9     // Catch: java.lang.Throwable -> L2ed
            L2ed:
                r9 = move-exception
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "onTouchHandler"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            L2f7:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                r9.h()     // Catch: java.lang.Throwable -> L5e
                return
            L309:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.i3 r9 = com.amap.api.col.p0003l.r9.F(r9)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L5e
                float r0 = r0.getZoomLevel()     // Catch: java.lang.Throwable -> L5e
                java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L5e
                r9.r(r0)     // Catch: java.lang.Throwable -> L5e
                return
            L325:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.maps.model.CameraPosition r9 = r9.getCameraPosition()     // Catch: java.lang.Throwable -> L33f
                if (r9 == 0) goto L341
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)     // Catch: java.lang.Throwable -> L33f
                if (r0 == 0) goto L341
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)     // Catch: java.lang.Throwable -> L33f
                r0.s(r9)     // Catch: java.lang.Throwable -> L33f
                goto L341
            L33f:
                r9 = move-exception
                goto L381
            L341:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.p0003l.r9.m(r0, r9)     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                boolean r0 = com.amap.api.col.p0003l.r9.R(r0)     // Catch: java.lang.Throwable -> L33f
                if (r0 == 0) goto L369
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.p0003l.r9.V(r0)     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.maps.interfaces.IGlOverlayLayer r0 = com.amap.api.col.p0003l.r9.W(r0)     // Catch: java.lang.Throwable -> L33f
                if (r0 == 0) goto L364
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.maps.interfaces.IGlOverlayLayer r0 = com.amap.api.col.p0003l.r9.W(r0)     // Catch: java.lang.Throwable -> L33f
                r0.setFlingState(r1)     // Catch: java.lang.Throwable -> L33f
            L364:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                r0.x()     // Catch: java.lang.Throwable -> L33f
            L369:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                boolean r0 = com.amap.api.col.p0003l.r9.d0(r0)     // Catch: java.lang.Throwable -> L33f
                if (r0 == 0) goto L37b
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                r0.redrawInfoWindow()     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                com.amap.api.col.p0003l.r9.f0(r0)     // Catch: java.lang.Throwable -> L33f
            L37b:
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L33f
                r0.n(r9)     // Catch: java.lang.Throwable -> L33f
                return
            L381:
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "CameraUpdateFinish"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.p0003l.b3.D(r9)     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            L38c:
                java.lang.Object r9 = r9.obj     // Catch: java.lang.Throwable -> L5e
                com.amap.api.maps.model.CameraPosition r9 = (com.amap.api.maps.model.CameraPosition) r9     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.r9 r0 = r8.a     // Catch: java.lang.Throwable -> L3c5
                com.amap.api.col.3l.ba r0 = com.amap.api.col.p0003l.r9.w(r0)     // Catch: java.lang.Throwable -> L3c5
                java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r1 = com.amap.api.maps.AMap.OnCameraChangeListener.class
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L3c5
                java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L3c5
                if (r9 == 0) goto L3c9
                if (r0 == 0) goto L3c9
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L3c5
                if (r1 <= 0) goto L3c9
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L3c5
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L3bf
            L3af:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3bf
                if (r2 == 0) goto L3c1
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3bf
                com.amap.api.maps.AMap$OnCameraChangeListener r2 = (com.amap.api.maps.AMap.OnCameraChangeListener) r2     // Catch: java.lang.Throwable -> L3bf
                r2.onCameraChange(r9)     // Catch: java.lang.Throwable -> L3bf
                goto L3af
            L3bf:
                r9 = move-exception
                goto L3c3
            L3c1:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3bf
                goto L3c9
            L3c3:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3bf
                throw r9     // Catch: java.lang.Throwable -> L3c5
            L3c5:
                r9 = move-exception
                com.amap.api.col.p0003l.b3.D(r9)     // Catch: java.lang.Throwable -> L5e
            L3c9:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.amap.mapcore.MapConfig r9 = r9.q     // Catch: java.lang.Throwable -> L5e
                r9.addChangedCounter()     // Catch: java.lang.Throwable -> L5e
                goto L3ed
            L3d1:
                com.amap.api.col.3l.r9 r9 = r8.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.ae.gmap.GLMapEngine r9 = r9.Z     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3ed
                r9.triggerMainThread()     // Catch: java.lang.Throwable -> L5e
                return
            L3db:
                java.lang.Object r9 = r9.obj     // Catch: java.lang.Throwable -> L5e
                if (r9 == 0) goto L3e3
                java.util.Objects.toString(r9)     // Catch: java.lang.Throwable -> L5e
                goto L3e5
            L3e3:
                java.lang.String r9 = com.amap.api.col.p0003l.g4.f3375b     // Catch: java.lang.Throwable -> L5e
            L3e5:
                return
            L3e6:
                java.lang.String r0 = "AMapDelegateImp"
                java.lang.String r1 = "handleMessage"
                com.amap.api.col.p0003l.w5.p(r9, r0, r1)
            L3ed:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class k0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3895j;

        k0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3895j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3895j     // Catch: java.lang.Throwable -> La
                boolean r1 = r2.f3914b     // Catch: java.lang.Throwable -> La
                r0.setMapTextEnable(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class l implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        l(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                if (r1 == 0) goto L1b
                java.util.concurrent.atomic.AtomicBoolean r0 = com.amap.api.col.p0003l.r9.d(r0)
                boolean r0 = r0.get()
                if (r0 != 0) goto L1b
                com.amap.api.col.3l.r9 r0 = r2.a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                r1.removeNativeAllOverlay(r0)
            L1b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class l0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3896j;

        l0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3896j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3896j     // Catch: java.lang.Throwable -> La
                boolean r1 = r2.f3914b     // Catch: java.lang.Throwable -> La
                r0.setRoadArrowEnable(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class m extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3897j;

        m(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3897j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r3.f3897j     // Catch: java.lang.Throwable -> L12
                int r1 = com.amap.api.col.p0003l.r9.k0(r0)     // Catch: java.lang.Throwable -> L12
                com.amap.api.col.3l.r9 r2 = r3.f3897j     // Catch: java.lang.Throwable -> L12
                int r2 = com.amap.api.col.p0003l.r9.m0(r2)     // Catch: java.lang.Throwable -> L12
                r0.setCenterToPixel(r1, r2)     // Catch: java.lang.Throwable -> L12
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class m0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3898j;

        m0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3898j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r4 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r4.f3898j     // Catch: java.lang.Throwable -> Le
                boolean r1 = r4.f3914b     // Catch: java.lang.Throwable -> Le
                int r2 = r4.f3918f     // Catch: java.lang.Throwable -> Le
                int r3 = r4.f3919g     // Catch: java.lang.Throwable -> Le
                r0.setNaviLabelEnable(r1, r2, r3)     // Catch: java.lang.Throwable -> Le
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class n implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3900c;

        n(com.amap.api.col.p0003l.r9 r1, boolean r2, boolean r3) {
                r0 = this;
                r0.f3900c = r1
                r0.a = r2
                r0.f3899b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3900c     // Catch: java.lang.Throwable -> L33
                com.autonavi.base.amap.mapcore.MapConfig r0 = r0.q     // Catch: java.lang.Throwable -> L33
                boolean r0 = r0.isTrafficEnabled()     // Catch: java.lang.Throwable -> L33
                boolean r1 = r3.a     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L35
                com.amap.api.col.3l.r9 r0 = r3.f3900c     // Catch: java.lang.Throwable -> L33
                com.autonavi.base.amap.mapcore.MapConfig r0 = r0.q     // Catch: java.lang.Throwable -> L33
                boolean r1 = r3.f3899b     // Catch: java.lang.Throwable -> L33
                r0.setTrafficEnabled(r1)     // Catch: java.lang.Throwable -> L33
                com.amap.api.col.3l.r9 r0 = r3.f3900c     // Catch: java.lang.Throwable -> L33
                com.autonavi.base.ae.gmap.GLMapRender r0 = com.amap.api.col.p0003l.r9.s0(r0)     // Catch: java.lang.Throwable -> L33
                boolean r1 = r3.a     // Catch: java.lang.Throwable -> L33
                r0.setTrafficMode(r1)     // Catch: java.lang.Throwable -> L33
                com.amap.api.col.3l.r9 r0 = r3.f3900c     // Catch: java.lang.Throwable -> L33
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> L33
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> L33
                boolean r2 = r3.a     // Catch: java.lang.Throwable -> L33
                r1.setTrafficEnable(r0, r2)     // Catch: java.lang.Throwable -> L33
                com.amap.api.col.3l.r9 r0 = r3.f3900c     // Catch: java.lang.Throwable -> L33
                r0.resetRenderTime()     // Catch: java.lang.Throwable -> L33
                return
            L33:
                r0 = move-exception
                goto L36
            L35:
                return
            L36:
                com.amap.api.col.p0003l.b3.D(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class n0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3901j;

        n0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3901j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r3.f3901j     // Catch: java.lang.Exception -> Lc
                byte[] r1 = r3.f3920h     // Catch: java.lang.Exception -> Lc
                com.amap.api.maps.model.MyTrafficStyle r2 = r3.f3921i     // Catch: java.lang.Exception -> Lc
                r0.setTrafficStyleWithTexture(r1, r2)     // Catch: java.lang.Exception -> Lc
            Lc:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class o implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3902b;

        o(com.amap.api.col.p0003l.r9 r1, boolean r2) {
                r0 = this;
                r0.f3902b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 == 0) goto Lb
                com.amap.api.col.3l.r9 r0 = r2.f3902b
                r1 = 1
                r0.showIndoorSwitchControlsEnabled(r1)
                return
            Lb:
                com.amap.api.col.3l.r9 r0 = r2.f3902b
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)
                if (r0 == 0) goto L1e
                com.amap.api.col.3l.r9 r0 = r2.f3902b
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.n(r1)
            L1e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class o0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3903j;

        o0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3903j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r3.f3903j
                int r1 = r3.f3917e
                boolean r2 = r3.f3914b
                r0.z(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class p implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3904b;

        p(com.amap.api.col.p0003l.r9 r1, boolean r2) {
                r0 = this;
                r0.f3904b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3904b
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                if (r1 == 0) goto Lf
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                boolean r2 = r3.a
                r1.setOfflineDataEnable(r0, r2)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class p0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3905j;

        p0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3905j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3905j     // Catch: java.lang.Throwable -> La
                boolean r1 = r2.f3914b     // Catch: java.lang.Throwable -> La
                r0.setIndoorEnabled(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class q implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3906b;

        q(com.amap.api.col.p0003l.r9 r1, boolean r2) {
                r0 = this;
                r0.f3906b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3906b     // Catch: java.lang.Throwable -> Ld
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> Ld
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> Ld
                boolean r2 = r3.a     // Catch: java.lang.Throwable -> Ld
                r1.setLabelEnable(r0, r2)     // Catch: java.lang.Throwable -> Ld
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class q0 implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        q0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                com.amap.api.col.3l.r9 r0 = r1.a
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)
                if (r0 == 0) goto L17
                com.amap.api.col.3l.r9 r0 = r1.a
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)
                com.amap.api.col.3l.el r0 = r0.f()
                if (r0 == 0) goto L17
                r0.l()
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class r implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3907b;

        r(com.amap.api.col.p0003l.r9 r1, boolean r2) {
                r0 = this;
                r0.f3907b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3907b     // Catch: java.lang.Throwable -> Ld
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> Ld
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> Ld
                boolean r2 = r3.a     // Catch: java.lang.Throwable -> Ld
                r1.setRoadArrowEnable(r0, r2)     // Catch: java.lang.Throwable -> Ld
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class r0 extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3908j;

        r0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3908j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r3.f3908j
                int r1 = r3.f3917e
                boolean r2 = r3.f3914b
                r0.H(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class s implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3911d;

        s(com.amap.api.col.p0003l.r9 r1, boolean r2, int r3, int r4) {
                r0 = this;
                r0.f3911d = r1
                r0.a = r2
                r0.f3909b = r3
                r0.f3910c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                com.amap.api.col.3l.r9 r0 = r5.f3911d     // Catch: java.lang.Throwable -> L11
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> L11
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> L11
                boolean r2 = r5.a     // Catch: java.lang.Throwable -> L11
                int r3 = r5.f3909b     // Catch: java.lang.Throwable -> L11
                int r4 = r5.f3910c     // Catch: java.lang.Throwable -> L11
                r1.setNaviLabelEnable(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L11
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class s0 implements java.lang.Runnable {
        final /* synthetic */ android.view.MotionEvent a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3912b;

        s0(com.amap.api.col.p0003l.r9 r1, android.view.MotionEvent r2) {
                r0 = this;
                r0.f3912b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3912b     // Catch: java.lang.Throwable -> L13
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L13
                android.view.MotionEvent r1 = r3.a     // Catch: java.lang.Throwable -> L13
                float r1 = r1.getX()     // Catch: java.lang.Throwable -> L13
                android.view.MotionEvent r2 = r3.a     // Catch: java.lang.Throwable -> L13
                float r2 = r2.getY()     // Catch: java.lang.Throwable -> L13
                r0.addGestureSingleTapMessage(r1, r2)     // Catch: java.lang.Throwable -> L13
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class t implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3913b;

        t(com.amap.api.col.p0003l.r9 r1, boolean r2) {
                r0 = this;
                r0.f3913b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.r9 r0 = r2.f3913b     // Catch: java.lang.Throwable -> L9
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L9
                boolean r1 = r2.a     // Catch: java.lang.Throwable -> L9
                r0.setMapOpenLayerEnable(r1)     // Catch: java.lang.Throwable -> L9
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class t0 implements java.lang.Runnable {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3914b;

        /* renamed from: c, reason: collision with root package name */
        int f3915c;

        /* renamed from: d, reason: collision with root package name */
        int f3916d;

        /* renamed from: e, reason: collision with root package name */
        int f3917e;

        /* renamed from: f, reason: collision with root package name */
        int f3918f;

        /* renamed from: g, reason: collision with root package name */
        int f3919g;

        /* renamed from: h, reason: collision with root package name */
        byte[] f3920h;

        /* renamed from: i, reason: collision with root package name */
        com.amap.api.maps.model.MyTrafficStyle f3921i;

        private t0() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r1.f3914b = r0
                r1.f3918f = r0
                r1.f3919g = r0
                return
        }

        /* synthetic */ t0(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class u implements java.lang.Runnable {
        final /* synthetic */ byte[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.maps.model.MyTrafficStyle f3922b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3923c;

        u(com.amap.api.col.p0003l.r9 r1, byte[] r2, com.amap.api.maps.model.MyTrafficStyle r3) {
                r0 = this;
                r0.f3923c = r1
                r0.a = r2
                r0.f3922b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.3l.r9 r0 = r4.f3923c     // Catch: java.lang.Throwable -> Lf
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> Lf
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> Lf
                byte[] r2 = r4.a     // Catch: java.lang.Throwable -> Lf
                com.amap.api.maps.model.MyTrafficStyle r3 = r4.f3922b     // Catch: java.lang.Throwable -> Lf
                r1.setTrafficStyleWithTexture(r0, r2, r3)     // Catch: java.lang.Throwable -> Lf
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class u0 {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a implements java.lang.Runnable {
            final /* synthetic */ com.amap.api.col.p0003l.ef a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.3l.r9.u0 f3924b;

            a(com.amap.api.col.3l.r9.u0 r1, com.amap.api.col.p0003l.ef r2) {
                    r0 = this;
                    r0.f3924b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    com.amap.api.col.3l.ef r0 = r2.a
                    r1 = 0
                    r0.j(r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class b implements java.lang.Runnable {
            final /* synthetic */ com.amap.api.col.p0003l.ef a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.3l.r9.u0 f3925b;

            b(com.amap.api.col.3l.r9.u0 r1, com.amap.api.col.p0003l.ef r2) {
                    r0 = this;
                    r0.f3925b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    com.amap.api.col.3l.ef r0 = r2.a     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.r9$u0 r1 = r2.f3925b     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.r9 r1 = r1.a     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.z r1 = r1.t     // Catch: java.lang.Throwable -> L28
                    java.lang.String[] r1 = r1.floor_names     // Catch: java.lang.Throwable -> L28
                    r0.k(r1)     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.ef r0 = r2.a     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.r9$u0 r1 = r2.f3925b     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.r9 r1 = r1.a     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.z r1 = r1.t     // Catch: java.lang.Throwable -> L28
                    java.lang.String r1 = r1.activeFloorName     // Catch: java.lang.Throwable -> L28
                    r0.i(r1)     // Catch: java.lang.Throwable -> L28
                    com.amap.api.col.3l.ef r0 = r2.a     // Catch: java.lang.Throwable -> L28
                    boolean r0 = r0.o()     // Catch: java.lang.Throwable -> L28
                    if (r0 != 0) goto L28
                    com.amap.api.col.3l.ef r0 = r2.a     // Catch: java.lang.Throwable -> L28
                    r1 = 1
                    r0.j(r1)     // Catch: java.lang.Throwable -> L28
                L28:
                    return
            }
        }

        u0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public final void a(com.amap.api.col.p0003l.z r8) {
                r7 = this;
                com.amap.api.col.3l.r9 r0 = r7.a
                com.autonavi.base.amap.mapcore.MapConfig r0 = r0.q
                if (r0 == 0) goto L21b
                boolean r0 = r0.isIndoorEnable()
                if (r0 != 0) goto Le
                goto L21b
            Le:
                com.amap.api.col.3l.r9 r0 = r7.a
                com.amap.api.col.3l.i3 r0 = com.amap.api.col.p0003l.r9.F(r0)
                com.amap.api.col.3l.ef r0 = r0.e()
                r1 = 1101004800(0x41a00000, float:20.0)
                r2 = 0
                if (r8 != 0) goto Lca
                com.amap.api.col.3l.r9 r3 = r7.a     // Catch: java.lang.Throwable -> L4f
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L4f
                java.lang.Class<com.amap.api.maps.AMap$OnIndoorBuildingActiveListener> r4 = com.amap.api.maps.AMap.OnIndoorBuildingActiveListener.class
                int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> L4f
                java.util.List r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L4f
                if (r3 == 0) goto L50
                int r4 = r3.size()     // Catch: java.lang.Throwable -> L4f
                if (r4 <= 0) goto L50
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L4f
                r4 = 0
            L37:
                int r5 = r3.size()     // Catch: java.lang.Throwable -> L49
                if (r4 >= r5) goto L4b
                java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L49
                com.amap.api.maps.AMap$OnIndoorBuildingActiveListener r5 = (com.amap.api.maps.AMap.OnIndoorBuildingActiveListener) r5     // Catch: java.lang.Throwable -> L49
                r5.OnIndoorBuilding(r8)     // Catch: java.lang.Throwable -> L49
                int r4 = r4 + 1
                goto L37
            L49:
                r4 = move-exception
                goto L4d
            L4b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
                goto L50
            L4d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
                throw r4     // Catch: java.lang.Throwable -> L4f
            L4f:
            L50:
                com.amap.api.col.3l.r9 r3 = r7.a
                com.amap.api.col.3l.z r3 = r3.t
                if (r3 == 0) goto L59
                r4 = 0
                r3.f4280g = r4
            L59:
                boolean r3 = r0.o()
                if (r3 == 0) goto L6b
                com.amap.api.col.3l.r9 r3 = r7.a
                android.os.Handler r3 = r3.z0
                com.amap.api.col.3l.r9$u0$a r4 = new com.amap.api.col.3l.r9$u0$a
                r4.<init>(r7, r0)
                r3.post(r4)
            L6b:
                com.amap.api.col.3l.r9 r3 = r7.a
                com.autonavi.base.amap.mapcore.MapConfig r3 = r3.q
                boolean r4 = r3.isSetLimitZoomLevel()
                if (r4 == 0) goto L7e
                com.amap.api.col.3l.r9 r4 = r7.a
                com.autonavi.base.amap.mapcore.MapConfig r4 = r4.q
                float r4 = r4.getMaxZoomLevel()
                goto L80
            L7e:
                r4 = 1101004800(0x41a00000, float:20.0)
            L80:
                r3.maxZoomLevel = r4
                com.amap.api.col.3l.r9 r3 = r7.a     // Catch: java.lang.Throwable -> Lc9
                com.amap.api.col.3l.i r3 = com.amap.api.col.p0003l.r9.y0(r3)     // Catch: java.lang.Throwable -> Lc9
                boolean r3 = r3.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> Lc9
                if (r3 == 0) goto L21b
                com.amap.api.col.3l.r9 r3 = r7.a     // Catch: java.lang.Throwable -> Lc9
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> Lc9
                java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r4 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
                int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> Lc9
                java.util.List r3 = r3.a(r4)     // Catch: java.lang.Throwable -> Lc9
                if (r3 == 0) goto L21b
                int r4 = r3.size()     // Catch: java.lang.Throwable -> Lc9
                if (r4 <= 0) goto L21b
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lc9
                r4 = 0
            La8:
                int r5 = r3.size()     // Catch: java.lang.Throwable -> Lc2
                if (r4 >= r5) goto Lc4
                java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> Lc2
                com.autonavi.base.ae.gmap.listener.AMapWidgetListener r5 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r5     // Catch: java.lang.Throwable -> Lc2
                com.amap.api.col.3l.r9 r6 = r7.a     // Catch: java.lang.Throwable -> Lc2
                com.autonavi.base.amap.mapcore.MapConfig r6 = r6.q     // Catch: java.lang.Throwable -> Lc2
                float r6 = r6.getSZ()     // Catch: java.lang.Throwable -> Lc2
                r5.invalidateZoomController(r6)     // Catch: java.lang.Throwable -> Lc2
                int r4 = r4 + 1
                goto La8
            Lc2:
                r4 = move-exception
                goto Lc7
            Lc4:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
                goto L21b
            Lc7:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
                throw r4     // Catch: java.lang.Throwable -> Lc9
            Lc9:
            Lca:
                if (r8 == 0) goto Lee
                int[] r3 = r8.floor_indexs
                if (r3 == 0) goto Lee
                java.lang.String[] r4 = r8.floor_names
                if (r4 == 0) goto Lee
                int r3 = r3.length
                int r4 = r4.length
                if (r3 != r4) goto Lee
                r3 = 0
            Ld9:
                int[] r4 = r8.floor_indexs
                int r5 = r4.length
                if (r3 >= r5) goto Lee
                int r5 = r8.activeFloorIndex
                r4 = r4[r3]
                if (r5 != r4) goto Leb
                java.lang.String[] r4 = r8.floor_names
                r3 = r4[r3]
                r8.activeFloorName = r3
                goto Lee
            Leb:
                int r3 = r3 + 1
                goto Ld9
            Lee:
                if (r8 == 0) goto L104
                com.amap.api.col.3l.r9 r3 = r7.a
                com.amap.api.col.3l.z r3 = r3.t
                if (r3 == 0) goto L104
                int r3 = r3.activeFloorIndex
                int r4 = r8.activeFloorIndex
                if (r3 == r4) goto L104
                boolean r3 = r0.o()
                if (r3 == 0) goto L104
                goto L21b
            L104:
                if (r8 == 0) goto L14b
                com.amap.api.col.3l.r9 r3 = r7.a
                com.amap.api.col.3l.z r3 = r3.t
                if (r3 == 0) goto L11e
                java.lang.String r3 = r3.poiid
                java.lang.String r4 = r8.poiid
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L11e
                com.amap.api.col.3l.r9 r3 = r7.a
                com.amap.api.col.3l.z r3 = r3.t
                android.graphics.Point r3 = r3.f4280g
                if (r3 != 0) goto L14b
            L11e:
                com.amap.api.col.3l.r9 r3 = r7.a
                r3.t = r8
                com.autonavi.base.amap.mapcore.MapConfig r3 = r3.q
                if (r3 == 0) goto L14b
                android.graphics.Point r3 = r8.f4280g
                if (r3 != 0) goto L131
                android.graphics.Point r3 = new android.graphics.Point
                r3.<init>()
                r8.f4280g = r3
            L131:
                com.amap.api.col.3l.r9 r3 = r7.a
                com.autonavi.base.amap.mapcore.MapConfig r3 = r3.q
                com.autonavi.amap.mapcore.DPoint r3 = r3.getMapGeoCenter()
                if (r3 == 0) goto L14b
                com.amap.api.col.3l.r9 r4 = r7.a
                com.amap.api.col.3l.z r4 = r4.t
                android.graphics.Point r4 = r4.f4280g
                double r5 = r3.x
                int r5 = (int) r5
                r4.x = r5
                double r5 = r3.y
                int r3 = (int) r5
                r4.y = r3
            L14b:
                com.amap.api.col.3l.r9 r3 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.ba r3 = com.amap.api.col.p0003l.r9.w(r3)     // Catch: java.lang.Throwable -> L21b
                java.lang.Class<com.amap.api.maps.AMap$OnIndoorBuildingActiveListener> r4 = com.amap.api.maps.AMap.OnIndoorBuildingActiveListener.class
                int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> L21b
                java.util.List r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L21b
                if (r3 == 0) goto L17d
                int r4 = r3.size()     // Catch: java.lang.Throwable -> L21b
                if (r4 <= 0) goto L17d
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L21b
                r4 = 0
            L165:
                int r5 = r3.size()     // Catch: java.lang.Throwable -> L177
                if (r4 >= r5) goto L179
                java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L177
                com.amap.api.maps.AMap$OnIndoorBuildingActiveListener r5 = (com.amap.api.maps.AMap.OnIndoorBuildingActiveListener) r5     // Catch: java.lang.Throwable -> L177
                r5.OnIndoorBuilding(r8)     // Catch: java.lang.Throwable -> L177
                int r4 = r4 + 1
                goto L165
            L177:
                r8 = move-exception
                goto L17b
            L179:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L177
                goto L17d
            L17b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L177
                throw r8     // Catch: java.lang.Throwable -> L21b
            L17d:
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.autonavi.base.amap.mapcore.MapConfig r8 = r8.q     // Catch: java.lang.Throwable -> L21b
                boolean r3 = r8.isSetLimitZoomLevel()     // Catch: java.lang.Throwable -> L21b
                if (r3 == 0) goto L18f
                com.amap.api.col.3l.r9 r1 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.autonavi.base.amap.mapcore.MapConfig r1 = r1.q     // Catch: java.lang.Throwable -> L21b
                float r1 = r1.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L21b
            L18f:
                r8.maxZoomLevel = r1     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.i r8 = com.amap.api.col.p0003l.r9.y0(r8)     // Catch: java.lang.Throwable -> L21b
                boolean r8 = r8.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L21b
                if (r8 == 0) goto L1d7
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.ba r8 = com.amap.api.col.p0003l.r9.w(r8)     // Catch: java.lang.Throwable -> L21b
                java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r1 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L21b
                java.util.List r8 = r8.a(r1)     // Catch: java.lang.Throwable -> L21b
                if (r8 == 0) goto L1d7
                int r1 = r8.size()     // Catch: java.lang.Throwable -> L21b
                if (r1 <= 0) goto L1d7
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L21b
                r1 = 0
            L1b7:
                int r3 = r8.size()     // Catch: java.lang.Throwable -> L1d1
                if (r1 >= r3) goto L1d3
                java.lang.Object r3 = r8.get(r1)     // Catch: java.lang.Throwable -> L1d1
                com.autonavi.base.ae.gmap.listener.AMapWidgetListener r3 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r3     // Catch: java.lang.Throwable -> L1d1
                com.amap.api.col.3l.r9 r4 = r7.a     // Catch: java.lang.Throwable -> L1d1
                com.autonavi.base.amap.mapcore.MapConfig r4 = r4.q     // Catch: java.lang.Throwable -> L1d1
                float r4 = r4.getSZ()     // Catch: java.lang.Throwable -> L1d1
                r3.invalidateZoomController(r4)     // Catch: java.lang.Throwable -> L1d1
                int r1 = r1 + 1
                goto L1b7
            L1d1:
                r0 = move-exception
                goto L1d5
            L1d3:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L1d1
                goto L1d7
            L1d5:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L1d1
                throw r0     // Catch: java.lang.Throwable -> L21b
            L1d7:
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.i r8 = com.amap.api.col.p0003l.r9.y0(r8)     // Catch: java.lang.Throwable -> L21b
                boolean r8 = r8.isIndoorSwitchEnabled()     // Catch: java.lang.Throwable -> L21b
                if (r8 == 0) goto L200
                boolean r8 = r0.o()     // Catch: java.lang.Throwable -> L21b
                if (r8 != 0) goto L1f3
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.i r8 = com.amap.api.col.p0003l.r9.y0(r8)     // Catch: java.lang.Throwable -> L21b
                r1 = 1
                r8.setIndoorSwitchEnabled(r1)     // Catch: java.lang.Throwable -> L21b
            L1f3:
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                android.os.Handler r8 = r8.z0     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.r9$u0$b r1 = new com.amap.api.col.3l.r9$u0$b     // Catch: java.lang.Throwable -> L21b
                r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L21b
                r8.post(r1)     // Catch: java.lang.Throwable -> L21b
                goto L21b
            L200:
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.i r8 = com.amap.api.col.p0003l.r9.y0(r8)     // Catch: java.lang.Throwable -> L21b
                boolean r8 = r8.isIndoorSwitchEnabled()     // Catch: java.lang.Throwable -> L21b
                if (r8 != 0) goto L21b
                boolean r8 = r0.o()     // Catch: java.lang.Throwable -> L21b
                if (r8 == 0) goto L21b
                com.amap.api.col.3l.r9 r8 = r7.a     // Catch: java.lang.Throwable -> L21b
                com.amap.api.col.3l.i r8 = com.amap.api.col.p0003l.r9.y0(r8)     // Catch: java.lang.Throwable -> L21b
                r8.setIndoorSwitchEnabled(r2)     // Catch: java.lang.Throwable -> L21b
            L21b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class v extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3926j;

        v(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3926j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r2 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r2.f3926j     // Catch: java.lang.Throwable -> La
                boolean r1 = r2.f3914b     // Catch: java.lang.Throwable -> La
                r0.setConstructingRoadEnable(r1)     // Catch: java.lang.Throwable -> La
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class v0 implements com.amap.api.col.3l.ef.d {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        private v0(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ v0(com.amap.api.col.p0003l.r9 r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.ef.d
        public final void a(int r4) {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.a
                com.amap.api.col.3l.z r1 = r0.t
                if (r1 == 0) goto L15
                int[] r2 = r1.floor_indexs
                r2 = r2[r4]
                r1.activeFloorIndex = r2
                java.lang.String[] r2 = r1.floor_names
                r4 = r2[r4]
                r1.activeFloorName = r4
                r0.setIndoorBuildingInfo(r1)     // Catch: android.os.RemoteException -> L15
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class w implements java.lang.Runnable {
        final /* synthetic */ byte[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3927b;

        w(com.amap.api.col.p0003l.r9 r1, byte[] r2) {
                r0 = this;
                r0.f3927b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.r9 r0 = r3.f3927b     // Catch: java.lang.Throwable -> Ld
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> Ld
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> Ld
                byte[] r2 = r3.a     // Catch: java.lang.Throwable -> Ld
                r1.setTrafficStyleWithTextureData(r0, r2)     // Catch: java.lang.Throwable -> Ld
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class w0 implements java.lang.Runnable {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.maps.AMap.OnCacheRemoveListener f3928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3929c;

        public w0(com.amap.api.col.p0003l.r9 r1, android.content.Context r2, com.amap.api.maps.AMap.OnCacheRemoveListener r3) {
                r0 = this;
                r0.f3929c = r1
                r0.<init>()
                r0.a = r2
                r0.f3928b = r3
                return
        }

        public final boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof com.amap.api.col.3l.r9.w0
                return r1
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                r0 = 0
                r1 = 1
                android.content.Context r2 = r6.a     // Catch: java.lang.Throwable -> L24
                android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L24
                android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L24
                java.lang.String r3 = com.amap.api.col.p0003l.b3.f0(r2)     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = com.amap.api.col.p0003l.b3.v(r2)     // Catch: java.lang.Throwable -> L24
                java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L24
                r5.<init>(r3)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L24
                if (r3 == 0) goto L26
                boolean r3 = com.autonavi.base.amap.mapcore.FileUtil.deleteFile(r5)     // Catch: java.lang.Throwable -> L24
                goto L27
            L24:
                r2 = move-exception
                goto L63
            L26:
                r3 = 1
            L27:
                if (r3 == 0) goto L39
                java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L36
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L36
                boolean r3 = com.autonavi.base.amap.mapcore.FileUtil.deleteFile(r5)     // Catch: java.lang.Throwable -> L36
                if (r3 == 0) goto L39
                r3 = 1
                goto L3a
            L36:
                r2 = move-exception
                r1 = r3
                goto L63
            L39:
                r3 = 0
            L3a:
                if (r3 == 0) goto L43
                boolean r2 = com.amap.api.col.p0003l.b3.i0(r2)     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto L43
                goto L44
            L43:
                r1 = 0
            L44:
                com.amap.api.col.3l.r9 r2 = r6.f3929c     // Catch: java.lang.Throwable -> L24
                com.amap.api.maps.interfaces.IGlOverlayLayer r2 = com.amap.api.col.p0003l.r9.W(r2)     // Catch: java.lang.Throwable -> L24
                if (r2 == 0) goto L55
                com.amap.api.col.3l.r9 r2 = r6.f3929c     // Catch: java.lang.Throwable -> L24
                com.amap.api.maps.interfaces.IGlOverlayLayer r2 = com.amap.api.col.p0003l.r9.W(r2)     // Catch: java.lang.Throwable -> L24
                r2.clearTileCache()     // Catch: java.lang.Throwable -> L24
            L55:
                com.amap.api.col.3l.r9 r0 = r6.f3929c     // Catch: java.lang.Throwable -> L7a
                com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.Z     // Catch: java.lang.Throwable -> L7a
                if (r0 == 0) goto L7a
                com.amap.api.maps.AMap$OnCacheRemoveListener r0 = r6.f3928b     // Catch: java.lang.Throwable -> L7a
                if (r0 == 0) goto L7a
                r0.onRemoveCacheFinish(r1)     // Catch: java.lang.Throwable -> L7a
                return
            L63:
                com.amap.api.col.p0003l.b3.D(r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = "AMapDelegateImp"
                java.lang.String r4 = "RemoveCacheRunnable"
                com.amap.api.col.p0003l.w5.p(r2, r3, r4)     // Catch: java.lang.Throwable -> L7b
                com.amap.api.col.3l.r9 r1 = r6.f3929c     // Catch: java.lang.Throwable -> L7a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.Z     // Catch: java.lang.Throwable -> L7a
                if (r1 == 0) goto L7a
                com.amap.api.maps.AMap$OnCacheRemoveListener r1 = r6.f3928b     // Catch: java.lang.Throwable -> L7a
                if (r1 == 0) goto L7a
                r1.onRemoveCacheFinish(r0)     // Catch: java.lang.Throwable -> L7a
            L7a:
                return
            L7b:
                r0 = move-exception
                com.amap.api.col.3l.r9 r2 = r6.f3929c     // Catch: java.lang.Throwable -> L89
                com.autonavi.base.ae.gmap.GLMapEngine r2 = r2.Z     // Catch: java.lang.Throwable -> L89
                if (r2 == 0) goto L89
                com.amap.api.maps.AMap$OnCacheRemoveListener r2 = r6.f3928b     // Catch: java.lang.Throwable -> L89
                if (r2 == 0) goto L89
                r2.onRemoveCacheFinish(r1)     // Catch: java.lang.Throwable -> L89
            L89:
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class x implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        x(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.3l.r9 r0 = r4.a     // Catch: java.lang.Throwable -> L4a
                com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q     // Catch: java.lang.Throwable -> L4a
                int r0 = com.amap.api.col.p0003l.r9.k0(r0)     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r2 = r4.a     // Catch: java.lang.Throwable -> L4a
                int r2 = r2.d0     // Catch: java.lang.Throwable -> L4a
                int r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L4a
                r2 = 0
                int r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L4a
                r1.setAnchorX(r0)     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r0 = r4.a     // Catch: java.lang.Throwable -> L4a
                com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q     // Catch: java.lang.Throwable -> L4a
                int r0 = com.amap.api.col.p0003l.r9.m0(r0)     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r3 = r4.a     // Catch: java.lang.Throwable -> L4a
                int r3 = r3.e0     // Catch: java.lang.Throwable -> L4a
                int r0 = java.lang.Math.min(r0, r3)     // Catch: java.lang.Throwable -> L4a
                int r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L4a
                r1.setAnchorY(r0)     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r0 = r4.a     // Catch: java.lang.Throwable -> L4a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z     // Catch: java.lang.Throwable -> L4a
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r2 = r4.a     // Catch: java.lang.Throwable -> L4a
                com.autonavi.base.amap.mapcore.MapConfig r2 = r2.q     // Catch: java.lang.Throwable -> L4a
                int r2 = r2.getAnchorX()     // Catch: java.lang.Throwable -> L4a
                com.amap.api.col.3l.r9 r3 = r4.a     // Catch: java.lang.Throwable -> L4a
                com.autonavi.base.amap.mapcore.MapConfig r3 = r3.q     // Catch: java.lang.Throwable -> L4a
                int r3 = r3.getAnchorY()     // Catch: java.lang.Throwable -> L4a
                r1.setProjectionCenter(r0, r2, r3)     // Catch: java.lang.Throwable -> L4a
            L4a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class y extends com.amap.api.col.3l.r9.t0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.r9 f3930j;

        y(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.f3930j = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.r9.t0, java.lang.Runnable
        public final void run() {
                r4 = this;
                super.run()
                com.amap.api.col.3l.r9 r0 = r4.f3930j
                int r1 = r4.f3917e
                int r2 = r4.f3915c
                int r3 = r4.f3916d
                r0.g(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class z implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.r9 a;

        z(com.amap.api.col.p0003l.r9 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                com.amap.api.col.3l.r9 r0 = r5.a
                com.autonavi.base.ae.gmap.GLMapEngine r1 = r0.Z
                if (r1 == 0) goto L17
                int r0 = com.amap.api.col.p0003l.r9.g0(r0)
                com.amap.api.col.3l.r9 r2 = r5.a
                com.amap.api.col.3l.z r2 = r2.t
                java.lang.String r3 = r2.activeFloorName
                int r4 = r2.activeFloorIndex
                java.lang.String r2 = r2.poiid
                r1.setIndoorBuildingToBeActive(r0, r3, r4, r2)
            L17:
                return
        }
    }

    public r9(com.autonavi.base.amap.api.mapcore.IGLSurfaceView r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public r9(com.autonavi.base.amap.api.mapcore.IGLSurfaceView r8, android.content.Context r9, boolean r10) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.a = r0
            com.amap.api.col.3l.ba r1 = new com.amap.api.col.3l.ba
            r1.<init>()
            r7.f3857b = r1
            r1 = 0
            r7.f3865h = r1
            r7.f3866i = r1
            r7.m = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r1)
            r7.o = r2
            r7.p = r1
            com.autonavi.base.amap.mapcore.MapConfig r2 = new com.autonavi.base.amap.mapcore.MapConfig
            r3 = 1
            r2.<init>(r3)
            r7.q = r2
            r7.r = r1
            r7.s = r1
            r7.w = r1
            r7.x = r1
            r7.y = r0
            r7.z = r0
            r7.A = r1
            r7.B = r1
            r7.C = r1
            r7.D = r1
            r7.E = r1
            r7.F = r3
            r7.G = r3
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7.H = r2
            r7.I = r3
            r7.J = r0
            r7.N = r1
            r7.O = r1
            r7.P = r1
            r2 = -1
            r7.R = r2
            r7.S = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.T = r4
            r7.W = r0
            r4 = -1
            r7.X = r4
            r7.f3860c0 = r1
            r4 = 0
            r7.f0 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.g0 = r4
            r7.h0 = r4
            r7.i0 = r3
            r7.j0 = r1
            r7.k0 = r1
            r7.l0 = r1
            r7.m0 = r1
            r7.n0 = r1
            r7.o0 = r1
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock
            r4.<init>()
            r7.p0 = r4
            r7.q0 = r1
            r7.y0 = r3
            com.amap.api.col.3l.r9$k r4 = new com.amap.api.col.3l.r9$k
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r7, r5)
            r7.z0 = r4
            com.amap.api.col.3l.r9$b r4 = new com.amap.api.col.3l.r9$b
            r4.<init>(r7)
            r7.A0 = r4
            com.amap.api.col.3l.r9$m r4 = new com.amap.api.col.3l.r9$m
            r4.<init>(r7)
            r7.B0 = r4
            com.amap.api.col.3l.r9$y r4 = new com.amap.api.col.3l.r9$y
            r4.<init>(r7)
            r7.C0 = r4
            com.amap.api.col.3l.r9$i0 r4 = new com.amap.api.col.3l.r9$i0
            r4.<init>(r7)
            r7.D0 = r4
            com.amap.api.col.3l.r9$j0 r4 = new com.amap.api.col.3l.r9$j0
            r4.<init>(r7)
            r7.E0 = r4
            com.amap.api.col.3l.r9$k0 r4 = new com.amap.api.col.3l.r9$k0
            r4.<init>(r7)
            r7.F0 = r4
            com.amap.api.col.3l.r9$l0 r4 = new com.amap.api.col.3l.r9$l0
            r4.<init>(r7)
            r7.G0 = r4
            com.amap.api.col.3l.r9$m0 r4 = new com.amap.api.col.3l.r9$m0
            r4.<init>(r7)
            r7.H0 = r4
            com.amap.api.col.3l.r9$v r4 = new com.amap.api.col.3l.r9$v
            r4.<init>(r7)
            r7.I0 = r4
            com.amap.api.col.3l.r9$g0 r4 = new com.amap.api.col.3l.r9$g0
            r4.<init>(r7)
            r7.J0 = r4
            com.amap.api.col.3l.r9$n0 r4 = new com.amap.api.col.3l.r9$n0
            r4.<init>(r7)
            r7.K0 = r4
            com.amap.api.col.3l.r9$o0 r4 = new com.amap.api.col.3l.r9$o0
            r4.<init>(r7)
            r7.L0 = r4
            com.amap.api.col.3l.r9$p0 r4 = new com.amap.api.col.3l.r9$p0
            r4.<init>(r7)
            r7.M0 = r4
            com.amap.api.col.3l.r9$q0 r4 = new com.amap.api.col.3l.r9$q0
            r4.<init>(r7)
            r7.N0 = r4
            com.amap.api.col.3l.r9$r0 r4 = new com.amap.api.col.3l.r9$r0
            r4.<init>(r7)
            r7.O0 = r4
            java.lang.String r4 = ""
            r7.Q0 = r4
            r7.R0 = r4
            r7.S0 = r1
            r7.T0 = r1
            r7.U0 = r1
            com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r4 = new com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo
            r4.<init>()
            r7.V0 = r4
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            r7.W0 = r4
            r4 = 0
            r7.X0 = r4
            r7.Y0 = r0
            r7.Z0 = r0
            r4 = 16
            float[] r5 = new float[r4]
            r7.a1 = r5
            float[] r5 = new float[r4]
            r7.b1 = r5
            float[] r4 = new float[r4]
            r7.c1 = r4
            r7.d1 = r0
            r0 = 12
            float[] r0 = new float[r0]
            r7.e1 = r0
            java.lang.String r0 = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}"
            r7.f1 = r0
            java.lang.String r0 = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}"
            r7.g1 = r0
            r7.h1 = r2
            r7.Y = r9
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r9, r0)
            com.amap.api.col.3l.ft$c r2 = r0.a
            com.amap.api.col.3l.ft$c r4 = com.amap.api.col.3l.ft.c.a
            if (r2 != r4) goto L156
            com.amap.api.col.p0003l.d3.d(r9)
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r5 = "init map delegate"
            com.amap.api.col.p0003l.d3.e(r2, r5)
        L156:
            com.autonavi.extra.b r2 = new com.autonavi.extra.b
            r2.<init>()
            r7.P0 = r2
            r2.a()
            com.autonavi.extra.b r2 = r7.P0
            r2.b()
            android.content.Context r2 = r7.Y
            com.amap.api.col.p0003l.w5.h(r2)
            com.amap.api.col.3l.p2 r2 = com.amap.api.col.p0003l.p2.a()
            android.content.Context r5 = r7.Y
            r2.b(r5)
            java.lang.String r2 = com.amap.api.col.p0003l.f4.g(r9)
            com.amap.api.col.p0003l.ha.f3469b = r2
            android.content.Context r2 = r7.Y
            com.amap.api.col.p0003l.h2.a(r2)
            com.amap.api.col.3l.ja r2 = new com.amap.api.col.3l.ja
            r2.<init>(r7)
            r7.f3858b0 = r2
            com.autonavi.base.ae.gmap.GLMapRender r2 = new com.autonavi.base.ae.gmap.GLMapRender
            r2.<init>(r7)
            r7.f3856a0 = r2
            r7.f3867j = r8
            r8.setRenderer(r2)
            com.amap.api.col.3l.c r2 = new com.amap.api.col.3l.c
            android.content.Context r5 = r7.Y
            r2.<init>(r7, r5)
            r7.l = r2
            com.autonavi.base.ae.gmap.GLMapEngine r5 = new com.autonavi.base.ae.gmap.GLMapEngine
            android.content.Context r6 = r7.Y
            r5.<init>(r6, r7)
            r7.Z = r5
            com.amap.api.col.3l.eh r5 = new com.amap.api.col.3l.eh
            android.content.Context r6 = r7.Y
            r5.<init>(r6, r7, r2)
            r7.f3868k = r5
            com.amap.api.col.3l.i r5 = new com.amap.api.col.3l.i
            r5.<init>(r7)
            r7.f3864g = r5
            com.amap.api.col.3l.i3 r5 = r7.f3868k
            com.amap.api.col.3l.r9$v0 r6 = new com.amap.api.col.3l.r9$v0
            r6.<init>(r7, r1)
            r5.j(r6)
            com.amap.api.col.3l.r9$u0 r5 = new com.amap.api.col.3l.r9$u0
            r5.<init>(r7)
            r7.t0 = r5
            r8.setRenderMode(r1)
            com.autonavi.base.ae.gmap.GLMapRender r8 = r7.f3856a0
            r5 = 1097859072(0x41700000, float:15.0)
            r8.setRenderFps(r5)
            com.autonavi.base.ae.gmap.GLMapEngine r8 = r7.Z
            r8.setMapListener(r7)
            com.amap.api.col.3l.f r8 = new com.amap.api.col.3l.f
            r8.<init>(r7)
            r7.f3863f = r8
            com.amap.api.col.3l.aa r8 = new com.amap.api.col.3l.aa
            r8.<init>(r7)
            r7.a = r8
            com.amap.api.col.3l.a0 r8 = new com.amap.api.col.3l.a0
            android.content.Context r5 = r7.Y
            r8.<init>(r5)
            r7.f3861d = r8
            com.amap.api.col.3l.i3 r5 = r7.f3868k
            r8.l(r5)
            com.amap.api.col.3l.a0 r8 = r7.f3861d
            com.amap.api.col.3l.s1 r5 = new com.amap.api.col.3l.s1
            r5.<init>(r2, r9)
            r8.s(r5)
            com.amap.api.col.3l.ea r8 = new com.amap.api.col.3l.ea
            android.content.Context r9 = r7.Y
            r8.<init>(r9, r7)
            r7.K = r8
            com.amap.api.col.3l.b0 r8 = new com.amap.api.col.3l.b0
            android.content.Context r9 = r7.Y
            r8.<init>(r9)
            r7.v = r8
            com.amap.api.col.3l.x1 r8 = new com.amap.api.col.3l.x1
            android.content.Context r9 = r7.Y
            r8.<init>(r9, r7)
            r7.U = r8
            com.amap.api.col.3l.z1 r8 = new com.amap.api.col.3l.z1
            android.content.Context r9 = r7.Y
            r8.<init>(r9)
            r7.V = r8
            r8.b(r7)
            r7.q(r10)
            com.autonavi.base.amap.mapcore.MapConfig r8 = r7.q
            if (r8 == 0) goto L22c
            boolean r8 = r8.isAbroadEnable()
            goto L22d
        L22c:
            r8 = 0
        L22d:
            com.amap.api.col.3l.v8 r9 = new com.amap.api.col.3l.v8
            android.content.Context r10 = r7.Y
            r9.<init>(r7, r10, r8)
            r7.w0 = r9
            r9.c(r7)
            com.amap.api.col.3l.ft$c r8 = r0.a
            if (r8 == r4) goto L242
            com.autonavi.base.amap.mapcore.MapConfig r8 = r7.q
            r8.setMapEnable(r1)
        L242:
            com.autonavi.base.ae.gmap.GLMapEngine r8 = r7.Z
            int r8 = r8.getEngineIDWithType(r3)
            r7.n = r8
            return
    }

    private void B(android.view.MotionEvent r7) {
            r6 = this;
            boolean r0 = r6.x
            if (r0 == 0) goto L36
            com.amap.api.maps.model.GLTFOverlay r0 = r6.z
            if (r0 != 0) goto L9
            goto L36
        L9:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            r1 = 1114636288(0x42700000, float:60.0)
            float r7 = r7 - r1
            int r7 = (int) r7
            com.amap.api.maps.model.GLTFOverlay r1 = r6.z
            com.amap.api.maps.model.LatLng r1 = r1.getLatlng()
            if (r1 == 0) goto L36
            com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.DPoint.obtain()
            r6.getPixel2LatLng(r0, r7, r1)
            com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
            double r2 = r1.y
            double r4 = r1.x
            r7.<init>(r2, r4)
            r1.recycle()
            com.amap.api.maps.model.GLTFOverlay r0 = r6.z
            r0.setLatLng(r7)
        L36:
            return
    }

    private void C(com.amap.api.maps.model.CameraPosition r3) {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            java.lang.String r0 = r0.getMapLanguage()
            java.lang.String r1 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            boolean r3 = r2.J(r3)
            boolean r0 = r2.G
            if (r3 == r0) goto L2a
            r2.G = r3
            int r0 = r2.n
            r2.z(r0, r3)
            return
        L1e:
            boolean r3 = r2.G
            if (r3 != 0) goto L2a
            r3 = 1
            r2.G = r3
            int r0 = r2.n
            r2.z(r0, r3)
        L2a:
            return
    }

    private void D(boolean r1) {
            r0 = this;
            r0.i0 = r1
            return
    }

    private float E() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto Ld
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.getMapConfig()
            float r0 = r0.getSZ()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    static /* synthetic */ com.amap.api.col.p0003l.i3 F(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.i3 r0 = r0.f3868k
            return r0
    }

    private void G(int r2) {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 == 0) goto L7
            r0 = 0
            r1.j0 = r0
        L7:
            com.autonavi.base.ae.gmap.GLMapRender r0 = r1.f3856a0
            if (r0 == 0) goto Le
            r0.renderPause()
        Le:
            r1.T(r2)
            return
    }

    private void I(android.view.MotionEvent r2) {
            r1 = this;
            com.amap.api.col.3l.r9$s0 r0 = new com.amap.api.col.3l.r9$s0
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
            return
    }

    private boolean J(com.amap.api.maps.model.CameraPosition r4) {
            r3 = this;
            float r0 = r4.zoom
            r1 = 1086324736(0x40c00000, float:6.0)
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La
            return r2
        La:
            boolean r4 = r4.isAbroad
            r0 = 1
            if (r4 != 0) goto L26
            com.autonavi.base.amap.mapcore.MapConfig r4 = r3.q
            if (r4 == 0) goto L25
            com.autonavi.base.amap.mapcore.Rectangle r4 = r4.getGeoRectangle()     // Catch: java.lang.Throwable -> L21
            com.autonavi.amap.mapcore.IPoint[] r4 = r4.getClipRect()     // Catch: java.lang.Throwable -> L21
            boolean r4 = com.amap.api.col.p0003l.u2.c(r4)     // Catch: java.lang.Throwable -> L21
            r4 = r4 ^ r0
            return r4
        L21:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
        L25:
            return r2
        L26:
            return r0
    }

    private void K() {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 != 0) goto L5
            return
        L5:
            com.amap.api.col.3l.ja r0 = r1.f3858b0
            r0.b()
            r0 = 1
            r1.f3860c0 = r0
            r1.j0 = r0
            r1.stopAnimation()     // Catch: android.os.RemoteException -> L12
        L12:
            return
    }

    private void L(int r1) {
            r0 = this;
            r0.T(r1)
            com.autonavi.base.ae.gmap.GLMapRender r1 = r0.f3856a0
            if (r1 == 0) goto La
            r1.renderResume()
        La:
            return
    }

    private boolean M(android.view.MotionEvent r8) {
            r7 = this;
            r0 = 0
            com.amap.api.col.3l.ba r1 = r7.f3857b     // Catch: java.lang.Throwable -> L56
            java.lang.Class<com.amap.api.maps.AMap$OnPolylineClickListener> r2 = com.amap.api.maps.AMap.OnPolylineClickListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L56
            java.util.List r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L56
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L56
            if (r2 <= 0) goto L56
            com.autonavi.amap.mapcore.DPoint r2 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> L56
            float r3 = r8.getX()     // Catch: java.lang.Throwable -> L56
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L56
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L56
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L56
            r7.getPixel2LatLng(r3, r8, r2)     // Catch: java.lang.Throwable -> L56
            com.amap.api.maps.model.LatLng r8 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L56
            double r3 = r2.y     // Catch: java.lang.Throwable -> L56
            double r5 = r2.x     // Catch: java.lang.Throwable -> L56
            r8.<init>(r3, r5)     // Catch: java.lang.Throwable -> L56
            r2.recycle()     // Catch: java.lang.Throwable -> L56
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r7.l     // Catch: java.lang.Throwable -> L56
            r3 = 2
            com.amap.api.maps.model.Polyline r8 = r2.getHitOverlay(r8, r3)     // Catch: java.lang.Throwable -> L56
            if (r8 == 0) goto L56
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L50
        L40:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L50
            com.amap.api.maps.AMap$OnPolylineClickListener r3 = (com.amap.api.maps.AMap.OnPolylineClickListener) r3     // Catch: java.lang.Throwable -> L50
            r3.onPolylineClick(r8)     // Catch: java.lang.Throwable -> L50
            goto L40
        L50:
            r8 = move-exception
            goto L54
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            return r0
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r8     // Catch: java.lang.Throwable -> L56
        L56:
            return r0
    }

    static /* synthetic */ boolean N(com.amap.api.col.p0003l.r9 r0) {
            boolean r0 = r0.F
            return r0
    }

    private void O() {
            r6 = this;
            r0 = 1
            r6.f3860c0 = r0
            r0 = 0
            r6.j0 = r0
            boolean r1 = r6.B
            if (r1 == 0) goto Lc
            r6.B = r0
        Lc:
            boolean r1 = r6.A
            if (r1 == 0) goto L12
            r6.A = r0
        L12:
            boolean r1 = r6.C
            if (r1 == 0) goto L18
            r6.C = r0
        L18:
            r1 = 0
            boolean r2 = r6.w     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L5f
            com.amap.api.col.3l.ba r2 = r6.f3857b     // Catch: java.lang.Throwable -> L51
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r3 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> L51
            java.util.List r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L55
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r3 <= 0) goto L55
            com.amap.api.maps.model.Marker r3 = r6.y     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L55
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            r3 = 0
        L37:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L4b
            if (r3 >= r4) goto L4d
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L4b
            com.amap.api.maps.AMap$OnMarkerDragListener r4 = (com.amap.api.maps.AMap.OnMarkerDragListener) r4     // Catch: java.lang.Throwable -> L4b
            com.amap.api.maps.model.Marker r5 = r6.y     // Catch: java.lang.Throwable -> L4b
            r4.onMarkerDragEnd(r5)     // Catch: java.lang.Throwable -> L4b
            int r3 = r3 + 1
            goto L37
        L4b:
            r3 = move-exception
            goto L53
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            r6.y = r1     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r2 = move-exception
            goto L58
        L53:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r3     // Catch: java.lang.Throwable -> L51
        L55:
            r6.w = r0     // Catch: java.lang.Throwable -> L51
            goto L5f
        L58:
            java.lang.String r3 = "AMapDelegateImp"
            java.lang.String r4 = "OnMarkerDragListener.onMarkerDragEnd"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
        L5f:
            boolean r2 = r6.x
            if (r2 == 0) goto L6b
            com.amap.api.maps.model.GLTFOverlay r2 = r6.z
            if (r2 == 0) goto L69
            r6.z = r1
        L69:
            r6.x = r0
        L6b:
            return
    }

    private void P(int r2) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L2b
            if (r2 != 0) goto L19
            boolean r2 = r0.b()
            if (r2 == 0) goto L2b
            com.amap.api.col.3l.i3 r2 = r1.f3868k
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.o(r0)
            com.amap.api.col.3l.i3 r2 = r1.f3868k
            r2.c()
            return
        L19:
            boolean r2 = r0.b()
            if (r2 != 0) goto L2b
            com.amap.api.col.3l.i3 r2 = r1.f3868k
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.o(r0)
            com.amap.api.col.3l.i3 r2 = r1.f3868k
            r2.c()
        L2b:
            return
    }

    private boolean Q(android.view.MotionEvent r10) throws android.os.RemoteException {
            r9 = this;
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()
            float r1 = r10.getX()
            int r1 = (int) r1
            float r10 = r10.getY()
            int r10 = (int) r10
            r9.getPixel2LatLng(r1, r10, r0)
            com.amap.api.maps.model.LatLng r10 = new com.amap.api.maps.model.LatLng
            double r1 = r0.y
            double r3 = r0.x
            r10.<init>(r1, r3)
            r0.recycle()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r9.l
            r1 = 1
            com.amap.api.maps.model.BaseOverlay r10 = r0.getHitBaseOverlay(r10, r1)
            boolean r0 = r10 instanceof com.amap.api.maps.model.Marker
            r2 = 0
            if (r0 == 0) goto Lce
            r0 = r10
            com.amap.api.maps.model.Marker r0 = (com.amap.api.maps.model.Marker) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r3 = "MARKER"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lce
            com.amap.api.maps.model.Marker r10 = (com.amap.api.maps.model.Marker) r10     // Catch: java.lang.Throwable -> Lc1
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r9.l     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = r10.getId()     // Catch: java.lang.Throwable -> Lc1
            r0.set2Top(r3)     // Catch: java.lang.Throwable -> Lc1
            com.amap.api.col.3l.ba r0 = r9.f3857b     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerClickListener> r3 = com.amap.api.maps.AMap.OnMarkerClickListener.class
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> Lc1
            java.util.List r3 = r0.a(r3)     // Catch: java.lang.Throwable -> Lc1
            if (r3 == 0) goto L95
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L91
            if (r0 <= 0) goto L95
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L91
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L71
            java.lang.Object r0 = r3.get(r2)     // Catch: java.lang.Throwable -> L6c
            com.amap.api.maps.AMap$OnMarkerClickListener r0 = (com.amap.api.maps.AMap.OnMarkerClickListener) r0     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.onMarkerClick(r10)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            return r1
        L6c:
            r0 = move-exception
            r10 = r0
            goto L8f
        L6f:
            r1 = r0
            goto L8d
        L71:
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L6c
            r4 = 0
        L76:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L88
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L6c
            com.amap.api.maps.AMap$OnMarkerClickListener r5 = (com.amap.api.maps.AMap.OnMarkerClickListener) r5     // Catch: java.lang.Throwable -> L6c
            boolean r5 = r5.onMarkerClick(r10)     // Catch: java.lang.Throwable -> L6c
            r4 = r4 | r5
            goto L76
        L88:
            if (r4 == 0) goto L8c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            return r1
        L8c:
            r1 = r4
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            goto L95
        L8f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r10     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            r10 = r0
            r3 = r9
            goto Lc6
        L95:
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r9.l     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = r10.getId()     // Catch: java.lang.Throwable -> Lc1
            r0.showInfoWindow(r3)     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r10.isViewMode()     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto Lc4
            com.amap.api.maps.model.LatLng r10 = r10.getPosition()     // Catch: java.lang.Throwable -> Lc1
            if (r10 == 0) goto Lc4
            com.autonavi.amap.mapcore.IPoint r8 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> Lc1
            double r4 = r10.latitude     // Catch: java.lang.Throwable -> Lc1
            double r6 = r10.longitude     // Catch: java.lang.Throwable -> Lc1
            r3 = r9
            r3.latlon2Geo(r4, r6, r8)     // Catch: java.lang.Throwable -> Lbe
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r10 = com.amap.api.col.p0003l.p.e(r8)     // Catch: java.lang.Throwable -> Lbe
            r9.moveCamera(r10)     // Catch: java.lang.Throwable -> Lbe
            return r1
        Lbe:
            r0 = move-exception
        Lbf:
            r10 = r0
            goto Lc6
        Lc1:
            r0 = move-exception
            r3 = r9
            goto Lbf
        Lc4:
            r3 = r9
            return r1
        Lc6:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "onMarkerTap"
            com.amap.api.col.p0003l.w5.p(r10, r0, r1)
            goto Lcf
        Lce:
            r3 = r9
        Lcf:
            return r2
    }

    static /* synthetic */ boolean R(com.amap.api.col.p0003l.r9 r0) {
            boolean r0 = r0.k0
            return r0
    }

    private void S() {
            r5 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r5.Z
            if (r0 == 0) goto L49
            int r1 = r5.n
            com.autonavi.amap.api.mapcore.IGLMapState r0 = r0.getNewMapState(r1)
            com.autonavi.base.ae.gmap.GLMapState r0 = (com.autonavi.base.ae.gmap.GLMapState) r0
            if (r0 == 0) goto L49
            com.autonavi.amap.mapcore.IPoint r1 = com.autonavi.amap.mapcore.IPoint.obtain()
            r0.recalculate()
            r0.getMapGeoCenter(r1)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r5.q
            int r3 = r1.x
            double r3 = (double) r3
            r2.setSX(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r5.q
            int r3 = r1.y
            double r3 = (double) r3
            r2.setSY(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r5.q
            float r3 = r0.getMapZoomer()
            r2.setSZ(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r5.q
            float r3 = r0.getCameraDegree()
            r2.setSC(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r5.q
            float r3 = r0.getMapAngle()
            r2.setSR(r3)
            r0.recycle()
            r1.recycle()
        L49:
            return
    }

    private void T(int r2) {
            r1 = this;
            com.amap.api.col.3l.r9$f r0 = new com.amap.api.col.3l.r9$f
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
            return
    }

    private boolean U(android.view.MotionEvent r6) {
            r5 = this;
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()
            float r1 = r6.getX()
            int r1 = (int) r1
            float r6 = r6.getY()
            int r6 = (int) r6
            r5.getPixel2LatLng(r1, r6, r0)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r1 = r0.y
            double r3 = r0.x
            r6.<init>(r1, r3)
            r0.recycle()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r5.l
            r1 = 3
            com.amap.api.maps.model.BaseOverlay r6 = r0.getHitBaseOverlay(r6, r1)
            boolean r0 = r6 instanceof com.amap.api.maps.model.GLTFOverlay
            r1 = 0
            if (r0 != 0) goto L2a
            return r1
        L2a:
            com.amap.api.maps.model.GLTFOverlay r6 = (com.amap.api.maps.model.GLTFOverlay) r6
            boolean r0 = r6.isClickable()
            if (r0 != 0) goto L33
            return r1
        L33:
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r5.l     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r6.getId()     // Catch: java.lang.Throwable -> L41
            r0.set2Top(r2)     // Catch: java.lang.Throwable -> L41
            r6.tapClick()     // Catch: java.lang.Throwable -> L41
            r6 = 1
            return r6
        L41:
            r6 = move-exception
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r2 = "onGLTFTap"
            com.amap.api.col.p0003l.w5.p(r6, r0, r2)
            return r1
    }

    static /* synthetic */ boolean V(com.amap.api.col.p0003l.r9 r1) {
            r0 = 0
            r1.k0 = r0
            return r0
    }

    static /* synthetic */ com.amap.api.maps.interfaces.IGlOverlayLayer W(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r0.l
            return r0
    }

    private com.amap.api.maps.model.LatLng X() {
            r7 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q
            if (r0 == 0) goto L22
            double r0 = r0.getSX()
            com.autonavi.base.amap.mapcore.MapConfig r2 = r7.q
            double r2 = r2.getSY()
            r4 = 20
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r0, r2, r4)
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            double r2 = r0.y
            double r4 = r0.x
            r6 = 0
            r1.<init>(r2, r4, r6)
            r0.recycle()
            return r1
        L22:
            r0 = 0
            return r0
    }

    private boolean Y(int r3) {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto La
            r1 = 7
            boolean r3 = r0.getSrvViewStateBoolValue(r3, r1)
            return r3
        La:
            r3 = 0
            return r3
    }

    private boolean Z(android.view.MotionEvent r7) {
            r6 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r6.l
            r1 = 0
            if (r0 == 0) goto L3a
            com.amap.api.maps.AMap$OnMultiPointClickListener r0 = r6.v0
            if (r0 == 0) goto L3a
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r6.Z
            if (r2 == 0) goto L3a
            float r2 = r7.getX()
            int r2 = (int) r2
            float r7 = r7.getY()
            int r7 = (int) r7
            r6.getPixel2LatLng(r2, r7, r0)
            com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
            double r2 = r0.y
            double r4 = r0.x
            r7.<init>(r2, r4)
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r6.l
            com.amap.api.maps.model.MultiPointItem r7 = r2.getMultiPointItem(r7)
            if (r7 != 0) goto L30
            return r1
        L30:
            com.amap.api.maps.AMap$OnMultiPointClickListener r1 = r6.v0
            boolean r7 = r1.onPointClick(r7)
            r0.recycle()
            return r7
        L3a:
            return r1
    }

    private synchronized void a0() {
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.amap.api.col.3l.e> r0 = r4.T     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.amap.api.col.3l.e> r1 = r4.T     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        Lb:
            if (r2 >= r1) goto L21
            java.util.List<com.amap.api.col.3l.e> r3 = r4.T     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.3l.e r3 = (com.amap.api.col.p0003l.e) r3     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.BitmapDescriptor r3 = r3.a()     // Catch: java.lang.Throwable -> L1f
            r3.recycle()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 + 1
            goto Lb
        L1f:
            r1 = move-exception
            goto L29
        L21:
            java.util.List<com.amap.api.col.3l.e> r1 = r4.T     // Catch: java.lang.Throwable -> L1f
            r1.clear()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L2b
        L2b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private int b(int r11, android.graphics.Rect r12, int r13, int r14) {
            r10 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r10.Z
            r1 = 0
            if (r0 == 0) goto Lbf
            if (r11 < 0) goto Lbf
            int r3 = r0.getEngineIDWithType(r11)
            com.autonavi.base.ae.gmap.GLMapEngine r11 = r10.Z
            boolean r11 = r11.isEngineCreated(r3)
            if (r11 != 0) goto Lac
            android.content.Context r11 = r10.Y
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.densityDpi
            android.content.Context r0 = r10.Y
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate r2 = com.autonavi.base.ae.gmap.bean.NativeTextGenerate.getInstance()
            r2.setDensity(r0)
            com.autonavi.base.ae.gmap.GLMapEngine$MapViewInitParam r2 = new com.autonavi.base.ae.gmap.GLMapEngine$MapViewInitParam
            r2.<init>()
            r2.engineId = r3
            int r4 = r12.left
            r2.x = r4
            int r4 = r12.top
            r2.y = r4
            int r4 = r12.width()
            r2.width = r4
            int r12 = r12.height()
            r2.height = r12
            r2.screenWidth = r13
            r2.screenHeight = r14
            r2.screenScale = r0
            float r12 = r10.h0
            float r12 = r12 * r0
            r2.textScale = r12
            float r12 = r10.g0
            r2.mapZoomScale = r12
            r12 = 3
            r2.taskThreadCount = r12
            com.autonavi.base.ae.gmap.GLMapEngine r12 = r10.Z
            r12.createAMapEngineWithFrame(r2)
            com.autonavi.base.ae.gmap.GLMapEngine r12 = r10.Z
            com.autonavi.base.ae.gmap.GLMapState r12 = r12.getMapState(r3)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r10.q
            float r0 = r0.getSZ()
            r12.setMapZoomer(r0)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r10.q
            float r0 = r0.getSC()
            r12.setCameraDegree(r0)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r10.q
            float r0 = r0.getSR()
            r12.setMapAngle(r0)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r10.q
            double r4 = r0.getSX()
            com.autonavi.base.amap.mapcore.MapConfig r0 = r10.q
            double r6 = r0.getSY()
            r12.setMapGeoCenter(r4, r6)
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r10.Z
            r0.setMapState(r3, r12)
            float r11 = r12.calMapZoomScalefactor(r13, r14, r11)
            r10.g0 = r11
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r11 = new com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle
            r11.<init>(r3, r10)
            com.autonavi.base.ae.gmap.GLMapEngine r12 = r10.Z
            r12.setOvelayBundle(r3, r11)
            r2 = r10
            goto Lc1
        Lac:
            int r4 = r12.left
            int r5 = r12.top
            int r6 = r12.width()
            int r7 = r12.height()
            r2 = r10
            r8 = r13
            r9 = r14
            r2.h(r3, r4, r5, r6, r7, r8, r9)
            goto Lc1
        Lbf:
            r2 = r10
            r3 = 0
        Lc1:
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.o
            r11.set(r1)
            return r3
    }

    private void b0(int r6) {
            r5 = this;
            r5.I = r6
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L9
        L6:
            r6 = 0
        L7:
            r2 = 0
            goto L27
        L9:
            r2 = 2
            if (r6 != r2) goto Lf
            r6 = 0
            r2 = 1
            goto L27
        Lf:
            r3 = 3
            if (r6 != r3) goto L14
            r6 = 1
            goto L7
        L14:
            r4 = 4
            if (r6 != r4) goto L19
            r6 = 0
            goto L27
        L19:
            r4 = 6
            if (r6 != r4) goto L1e
            r6 = 1
            goto L27
        L1e:
            r2 = 5
            if (r6 != r2) goto L24
            r6 = 0
            r2 = 3
            goto L27
        L24:
            r5.I = r1     // Catch: java.lang.Throwable -> L49
            goto L6
        L27:
            com.autonavi.base.amap.mapcore.MapConfig r3 = r5.q     // Catch: java.lang.Throwable -> L49
            r3.setMapStyleMode(r2)     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.amap.mapcore.MapConfig r3 = r5.q     // Catch: java.lang.Throwable -> L49
            r3.setMapStyleTime(r6)     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.amap.mapcore.MapConfig r3 = r5.q     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.isCustomStyleEnable()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L5b
            com.amap.api.col.3l.v8 r3 = r5.w0     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L4b
            boolean r3 = r3.p()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L4b
            com.amap.api.col.3l.v8 r6 = r5.w0     // Catch: java.lang.Throwable -> L49
            r6.q()     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r6 = move-exception
            goto L77
        L4b:
            int r3 = r5.n     // Catch: java.lang.Throwable -> L49
            r5.g(r3, r2, r6)     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.amap.mapcore.MapConfig r6 = r5.q     // Catch: java.lang.Throwable -> L49
            r6.setCustomStyleEnable(r0)     // Catch: java.lang.Throwable -> L49
        L55:
            com.amap.api.col.3l.i r6 = r5.f3864g     // Catch: java.lang.Throwable -> L49
            r6.setLogoEnable(r1)     // Catch: java.lang.Throwable -> L49
            goto L73
        L5b:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r5.q     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getMapLanguage()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "en"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L6e
            java.lang.String r0 = "zh_cn"
            r5.setMapLanguage(r0)     // Catch: java.lang.Throwable -> L49
        L6e:
            int r0 = r5.n     // Catch: java.lang.Throwable -> L49
            r5.g(r0, r2, r6)     // Catch: java.lang.Throwable -> L49
        L73:
            r5.resetRenderTime()     // Catch: java.lang.Throwable -> L49
            return
        L77:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "setMaptype"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            com.amap.api.col.p0003l.b3.D(r6)
            return
    }

    private boolean c0(android.view.MotionEvent r6) throws android.os.RemoteException {
            r5 = this;
            r0 = 0
            com.amap.api.col.3l.ba r1 = r5.f3857b     // Catch: java.lang.Throwable -> L37
            java.lang.Class<com.amap.api.maps.AMap$OnInfoWindowClickListener> r2 = com.amap.api.maps.AMap.OnInfoWindowClickListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L37
            java.util.List r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L37
            com.amap.api.col.3l.a0 r2 = r5.f3861d     // Catch: java.lang.Throwable -> L37
            com.amap.api.maps.model.BaseOverlay r6 = r2.f(r6)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L37
            boolean r2 = r6 instanceof com.amap.api.maps.model.Marker     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L37
            r2 = 0
        L1b:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L32
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L30
            com.amap.api.maps.AMap$OnInfoWindowClickListener r3 = (com.amap.api.maps.AMap.OnInfoWindowClickListener) r3     // Catch: java.lang.Throwable -> L30
            r4 = r6
            com.amap.api.maps.model.Marker r4 = (com.amap.api.maps.model.Marker) r4     // Catch: java.lang.Throwable -> L30
            r3.onInfoWindowClick(r4)     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + 1
            goto L1b
        L30:
            r6 = move-exception
            goto L35
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            r6 = 1
            return r6
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L37
        L37:
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean d(com.amap.api.col.p0003l.r9 r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.o
            return r0
    }

    static /* synthetic */ boolean d0(com.amap.api.col.p0003l.r9 r0) {
            boolean r0 = r0.D
            return r0
    }

    private void e(double r8, double r10) {
            r7 = this;
            android.os.Handler r0 = r7.z0
            com.amap.api.col.3l.r9$a r1 = new com.amap.api.col.3l.r9$a
            r2 = r7
            r3 = r8
            r5 = r10
            r1.<init>(r2, r3, r5)
            r0.post(r1)
            return
    }

    private void e0() {
            r8 = this;
            int r0 = r8.E
            if (r0 <= 0) goto L3f
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            int r1 = r8.n
            boolean r0 = r0.canStopMapRender(r1)
            if (r0 != 0) goto L1d
            int r1 = r8.E
            int r1 = r1 + (-1)
            r8.E = r1
            if (r1 > 0) goto L17
            goto L1d
        L17:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            r0.renderAMap()
            return
        L1d:
            r1 = 0
            r8.E = r1
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r8.Z
            int r3 = r8.n
            int r6 = r8.getMapWidth()
            int r7 = r8.getMapHeight()
            r4 = 0
            r5 = 0
            android.graphics.Bitmap r1 = r2.getScreenShot(r3, r4, r5, r6, r7)
            android.os.Handler r2 = r8.z0
            r3 = 15
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.arg1 = r0
            r1.sendToTarget()
        L3f:
            return
    }

    private void f(int r3) {
            r2 = this;
            int r0 = r2.S
            r1 = -1
            if (r0 == r1) goto Lf
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            float r0 = (float) r0
            r3.setRenderFps(r0)
            r2.resetRenderTime()
            goto L55
        Lf:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            boolean r0 = r0.isInMapAction(r3)
            if (r0 != 0) goto L4e
            boolean r0 = r2.j0
            if (r0 == 0) goto L1c
            goto L4e
        L1c:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            boolean r3 = r0.isInMapAnimation(r3)
            r0 = 15
            r1 = 1106247680(0x41f00000, float:30.0)
            if (r3 == 0) goto L33
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r3.setRenderFps(r1)
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r3.resetTickCount(r0)
            goto L55
        L33:
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r2.l
            boolean r3 = r3.isGLTFAnimated()
            if (r3 == 0) goto L46
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r3.setRenderFps(r1)
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r3.resetTickCount(r0)
            goto L55
        L46:
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r0 = 1097859072(0x41700000, float:15.0)
            r3.setRenderFps(r0)
            goto L55
        L4e:
            com.autonavi.base.ae.gmap.GLMapRender r3 = r2.f3856a0
            r0 = 1109393408(0x42200000, float:40.0)
            r3.setRenderFps(r0)
        L55:
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            boolean r3 = r3.isWorldMapEnable()
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
            if (r3 == r0) goto L6d
            r2.x()
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            boolean r0 = com.amap.api.maps.MapsInitializer.isLoadWorldGridMap()
            r3.setWorldMapEnable(r0)
        L6d:
            return
    }

    static /* synthetic */ boolean f0(com.amap.api.col.p0003l.r9 r1) {
            r0 = 0
            r1.D = r0
            return r0
    }

    static /* synthetic */ int g0(com.amap.api.col.p0003l.r9 r0) {
            int r0 = r0.n
            return r0
    }

    private void h(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r8 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            if (r0 == 0) goto Le
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.setServiceViewRect(r1, r2, r3, r4, r5, r6, r7)
        Le:
            return
    }

    private void h0() {
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.o
            boolean r0 = r0.get()
            if (r0 == 0) goto La
            goto L194
        La:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            int r1 = r8.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            if (r0 == 0) goto L194
            com.autonavi.base.amap.mapcore.MapConfig r1 = r8.q
            float[] r1 = r1.getViewMatrix()
            r0.getViewMatrix(r1)
            com.autonavi.base.amap.mapcore.MapConfig r1 = r8.q
            float[] r1 = r1.getProjectionMatrix()
            r0.getProjectionMatrix(r1)
            com.autonavi.base.amap.mapcore.MapConfig r1 = r8.q
            r1.updateFinalMatrix()
            com.autonavi.amap.mapcore.DPoint r1 = r0.getMapGeoCenter()
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            double r3 = r1.x
            r2.setSX(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            double r3 = r1.y
            r2.setSY(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            float r3 = r0.getMapZoomer()
            r2.setSZ(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            float r3 = r0.getCameraDegree()
            r2.setSC(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            float r3 = r0.getMapAngle()
            r2.setSR(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q
            float r0 = r0.getSkyHeight()
            r2.setSkyHeight(r0)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q
            boolean r0 = r0.isMapStateChange()
            if (r0 == 0) goto L17d
            double r2 = r1.x
            double r0 = r1.y
            r4 = 20
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r2, r0, r4)
            com.amap.api.maps.model.CameraPosition r1 = new com.amap.api.maps.model.CameraPosition
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            double r3 = r0.y
            double r5 = r0.x
            r7 = 0
            r2.<init>(r3, r5, r7)
            com.autonavi.base.amap.mapcore.MapConfig r3 = r8.q
            float r3 = r3.getSZ()
            com.autonavi.base.amap.mapcore.MapConfig r4 = r8.q
            float r4 = r4.getSC()
            com.autonavi.base.amap.mapcore.MapConfig r5 = r8.q
            float r5 = r5.getSR()
            r1.<init>(r2, r3, r4, r5)
            r0.recycle()
            android.os.Handler r0 = r8.z0
            android.os.Message r0 = r0.obtainMessage()
            r2 = 10
            r0.what = r2
            r0.obj = r1
            android.os.Handler r1 = r8.z0
            r1.sendMessage(r0)
            r0 = 1
            r8.k0 = r0
            r8.redrawInfoWindow()
            com.amap.api.col.3l.i r0 = r8.f3864g     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L194
            r1 = 0
            if (r0 == 0) goto Lf3
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isNeedUpdateZoomControllerState()     // Catch: java.lang.Throwable -> L194
            if (r0 == 0) goto Lf3
            com.amap.api.col.3l.ba r0 = r8.f3857b     // Catch: java.lang.Throwable -> L194
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r2 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L194
            java.util.List r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto Lf3
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L194
            if (r0 <= 0) goto Lf3
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L194
            r0 = 0
        Ld5:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Led
            if (r0 >= r3) goto Lef
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> Led
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r3 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r3     // Catch: java.lang.Throwable -> Led
            com.autonavi.base.amap.mapcore.MapConfig r4 = r8.q     // Catch: java.lang.Throwable -> Led
            float r4 = r4.getSZ()     // Catch: java.lang.Throwable -> Led
            r3.invalidateZoomController(r4)     // Catch: java.lang.Throwable -> Led
            int r0 = r0 + 1
            goto Ld5
        Led:
            r0 = move-exception
            goto Lf1
        Lef:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Led
            goto Lf3
        Lf1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Led
            throw r0     // Catch: java.lang.Throwable -> L194
        Lf3:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q     // Catch: java.lang.Throwable -> L194
            double r2 = r0.getChangeGridRatio()     // Catch: java.lang.Throwable -> L194
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L102
            r8.x()     // Catch: java.lang.Throwable -> L194
        L102:
            com.amap.api.col.3l.i r0 = r8.f3864g     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isCompassEnabled()     // Catch: java.lang.Throwable -> L194
            if (r0 == 0) goto L148
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isTiltChanged()     // Catch: java.lang.Throwable -> L194
            if (r0 != 0) goto L11a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isBearingChanged()     // Catch: java.lang.Throwable -> L194
            if (r0 == 0) goto L148
        L11a:
            com.amap.api.col.3l.ba r0 = r8.f3857b     // Catch: java.lang.Throwable -> L194
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r2 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L194
            java.util.List r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto L148
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L194
            if (r0 <= 0) goto L148
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L194
            r0 = 0
        L130:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L142
            if (r0 >= r3) goto L144
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L142
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r3 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r3     // Catch: java.lang.Throwable -> L142
            r3.invalidateCompassView()     // Catch: java.lang.Throwable -> L142
            int r0 = r0 + 1
            goto L130
        L142:
            r0 = move-exception
            goto L146
        L144:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            goto L148
        L146:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            throw r0     // Catch: java.lang.Throwable -> L194
        L148:
            com.amap.api.col.3l.i r0 = r8.f3864g     // Catch: java.lang.Throwable -> L194
            boolean r0 = r0.isScaleControlsEnabled()     // Catch: java.lang.Throwable -> L194
            if (r0 == 0) goto L194
            com.amap.api.col.3l.ba r0 = r8.f3857b     // Catch: java.lang.Throwable -> L194
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r2 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L194
            java.util.List r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto L194
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L194
            if (r0 <= 0) goto L194
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L194
        L165:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L177
            if (r1 >= r0) goto L179
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L177
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r0 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r0     // Catch: java.lang.Throwable -> L177
            r0.invalidateScaleView()     // Catch: java.lang.Throwable -> L177
            int r1 = r1 + 1
            goto L165
        L177:
            r0 = move-exception
            goto L17b
        L179:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L177
            return
        L17b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L177
            throw r0     // Catch: java.lang.Throwable -> L194
        L17d:
            boolean r0 = r8.j0
            if (r0 != 0) goto L194
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            int r0 = r0.getAnimateionsCount()
            if (r0 != 0) goto L194
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z
            int r0 = r0.getStateMessageCount()
            if (r0 != 0) goto L194
            r8.onChangeFinish()
        L194:
            return
    }

    private synchronized void i(int r9, int r10, int r11, boolean r12, com.autonavi.base.ae.gmap.style.StyleItem[] r13) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.m0     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L26
            boolean r0 = r8.l0     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L26
            boolean r0 = r8.f3865h     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L26
            r8.P(r11)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.r9$e r1 = new com.amap.api.col.3l.r9$e     // Catch: java.lang.Throwable -> L23
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L20
            r8.queueEvent(r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)
            return
        L20:
            r0 = move-exception
        L21:
            r9 = r0
            goto L37
        L23:
            r0 = move-exception
            r2 = r8
            goto L21
        L26:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.amap.api.col.3l.r9$t0 r9 = r2.C0     // Catch: java.lang.Throwable -> L20
            r9.f3917e = r3     // Catch: java.lang.Throwable -> L20
            r9.f3915c = r4     // Catch: java.lang.Throwable -> L20
            r9.f3916d = r5     // Catch: java.lang.Throwable -> L20
            r10 = 1
            r9.a = r10     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)
            return
        L37:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            throw r9
    }

    static /* synthetic */ com.amap.api.col.p0003l.a0 i0(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.a0 r0 = r0.f3861d
            return r0
    }

    private void j(int r3, int r4, com.autonavi.base.amap.mapcore.FPoint r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L1c
        L9:
            boolean r0 = r2.l0
            if (r0 == 0) goto L1c
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L1c
            int r1 = r2.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            if (r0 == 0) goto L1c
            r0.p20ToScreenPoint(r3, r4, r5)
        L1c:
            return
    }

    private void j0() {
            r7 = this;
            boolean r0 = r7.s
            r1 = 1
            if (r0 != 0) goto L11
            android.os.Handler r0 = r7.z0
            r2 = 16
            r0.sendEmptyMessage(r2)
            r7.s = r1
            r7.x()
        L11:
            long r2 = r7.X0
            r4 = 2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1f
            r0 = 1
            long r2 = r2 + r0
            r7.X0 = r2
            return
        L1f:
            com.amap.api.col.3l.i3 r0 = r7.f3868k
            com.amap.api.col.3l.ed r0 = r0.d()
            if (r0 == 0) goto L4c
            int r2 = r0.getVisibility()
            r3 = 8
            if (r2 == r3) goto L4c
            long r2 = java.lang.System.currentTimeMillis()
            android.content.Context r4 = r7.Y
            long r5 = r7.x0
            long r2 = r2 - r5
            com.amap.api.col.p0003l.y2.g(r4, r2)
            android.os.Handler r2 = r7.z0
            com.amap.api.col.3l.r9$c r3 = new com.amap.api.col.3l.r9$c
            r3.<init>(r7, r0)
            r2.post(r3)
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r7.Z
            int r2 = r7.n
            r0.setStyleChangeGradualEnable(r2, r1)
        L4c:
            return
    }

    static /* synthetic */ int k0(com.amap.api.col.p0003l.r9 r0) {
            int r0 = r0.r0
            return r0
    }

    private void l(android.view.MotionEvent r7) throws android.os.RemoteException {
            r6 = this;
            boolean r0 = r6.w
            if (r0 == 0) goto L65
            com.amap.api.maps.model.Marker r0 = r6.y
            if (r0 == 0) goto L65
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            r1 = 1114636288(0x42700000, float:60.0)
            float r7 = r7 - r1
            int r7 = (int) r7
            com.amap.api.maps.model.Marker r1 = r6.y
            com.amap.api.maps.model.LatLng r1 = r1.getPosition()
            if (r1 == 0) goto L65
            com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.DPoint.obtain()
            r6.getPixel2LatLng(r0, r7, r1)
            com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
            double r2 = r1.y
            double r4 = r1.x
            r7.<init>(r2, r4)
            r1.recycle()
            com.amap.api.maps.model.Marker r0 = r6.y
            r0.setPosition(r7)
            com.amap.api.col.3l.ba r7 = r6.f3857b     // Catch: java.lang.Throwable -> L65
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r0 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L65
            java.util.List r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L65
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L65
            if (r0 <= 0) goto L65
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L65
            r0 = 0
        L4b:
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L5f
            if (r0 >= r1) goto L61
            java.lang.Object r1 = r7.get(r0)     // Catch: java.lang.Throwable -> L5f
            com.amap.api.maps.AMap$OnMarkerDragListener r1 = (com.amap.api.maps.AMap.OnMarkerDragListener) r1     // Catch: java.lang.Throwable -> L5f
            com.amap.api.maps.model.Marker r2 = r6.y     // Catch: java.lang.Throwable -> L5f
            r1.onMarkerDrag(r2)     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 1
            goto L4b
        L5f:
            r0 = move-exception
            goto L63
        L61:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5f
            return
        L63:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            return
    }

    private void l0() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.f3856a0
            if (r0 == 0) goto L8
            r1 = 2
            r0.resetTickCount(r1)
        L8:
            return
    }

    static /* synthetic */ void m(com.amap.api.col.p0003l.r9 r0, com.amap.api.maps.model.CameraPosition r1) {
            r0.C(r1)
            return
    }

    static /* synthetic */ int m0(com.amap.api.col.p0003l.r9 r0) {
            int r0 = r0.s0
            return r0
    }

    private void n0() {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L11
            com.autonavi.base.ae.gmap.GLMapRender r0 = r1.f3856a0
            if (r0 == 0) goto L11
            boolean r0 = r0.isRenderPause()
            if (r0 != 0) goto L11
            r1.requestRender()
        L11:
            return
    }

    private void o(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2) {
            r1 = this;
            boolean r0 = r1.r
            r2.isUseAnchor = r0
            if (r0 == 0) goto L16
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            int r0 = r0.getAnchorX()
            r2.anchorX = r0
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            int r0 = r0.getAnchorY()
            r2.anchorY = r0
        L16:
            int r0 = r2.width
            if (r0 != 0) goto L20
            int r0 = r1.getMapWidth()
            r2.width = r0
        L20:
            int r0 = r2.height
            if (r0 != 0) goto L2a
            int r0 = r1.getMapHeight()
            r2.height = r0
        L2a:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r2.mapConfig = r0
            return
    }

    private void o0() {
            r2 = this;
            boolean r0 = r2.N
            if (r0 != 0) goto L18
            java.lang.Thread r0 = r2.K     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "AuthThread"
            r0.setName(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.Thread r0 = r2.K     // Catch: java.lang.Throwable -> L14
            r0.start()     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r2.N = r0     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        L18:
            return
    }

    private void p(com.autonavi.base.ae.gmap.GLMapState r3, int r4, int r5, com.autonavi.amap.mapcore.DPoint r6) {
            r2 = this;
            boolean r0 = r2.l0
            if (r0 == 0) goto L27
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L27
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r3.screenToP20Point(r4, r5, r0)
            int r3 = r0.x
            long r3 = (long) r3
            int r5 = r0.y
            long r0 = (long) r5
            r5 = 20
            com.autonavi.amap.mapcore.DPoint r3 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r3, r0, r5)
            double r4 = r3.x
            r6.x = r4
            double r4 = r3.y
            r6.y = r4
            r3.recycle()
        L27:
            return
    }

    static /* synthetic */ boolean p0(com.amap.api.col.p0003l.r9 r0) {
            boolean r0 = r0.p
            return r0
    }

    private void q(boolean r5) {
            r4 = this;
            com.autonavi.extra.b r0 = r4.P0
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r0.j()
            if (r0 == 0) goto L31
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L31
            com.autonavi.base.amap.mapcore.MapConfig r1 = r4.q
            r2 = 0
            if (r1 == 0) goto L24
            if (r5 == 0) goto L20
            r3 = r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r1.setAbroadEnable(r3)
        L24:
            if (r5 == 0) goto L31
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L31
            com.amap.api.maps.MapsInitializer.setSupportRecycleView(r2)
        L31:
            com.autonavi.extra.b r5 = r4.P0
            java.lang.Object r5 = r5.j()
            if (r5 == 0) goto L49
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L49
            com.amap.api.col.3l.i3 r0 = r4.f3868k
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.a(r1)
        L49:
            com.autonavi.extra.b r0 = r4.P0
            java.lang.Object r0 = r0.j()
            if (r5 == 0) goto L5d
            boolean r5 = r5 instanceof java.lang.Integer
            if (r5 == 0) goto L5d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            r4.P = r5
        L5d:
            return
    }

    private void q0() {
            r2 = this;
            boolean r0 = r2.O
            if (r0 != 0) goto L27
            java.lang.Thread r0 = r2.L     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.amap.api.col.3l.ca r0 = new com.amap.api.col.3l.ca     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = r2.Y     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            r2.L = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L24
        L14:
            java.lang.Thread r0 = r2.L     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "AuthProThread"
            r0.setName(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Thread r0 = r2.L     // Catch: java.lang.Throwable -> L12
            r0.start()     // Catch: java.lang.Throwable -> L12
            r0 = 1
            r2.O = r0     // Catch: java.lang.Throwable -> L12
            return
        L24:
            com.amap.api.col.p0003l.b3.D(r0)
        L27:
            return
    }

    private void r(boolean r5, byte[] r6, boolean r7) {
            r4 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L15
            r0.setCustomStyleEnable(r5)     // Catch: java.lang.Throwable -> L15
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.isHideLogoEnable()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L18
            com.amap.api.col.3l.i r0 = r4.f3864g     // Catch: java.lang.Throwable -> L15
            r1 = r5 ^ 1
            r0.setLogoEnable(r1)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r5 = move-exception
            goto Lc3
        L18:
            r0 = 0
            if (r5 == 0) goto Lac
            int r5 = r4.n     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r4.H(r5, r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.d2 r5 = new com.amap.api.col.3l.d2     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            com.amap.api.maps.model.MyTrafficStyle r2 = r4.J     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L3a
            int r2 = r2.getTrafficRoadBackgroundColor()     // Catch: java.lang.Throwable -> L15
            r3 = -1
            if (r2 == r3) goto L3a
            com.amap.api.maps.model.MyTrafficStyle r2 = r4.J     // Catch: java.lang.Throwable -> L15
            int r2 = r2.getTrafficRoadBackgroundColor()     // Catch: java.lang.Throwable -> L15
            r5.i(r2)     // Catch: java.lang.Throwable -> L15
        L3a:
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L4f
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.getCustomTextureResourcePath()     // Catch: java.lang.Throwable -> L15
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L4f
            r0 = 1
        L4f:
            r2 = 0
            if (r6 == 0) goto L64
            com.amap.api.col.3l.f2 r6 = r5.e(r6, r0)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L65
            com.autonavi.base.ae.gmap.style.StyleItem[] r2 = r6.c()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L65
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.q     // Catch: java.lang.Throwable -> L15
            r3.setUseProFunction(r1)     // Catch: java.lang.Throwable -> L15
            goto L65
        L64:
            r6 = r2
        L65:
            if (r2 != 0) goto L77
            com.autonavi.base.amap.mapcore.MapConfig r6 = r4.q     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = r6.getCustomStylePath()     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.f2 r6 = r5.d(r6, r0)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L77
            com.autonavi.base.ae.gmap.style.StyleItem[] r2 = r6.c()     // Catch: java.lang.Throwable -> L15
        L77:
            int r0 = r5.a()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L86
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L15
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L15
            r0.setCustomBackgroundColor(r5)     // Catch: java.lang.Throwable -> L15
        L86:
            if (r6 == 0) goto La8
            java.lang.Object r5 = r6.d()     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto La8
            com.amap.api.col.3l.z1 r5 = r4.V     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto La7
            java.lang.Object r5 = r6.d()     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.z1 r7 = r4.V     // Catch: java.lang.Throwable -> L15
            r7.d(r5)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.z1 r5 = r4.V     // Catch: java.lang.Throwable -> L15
            r5.c(r6)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.z1 r5 = r4.V     // Catch: java.lang.Throwable -> L15
            r5.b()     // Catch: java.lang.Throwable -> L15
        La7:
            return
        La8:
            r4.s(r2, r7)     // Catch: java.lang.Throwable -> L15
            return
        Lac:
            int r5 = r4.n     // Catch: java.lang.Throwable -> L15
            r4.H(r5, r0)     // Catch: java.lang.Throwable -> L15
            int r5 = r4.n     // Catch: java.lang.Throwable -> L15
            com.autonavi.base.amap.mapcore.MapConfig r6 = r4.q     // Catch: java.lang.Throwable -> L15
            int r6 = r6.getMapStyleMode()     // Catch: java.lang.Throwable -> L15
            com.autonavi.base.amap.mapcore.MapConfig r7 = r4.q     // Catch: java.lang.Throwable -> L15
            int r7 = r7.getMapStyleTime()     // Catch: java.lang.Throwable -> L15
            r4.g(r5, r6, r7)     // Catch: java.lang.Throwable -> L15
            return
        Lc3:
            com.amap.api.col.p0003l.b3.D(r5)
            return
    }

    static /* synthetic */ boolean r0(com.amap.api.col.p0003l.r9 r0) {
            boolean r0 = r0.l0
            return r0
    }

    private void s(com.autonavi.base.ae.gmap.style.StyleItem[] r7, boolean r8) {
            r6 = this;
            if (r8 != 0) goto Lf
            if (r7 == 0) goto L8
            int r8 = r7.length
            if (r8 <= 0) goto L8
            goto Lf
        L8:
            android.content.Context r7 = r6.Y
            r8 = 0
            com.amap.api.col.p0003l.y2.j(r7, r8)
            return
        Lf:
            int r1 = r6.n
            r3 = 0
            r4 = 1
            r2 = 0
            r0 = r6
            r5 = r7
            r0.i(r1, r2, r3, r4, r5)
            android.content.Context r7 = r0.Y
            r8 = 1
            com.amap.api.col.p0003l.y2.j(r7, r8)
            return
    }

    static /* synthetic */ com.autonavi.base.ae.gmap.GLMapRender s0(com.amap.api.col.p0003l.r9 r0) {
            com.autonavi.base.ae.gmap.GLMapRender r0 = r0.f3856a0
            return r0
    }

    private boolean t(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.l0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            float r0 = r3.E()
            int r0 = (int) r0
            float r0 = (float) r0
            com.autonavi.base.amap.mapcore.MapConfig r2 = r3.q
            float r2 = r2.getMaxZoomLevel()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L46
            boolean r0 = r3.r     // Catch: java.lang.Throwable -> L2f
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L31
            com.amap.api.col.3l.i r0 = r3.f3864g     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isZoomInByScreenCenter()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L31
            android.graphics.Point r0 = r3.W0     // Catch: java.lang.Throwable -> L2f
            r0.x = r4     // Catch: java.lang.Throwable -> L2f
            r0.y = r5     // Catch: java.lang.Throwable -> L2f
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r4 = com.amap.api.col.p0003l.p.d(r1, r0)     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r4 = move-exception
            goto L3a
        L31:
            r4 = 0
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r4 = com.amap.api.col.p0003l.p.d(r1, r4)     // Catch: java.lang.Throwable -> L2f
        L36:
            r3.animateCamera(r4)     // Catch: java.lang.Throwable -> L2f
            goto L41
        L3a:
            java.lang.String r5 = "AMapDelegateImp"
            java.lang.String r0 = "onDoubleTap"
            com.amap.api.col.p0003l.w5.p(r4, r5, r0)
        L41:
            r3.resetRenderTime()
            r4 = 1
            return r4
        L46:
            return r1
    }

    private void t0() {
            r8 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q     // Catch: java.lang.Throwable -> L49
            com.amap.api.maps.model.LatLngBounds r0 = r0.getLimitLatLngBounds()     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r8.Z     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L49
            boolean r1 = u(r0)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L49
            com.autonavi.base.ae.gmap.GLMapState r1 = new com.autonavi.base.ae.gmap.GLMapState     // Catch: java.lang.Throwable -> L49
            int r2 = r8.n     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r8.Z     // Catch: java.lang.Throwable -> L49
            long r3 = r3.getNativeInstance()     // Catch: java.lang.Throwable -> L49
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L49
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L49
            com.amap.api.maps.model.LatLng r3 = r0.northeast     // Catch: java.lang.Throwable -> L49
            double r4 = r3.longitude     // Catch: java.lang.Throwable -> L49
            double r6 = r3.latitude     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r4, r6, r2)     // Catch: java.lang.Throwable -> L49
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L49
            com.amap.api.maps.model.LatLng r0 = r0.southwest     // Catch: java.lang.Throwable -> L49
            double r4 = r0.longitude     // Catch: java.lang.Throwable -> L49
            double r6 = r0.latitude     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r4, r6, r3)     // Catch: java.lang.Throwable -> L49
            r0 = 2
            com.autonavi.amap.mapcore.IPoint[] r0 = new com.autonavi.amap.mapcore.IPoint[r0]     // Catch: java.lang.Throwable -> L49
            r4 = 0
            r0[r4] = r2     // Catch: java.lang.Throwable -> L49
            r2 = 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L49
            com.autonavi.base.amap.mapcore.MapConfig r2 = r8.q     // Catch: java.lang.Throwable -> L49
            r2.setLimitIPoints(r0)     // Catch: java.lang.Throwable -> L49
            r1.recycle()     // Catch: java.lang.Throwable -> L49
            return
        L49:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.q
            r1 = 0
            r0.setLimitIPoints(r1)
            return
    }

    private static boolean u(com.amap.api.maps.model.LatLngBounds r1) {
            if (r1 == 0) goto Lc
            com.amap.api.maps.model.LatLng r0 = r1.northeast
            if (r0 == 0) goto Lc
            com.amap.api.maps.model.LatLng r1 = r1.southwest
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    static /* synthetic */ com.amap.api.col.3l.r9.u0 u0(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.r9$u0 r0 = r0.t0
            return r0
    }

    private boolean v(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto Lf
            boolean r2 = r1.T0
            if (r2 == 0) goto Ld
            java.lang.String r2 = "setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setCustomMapStyle将不会生效"
            com.amap.api.col.p0003l.i2.c(r2)
            return r0
        Ld:
            r1.S0 = r0
        Lf:
            if (r3 == 0) goto L1d
            boolean r2 = r1.S0
            if (r2 == 0) goto L1b
            java.lang.String r2 = "setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setWorldVectorMapStyle将不会生效"
            com.amap.api.col.p0003l.i2.c(r2)
            return r0
        L1b:
            r1.T0 = r0
        L1d:
            r2 = 0
            return r2
    }

    private void v0() {
            r1 = this;
            com.amap.api.col.3l.ba r0 = r1.f3857b
            if (r0 == 0) goto L7
            r0.b()
        L7:
            return
    }

    static /* synthetic */ com.amap.api.col.p0003l.ba w(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.ba r0 = r0.f3857b
            return r0
    }

    static /* synthetic */ com.amap.api.col.p0003l.z w0(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.z r0 = r0.Z0
            return r0
    }

    private void x0() {
            r1 = this;
            com.amap.api.col.3l.v1 r0 = r1.u0
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r1.u0 = r0
        La:
            return
    }

    private void y(int r2) {
            r1 = this;
            com.amap.api.col.3l.r9$d r0 = new com.amap.api.col.3l.r9$d
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
            return
    }

    static /* synthetic */ com.amap.api.col.p0003l.i y0(com.amap.api.col.p0003l.r9 r0) {
            com.amap.api.col.3l.i r0 = r0.f3864g
            return r0
    }

    public final void A(android.util.Size r9) {
            r8 = this;
            int r1 = r8.getNativeEngineID()
            int r4 = r9.getWidth()
            int r5 = r9.getHeight()
            int r6 = r9.getWidth()
            int r7 = r9.getHeight()
            r2 = 0
            r3 = 0
            r0 = r8
            r0.h(r1, r2, r3, r4, r5, r6, r7)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            android.view.View r2 = r8.getGLMapView()
            r2.setLayoutParams(r1)
            com.amap.api.col.3l.i3 r2 = r0.f3868k
            com.amap.api.col.3l.el r2 = r2.f()
            r2.setLayoutParams(r1)
            int r1 = r9.getWidth()
            int r9 = r9.getHeight()
            r8.changeSize(r1, r9)
            r9 = 1
            r8.D(r9)
            return
    }

    public final void H(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L14
            boolean r0 = r1.m0
            if (r0 == 0) goto L14
            r1.resetRenderTime()
            com.amap.api.col.3l.r9$i r0 = new com.amap.api.col.3l.r9$i
            r0.<init>(r1, r3, r2)
            r1.queueEvent(r0)
            return
        L14:
            com.amap.api.col.3l.r9$t0 r0 = r1.O0
            r0.f3914b = r3
            r3 = 1
            r0.a = r3
            r0.f3917e = r2
            return
    }

    @Override // com.amap.api.col.3l.v8.a
    public final void a() {
            r1 = this;
            com.autonavi.extra.b r0 = r1.P0
            if (r0 == 0) goto L7
            r0.i()
        L7:
            return
    }

    @Override // com.amap.api.col.3l.z1.a
    public final void a(java.lang.String r1, com.amap.api.col.p0003l.f2 r2) {
            r0 = this;
            r0.setCustomTextureResourcePath(r1)
            com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q
            boolean r1 = r1.isCustomStyleEnable()
            if (r1 == 0) goto L15
            if (r2 == 0) goto L15
            com.autonavi.base.ae.gmap.style.StyleItem[] r1 = r2.c()
            r2 = 0
            r0.s(r1, r2)
        L15:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void accelerateNetworkInChinese(boolean r1) {
            r0 = this;
            com.autonavi.extra.b r1 = r0.P0
            if (r1 == 0) goto L7
            r1.i()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay add3DModelTileOverlay(com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions r4) throws android.os.RemoteException {
            r3 = this;
            r3.resetRenderTime()     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r3.l     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "AMAP3DMODELTILE"
            java.lang.String r0 = r0.createId(r1)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay r1 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2, r4, r0)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Throwable -> L18
            r2.addOverlayObject(r0, r1, r4)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
            r4 = 0
            return r4
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$AMapAppResourceRequestListener> r1 = com.amap.api.maps.AMap.AMapAppResourceRequestListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Arc addArc(com.amap.api.maps.model.ArcOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.ArcOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "ARC"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Arc r2 = new com.amap.api.maps.model.Arc     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Arc r5 = (com.amap.api.maps.model.Arc) r5     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            goto L28
        L27:
            return r2
        L28:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.BuildingOverlay addBuildingOverlay() {
            r6 = this;
            r0 = 0
            android.content.Context r1 = r6.Y     // Catch: java.lang.Exception -> L3c
            com.amap.api.col.p0003l.y2.u(r1)     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r6.l     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "BUILDINGOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.model.BuildingOverlay r2 = new com.amap.api.maps.model.BuildingOverlay     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r6.l     // Catch: java.lang.Exception -> L3c
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.amap.api.maps.model.BuildingOverlay> r3 = com.amap.api.maps.model.BuildingOverlay.class
            java.lang.String r4 = "buildingOverlayTotalOptions"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> L3c
            if (r3 != 0) goto L20
            return r0
        L20:
            r6.resetRenderTime()     // Catch: java.lang.Exception -> L3c
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.interfaces.IGlOverlayLayer r4 = r6.l     // Catch: java.lang.Exception -> L3c
            if (r4 == 0) goto L3e
            boolean r5 = r3 instanceof com.amap.api.maps.model.BaseOptions     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L3e
            com.amap.api.maps.model.BaseOptions r3 = (com.amap.api.maps.model.BaseOptions) r3     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.model.BaseOverlay r1 = r4.addOverlayObject(r1, r2, r3)     // Catch: java.lang.Exception -> L3c
            com.amap.api.maps.model.BuildingOverlay r1 = (com.amap.api.maps.model.BuildingOverlay) r1     // Catch: java.lang.Exception -> L3c
            return r1
        L3c:
            r1 = move-exception
            goto L3f
        L3e:
            return r2
        L3f:
            com.amap.api.col.p0003l.b3.D(r1)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Circle addCircle(com.amap.api.maps.model.CircleOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.CircleOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "CIRCLE"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Circle r2 = new com.amap.api.maps.model.Circle     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Circle r5 = (com.amap.api.maps.model.Circle) r5     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            goto L28
        L27:
            return r2
        L28:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.col.p0003l.m3 addContourLineOverlay(com.amap.api.col.p0003l.eo r4) {
            r3 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r3.l     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "CONTOURLINE"
            java.lang.String r0 = r0.createId(r1)     // Catch: java.lang.Exception -> L15
            com.amap.api.col.3l.m3 r1 = new com.amap.api.col.3l.m3     // Catch: java.lang.Exception -> L15
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Exception -> L15
            r1.<init>(r2, r4, r0)     // Catch: java.lang.Exception -> L15
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Exception -> L15
            r2.addOverlayObject(r0, r1, r4)     // Catch: java.lang.Exception -> L15
            return r1
        L15:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
            r4 = 0
            return r4
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.CrossOverlay addCrossVector(com.amap.api.maps.model.CrossOverlayOptions r4) {
            r3 = this;
            if (r4 == 0) goto L30
            android.graphics.Bitmap r0 = r4.getRes()
            if (r0 != 0) goto L9
            goto L30
        L9:
            com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay r0 = new com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay
            int r1 = r3.n
            android.content.Context r2 = r3.getContext()
            r0.<init>(r1, r2, r3)
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r1 = r4.getAttribute()
            r0.setAttribute(r1)
            com.amap.api.col.3l.r9$c0 r1 = new com.amap.api.col.3l.r9$c0
            r1.<init>(r3, r0)
            r3.queueEvent(r1)
            android.graphics.Bitmap r1 = r4.getRes()
            r0.resumeMarker(r1)
            com.amap.api.maps.model.CrossOverlay r1 = new com.amap.api.maps.model.CrossOverlay
            r1.<init>(r4, r0)
            return r1
        L30:
            r4 = 0
            return r4
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.GL3DModel addGLModel(com.amap.api.maps.model.GL3DModelOptions r4) {
            r3 = this;
            r3.resetRenderTime()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r3.l
            java.lang.String r1 = "GL3DMODEL"
            java.lang.String r0 = r0.createId(r1)
            com.amap.api.maps.model.GL3DModel r1 = new com.amap.api.maps.model.GL3DModel
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l
            r1.<init>(r2, r4, r0)
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l
            r2.addOverlayObject(r0, r1, r4)
            return r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.GLTFOverlay addGLTFOverlay(com.amap.api.maps.model.GLTFOverlayOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            com.amap.api.col.3l.ia r1 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            com.amap.api.col.3l.ia r1 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "feature_gltf"
            boolean r1 = r1.c(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "GLTF功能不支持"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.b3.D(r5)     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r5 = move-exception
            goto L40
        L24:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.model.GLTFOverlayOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "GLTFOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.model.GLTFOverlay r2 = new com.amap.api.maps.model.GLTFOverlay     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L22
            r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L22
            return r2
        L40:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addGestureMapMessage(int r8, com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage r9) {
            r7 = this;
            boolean r0 = r7.l0
            if (r0 == 0) goto L35
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r7.Z
            if (r0 == 0) goto L35
            boolean r0 = r7.r     // Catch: android.os.RemoteException -> L35
            r9.isUseAnchor = r0     // Catch: android.os.RemoteException -> L35
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q     // Catch: android.os.RemoteException -> L35
            int r0 = r0.getAnchorX()     // Catch: android.os.RemoteException -> L35
            r9.anchorX = r0     // Catch: android.os.RemoteException -> L35
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q     // Catch: android.os.RemoteException -> L35
            int r0 = r0.getAnchorY()     // Catch: android.os.RemoteException -> L35
            r9.anchorY = r0     // Catch: android.os.RemoteException -> L35
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r7.Z     // Catch: android.os.RemoteException -> L35
            com.amap.api.col.3l.i r0 = r7.f3864g     // Catch: android.os.RemoteException -> L35
            boolean r4 = r0.isGestureScaleByMapCenter()     // Catch: android.os.RemoteException -> L35
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q     // Catch: android.os.RemoteException -> L35
            int r5 = r0.getAnchorX()     // Catch: android.os.RemoteException -> L35
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q     // Catch: android.os.RemoteException -> L35
            int r6 = r0.getAnchorY()     // Catch: android.os.RemoteException -> L35
            r2 = r8
            r3 = r9
            r1.addGestureMessage(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L35
        L35:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.GroundOverlay addGroundOverlay(com.amap.api.maps.model.GroundOverlayOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.GroundOverlayOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "GROUNDOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.GroundOverlay r2 = new com.amap.api.maps.model.GroundOverlay     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.GroundOverlay r5 = (com.amap.api.maps.model.GroundOverlay) r5     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            goto L28
        L27:
            return r2
        L28:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.HeatMapGridLayer addHeatMapGridLayer(com.amap.api.maps.model.HeatMapGridLayerOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L7
            return r0
        L7:
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "HEATMAPGRIDLAYER"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.HeatMapGridLayer r2 = new com.amap.api.maps.model.HeatMapGridLayer     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.HeatMapGridLayer r5 = (com.amap.api.maps.model.HeatMapGridLayer) r5     // Catch: java.lang.Throwable -> L1f
            return r5
        L1f:
            r5 = move-exception
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.HeatMapLayer addHeatMapLayer(com.amap.api.maps.model.HeatMapLayerOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L7
            return r0
        L7:
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "HEATMAPLAYER"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.HeatMapLayer r2 = new com.amap.api.maps.model.HeatMapLayer     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.maps.model.HeatMapLayer r5 = (com.amap.api.maps.model.HeatMapLayer) r5     // Catch: java.lang.Throwable -> L1f
            return r5
        L1f:
            r5 = move-exception
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.MVTTileOverlay addMVTTileOverlay(com.amap.api.maps.model.MVTTileOverlayOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            com.amap.api.col.3l.ia r1 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            com.amap.api.col.3l.ia r1 = com.amap.api.col.p0003l.ia.a()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "feature_mvt"
            boolean r1 = r1.c(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "MVT功能不支持"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.b3.D(r5)     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r5 = move-exception
            goto L39
        L24:
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "MVTTILEOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.model.MVTTileOverlay r2 = new com.amap.api.maps.model.MVTTileOverlay     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L22
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L22
            r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L22
            return r2
        L39:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Marker addMarker(com.amap.api.maps.model.MarkerOptions r5) throws android.os.RemoteException {
            r4 = this;
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.MarkerOptions r0 = r5.clone()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "MARKER"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.Marker r2 = new com.amap.api.maps.model.Marker     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L1c
            r3.addOverlayObject(r1, r2, r0)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3065d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "addMarker failed "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amap.api.col.p0003l.d3.f(r1, r0, r5)
            r5 = 0
            return r5
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.util.ArrayList<com.amap.api.maps.model.Marker> addMarkers(java.util.ArrayList<com.amap.api.maps.model.MarkerOptions> r6, boolean r7) throws android.os.RemoteException {
            r5 = this;
            r5.resetRenderTime()     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            com.amap.api.maps.model.LatLngBounds$Builder r1 = com.amap.api.maps.model.LatLngBounds.builder()     // Catch: java.lang.Throwable -> L34
            r2 = 0
        Ld:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L34
            if (r2 >= r3) goto L39
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L34
            com.amap.api.maps.model.MarkerOptions r3 = (com.amap.api.maps.model.MarkerOptions) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r6.get(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            com.amap.api.maps.model.Marker r4 = r5.addMarker(r3)     // Catch: java.lang.Throwable -> L34
            r0.add(r4)     // Catch: java.lang.Throwable -> L34
            com.amap.api.maps.model.LatLng r4 = r3.getPosition()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            com.amap.api.maps.model.LatLng r3 = r3.getPosition()     // Catch: java.lang.Throwable -> L34
            r1.include(r3)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r7 = move-exception
            goto L50
        L36:
            int r2 = r2 + 1
            goto Ld
        L39:
            if (r7 == 0) goto L4f
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L34
            if (r7 <= 0) goto L4f
            android.os.Handler r7 = r5.getMainHandler()     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.r9$j r2 = new com.amap.api.col.3l.r9$j     // Catch: java.lang.Throwable -> L34
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L34
            r3 = 50
            r7.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L34
        L4f:
            return r0
        L50:
            com.amap.api.col.p0003l.b3.D(r7)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3065d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "addMarkers failed "
            r1.<init>(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.amap.api.col.p0003l.d3.i(r0, r7, r6)
            r6 = 0
            return r6
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.MultiPointOverlay addMultiPointOverlay(com.amap.api.maps.model.MultiPointOverlayOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.model.MultiPointOverlayOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "MULTIOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.model.MultiPointOverlay r2 = new com.amap.api.maps.model.MultiPointOverlay     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L25
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L26
            com.amap.api.maps.model.MultiPointOverlay r5 = (com.amap.api.maps.model.MultiPointOverlay) r5     // Catch: java.lang.Throwable -> L26
            return r5
        L25:
            return r2
        L26:
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.RouteOverlay addNaviRouteOverlay() {
            r3 = this;
            com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner r0 = new com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner
            int r1 = r3.n
            android.content.Context r2 = r3.getContext()
            r0.<init>(r1, r2, r3)
            com.amap.api.col.3l.r9$d0 r1 = new com.amap.api.col.3l.r9$d0
            r1.<init>(r3, r0)
            r3.queueEvent(r1)
            com.amap.api.maps.model.RouteOverlay r1 = new com.amap.api.maps.model.RouteOverlay
            r1.<init>(r0)
            return r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.NavigateArrow addNavigateArrow(com.amap.api.maps.model.NavigateArrowOptions r5) throws android.os.RemoteException {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.NavigateArrowOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "NAVIGATEARROW"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.NavigateArrow r2 = new com.amap.api.maps.model.NavigateArrow     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.NavigateArrow r5 = (com.amap.api.maps.model.NavigateArrow) r5     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = move-exception
            goto L28
        L27:
            return r2
        L28:
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r1 = com.amap.api.maps.AMap.OnCameraChangeListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnIndoorBuildingActiveListener> r1 = com.amap.api.maps.AMap.OnIndoorBuildingActiveListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnInfoWindowClickListener> r1 = com.amap.api.maps.AMap.OnInfoWindowClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapClickListener> r1 = com.amap.api.maps.AMap.OnMapClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapLoadedListener> r1 = com.amap.api.maps.AMap.OnMapLoadedListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapLongClickListener> r1 = com.amap.api.maps.AMap.OnMapLongClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapTouchListener> r1 = com.amap.api.maps.AMap.OnMapTouchListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerClickListener> r1 = com.amap.api.maps.AMap.OnMarkerClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r1 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMyLocationChangeListener> r1 = com.amap.api.maps.AMap.OnMyLocationChangeListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnPOIClickListener> r1 = com.amap.api.maps.AMap.OnPOIClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnPolylineClickListener> r1 = com.amap.api.maps.AMap.OnPolylineClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addOverlayTexture(int r9, com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty r10) {
            r8 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L32
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r1 = r0.getOverlayBundle(r9)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto Lb
            goto L32
        Lb:
            if (r10 == 0) goto L32
            android.graphics.Bitmap r0 = r10.mBitmap     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L12
            goto L32
        L12:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z     // Catch: java.lang.Throwable -> L2f
            r0.addOverlayTexture(r9, r10)     // Catch: java.lang.Throwable -> L2f
            int r2 = r10.mId     // Catch: java.lang.Throwable -> L2f
            int r3 = r10.mAnchor     // Catch: java.lang.Throwable -> L2f
            float r4 = r10.mXRatio     // Catch: java.lang.Throwable -> L2f
            float r5 = r10.mYRatio     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r9 = r10.mBitmap     // Catch: java.lang.Throwable -> L2f
            int r6 = r9.getWidth()     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r9 = r10.mBitmap     // Catch: java.lang.Throwable -> L2f
            int r7 = r9.getHeight()     // Catch: java.lang.Throwable -> L2f
            r1.addOverlayTextureItem(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            r9 = r0
            goto L33
        L32:
            return
        L33:
            com.amap.api.col.p0003l.b3.D(r9)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.particle.ParticleOverlay addParticleOverlay(com.amap.api.maps.model.particle.ParticleOverlayOptions r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L24
            android.content.Context r1 = r4.Y     // Catch: java.lang.Throwable -> L24
            com.amap.api.col.p0003l.y2.n(r1)     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r4.l     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "PARTICLEOVERLAY"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.particle.ParticleOverlay r2 = new com.amap.api.maps.model.particle.ParticleOverlay     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L24
            r2.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.BaseOverlay r5 = r3.addOverlayObject(r1, r2, r5)     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.particle.ParticleOverlay r5 = (com.amap.api.maps.model.particle.ParticleOverlay) r5     // Catch: java.lang.Throwable -> L24
            return r5
        L24:
            r5 = move-exception
            com.amap.api.col.p0003l.b3.D(r5)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Polygon addPolygon(com.amap.api.maps.model.PolygonOptions r6) throws android.os.RemoteException {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r5.resetRenderTime()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.PolygonOptions r1 = r6.clone()     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r5.l     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "POLYGON"
            java.lang.String r2 = r2.createId(r3)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Polygon r3 = new com.amap.api.maps.model.Polygon     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r4 = r5.l     // Catch: java.lang.Throwable -> L25
            r3.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.interfaces.IGlOverlayLayer r4 = r5.l     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            com.amap.api.maps.model.BaseOverlay r1 = r4.addOverlayObject(r2, r3, r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.maps.model.Polygon r1 = (com.amap.api.maps.model.Polygon) r1     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            goto L28
        L27:
            return r3
        L28:
            com.amap.api.col.p0003l.b3.D(r1)
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3065d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "addPolygon failed "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.amap.api.col.p0003l.d3.g(r2, r1, r6)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Polyline addPolyline(com.amap.api.maps.model.PolylineOptions r6) throws android.os.RemoteException {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r5.resetRenderTime()     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r5.l     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "POLYLINE"
            java.lang.String r1 = r1.createId(r2)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.model.Polyline r2 = new com.amap.api.maps.model.Polyline     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r5.l     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r6, r1)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r5.l     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.model.BaseOverlay r2 = r3.addOverlayObject(r1, r2, r6)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.model.Polyline r2 = (com.amap.api.maps.model.Polyline) r2     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = com.amap.api.col.p0003l.c3.f3065d     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "addPolyline "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r4.concat(r1)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.p0003l.d3.m(r3, r1)     // Catch: java.lang.Throwable -> L2e
            return r2
        L2e:
            r1 = move-exception
            com.amap.api.col.p0003l.b3.D(r1)
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3065d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "addPolyline failed "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.amap.api.col.p0003l.d3.h(r2, r1, r6)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$SignleClickInterceptorListener> r1 = com.amap.api.maps.AMap.SignleClickInterceptorListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.Text addText(com.amap.api.maps.model.TextOptions r5) throws android.os.RemoteException {
            r4 = this;
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r4.l     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "TEXT"
            java.lang.String r0 = r0.createId(r1)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.model.TextOptions r5 = r5.clone()     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.model.MarkerOptions r1 = com.amap.api.col.p0003l.t1.b(r5)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.model.Marker r2 = new com.amap.api.maps.model.Marker     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r5.getObject()     // Catch: java.lang.Throwable -> L2c
            r2.setObject(r3)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r4.l     // Catch: java.lang.Throwable -> L2c
            r3.addOverlayObject(r0, r2, r1)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.model.Text r0 = new com.amap.api.maps.model.Text     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            r5 = move-exception
            com.amap.api.col.p0003l.b3.D(r5)
            r5 = 0
            return r5
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.TileOverlay addTileOverlay(com.amap.api.maps.model.TileOverlayOptions r4) throws android.os.RemoteException {
            r3 = this;
            com.amap.api.maps.model.TileProvider r0 = r4.getTileProvider()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            boolean r0 = r0 instanceof com.amap.api.maps.model.HeatmapTileProvider     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            android.content.Context r0 = r3.Y     // Catch: java.lang.Throwable -> L10
            com.amap.api.col.p0003l.y2.c(r0)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L27
        L12:
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r3.l     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "TILEOVERLAY"
            java.lang.String r0 = r0.createId(r1)     // Catch: java.lang.Throwable -> L10
            com.amap.api.maps.model.TileOverlay r1 = new com.amap.api.maps.model.TileOverlay     // Catch: java.lang.Throwable -> L10
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2, r4, r0)     // Catch: java.lang.Throwable -> L10
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r3.l     // Catch: java.lang.Throwable -> L10
            r2.addOverlayObject(r0, r1, r4)     // Catch: java.lang.Throwable -> L10
            return r1
        L27:
            com.amap.api.col.p0003l.b3.D(r4)
            r4 = 0
            return r4
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterAnimation() {
            r0 = this;
            r0.redrawInfoWindow()
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawFrame(int r2, com.autonavi.base.ae.gmap.GLMapState r3) {
            r1 = this;
            float r3 = r3.getMapZoomer()
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 == 0) goto L17
            boolean r0 = r0.isInMapAction(r2)
            if (r0 != 0) goto L32
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            boolean r2 = r0.isInMapAnimation(r2)
            if (r2 == 0) goto L17
            goto L32
        L17:
            int r2 = r1.S
            r0 = -1
            if (r2 == r0) goto L23
            com.autonavi.base.ae.gmap.GLMapRender r0 = r1.f3856a0
            float r2 = (float) r2
            r0.setRenderFps(r2)
            goto L2a
        L23:
            com.autonavi.base.ae.gmap.GLMapRender r2 = r1.f3856a0
            r0 = 1097859072(0x41700000, float:15.0)
            r2.setRenderFps(r0)
        L2a:
            float r2 = r1.f0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L32
            r1.f0 = r3
        L32:
            boolean r2 = r1.o0
            if (r2 != 0) goto L39
            r2 = 1
            r1.o0 = r2
        L39:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawLabel(int r3, com.autonavi.base.ae.gmap.GLMapState r4) {
            r2 = this;
            r2.h0()
            com.autonavi.extra.b r3 = r2.P0
            if (r3 == 0) goto La
            r3.e()
        La:
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto L11
            r3.pushRendererState()
        L11:
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r2.l
            int r4 = r2.P
            boolean r0 = r2.y0
            r1 = 1
            boolean r3 = r3.draw(r1, r4, r0)
            if (r3 == 0) goto L21
            int r3 = r2.U0
            goto L24
        L21:
            int r3 = r2.U0
            int r3 = r3 + r1
        L24:
            r2.U0 = r3
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto L2d
            r3.popRendererState()
        L2d:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterRendererOver(int r3, com.autonavi.base.ae.gmap.GLMapState r4) {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto L7
            r3.pushRendererState()
        L7:
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r2.l
            int r4 = r2.P
            boolean r0 = r2.y0
            r1 = 2
            r3.draw(r1, r4, r0)
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto L18
            r3.popRendererState()
        L18:
            com.amap.api.maps.CustomRenderer r3 = r2.Q
            if (r3 == 0) goto L20
            r4 = 0
            r3.onDrawFrame(r4)
        L20:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCamera(com.amap.api.maps.CameraUpdate r1) throws android.os.RemoteException {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = r1.getCameraUpdateFactoryDelegate()
            r0.animateCamera(r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCamera(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r4) throws android.os.RemoteException {
            r3 = this;
            r0 = 250(0xfa, double:1.235E-321)
            r2 = 0
            r3.animateCameraWithDurationAndCallback(r4, r0, r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCameraWithCallback(com.amap.api.maps.CameraUpdate r3, com.amap.api.maps.AMap.CancelableCallback r4) throws android.os.RemoteException {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 250(0xfa, double:1.235E-321)
            r2.animateCameraWithDurationAndCallback(r3, r0, r4)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCameraWithDurationAndCallback(com.amap.api.maps.CameraUpdate r1, long r2, com.amap.api.maps.AMap.CancelableCallback r4) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = r1.getCameraUpdateFactoryDelegate()
            r0.animateCameraWithDurationAndCallback(r1, r2, r4)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCameraWithDurationAndCallback(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2, long r3, com.amap.api.maps.AMap.CancelableCallback r5) {
            r1 = this;
            if (r2 == 0) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L4a
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 != 0) goto Lf
            goto L4a
        Lf:
            r2.mCallback = r5
            r2.mDuration = r3
            boolean r3 = r1.p
            if (r3 != 0) goto L3b
            int r3 = r1.getMapHeight()
            if (r3 == 0) goto L3b
            int r3 = r1.getMapWidth()
            if (r3 != 0) goto L24
            goto L3b
        L24:
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r1.Z     // Catch: java.lang.Throwable -> L36
            r3.interruptAnimation()     // Catch: java.lang.Throwable -> L36
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L36
            r1.o(r2)     // Catch: java.lang.Throwable -> L36
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r1.Z     // Catch: java.lang.Throwable -> L36
            r4 = 1
            r3.addMessage(r2, r4)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
            return
        L3b:
            r1.moveCamera(r2)     // Catch: java.lang.Throwable -> L46
            com.amap.api.maps.AMap$CancelableCallback r2 = r2.mCallback     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L4a
            r2.onFinish()     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
        L4a:
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void beforeDrawLabel(int r3, com.autonavi.base.ae.gmap.GLMapState r4) {
            r2 = this;
            r2.h0()
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto La
            r3.pushRendererState()
        La:
            com.amap.api.maps.interfaces.IGlOverlayLayer r3 = r2.l
            int r4 = r2.P
            boolean r0 = r2.y0
            r1 = 0
            boolean r3 = r3.draw(r1, r4, r0)
            if (r3 == 0) goto L1a
            int r3 = r2.U0
            goto L1e
        L1a:
            int r3 = r2.U0
            int r3 = r3 + 1
        L1e:
            r2.U0 = r3
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 == 0) goto L27
            r3.popRendererState()
        L27:
            return
    }

    public final android.util.Size c(android.util.Size r12) {
            r11 = this;
            android.util.Size r0 = new android.util.Size
            int r1 = r11.getMapWidth()
            int r2 = r11.getMapHeight()
            r0.<init>(r1, r2)
            int r4 = r11.getNativeEngineID()
            int r7 = r12.getWidth()
            int r8 = r12.getHeight()
            int r9 = r12.getWidth()
            int r10 = r12.getHeight()
            r5 = 0
            r6 = 0
            r3 = r11
            r3.h(r4, r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            int r2 = r12.getWidth()
            int r4 = r12.getHeight()
            r1.<init>(r2, r4)
            android.view.View r2 = r11.getGLMapView()
            r2.setLayoutParams(r1)
            com.amap.api.col.3l.i3 r2 = r3.f3868k
            com.amap.api.col.3l.el r2 = r2.f()
            r2.setLayoutParams(r1)
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            r11.changeSize(r1, r12)
            r12 = 0
            r11.D(r12)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final android.util.Pair<java.lang.Float, com.amap.api.maps.model.LatLng> calculateZoomToSpanLevel(int r9, int r10, int r11, int r12, com.amap.api.maps.model.LatLng r13, com.amap.api.maps.model.LatLng r14) {
            r8 = this;
            if (r13 == 0) goto L28
            if (r14 == 0) goto L28
            if (r9 != r10) goto L28
            if (r10 != r11) goto L28
            if (r11 != r12) goto L28
            double r0 = r13.latitude
            double r2 = r14.latitude
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            double r0 = r13.longitude
            double r2 = r14.longitude
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            android.util.Pair r9 = new android.util.Pair
            float r10 = r8.getMaxZoomLevel()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r9.<init>(r10, r13)
            return r9
        L28:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.getMapConfig()
            if (r13 == 0) goto L97
            if (r14 == 0) goto L97
            boolean r1 = r8.l0
            if (r1 == 0) goto L97
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.o
            boolean r1 = r1.get()
            if (r1 != 0) goto L97
            com.amap.api.maps.model.LatLngBounds$Builder r1 = new com.amap.api.maps.model.LatLngBounds$Builder
            r1.<init>()
            r1.include(r13)
            r1.include(r14)
            com.autonavi.base.ae.gmap.GLMapState r13 = new com.autonavi.base.ae.gmap.GLMapState
            int r14 = r8.n
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r8.Z
            long r2 = r2.getNativeInstance()
            r13.<init>(r14, r2)
            com.amap.api.maps.model.LatLngBounds r5 = r1.build()
            int r6 = r8.getMapWidth()
            int r7 = r8.getMapHeight()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.util.Pair r9 = com.amap.api.col.p0003l.b3.r(r0, r1, r2, r3, r4, r5, r6, r7)
            r13.recycle()
            if (r9 == 0) goto L95
            com.autonavi.amap.mapcore.DPoint r10 = com.autonavi.amap.mapcore.DPoint.obtain()
            java.lang.Object r11 = r9.second
            r12 = r11
            com.autonavi.amap.mapcore.IPoint r12 = (com.autonavi.amap.mapcore.IPoint) r12
            int r12 = r12.x
            long r12 = (long) r12
            com.autonavi.amap.mapcore.IPoint r11 = (com.autonavi.amap.mapcore.IPoint) r11
            int r11 = r11.y
            long r0 = (long) r11
            com.autonavi.base.ae.gmap.GLMapState.geo2LonLat(r12, r0, r10)
            android.util.Pair r11 = new android.util.Pair
            java.lang.Object r9 = r9.first
            com.amap.api.maps.model.LatLng r12 = new com.amap.api.maps.model.LatLng
            double r13 = r10.y
            double r0 = r10.x
            r12.<init>(r13, r0)
            r11.<init>(r9, r12)
            r10.recycle()
            return r11
        L95:
            r9 = 0
            return r9
        L97:
            com.autonavi.amap.mapcore.DPoint r9 = com.autonavi.amap.mapcore.DPoint.obtain()
            double r10 = r0.getSX()
            int r10 = (int) r10
            long r10 = (long) r10
            double r12 = r0.getSY()
            int r12 = (int) r12
            long r12 = (long) r12
            com.autonavi.base.ae.gmap.GLMapState.geo2LonLat(r10, r12, r9)
            android.util.Pair r10 = new android.util.Pair
            float r11 = r0.getSZ()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            com.amap.api.maps.model.LatLng r12 = new com.amap.api.maps.model.LatLng
            double r13 = r9.y
            double r0 = r9.x
            r12.<init>(r13, r0)
            r10.<init>(r11, r12)
            r9.recycle()
            return r10
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean canShowIndoorSwitch() {
            r3 = this;
            float r0 = r3.getZoomLevel()
            r1 = 1099431936(0x41880000, float:17.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L31
            com.amap.api.col.3l.z r0 = r3.t
            if (r0 == 0) goto L31
            android.graphics.Point r0 = r0.f4280g
            if (r0 == 0) goto L31
            com.autonavi.base.amap.mapcore.FPoint r0 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            com.amap.api.col.3l.z r1 = r3.t
            android.graphics.Point r1 = r1.f4280g
            int r2 = r1.x
            int r1 = r1.y
            r3.j(r2, r1, r0)
            android.graphics.Rect r1 = r3.H
            float r2 = r0.x
            int r2 = (int) r2
            float r0 = r0.y
            int r0 = (int) r0
            boolean r0 = r1.contains(r2, r0)
            if (r0 == 0) goto L31
            r0 = 1
            return r0
        L31:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean canStopMapRender() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L9
            int r1 = r2.n
            r0.canStopMapRender(r1)
        L9:
            r0 = 1
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeGLOverlayIndex() {
            r1 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r1.l
            r0.changeOverlayIndex()
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeLogoIconStyle(java.lang.String r2, boolean r3, int r4) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto Lf
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.q(r2, r3, r4)
        Lf:
            com.amap.api.col.3l.i r2 = r1.f3864g
            if (r2 == 0) goto L16
            r2.requestRefreshLogo()
        L16:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeMapLogo(int r2, boolean r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.o
            boolean r2 = r2.get()
            if (r2 == 0) goto L9
            goto L28
        L9:
            com.amap.api.col.3l.ba r2 = r1.f3857b     // Catch: java.lang.Throwable -> L28
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r0 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L28
            java.util.List r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L28
            if (r2 <= 0) goto L28
            com.amap.api.col.3l.i3 r2 = r1.f3868k     // Catch: java.lang.Throwable -> L28
            r3 = r3 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            r2.o(r3)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSize(int r2, int r3) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L10
            r1.d0 = r2
            r1.e0 = r3
            r0.setMapWidth(r2)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r1.q
            r2.setMapHeight(r3)
        L10:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSurface(int r5, javax.microedition.khronos.opengles.GL10 r6, int r7, int r8) {
            r4 = this;
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "changeSurface "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.d3.e(r0, r1)
            r0 = 0
            r4.o0 = r0
            boolean r1 = r4.l0
            if (r1 != 0) goto L26
            r1 = 0
            r4.createSurface(r5, r6, r1)
        L26:
            com.amap.api.col.3l.ja r1 = r4.f3858b0
            if (r1 == 0) goto L63
            android.content.Context r2 = r4.Y
            if (r2 == 0) goto L63
            int r2 = r4.d0
            int r1 = r1.g()
            if (r2 != r1) goto L40
            int r1 = r4.e0
            com.amap.api.col.3l.ja r2 = r4.f3858b0
            int r2 = r2.j()
            if (r1 == r2) goto L63
        L40:
            android.content.Context r1 = r4.Y
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            if (r1 == 0) goto L63
            android.view.Display r1 = r1.getDefaultDisplay()
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            if (r1 == 0) goto L63
            r1.getRealMetrics(r2)
            com.amap.api.col.3l.ja r1 = r4.f3858b0
            int r3 = r2.widthPixels
            int r2 = r2.heightPixels
            r1.c(r3, r2)
        L63:
            r4.d0 = r7
            r4.e0 = r8
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r0, r0, r7, r8)
            r4.H = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r4.d0
            int r3 = r4.e0
            r1.<init>(r0, r0, r2, r3)
            int r2 = r4.d0
            int r3 = r4.e0
            int r5 = r4.b(r5, r1, r2, r3)
            r4.n = r5
            java.lang.String r5 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "create engine with frame complete"
            com.amap.api.col.p0003l.d3.e(r5, r1)
            boolean r5 = r4.m0
            if (r5 != 0) goto Lcc
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q
            if (r5 == 0) goto L9f
            float r1 = r4.g0
            r5.setMapZoomScale(r1)
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q
            r5.setMapWidth(r7)
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q
            r5.setMapHeight(r8)
        L9f:
            com.autonavi.base.ae.gmap.GLMapEngine r5 = r4.Z
            int r1 = r4.n
            r5.setIndoorEnable(r1, r0)
            com.autonavi.base.ae.gmap.GLMapEngine r5 = r4.Z
            int r1 = r4.n
            r5.setSimple3DEnable(r1, r0)
            com.autonavi.base.ae.gmap.GLMapEngine r5 = r4.Z
            int r1 = r4.n
            r5.setStyleChangeGradualEnable(r1, r0)
            com.autonavi.base.ae.gmap.GLMapEngine r5 = r4.Z
            java.lang.String r0 = "{\"bounds\" : [{\"x2\" : 235405312,\"x1\" : 188874751,\"y2\" : 85065727,\"y1\" : 122421247}],\"sublyr\" : [{\"type\" : 4,\"sid\" : 9000006,\"zlevel\" : 2}],\"id\" : 9006,\"minzoom\" : 6,\"update_period\" : 90,\"maxzoom\" : 20,\"cachemode\" : 2,\"url\" : \"http://mpsapi.amap.com/ws/mps/lyrdata/ugc/\"}"
            r5.initMapOpenLayer(r0)
            com.autonavi.base.ae.gmap.GLMapEngine$InitParam r5 = new com.autonavi.base.ae.gmap.GLMapEngine$InitParam
            r5.<init>()
            android.content.Context r0 = r4.Y
            com.autonavi.base.amap.mapcore.AeUtil.initIntersectionRes(r0, r5)
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z
            java.lang.String r5 = r5.mIntersectionResPath
            r0.setVectorOverlayPath(r5)
        Lcc:
            monitor-enter(r4)
            r5 = 1
            r4.m0 = r5     // Catch: java.lang.Throwable -> L1b0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b0
            boolean r0 = r4.r
            if (r0 != 0) goto Le4
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            int r1 = r7 >> 1
            r0.setAnchorX(r1)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            int r1 = r8 >> 1
            r0.setAnchorY(r1)
            goto L106
        Le4:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            int r1 = r4.r0
            int r2 = r7 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r5, r1)
            r0.setAnchorX(r1)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            int r1 = r4.s0
            int r2 = r8 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r5, r1)
            r0.setAnchorY(r1)
        L106:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z
            int r1 = r4.n
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q
            int r2 = r2.getAnchorX()
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.q
            int r3 = r3.getAnchorY()
            r0.setProjectionCenter(r1, r2, r3)
            r4.f3865h = r5
            com.amap.api.col.3l.r9$t0 r5 = r4.L0
            boolean r0 = r5.a
            if (r0 == 0) goto L124
            r5.run()
        L124:
            com.amap.api.col.3l.r9$t0 r5 = r4.C0
            boolean r0 = r5.a
            if (r0 == 0) goto L12d
            r5.run()
        L12d:
            com.amap.api.col.3l.r9$t0 r5 = r4.D0
            boolean r0 = r5.a
            if (r0 == 0) goto L136
            r5.run()
        L136:
            com.amap.api.col.3l.r9$t0 r5 = r4.A0
            boolean r0 = r5.a
            if (r0 == 0) goto L13f
            r5.run()
        L13f:
            com.amap.api.col.3l.r9$t0 r5 = r4.E0
            boolean r0 = r5.a
            if (r0 == 0) goto L148
            r5.run()
        L148:
            com.amap.api.col.3l.r9$t0 r5 = r4.O0
            boolean r0 = r5.a
            if (r0 == 0) goto L151
            r5.run()
        L151:
            com.amap.api.col.3l.r9$t0 r5 = r4.F0
            boolean r0 = r5.a
            if (r0 == 0) goto L15a
            r5.run()
        L15a:
            com.amap.api.col.3l.r9$t0 r5 = r4.G0
            boolean r0 = r5.a
            if (r0 == 0) goto L163
            r5.run()
        L163:
            com.amap.api.col.3l.r9$t0 r5 = r4.H0
            boolean r0 = r5.a
            if (r0 == 0) goto L16c
            r5.run()
        L16c:
            com.amap.api.col.3l.r9$t0 r5 = r4.M0
            boolean r0 = r5.a
            if (r0 == 0) goto L175
            r5.run()
        L175:
            com.amap.api.col.3l.r9$t0 r5 = r4.B0
            boolean r0 = r5.a
            if (r0 == 0) goto L17e
            r5.run()
        L17e:
            com.amap.api.col.3l.r9$t0 r5 = r4.I0
            boolean r0 = r5.a
            if (r0 == 0) goto L187
            r5.run()
        L187:
            com.amap.api.col.3l.r9$t0 r5 = r4.J0
            if (r5 == 0) goto L18e
            r5.run()
        L18e:
            com.amap.api.col.3l.r9$t0 r5 = r4.K0
            if (r5 == 0) goto L195
            r5.run()
        L195:
            com.amap.api.maps.CustomRenderer r5 = r4.Q
            if (r5 == 0) goto L19c
            r5.onSurfaceChanged(r6, r7, r8)
        L19c:
            com.autonavi.extra.b r5 = r4.P0
            if (r5 == 0) goto L1a3
            r5.d()
        L1a3:
            android.os.Handler r5 = r4.z0
            if (r5 == 0) goto L1ac
            java.lang.Runnable r6 = r4.N0
            r5.post(r6)
        L1ac:
            r4.redrawInfoWindow()
            return
        L1b0:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b0
            throw r5
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void changeSurface(javax.microedition.khronos.opengles.GL10 r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.changeSurface(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void checkMapState(com.autonavi.amap.api.mapcore.IGLMapState r13) {
            r12 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r12.q
            if (r0 == 0) goto Lf6
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.o
            boolean r0 = r0.get()
            if (r0 == 0) goto Le
            goto Lf6
        Le:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r12.q
            com.amap.api.maps.model.LatLngBounds r0 = r0.getLimitLatLngBounds()
            if (r0 == 0) goto Lce
            com.autonavi.base.amap.mapcore.MapConfig r1 = r12.q     // Catch: java.lang.Throwable -> L48
            com.autonavi.amap.mapcore.IPoint[] r1 = r1.getLimitIPoints()     // Catch: java.lang.Throwable -> L48
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L4c
            com.autonavi.amap.mapcore.IPoint r1 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.LatLng r4 = r0.northeast     // Catch: java.lang.Throwable -> L48
            double r5 = r4.longitude     // Catch: java.lang.Throwable -> L48
            double r7 = r4.latitude     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r5, r7, r1)     // Catch: java.lang.Throwable -> L48
            com.autonavi.amap.mapcore.IPoint r4 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.LatLng r0 = r0.southwest     // Catch: java.lang.Throwable -> L48
            double r5 = r0.longitude     // Catch: java.lang.Throwable -> L48
            double r7 = r0.latitude     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapState.lonlat2Geo(r5, r7, r4)     // Catch: java.lang.Throwable -> L48
            r0 = 2
            com.autonavi.amap.mapcore.IPoint[] r0 = new com.autonavi.amap.mapcore.IPoint[r0]     // Catch: java.lang.Throwable -> L48
            r0[r3] = r1     // Catch: java.lang.Throwable -> L48
            r0[r2] = r4     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r1 = r12.q     // Catch: java.lang.Throwable -> L48
            r1.setLimitIPoints(r0)     // Catch: java.lang.Throwable -> L48
            r1 = r0
            goto L4c
        L48:
            r0 = move-exception
            r13 = r0
            goto Lf3
        L4c:
            com.autonavi.base.amap.mapcore.MapConfig r4 = r12.q     // Catch: java.lang.Throwable -> L48
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L48
            int r5 = r0.x     // Catch: java.lang.Throwable -> L48
            int r6 = r0.y     // Catch: java.lang.Throwable -> L48
            r0 = r1[r2]     // Catch: java.lang.Throwable -> L48
            int r7 = r0.x     // Catch: java.lang.Throwable -> L48
            int r8 = r0.y     // Catch: java.lang.Throwable -> L48
            int r9 = r12.getMapWidth()     // Catch: java.lang.Throwable -> L48
            int r10 = r12.getMapHeight()     // Catch: java.lang.Throwable -> L48
            float r0 = com.amap.api.col.p0003l.b3.j(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L48
            float r4 = r13.getMapZoomer()     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r5 = r12.q     // Catch: java.lang.Throwable -> L48
            boolean r5 = r5.isSetLimitZoomLevel()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L94
            com.autonavi.base.amap.mapcore.MapConfig r5 = r12.q     // Catch: java.lang.Throwable -> L48
            float r5 = r5.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r6 = r12.q     // Catch: java.lang.Throwable -> L48
            float r6 = r6.getMinZoomLevel()     // Catch: java.lang.Throwable -> L48
            float r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L48
            float r4 = java.lang.Math.max(r0, r4)     // Catch: java.lang.Throwable -> L48
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8b
            goto L8c
        L8b:
            r5 = r4
        L8c:
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto L92
            r0 = r6
            goto L9f
        L92:
            r0 = r5
            goto L9f
        L94:
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L9e
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 >= 0) goto L9e
            goto L9f
        L9e:
            r0 = r4
        L9f:
            r13.setMapZoomer(r0)     // Catch: java.lang.Throwable -> L48
            com.autonavi.amap.mapcore.IPoint r0 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L48
            r13.getMapGeoCenter(r0)     // Catch: java.lang.Throwable -> L48
            int r10 = r0.x     // Catch: java.lang.Throwable -> L48
            int r11 = r0.y     // Catch: java.lang.Throwable -> L48
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L48
            r5 = r4
            int r4 = r5.x     // Catch: java.lang.Throwable -> L48
            int r5 = r5.y     // Catch: java.lang.Throwable -> L48
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L48
            int r6 = r1.x     // Catch: java.lang.Throwable -> L48
            int r7 = r1.y     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r8 = r12.q     // Catch: java.lang.Throwable -> L48
            r9 = r13
            int[] r13 = com.amap.api.col.p0003l.b3.U(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L48
            r1 = r13[r3]     // Catch: java.lang.Throwable -> L48
            r13 = r13[r2]     // Catch: java.lang.Throwable -> L48
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L48
            double r3 = (double) r13     // Catch: java.lang.Throwable -> L48
            r9.setMapGeoCenter(r1, r3)     // Catch: java.lang.Throwable -> L48
            r0.recycle()     // Catch: java.lang.Throwable -> L48
            return
        Lce:
            r9 = r13
            com.autonavi.base.amap.mapcore.MapConfig r13 = r12.q     // Catch: java.lang.Throwable -> L48
            boolean r13 = r13.isSetLimitZoomLevel()     // Catch: java.lang.Throwable -> L48
            if (r13 == 0) goto Lf6
            float r13 = r9.getMapZoomer()     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r0 = r12.q     // Catch: java.lang.Throwable -> L48
            float r0 = r0.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.mapcore.MapConfig r1 = r12.q     // Catch: java.lang.Throwable -> L48
            float r1 = r1.getMinZoomLevel()     // Catch: java.lang.Throwable -> L48
            float r13 = java.lang.Math.min(r13, r0)     // Catch: java.lang.Throwable -> L48
            float r13 = java.lang.Math.max(r1, r13)     // Catch: java.lang.Throwable -> L48
            r9.setMapZoomer(r13)     // Catch: java.lang.Throwable -> L48
            return
        Lf3:
            com.amap.api.col.p0003l.b3.D(r13)
        Lf6:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float checkZoomLevel(float r2) throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            float r2 = com.amap.api.col.p0003l.b3.h(r0, r2)
            return r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear() throws android.os.RemoteException {
            r3 = this;
            r0 = 0
            r3.clear(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r0 = move-exception
            java.lang.String r1 = "AMapDelegateImp"
            java.lang.String r2 = "clear"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear(boolean r3) throws android.os.RemoteException {
            r2 = this;
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = ""
            com.amap.api.col.3l.q1 r1 = r2.u     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L1b
            if (r3 == 0) goto L18
            java.lang.String r3 = r1.p()     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.q1 r0 = r2.u     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.q()     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r3 = move-exception
            goto L31
        L18:
            r1.r()     // Catch: java.lang.Throwable -> L16
        L1b:
            r3 = 0
        L1c:
            com.amap.api.maps.interfaces.IGlOverlayLayer r1 = r2.l     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r3 = new java.lang.String[]{r3, r0}     // Catch: java.lang.Throwable -> L16
            r1.clear(r3)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.r9$l r3 = new com.amap.api.col.3l.r9$l     // Catch: java.lang.Throwable -> L16
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L16
            r2.queueEvent(r3)     // Catch: java.lang.Throwable -> L16
            r2.resetRenderTime()     // Catch: java.lang.Throwable -> L16
            return
        L31:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "clear"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void clearTileCache() {
            r1 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r1.l
            r0.clearTileCache()
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long createGLOverlay(int r3) {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto Lb
            int r1 = r2.n
            long r0 = r0.createOverlay(r1, r3)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final java.lang.String createId(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r1.l
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.createId(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int createOverlayTexture(int r3, android.graphics.Bitmap r4) {
            r2 = this;
            r0 = -1
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r2.Z     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L11
            if (r4 != 0) goto L8
            return r0
        L8:
            int r3 = r1.createOverlayTexture(r3, r4)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
        L11:
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final synchronized void createSurface(int r4, javax.microedition.khronos.opengles.GL10 r5, javax.microedition.khronos.egl.EGLConfig r6) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r4 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "createSurface"
            com.amap.api.col.p0003l.d3.e(r4, r0)     // Catch: java.lang.Throwable -> L23
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L23
            r3.x0 = r0     // Catch: java.lang.Throwable -> L23
            int r4 = r3.I     // Catch: java.lang.Throwable -> L23
            r0 = 3
            if (r4 == r0) goto L26
            r0 = 6
            if (r4 != r0) goto L17
            goto L26
        L17:
            com.amap.api.col.3l.i3 r4 = r3.f3868k     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.ed r4 = r4.d()     // Catch: java.lang.Throwable -> L23
            int r0 = com.amap.api.col.p0003l.ed.f3195b     // Catch: java.lang.Throwable -> L23
            r4.b(r0)     // Catch: java.lang.Throwable -> L23
            goto L31
        L23:
            r4 = move-exception
            goto L10c
        L26:
            com.amap.api.col.3l.i3 r4 = r3.f3868k     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.ed r4 = r4.d()     // Catch: java.lang.Throwable -> L23
            int r0 = com.amap.api.col.p0003l.ed.f3196c     // Catch: java.lang.Throwable -> L23
            r4.b(r0)     // Catch: java.lang.Throwable -> L23
        L31:
            r4 = 0
            r3.m0 = r4     // Catch: java.lang.Throwable -> L23
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r3.f3867j     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> L23
            r3.d0 = r0     // Catch: java.lang.Throwable -> L23
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r3.f3867j     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L23
            r3.e0 = r0     // Catch: java.lang.Throwable -> L23
            r3.o0 = r4     // Catch: java.lang.Throwable -> L23
            android.content.Context r4 = r3.Y     // Catch: java.lang.Throwable -> L86
            com.autonavi.base.amap.mapcore.AeUtil.loadLib(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "load lib complete"
            com.amap.api.col.p0003l.d3.e(r4, r0)     // Catch: java.lang.Throwable -> L86
            android.content.Context r4 = r3.Y     // Catch: java.lang.Throwable -> L86
            com.autonavi.base.amap.mapcore.AeUtil.initCrashHandle(r4)     // Catch: java.lang.Throwable -> L86
            android.content.Context r4 = r3.Y     // Catch: java.lang.Throwable -> L86
            com.autonavi.base.ae.gmap.GLMapEngine$InitParam r4 = com.autonavi.base.amap.mapcore.AeUtil.initResource(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "load res complete"
            com.amap.api.col.p0003l.d3.e(r0, r1)     // Catch: java.lang.Throwable -> L86
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r3.Z     // Catch: java.lang.Throwable -> L86
            r0.createAMapInstance(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "create engine complete"
            com.amap.api.col.p0003l.d3.e(r4, r0)     // Catch: java.lang.Throwable -> L86
            com.amap.api.col.3l.v1 r4 = new com.amap.api.col.3l.v1     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            r3.u0 = r4     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "init shader complete"
            com.amap.api.col.p0003l.d3.e(r4, r0)     // Catch: java.lang.Throwable -> L86
            com.autonavi.extra.b r4 = r3.P0     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L88
            r4.i()     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r4 = move-exception
            goto L94
        L88:
            r4 = 1
            r3.l0 = r4     // Catch: java.lang.Throwable -> L86
            r4 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r4 = r5.glGetString(r4)     // Catch: java.lang.Throwable -> L86
            r3.Y0 = r4     // Catch: java.lang.Throwable -> L86
            goto Lcc
        L94:
            com.amap.api.col.p0003l.b3.D(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "AMapDElegateImp"
            java.lang.String r1 = "createSurface"
            com.amap.api.col.p0003l.w5.p(r4, r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "createSurface failed "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L23
            r1.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.p0003l.d3.l(r0, r1)     // Catch: java.lang.Throwable -> L23
            android.content.Context r0 = r3.Y     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "init failed:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L23
            r1.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.p0003l.y2.l(r0, r4)     // Catch: java.lang.Throwable -> L23
        Lcc:
            android.content.Context r4 = r3.Y     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.n4 r4 = com.amap.api.col.p0003l.ft.a(r4, r0)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.ft$c r4 = r4.a     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.ft$c r0 = com.amap.api.col.3l.ft.c.a     // Catch: java.lang.Throwable -> L23
            if (r4 != r0) goto Ldf
            r3.o0()     // Catch: java.lang.Throwable -> L23
        Ldf:
            boolean r4 = com.amap.api.maps.MapsInitializer.isTerrainEnable()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto Lf7
            com.amap.api.col.3l.ga r4 = r3.M     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto Lf7
            com.amap.api.col.3l.ga r4 = new com.amap.api.col.3l.ga     // Catch: java.lang.Throwable -> L23
            android.content.Context r0 = r3.Y     // Catch: java.lang.Throwable -> L23
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L23
            r3.M = r4     // Catch: java.lang.Throwable -> L23
            r0 = 0
            r4.d(r0)     // Catch: java.lang.Throwable -> L23
        Lf7:
            com.amap.api.maps.CustomRenderer r4 = r3.Q     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto Lfe
            r4.onSurfaceCreated(r5, r6)     // Catch: java.lang.Throwable -> L23
        Lfe:
            com.autonavi.extra.b r4 = r3.P0     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L105
            r4.c()     // Catch: java.lang.Throwable -> L23
        L105:
            com.amap.api.maps.interfaces.IGlOverlayLayer r4 = r3.l     // Catch: java.lang.Throwable -> L23
            r4.onCreateAMapInstance()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return
        L10c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void createSurface(javax.microedition.khronos.opengles.GL10 r3, javax.microedition.khronos.egl.EGLConfig r4) {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lb
            r2.X = r0     // Catch: java.lang.Throwable -> Lb
            goto Lf
        Lb:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        Lf:
            r0 = 1
            r2.createSurface(r0, r3, r4)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroy() {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.o
            r1 = 1
            r0.set(r1)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3064c
            java.lang.String r1 = "destroy map"
            com.amap.api.col.p0003l.d3.e(r0, r1)
            com.amap.api.maps.LocationSource r0 = r5.v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L18
            r0.deactivate()     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            goto Lb0
        L18:
            r0 = 0
            r5.v = r0     // Catch: java.lang.Throwable -> L15
            r5.t0 = r0     // Catch: java.lang.Throwable -> L15
            com.autonavi.base.ae.gmap.GLMapRender r1 = r5.f3856a0     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L24
            r1.renderPause()     // Catch: java.lang.Throwable -> L15
        L24:
            r5.a0()     // Catch: java.lang.Throwable -> L15
            java.lang.Thread r1 = r5.K     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L30
            r1.interrupt()     // Catch: java.lang.Throwable -> L15
            r5.K = r0     // Catch: java.lang.Throwable -> L15
        L30:
            java.lang.Thread r1 = r5.L     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L39
            r1.interrupt()     // Catch: java.lang.Throwable -> L15
            r5.L = r0     // Catch: java.lang.Throwable -> L15
        L39:
            com.amap.api.col.3l.ga r1 = r5.M     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L42
            r1.c()     // Catch: java.lang.Throwable -> L15
            r5.M = r0     // Catch: java.lang.Throwable -> L15
        L42:
            com.amap.api.col.3l.x1 r1 = r5.U     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L4b
            r1.a()     // Catch: java.lang.Throwable -> L15
            r5.U = r0     // Catch: java.lang.Throwable -> L15
        L4b:
            com.amap.api.col.3l.z1 r1 = r5.V     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L59
            r1.b(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.z1 r1 = r5.V     // Catch: java.lang.Throwable -> L15
            r1.a()     // Catch: java.lang.Throwable -> L15
            r5.V = r0     // Catch: java.lang.Throwable -> L15
        L59:
            com.amap.api.col.p0003l.p2.f()     // Catch: java.lang.Throwable -> L15
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r5.Z     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L82
            r1.setMapListener(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.r9$b0 r1 = new com.amap.api.col.3l.r9$b0     // Catch: java.lang.Throwable -> L15
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15
            r5.queueEvent(r1)     // Catch: java.lang.Throwable -> L15
            r1 = 0
        L6c:
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r5.Z     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L82
            int r2 = r1 + 1
            r3 = 50
            if (r1 >= r3) goto L82
            r3 = 20
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L15 java.lang.InterruptedException -> L7c
            goto L80
        L7c:
            r1 = move-exception
            com.amap.api.col.p0003l.b3.D(r1)     // Catch: java.lang.Throwable -> L15
        L80:
            r1 = r2
            goto L6c
        L82:
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r1 = r5.f3867j     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L8e
            r1.onDetachedGLThread()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            com.amap.api.col.p0003l.b3.D(r1)     // Catch: java.lang.Throwable -> L15
        L8e:
            com.amap.api.col.3l.i3 r1 = r5.f3868k     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L97
            r1.g()     // Catch: java.lang.Throwable -> L15
            r5.f3868k = r0     // Catch: java.lang.Throwable -> L15
        L97:
            com.amap.api.col.3l.q1 r1 = r5.u     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto La0
            r1.n()     // Catch: java.lang.Throwable -> L15
            r5.u = r0     // Catch: java.lang.Throwable -> L15
        La0:
            r5.v = r0     // Catch: java.lang.Throwable -> L15
            r5.a = r0     // Catch: java.lang.Throwable -> L15
            r5.v0()     // Catch: java.lang.Throwable -> L15
            r5.J = r0     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.p0003l.d3.a()     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.p0003l.w5.m()     // Catch: java.lang.Throwable -> L15
            return
        Lb0:
            java.lang.String r1 = "AMapDelegateImp"
            java.lang.String r2 = "destroy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroySurface(int r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r2 = r1.p0
            r2.lock()
            boolean r2 = r1.l0     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L4b
            android.opengl.EGL14.eglGetCurrentContext()     // Catch: java.lang.Throwable -> L2a
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L2a
            r1.x0()     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r1.Z     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L44
            int r0 = r1.n     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r2 = r2.getOverlayBundle(r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r1.Z     // Catch: java.lang.Throwable -> L2a
            int r0 = r1.n     // Catch: java.lang.Throwable -> L2a
            com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle r2 = r2.getOverlayBundle(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            r2.removeAll(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r2 = move-exception
            goto L58
        L2c:
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r1.Z     // Catch: java.lang.Throwable -> L2a
            r2.destroyAMapEngine()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r1.Z = r2     // Catch: java.lang.Throwable -> L2a
            int r2 = r1.U0     // Catch: java.lang.Throwable -> L2a
            if (r2 <= 0) goto L3d
            android.content.Context r0 = r1.Y     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.p0003l.y2.d(r0, r2)     // Catch: java.lang.Throwable -> L2a
        L3d:
            java.lang.String r2 = com.amap.api.col.p0003l.c3.f3064c     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "destroy engine complete"
            com.amap.api.col.p0003l.d3.e(r2, r0)     // Catch: java.lang.Throwable -> L2a
        L44:
            com.autonavi.extra.b r2 = r1.P0     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L4b
            r2.f()     // Catch: java.lang.Throwable -> L2a
        L4b:
            r2 = 0
            r1.l0 = r2     // Catch: java.lang.Throwable -> L2a
            r1.m0 = r2     // Catch: java.lang.Throwable -> L2a
            r1.o0 = r2     // Catch: java.lang.Throwable -> L2a
        L52:
            java.util.concurrent.locks.Lock r2 = r1.p0
            r2.unlock()
            return
        L58:
            com.amap.api.col.p0003l.b3.D(r2)     // Catch: java.lang.Throwable -> L5c
            goto L52
        L5c:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.p0
            r0.unlock()
            throw r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void drawFrame(javax.microedition.khronos.opengles.GL10 r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.o
            boolean r3 = r3.get()
            if (r3 != 0) goto Lb7
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            if (r3 != 0) goto Le
            goto Lb7
        Le:
            android.opengl.EGLContext r3 = android.opengl.EGL14.eglGetCurrentContext()
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r3 != r0) goto L18
            goto Lb7
        L18:
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            if (r3 == 0) goto L28
            boolean r3 = r3.isMapEnable()
            if (r3 != 0) goto L28
            r3 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r3)
            return
        L28:
            int r3 = r2.n
            r2.f(r3)
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            r3.renderAMap()
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            r3.pushRendererState()
            android.os.Handler r3 = r2.z0
            r0 = 30
            r3.sendEmptyMessage(r0)
            com.amap.api.col.3l.v8 r3 = r2.w0
            if (r3 == 0) goto L45
            r3.a()
        L45:
            r2.e0()
            r2.j0()
            boolean r3 = r2.n0
            if (r3 != 0) goto L52
            r3 = 1
            r2.n0 = r3
        L52:
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r2.Z
            r3.popRendererState()
            boolean r3 = com.amap.api.col.p0003l.s2.b()
            if (r3 == 0) goto Lb7
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r3 = r2.f3867j     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r3 instanceof com.amap.api.col.p0003l.o     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto Lb7
            com.amap.api.col.3l.s2 r3 = r2.W     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L71
            com.amap.api.col.3l.s2 r3 = new com.amap.api.col.3l.s2     // Catch: java.lang.Throwable -> L6f
            r3.<init>()     // Catch: java.lang.Throwable -> L6f
            r2.W = r3     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r3 = move-exception
            goto Lb0
        L71:
            com.amap.api.col.3l.s2 r3 = r2.W     // Catch: java.lang.Throwable -> L6f
            r3.i()     // Catch: java.lang.Throwable -> L6f
            com.amap.api.col.3l.s2 r3 = r2.W     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r3.j()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto Lb7
            com.amap.api.col.3l.s2 r3 = r2.W     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r3.h()     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto Lb7
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r3 = r2.f3867j     // Catch: java.lang.Throwable -> L6f
            com.amap.api.col.3l.o r3 = (com.amap.api.col.p0003l.o) r3     // Catch: java.lang.Throwable -> L6f
            android.graphics.Bitmap r3 = r3.getBitmap()     // Catch: java.lang.Throwable -> L6f
            com.amap.api.col.3l.s2 r0 = r2.W     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r0.c(r3)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto Lb7
            boolean r3 = com.amap.api.col.p0003l.s2.e()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L9f
            r2.removecache()     // Catch: java.lang.Throwable -> L6f
        L9f:
            boolean r3 = com.amap.api.col.p0003l.s2.g()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto La8
            com.amap.api.col.p0003l.s2.k()     // Catch: java.lang.Throwable -> L6f
        La8:
            java.lang.String r3 = com.amap.api.col.p0003l.c3.f3068g     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "pure screen: found pure check"
            com.amap.api.col.p0003l.d3.l(r3, r0)     // Catch: java.lang.Throwable -> L6f
            return
        Lb0:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "PureScreenCheckTool.checkBlackScreen"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        Lb7:
            return
    }

    public final synchronized void g(int r8, int r9, int r10) {
            r7 = this;
            monitor-enter(r7)
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.i(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r7)
            return
        Lc:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc
            throw r8
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Latlng(int r4, int r5, com.autonavi.amap.mapcore.DPoint r6) {
            r3 = this;
            long r0 = (long) r4
            long r4 = (long) r5
            r2 = 20
            com.autonavi.amap.mapcore.DPoint r4 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r0, r4, r2)
            double r0 = r4.x
            r6.x = r0
            double r0 = r4.y
            r6.y = r0
            r4.recycle()
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Map(int r5, int r6, com.autonavi.base.amap.mapcore.FPoint r7) {
            r4 = this;
            double r0 = (double) r5
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q
            double r2 = r5.getSX()
            double r0 = r0 - r2
            int r5 = (int) r0
            float r5 = (float) r5
            r7.x = r5
            double r5 = (double) r6
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            double r0 = r0.getSY()
            double r5 = r5 - r0
            int r5 = (int) r5
            float r5 = (float) r5
            r7.y = r5
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.extra.b getAMapExtraInterfaceManager() {
            r1 = this;
            com.autonavi.extra.b r0 = r1.P0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.Projection getAMapProjection() throws android.os.RemoteException {
            r2 = this;
            com.amap.api.maps.Projection r0 = new com.amap.api.maps.Projection
            com.autonavi.base.amap.api.mapcore.IProjectionDelegate r1 = r2.f3863f
            r0.<init>(r1)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.UiSettings getAMapUiSettings() throws android.os.RemoteException {
            r2 = this;
            com.amap.api.maps.UiSettings r0 = r2.f3862e
            if (r0 != 0) goto Ld
            com.amap.api.maps.UiSettings r0 = new com.amap.api.maps.UiSettings
            com.amap.api.col.3l.i r1 = r2.f3864g
            r0.<init>(r1)
            r2.f3862e = r0
        Ld:
            com.amap.api.maps.UiSettings r0 = r2.f3862e
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.AMapCameraInfo getCamerInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getCameraAngle() {
            r1 = this;
            int r0 = r1.n
            float r0 = r1.getCameraDegree(r0)
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getCameraDegree(int r1) {
            r0 = this;
            com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q
            if (r1 == 0) goto L9
            float r1 = r1.getSC()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.r
            com.amap.api.maps.model.CameraPosition r0 = r1.getCameraPositionPrj(r0)
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.maps.model.CameraPosition getCameraPositionPrj(boolean r10) {
            r9 = this;
            r0 = 0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            if (r1 != 0) goto L6
            return r0
        L6:
            boolean r1 = r9.l0     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L64
            boolean r1 = r9.p     // Catch: java.lang.Throwable -> Lb0
            if (r1 != 0) goto L64
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r9.Z     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L64
            if (r10 == 0) goto L35
            com.autonavi.amap.mapcore.DPoint r10 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            int r1 = r1.getAnchorX()     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r2 = r9.q     // Catch: java.lang.Throwable -> Lb0
            int r2 = r2.getAnchorY()     // Catch: java.lang.Throwable -> Lb0
            r9.getPixel2LatLng(r1, r2, r10)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> Lb0
            double r4 = r10.y     // Catch: java.lang.Throwable -> Lb0
            double r6 = r10.x     // Catch: java.lang.Throwable -> Lb0
            r8 = 0
            r3.<init>(r4, r6, r8)     // Catch: java.lang.Throwable -> Lb0
            r10.recycle()     // Catch: java.lang.Throwable -> Lb0
            goto L39
        L35:
            com.amap.api.maps.model.LatLng r3 = r9.X()     // Catch: java.lang.Throwable -> Lb0
        L39:
            com.amap.api.maps.model.CameraPosition$Builder r10 = com.amap.api.maps.model.CameraPosition.builder()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.target(r3)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSR()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.bearing(r1)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSC()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.tilt(r1)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSZ()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.zoom(r1)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition r10 = r10.build()     // Catch: java.lang.Throwable -> Lb0
            return r10
        L64:
            com.autonavi.amap.mapcore.DPoint r10 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            double r1 = r1.getSX()     // Catch: java.lang.Throwable -> Lb0
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r2 = r9.q     // Catch: java.lang.Throwable -> Lb0
            double r2 = r2.getSY()     // Catch: java.lang.Throwable -> Lb0
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lb0
            r9.geo2Latlng(r1, r2, r10)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> Lb0
            double r2 = r10.y     // Catch: java.lang.Throwable -> Lb0
            double r4 = r10.x     // Catch: java.lang.Throwable -> Lb0
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> Lb0
            r10.recycle()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = com.amap.api.maps.model.CameraPosition.builder()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.target(r1)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSR()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.bearing(r1)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSC()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.tilt(r1)     // Catch: java.lang.Throwable -> Lb0
            com.autonavi.base.amap.mapcore.MapConfig r1 = r9.q     // Catch: java.lang.Throwable -> Lb0
            float r1 = r1.getSZ()     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition$Builder r10 = r10.zoom(r1)     // Catch: java.lang.Throwable -> Lb0
            com.amap.api.maps.model.CameraPosition r10 = r10.build()     // Catch: java.lang.Throwable -> Lb0
            return r10
        Lb0:
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.Y
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getCurrentWorldVectorMapStyle() {
            r3 = this;
            java.lang.String r0 = ""
            com.autonavi.extra.b r1 = r3.P0     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.j()     // Catch: java.lang.Throwable -> L11
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L13
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            goto L14
        L13:
            return r0
        L14:
            com.amap.api.col.p0003l.b3.D(r1)
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.col.p0003l.v8 getCustomStyleManager() {
            r1 = this;
            com.amap.api.col.3l.v8 r0 = r1.w0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getEngineIDWithGestureInfo(com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 == 0) goto L9
            int r2 = r0.getEngineIDWithGestureInfo(r2)
            return r2
        L9:
            int r2 = r1.n
            return r2
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float[] getFinalMatrix() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L9
            float[] r0 = r0.getMvpMatrix()
            return r0
        L9:
            float[] r0 = r1.a1
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.base.ae.gmap.GLMapEngine getGLMapEngine() {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final android.view.View getGLMapView() {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r2.f3867j
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L9
            android.view.View r0 = (android.view.View) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getGeoCenter(int r3, com.autonavi.amap.mapcore.IPoint r4) {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            if (r3 == 0) goto L14
            double r0 = r3.getSX()
            int r3 = (int) r0
            r4.x = r3
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            double r0 = r3.getSY()
            int r3 = (int) r0
            r4.y = r3
        L14:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.maps.interfaces.IGlOverlayLayer getGlOverlayLayer() {
            r1 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r1.l
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getGlOverlayMgrPtr() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto Lb
            int r1 = r2.n
            long r0 = r0.getGlOverlayMgrPtr(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.InfoWindowAnimationManager getInfoWindowAnimationManager() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.col.p0003l.a0 getInfoWindowDelegate() {
            r1 = this;
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Map(double r7, double r9, com.autonavi.base.amap.mapcore.FPoint r11) {
            r6 = this;
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain()
            r0 = r6
            r1 = r7
            r3 = r9
            r0.latlon2Geo(r1, r3, r5)
            int r7 = r5.x
            int r8 = r5.y
            r6.geo2Map(r7, r8, r11)
            r5.recycle()
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Pixel(double r2, double r4, com.autonavi.amap.mapcore.IPoint r6) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L59
        L9:
            boolean r0 = r1.l0
            if (r0 == 0) goto L59
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 == 0) goto L59
            r0 = 20
            android.graphics.Point r2 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r2, r4, r0)     // Catch: java.lang.Throwable -> L59
            com.autonavi.base.amap.mapcore.FPoint r3 = com.autonavi.base.amap.mapcore.FPoint.obtain()     // Catch: java.lang.Throwable -> L59
            int r4 = r2.x     // Catch: java.lang.Throwable -> L59
            int r5 = r2.y     // Catch: java.lang.Throwable -> L59
            r1.j(r4, r5, r3)     // Catch: java.lang.Throwable -> L59
            float r4 = r3.x     // Catch: java.lang.Throwable -> L59
            r5 = -971227136(0xffffffffc61c4000, float:-10000.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L4c
            float r4 = r3.y     // Catch: java.lang.Throwable -> L59
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L4c
            com.autonavi.base.ae.gmap.GLMapEngine r4 = r1.Z     // Catch: java.lang.Throwable -> L59
            int r5 = r1.n     // Catch: java.lang.Throwable -> L59
            com.autonavi.amap.api.mapcore.IGLMapState r4 = r4.getNewMapState(r5)     // Catch: java.lang.Throwable -> L59
            com.autonavi.base.ae.gmap.GLMapState r4 = (com.autonavi.base.ae.gmap.GLMapState) r4     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r4.setCameraDegree(r5)     // Catch: java.lang.Throwable -> L59
            r4.recalculate()     // Catch: java.lang.Throwable -> L59
            int r5 = r2.x     // Catch: java.lang.Throwable -> L59
            int r2 = r2.y     // Catch: java.lang.Throwable -> L59
            r4.p20ToScreenPoint(r5, r2, r3)     // Catch: java.lang.Throwable -> L59
            r4.recycle()     // Catch: java.lang.Throwable -> L59
        L4c:
            float r2 = r3.x     // Catch: java.lang.Throwable -> L59
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L59
            r6.x = r2     // Catch: java.lang.Throwable -> L59
            float r2 = r3.y     // Catch: java.lang.Throwable -> L59
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L59
            r6.y = r2     // Catch: java.lang.Throwable -> L59
            r3.recycle()     // Catch: java.lang.Throwable -> L59
        L59:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getLatLngRect(com.autonavi.amap.mapcore.DPoint[] r8) {
            r7 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r7.q     // Catch: java.lang.Throwable -> L20
            com.autonavi.base.amap.mapcore.Rectangle r0 = r0.getGeoRectangle()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            com.autonavi.amap.mapcore.IPoint[] r0 = r0.getClipRect()     // Catch: java.lang.Throwable -> L20
            r1 = 0
        Ld:
            r2 = 4
            if (r1 >= r2) goto L22
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L20
            int r3 = r2.x     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r2 = r2.y     // Catch: java.lang.Throwable -> L20
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L20
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L20
            com.autonavi.base.ae.gmap.GLMapState.geo2LonLat(r3, r5, r2)     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + 1
            goto Ld
        L20:
            r8 = move-exception
            goto L23
        L22:
            return
        L23:
            com.amap.api.col.p0003l.b3.D(r8)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getLogoMarginRate(int r2) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L9
            float r2 = r0.a(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getLogoPosition() {
            r3 = this;
            com.amap.api.col.3l.i r0 = r3.f3864g     // Catch: android.os.RemoteException -> L7
            int r0 = r0.getLogoPosition()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "AMapDelegateImp"
            java.lang.String r2 = "getLogoPosition"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final android.os.Handler getMainHandler() {
            r1 = this;
            android.os.Handler r0 = r1.z0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapAngle(int r1) {
            r0 = this;
            com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q
            if (r1 == 0) goto L9
            float r1 = r1.getSR()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.maps.model.LatLngBounds getMapBounds(com.amap.api.maps.model.LatLng r18, float r19, float r20, float r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r6 = r0.getMapWidth()
            int r7 = r0.getMapHeight()
            if (r6 <= 0) goto L91
            if (r7 <= 0) goto L91
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.o
            boolean r2 = r2.get()
            if (r2 == 0) goto L1a
            goto L91
        L1a:
            com.autonavi.base.amap.mapcore.MapConfig r2 = r0.q
            r3 = r19
            float r8 = com.amap.api.col.p0003l.b3.h(r2, r3)
            com.autonavi.base.ae.gmap.GLMapState r9 = new com.autonavi.base.ae.gmap.GLMapState
            int r2 = r0.n
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r0.Z
            long r3 = r3.getNativeInstance()
            r9.<init>(r2, r3)
            if (r1 == 0) goto L5a
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain()
            double r2 = r1.latitude
            double r10 = r1.longitude
            r1 = r2
            r3 = r10
            r0.latlon2Geo(r1, r3, r5)
            r1 = r21
            r9.setCameraDegree(r1)
            r1 = r20
            r9.setMapAngle(r1)
            int r1 = r5.x
            double r1 = (double) r1
            int r3 = r5.y
            double r3 = (double) r3
            r9.setMapGeoCenter(r1, r3)
            r9.setMapZoomer(r8)
            r9.recalculate()
            r5.recycle()
        L5a:
            com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.DPoint.obtain()
            r2 = 0
            r0.p(r9, r2, r2, r1)
            com.amap.api.maps.model.LatLng r10 = new com.amap.api.maps.model.LatLng
            double r11 = r1.y
            double r13 = r1.x
            r15 = 0
            r10.<init>(r11, r13, r15)
            r0.p(r9, r6, r7, r1)
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng
            double r12 = r1.y
            double r14 = r1.x
            r16 = 0
            r11.<init>(r12, r14, r16)
            r1.recycle()
            r9.recycle()
            com.amap.api.maps.model.LatLngBounds$Builder r1 = com.amap.api.maps.model.LatLngBounds.builder()
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r1.include(r11)
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r1.include(r10)
            com.amap.api.maps.model.LatLngBounds r1 = r1.build()
            return r1
        L91:
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.base.amap.mapcore.MapConfig getMapConfig() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getMapContentApprovalNumber() {
            r4 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            if (r0 == 0) goto L25
            boolean r0 = r0.isCustomStyleEnable()
            if (r0 != 0) goto L25
            android.content.Context r0 = r4.Y
            com.amap.api.col.p0003l.y2.q(r0)
            android.content.Context r0 = r4.Y
            java.lang.String r1 = "mc"
            java.lang.String r2 = ""
            java.lang.String r3 = "approval_number"
            java.lang.String r0 = com.amap.api.col.p0003l.r2.b(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L22
            return r0
        L22:
            java.lang.String r0 = "GS (2023)551号 | GS (2023)2175号"
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapHeight() {
            r1 = this;
            int r0 = r1.e0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapPrintScreen(com.amap.api.maps.AMap.onMapPrintScreenListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<com.amap.api.maps.AMap$onMapPrintScreenListener> r1 = com.amap.api.maps.AMap.onMapPrintScreenListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L1a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1a
            r0.e(r1, r3)     // Catch: java.lang.Throwable -> L1a
            r3 = 20
            r2.E = r3     // Catch: java.lang.Throwable -> L1a
            r3 = 1
            r2.F = r3     // Catch: java.lang.Throwable -> L1a
            r2.resetRenderTime()     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.base.ae.gmap.GLMapState getMapProjection() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto Lb
            int r1 = r2.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.util.List<com.amap.api.maps.model.Marker> getMapScreenMarkers() throws android.os.RemoteException {
            r2 = this;
            int r0 = r2.getMapWidth()
            int r1 = r2.getMapHeight()
            boolean r0 = com.amap.api.col.p0003l.b3.I(r0, r1)
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L14:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L22:
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r2.l
            java.util.List r0 = r0.getMapScreenMarkers()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapScreenShot(com.amap.api.maps.AMap.OnMapScreenShotListener r3, boolean r4) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b     // Catch: java.lang.Throwable -> L19
            java.lang.Class<com.amap.api.maps.AMap$OnMapScreenShotListener> r1 = com.amap.api.maps.AMap.OnMapScreenShotListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L19
            r0.e(r1, r3)     // Catch: java.lang.Throwable -> L19
            r3 = 20
            r2.E = r3     // Catch: java.lang.Throwable -> L19
            r2.F = r4     // Catch: java.lang.Throwable -> L19
            r2.resetRenderTime()     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapTextZIndex() throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.P
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapType() throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.I
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapWidth() {
            r1 = this;
            int r0 = r1.d0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapZoomScale() {
            r1 = this;
            float r0 = r1.g0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getMaskLayerType() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMaxZoomLevel() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Ld
            float r0 = r0.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        Ld:
            r0 = 1101004800(0x41a00000, float:20.0)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMinZoomLevel() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Ld
            float r0 = r0.getMinZoomLevel()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
        Ld:
            r0 = 1077936128(0x40400000, float:3.0)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final android.location.Location getMyLocation() throws android.os.RemoteException {
            r1 = this;
            com.amap.api.maps.LocationSource r0 = r1.v
            if (r0 == 0) goto L9
            com.amap.api.col.3l.aa r0 = r1.a
            android.location.Location r0 = r0.f2984b
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final com.amap.api.maps.model.MyLocationStyle getMyLocationStyle() throws android.os.RemoteException {
            r1 = this;
            com.amap.api.col.3l.q1 r0 = r1.u
            if (r0 == 0) goto L9
            com.amap.api.maps.model.MyLocationStyle r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getNativeEngineID() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getNativeMapController() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto Lb
            int r1 = r2.n
            long r0 = r0.getNativeMapController(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.maps.AMap.OnCameraChangeListener getOnCameraChangeListener() throws android.os.RemoteException {
            r3 = this;
            r0 = 0
            com.amap.api.col.3l.ba r1 = r3.f3857b     // Catch: java.lang.Throwable -> L1e
            java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r2 = com.amap.api.maps.AMap.OnCameraChangeListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L1e
            java.util.List r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1e
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L16
            goto L1e
        L16:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.maps.AMap$OnCameraChangeListener r1 = (com.amap.api.maps.AMap.OnCameraChangeListener) r1     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2Geo(int r3, int r4, com.autonavi.amap.mapcore.IPoint r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L1c
        L9:
            boolean r0 = r2.l0
            if (r0 == 0) goto L1c
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L1c
            int r1 = r2.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            if (r0 == 0) goto L1c
            r0.screenToP20Point(r3, r4, r5)
        L1c:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2LatLng(int r5, int r6, com.autonavi.amap.mapcore.DPoint r7) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L3a
        L9:
            boolean r0 = r4.l0
            if (r0 == 0) goto L3a
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z
            if (r0 == 0) goto L3a
            int r1 = r4.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            if (r0 == 0) goto L3a
            com.autonavi.amap.mapcore.IPoint r1 = com.autonavi.amap.mapcore.IPoint.obtain()
            r0.screenToP20Point(r5, r6, r1)
            int r5 = r1.x
            long r5 = (long) r5
            int r0 = r1.y
            long r2 = (long) r0
            r0 = 20
            com.autonavi.amap.mapcore.DPoint r5 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r5, r2, r0)
            double r2 = r5.x
            r7.x = r2
            double r2 = r5.y
            r7.y = r2
            r1.recycle()
            r5.recycle()
        L3a:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getPreciseLevel(int r1) {
            r0 = this;
            com.autonavi.base.amap.mapcore.MapConfig r1 = r0.q
            if (r1 == 0) goto L9
            float r1 = r1.getSZ()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.base.amap.api.mapcore.IProjectionDelegate getProjection() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IProjectionDelegate r0 = r1.f3863f
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getProjectionMatrix() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L9
            float[] r0 = r0.getProjectionMatrix()
            return r0
        L9:
            float[] r0 = r1.c1
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final android.graphics.Rect getRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.H
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getRenderMode() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r1.f3867j
            int r0 = r0.getRenderMode()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSX() {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            if (r0 == 0) goto La
            double r0 = r0.getSX()
            int r0 = (int) r0
            return r0
        La:
            r0 = -1
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSY() {
            r2 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            if (r0 == 0) goto La
            double r0 = r0.getSY()
            int r0 = (int) r0
            return r0
        La:
            r0 = -1
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getSatelliteImageApprovalNumber() {
            r4 = this;
            android.content.Context r0 = r4.Y
            com.amap.api.col.p0003l.y2.r(r0)
            android.content.Context r0 = r4.Y
            java.lang.String r1 = "si"
            java.lang.String r2 = ""
            java.lang.String r3 = "approval_number"
            java.lang.String r0 = com.amap.api.col.p0003l.r2.b(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r0 = "GS (2023)4047号"
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getScalePerPixel() throws android.os.RemoteException {
            r8 = this;
            com.amap.api.maps.model.CameraPosition r0 = r8.getCameraPosition()     // Catch: java.lang.Throwable -> L3c
            com.amap.api.maps.model.LatLng r0 = r0.target     // Catch: java.lang.Throwable -> L3c
            float r1 = r8.getZoomLevel()     // Catch: java.lang.Throwable -> L3c
            double r2 = r0.latitude     // Catch: java.lang.Throwable -> L3c
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r2 * r4
            r6 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r2 = r2 / r6
            double r2 = java.lang.Math.cos(r2)     // Catch: java.lang.Throwable -> L3c
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r6
            double r2 = r2 * r4
            r4 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r2 = r2 * r4
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L3c
            double r0 = java.lang.Math.pow(r6, r0)     // Catch: java.lang.Throwable -> L3c
            r4 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r0 = r0 * r4
            double r2 = r2 / r0
            float r0 = (float) r2     // Catch: java.lang.Throwable -> L3c
            float r1 = r8.getMapZoomScale()     // Catch: java.lang.Throwable -> L3c
            float r0 = r0 * r1
            return r0
        L3c:
            r0 = move-exception
            java.lang.String r1 = "AMapDelegateImp"
            java.lang.String r2 = "getScalePerPixel"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.p0003l.b3.D(r0)
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getSkyHeight() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            float r0 = r0.getSkyHeight()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getTerrainApprovalNumber() {
            r4 = this;
            android.content.Context r0 = r4.Y
            com.amap.api.col.p0003l.y2.s(r0)
            android.content.Context r0 = r4.Y
            java.lang.String r1 = "te"
            java.lang.String r2 = ""
            java.lang.String r3 = "approval_number"
            java.lang.String r0 = com.amap.api.col.p0003l.r2.b(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r0 = "GS(2021)6352号"
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate getUiSettings() {
            r1 = this;
            com.amap.api.col.3l.i r0 = r1.f3864g
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getUnitLengthByZoom(int r5) {
            r4 = this;
            com.autonavi.base.ae.gmap.GLMapState r0 = new com.autonavi.base.ae.gmap.GLMapState
            int r1 = r4.n
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r4.Z
            long r2 = r2.getNativeInstance()
            r0.<init>(r1, r2)
            float r5 = (float) r5
            r0.setMapZoomer(r5)
            r0.recalculate()
            r5 = 1
            float r5 = r0.getGLUnitWithWin(r5)
            r0.recycle()
            return r5
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final android.view.View getView() throws android.os.RemoteException {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L9
            android.view.View r0 = r0.j()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getViewMatrix() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L9
            float[] r0 = r0.getViewMatrix()
            return r0
        L9:
            float[] r0 = r1.b1
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final android.graphics.Point getWaterMarkerPositon() {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L9
            android.graphics.Point r0 = r0.a()
            return r0
        L9:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getWorldVectorMapLanguage() {
            r1 = this;
            java.lang.String r0 = r1.Q0
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final java.lang.String getWorldVectorMapStyle() {
            r1 = this;
            java.lang.String r0 = r1.R0
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getZoomLevel() {
            r1 = this;
            float r0 = r1.E()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getZoomToSpanLevel(com.amap.api.maps.model.LatLng r9, com.amap.api.maps.model.LatLng r10) {
            r8 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r8.getMapConfig()     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto L58
            if (r10 == 0) goto L58
            boolean r1 = r8.l0     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L58
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.o     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L58
            com.amap.api.maps.model.LatLngBounds$Builder r1 = new com.amap.api.maps.model.LatLngBounds$Builder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLngBounds$Builder r9 = r1.include(r9)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLngBounds$Builder r9 = r9.include(r10)     // Catch: java.lang.Throwable -> L40
            com.amap.api.maps.model.LatLngBounds r5 = r9.build()     // Catch: java.lang.Throwable -> L40
            int r6 = r8.getMapWidth()     // Catch: java.lang.Throwable -> L40
            int r7 = r8.getMapHeight()     // Catch: java.lang.Throwable -> L40
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            android.util.Pair r9 = com.amap.api.col.p0003l.b3.r(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto L43
            java.lang.Object r9 = r9.first     // Catch: java.lang.Throwable -> L40
            java.lang.Float r9 = (java.lang.Float) r9     // Catch: java.lang.Throwable -> L40
            float r9 = r9.floatValue()     // Catch: java.lang.Throwable -> L40
            return r9
        L40:
            r0 = move-exception
            r9 = r0
            goto L5d
        L43:
            com.autonavi.base.ae.gmap.GLMapState r9 = new com.autonavi.base.ae.gmap.GLMapState     // Catch: java.lang.Throwable -> L40
            int r10 = r8.n     // Catch: java.lang.Throwable -> L40
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r8.Z     // Catch: java.lang.Throwable -> L40
            long r0 = r0.getNativeInstance()     // Catch: java.lang.Throwable -> L40
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L40
            float r10 = r9.getMapZoomer()     // Catch: java.lang.Throwable -> L40
            r9.recycle()     // Catch: java.lang.Throwable -> L40
            return r10
        L58:
            float r9 = r0.getSZ()     // Catch: java.lang.Throwable -> L40
            return r9
        L5d:
            com.amap.api.col.p0003l.b3.D(r9)
            r9 = 0
            return r9
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int hideBuildings(java.util.List<com.amap.api.maps.model.LatLng> r4) {
            r3 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r3.Z
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.amap.api.col.3l.r9$f0 r2 = new com.amap.api.col.3l.r9$f0
            r2.<init>(r3, r4)
            r0.<init>(r2)
            r3.queueEvent(r0)
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L1e
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L1e
            return r4
        L1e:
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void hideInfoWindow() {
            r1 = this;
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            if (r0 == 0) goto L7
            r0.w()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isIndoorEnabled() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            boolean r0 = r0.isIndoorEnable()
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapAngle(int r1) {
            r0 = this;
            boolean r1 = r0.Y(r1)
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapCameraDegree(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMaploaded() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMyLocationEnabled() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTouchPoiEnable() {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L9
            boolean r0 = r0.isTouchPoiEnable()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTrafficEnabled() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            boolean r0 = r0.isTrafficEnabled()
            return r0
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseAnchor() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    public final void k(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L14
            boolean r0 = r1.m0
            if (r0 == 0) goto L14
            r1.resetRenderTime()
            com.amap.api.col.3l.r9$g r0 = new com.amap.api.col.3l.r9$g
            r0.<init>(r1, r2, r3)
            r1.queueEvent(r0)
            return
        L14:
            com.amap.api.col.3l.r9$t0 r0 = r1.E0
            r0.f3914b = r3
            r3 = 1
            r0.a = r3
            r0.f3917e = r2
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void latlon2Geo(double r2, double r4, com.autonavi.amap.mapcore.IPoint r6) {
            r1 = this;
            r0 = 20
            android.graphics.Point r2 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r2, r4, r0)
            int r3 = r2.x
            r6.x = r3
            int r2 = r2.y
            r6.y = r2
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void loadWorldVectorMap(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L7
            r0.setAbroadEnable(r2)
        L7:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void map2Geo(float r5, float r6, com.autonavi.amap.mapcore.IPoint r7) {
            r4 = this;
            double r0 = (double) r5
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q
            double r2 = r5.getSX()
            double r0 = r0 + r2
            int r5 = (int) r0
            r7.x = r5
            double r5 = (double) r6
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            double r0 = r0.getSY()
            double r5 = r5 + r0
            int r5 = (int) r5
            r7.y = r5
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void moveCamera(com.amap.api.maps.CameraUpdate r1) throws android.os.RemoteException {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = r1.getCameraUpdateFactoryDelegate()     // Catch: java.lang.Throwable -> Lb
            r0.moveCamera(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            com.amap.api.col.p0003l.b3.D(r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void moveCamera(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r8) throws android.os.RemoteException {
            r7 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r7.Z
            if (r0 == 0) goto L83
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.o
            boolean r0 = r0.get()
            if (r0 == 0) goto Le
            goto L83
        Le:
            r0 = 0
            boolean r1 = r7.p     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L6e
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r7.Z     // Catch: java.lang.Throwable -> L67
            int r1 = r1.getStateMessageCount()     // Catch: java.lang.Throwable -> L67
            if (r1 <= 0) goto L6e
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.o()     // Catch: java.lang.Throwable -> L67
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r2 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing     // Catch: java.lang.Throwable -> L67
            r1.nowType = r2     // Catch: java.lang.Throwable -> L67
            com.autonavi.amap.mapcore.DPoint r2 = new com.autonavi.amap.mapcore.DPoint     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.amap.mapcore.MapConfig r3 = r7.q     // Catch: java.lang.Throwable -> L67
            double r3 = r3.getSX()     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.amap.mapcore.MapConfig r5 = r7.q     // Catch: java.lang.Throwable -> L67
            double r5 = r5.getSY()     // Catch: java.lang.Throwable -> L67
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L67
            r1.geoPoint = r2     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.amap.mapcore.MapConfig r2 = r7.q     // Catch: java.lang.Throwable -> L67
            float r2 = r2.getSZ()     // Catch: java.lang.Throwable -> L67
            r1.zoom = r2     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.amap.mapcore.MapConfig r2 = r7.q     // Catch: java.lang.Throwable -> L67
            float r2 = r2.getSR()     // Catch: java.lang.Throwable -> L67
            r1.bearing = r2     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.amap.mapcore.MapConfig r2 = r7.q     // Catch: java.lang.Throwable -> L67
            float r2 = r2.getSC()     // Catch: java.lang.Throwable -> L67
            r1.tilt = r2     // Catch: java.lang.Throwable -> L67
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r7.Z     // Catch: java.lang.Throwable -> L67
            r2.addMessage(r8, r0)     // Catch: java.lang.Throwable -> L67
        L53:
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r7.Z     // Catch: java.lang.Throwable -> L67
            int r2 = r2.getStateMessageCount()     // Catch: java.lang.Throwable -> L67
            if (r2 <= 0) goto L69
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r7.Z     // Catch: java.lang.Throwable -> L67
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = r2.getStateMessage()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L53
            r2.mergeCameraUpdateDelegate(r1)     // Catch: java.lang.Throwable -> L67
            goto L53
        L67:
            r1 = move-exception
            goto L6b
        L69:
            r8 = r1
            goto L6e
        L6b:
            com.amap.api.col.p0003l.b3.D(r1)
        L6e:
            r7.resetRenderTime()
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r7.Z
            int r2 = r7.n
            r1.clearAnimations(r2, r0)
            r1 = 1
            r8.isChangeFinished = r1
            r7.o(r8)
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r7.Z
            r1.addMessage(r8, r0)
        L83:
            return
    }

    protected final void n(com.amap.api.maps.model.CameraPosition r5) {
            r4 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            if (r0 == 0) goto L7a
            int r0 = r0.getChangedCounter()
            if (r0 != 0) goto Lc
            goto L7a
        Lc:
            boolean r0 = r4.j0     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L7a
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z     // Catch: java.lang.Throwable -> L28
            int r0 = r0.getAnimateionsCount()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L7a
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z     // Catch: java.lang.Throwable -> L28
            int r0 = r0.getStateMessageCount()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L7a
            com.amap.api.maps.model.AMapGestureListener r0 = r4.f3859c     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            r0.onMapStable()     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L77
        L2a:
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r4.f3867j     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isEnabled()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L33
            goto L7a
        L33:
            com.amap.api.col.3l.ba r0 = r4.f3857b     // Catch: java.lang.Throwable -> L71
            java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r1 = com.amap.api.maps.AMap.OnCameraChangeListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L71
            java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L71
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L71
            if (r5 != 0) goto L56
            com.amap.api.maps.model.CameraPosition r5 = r4.getCameraPosition()     // Catch: java.lang.Throwable -> L4e
            goto L56
        L4e:
            r1 = move-exception
            java.lang.String r2 = "AMapDelegateImp"
            java.lang.String r3 = "cameraChangeFinish"
            com.amap.api.col.p0003l.w5.p(r1, r2, r3)     // Catch: java.lang.Throwable -> L71
        L56:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        L5b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6b
            com.amap.api.maps.AMap$OnCameraChangeListener r2 = (com.amap.api.maps.AMap.OnCameraChangeListener) r2     // Catch: java.lang.Throwable -> L6b
            r2.onCameraChangeFinish(r5)     // Catch: java.lang.Throwable -> L6b
            goto L5b
        L6b:
            r5 = move-exception
            goto L6f
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            goto L71
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            com.autonavi.base.amap.mapcore.MapConfig r5 = r4.q     // Catch: java.lang.Throwable -> L28
            r5.resetChangedCounter()     // Catch: java.lang.Throwable -> L28
            goto L7a
        L77:
            com.amap.api.col.p0003l.b3.D(r5)
        L7a:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onAMapAppResourceRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 != 0) goto L5
            goto L25
        L5:
            java.lang.Class<com.amap.api.maps.AMap$AMapAppResourceRequestListener> r1 = com.amap.api.maps.AMap.AMapAppResourceRequestListener.class
            int r1 = r1.hashCode()
            java.util.List r0 = r0.a(r1)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.AMap$AMapAppResourceRequestListener r1 = (com.amap.api.maps.AMap.AMapAppResourceRequestListener) r1
            if (r1 == 0) goto L13
            r1.onRequest(r3)
            goto L13
        L25:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityPause() {
            r1 = this;
            r0 = 1
            r1.p = r0
            int r0 = r1.n
            r1.G(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityResume() {
            r1 = this;
            r0 = 0
            r1.p = r0
            int r0 = r1.n
            r1.L(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onChangeFinish() {
            r2 = this;
            android.os.Handler r0 = r2.z0
            android.os.Message r0 = r0.obtainMessage()
            r1 = 11
            r0.what = r1
            android.os.Handler r1 = r2.z0
            r1.sendMessage(r0)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onDoubleTap(int r2, android.view.MotionEvent r3) {
            r1 = this;
            boolean r2 = r1.l0
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            float r2 = r3.getX()
            int r2 = (int) r2
            float r3 = r3.getY()
            int r3 = (int) r3
            r1.t(r2, r3)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onFling() {
            r2 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r2.l
            r1 = 1
            if (r0 == 0) goto L8
            r0.setFlingState(r1)
        L8:
            r2.D = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onIndoorBuildingActivity(int r8, byte[] r9) {
            r7 = this;
            java.lang.String r8 = "utf-8"
            if (r9 == 0) goto Lba
            int r0 = r9.length     // Catch: java.lang.Throwable -> L85
            if (r0 <= 0) goto Lba
            com.amap.api.col.3l.z r0 = new com.amap.api.col.3l.z     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            r1 = 0
            r2 = r9[r1]     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r4 = 1
            r3.<init>(r9, r4, r2, r8)     // Catch: java.lang.Throwable -> L85
            r0.a = r3     // Catch: java.lang.Throwable -> L85
            int r3 = r2 + 1
            int r2 = r2 + 2
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r4.<init>(r9, r2, r3, r8)     // Catch: java.lang.Throwable -> L85
            r0.f4275b = r4     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + r3
            int r3 = r2 + 1
            r2 = r9[r2]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r4.<init>(r9, r3, r2, r8)     // Catch: java.lang.Throwable -> L85
            r0.activeFloorName = r4     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r2
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r9, r3)     // Catch: java.lang.Throwable -> L85
            r0.activeFloorIndex = r2     // Catch: java.lang.Throwable -> L85
            int r2 = r3 + 4
            int r3 = r3 + 5
            r2 = r9[r2]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r4.<init>(r9, r3, r2, r8)     // Catch: java.lang.Throwable -> L85
            r0.poiid = r4     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r2
            int r2 = r3 + 1
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r4.<init>(r9, r2, r3, r8)     // Catch: java.lang.Throwable -> L85
            r0.f4281h = r4     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + r3
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r9, r2)     // Catch: java.lang.Throwable -> L85
            r0.f4276c = r3     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + 4
            int[] r4 = new int[r3]     // Catch: java.lang.Throwable -> L85
            r0.floor_indexs = r4     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85
            r0.floor_names = r4     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85
            r0.f4277d = r3     // Catch: java.lang.Throwable -> L85
            r3 = 0
        L66:
            int r4 = r0.f4276c     // Catch: java.lang.Throwable -> L85
            if (r3 >= r4) goto L9b
            int[] r4 = r0.floor_indexs     // Catch: java.lang.Throwable -> L85
            int r5 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r9, r2)     // Catch: java.lang.Throwable -> L85
            r4[r3] = r5     // Catch: java.lang.Throwable -> L85
            int r4 = r2 + 4
            int r2 = r2 + 5
            r4 = r9[r4]     // Catch: java.lang.Throwable -> L85
            if (r4 <= 0) goto L87
            java.lang.String[] r5 = r0.floor_names     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r6.<init>(r9, r2, r4, r8)     // Catch: java.lang.Throwable -> L85
            r5[r3] = r6     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + r4
            goto L87
        L85:
            r8 = move-exception
            goto Lc6
        L87:
            int r4 = r2 + 1
            r2 = r9[r2]     // Catch: java.lang.Throwable -> L85
            if (r2 <= 0) goto L97
            java.lang.String[] r5 = r0.f4277d     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L85
            r6.<init>(r9, r4, r2, r8)     // Catch: java.lang.Throwable -> L85
            r5[r3] = r6     // Catch: java.lang.Throwable -> L85
            int r4 = r4 + r2
        L97:
            r2 = r4
            int r3 = r3 + 1
            goto L66
        L9b:
            int r8 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r9, r2)     // Catch: java.lang.Throwable -> L85
            r0.f4278e = r8     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + 4
            if (r8 <= 0) goto Lbb
            int[] r8 = new int[r8]     // Catch: java.lang.Throwable -> L85
            r0.f4279f = r8     // Catch: java.lang.Throwable -> L85
        La9:
            int r8 = r0.f4278e     // Catch: java.lang.Throwable -> L85
            if (r1 >= r8) goto Lbb
            int[] r8 = r0.f4279f     // Catch: java.lang.Throwable -> L85
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r9, r2)     // Catch: java.lang.Throwable -> L85
            r8[r1] = r3     // Catch: java.lang.Throwable -> L85
            int r2 = r2 + 4
            int r1 = r1 + 1
            goto La9
        Lba:
            r0 = 0
        Lbb:
            r7.Z0 = r0     // Catch: java.lang.Throwable -> L85
            com.amap.api.col.3l.r9$a0 r8 = new com.amap.api.col.3l.r9$a0     // Catch: java.lang.Throwable -> L85
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L85
            r7.post(r8)     // Catch: java.lang.Throwable -> L85
            return
        Lc6:
            com.amap.api.col.p0003l.b3.D(r8)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onLongPress(int r12, android.view.MotionEvent r13) {
            r11 = this;
            r7 = 0
            r11.A = r7     // Catch: java.lang.Throwable -> L16
            r11.y(r12)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r11.l     // Catch: java.lang.Throwable -> L16
            r8 = 1
            com.amap.api.maps.model.BaseOverlay r2 = r2.getHitBaseOverlay(r13, r8)     // Catch: java.lang.Throwable -> L16
            boolean r3 = r2 instanceof com.amap.api.maps.model.Marker     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L19
            com.amap.api.maps.model.Marker r2 = (com.amap.api.maps.model.Marker) r2     // Catch: java.lang.Throwable -> L16
            r11.y = r2     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r0 = move-exception
            goto L156
        L19:
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r11.l     // Catch: java.lang.Throwable -> L16
            r3 = 3
            com.amap.api.maps.model.BaseOverlay r2 = r2.getHitBaseOverlay(r13, r3)     // Catch: java.lang.Throwable -> L16
            boolean r3 = r2 instanceof com.amap.api.maps.model.GLTFOverlay     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L28
            com.amap.api.maps.model.GLTFOverlay r2 = (com.amap.api.maps.model.GLTFOverlay) r2     // Catch: java.lang.Throwable -> L16
            r11.z = r2     // Catch: java.lang.Throwable -> L16
        L28:
            com.amap.api.maps.model.Marker r2 = r11.y     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Lb1
            boolean r2 = r2.isDraggable()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Lb1
            com.amap.api.maps.model.Marker r0 = r11.y     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14e
            com.autonavi.amap.mapcore.IPoint r6 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L16
            double r2 = r0.latitude     // Catch: java.lang.Throwable -> L16
            double r4 = r0.longitude     // Catch: java.lang.Throwable -> L16
            r1 = r11
            r1.getLatLng2Pixel(r2, r4, r6)     // Catch: java.lang.Throwable -> L16
            int r0 = r6.y     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + (-60)
            r6.y = r0     // Catch: java.lang.Throwable -> L16
            com.autonavi.amap.mapcore.DPoint r2 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> L16
            int r0 = r6.x     // Catch: java.lang.Throwable -> L16
            int r3 = r6.y     // Catch: java.lang.Throwable -> L16
            r11.getPixel2LatLng(r0, r3, r2)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L16
            double r3 = r2.y     // Catch: java.lang.Throwable -> L16
            double r9 = r2.x     // Catch: java.lang.Throwable -> L16
            r0.<init>(r3, r9)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.Marker r3 = r11.y     // Catch: java.lang.Throwable -> L16
            r3.setPosition(r0)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r11.l     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.Marker r3 = r11.y     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L16
            r0.set2Top(r3)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.ba r0 = r11.f3857b     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r3 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> L9f
            java.util.List r3 = r0.a(r3)     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto La7
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L9f
            if (r0 <= 0) goto La7
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L9f
        L85:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L99
            if (r7 >= r0) goto L9b
            java.lang.Object r0 = r3.get(r7)     // Catch: java.lang.Throwable -> L99
            com.amap.api.maps.AMap$OnMarkerDragListener r0 = (com.amap.api.maps.AMap.OnMarkerDragListener) r0     // Catch: java.lang.Throwable -> L99
            com.amap.api.maps.model.Marker r4 = r11.y     // Catch: java.lang.Throwable -> L99
            r0.onMarkerDragStart(r4)     // Catch: java.lang.Throwable -> L99
            int r7 = r7 + 1
            goto L85
        L99:
            r0 = move-exception
            goto L9d
        L9b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L99
            goto La7
        L9d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            java.lang.String r3 = "AMapDelegateImp"
            java.lang.String r4 = "onMarkerDragStart"
            com.amap.api.col.p0003l.w5.p(r0, r3, r4)     // Catch: java.lang.Throwable -> L16
        La7:
            r11.w = r8     // Catch: java.lang.Throwable -> L16
            r6.recycle()     // Catch: java.lang.Throwable -> L16
            r2.recycle()     // Catch: java.lang.Throwable -> L16
            goto L14e
        Lb1:
            com.amap.api.maps.model.GLTFOverlay r2 = r11.z     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L102
            boolean r2 = r2.isDraggable()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L102
            com.amap.api.maps.model.GLTFOverlay r0 = r11.z     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.LatLng r0 = r0.getLatlng()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14e
            com.autonavi.amap.mapcore.IPoint r6 = com.autonavi.amap.mapcore.IPoint.obtain()     // Catch: java.lang.Throwable -> L16
            double r2 = r0.latitude     // Catch: java.lang.Throwable -> L16
            double r4 = r0.longitude     // Catch: java.lang.Throwable -> L16
            r1 = r11
            r1.getLatLng2Pixel(r2, r4, r6)     // Catch: java.lang.Throwable -> L16
            int r0 = r6.y     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + (-60)
            r6.y = r0     // Catch: java.lang.Throwable -> L16
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> L16
            int r2 = r6.x     // Catch: java.lang.Throwable -> L16
            int r3 = r6.y     // Catch: java.lang.Throwable -> L16
            r11.getPixel2LatLng(r2, r3, r0)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L16
            double r3 = r0.y     // Catch: java.lang.Throwable -> L16
            double r9 = r0.x     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r9)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.GLTFOverlay r3 = r11.z     // Catch: java.lang.Throwable -> L16
            r3.setLatLng(r2)     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.interfaces.IGlOverlayLayer r2 = r11.l     // Catch: java.lang.Throwable -> L16
            com.amap.api.maps.model.GLTFOverlay r3 = r11.z     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.getId()     // Catch: java.lang.Throwable -> L16
            r2.set2Top(r3)     // Catch: java.lang.Throwable -> L16
            r11.x = r8     // Catch: java.lang.Throwable -> L16
            r6.recycle()     // Catch: java.lang.Throwable -> L16
            r0.recycle()     // Catch: java.lang.Throwable -> L16
            goto L14e
        L102:
            com.amap.api.col.3l.ba r2 = r11.f3857b     // Catch: java.lang.Throwable -> L16
            java.lang.Class<com.amap.api.maps.AMap$OnMapLongClickListener> r3 = com.amap.api.maps.AMap.OnMapLongClickListener.class
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> L16
            java.util.List r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L14e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L16
            if (r3 <= 0) goto L14e
            com.autonavi.amap.mapcore.DPoint r3 = com.autonavi.amap.mapcore.DPoint.obtain()     // Catch: java.lang.Throwable -> L16
            float r4 = r13.getX()     // Catch: java.lang.Throwable -> L16
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L16
            float r0 = r13.getY()     // Catch: java.lang.Throwable -> L16
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L16
            r11.getPixel2LatLng(r4, r0, r3)     // Catch: java.lang.Throwable -> L16
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L16
        L128:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L143
            if (r7 >= r0) goto L145
            java.lang.Object r0 = r2.get(r7)     // Catch: java.lang.Throwable -> L143
            com.amap.api.maps.AMap$OnMapLongClickListener r0 = (com.amap.api.maps.AMap.OnMapLongClickListener) r0     // Catch: java.lang.Throwable -> L143
            com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L143
            double r5 = r3.y     // Catch: java.lang.Throwable -> L143
            double r9 = r3.x     // Catch: java.lang.Throwable -> L143
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L143
            r0.onMapLongClick(r4)     // Catch: java.lang.Throwable -> L143
            int r7 = r7 + 1
            goto L128
        L143:
            r0 = move-exception
            goto L14c
        L145:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L143
            r11.B = r8     // Catch: java.lang.Throwable -> L16
            r3.recycle()     // Catch: java.lang.Throwable -> L16
            goto L14e
        L14c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L143
            throw r0     // Catch: java.lang.Throwable -> L16
        L14e:
            com.autonavi.base.ae.gmap.GLMapRender r0 = r11.f3856a0     // Catch: java.lang.Throwable -> L16
            r2 = 30
            r0.resetTickCount(r2)     // Catch: java.lang.Throwable -> L16
            return
        L156:
            java.lang.String r2 = "AMapDelegateImp"
            java.lang.String r3 = "onLongPress"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapBlankClick(double r1, double r3) {
            r0 = this;
            r0.e(r1, r3)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi r7) {
            r6 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r6.q
            if (r0 == 0) goto L4a
            boolean r0 = r0.isTouchPoiEnable()
            if (r0 != 0) goto Lb
            goto L4a
        Lb:
            com.amap.api.col.3l.ba r0 = r6.f3857b
            java.lang.Class<com.amap.api.maps.AMap$OnPOIClickListener> r1 = com.amap.api.maps.AMap.OnPOIClickListener.class
            int r1 = r1.hashCode()
            java.util.List r0 = r0.a(r1)
            if (r0 == 0) goto L4a
            int r0 = r0.size()
            if (r0 <= 0) goto L4a
            if (r7 == 0) goto L4a
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 20
            r0.what = r1
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            double r2 = r7.getLatitude()
            double r4 = r7.getLongitude()
            r1.<init>(r2, r4)
            com.amap.api.maps.model.Poi r2 = new com.amap.api.maps.model.Poi
            java.lang.String r3 = r7.getName()
            java.lang.String r7 = r7.getPoiid()
            r2.<init>(r3, r1, r7)
            r0.obj = r2
            android.os.Handler r7 = r6.z0
            r7.sendMessage(r0)
        L4a:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onPause() {
            r2 = this;
            r2.S()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r2.l
            if (r0 == 0) goto Lb
            r1 = 0
            r0.setFlingState(r1)
        Lb:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onResume() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.f3856a0     // Catch: java.lang.Throwable -> L1c
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setRenderFps(r1)     // Catch: java.lang.Throwable -> L1c
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r2.f3867j     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r0.setRenderMode(r1)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r2.l     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L15
            r1 = 1
            r0.setFlingState(r1)     // Catch: java.lang.Throwable -> L1c
        L15:
            com.amap.api.col.3l.q1 r0 = r2.u     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r0.k()     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onSingleTapConfirmed(int r3, android.view.MotionEvent r4) {
            r2 = this;
            boolean r0 = r2.l0
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            r0 = 1
            r2.y(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r2.c0(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L11
            return r0
        L11:
            boolean r3 = r2.Q(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L18
            return r0
        L18:
            boolean r3 = r2.Z(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L1f
            return r0
        L1f:
            r2.M(r4)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r2.U(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L29
            return r0
        L29:
            r2.I(r4)     // Catch: java.lang.Throwable -> L2d
            return r0
        L2d:
            r3 = move-exception
            java.lang.String r4 = "AMapDelegateImp"
            java.lang.String r1 = "onSingleTapUp"
            com.amap.api.col.p0003l.w5.p(r3, r4, r1)
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            boolean r0 = r6.p
            r1 = 0
            if (r0 != 0) goto Lcf
            boolean r0 = r6.l0
            if (r0 == 0) goto Lcf
            boolean r0 = r6.i0
            if (r0 != 0) goto Lf
            goto Lcf
        Lf:
            com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r6.V0
            r2 = 3
            r0.mGestureState = r2
            r2 = 8
            r0.mGestureType = r2
            float r2 = r7.getX()
            float r3 = r7.getY()
            r4 = 2
            float[] r5 = new float[r4]
            r5[r1] = r2
            r2 = 1
            r5[r2] = r3
            r0.mLocation = r5
            com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo r0 = r6.V0
            r6.getEngineIDWithGestureInfo(r0)
            r6.l0()
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L41
            if (r0 == r2) goto L3d
            goto L47
        L3d:
            r6.O()
            goto L47
        L41:
            r6.n0()
            r6.K()
        L47:
            int r0 = r7.getAction()
            java.lang.String r3 = "AMapDelegateImp"
            if (r0 != r4) goto L5e
            boolean r0 = r6.w
            if (r0 == 0) goto L5e
            r6.l(r7)     // Catch: java.lang.Throwable -> L57
            goto L5d
        L57:
            r7 = move-exception
            java.lang.String r0 = "onDragMarker"
            com.amap.api.col.p0003l.w5.p(r7, r3, r0)
        L5d:
            return r2
        L5e:
            int r0 = r7.getAction()
            if (r0 != r4) goto L73
            boolean r0 = r6.x
            if (r0 == 0) goto L73
            r6.B(r7)     // Catch: java.lang.Throwable -> L6c
            goto L72
        L6c:
            r7 = move-exception
            java.lang.String r0 = "onDragGLTF"
            com.amap.api.col.p0003l.w5.p(r7, r3, r0)
        L72:
            return r2
        L73:
            boolean r0 = r6.f3860c0
            if (r0 == 0) goto La2
            com.amap.api.col.3l.ba r0 = r6.f3857b     // Catch: java.lang.Throwable -> La2
            java.lang.Class<com.amap.api.maps.AMap$SignleClickInterceptorListener> r3 = com.amap.api.maps.AMap.SignleClickInterceptorListener.class
            int r3 = r3.hashCode()     // Catch: java.lang.Throwable -> La2
            java.util.List r0 = r0.a(r3)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L9d
            int r3 = r0.size()     // Catch: java.lang.Throwable -> La2
            if (r3 <= 0) goto L9d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> La2
            com.amap.api.maps.AMap$SignleClickInterceptorListener r0 = (com.amap.api.maps.AMap.SignleClickInterceptorListener) r0     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isInterceptorSignleClick(r7)     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto La2
            com.amap.api.col.3l.ja r0 = r6.f3858b0     // Catch: java.lang.Throwable -> La2
            r0.e(r7)     // Catch: java.lang.Throwable -> La2
            goto La2
        L9d:
            com.amap.api.col.3l.ja r0 = r6.f3858b0     // Catch: java.lang.Throwable -> La2
            r0.e(r7)     // Catch: java.lang.Throwable -> La2
        La2:
            com.amap.api.col.3l.ba r0 = r6.f3857b     // Catch: java.lang.Throwable -> Lce
            java.lang.Class<com.amap.api.maps.AMap$OnMapTouchListener> r1 = com.amap.api.maps.AMap.OnMapTouchListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Lce
            java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lce
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lce
            if (r0 <= 0) goto Lce
            android.os.Handler r0 = r6.z0     // Catch: java.lang.Throwable -> Lce
            r1 = 14
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> Lce
            android.os.Handler r0 = r6.z0     // Catch: java.lang.Throwable -> Lce
            android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Throwable -> Lce
            r0.what = r1     // Catch: java.lang.Throwable -> Lce
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r7)     // Catch: java.lang.Throwable -> Lce
            r0.obj = r7     // Catch: java.lang.Throwable -> Lce
            r0.sendToTarget()     // Catch: java.lang.Throwable -> Lce
        Lce:
            return r2
        Lcf:
            return r1
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void pixel2Map(int r4, int r5, android.graphics.PointF r6) {
            r3 = this;
            boolean r0 = r3.l0
            if (r0 == 0) goto L30
            boolean r0 = r3.p
            if (r0 != 0) goto L30
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r3.Z
            if (r0 == 0) goto L30
            com.autonavi.amap.mapcore.IPoint r0 = com.autonavi.amap.mapcore.IPoint.obtain()
            r3.getPixel2Geo(r4, r5, r0)
            int r4 = r0.x
            float r4 = (float) r4
            com.autonavi.base.amap.mapcore.MapConfig r5 = r3.q
            double r1 = r5.getSX()
            float r5 = (float) r1
            float r4 = r4 - r5
            r6.x = r4
            int r4 = r0.y
            float r4 = (float) r4
            com.autonavi.base.amap.mapcore.MapConfig r5 = r3.q
            double r1 = r5.getSY()
            float r5 = (float) r1
            float r4 = r4 - r5
            r6.y = r4
            r0.recycle()
        L30:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void post(java.lang.Runnable r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r1.f3867j
            if (r0 == 0) goto L7
            r0.post(r2)
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void queueEvent(java.lang.Runnable r8) {
            r7 = this;
            java.lang.String r0 = "queueEvent"
            java.lang.String r1 = "AMapdelegateImp"
            r2 = -1
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lf
            long r4 = r4.getId()     // Catch: java.lang.Throwable -> Lf
            goto L17
        Lf:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.p0003l.w5.p(r4, r1, r0)     // Catch: java.lang.Throwable -> L25
            r4 = r2
        L17:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L27
            long r2 = r7.X     // Catch: java.lang.Throwable -> L25
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L27
            r8.run()     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r8 = move-exception
            goto L31
        L27:
            com.autonavi.base.ae.gmap.GLMapEngine r2 = r7.Z     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L30
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r2 = r7.f3867j     // Catch: java.lang.Throwable -> L25
            r2.queueEvent(r8)     // Catch: java.lang.Throwable -> L25
        L30:
            return
        L31:
            com.amap.api.col.p0003l.b3.D(r8)
            com.amap.api.col.p0003l.w5.p(r8, r1, r0)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawInfoWindow() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L14
        L9:
            boolean r0 = r2.l0
            if (r0 == 0) goto L14
            android.os.Handler r0 = r2.z0
            r1 = 18
            r0.sendEmptyMessage(r1)
        L14:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void refreshLogo() {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void reloadMap() {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void reloadMapCustomStyle() {
            r1 = this;
            com.amap.api.col.3l.v8 r0 = r1.w0
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeAMapAppResourceListener(com.amap.api.maps.AMap.AMapAppResourceRequestListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$AMapAppResourceRequestListener> r1 = com.amap.api.maps.AMap.AMapAppResourceRequestListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeEngineGLOverlay(com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 == 0) goto Lc
            com.amap.api.col.3l.r9$e0 r0 = new com.amap.api.col.3l.r9$e0
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
        Lc:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLModel(java.lang.String r3) {
            r2 = this;
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r2.l     // Catch: java.lang.Throwable -> L6
            r0.removeOverlay(r3)     // Catch: java.lang.Throwable -> L6
            goto Le
        L6:
            r3 = move-exception
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "removeGLModel"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        Le:
            r3 = 0
            return r3
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLOverlay(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            r1.resetRenderTime()
            com.amap.api.maps.interfaces.IGlOverlayLayer r0 = r1.l
            boolean r2 = r0.removeOverlay(r2)
            return r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r1 = com.amap.api.maps.AMap.OnCameraChangeListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnIndoorBuildingActiveListener> r1 = com.amap.api.maps.AMap.OnIndoorBuildingActiveListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnInfoWindowClickListener> r1 = com.amap.api.maps.AMap.OnInfoWindowClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapClickListener> r1 = com.amap.api.maps.AMap.OnMapClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLoadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapLoadedListener> r1 = com.amap.api.maps.AMap.OnMapLoadedListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapLongClickListener> r1 = com.amap.api.maps.AMap.OnMapLongClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMapTouchListener> r1 = com.amap.api.maps.AMap.OnMapTouchListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerClickListener> r1 = com.amap.api.maps.AMap.OnMarkerClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r1 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnMyLocationChangeListener> r1 = com.amap.api.maps.AMap.OnMyLocationChangeListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnPOIClickListener> r1 = com.amap.api.maps.AMap.OnPOIClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$OnPolylineClickListener> r1 = com.amap.api.maps.AMap.OnPolylineClickListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeSignleClickInterceptorListener(com.amap.api.maps.AMap.SignleClickInterceptorListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto L11
            java.lang.Class<com.amap.api.maps.AMap$SignleClickInterceptorListener> r1 = com.amap.api.maps.AMap.SignleClickInterceptorListener.class
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f(r1, r3)
        L11:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            r1.removecache(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache(com.amap.api.maps.AMap.OnCacheRemoveListener r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Handler r0 = r2.z0
            if (r0 == 0) goto L25
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L25
            com.amap.api.col.3l.r9$w0 r0 = new com.amap.api.col.3l.r9$w0     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = r2.Y     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r3 = r2.z0     // Catch: java.lang.Throwable -> L1a
            r3.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r3 = r2.z0     // Catch: java.lang.Throwable -> L1a
            r3.post(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r3 = move-exception
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "removecache"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            com.amap.api.col.p0003l.b3.D(r3)
        L25:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void renderSurface(javax.microedition.khronos.opengles.GL10 r1) {
            r0 = this;
            r0.drawFrame(r1)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void requestRender() {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapRender r0 = r1.f3856a0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRenderPause()
            if (r0 != 0) goto Lf
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r1.f3867j
            r0.requestRender()
        Lf:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void resetMinMaxZoomPreference() {
            r4 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q
            r0.resetMinMaxZoomPreference()
            com.amap.api.col.3l.i r0 = r4.f3864g     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isNeedUpdateZoomControllerState()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            com.amap.api.col.3l.ba r0 = r4.f3857b     // Catch: java.lang.Throwable -> L49
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r1 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L49
            if (r1 <= 0) goto L4b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L49
            r1 = 0
        L2b:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L43
            if (r1 >= r2) goto L45
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L43
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r2 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r2     // Catch: java.lang.Throwable -> L43
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.q     // Catch: java.lang.Throwable -> L43
            float r3 = r3.getSZ()     // Catch: java.lang.Throwable -> L43
            r2.invalidateZoomController(r3)     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto L2b
        L43:
            r1 = move-exception
            goto L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            goto L4c
        L4b:
            return
        L4c:
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void resetRenderTime() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.f3856a0
            if (r0 == 0) goto L8
            r1 = 2
            r0.resetTickCount(r1)
        L8:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void resetRenderTimeLongLong() {
            r2 = this;
            com.autonavi.base.ae.gmap.GLMapRender r0 = r2.f3856a0
            if (r0 == 0) goto L9
            r1 = 30
            r0.resetTickCount(r1)
        L9:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void set3DBuildingEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.n     // Catch: java.lang.Throwable -> L10
            r1.G(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r1.n     // Catch: java.lang.Throwable -> L10
            r1.k(r0, r2)     // Catch: java.lang.Throwable -> L10
            int r2 = r1.n     // Catch: java.lang.Throwable -> L10
            r1.L(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setAMapGestureListener(com.amap.api.maps.model.AMapGestureListener r2) {
            r1 = this;
            com.amap.api.col.3l.ja r0 = r1.f3858b0
            if (r0 == 0) goto L9
            r1.f3859c = r2
            r0.d(r2)
        L9:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCenterToPixel(int r2, int r3) throws android.os.RemoteException {
            r1 = this;
            r0 = 1
            r1.r = r0
            r1.r0 = r2
            r1.s0 = r3
            boolean r2 = r1.m0
            if (r2 == 0) goto L39
            boolean r2 = r1.l0
            if (r2 == 0) goto L39
            com.autonavi.base.amap.mapcore.MapConfig r2 = r1.q
            int r2 = r2.getAnchorX()
            int r3 = r1.r0
            if (r2 != r3) goto L23
            com.autonavi.base.amap.mapcore.MapConfig r2 = r1.q
            int r2 = r2.getAnchorY()
            int r3 = r1.s0
            if (r2 == r3) goto L39
        L23:
            com.autonavi.base.amap.mapcore.MapConfig r2 = r1.q
            int r3 = r1.r0
            r2.setAnchorX(r3)
            com.autonavi.base.amap.mapcore.MapConfig r2 = r1.q
            int r3 = r1.s0
            r2.setAnchorY(r3)
            com.amap.api.col.3l.r9$x r2 = new com.amap.api.col.3l.r9$x
            r2.<init>(r1)
            r1.queueEvent(r2)
        L39:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setConstructingRoadEnable(boolean r2) {
            r1 = this;
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.r9$t r0 = new com.amap.api.col.3l.r9$t     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            goto L22
        L16:
            com.amap.api.col.3l.r9$t0 r0 = r1.I0     // Catch: java.lang.Throwable -> L14
            r0.f3914b = r2     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L14
            int r2 = r1.n     // Catch: java.lang.Throwable -> L14
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L14
            return
        L22:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyle(com.amap.api.maps.model.CustomMapStyleOptions r3) {
            r2 = this;
            if (r3 == 0) goto L46
            r0 = 1
            r1 = 0
            boolean r0 = r2.v(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r3.isEnable()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L35
            java.lang.String r0 = r3.getStyleId()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            java.lang.String r0 = r3.getStyleTexturePath()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            byte[] r0 = r3.getStyleTextureData()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            java.lang.String r0 = r3.getStyleResDataPath()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            byte[] r0 = r3.getStyleResData()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L35
            goto L32
        L30:
            r3 = move-exception
            goto L4a
        L32:
            r2.q0()     // Catch: java.lang.Throwable -> L30
        L35:
            com.amap.api.col.3l.v8 r0 = r2.w0     // Catch: java.lang.Throwable -> L30
            r0.n()     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.3l.v8 r0 = r2.w0     // Catch: java.lang.Throwable -> L30
            r0.d(r3)     // Catch: java.lang.Throwable -> L30
            com.autonavi.extra.b r3 = r2.P0     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L46
            r3.i()     // Catch: java.lang.Throwable -> L30
        L46:
            r2.resetRenderTime()     // Catch: java.lang.Throwable -> L30
            return
        L4a:
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setCustomMapStyle(boolean r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.r(r2, r3, r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyleID(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            java.lang.String r0 = r0.getCustomStyleID()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r0.setCustomStyleID(r2)
            r2 = 1
            r1.f3866i = r2
        L1a:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStylePath(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            java.lang.String r0 = r0.getCustomStylePath()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r0.setCustomStylePath(r2)
            r2 = 1
            r1.f3866i = r2
        L1a:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomRenderer(com.amap.api.maps.CustomRenderer r1) throws android.os.RemoteException {
            r0 = this;
            r0.Q = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomTextureResourcePath(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r0.setCustomTextureResourcePath(r2)
        Lb:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setGestureStatus(int r1, int r2) {
            r0 = this;
            int r1 = r0.q0
            if (r1 == 0) goto L8
            r1 = 5
            if (r2 != r1) goto L8
            return
        L8:
            r0.q0 = r2
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setHideLogoEnble(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L16
            r0.setHideLogoEnble(r2)
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            boolean r0 = r0.isCustomStyleEnable()
            if (r0 == 0) goto L16
            com.amap.api.col.3l.i r0 = r1.f3864g
            r2 = r2 ^ 1
            r0.setLogoEnable(r2)
        L16:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorBuildingInfo(com.amap.api.maps.model.IndoorBuildingInfo r2) throws android.os.RemoteException {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L23
        L9:
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.activeFloorName
            if (r0 == 0) goto L23
            java.lang.String r0 = r2.poiid
            if (r0 != 0) goto L14
            goto L23
        L14:
            com.amap.api.col.3l.z r2 = (com.amap.api.col.p0003l.z) r2
            r1.t = r2
            r1.resetRenderTime()
            com.amap.api.col.3l.r9$z r2 = new com.amap.api.col.3l.r9$z
            r2.<init>(r1)
            r1.queueEvent(r2)
        L23:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorEnabled(boolean r5) throws android.os.RemoteException {
            r4 = this;
            boolean r0 = r4.l0     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == 0) goto L94
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.o     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L94
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L21
            r0.setIndoorEnable(r5)     // Catch: java.lang.Throwable -> L21
            r4.resetRenderTime()     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L24
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L7c
            int r2 = r4.n     // Catch: java.lang.Throwable -> L21
            r0.setIndoorEnable(r2, r1)     // Catch: java.lang.Throwable -> L21
            goto L7c
        L21:
            r5 = move-exception
            goto L9f
        L24:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r4.Z     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L2e
            int r2 = r4.n     // Catch: java.lang.Throwable -> L21
            r0.setIndoorEnable(r2, r1)     // Catch: java.lang.Throwable -> L21
        L2e:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.q     // Catch: java.lang.Throwable -> L21
            boolean r2 = r0.isSetLimitZoomLevel()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L3d
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q     // Catch: java.lang.Throwable -> L21
            float r2 = r2.getMaxZoomLevel()     // Catch: java.lang.Throwable -> L21
            goto L3f
        L3d:
            r2 = 1101004800(0x41a00000, float:20.0)
        L3f:
            r0.maxZoomLevel = r2     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.i r0 = r4.f3864g     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
            com.amap.api.col.3l.ba r0 = r4.f3857b     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r2 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r2 = r2.hashCode()     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L7c
            if (r2 <= 0) goto L7c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7c
        L5e:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L76
            if (r1 >= r2) goto L78
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L76
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r2 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r2     // Catch: java.lang.Throwable -> L76
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.q     // Catch: java.lang.Throwable -> L76
            float r3 = r3.getSZ()     // Catch: java.lang.Throwable -> L76
            r2.invalidateZoomController(r3)     // Catch: java.lang.Throwable -> L76
            int r1 = r1 + 1
            goto L5e
        L76:
            r1 = move-exception
            goto L7a
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            goto L7c
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            android.content.Context r0 = r4.Y     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.p0003l.y2.p(r0, r5)     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.i r0 = r4.f3864g     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.isIndoorSwitchEnabled()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L93
            android.os.Handler r0 = r4.z0     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.r9$o r1 = new com.amap.api.col.3l.r9$o     // Catch: java.lang.Throwable -> L21
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L21
            r0.post(r1)     // Catch: java.lang.Throwable -> L21
        L93:
            return
        L94:
            com.amap.api.col.3l.r9$t0 r0 = r4.M0     // Catch: java.lang.Throwable -> L21
            r0.f3914b = r5     // Catch: java.lang.Throwable -> L21
            r0.a = r1     // Catch: java.lang.Throwable -> L21
            int r5 = r4.n     // Catch: java.lang.Throwable -> L21
            r0.f3917e = r5     // Catch: java.lang.Throwable -> L21
            return
        L9f:
            com.amap.api.col.p0003l.b3.D(r5)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(com.amap.api.maps.AMap.CommonInfoWindowAdapter r2) throws android.os.RemoteException {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L10
        L9:
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            if (r0 == 0) goto L10
            r0.h(r2)
        L10:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(com.amap.api.maps.AMap.InfoWindowAdapter r2) throws android.os.RemoteException {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L10
        L9:
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            if (r0 == 0) goto L10
            r0.i(r2)
        L10:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLoadOfflineData(boolean r2) throws android.os.RemoteException {
            r1 = this;
            com.amap.api.col.3l.r9$p r0 = new com.amap.api.col.3l.r9$p
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLocationSource(com.amap.api.maps.LocationSource r3) throws android.os.RemoteException {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L9
            return
        L9:
            com.amap.api.maps.LocationSource r0 = r2.v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.b0     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            r0.deactivate()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L2b
        L17:
            r2.v = r3     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L23
            com.amap.api.col.3l.i3 r3 = r2.f3868k     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L15
            r3.p(r0)     // Catch: java.lang.Throwable -> L15
            return
        L23:
            com.amap.api.col.3l.i3 r3 = r2.f3868k     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L15
            r3.p(r0)     // Catch: java.lang.Throwable -> L15
            return
        L2b:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "setLocationSource"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoBottomMargin(int r2) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.d(r2)
        Lb:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoLeftMargin(int r2) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.f(r2)
        Lb:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoMarginRate(int r2, float r3) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.a(r2, r3)
        Lf:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoPosition(int r2) {
            r1 = this;
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto Lb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.k(r2)
        Lb:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapCustomEnable(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.q0()
        L5:
            r0 = 0
            r1.setMapCustomEnable(r2, r0)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapCustomEnable(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.l0
            if (r0 == 0) goto L70
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L70
            r0 = 0
            if (r6 == 0) goto L11
            r1 = r6
            goto L12
        L11:
            r1 = 0
        L12:
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q
            java.lang.String r2 = r2.getCustomStylePath()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2b
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q
            java.lang.String r2 = r2.getCustomStyleID()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2b
            return
        L2b:
            if (r5 == 0) goto L56
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q     // Catch: java.lang.Throwable -> L54
            boolean r2 = r2.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            com.autonavi.base.amap.mapcore.MapConfig r2 = r4.q     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.getCustomStyleID()     // Catch: java.lang.Throwable -> L54
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L56
            com.amap.api.col.3l.x1 r2 = r4.U     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.q     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r3.getCustomStyleID()     // Catch: java.lang.Throwable -> L54
            r2.b(r3)     // Catch: java.lang.Throwable -> L54
            com.amap.api.col.3l.x1 r2 = r4.U     // Catch: java.lang.Throwable -> L54
            r2.b()     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L6c
        L56:
            if (r6 != 0) goto L65
            boolean r6 = r4.f3866i     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L65
            com.autonavi.base.amap.mapcore.MapConfig r6 = r4.q     // Catch: java.lang.Throwable -> L54
            boolean r6 = r6.isCustomStyleEnable()     // Catch: java.lang.Throwable -> L54
            r6 = r6 ^ r5
            if (r6 == 0) goto L69
        L65:
            r6 = 0
            r4.r(r5, r6, r1)     // Catch: java.lang.Throwable -> L54
        L69:
            r4.f3866i = r0     // Catch: java.lang.Throwable -> L54
            return
        L6c:
            com.amap.api.col.p0003l.b3.D(r5)
            return
        L70:
            com.amap.api.col.3l.r9$t0 r6 = r4.D0
            r0 = 1
            r6.a = r0
            r6.f3914b = r5
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapEnable(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L7
            r0.setMapEnable(r2)
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapLanguage(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L54
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            if (r0 != 0) goto Lb
            goto L54
        Lb:
            boolean r0 = r0.isCustomStyleEnable()
            if (r0 == 0) goto L12
            goto L54
        L12:
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            java.lang.String r0 = r0.getMapLanguage()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1f
            goto L54
        L1f:
            java.lang.String r0 = "en"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            java.lang.String r0 = "zh_cn"
            r3.setMapLanguage(r0)
            r3 = 0
            r2.P = r3
            goto L48
        L32:
            int r3 = r2.I
            r1 = 1
            if (r3 == r1) goto L3f
            r2.setMapType(r1)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
        L3f:
            com.autonavi.base.amap.mapcore.MapConfig r3 = r2.q
            r3.setMapLanguage(r0)
            r3 = -10000(0xffffffffffffd8f0, float:NaN)
            r2.P = r3
        L48:
            com.amap.api.maps.model.CameraPosition r3 = r2.getCameraPosition()     // Catch: java.lang.Throwable -> L50
            r2.C(r3)     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
        L54:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapStatusLimits(com.amap.api.maps.model.LatLngBounds r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q     // Catch: java.lang.Throwable -> L9
            r0.setLimitLatLngBounds(r2)     // Catch: java.lang.Throwable -> L9
            r1.t0()     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextEnable(boolean r2) throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.r9$q r0 = new com.amap.api.col.3l.r9$q     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            goto L22
        L16:
            com.amap.api.col.3l.r9$t0 r0 = r1.F0     // Catch: java.lang.Throwable -> L14
            r0.f3914b = r2     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L14
            int r2 = r1.n     // Catch: java.lang.Throwable -> L14
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L14
            return
        L22:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextZIndex(int r1) throws android.os.RemoteException {
            r0 = this;
            r0.P = r1
            r1 = 0
            r0.y0 = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapType(int r2) throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.I
            if (r2 != r0) goto Lf
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto Le
            boolean r0 = r0.isCustomStyleEnable()
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            r1.I = r2
            r1.b0(r2)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapWidgetListener(com.autonavi.base.ae.gmap.listener.AMapWidgetListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r1 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaskLayerParams(int r1, int r2, int r3, int r4, int r5, long r6) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaxZoomLevel(float r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r0.setMaxZoomLevel(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMinZoomLevel(float r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            r0.setMinZoomLevel(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationEnabled(boolean r3) throws android.os.RemoteException {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            com.amap.api.col.3l.i3 r0 = r2.f3868k     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L44
            com.amap.api.maps.LocationSource r1 = r2.v     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L3f
            if (r3 == 0) goto L2f
            com.amap.api.col.3l.aa r0 = r2.a     // Catch: java.lang.Throwable -> L2d
            r1.activate(r0)     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.3l.i3 r0 = r2.f3868k     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2d
            r0.p(r1)     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.3l.q1 r0 = r2.u     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L44
            com.amap.api.col.3l.q1 r0 = new com.amap.api.col.3l.q1     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r2.Y     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2d
            r2.u = r0     // Catch: java.lang.Throwable -> L2d
            goto L44
        L2d:
            r3 = move-exception
            goto L51
        L2f:
            com.amap.api.col.3l.q1 r0 = r2.u     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L39
            r0.n()     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            r2.u = r0     // Catch: java.lang.Throwable -> L2d
        L39:
            com.amap.api.maps.LocationSource r0 = r2.v     // Catch: java.lang.Throwable -> L2d
            r0.deactivate()     // Catch: java.lang.Throwable -> L2d
            goto L44
        L3f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2d
            r0.p(r1)     // Catch: java.lang.Throwable -> L2d
        L44:
            if (r3 != 0) goto L4b
            com.amap.api.col.3l.i r0 = r2.f3864g     // Catch: java.lang.Throwable -> L2d
            r0.setMyLocationButtonEnabled(r3)     // Catch: java.lang.Throwable -> L2d
        L4b:
            r2.m = r3     // Catch: java.lang.Throwable -> L2d
            r2.resetRenderTime()     // Catch: java.lang.Throwable -> L2d
            return
        L51:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "setMyLocationEnabled"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            com.amap.api.col.p0003l.b3.D(r3)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationRotateAngle(float r2) throws android.os.RemoteException {
            r1 = this;
            com.amap.api.col.3l.q1 r0 = r1.u     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.b(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationStyle(com.amap.api.maps.model.MyLocationStyle r6) throws android.os.RemoteException {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L4b
        L9:
            com.amap.api.col.3l.q1 r0 = r5.u     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            com.amap.api.col.3l.q1 r0 = new com.amap.api.col.3l.q1     // Catch: java.lang.Throwable -> L17
            android.content.Context r1 = r5.Y     // Catch: java.lang.Throwable -> L17
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L17
            r5.u = r0     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L4c
        L19:
            com.amap.api.col.3l.q1 r0 = r5.u     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L4b
            long r0 = r6.getInterval()     // Catch: java.lang.Throwable -> L17
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2a
            r6.interval(r2)     // Catch: java.lang.Throwable -> L17
        L2a:
            com.amap.api.maps.LocationSource r0 = r5.v     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L46
            boolean r1 = r0 instanceof com.amap.api.col.p0003l.b0     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L46
            com.amap.api.col.3l.b0 r0 = (com.amap.api.col.p0003l.b0) r0     // Catch: java.lang.Throwable -> L17
            long r1 = r6.getInterval()     // Catch: java.lang.Throwable -> L17
            r0.d(r1)     // Catch: java.lang.Throwable -> L17
            com.amap.api.maps.LocationSource r0 = r5.v     // Catch: java.lang.Throwable -> L17
            com.amap.api.col.3l.b0 r0 = (com.amap.api.col.p0003l.b0) r0     // Catch: java.lang.Throwable -> L17
            int r1 = r6.getMyLocationType()     // Catch: java.lang.Throwable -> L17
            r0.c(r1)     // Catch: java.lang.Throwable -> L17
        L46:
            com.amap.api.col.3l.q1 r0 = r5.u     // Catch: java.lang.Throwable -> L17
            r0.h(r6)     // Catch: java.lang.Throwable -> L17
        L4b:
            return
        L4c:
            com.amap.api.col.p0003l.b3.D(r6)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationType(int r2) throws android.os.RemoteException {
            r1 = this;
            com.amap.api.col.3l.q1 r0 = r1.u     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.amap.api.maps.model.MyLocationStyle r0 = r0.a()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.amap.api.col.3l.q1 r0 = r1.u     // Catch: java.lang.Throwable -> L1d
            com.amap.api.maps.model.MyLocationStyle r0 = r0.a()     // Catch: java.lang.Throwable -> L1d
            r0.myLocationType(r2)     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.3l.q1 r2 = r1.u     // Catch: java.lang.Throwable -> L1d
            com.amap.api.maps.model.MyLocationStyle r2 = r2.a()     // Catch: java.lang.Throwable -> L1d
            r1.setMyLocationStyle(r2)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r2 = move-exception
            goto L20
        L1f:
            return
        L20:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setNaviLabelEnable(boolean r2, int r3, int r4) throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.r9$s r0 = new com.amap.api.col.3l.r9$s     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L14
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            goto L26
        L16:
            com.amap.api.col.3l.r9$t0 r0 = r1.H0     // Catch: java.lang.Throwable -> L14
            r0.f3914b = r2     // Catch: java.lang.Throwable -> L14
            r0.f3918f = r3     // Catch: java.lang.Throwable -> L14
            r0.f3919g = r4     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L14
            int r2 = r1.n     // Catch: java.lang.Throwable -> L14
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L14
            return
        L26:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnCameraChangeListener> r1 = com.amap.api.maps.AMap.OnCameraChangeListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnIndoorBuildingActiveListener> r1 = com.amap.api.maps.AMap.OnIndoorBuildingActiveListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnInfoWindowClickListener> r1 = com.amap.api.maps.AMap.OnInfoWindowClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMapClickListener> r1 = com.amap.api.maps.AMap.OnMapClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMapLongClickListener> r1 = com.amap.api.maps.AMap.OnMapLongClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMapTouchListener> r1 = com.amap.api.maps.AMap.OnMapTouchListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMaploadedListener(com.amap.api.maps.AMap.OnMapLoadedListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMapLoadedListener> r1 = com.amap.api.maps.AMap.OnMapLoadedListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerClickListener> r1 = com.amap.api.maps.AMap.OnMarkerClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMarkerDragListener> r1 = com.amap.api.maps.AMap.OnMarkerDragListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMultiPointClickListener(com.amap.api.maps.AMap.OnMultiPointClickListener r1) {
            r0 = this;
            r0.v0 = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener r3) {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnMyLocationChangeListener> r1 = com.amap.api.maps.AMap.OnMyLocationChangeListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnPOIClickListener> r1 = com.amap.api.maps.AMap.OnPOIClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener r3) throws android.os.RemoteException {
            r2 = this;
            com.amap.api.col.3l.ba r0 = r2.f3857b
            if (r0 == 0) goto Ld
            java.lang.Class<com.amap.api.maps.AMap$OnPolylineClickListener> r1 = com.amap.api.maps.AMap.OnPolylineClickListener.class
            int r1 = r1.hashCode()
            r0.c(r1, r3)
        Ld:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderFps(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L8
            r1.S = r2     // Catch: java.lang.Throwable -> L6
            goto L16
        L6:
            r2 = move-exception
            goto L1c
        L8:
            r0 = 40
            int r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L6
            r0 = 10
            int r2 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L6
            r1.S = r2     // Catch: java.lang.Throwable -> L6
        L16:
            android.content.Context r2 = r1.Y     // Catch: java.lang.Throwable -> L6
            com.amap.api.col.p0003l.y2.t(r2)     // Catch: java.lang.Throwable -> L6
            return
        L1c:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderMode(int r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r1.f3867j     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.setRenderMode(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRoadArrowEnable(boolean r2) throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.r9$r r0 = new com.amap.api.col.3l.r9$r     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            goto L22
        L16:
            com.amap.api.col.3l.r9$t0 r0 = r1.G0     // Catch: java.lang.Throwable -> L14
            r0.f3914b = r2     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L14
            int r2 = r1.n     // Catch: java.lang.Throwable -> L14
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L14
            return
        L22:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRunLowFrame(boolean r2) {
            r1 = this;
            if (r2 != 0) goto Lf
            int r2 = r1.S     // Catch: java.lang.Throwable -> Lb
            r0 = -1
            if (r2 != r0) goto Lf
            r1.n0()     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            com.amap.api.col.p0003l.b3.D(r2)
        Lf:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setTerrainAuth(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto Ld
        L9:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            r0.setTerrainAuth(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTouchPoiEnable(boolean r2) {
            r1 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r1.q
            if (r0 == 0) goto L7
            r0.setTouchPoiEnable(r2)
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficEnabled(boolean r2) throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            com.amap.api.col.3l.r9$n r0 = new com.amap.api.col.3l.r9$n     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1, r2, r2)     // Catch: java.lang.Throwable -> L15
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            goto L23
        L17:
            com.amap.api.col.3l.r9$t0 r0 = r1.A0     // Catch: java.lang.Throwable -> L15
            r0.f3914b = r2     // Catch: java.lang.Throwable -> L15
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L15
            int r2 = r1.n     // Catch: java.lang.Throwable -> L15
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L15
            return
        L23:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTexture(byte[] r2, com.amap.api.maps.model.MyTrafficStyle r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r1.l0     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L23
            boolean r0 = r1.m0     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L23
            if (r2 == 0) goto L23
            if (r3 == 0) goto L23
            r1.resetRenderTime()     // Catch: java.lang.Exception -> L21
            com.amap.api.col.3l.r9$u r0 = new com.amap.api.col.3l.r9$u     // Catch: java.lang.Exception -> L21
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L21
            r1.queueEvent(r0)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r2 = move-exception
            goto L31
        L23:
            com.amap.api.col.3l.r9$t0 r0 = r1.K0     // Catch: java.lang.Exception -> L21
            r0.f3920h = r2     // Catch: java.lang.Exception -> L21
            r0.f3921i = r3     // Catch: java.lang.Exception -> L21
            r2 = 1
            r0.a = r2     // Catch: java.lang.Exception -> L21
            int r2 = r1.n     // Catch: java.lang.Exception -> L21
            r0.f3917e = r2     // Catch: java.lang.Exception -> L21
            return
        L31:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTextureData(byte[] r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r1.l0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            boolean r0 = r1.m0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            if (r2 == 0) goto L21
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.3l.r9$w r0 = new com.amap.api.col.3l.r9$w     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r1.queueEvent(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r2 = move-exception
            goto L2d
        L21:
            com.amap.api.col.3l.r9$t0 r0 = r1.J0     // Catch: java.lang.Throwable -> L1f
            r0.f3920h = r2     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r0.a = r2     // Catch: java.lang.Throwable -> L1f
            int r2 = r1.n     // Catch: java.lang.Throwable -> L1f
            r0.f3917e = r2     // Catch: java.lang.Throwable -> L1f
            return
        L2d:
            com.amap.api.col.p0003l.b3.D(r2)
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setVisibilityEx(int r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IGLSurfaceView r0 = r1.f3867j
            if (r0 == 0) goto L7
            r0.setVisibility(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setWorldVectorMapStyle(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.v(r0, r1)
            if (r0 == 0) goto L9
            goto L28
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L28
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            if (r0 == 0) goto L28
            java.lang.String r0 = r2.R0
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            goto L28
        L1c:
            r2.R0 = r3
            com.autonavi.extra.b r3 = r2.P0
            if (r3 == 0) goto L25
            r3.i()
        L25:
            r2.resetRenderTime()
        L28:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZOrderOnTop(boolean r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setZoomPosition(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.h(r2)
        L13:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZoomScaleParam(float r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showCompassEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.e(r2)
        L13:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void showHideBuildings(int r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z
            if (r0 != 0) goto L5
            return
        L5:
            com.amap.api.col.3l.r9$h0 r0 = new com.amap.api.col.3l.r9$h0
            r0.<init>(r1, r2)
            r1.queueEvent(r0)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showIndoorSwitchControlsEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.c(r2)
        L13:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(com.amap.api.maps.model.BaseOverlay r2) throws android.os.RemoteException {
            r1 = this;
            if (r2 != 0) goto L3
            goto La
        L3:
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            if (r0 == 0) goto La
            r0.j(r2)     // Catch: android.os.RemoteException -> La
        La:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r2) throws android.os.RemoteException {
            r1 = this;
            if (r2 != 0) goto L3
            goto La
        L3:
            com.amap.api.col.3l.a0 r0 = r1.f3861d
            if (r0 == 0) goto La
            r0.k(r2)     // Catch: android.os.RemoteException -> La
        La:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showLogoEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L11
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.i(r2)
        L11:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationButtonEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.g(r2)
        L13:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationOverlay(android.location.Location r6) throws android.os.RemoteException {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r5.m     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L65
            com.amap.api.maps.LocationSource r0 = r5.v     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Lc
            goto L65
        Lc:
            com.amap.api.col.3l.q1 r0 = r5.u     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            com.amap.api.col.3l.q1 r0 = new com.amap.api.col.3l.q1     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = r5.Y     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L1a
            r5.u = r0     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r6 = move-exception
            goto L70
        L1c:
            double r0 = r6.getLongitude()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L33
            double r0 = r6.getLatitude()     // Catch: java.lang.Throwable -> L1a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L33
            com.amap.api.col.3l.q1 r0 = r5.u     // Catch: java.lang.Throwable -> L1a
            r0.e(r6)     // Catch: java.lang.Throwable -> L1a
        L33:
            com.amap.api.col.3l.ba r0 = r5.f3857b     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<com.amap.api.maps.AMap$OnMyLocationChangeListener> r1 = com.amap.api.maps.AMap.OnMyLocationChangeListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L61
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 <= 0) goto L61
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
            r1 = 0
        L49:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 >= r2) goto L5d
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
            com.amap.api.maps.AMap$OnMyLocationChangeListener r2 = (com.amap.api.maps.AMap.OnMyLocationChangeListener) r2     // Catch: java.lang.Throwable -> L5b
            r2.onMyLocationChange(r6)     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + 1
            goto L49
        L5b:
            r6 = move-exception
            goto L5f
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            goto L61
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r6     // Catch: java.lang.Throwable -> L1a
        L61:
            r5.resetRenderTime()     // Catch: java.lang.Throwable -> L1a
            return
        L65:
            com.amap.api.col.3l.q1 r6 = r5.u     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L6c
            r6.n()     // Catch: java.lang.Throwable -> L1a
        L6c:
            r6 = 0
            r5.u = r6     // Catch: java.lang.Throwable -> L1a
            return
        L70:
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "showMyLocationOverlay"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showScaleEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.l(r2)
        L13:
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showZoomControlsEnabled(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            com.amap.api.col.3l.i3 r0 = r1.f3868k
            if (r0 == 0) goto L13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.b(r2)
        L13:
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void stopAnimation() throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r1.Z     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.interruptAnimation()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r0 = move-exception
            goto Le
        La:
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L8
            return
        Le:
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float toMapLenWithWin(int r3) {
            r2 = this;
            boolean r0 = r2.l0
            if (r0 == 0) goto L17
            boolean r0 = r2.p
            if (r0 != 0) goto L17
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r2.Z
            if (r0 == 0) goto L17
            int r1 = r2.n
            com.autonavi.base.ae.gmap.GLMapState r0 = r0.getMapState(r1)
            float r3 = r0.getGLUnitWithWin(r3)
            return r3
        L17:
            r3 = 0
            return r3
    }

    final void x() {
            r4 = this;
            android.os.Handler r0 = r4.z0
            r1 = 1
            r2 = 0
            r3 = 17
            android.os.Message r0 = r0.obtainMessage(r3, r1, r2)
            r0.sendToTarget()
            return
    }

    public final void z(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L14
            boolean r0 = r1.m0
            if (r0 == 0) goto L14
            r1.resetRenderTime()
            com.amap.api.col.3l.r9$h r0 = new com.amap.api.col.3l.r9$h
            r0.<init>(r1, r3, r2)
            r1.queueEvent(r0)
            return
        L14:
            com.amap.api.col.3l.r9$t0 r0 = r1.L0
            r0.f3914b = r3
            r3 = 1
            r0.a = r3
            r0.f3917e = r2
            return
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void zoomOut(int r3) {
            r2 = this;
            boolean r3 = r2.l0
            if (r3 != 0) goto L5
            goto L28
        L5:
            float r3 = r2.E()
            int r3 = (int) r3
            float r3 = (float) r3
            com.autonavi.base.amap.mapcore.MapConfig r0 = r2.q
            float r0 = r0.getMinZoomLevel()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L28
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r3 = com.amap.api.col.p0003l.p.l()     // Catch: java.lang.Throwable -> L1d
            r2.animateCamera(r3)     // Catch: java.lang.Throwable -> L1d
            goto L25
        L1d:
            r3 = move-exception
            java.lang.String r0 = "AMapDelegateImp"
            java.lang.String r1 = "onDoubleTap"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        L25:
            r2.resetRenderTime()
        L28:
            return
    }
}
