package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e3 {
    static boolean A;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3174b;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f3175c;

    /* renamed from: d, reason: collision with root package name */
    com.amap.api.col.3l.e3.b f3176d;

    /* renamed from: e, reason: collision with root package name */
    private long f3177e;

    /* renamed from: f, reason: collision with root package name */
    private long f3178f;

    /* renamed from: g, reason: collision with root package name */
    private com.autonavi.aps.amapapi.model.a f3179g;

    /* renamed from: h, reason: collision with root package name */
    com.amap.api.location.AMapLocation f3180h;

    /* renamed from: i, reason: collision with root package name */
    private long f3181i;

    /* renamed from: j, reason: collision with root package name */
    private int f3182j;

    /* renamed from: k, reason: collision with root package name */
    com.amap.api.col.3l.e3.a f3183k;
    android.content.Context l;
    private com.amap.api.col.p0003l.u7 m;
    com.autonavi.aps.amapapi.b n;
    java.util.HashMap<android.os.Messenger, java.lang.Long> o;
    com.autonavi.aps.amapapi.utils.h p;
    long q;
    long r;
    private java.util.List<android.os.Messenger> s;
    private long t;
    private java.util.HashMap<java.lang.String, java.lang.Boolean> u;
    java.lang.String v;
    private boolean w;
    private java.lang.String x;
    com.amap.api.location.AMapLocationClientOption y;
    com.amap.api.location.AMapLocationClientOption z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.e3 a;

        public a(com.amap.api.col.p0003l.e3 r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r9) {
                r8 = this;
                r0 = 1
                r1 = 0
                android.os.Bundle r2 = r9.getData()     // Catch: java.lang.Throwable -> L4d
                android.os.Messenger r3 = r9.replyTo     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L58
                boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L46
                if (r4 != 0) goto L58
                java.lang.String r4 = "c"
                java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L46
                com.amap.api.col.3l.e3 r5 = r8.a     // Catch: java.lang.Throwable -> L46
                boolean r4 = r5.r(r4)     // Catch: java.lang.Throwable -> L46
                if (r4 != 0) goto L58
                int r4 = r9.what     // Catch: java.lang.Throwable -> L46
                if (r4 != r0) goto L15e
                r4 = 2102(0x836, float:2.946E-42)
                com.autonavi.aps.amapapi.utils.h.a(r1, r4)     // Catch: java.lang.Throwable -> L46
                java.lang.String r1 = "invalid handlder scode!!!#1002"
                com.autonavi.aps.amapapi.model.a r1 = com.amap.api.col.p0003l.e3.u(r1)     // Catch: java.lang.Throwable -> L46
                com.autonavi.aps.amapapi.a r4 = new com.autonavi.aps.amapapi.a     // Catch: java.lang.Throwable -> L46
                r4.<init>()     // Catch: java.lang.Throwable -> L46
                java.lang.String r5 = "#1002"
                r4.f(r5)     // Catch: java.lang.Throwable -> L46
                java.lang.String r5 = "conitue"
                r4.e(r5)     // Catch: java.lang.Throwable -> L46
                com.amap.api.col.3l.e3 r5 = r8.a     // Catch: java.lang.Throwable -> L46
                java.lang.String r6 = r1.k()     // Catch: java.lang.Throwable -> L46
                com.amap.api.col.p0003l.e3.p(r5, r3, r1, r6, r4)     // Catch: java.lang.Throwable -> L46
                return
            L46:
                r1 = move-exception
                goto L51
            L48:
                r3 = move-exception
                r7 = r3
                r3 = r1
                r1 = r7
                goto L51
            L4d:
                r2 = move-exception
                r3 = r1
                r1 = r2
                r2 = r3
            L51:
                java.lang.String r4 = "ApsServiceCore"
                java.lang.String r5 = "ActionHandler handlerMessage"
                com.autonavi.aps.amapapi.utils.b.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L83
            L58:
                int r1 = r9.what     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L151
                if (r1 == r0) goto L146
                java.lang.String r4 = "objHash"
                switch(r1) {
                    case 9: goto L13b;
                    case 10: goto L12e;
                    case 11: goto L128;
                    case 12: goto L122;
                    case 13: goto Lef;
                    case 14: goto Lb2;
                    case 15: goto La4;
                    case 16: goto L86;
                    case 17: goto L65;
                    default: goto L63;
                }
            L63:
                goto L15b
            L65:
                if (r2 == 0) goto L15b
                boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L83
                if (r0 != 0) goto L15b
                java.lang.String r0 = r2.getString(r4)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.HashMap r1 = com.amap.api.col.p0003l.e3.v(r1)     // Catch: java.lang.Throwable -> L83
                java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
                r1.put(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                r0.B()     // Catch: java.lang.Throwable -> L83
                goto L15b
            L83:
                r9 = move-exception
                goto L15f
            L86:
                if (r2 == 0) goto L15b
                boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L83
                if (r0 != 0) goto L15b
                java.lang.String r0 = r2.getString(r4)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.HashMap r1 = com.amap.api.col.p0003l.e3.v(r1)     // Catch: java.lang.Throwable -> L83
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
                r1.put(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                r0.B()     // Catch: java.lang.Throwable -> L83
                goto L15b
            La4:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.m(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                java.lang.String r1 = "COARSE_LOC"
                r0.i(r3, r2, r1)     // Catch: java.lang.Throwable -> L83
                goto L15b
            Lb2:
                android.os.Messenger r0 = r9.replyTo     // Catch: java.lang.Throwable -> L83
                if (r0 == 0) goto Ld3
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r1 = com.amap.api.col.p0003l.e3.A(r1)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto Ld3
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r1 = com.amap.api.col.p0003l.e3.A(r1)     // Catch: java.lang.Throwable -> L83
                boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto Ld3
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r1 = com.amap.api.col.p0003l.e3.A(r1)     // Catch: java.lang.Throwable -> L83
                r1.remove(r0)     // Catch: java.lang.Throwable -> L83
            Ld3:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r0 = com.amap.api.col.p0003l.e3.A(r0)     // Catch: java.lang.Throwable -> L83
                if (r0 == 0) goto L15b
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r0 = com.amap.api.col.p0003l.e3.A(r0)     // Catch: java.lang.Throwable -> L83
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L83
                if (r0 != 0) goto L15b
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.autonavi.aps.amapapi.b r0 = r0.n     // Catch: java.lang.Throwable -> L83
                r0.h()     // Catch: java.lang.Throwable -> L83
                goto L15b
            Lef:
                android.os.Messenger r1 = r9.replyTo     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L15b
                com.amap.api.col.3l.e3 r2 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r2 = com.amap.api.col.p0003l.e3.A(r2)     // Catch: java.lang.Throwable -> L83
                if (r2 == 0) goto L15b
                com.amap.api.col.3l.e3 r2 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r2 = com.amap.api.col.p0003l.e3.A(r2)     // Catch: java.lang.Throwable -> L83
                boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L15b
                com.amap.api.col.3l.e3 r2 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r2 = com.amap.api.col.p0003l.e3.A(r2)     // Catch: java.lang.Throwable -> L83
                r2.add(r1)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r1 = r8.a     // Catch: java.lang.Throwable -> L83
                java.util.List r1 = com.amap.api.col.p0003l.e3.A(r1)     // Catch: java.lang.Throwable -> L83
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L83
                if (r1 != r0) goto L15b
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.D(r0)     // Catch: java.lang.Throwable -> L83
                goto L15b
            L122:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.n(r0, r3)     // Catch: java.lang.Throwable -> L83
                goto L15b
            L128:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                r0.C()     // Catch: java.lang.Throwable -> L83
                goto L15b
            L12e:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.m(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                java.lang.String r1 = "FINE_LOC"
                r0.i(r3, r2, r1)     // Catch: java.lang.Throwable -> L83
                goto L15b
            L13b:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.m(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.l(r0)     // Catch: java.lang.Throwable -> L83
                goto L15b
            L146:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.m(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.z(r0, r3, r2)     // Catch: java.lang.Throwable -> L83
                goto L15b
            L151:
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.m(r0, r2)     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.3l.e3 r0 = r8.a     // Catch: java.lang.Throwable -> L83
                com.amap.api.col.p0003l.e3.o(r0, r3, r2)     // Catch: java.lang.Throwable -> L83
            L15b:
                super.handleMessage(r9)     // Catch: java.lang.Throwable -> L83
            L15e:
                return
            L15f:
                java.lang.String r0 = "actionHandler"
                java.lang.String r1 = "handleMessage"
                com.autonavi.aps.amapapi.utils.b.a(r9, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.HandlerThread {
        final /* synthetic */ com.amap.api.col.p0003l.e3 a;

        public b(com.amap.api.col.p0003l.e3 r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
                r4 = this;
                java.lang.String r0 = "APSManager$ActionThread"
                com.amap.api.col.3l.e3 r1 = r4.a     // Catch: java.lang.Throwable -> L11
                com.amap.api.col.3l.u7 r2 = new com.amap.api.col.3l.u7     // Catch: java.lang.Throwable -> L11
                com.amap.api.col.3l.e3 r3 = r4.a     // Catch: java.lang.Throwable -> L11
                android.content.Context r3 = r3.l     // Catch: java.lang.Throwable -> L11
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L11
                com.amap.api.col.p0003l.e3.a(r1, r2)     // Catch: java.lang.Throwable -> L11
                goto L17
            L11:
                r1 = move-exception
                java.lang.String r2 = "init 2"
                com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L3a
            L17:
                com.amap.api.col.3l.e3 r1 = r4.a     // Catch: java.lang.Throwable -> L26
                android.content.Context r1 = r1.l     // Catch: java.lang.Throwable -> L26
                com.autonavi.aps.amapapi.utils.a.b(r1)     // Catch: java.lang.Throwable -> L26
                com.amap.api.col.3l.e3 r1 = r4.a     // Catch: java.lang.Throwable -> L26
                android.content.Context r1 = r1.l     // Catch: java.lang.Throwable -> L26
                com.autonavi.aps.amapapi.utils.a.a(r1)     // Catch: java.lang.Throwable -> L26
                goto L2c
            L26:
                r1 = move-exception
                java.lang.String r2 = "init 3"
                com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L3a
            L2c:
                com.amap.api.col.3l.e3 r1 = r4.a     // Catch: java.lang.Throwable -> L3a
                com.autonavi.aps.amapapi.b r2 = new com.autonavi.aps.amapapi.b     // Catch: java.lang.Throwable -> L3a
                r3 = 0
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
                r1.n = r2     // Catch: java.lang.Throwable -> L3a
                super.onLooperPrepared()     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r1 = move-exception
                java.lang.String r2 = "onLooperPrepared"
                com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)
                return
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
                r3 = this;
                super.run()     // Catch: java.lang.Throwable -> L4
                return
            L4:
                r0 = move-exception
                java.lang.String r1 = "APSManager$ActionThread"
                java.lang.String r2 = "run"
                com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
                return
        }
    }

    static {
            return
    }

    public e3(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.f3174b = r0
            r1 = 0
            r4.f3175c = r1
            r4.f3176d = r1
            r2 = 0
            r4.f3177e = r2
            r4.f3178f = r2
            r4.f3179g = r1
            r4.f3180h = r1
            r4.f3181i = r2
            r4.f3182j = r0
            r4.f3183k = r1
            r4.l = r1
            r4.m = r1
            r4.n = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.o = r0
            r4.p = r1
            r4.q = r2
            r4.r = r2
            r4.t = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.u = r0
            r4.v = r1
            r0 = 1
            r4.w = r0
            java.lang.String r0 = ""
            r4.x = r0
            r4.y = r1
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r4.z = r0
            r4.l = r5
            return
    }

    static /* synthetic */ java.util.List A(com.amap.api.col.p0003l.e3 r0) {
            java.util.List<android.os.Messenger> r0 = r0.s
            return r0
    }

    static /* synthetic */ void D(com.amap.api.col.p0003l.e3 r0) {
            r0.F()
            return
    }

    public static void E() {
            r0 = 0
            com.amap.api.col.p0003l.e3.A = r0
            return
    }

    private void F() {
            r3 = this;
            android.content.Context r0 = r3.l
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)
            if (r0 == 0) goto Lc
            com.autonavi.aps.amapapi.utils.d.a()
            return
        Lc:
            com.autonavi.aps.amapapi.b r0 = r3.n     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            if (r0 == 0) goto L1f
            com.amap.api.col.3l.e3$a r1 = r3.f3183k     // Catch: java.lang.Throwable -> L1d
            r0.a(r1)     // Catch: java.lang.Throwable -> L1d
            com.autonavi.aps.amapapi.b r0 = r3.n     // Catch: java.lang.Throwable -> L1d
            r0.g()     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r0 = move-exception
            goto L20
        L1f:
            return
        L20:
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "startColl"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private void G() {
            r3 = this;
            android.content.Context r0 = r3.l     // Catch: java.lang.Throwable -> L6
            com.autonavi.aps.amapapi.utils.a.c(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "doCallOtherSer"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    static /* synthetic */ com.amap.api.col.p0003l.u7 a(com.amap.api.col.p0003l.e3 r0, com.amap.api.col.p0003l.u7 r1) {
            r0.m = r1
            return r1
    }

    private static com.autonavi.aps.amapapi.model.a b(int r2, java.lang.String r3) {
            com.autonavi.aps.amapapi.model.a r0 = new com.autonavi.aps.amapapi.model.a     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = ""
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r0.setErrorCode(r2)     // Catch: java.lang.Throwable -> Le
            r0.setLocationDetail(r3)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r2 = move-exception
            java.lang.String r3 = "ApsServiceCore"
            java.lang.String r0 = "newInstanceAMapLoc"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            r2 = 0
            return r2
    }

    private void e(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            com.autonavi.aps.amapapi.b r3 = r2.n     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L4d
            r3.a()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            goto L4e
        Le:
            android.content.Context r0 = r2.l     // Catch: java.lang.Throwable -> Lc
            com.autonavi.aps.amapapi.utils.b.a(r0)     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L21
            java.lang.String r0 = "optBundle"
            android.os.Bundle r3 = r3.getBundle(r0)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.location.AMapLocationClientOption r3 = com.autonavi.aps.amapapi.utils.b.a(r3)     // Catch: java.lang.Throwable -> Lc
            r2.z = r3     // Catch: java.lang.Throwable -> Lc
        L21:
            com.autonavi.aps.amapapi.b r3 = r2.n     // Catch: java.lang.Throwable -> Lc
            android.content.Context r0 = r2.l     // Catch: java.lang.Throwable -> Lc
            r3.a(r0)     // Catch: java.lang.Throwable -> Lc
            com.autonavi.aps.amapapi.b r3 = r2.n     // Catch: java.lang.Throwable -> Lc
            r3.b()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.location.AMapLocationClientOption r3 = r2.z     // Catch: java.lang.Throwable -> Lc
            r2.q(r3)     // Catch: java.lang.Throwable -> Lc
            com.autonavi.aps.amapapi.b r3 = r2.n     // Catch: java.lang.Throwable -> Lc
            r3.c()     // Catch: java.lang.Throwable -> Lc
            r3 = 1
            r2.a = r3     // Catch: java.lang.Throwable -> Lc
            r2.w = r3     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = ""
            r2.x = r3     // Catch: java.lang.Throwable -> Lc
            java.util.List<android.os.Messenger> r3 = r2.s     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L4d
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lc
            if (r3 <= 0) goto L4d
            r2.F()     // Catch: java.lang.Throwable -> Lc
        L4d:
            return
        L4e:
            r0 = 0
            r2.w = r0
            java.lang.String r0 = r3.getMessage()
            r2.x = r0
            java.lang.String r0 = "ApsServiceCore"
            java.lang.String r1 = "init"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    private void f(android.os.Messenger r2) {
            r1 = this;
            java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r1.o
            r0.remove(r2)
            return
    }

    private static void g(android.os.Messenger r1, int r2, android.os.Bundle r3) {
            if (r1 == 0) goto L17
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Lf
            r0.setData(r3)     // Catch: java.lang.Throwable -> Lf
            r0.what = r2     // Catch: java.lang.Throwable -> Lf
            r1.send(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            java.lang.String r2 = "ApsServiceCore"
            java.lang.String r3 = "sendMessage"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L17:
            return
    }

    private void h(android.os.Messenger r2, android.os.Bundle r3) {
            r1 = this;
            if (r3 == 0) goto L1d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L9
            goto L1d
        L9:
            boolean r3 = r1.f3174b     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto Le
            goto L1d
        Le:
            r3 = 1
            r1.f3174b = r3     // Catch: java.lang.Throwable -> L15
            r1.x(r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            java.lang.String r3 = "ApsServiceCore"
            java.lang.String r0 = "doInitAuth"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
        L1d:
            return
    }

    private void j(android.os.Messenger r3, com.amap.api.location.AMapLocation r4, java.lang.String r5, com.autonavi.aps.amapapi.a r6) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.amap.api.location.AMapLocation> r1 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            java.lang.String r1 = "loc"
            r0.putParcelable(r1, r4)
            java.lang.String r4 = "nb"
            r0.putString(r4, r5)
            java.lang.String r4 = "statics"
            r0.putParcelable(r4, r6)
            java.util.HashMap<android.os.Messenger, java.lang.Long> r4 = r2.o
            long r5 = com.autonavi.aps.amapapi.utils.j.b()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.put(r3, r5)
            r4 = 1
            g(r3, r4, r0)
            return
    }

    private void k(android.os.Messenger r4, java.lang.String r5) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.amap.api.location.AMapLocation> r1 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            int r1 = com.autonavi.aps.amapapi.utils.a.i()
            int r1 = r1 * 3
            java.lang.String r2 = "I_MAX_GEO_DIS"
            r0.putInt(r2, r1)
            java.lang.String r1 = "I_MIN_GEO_DIS"
            int r2 = com.autonavi.aps.amapapi.utils.a.i()
            r0.putInt(r1, r2)
            java.lang.String r1 = "loc"
            com.amap.api.location.AMapLocation r2 = r3.f3180h
            r0.putParcelable(r1, r2)
            java.lang.String r1 = "COARSE_LOC"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L37
            r5 = 103(0x67, float:1.44E-43)
            g(r4, r5, r0)
            return
        L37:
            r5 = 6
            g(r4, r5, r0)
            return
    }

    static /* synthetic */ void l(com.amap.api.col.p0003l.e3 r0) {
            r0.G()
            return
    }

    static /* synthetic */ void m(com.amap.api.col.p0003l.e3 r0, android.os.Bundle r1) {
            r0.e(r1)
            return
    }

    static /* synthetic */ void n(com.amap.api.col.p0003l.e3 r0, android.os.Messenger r1) {
            r0.f(r1)
            return
    }

    static /* synthetic */ void o(com.amap.api.col.p0003l.e3 r0, android.os.Messenger r1, android.os.Bundle r2) {
            r0.h(r1, r2)
            return
    }

    static /* synthetic */ void p(com.amap.api.col.p0003l.e3 r0, android.os.Messenger r1, com.amap.api.location.AMapLocation r2, java.lang.String r3, com.autonavi.aps.amapapi.a r4) {
            r0.j(r1, r2, r3, r4)
            return
    }

    private void q(com.amap.api.location.AMapLocationClientOption r3) {
            r2 = this;
            com.autonavi.aps.amapapi.b r0 = r2.n     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.a(r3)     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r3 = move-exception
            goto L68
        La:
            if (r3 == 0) goto L67
            boolean r0 = r3.isKillProcess()     // Catch: java.lang.Throwable -> L8
            com.amap.api.col.p0003l.e3.A = r0     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption r0 = r2.y     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L65
            boolean r0 = r3.isOffset()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption r1 = r2.y     // Catch: java.lang.Throwable -> L8
            boolean r1 = r1.isOffset()     // Catch: java.lang.Throwable -> L8
            if (r0 != r1) goto L46
            boolean r0 = r3.isNeedAddress()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption r1 = r2.y     // Catch: java.lang.Throwable -> L8
            boolean r1 = r1.isNeedAddress()     // Catch: java.lang.Throwable -> L8
            if (r0 != r1) goto L46
            boolean r0 = r3.isLocationCacheEnable()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption r1 = r2.y     // Catch: java.lang.Throwable -> L8
            boolean r1 = r1.isLocationCacheEnable()     // Catch: java.lang.Throwable -> L8
            if (r0 != r1) goto L46
            com.amap.api.location.AMapLocationClientOption r0 = r2.y     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = r3.getGeoLanguage()     // Catch: java.lang.Throwable -> L8
            if (r0 == r1) goto L4a
        L46:
            r0 = 0
            r2.f3178f = r0     // Catch: java.lang.Throwable -> L8
        L4a:
            boolean r0 = r3.isOffset()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption r1 = r2.y     // Catch: java.lang.Throwable -> L8
            boolean r1 = r1.isOffset()     // Catch: java.lang.Throwable -> L8
            if (r0 != r1) goto L62
            com.amap.api.location.AMapLocationClientOption r0 = r2.y     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()     // Catch: java.lang.Throwable -> L8
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = r3.getGeoLanguage()     // Catch: java.lang.Throwable -> L8
            if (r0 == r1) goto L65
        L62:
            r0 = 0
            r2.f3180h = r0     // Catch: java.lang.Throwable -> L8
        L65:
            r2.y = r3     // Catch: java.lang.Throwable -> L8
        L67:
            return
        L68:
            java.lang.String r0 = "ApsServiceCore"
            java.lang.String r1 = "setExtra"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    private static com.amap.api.location.AMapLocationClientOption t(android.os.Bundle r3) {
            java.lang.String r0 = "APSManager"
            r1 = 0
            java.lang.String r2 = "optBundle"
            android.os.Bundle r2 = r3.getBundle(r2)     // Catch: java.lang.Throwable -> L24
            com.amap.api.location.AMapLocationClientOption r1 = com.autonavi.aps.amapapi.utils.b.a(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "d"
            java.lang.String r3 = r3.getString(r2)     // Catch: java.lang.Throwable -> L1d
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L2a
            com.amap.api.col.p0003l.i4.s(r3)     // Catch: java.lang.Throwable -> L1d
            goto L2a
        L1d:
            r3 = move-exception
            java.lang.String r2 = "doLocation setUmidToken"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r3 = move-exception
            java.lang.String r2 = "parseBundle"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r2)
        L2a:
            return r1
    }

    static /* synthetic */ com.autonavi.aps.amapapi.model.a u(java.lang.String r1) {
            r0 = 10
            com.autonavi.aps.amapapi.model.a r1 = b(r0, r1)
            return r1
    }

    static /* synthetic */ java.util.HashMap v(com.amap.api.col.p0003l.e3 r0) {
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r0.u
            return r0
    }

    private void x(android.os.Messenger r4) {
            r3 = this;
            com.autonavi.aps.amapapi.b r0 = r3.n     // Catch: java.lang.Throwable -> L1c
            r0.f()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = com.autonavi.aps.amapapi.utils.a.l()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "installMockApp"
            r2 = 1
            r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> L1c
            r1 = 9
            g(r4, r1, r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            goto L1f
        L1e:
            return
        L1f:
            java.lang.String r0 = "ApsServiceCore"
            java.lang.String r1 = "initAuth"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    private void y(android.os.Messenger r12, android.os.Bundle r13) {
            r11 = this;
            java.lang.String r0 = "#0901"
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "#0801"
            if (r13 == 0) goto L176
            boolean r3 = r13.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L10
            goto L176
        L10:
            com.autonavi.aps.amapapi.a r3 = new com.autonavi.aps.amapapi.a     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "conitue"
            r3.e(r4)     // Catch: java.lang.Throwable -> L48
            com.amap.api.location.AMapLocationClientOption r13 = t(r13)     // Catch: java.lang.Throwable -> L48
            r11.q(r13)     // Catch: java.lang.Throwable -> L48
            java.util.HashMap<android.os.Messenger, java.lang.Long> r4 = r11.o     // Catch: java.lang.Throwable -> L48
            boolean r4 = r4.containsKey(r12)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L4b
            boolean r4 = r13.isOnceLocation()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L4b
            java.util.HashMap<android.os.Messenger, java.lang.Long> r4 = r11.o     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r4.get(r12)     // Catch: java.lang.Throwable -> L48
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L48
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L48
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L48
            long r6 = r6 - r4
            r4 = 800(0x320, double:3.953E-321)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L4b
            goto L176
        L48:
            r12 = move-exception
            goto L171
        L4b:
            boolean r4 = r11.w     // Catch: java.lang.Throwable -> L48
            r5 = 0
            if (r4 != 0) goto L7d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "init error : "
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r11.x     // Catch: java.lang.Throwable -> L48
            r13.append(r2)     // Catch: java.lang.Throwable -> L48
            r13.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L48
            r2 = 9
            com.autonavi.aps.amapapi.model.a r13 = b(r2, r13)     // Catch: java.lang.Throwable -> L48
            r11.f3179g = r13     // Catch: java.lang.Throwable -> L48
            r3.f(r0)     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.model.a r13 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r13.k()     // Catch: java.lang.Throwable -> L48
            r11.j(r12, r13, r0, r3)     // Catch: java.lang.Throwable -> L48
            r12 = 2091(0x82b, float:2.93E-42)
            com.autonavi.aps.amapapi.utils.h.a(r5, r12)     // Catch: java.lang.Throwable -> L48
            return
        L7d:
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.model.a r0 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L48
            r4 = 3
            if (r0 == 0) goto La4
            long r8 = r11.f3178f     // Catch: java.lang.Throwable -> L48
            long r6 = r6 - r8
            r8 = 600(0x258, double:2.964E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto La4
            com.autonavi.aps.amapapi.model.a r13 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r13.k()     // Catch: java.lang.Throwable -> L48
            r11.j(r12, r13, r0, r3)     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.b r12 = r11.n     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.model.a r13 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            r12.a(r13, r4)     // Catch: java.lang.Throwable -> L48
            return
        La4:
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L48
            r3.c(r6)     // Catch: java.lang.Throwable -> L48
            r0 = 8
            com.autonavi.aps.amapapi.b r6 = r11.n     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r6 = r6.a(r3)     // Catch: java.lang.Throwable -> Ld7
            r11.f3179g = r6     // Catch: java.lang.Throwable -> Ld7
            int r6 = r6.getLocationType()     // Catch: java.lang.Throwable -> Ld7
            r7 = 6
            r8 = 2
            if (r6 == r7) goto Lea
            com.autonavi.aps.amapapi.model.a r6 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            int r6 = r6.getLocationType()     // Catch: java.lang.Throwable -> Ld7
            r7 = 5
            if (r6 != r7) goto Lc7
            goto Lea
        Lc7:
            com.autonavi.aps.amapapi.model.a r6 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            int r6 = r6.getLocationType()     // Catch: java.lang.Throwable -> Ld7
            if (r6 != r8) goto Ld9
            com.autonavi.aps.amapapi.b r6 = r11.n     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r7 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            r6.a(r7, r4)     // Catch: java.lang.Throwable -> Ld7
            goto Lf1
        Ld7:
            r4 = move-exception
            goto Lfc
        Ld9:
            com.autonavi.aps.amapapi.model.a r4 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            int r4 = r4.getLocationType()     // Catch: java.lang.Throwable -> Ld7
            r6 = 4
            if (r4 != r6) goto Lf1
            com.autonavi.aps.amapapi.b r4 = r11.n     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r7 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            r4.a(r7, r6)     // Catch: java.lang.Throwable -> Ld7
            goto Lf1
        Lea:
            com.autonavi.aps.amapapi.b r4 = r11.n     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r6 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            r4.a(r6, r8)     // Catch: java.lang.Throwable -> Ld7
        Lf1:
            com.autonavi.aps.amapapi.b r4 = r11.n     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r6 = r11.f3179g     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.aps.amapapi.model.a r4 = r4.a(r6)     // Catch: java.lang.Throwable -> Ld7
            r11.f3179g = r4     // Catch: java.lang.Throwable -> Ld7
            goto L124
        Lfc:
            r6 = 2081(0x821, float:2.916E-42)
            com.autonavi.aps.amapapi.utils.h.a(r5, r6)     // Catch: java.lang.Throwable -> L48
            r3.f(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "loc error : "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = r4.getMessage()     // Catch: java.lang.Throwable -> L48
            r6.append(r7)     // Catch: java.lang.Throwable -> L48
            r6.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.model.a r6 = b(r0, r6)     // Catch: java.lang.Throwable -> L48
            r11.f3179g = r6     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "run part2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r6)     // Catch: java.lang.Throwable -> L48
        L124:
            com.autonavi.aps.amapapi.model.a r4 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L132
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L48
            r11.f3178f = r6     // Catch: java.lang.Throwable -> L48
        L132:
            com.autonavi.aps.amapapi.model.a r4 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L141
            java.lang.String r4 = "loc is null#0801"
            com.autonavi.aps.amapapi.model.a r0 = b(r0, r4)     // Catch: java.lang.Throwable -> L48
            r11.f3179g = r0     // Catch: java.lang.Throwable -> L48
            r3.f(r2)     // Catch: java.lang.Throwable -> L48
        L141:
            com.autonavi.aps.amapapi.model.a r0 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L153
            java.lang.String r5 = r0.k()     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.model.a r0 = r11.f3179g     // Catch: java.lang.Throwable -> L48
            com.amap.api.location.AMapLocation r0 = r0.clone()     // Catch: java.lang.Throwable -> L48
            r10 = r5
            r5 = r0
            r0 = r10
            goto L154
        L153:
            r0 = r5
        L154:
            boolean r2 = r13.isLocationCacheEnable()     // Catch: java.lang.Throwable -> L167
            if (r2 == 0) goto L16d
            com.amap.api.col.3l.u7 r2 = r11.m     // Catch: java.lang.Throwable -> L167
            if (r2 == 0) goto L16d
            long r6 = r13.getLastLocationLifeCycle()     // Catch: java.lang.Throwable -> L167
            com.amap.api.location.AMapLocation r5 = r2.a(r5, r0, r6)     // Catch: java.lang.Throwable -> L167
            goto L16d
        L167:
            r13 = move-exception
            java.lang.String r2 = "fixLastLocation"
            com.autonavi.aps.amapapi.utils.b.a(r13, r1, r2)     // Catch: java.lang.Throwable -> L48
        L16d:
            r11.j(r12, r5, r0, r3)     // Catch: java.lang.Throwable -> L48
            goto L176
        L171:
            java.lang.String r13 = "doLocation"
            com.autonavi.aps.amapapi.utils.b.a(r12, r1, r13)
        L176:
            return
    }

    static /* synthetic */ void z(com.amap.api.col.p0003l.e3 r0, android.os.Messenger r1, android.os.Bundle r2) {
            r0.y(r1, r2)
            return
    }

    public final void B() {
            r2 = this;
            com.autonavi.aps.amapapi.b r0 = r2.n
            if (r0 == 0) goto L37
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r2.u
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r2.u
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L18
            com.autonavi.aps.amapapi.b r0 = r2.n
            r1 = 1
            r0.a(r1)
            return
        L31:
            com.autonavi.aps.amapapi.b r0 = r2.n
            r1 = 0
            r0.a(r1)
        L37:
            return
    }

    public final void C() {
            r14 = this;
            java.lang.String r1 = "apm"
            java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r14.o     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            if (r0 == 0) goto L10
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            r14.o = r2     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r0 = move-exception
            goto La4
        L10:
            java.util.List<android.os.Messenger> r0 = r14.s     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1e
            r0.clear()     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r0 = move-exception
            java.lang.String r3 = "des1"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r3)     // Catch: java.lang.Throwable -> Ld
        L1e:
            com.amap.api.col.3l.u7 r0 = r14.m     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L27
            r0.e()     // Catch: java.lang.Throwable -> Ld
            r14.m = r2     // Catch: java.lang.Throwable -> Ld
        L27:
            r0 = 0
            r14.a = r0     // Catch: java.lang.Throwable -> Ld
            r14.f3174b = r0     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.b r3 = r14.n     // Catch: java.lang.Throwable -> Ld
            r3.e()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.e3$a r3 = r14.f3183k     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L38
            r3.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Ld
        L38:
            r14.f3183k = r2     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.e3$b r3 = r14.f3176d     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L4d
            java.lang.Class<android.os.HandlerThread> r4 = android.os.HandlerThread.class
            java.lang.String r5 = "quitSafely"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.utils.f.a(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            com.amap.api.col.3l.e3$b r0 = r14.f3176d     // Catch: java.lang.Throwable -> Ld
            r0.quit()     // Catch: java.lang.Throwable -> Ld
        L4d:
            r14.f3176d = r2     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.utils.h r0 = r14.p     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L87
            long r3 = r14.q     // Catch: java.lang.Throwable -> Ld
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L87
            long r3 = r14.r     // Catch: java.lang.Throwable -> Ld
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L87
            long r3 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> Ld
            long r5 = r14.q     // Catch: java.lang.Throwable -> Ld
            long r12 = r3 - r5
            com.autonavi.aps.amapapi.utils.h r0 = r14.p     // Catch: java.lang.Throwable -> Ld
            android.content.Context r3 = r14.l     // Catch: java.lang.Throwable -> Ld
            int r8 = r0.c(r3)     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.utils.h r0 = r14.p     // Catch: java.lang.Throwable -> Ld
            android.content.Context r3 = r14.l     // Catch: java.lang.Throwable -> Ld
            int r9 = r0.d(r3)     // Catch: java.lang.Throwable -> Ld
            android.content.Context r7 = r14.l     // Catch: java.lang.Throwable -> Ld
            long r10 = r14.r     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.utils.h.a(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.utils.h r0 = r14.p     // Catch: java.lang.Throwable -> Ld
            android.content.Context r3 = r14.l     // Catch: java.lang.Throwable -> Ld
            r0.e(r3)     // Catch: java.lang.Throwable -> Ld
        L87:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r14.u     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L90
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            r14.u = r2     // Catch: java.lang.Throwable -> Ld
        L90:
            android.content.Context r0 = r14.l     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.utils.h.a(r0)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.p0003l.w5.m()     // Catch: java.lang.Throwable -> Ld
            boolean r0 = com.amap.api.col.p0003l.e3.A     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La3
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Ld
            android.os.Process.killProcess(r0)     // Catch: java.lang.Throwable -> Ld
        La3:
            return
        La4:
            java.lang.String r2 = "tdest"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void c() {
            r3 = this;
            com.autonavi.aps.amapapi.utils.h r0 = new com.autonavi.aps.amapapi.utils.h     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            r3.p = r0     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.e3$b r0 = new com.amap.api.col.3l.e3$b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "amapLocCoreThread"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            r3.f3176d = r0     // Catch: java.lang.Throwable -> L2e
            r1 = 5
            r0.setPriority(r1)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.e3$b r0 = r3.f3176d     // Catch: java.lang.Throwable -> L2e
            r0.start()     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.e3$a r0 = new com.amap.api.col.3l.e3$a     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.e3$b r1 = r3.f3176d     // Catch: java.lang.Throwable -> L2e
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            r3.f3183k = r0     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            r3.s = r0     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r0 = move-exception
            java.lang.String r1 = "ApsServiceCore"
            java.lang.String r2 = "onCreate"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void d(android.content.Intent r4) {
            r3 = this;
            java.lang.String r0 = "as"
            java.lang.String r4 = r4.getStringExtra(r0)
            java.lang.String r0 = "true"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L19
            com.amap.api.col.3l.e3$a r4 = r3.f3183k
            if (r4 == 0) goto L19
            r0 = 9
            r1 = 100
            r4.sendEmptyMessageDelayed(r0, r1)
        L19:
            return
    }

    final void i(android.os.Messenger r13, android.os.Bundle r14, java.lang.String r15) {
            r12 = this;
            if (r14 == 0) goto Ldf
            boolean r0 = r14.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto La
            goto Ldf
        La:
            java.lang.String r0 = "lat"
            double r0 = r14.getDouble(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "lon"
            double r2 = r14.getDouble(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "radius"
            float r4 = r14.getFloat(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "time"
            long r5 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "FINE_LOC"
            boolean r7 = r7.equals(r15)     // Catch: java.lang.Throwable -> L47
            r8 = 1
            if (r7 == 0) goto L4a
            com.amap.api.location.AMapLocation r7 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = "gps"
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L47
            r7.setLatitude(r0)     // Catch: java.lang.Throwable -> L47
            r7.setLocationType(r8)     // Catch: java.lang.Throwable -> L47
            r7.setLongitude(r2)     // Catch: java.lang.Throwable -> L47
            r7.setAccuracy(r4)     // Catch: java.lang.Throwable -> L47
            r7.setTime(r5)     // Catch: java.lang.Throwable -> L47
            com.autonavi.aps.amapapi.b r4 = r12.n     // Catch: java.lang.Throwable -> L47
            r4.a(r7)     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r13 = move-exception
            goto Ld8
        L4a:
            boolean r4 = com.autonavi.aps.amapapi.utils.a.h()     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L52
            goto Ldf
        L52:
            com.amap.api.location.AMapLocationClientOption r4 = t(r14)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto Ldf
            boolean r5 = r4.isNeedAddress()     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto L60
            goto Ldf
        L60:
            r12.q(r4)     // Catch: java.lang.Throwable -> L47
            com.amap.api.location.AMapLocation r4 = r12.f3180h     // Catch: java.lang.Throwable -> L47
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == 0) goto L94
            double r6 = r4.getLatitude()     // Catch: java.lang.Throwable -> L47
            com.amap.api.location.AMapLocation r4 = r12.f3180h     // Catch: java.lang.Throwable -> L47
            double r9 = r4.getLongitude()     // Catch: java.lang.Throwable -> L47
            r4 = 4
            double[] r4 = new double[r4]     // Catch: java.lang.Throwable -> L47
            r11 = 0
            r4[r11] = r0     // Catch: java.lang.Throwable -> L47
            r4[r8] = r2     // Catch: java.lang.Throwable -> L47
            r8 = 2
            r4[r8] = r6     // Catch: java.lang.Throwable -> L47
            r6 = 3
            r4[r6] = r9     // Catch: java.lang.Throwable -> L47
            float r4 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L47
            int r7 = com.autonavi.aps.amapapi.utils.a.i()     // Catch: java.lang.Throwable -> L47
            int r7 = r7 * 3
            float r6 = (float) r7     // Catch: java.lang.Throwable -> L47
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L96
            r12.k(r13, r15)     // Catch: java.lang.Throwable -> L47
            goto L96
        L94:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L96:
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto Lb5
            int r5 = com.autonavi.aps.amapapi.utils.a.i()     // Catch: java.lang.Throwable -> L47
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L47
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ldf
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L47
            long r6 = r12.t     // Catch: java.lang.Throwable -> L47
            long r4 = r4 - r6
            int r6 = com.autonavi.aps.amapapi.utils.a.j()     // Catch: java.lang.Throwable -> L47
            int r6 = r6 * 1000
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L47
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto Ldf
        Lb5:
            r12.e(r14)     // Catch: java.lang.Throwable -> L47
            com.autonavi.aps.amapapi.b r14 = r12.n     // Catch: java.lang.Throwable -> L47
            com.autonavi.aps.amapapi.model.a r14 = r14.a(r0, r2)     // Catch: java.lang.Throwable -> L47
            r12.f3180h = r14     // Catch: java.lang.Throwable -> L47
            long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L47
            r12.t = r0     // Catch: java.lang.Throwable -> L47
            com.amap.api.location.AMapLocation r14 = r12.f3180h     // Catch: java.lang.Throwable -> L47
            if (r14 == 0) goto Ldf
            java.lang.String r14 = r14.getAdCode()     // Catch: java.lang.Throwable -> L47
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L47
            if (r14 != 0) goto Ldf
            r12.k(r13, r15)     // Catch: java.lang.Throwable -> L47
            return
        Ld8:
            java.lang.String r14 = "ApsServiceCore"
            java.lang.String r15 = "doLocationGeo"
            com.autonavi.aps.amapapi.utils.b.a(r13, r14, r15)
        Ldf:
            return
    }

    public final boolean r(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.v
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.l
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.b(r0)
            r1.v = r0
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L21
            java.lang.String r0 = r1.v
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1f
            goto L21
        L1f:
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final android.os.Handler s() {
            r1 = this;
            com.amap.api.col.3l.e3$a r0 = r1.f3183k
            return r0
    }

    public final void w(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "a"
            java.lang.String r0 = r3.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L11
            android.content.Context r1 = r2.l
            com.amap.api.col.p0003l.g4.l(r1, r0)
        L11:
            java.lang.String r0 = "b"
            java.lang.String r0 = r3.getStringExtra(r0)
            r2.f3175c = r0
            com.amap.api.col.p0003l.f4.c(r0)
            java.lang.String r0 = "d"
            java.lang.String r3 = r3.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2b
            com.amap.api.col.p0003l.i4.s(r3)
        L2b:
            return
    }
}
