package com.autonavi.aps.amapapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    static int A = -1;
    public static java.lang.String[] D;
    public static java.lang.String E;
    private static boolean K;
    private static volatile boolean Q;
    com.autonavi.aps.amapapi.filters.a B;
    java.lang.String C;
    boolean F;
    android.content.IntentFilter G;
    android.location.LocationManager H;
    private int I;
    private java.lang.String J;
    private java.lang.String L;
    private boolean M;
    private android.os.Handler N;
    private com.autonavi.aps.amapapi.restruct.g O;
    private java.lang.String P;
    private com.autonavi.aps.amapapi.c R;
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    android.net.ConnectivityManager f5668b;

    /* renamed from: c, reason: collision with root package name */
    com.autonavi.aps.amapapi.restruct.k f5669c;

    /* renamed from: d, reason: collision with root package name */
    com.autonavi.aps.amapapi.restruct.e f5670d;

    /* renamed from: e, reason: collision with root package name */
    com.autonavi.aps.amapapi.storage.a f5671e;

    /* renamed from: f, reason: collision with root package name */
    com.autonavi.aps.amapapi.trans.e f5672f;

    /* renamed from: g, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.col.p0003l.m9> f5673g;

    /* renamed from: h, reason: collision with root package name */
    com.autonavi.aps.amapapi.b.a f5674h;

    /* renamed from: i, reason: collision with root package name */
    com.amap.api.location.AMapLocationClientOption f5675i;

    /* renamed from: j, reason: collision with root package name */
    com.autonavi.aps.amapapi.model.a f5676j;

    /* renamed from: k, reason: collision with root package name */
    long f5677k;
    com.autonavi.aps.amapapi.trans.f l;
    boolean m;
    com.autonavi.aps.amapapi.trans.c n;
    java.lang.StringBuilder o;
    boolean p;
    boolean q;
    com.amap.api.location.AMapLocationClientOption.GeoLanguage r;
    boolean s;
    boolean t;
    java.lang.StringBuilder u;
    boolean v;
    public boolean w;
    int x;
    com.autonavi.aps.amapapi.restruct.b y;
    boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.autonavi.aps.amapapi.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.location.AMapLocationClientOption$GeoLanguage[] r0 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.autonavi.aps.amapapi.b.AnonymousClass1.a = r0
                com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.autonavi.aps.amapapi.b.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.ZH     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.autonavi.aps.amapapi.b.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.EN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.autonavi.aps.amapapi.b a;

        a(com.autonavi.aps.amapapi.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                if (r2 == 0) goto L5a
                if (r3 != 0) goto L5
                goto L5a
            L5:
                java.lang.String r2 = r3.getAction()     // Catch: java.lang.Throwable -> L22
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L22
                if (r0 == 0) goto L10
                goto L5a
            L10:
                java.lang.String r0 = "android.net.wifi.SCAN_RESULTS"
                boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L22
                if (r0 == 0) goto L41
                com.autonavi.aps.amapapi.b r2 = r1.a     // Catch: java.lang.Throwable -> L22
                com.autonavi.aps.amapapi.restruct.k r2 = r2.f5669c     // Catch: java.lang.Throwable -> L22
                if (r2 == 0) goto L24
                r2.i()     // Catch: java.lang.Throwable -> L22
                goto L24
            L22:
                r2 = move-exception
                goto L53
            L24:
                android.os.Bundle r2 = r3.getExtras()     // Catch: java.lang.Throwable -> L5a
                if (r2 == 0) goto L5a
                android.os.Bundle r2 = r3.getExtras()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r3 = "resultsUpdated"
                r0 = 1
                boolean r2 = r2.getBoolean(r3, r0)     // Catch: java.lang.Throwable -> L5a
                if (r2 == 0) goto L5a
                com.autonavi.aps.amapapi.b r2 = r1.a     // Catch: java.lang.Throwable -> L5a
                com.autonavi.aps.amapapi.restruct.k r2 = r2.f5669c     // Catch: java.lang.Throwable -> L5a
                if (r2 == 0) goto L5a
                r2.h()     // Catch: java.lang.Throwable -> L5a
                return
            L41:
                java.lang.String r3 = "android.net.wifi.WIFI_STATE_CHANGED"
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L22
                if (r2 == 0) goto L5a
                com.autonavi.aps.amapapi.b r2 = r1.a     // Catch: java.lang.Throwable -> L22
                com.autonavi.aps.amapapi.restruct.k r2 = r2.f5669c     // Catch: java.lang.Throwable -> L22
                if (r2 == 0) goto L5a
                r2.j()     // Catch: java.lang.Throwable -> L22
                return
            L53:
                java.lang.String r3 = "Aps"
                java.lang.String r0 = "onReceive"
                com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            L5a:
                return
        }
    }

    static {
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.autonavi.aps.amapapi.b.D = r0
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            com.autonavi.aps.amapapi.b.E = r0
            r0 = 0
            com.autonavi.aps.amapapi.b.Q = r0
            return
    }

    public b(boolean r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.f5668b = r0
            r4.f5669c = r0
            r4.f5670d = r0
            r4.f5671e = r0
            r4.f5672f = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f5673g = r1
            r4.f5674h = r0
            com.amap.api.location.AMapLocationClientOption r1 = new com.amap.api.location.AMapLocationClientOption
            r1.<init>()
            r4.f5675i = r1
            r4.f5676j = r0
            r1 = 0
            r4.f5677k = r1
            r1 = 0
            r4.I = r1
            r4.l = r0
            r4.m = r1
            r4.J = r0
            r4.n = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4.o = r2
            r2 = 1
            r4.p = r2
            r4.q = r2
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r3 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            r4.r = r3
            r4.s = r2
            r4.t = r1
            r4.L = r0
            r4.u = r0
            r4.v = r1
            r4.w = r1
            r3 = 12
            r4.x = r3
            r4.M = r2
            r4.y = r0
            r4.z = r1
            r4.B = r0
            r4.C = r0
            r4.G = r0
            r4.H = r0
            r4.F = r5
            return
    }

    private static com.autonavi.aps.amapapi.model.a a(int r2, java.lang.String r3) {
            com.autonavi.aps.amapapi.model.a r0 = new com.autonavi.aps.amapapi.model.a
            java.lang.String r1 = ""
            r0.<init>(r1)
            r0.setErrorCode(r2)
            r0.setLocationDetail(r3)
            r3 = 15
            if (r2 != r3) goto L17
            r2 = 0
            r3 = 2151(0x867, float:3.014E-42)
            com.autonavi.aps.amapapi.utils.h.a(r2, r3)
        L17:
            return r0
    }

    private com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a r7, com.amap.api.col.p0003l.a7 r8, com.autonavi.aps.amapapi.a r9) {
            r6 = this;
            r0 = 4
            java.lang.String r1 = "#0403"
            if (r8 == 0) goto L7c
            byte[] r2 = r8.a     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L7c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto Ld
            goto L7c
        Ld:
            com.autonavi.aps.amapapi.trans.e r2 = new com.autonavi.aps.amapapi.trans.e     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            byte[] r4 = r8.a     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "\"status\":\"0\""
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L35
            android.content.Context r4 = r6.a     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.model.a r7 = r2.a(r3, r4, r8, r9)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r8 = r6.u     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L33
            r7.h(r8)     // Catch: java.lang.Throwable -> L33
            return r7
        L33:
            r8 = move-exception
            goto La5
        L35:
            java.lang.String r8 = "</body></html>"
            boolean r8 = r3.contains(r8)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            if (r8 == 0) goto L7b
            r8 = 5
            r7.setErrorCode(r8)     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.restruct.k r8 = r6.f5669c     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L60
            android.net.ConnectivityManager r3 = r6.f5668b     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.a(r3)     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L60
            java.lang.String r8 = "#0501"
            r9.f(r8)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r8 = r6.o     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "您连接的是一个需要登录的网络，请确认已经登入网络#0501"
            r8.append(r3)     // Catch: java.lang.Throwable -> L33
            r8 = 2051(0x803, float:2.874E-42)
            com.autonavi.aps.amapapi.utils.h.a(r2, r8)     // Catch: java.lang.Throwable -> L33
            goto L71
        L60:
            java.lang.String r8 = "#0502"
            r9.f(r8)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r8 = r6.o     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "请求可能被劫持了#0502"
            r8.append(r3)     // Catch: java.lang.Throwable -> L33
            r8 = 2052(0x804, float:2.875E-42)
            com.autonavi.aps.amapapi.utils.h.a(r2, r8)     // Catch: java.lang.Throwable -> L33
        L71:
            java.lang.StringBuilder r8 = r6.o     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L33
            r7.setLocationDetail(r8)     // Catch: java.lang.Throwable -> L33
            return r7
        L7b:
            return r2
        L7c:
            r7.setErrorCode(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = r6.o     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "网络异常,请求异常#0403"
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            r9.f(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = r6.u     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L33
            r7.h(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = r6.o     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L33
            r7.setLocationDetail(r2)     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto La4
            java.lang.String r8 = r8.f2962d     // Catch: java.lang.Throwable -> L33
            r2 = 2041(0x7f9, float:2.86E-42)
            com.autonavi.aps.amapapi.utils.h.a(r8, r2)     // Catch: java.lang.Throwable -> L33
        La4:
            return r7
        La5:
            r7.setErrorCode(r0)
            java.lang.String r0 = "Aps"
            java.lang.String r2 = "checkResponseEntity"
            com.autonavi.aps.amapapi.utils.b.a(r8, r0, r2)
            r9.f(r1)
            java.lang.StringBuilder r9 = r6.o
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "check response exception ex is"
            r0.<init>(r2)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            r9.append(r8)
            java.lang.StringBuilder r8 = r6.o
            java.lang.String r8 = r8.toString()
            r7.setLocationDetail(r8)
            return r7
    }

    private java.lang.StringBuilder a(java.lang.StringBuilder r3) {
            r2 = this;
            if (r3 != 0) goto La
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = 700(0x2bc, float:9.81E-43)
            r3.<init>(r0)
            goto L12
        La:
            r0 = 0
            int r1 = r3.length()
            r3.delete(r0, r1)
        L12:
            com.autonavi.aps.amapapi.restruct.e r0 = r2.f5670d
            if (r0 == 0) goto L2a
            com.autonavi.aps.amapapi.restruct.k r1 = r2.f5669c
            if (r1 == 0) goto L2a
            java.lang.String r0 = r0.m()
            r3.append(r0)
            com.autonavi.aps.amapapi.restruct.k r0 = r2.f5669c
            java.lang.String r0 = r0.o()
            r3.append(r0)
        L2a:
            return r3
    }

    private boolean a(long r6) {
            r5 = this;
            boolean r0 = r5.M
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L9
            r5.M = r2
            return r1
        L9:
            long r3 = com.autonavi.aps.amapapi.utils.j.b()
            long r3 = r3 - r6
            r6 = 800(0x320, double:3.953E-321)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L31
            com.autonavi.aps.amapapi.model.a r6 = r5.f5676j
            boolean r6 = com.autonavi.aps.amapapi.utils.j.a(r6)
            if (r6 == 0) goto L28
            long r6 = com.autonavi.aps.amapapi.utils.j.a()
            com.autonavi.aps.amapapi.model.a r0 = r5.f5676j
            long r3 = r0.getTime()
            long r6 = r6 - r3
            goto L2a
        L28:
            r6 = 0
        L2a:
            r3 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L31
            return r2
        L31:
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    private com.autonavi.aps.amapapi.model.a b(boolean r12, com.autonavi.aps.amapapi.a r13) {
            r11 = this;
            java.lang.String r1 = "FAIL"
            java.lang.String r0 = r11.P     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            android.content.Context r2 = r11.a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = com.amap.api.col.p0003l.i4.o(r2)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = ","
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            android.content.Context r2 = r11.a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = com.amap.api.col.p0003l.i4.F(r2)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = com.amap.api.col.p0003l.q4.q(r0)     // Catch: java.lang.Throwable -> L3c
            r11.P = r0     // Catch: java.lang.Throwable -> L3c
        L30:
            java.lang.StringBuilder r0 = r11.o     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "#id:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r11.P     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
        L3c:
            com.autonavi.aps.amapapi.model.a r0 = new com.autonavi.aps.amapapi.model.a
            java.lang.String r2 = ""
            r0.<init>(r2)
            r3 = 0
            byte[] r6 = r11.n()     // Catch: java.lang.Throwable -> L2d3
            long r4 = com.autonavi.aps.amapapi.utils.j.b()
            r11.f5677k = r4
            r13.a(r4)
            r10 = 0
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.utils.b.c(r4)     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.c r4 = r11.n     // Catch: java.lang.Throwable -> L85
            android.content.Context r5 = r11.a     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = com.autonavi.aps.amapapi.utils.b.a()     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = com.autonavi.aps.amapapi.utils.b.b()     // Catch: java.lang.Throwable -> L85
            r9 = r12
            com.autonavi.aps.amapapi.trans.d r12 = r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L85
            r12.getURL()     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r12.getIPV6URL()     // Catch: java.lang.Throwable -> L85
            android.content.Context r5 = r11.a     // Catch: java.lang.Throwable -> L85
            com.amap.api.col.p0003l.g4.g(r5)     // Catch: java.lang.Throwable -> L85
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L85
            r6 = 1
            if (r5 != 0) goto L89
            java.lang.String r5 = "dualstack"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L89
            r4 = 1
            goto L8a
        L85:
            r0 = move-exception
            r12 = r0
            goto L201
        L89:
            r4 = 0
        L8a:
            int r5 = com.autonavi.aps.amapapi.trans.a.a     // Catch: java.lang.Throwable -> L85
            boolean r7 = com.amap.api.col.p0003l.g4.v()     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L9c
            boolean r7 = com.amap.api.col.p0003l.g4.K()     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L9c
            if (r4 == 0) goto L9c
            int r5 = com.autonavi.aps.amapapi.trans.a.f5798b     // Catch: java.lang.Throwable -> L85
        L9c:
            boolean r4 = com.amap.api.col.p0003l.g4.G()     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto Lac
            android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.a r3 = com.autonavi.aps.amapapi.trans.a.a(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r3.a(r12, r5)     // Catch: java.lang.Throwable -> L85
        Lac:
            int r4 = com.autonavi.aps.amapapi.trans.a.f5798b     // Catch: java.lang.Throwable -> L85
            if (r5 != r4) goto Lb3
            java.lang.String r4 = "v6"
            goto Lb5
        Lb3:
            java.lang.String r4 = "v4"
        Lb5:
            r13.a(r4)     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.c r4 = r11.n     // Catch: java.lang.Throwable -> L85
            com.amap.api.col.3l.a7 r12 = r4.a(r12)     // Catch: java.lang.Throwable -> L85
            long r7 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L85
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto Le8
            boolean r4 = r12.f2964f     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto Ld6
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.a r4 = com.autonavi.aps.amapapi.trans.a.a(r4)     // Catch: java.lang.Throwable -> L85
            r4.a(r6, r5)     // Catch: java.lang.Throwable -> L85
            goto Le8
        Ld6:
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.a r4 = com.autonavi.aps.amapapi.trans.a.a(r4)     // Catch: java.lang.Throwable -> L85
            r4.a(r10, r5)     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L85
            com.autonavi.aps.amapapi.trans.a r4 = com.autonavi.aps.amapapi.trans.a.a(r4)     // Catch: java.lang.Throwable -> L85
            r4.a(r5)     // Catch: java.lang.Throwable -> L85
        Le8:
            java.lang.String r4 = "SUCCESS"
            if (r12 == 0) goto L103
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto L103
            boolean r5 = r12.f2964f     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto Lfd
            r13.b(r3)     // Catch: java.lang.Throwable -> L85
            r13.c(r4)     // Catch: java.lang.Throwable -> L85
            goto L106
        Lfd:
            r13.b(r3)     // Catch: java.lang.Throwable -> L85
            r13.c(r1)     // Catch: java.lang.Throwable -> L85
        L103:
            r13.d(r4)     // Catch: java.lang.Throwable -> L85
        L106:
            com.autonavi.aps.amapapi.c r3 = r11.R     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L10d
            r3.d()     // Catch: java.lang.Throwable -> L85
        L10d:
            r13.b(r7)
            if (r12 == 0) goto L13b
            java.lang.String r1 = r12.f2961c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L12f
            java.lang.StringBuilder r1 = r11.o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "#csid:"
            r3.<init>(r4)
            java.lang.String r4 = r12.f2961c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
        L12f:
            java.lang.String r1 = r12.f2962d
            java.lang.StringBuilder r3 = r11.u
            java.lang.String r3 = r3.toString()
            r0.h(r3)
            goto L13c
        L13b:
            r1 = r2
        L13c:
            com.autonavi.aps.amapapi.model.a r3 = r11.a(r0, r12, r13)
            if (r3 == 0) goto L143
            return r3
        L143:
            byte[] r12 = r12.a
            byte[] r12 = com.autonavi.aps.amapapi.security.a.b(r12)
            if (r12 != 0) goto L16a
            r12 = 5
            r0.setErrorCode(r12)
            java.lang.String r12 = "#0503"
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r13 = "解密数据失败#0503"
            r12.append(r13)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r12 = r12.toString()
            r0.setLocationDetail(r12)
            r12 = 2053(0x805, float:2.877E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r12)
            return r0
        L16a:
            com.autonavi.aps.amapapi.trans.e r3 = r11.f5672f
            com.autonavi.aps.amapapi.model.a r12 = r3.a(r0, r12, r13)
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r12)
            if (r0 != 0) goto L1d6
            java.lang.String r0 = r12.b()
            r11.J = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L188
            r0 = 2062(0x80e, float:2.89E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r0)
            goto L18d
        L188:
            r0 = 2061(0x80d, float:2.888E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r0)
        L18d:
            r0 = 6
            r12.setErrorCode(r0)
            java.lang.String r0 = "#0601"
            r13.f(r0)
            java.lang.StringBuilder r13 = r11.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "location faile retype:"
            r1.<init>(r3)
            java.lang.String r3 = r12.d()
            r1.append(r3)
            java.lang.String r3 = " rdesc:"
            r1.append(r3)
            java.lang.String r3 = r11.J
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L1b4
            goto L1b6
        L1b4:
            java.lang.String r2 = r11.J
        L1b6:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.append(r0)
            java.lang.StringBuilder r13 = r11.u
            java.lang.String r13 = r13.toString()
            r12.h(r13)
            java.lang.StringBuilder r13 = r11.o
            java.lang.String r13 = r13.toString()
            r12.setLocationDetail(r13)
            return r12
        L1d6:
            c(r12)
            boolean r13 = r11.q
            r12.setOffset(r13)
            boolean r13 = r11.p
            r12.a(r13)
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r13 = r11.r
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.f(r13)
            java.lang.String r13 = "new"
            r12.e(r13)
            java.lang.StringBuilder r13 = r11.o
            java.lang.String r13 = r13.toString()
            r12.setLocationDetail(r13)
            java.lang.String r13 = r12.a()
            r11.C = r13
            return r12
        L201:
            com.autonavi.aps.amapapi.utils.j.b()
            r13.d(r1)
            android.content.Context r0 = r11.a
            com.autonavi.aps.amapapi.trans.a r0 = com.autonavi.aps.amapapi.trans.a.a(r0)
            int r1 = com.autonavi.aps.amapapi.trans.a.a
            r0.a(r10, r1)
            java.lang.String r0 = "Aps"
            java.lang.String r1 = "getApsLoc req"
            com.autonavi.aps.amapapi.utils.b.a(r12, r0, r1)
            java.lang.String r0 = "/mobile/binary"
            com.autonavi.aps.amapapi.utils.h.a(r0, r12)
            android.content.Context r0 = r11.a
            boolean r0 = com.autonavi.aps.amapapi.utils.j.d(r0)
            if (r0 != 0) goto L234
            java.lang.String r12 = "#0401"
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r13 = "网络异常，未连接到网络，请连接网络#0401"
            r12.append(r13)
            goto L2be
        L234:
            boolean r0 = r12 instanceof com.amap.api.col.p0003l.fk
            java.lang.String r1 = "网络异常,请求异常#0403"
            java.lang.String r2 = "#0403,"
            if (r0 == 0) goto L2a6
            r0 = r12
            com.amap.api.col.3l.fk r0 = (com.amap.api.col.p0003l.fk) r0
            java.lang.String r3 = r0.a()
            java.lang.String r4 = "网络异常状态码"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L25f
            java.lang.String r12 = "#0404"
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r13 = "网络异常，状态码错误#0404"
            r12.append(r13)
            int r13 = r0.f()
            r12.append(r13)
            goto L2be
        L25f:
            int r0 = r0.f()
            r3 = 23
            if (r0 == r3) goto L299
            long r3 = com.autonavi.aps.amapapi.utils.j.b()
            long r5 = r11.f5677k
            long r3 = r3 - r5
            com.amap.api.location.AMapLocationClientOption r0 = r11.f5675i
            long r5 = r0.getHttpTimeOut()
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L280
            goto L299
        L280:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            r12.append(r1)
            goto L2be
        L299:
            java.lang.String r12 = "#0402"
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r13 = "网络异常，连接超时#0402"
            r12.append(r13)
            goto L2be
        L2a6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.f(r12)
            java.lang.StringBuilder r12 = r11.o
            r12.append(r1)
        L2be:
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r12 = r12.toString()
            r13 = 4
            com.autonavi.aps.amapapi.model.a r12 = a(r13, r12)
            java.lang.StringBuilder r13 = r11.u
            java.lang.String r13 = r13.toString()
            r12.h(r13)
            return r12
        L2d3:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "#0301"
            r13.f(r0)
            java.lang.StringBuilder r13 = r11.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "get parames error:"
            r1.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r13.append(r12)
            r12 = 2031(0x7ef, float:2.846E-42)
            com.autonavi.aps.amapapi.utils.h.a(r3, r12)
            java.lang.StringBuilder r12 = r11.o
            java.lang.String r12 = r12.toString()
            r13 = 3
            com.autonavi.aps.amapapi.model.a r12 = a(r13, r12)
            java.lang.StringBuilder r13 = r11.u
            java.lang.String r13 = r13.toString()
            r12.h(r13)
            return r12
    }

    private void b(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw=="
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)     // Catch: java.lang.Throwable -> Lf
            int r2 = r2.checkCallingOrSelfPermission(r0)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto Lf
            r2 = 1
            r1.m = r2     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private java.lang.String c(com.autonavi.aps.amapapi.a r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.autonavi.aps.amapapi.restruct.e r2 = r0.f5670d
            java.lang.String r3 = ""
            if (r2 == 0) goto L3cb
            com.autonavi.aps.amapapi.restruct.k r4 = r0.f5669c
            if (r4 != 0) goto L10
            goto L3cb
        L10:
            int r2 = r2.h()
            com.autonavi.aps.amapapi.restruct.e r4 = r0.f5670d
            com.autonavi.aps.amapapi.restruct.d r4 = r4.e()
            com.autonavi.aps.amapapi.restruct.e r5 = r0.f5670d
            com.autonavi.aps.amapapi.restruct.d r5 = r5.f()
            java.util.ArrayList<com.amap.api.col.3l.m9> r6 = r0.f5673g
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L2f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2d
            goto L2f
        L2d:
            r6 = 0
            goto L30
        L2f:
            r6 = 1
        L30:
            r9 = 0
            if (r4 != 0) goto L1fd
            if (r5 != 0) goto L1fd
            if (r6 == 0) goto L1fd
            android.net.ConnectivityManager r2 = r0.f5668b
            if (r2 != 0) goto L47
            android.content.Context r2 = r0.a
            java.lang.String r4 = "connectivity"
            java.lang.Object r2 = com.autonavi.aps.amapapi.utils.j.a(r2, r4)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0.f5668b = r2
        L47:
            int r2 = com.autonavi.aps.amapapi.utils.j.c()
            r4 = 31
            r5 = 2132(0x854, float:2.988E-42)
            r6 = 18
            if (r2 < r4) goto L75
            android.content.Context r2 = r0.a
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r2)
            if (r2 == 0) goto L97
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.l()
            if (r2 != 0) goto L97
            r0.x = r6
            java.lang.StringBuilder r2 = r0.o
            java.lang.String r4 = "飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1802"
            r2.append(r4)
            com.autonavi.aps.amapapi.utils.h.a(r9, r5)
            java.lang.String r2 = "#1802"
            r1.f(r2)
            return r3
        L75:
            android.content.Context r2 = r0.a
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r2)
            if (r2 == 0) goto L97
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.k()
            if (r2 != 0) goto L97
            r0.x = r6
            java.lang.StringBuilder r2 = r0.o
            java.lang.String r4 = "飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1801"
            r2.append(r4)
            com.autonavi.aps.amapapi.utils.h.a(r9, r5)
            java.lang.String r2 = "#1801"
            r1.f(r2)
            return r3
        L97:
            int r2 = com.autonavi.aps.amapapi.utils.j.c()
            java.lang.String r4 = "#1206"
            java.lang.String r5 = "定位服务没有开启，请在设置中打开定位服务开关#1206"
            r6 = 28
            r7 = 2121(0x849, float:2.972E-42)
            r10 = 12
            if (r2 < r6) goto Ldf
            android.location.LocationManager r2 = r0.H
            if (r2 != 0) goto Lbf
            android.content.Context r2 = r0.a
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r11 = "location"
            java.lang.Object r2 = r2.getSystemService(r11)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r0.H = r2
        Lbf:
            android.location.LocationManager r2 = r0.H
            java.lang.String r11 = "isLocationEnabled"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r2 = com.autonavi.aps.amapapi.utils.f.a(r2, r11, r12)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Ldf
            r0.x = r10
            java.lang.StringBuilder r2 = r0.o
            r2.append(r5)
            r1.f(r4)
            com.autonavi.aps.amapapi.utils.h.a(r9, r7)
            return r3
        Ldf:
            android.content.Context r2 = r0.a
            boolean r2 = com.autonavi.aps.amapapi.utils.j.e(r2)
            if (r2 != 0) goto Lf9
            r0.x = r10
            java.lang.StringBuilder r2 = r0.o
            java.lang.String r4 = "定位权限被禁用,请授予应用定位权限#1201"
            r2.append(r4)
            java.lang.String r2 = "#1201"
            r1.f(r2)
            com.autonavi.aps.amapapi.utils.h.a(r9, r7)
            return r3
        Lf9:
            int r2 = com.autonavi.aps.amapapi.utils.j.c()
            r11 = 24
            if (r2 < r11) goto L123
            int r2 = com.autonavi.aps.amapapi.utils.j.c()
            if (r2 >= r6) goto L123
            android.content.Context r2 = r0.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r6 = "location_mode"
            int r2 = android.provider.Settings.Secure.getInt(r2, r6, r8)
            if (r2 != 0) goto L123
            r0.x = r10
            r1.f(r4)
            java.lang.StringBuilder r1 = r0.o
            r1.append(r5)
            com.autonavi.aps.amapapi.utils.h.a(r9, r7)
            return r3
        L123:
            com.autonavi.aps.amapapi.restruct.e r2 = r0.f5670d
            java.lang.String r2 = r2.k()
            com.autonavi.aps.amapapi.restruct.k r4 = r0.f5669c
            java.lang.String r4 = r4.d()
            com.autonavi.aps.amapapi.restruct.k r5 = r0.f5669c
            android.net.ConnectivityManager r6 = r0.f5668b
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L14d
            if (r4 == 0) goto L14d
            r0.x = r10
            java.lang.String r2 = "#1202"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "获取基站与获取WIFI的权限都被禁用，请在安全软件中打开应用的定位权限#1202"
            r1.append(r2)
            com.autonavi.aps.amapapi.utils.h.a(r9, r7)
            return r3
        L14d:
            if (r2 == 0) goto L176
            r0.x = r10
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.k()
            if (r2 != 0) goto L166
            java.lang.String r2 = "#1204"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "WIFI开关关闭，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限或者打开WIFI开关#1204"
            r1.append(r2)
            goto L172
        L166:
            java.lang.String r2 = "#1205"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "获取的WIFI列表为空，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限#1205"
            r1.append(r2)
        L172:
            com.autonavi.aps.amapapi.utils.h.a(r9, r7)
            return r3
        L176:
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.k()
            if (r2 != 0) goto L19c
            com.autonavi.aps.amapapi.restruct.e r2 = r0.f5670d
            boolean r2 = r2.n()
            if (r2 != 0) goto L19c
            r2 = 19
            r0.x = r2
            java.lang.String r2 = "#1901"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "没有检查到SIM卡，并且WIFI开关关闭，请打开WIFI开关或者插入SIM卡#1901"
            r1.append(r2)
            r1 = 2133(0x855, float:2.989E-42)
            com.autonavi.aps.amapapi.utils.h.a(r9, r1)
            return r3
        L19c:
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.k()
            if (r2 != 0) goto L1b1
            java.lang.String r2 = "#1301"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "获取到的基站为空，并且关闭了WIFI开关，请您打开WIFI开关再发起定位#1301"
            r1.append(r2)
            goto L1f3
        L1b1:
            java.lang.String r2 = "#1302"
            r1.f(r2)
            com.autonavi.aps.amapapi.restruct.k r1 = r0.f5669c
            android.net.wifi.WifiInfo r1 = r1.c()
            java.lang.String r4 = "或后台运行没有后台定位权限"
            if (r1 == 0) goto L1da
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r5 = "获取到的基站和WIFI信息均为空，请检查是否授予APP定位权限"
            r1.append(r5)
            android.content.Context r1 = r0.a
            boolean r1 = com.autonavi.aps.amapapi.utils.j.f(r1)
            if (r1 != 0) goto L1d4
            java.lang.StringBuilder r1 = r0.o
            r1.append(r4)
        L1d4:
            java.lang.StringBuilder r1 = r0.o
            r1.append(r2)
            goto L1f3
        L1da:
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r5 = "获取到的基站和WIFI信息均为空，请移动到有WIFI的区域，若确定当前区域有WIFI，请检查是否授予APP定位权限"
            r1.append(r5)
            android.content.Context r1 = r0.a
            boolean r1 = com.autonavi.aps.amapapi.utils.j.f(r1)
            if (r1 != 0) goto L1ee
            java.lang.StringBuilder r1 = r0.o
            r1.append(r4)
        L1ee:
            java.lang.StringBuilder r1 = r0.o
            r1.append(r2)
        L1f3:
            r1 = 13
            r0.x = r1
            r1 = 2131(0x853, float:2.986E-42)
            com.autonavi.aps.amapapi.utils.h.a(r9, r1)
            return r3
        L1fd:
            com.autonavi.aps.amapapi.restruct.k r6 = r0.f5669c
            com.autonavi.aps.amapapi.restruct.j r6 = r6.m()
            com.autonavi.aps.amapapi.restruct.k r10 = r0.f5669c
            boolean r6 = r10.a(r6)
            java.lang.String r10 = "cgiwifi"
            java.lang.String r11 = "cgi"
            r12 = 2
            java.lang.String r13 = "#"
            java.lang.String r14 = "network"
            if (r2 == 0) goto L2bb
            if (r2 == r7) goto L279
            if (r2 == r12) goto L22f
            r2 = 11
            r0.x = r2
            r2 = 2111(0x83f, float:2.958E-42)
            com.autonavi.aps.amapapi.utils.h.a(r9, r2)
            java.lang.String r2 = "#1101"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "get cgi failure#1101"
            r1.append(r2)
            goto L39c
        L22f:
            if (r4 == 0) goto L39c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.a
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5735b
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5741h
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5742i
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5743j
            r1.append(r2)
            r1.append(r13)
            r1.append(r14)
            r1.append(r13)
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r0.f5673g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L270
            if (r6 == 0) goto L26f
            goto L270
        L26f:
            r10 = r11
        L270:
            r1.append(r10)
            java.lang.String r3 = r1.toString()
            goto L39c
        L279:
            if (r4 == 0) goto L39c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.a
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5735b
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5736c
            r1.append(r2)
            r1.append(r13)
            int r2 = r4.f5737d
            r1.append(r2)
            r1.append(r13)
            r1.append(r14)
            r1.append(r13)
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r0.f5673g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2b2
            if (r6 == 0) goto L2b1
            goto L2b2
        L2b1:
            r10 = r11
        L2b2:
            r1.append(r10)
            java.lang.String r3 = r1.toString()
            goto L39c
        L2bb:
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r0.f5673g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2c8
            if (r6 == 0) goto L2c6
            goto L2c8
        L2c6:
            r2 = 0
            goto L2c9
        L2c8:
            r2 = 1
        L2c9:
            if (r5 == 0) goto L2cd
            r4 = 1
            goto L2ce
        L2cd:
            r4 = 0
        L2ce:
            if (r4 != 0) goto L327
            r8 = 2021(0x7e5, float:2.832E-42)
            if (r6 == 0) goto L2ee
            java.util.ArrayList<com.amap.api.col.3l.m9> r15 = r0.f5673g
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L2ee
            r0.x = r12
            java.lang.String r2 = "#0201"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "当前基站为伪基站，并且WIFI权限被禁用，请在安全软件中打开应用的定位权限#0201"
            r1.append(r2)
            com.autonavi.aps.amapapi.utils.h.a(r9, r8)
            return r3
        L2ee:
            java.util.ArrayList<com.amap.api.col.3l.m9> r15 = r0.f5673g
            int r15 = r15.size()
            if (r15 != r7) goto L327
            r0.x = r12
            java.lang.String r15 = "当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202"
            java.lang.String r12 = "#0202"
            if (r6 != 0) goto L30c
            r1.f(r12)
            java.lang.StringBuilder r1 = r0.o
            r1.append(r15)
            r1 = 2022(0x7e6, float:2.833E-42)
            com.autonavi.aps.amapapi.utils.h.a(r9, r1)
            return r3
        L30c:
            java.util.ArrayList<com.amap.api.col.3l.m9> r7 = r0.f5673g
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.amap.api.col.3l.m9 r7 = (com.amap.api.col.p0003l.m9) r7
            boolean r7 = r7.f3691h
            if (r7 == 0) goto L327
            r1.f(r12)
            java.lang.StringBuilder r1 = r0.o
            r1.append(r15)
            r1 = 2021(0x7e5, float:2.832E-42)
            com.autonavi.aps.amapapi.utils.h.a(r9, r1)
            return r3
        L327:
            java.util.Locale r7 = java.util.Locale.US
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r16 = 0
            r8[r16] = r14
            java.lang.String r12 = "#%s#"
            java.lang.String r7 = java.lang.String.format(r7, r12, r8)
            if (r4 == 0) goto L35e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.b()
            r1.append(r2)
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r0.f5673g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L350
            if (r6 == 0) goto L34f
            goto L350
        L34f:
            r10 = r11
        L350:
            r1.append(r14)
            r1.append(r13)
            r1.append(r10)
            java.lang.String r3 = r1.toString()
            goto L39c
        L35e:
            if (r2 == 0) goto L372
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "wifi"
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            goto L39c
        L372:
            r2 = 2
            r0.x = r2
            com.autonavi.aps.amapapi.restruct.k r2 = r0.f5669c
            boolean r2 = r2.k()
            if (r2 != 0) goto L38c
            java.lang.String r2 = "#0203"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "当前基站为伪基站,并且关闭了WIFI开关，请在设置中打开WIFI开关#0203"
            r1.append(r2)
        L389:
            r1 = 2022(0x7e6, float:2.833E-42)
            goto L399
        L38c:
            java.lang.String r2 = "#0204"
            r1.f(r2)
            java.lang.StringBuilder r1 = r0.o
            java.lang.String r2 = "当前基站为伪基站,并且没有搜索到WIFI，请移动到WIFI比较丰富的区域#0204"
            r1.append(r2)
            goto L389
        L399:
            com.autonavi.aps.amapapi.utils.h.a(r9, r1)
        L39c:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L3cb
            boolean r1 = r3.startsWith(r13)
            if (r1 != 0) goto L3b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
        L3b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.j.e()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            return r1
        L3cb:
            return r3
    }

    private static void c(com.autonavi.aps.amapapi.model.a r2) {
            int r0 = r2.getErrorCode()
            if (r0 != 0) goto L5e
            int r0 = r2.getLocationType()
            if (r0 != 0) goto L5e
            java.lang.String r0 = "-5"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "1"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "2"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "14"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "24"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "-1"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L55
            goto L5a
        L55:
            r0 = 6
            r2.setLocationType(r0)
            return
        L5a:
            r0 = 5
            r2.setLocationType(r0)
        L5e:
            return
    }

    private void d(com.autonavi.aps.amapapi.model.a r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.f5676j = r1
        L4:
            return
    }

    private void i() {
            r6 = this;
            com.autonavi.aps.amapapi.trans.c r0 = r6.n
            if (r0 == 0) goto L2a
            com.amap.api.location.AMapLocationClientOption r0 = r6.f5675i     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto Lf
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            r6.f5675i = r0     // Catch: java.lang.Throwable -> L2a
        Lf:
            int r0 = r6.j()     // Catch: java.lang.Throwable -> L2a
            com.autonavi.aps.amapapi.trans.c r1 = r6.n     // Catch: java.lang.Throwable -> L2a
            com.amap.api.location.AMapLocationClientOption r2 = r6.f5675i     // Catch: java.lang.Throwable -> L2a
            long r2 = r2.getHttpTimeOut()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.location.AMapLocationClientOption r4 = r6.f5675i     // Catch: java.lang.Throwable -> L2a
            com.amap.api.location.AMapLocationClientOption$AMapLocationProtocol r4 = r4.getLocationProtocol()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.location.AMapLocationClientOption$AMapLocationProtocol r5 = com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.HTTPS     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L2a
            r1.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    private int j() {
            r4 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r4.f5675i
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()
            r1 = 0
            if (r0 == 0) goto L23
            int[] r0 = com.autonavi.aps.amapapi.b.AnonymousClass1.a
            com.amap.api.location.AMapLocationClientOption r2 = r4.f5675i
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r2.getGeoLanguage()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L23
            r3 = 2
            if (r0 == r3) goto L22
            r2 = 3
            if (r0 == r2) goto L21
            return r1
        L21:
            return r3
        L22:
            return r2
        L23:
            return r1
    }

    private void k() {
            r6 = this;
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            r1 = 1
            com.amap.api.location.AMapLocationClientOption r2 = r6.f5675i     // Catch: java.lang.Throwable -> L46
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r2.getGeoLanguage()     // Catch: java.lang.Throwable -> L46
            com.amap.api.location.AMapLocationClientOption r2 = r6.f5675i     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.isNeedAddress()     // Catch: java.lang.Throwable -> L46
            com.amap.api.location.AMapLocationClientOption r3 = r6.f5675i     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.isOffset()     // Catch: java.lang.Throwable -> L44
            com.amap.api.location.AMapLocationClientOption r4 = r6.f5675i     // Catch: java.lang.Throwable -> L43
            boolean r1 = r4.isLocationCacheEnable()     // Catch: java.lang.Throwable -> L43
            com.amap.api.location.AMapLocationClientOption r4 = r6.f5675i     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isOnceLocationLatest()     // Catch: java.lang.Throwable -> L3f
            r6.t = r4     // Catch: java.lang.Throwable -> L3f
            com.amap.api.location.AMapLocationClientOption r4 = r6.f5675i     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isSensorEnable()     // Catch: java.lang.Throwable -> L3f
            r6.z = r4     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r6.q     // Catch: java.lang.Throwable -> L3f
            if (r3 != r4) goto L3b
            boolean r4 = r6.p     // Catch: java.lang.Throwable -> L3f
            if (r2 != r4) goto L3b
            boolean r4 = r6.s     // Catch: java.lang.Throwable -> L3f
            if (r1 != r4) goto L3b
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r4 = r6.r     // Catch: java.lang.Throwable -> L3f
            if (r0 == r4) goto L4b
        L3b:
            r6.s()     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3f:
            r5 = r3
            r3 = r1
            r1 = r5
            goto L48
        L43:
            r1 = r3
        L44:
            r3 = 1
            goto L48
        L46:
            r2 = 1
            goto L44
        L48:
            r5 = r3
            r3 = r1
            r1 = r5
        L4b:
            r6.q = r3
            r6.p = r2
            r6.s = r1
            r6.r = r0
            return
    }

    private void l() {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            com.autonavi.aps.amapapi.b$a r2 = r4.f5674h     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r1.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L12
        Lf:
            r4.f5674h = r0
            goto L1a
        L12:
            java.lang.String r2 = "Aps"
            java.lang.String r3 = "destroy"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            goto Lf
        L1a:
            com.autonavi.aps.amapapi.restruct.e r0 = r4.f5670d
            if (r0 == 0) goto L23
            boolean r1 = r4.F
            r0.a(r1)
        L23:
            com.autonavi.aps.amapapi.restruct.k r0 = r4.f5669c
            if (r0 == 0) goto L2c
            boolean r1 = r4.F
            r0.c(r1)
        L2c:
            return
        L2d:
            r1 = move-exception
            r4.f5674h = r0
            throw r1
    }

    private void m() {
            r3 = this;
            com.autonavi.aps.amapapi.b$a r0 = r3.f5674h     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            com.autonavi.aps.amapapi.b$a r0 = new com.autonavi.aps.amapapi.b$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc
            r3.f5674h = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L2f
        Le:
            android.content.IntentFilter r0 = r3.G     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L25
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r3.G = r0     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "android.net.wifi.WIFI_STATE_CHANGED"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> Lc
            android.content.IntentFilter r0 = r3.G     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "android.net.wifi.SCAN_RESULTS"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> Lc
        L25:
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> Lc
            com.autonavi.aps.amapapi.b$a r1 = r3.f5674h     // Catch: java.lang.Throwable -> Lc
            android.content.IntentFilter r2 = r3.G     // Catch: java.lang.Throwable -> Lc
            r0.registerReceiver(r1, r2)     // Catch: java.lang.Throwable -> Lc
            return
        L2f:
            java.lang.String r1 = "Aps"
            java.lang.String r2 = "initBroadcastListener"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private byte[] n() throws java.lang.Throwable {
            r10 = this;
            com.autonavi.aps.amapapi.trans.f r0 = r10.l
            if (r0 != 0) goto Lb
            com.autonavi.aps.amapapi.trans.f r0 = new com.autonavi.aps.amapapi.trans.f
            r0.<init>()
            r10.l = r0
        Lb:
            com.amap.api.location.AMapLocationClientOption r0 = r10.f5675i
            if (r0 != 0) goto L16
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r10.f5675i = r0
        L16:
            com.autonavi.aps.amapapi.restruct.e r0 = r10.f5670d
            if (r0 == 0) goto L3b
            com.autonavi.aps.amapapi.restruct.k r0 = r10.f5669c
            if (r0 == 0) goto L3b
            com.autonavi.aps.amapapi.trans.f r1 = r10.l
            android.content.Context r2 = r10.a
            com.amap.api.location.AMapLocationClientOption r0 = r10.f5675i
            boolean r3 = r0.isNeedAddress()
            com.amap.api.location.AMapLocationClientOption r0 = r10.f5675i
            boolean r4 = r0.isOffset()
            com.autonavi.aps.amapapi.restruct.e r5 = r10.f5670d
            com.autonavi.aps.amapapi.restruct.k r6 = r10.f5669c
            android.net.ConnectivityManager r7 = r10.f5668b
            java.lang.String r8 = r10.C
            com.autonavi.aps.amapapi.restruct.g r9 = r10.O
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
        L3b:
            com.autonavi.aps.amapapi.trans.f r0 = r10.l
            byte[] r0 = r0.a()
            return r0
    }

    private boolean o() {
            r6 = this;
            long r0 = r6.f5677k
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto La
            return r4
        La:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r6.f5677k
            long r0 = r0 - r2
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L18
            return r4
        L18:
            r0 = 0
            return r0
    }

    private void p() {
            r2 = this;
            com.autonavi.aps.amapapi.restruct.k r0 = r2.f5669c
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.m
            r0.a(r1)
            return
    }

    private boolean q() {
            r1 = this;
            com.autonavi.aps.amapapi.restruct.k r0 = r1.f5669c
            if (r0 == 0) goto La
            java.util.ArrayList r0 = r0.e()
            r1.f5673g = r0
        La:
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.f5673g
            if (r0 == 0) goto L16
            int r0 = r0.size()
            if (r0 <= 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    private void r() {
            r3 = this;
            java.lang.String r0 = r3.L
            if (r0 == 0) goto L7
            r0 = 0
            r3.L = r0
        L7:
            java.lang.StringBuilder r0 = r3.u
            if (r0 == 0) goto L13
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L13:
            return
    }

    private void s() {
            r3 = this;
            com.autonavi.aps.amapapi.storage.a r0 = r3.f5671e     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.a()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r0 = move-exception
            goto L19
        La:
            r0 = 0
            r3.d(r0)     // Catch: java.lang.Throwable -> L8
            r0 = 0
            r3.M = r0     // Catch: java.lang.Throwable -> L8
            com.autonavi.aps.amapapi.filters.a r0 = r3.B     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L18
            r0.a()     // Catch: java.lang.Throwable -> L8
        L18:
            return
        L19:
            java.lang.String r1 = "Aps"
            java.lang.String r2 = "cleanCache"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final com.autonavi.aps.amapapi.model.a a(double r7, double r9) {
            r6 = this;
            com.autonavi.aps.amapapi.trans.c r0 = r6.n     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L1f
            r2 = r7
            r4 = r9
            java.lang.String r7 = r0.a(r1, r2, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = "\"status\":\"1\""
            boolean r8 = r7.contains(r8)     // Catch: java.lang.Throwable -> L1f
            if (r8 == 0) goto L1f
            com.autonavi.aps.amapapi.trans.e r8 = r6.f5672f     // Catch: java.lang.Throwable -> L1f
            com.autonavi.aps.amapapi.model.a r7 = r8.a(r7)     // Catch: java.lang.Throwable -> L1f
            r7.setLatitude(r2)     // Catch: java.lang.Throwable -> L1f
            r7.setLongitude(r4)     // Catch: java.lang.Throwable -> L1f
            return r7
        L1f:
            r7 = 0
            return r7
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.a r18) throws java.lang.Throwable {
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = "Aps"
            r1.d()
            java.lang.String r0 = "conitue"
            r2.e(r0)
            android.content.Context r0 = r1.a
            r4 = 1
            if (r0 != 0) goto L2a
            java.lang.String r0 = "#0101"
            r2.f(r0)
            java.lang.StringBuilder r0 = r1.o
            java.lang.String r2 = "context is null#0101"
            r0.append(r2)
            java.lang.StringBuilder r0 = r1.o
            java.lang.String r0 = r0.toString()
            com.autonavi.aps.amapapi.model.a r0 = a(r4, r0)
            return r0
        L2a:
            int r0 = r1.I
            int r0 = r0 + r4
            r1.I = r0
            if (r0 != r4) goto L34
            r1.p()
        L34:
            long r5 = r1.f5677k
            boolean r0 = r1.a(r5)
            r5 = 2
            if (r0 == 0) goto L5d
            com.autonavi.aps.amapapi.model.a r0 = r1.f5676j
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r0 == 0) goto L5d
            boolean r0 = r1.s
            if (r0 == 0) goto L5a
            com.autonavi.aps.amapapi.model.a r0 = r1.f5676j
            long r2 = r0.getTime()
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a(r2)
            if (r0 == 0) goto L5a
            com.autonavi.aps.amapapi.model.a r0 = r1.f5676j
            r0.setLocationType(r5)
        L5a:
            com.autonavi.aps.amapapi.model.a r0 = r1.f5676j
            return r0
        L5d:
            com.autonavi.aps.amapapi.restruct.b r0 = r1.y
            if (r0 == 0) goto L6c
            boolean r6 = r1.z
            if (r6 == 0) goto L69
            r0.a()
            goto L6c
        L69:
            r0.b()
        L6c:
            r6 = 0
            com.amap.api.location.AMapLocationClientOption r0 = r1.f5675i     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isOnceLocationLatest()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L82
            com.amap.api.location.AMapLocationClientOption r0 = r1.f5675i     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isOnceLocation()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L7e
            goto L82
        L7e:
            r0 = 0
            goto L83
        L80:
            r0 = move-exception
            goto L93
        L82:
            r0 = 1
        L83:
            com.autonavi.aps.amapapi.restruct.k r7 = r1.f5669c     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L98
            r7.b(r0)     // Catch: java.lang.Throwable -> L80
            com.autonavi.aps.amapapi.restruct.k r0 = r1.f5669c     // Catch: java.lang.Throwable -> L80
            java.util.ArrayList r0 = r0.e()     // Catch: java.lang.Throwable -> L80
            r1.f5673g = r0     // Catch: java.lang.Throwable -> L80
            goto L98
        L93:
            java.lang.String r7 = "getLocation getScanResultsParam"
            com.autonavi.aps.amapapi.utils.b.a(r0, r3, r7)
        L98:
            com.autonavi.aps.amapapi.restruct.e r0 = r1.f5670d     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto Laa
            boolean r7 = r1.q()     // Catch: java.lang.Throwable -> La4
            r0.a(r6, r7)     // Catch: java.lang.Throwable -> La4
            goto Laa
        La4:
            r0 = move-exception
            java.lang.String r7 = "getLocation getCgiListParam"
            com.autonavi.aps.amapapi.utils.b.a(r0, r3, r7)
        Laa:
            java.lang.String r0 = r17.c(r18)
            r1.L = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc3
            int r0 = r1.x
            java.lang.StringBuilder r2 = r1.o
            java.lang.String r2 = r2.toString()
            com.autonavi.aps.amapapi.model.a r0 = a(r0, r2)
            return r0
        Lc3:
            java.lang.StringBuilder r0 = r1.u
            java.lang.StringBuilder r0 = r1.a(r0)
            r1.u = r0
            com.autonavi.aps.amapapi.restruct.k r0 = r1.f5669c
            r3 = 4
            if (r0 == 0) goto Lea
            boolean r0 = r0.n()
            if (r0 == 0) goto Lea
            r0 = 15
            java.lang.String r5 = "networkLocation has been mocked!#1502"
            com.autonavi.aps.amapapi.model.a r0 = a(r0, r5)
            java.lang.String r5 = "#1502"
            r2.f(r5)
            r0.setMock(r4)
            r0.setTrustedLevel(r3)
            return r0
        Lea:
            boolean r9 = r1.o()
            com.autonavi.aps.amapapi.restruct.e r8 = r1.f5670d
            r0 = 0
            if (r8 == 0) goto L107
            com.autonavi.aps.amapapi.restruct.k r11 = r1.f5669c
            if (r11 == 0) goto L107
            com.autonavi.aps.amapapi.storage.a r7 = r1.f5671e
            com.autonavi.aps.amapapi.model.a r10 = r1.f5676j
            java.lang.StringBuilder r12 = r1.u
            java.lang.String r13 = r1.L
            android.content.Context r14 = r1.a
            r15 = 0
            com.autonavi.aps.amapapi.model.a r7 = r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L108
        L107:
            r7 = r0
        L108:
            boolean r8 = com.autonavi.aps.amapapi.utils.j.a(r7)
            if (r8 == 0) goto L116
            r7.setTrustedLevel(r5)
            r1.d(r7)
        L114:
            r11 = r7
            goto L16c
        L116:
            com.autonavi.aps.amapapi.model.a r7 = r1.b(r4, r2)
            boolean r8 = com.autonavi.aps.amapapi.utils.j.a(r7)
            if (r8 == 0) goto L141
            java.lang.String r0 = "new"
            r7.e(r0)
            com.autonavi.aps.amapapi.storage.a r0 = r1.f5671e
            java.lang.StringBuilder r2 = r1.u
            java.lang.String r2 = r2.toString()
            r0.a(r2)
            com.autonavi.aps.amapapi.restruct.e r0 = r1.f5670d
            if (r0 == 0) goto L13d
            com.autonavi.aps.amapapi.storage.a r2 = r1.f5671e
            com.autonavi.aps.amapapi.restruct.d r0 = r0.e()
            r2.a(r0)
        L13d:
            r1.d(r7)
            goto L114
        L141:
            com.autonavi.aps.amapapi.restruct.e r9 = r1.f5670d
            if (r9 == 0) goto L15a
            com.autonavi.aps.amapapi.restruct.k r12 = r1.f5669c
            if (r12 == 0) goto L15a
            com.autonavi.aps.amapapi.storage.a r8 = r1.f5671e
            com.autonavi.aps.amapapi.model.a r11 = r1.f5676j
            java.lang.StringBuilder r13 = r1.u
            java.lang.String r14 = r1.L
            android.content.Context r15 = r1.a
            r16 = 1
            r10 = 0
            com.autonavi.aps.amapapi.model.a r0 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16)
        L15a:
            boolean r8 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r8 == 0) goto L114
            java.lang.String r7 = "#0001"
            r2.f(r7)
            r0.setTrustedLevel(r5)
            r1.d(r0)
            r11 = r0
        L16c:
            com.autonavi.aps.amapapi.restruct.k r0 = r1.f5669c     // Catch: java.lang.Throwable -> L180
            if (r0 == 0) goto L19a
            if (r11 == 0) goto L19a
            long r7 = com.autonavi.aps.amapapi.restruct.k.b()     // Catch: java.lang.Throwable -> L180
            r9 = 15
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L182
            r11.setTrustedLevel(r4)     // Catch: java.lang.Throwable -> L180
            goto L19a
        L180:
            goto L19a
        L182:
            r9 = 120(0x78, double:5.93E-322)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L18c
            r11.setTrustedLevel(r5)     // Catch: java.lang.Throwable -> L180
            goto L19a
        L18c:
            r4 = 600(0x258, double:2.964E-321)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L197
            r0 = 3
            r11.setTrustedLevel(r0)     // Catch: java.lang.Throwable -> L180
            goto L19a
        L197:
            r11.setTrustedLevel(r3)     // Catch: java.lang.Throwable -> L180
        L19a:
            com.autonavi.aps.amapapi.storage.a r8 = r1.f5671e
            java.lang.String r9 = r1.L
            java.lang.StringBuilder r10 = r1.u
            android.content.Context r12 = r1.a
            r13 = 1
            r8.a(r9, r10, r11, r12, r13)
            com.autonavi.aps.amapapi.utils.j.a(r11)
            java.lang.StringBuilder r0 = r1.u
            int r2 = r0.length()
            r0.delete(r6, r2)
            if (r11 == 0) goto L1e3
            boolean r0 = r1.z
            if (r0 == 0) goto L1d7
            com.autonavi.aps.amapapi.restruct.b r0 = r1.y
            if (r0 == 0) goto L1d7
            double r2 = r0.c()
            r11.setAltitude(r2)
            com.autonavi.aps.amapapi.restruct.b r0 = r1.y
            float r0 = r0.d()
            r11.setBearing(r0)
            com.autonavi.aps.amapapi.restruct.b r0 = r1.y
            double r2 = r0.e()
            float r0 = (float) r2
            r11.setSpeed(r0)
            goto L1e3
        L1d7:
            r2 = 0
            r11.setAltitude(r2)
            r0 = 0
            r11.setBearing(r0)
            r11.setSpeed(r0)
        L1e3:
            r1.d(r11)
            com.autonavi.aps.amapapi.model.a r0 = r1.f5676j
            return r0
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a r3) {
            r2 = this;
            com.autonavi.aps.amapapi.filters.a r0 = r2.B
            boolean r1 = r2.s
            r0.a(r1)
            com.autonavi.aps.amapapi.filters.a r0 = r2.B
            com.autonavi.aps.amapapi.model.a r3 = r0.a(r3)
            return r3
    }

    public final com.autonavi.aps.amapapi.model.a a(boolean r3, com.autonavi.aps.amapapi.a r4) {
            r2 = this;
            if (r3 == 0) goto L8
            java.lang.String r0 = "statics"
            r4.e(r0)
            goto Ld
        L8:
            java.lang.String r0 = "first"
            r4.e(r0)
        Ld:
            android.content.Context r0 = r2.a
            r1 = 1
            if (r0 != 0) goto L2f
            java.lang.String r3 = "#0101"
            r4.f(r3)
            java.lang.StringBuilder r3 = r2.o
            java.lang.String r4 = "context is null#0101"
            r3.append(r4)
            r3 = 0
            r4 = 2011(0x7db, float:2.818E-42)
            com.autonavi.aps.amapapi.utils.h.a(r3, r4)
            java.lang.StringBuilder r3 = r2.o
            java.lang.String r3 = r3.toString()
            com.autonavi.aps.amapapi.model.a r3 = a(r1, r3)
            return r3
        L2f:
            com.autonavi.aps.amapapi.restruct.k r0 = r2.f5669c
            if (r0 == 0) goto L47
            boolean r0 = r0.n()
            if (r0 == 0) goto L47
            java.lang.String r3 = "#1502"
            r4.f(r3)
            r3 = 15
            java.lang.String r4 = "networkLocation has been mocked!#1502"
            com.autonavi.aps.amapapi.model.a r3 = a(r3, r4)
            return r3
        L47:
            r2.b()
            java.lang.String r0 = r2.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5f
            int r3 = r2.x
            java.lang.StringBuilder r4 = r2.o
            java.lang.String r4 = r4.toString()
            com.autonavi.aps.amapapi.model.a r3 = a(r3, r4)
            return r3
        L5f:
            com.autonavi.aps.amapapi.model.a r3 = r2.b(r3, r4)
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r3)
            if (r4 == 0) goto L88
            boolean r4 = com.autonavi.aps.amapapi.b.Q
            if (r4 != 0) goto L88
            com.autonavi.aps.amapapi.storage.a r4 = r2.f5671e
            java.lang.StringBuilder r0 = r2.u
            java.lang.String r0 = r0.toString()
            r4.a(r0)
            com.autonavi.aps.amapapi.restruct.e r4 = r2.f5670d
            if (r4 == 0) goto L85
            com.autonavi.aps.amapapi.storage.a r0 = r2.f5671e
            com.autonavi.aps.amapapi.restruct.d r4 = r4.e()
            r0.a(r4)
        L85:
            r2.d(r3)
        L88:
            com.autonavi.aps.amapapi.b.Q = r1
            return r3
    }

    public final void a() {
            r1 = this;
            com.autonavi.aps.amapapi.restruct.e r0 = r1.f5670d
            if (r0 == 0) goto L7
            r0.b()
        L7:
            return
    }

    public final void a(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L5
            goto L63
        L5:
            com.autonavi.aps.amapapi.filters.a r0 = new com.autonavi.aps.amapapi.filters.a     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            r4.B = r0     // Catch: java.lang.Throwable -> L33
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L33
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L33
            r4.a = r0     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.utils.j.b(r0)     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.restruct.k r0 = r4.f5669c     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L35
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.restruct.k r1 = new com.autonavi.aps.amapapi.restruct.k     // Catch: java.lang.Throwable -> L33
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L33
            android.os.Handler r3 = r4.N     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L33
            r4.f5669c = r1     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r5 = move-exception
            goto L64
        L35:
            com.autonavi.aps.amapapi.restruct.e r0 = r4.f5670d     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L44
            com.autonavi.aps.amapapi.restruct.e r0 = new com.autonavi.aps.amapapi.restruct.e     // Catch: java.lang.Throwable -> L33
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L33
            android.os.Handler r2 = r4.N     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            r4.f5670d = r0     // Catch: java.lang.Throwable -> L33
        L44:
            com.autonavi.aps.amapapi.restruct.g r0 = new com.autonavi.aps.amapapi.restruct.g     // Catch: java.lang.Throwable -> L33
            android.os.Handler r1 = r4.N     // Catch: java.lang.Throwable -> L33
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L33
            r4.O = r0     // Catch: java.lang.Throwable -> L33
            com.autonavi.aps.amapapi.storage.a r5 = r4.f5671e     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L58
            com.autonavi.aps.amapapi.storage.a r5 = new com.autonavi.aps.amapapi.storage.a     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r4.f5671e = r5     // Catch: java.lang.Throwable -> L33
        L58:
            com.autonavi.aps.amapapi.trans.e r5 = r4.f5672f     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L63
            com.autonavi.aps.amapapi.trans.e r5 = new com.autonavi.aps.amapapi.trans.e     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r4.f5672f = r5     // Catch: java.lang.Throwable -> L33
        L63:
            return
        L64:
            java.lang.String r0 = "Aps"
            java.lang.String r1 = "initBase"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    public final void a(android.os.Handler r1) {
            r0 = this;
            r0.N = r1
            return
    }

    public final void a(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            int r0 = r4.getErrorCode()
            if (r0 == 0) goto L7
            goto L37
        L7:
            com.autonavi.aps.amapapi.restruct.f r0 = new com.autonavi.aps.amapapi.restruct.f
            r0.<init>()
            int r1 = r4.getLocationType()
            r0.a = r1
            long r1 = r4.getTime()
            r0.f5757d = r1
            float r1 = r4.getAccuracy()
            int r1 = (int) r1
            r0.f5758e = r1
            double r1 = r4.getLatitude()
            r0.f5755b = r1
            double r1 = r4.getLongitude()
            r0.f5756c = r1
            int r4 = r4.getLocationType()
            r1 = 1
            if (r4 != r1) goto L37
            com.autonavi.aps.amapapi.restruct.g r4 = r3.O
            r4.a(r0)
        L37:
            return
    }

    public final void a(com.amap.api.location.AMapLocationClientOption r8) {
            r7 = this;
            r7.f5675i = r8
            if (r8 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r7.f5675i = r0
        Lb:
            com.autonavi.aps.amapapi.restruct.k r1 = r7.f5669c
            if (r1 == 0) goto L2b
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            r0.isWifiActiveScan()
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            boolean r2 = r0.isWifiScan()
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            boolean r3 = r0.isMockEnable()
            boolean r4 = com.amap.api.location.AMapLocationClientOption.isOpenAlwaysScanWifi()
            long r5 = r8.getScanWifiInterval()
            r1.a(r2, r3, r4, r5)
        L2b:
            r7.i()
            com.autonavi.aps.amapapi.storage.a r8 = r7.f5671e
            if (r8 == 0) goto L37
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            r8.a(r0)
        L37:
            com.autonavi.aps.amapapi.trans.e r8 = r7.f5672f
            if (r8 == 0) goto L40
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            r8.a(r0)
        L40:
            com.autonavi.aps.amapapi.restruct.e r8 = r7.f5670d
            if (r8 == 0) goto L4d
            com.amap.api.location.AMapLocationClientOption r0 = r7.f5675i
            boolean r0 = r0.isNoLocReqCgiEnable()
            r8.c(r0)
        L4d:
            r7.k()
            return
    }

    public final void a(com.autonavi.aps.amapapi.model.a r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L9
        L3:
            int r0 = r4.getErrorCode()
            if (r0 == 0) goto La
        L9:
            return
        La:
            com.autonavi.aps.amapapi.restruct.f r0 = new com.autonavi.aps.amapapi.restruct.f
            r0.<init>()
            long r1 = r4.getTime()
            r0.f5757d = r1
            float r1 = r4.getAccuracy()
            int r1 = (int) r1
            r0.f5758e = r1
            double r1 = r4.getLatitude()
            r0.f5755b = r1
            double r1 = r4.getLongitude()
            r0.f5756c = r1
            r0.a = r5
            java.lang.String r5 = r4.d()
            int r5 = java.lang.Integer.parseInt(r5)
            r0.f5760g = r5
            int r4 = r4.l()
            r0.f5761h = r4
            com.autonavi.aps.amapapi.restruct.g r4 = r3.O
            r4.b(r0)
            return
    }

    public final void a(boolean r2) {
            r1 = this;
            com.autonavi.aps.amapapi.restruct.e r0 = r1.f5670d
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public final com.autonavi.aps.amapapi.model.a b(boolean r7) {
            r6 = this;
            com.autonavi.aps.amapapi.restruct.k r0 = r6.f5669c
            if (r0 == 0) goto L13
            boolean r0 = r0.n()
            if (r0 == 0) goto L13
            r7 = 15
            java.lang.String r0 = "networkLocation has been mocked!#1502"
            com.autonavi.aps.amapapi.model.a r7 = a(r7, r0)
            return r7
        L13:
            java.lang.String r0 = r6.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L28
            int r7 = r6.x
            java.lang.StringBuilder r0 = r6.o
            java.lang.String r0 = r0.toString()
            com.autonavi.aps.amapapi.model.a r7 = a(r7, r0)
            return r7
        L28:
            com.autonavi.aps.amapapi.storage.a r0 = r6.f5671e
            android.content.Context r1 = r6.a
            java.lang.String r2 = r6.L
            java.lang.StringBuilder r3 = r6.u
            r4 = 1
            r5 = r7
            com.autonavi.aps.amapapi.model.a r7 = r0.a(r1, r2, r3, r4, r5)
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r7)
            if (r0 == 0) goto L3f
            r6.d(r7)
        L3f:
            return r7
    }

    public final void b() {
            r2 = this;
            android.content.Context r0 = r2.a
            com.autonavi.aps.amapapi.trans.c r0 = com.autonavi.aps.amapapi.trans.c.a(r0)
            r2.n = r0
            r2.i()
            android.net.ConnectivityManager r0 = r2.f5668b
            if (r0 != 0) goto L1b
            android.content.Context r0 = r2.a
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r2.f5668b = r0
        L1b:
            com.autonavi.aps.amapapi.trans.f r0 = r2.l
            if (r0 != 0) goto L26
            com.autonavi.aps.amapapi.trans.f r0 = new com.autonavi.aps.amapapi.trans.f
            r0.<init>()
            r2.l = r0
        L26:
            return
    }

    public final void b(com.autonavi.aps.amapapi.a r4) {
            r3 = this;
            r0 = 1
            boolean r1 = r3.v     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L6
            return
        L6:
            r3.r()     // Catch: java.lang.Throwable -> L11
            boolean r1 = r3.t     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r3.m()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L44
        L13:
            com.autonavi.aps.amapapi.restruct.k r1 = r3.f5669c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L24
            boolean r2 = r3.t     // Catch: java.lang.Throwable -> L11
            r1.b(r2)     // Catch: java.lang.Throwable -> L11
            com.autonavi.aps.amapapi.restruct.k r1 = r3.f5669c     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList r1 = r1.e()     // Catch: java.lang.Throwable -> L11
            r3.f5673g = r1     // Catch: java.lang.Throwable -> L11
        L24:
            com.autonavi.aps.amapapi.restruct.e r1 = r3.f5670d     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L2f
            boolean r2 = r3.q()     // Catch: java.lang.Throwable -> L11
            r1.a(r0, r2)     // Catch: java.lang.Throwable -> L11
        L2f:
            java.lang.String r4 = r3.c(r4)     // Catch: java.lang.Throwable -> L11
            r3.L = r4     // Catch: java.lang.Throwable -> L11
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L4b
            java.lang.StringBuilder r4 = r3.u     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L11
            r3.u = r4     // Catch: java.lang.Throwable -> L11
            goto L4b
        L44:
            java.lang.String r1 = "Aps"
            java.lang.String r2 = "initFirstLocateParam"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r2)
        L4b:
            r3.v = r0
            return
    }

    public final void b(com.autonavi.aps.amapapi.model.a r8) {
            r7 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r8)
            if (r0 == 0) goto L13
            com.autonavi.aps.amapapi.storage.a r1 = r7.f5671e
            java.lang.String r2 = r7.L
            java.lang.StringBuilder r3 = r7.u
            android.content.Context r5 = r7.a
            r6 = 1
            r4 = r8
            r1.a(r2, r3, r4, r5, r6)
        L13:
            return
    }

    public final void c() {
            r3 = this;
            com.autonavi.aps.amapapi.restruct.b r0 = r3.y
            if (r0 != 0) goto Ld
            com.autonavi.aps.amapapi.restruct.b r0 = new com.autonavi.aps.amapapi.restruct.b
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            r3.y = r0
        Ld:
            r3.m()
            com.autonavi.aps.amapapi.restruct.k r0 = r3.f5669c
            r1 = 0
            if (r0 == 0) goto L20
            r0.b(r1)
            com.autonavi.aps.amapapi.restruct.k r0 = r3.f5669c
            java.util.ArrayList r0 = r0.e()
            r3.f5673g = r0
        L20:
            com.autonavi.aps.amapapi.restruct.e r0 = r3.f5670d
            if (r0 == 0) goto L2b
            boolean r2 = r3.q()
            r0.a(r1, r2)
        L2b:
            com.autonavi.aps.amapapi.storage.a r0 = r3.f5671e
            android.content.Context r1 = r3.a
            r0.a(r1)
            android.content.Context r0 = r3.a
            r3.b(r0)
            r0 = 1
            r3.w = r0
            return
    }

    public final void d() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.o
            int r0 = r0.length()
            if (r0 <= 0) goto L12
            java.lang.StringBuilder r0 = r3.o
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L12:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void e() {
            r3 = this;
            r0 = 0
            r3.C = r0
            r1 = 0
            r3.v = r1
            r3.w = r1
            com.autonavi.aps.amapapi.storage.a r1 = r3.f5671e
            if (r1 == 0) goto L11
            android.content.Context r2 = r3.a
            r1.b(r2)
        L11:
            com.autonavi.aps.amapapi.filters.a r1 = r3.B
            if (r1 == 0) goto L18
            r1.a()
        L18:
            com.autonavi.aps.amapapi.trans.e r1 = r3.f5672f
            if (r1 == 0) goto L1e
            r3.f5672f = r0
        L1e:
            com.autonavi.aps.amapapi.restruct.g r1 = r3.O
            if (r1 == 0) goto L27
            boolean r2 = r3.F
            r1.a(r2)
        L27:
            r3.l()
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r3.f5673g
            if (r1 == 0) goto L31
            r1.clear()
        L31:
            com.autonavi.aps.amapapi.restruct.b r1 = r3.y
            if (r1 == 0) goto L38
            r1.f()
        L38:
            r3.f5676j = r0
            r3.a = r0
            r3.u = r0
            r3.H = r0
            return
    }

    public final void f() {
            r1 = this;
            com.autonavi.aps.amapapi.c r0 = r1.R
            if (r0 == 0) goto L7
            r0.d()
        L7:
            return
    }

    public final void g() {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L5
            goto L24
        L5:
            com.autonavi.aps.amapapi.c r0 = r4.R     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            com.autonavi.aps.amapapi.c r0 = new com.autonavi.aps.amapapi.c     // Catch: java.lang.Throwable -> L13
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            r4.R = r0     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L25
        L15:
            com.autonavi.aps.amapapi.restruct.e r0 = r4.f5670d     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L24
            com.autonavi.aps.amapapi.restruct.k r1 = r4.f5669c     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L24
            com.autonavi.aps.amapapi.c r2 = r4.R     // Catch: java.lang.Throwable -> L13
            android.os.Handler r3 = r4.N     // Catch: java.lang.Throwable -> L13
            r2.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L13
        L24:
            return
        L25:
            java.lang.String r1 = "as"
            java.lang.String r2 = "stc"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final void h() {
            r1 = this;
            com.autonavi.aps.amapapi.c r0 = r1.R
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }
}
