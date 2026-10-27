package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v5 {
    static com.amap.api.location.AMapLocation D;
    static long E;
    static java.lang.Object F;
    static long G;
    static boolean H;
    static boolean I;
    public static volatile com.amap.api.location.AMapLocation J;
    private boolean A;
    private int B;
    private boolean C;
    android.os.Handler a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4051b;

    /* renamed from: c, reason: collision with root package name */
    android.location.LocationManager f4052c;

    /* renamed from: d, reason: collision with root package name */
    com.amap.api.location.AMapLocationClientOption f4053d;

    /* renamed from: e, reason: collision with root package name */
    private long f4054e;

    /* renamed from: f, reason: collision with root package name */
    long f4055f;

    /* renamed from: g, reason: collision with root package name */
    boolean f4056g;

    /* renamed from: h, reason: collision with root package name */
    private int f4057h;

    /* renamed from: i, reason: collision with root package name */
    com.autonavi.aps.amapapi.filters.a f4058i;

    /* renamed from: j, reason: collision with root package name */
    int f4059j;

    /* renamed from: k, reason: collision with root package name */
    int f4060k;
    com.amap.api.location.AMapLocation l;
    long m;
    float n;
    java.lang.Object o;
    java.lang.Object p;
    private int q;
    private android.location.GpsStatus r;
    private android.location.GpsStatus.Listener s;
    private android.location.GnssStatus.Callback t;
    com.amap.api.location.AMapLocationClientOption.GeoLanguage u;
    boolean v;
    long w;
    int x;
    android.location.LocationListener y;
    private java.lang.String z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends android.location.GnssStatus.Callback {
        final /* synthetic */ com.amap.api.col.p0003l.v5 a;

        a(com.amap.api.col.p0003l.v5 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int r1) {
                r0 = this;
                com.amap.api.col.p0003l.v5.I()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                com.amap.api.col.3l.v5 r0 = r1.a
                com.amap.api.col.p0003l.v5.k(r0, r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
                r0 = this;
                com.amap.api.col.p0003l.v5.H()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
                r1 = this;
                com.amap.api.col.3l.v5 r0 = r1.a
                com.amap.api.col.p0003l.v5.i(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements android.location.GpsStatus.Listener {
        final /* synthetic */ com.amap.api.col.p0003l.v5 a;

        b(com.amap.api.col.p0003l.v5 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int r4) {
                r3 = this;
                com.amap.api.col.3l.v5 r0 = r3.a     // Catch: java.lang.Throwable -> L25
                android.location.LocationManager r1 = r0.f4052c     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L7
                goto L1e
            L7:
                android.location.GpsStatus r2 = com.amap.api.col.p0003l.v5.s(r0)     // Catch: java.lang.Throwable -> L25
                android.location.GpsStatus r1 = r1.getGpsStatus(r2)     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.p0003l.v5.a(r0, r1)     // Catch: java.lang.Throwable -> L25
                r0 = 1
                if (r4 == r0) goto L31
                r0 = 2
                if (r4 == r0) goto L2b
                r0 = 3
                if (r4 == r0) goto L27
                r0 = 4
                if (r4 == r0) goto L1f
            L1e:
                return
            L1f:
                com.amap.api.col.3l.v5 r4 = r3.a     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.p0003l.v5.y(r4)     // Catch: java.lang.Throwable -> L25
                return
            L25:
                r4 = move-exception
                goto L35
            L27:
                com.amap.api.col.p0003l.v5.I()     // Catch: java.lang.Throwable -> L25
                return
            L2b:
                com.amap.api.col.3l.v5 r4 = r3.a     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.p0003l.v5.i(r4)     // Catch: java.lang.Throwable -> L25
                return
            L31:
                com.amap.api.col.p0003l.v5.H()     // Catch: java.lang.Throwable -> L25
                return
            L35:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "GpsLocation | onGpsStatusChanged error: "
                r0.<init>(r1)
                java.lang.String r1 = r4.getMessage()
                r0.append(r1)
                com.autonavi.aps.amapapi.utils.d.a()
                java.lang.String r0 = "GpsLocation"
                java.lang.String r1 = "onGpsStatusChanged"
                com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements android.location.LocationListener {
        private com.amap.api.col.p0003l.v5 a;

        c(com.amap.api.col.p0003l.v5 r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        final void a() {
                r1 = this;
                r0 = 0
                r1.a = r0
                return
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(android.location.Location r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                java.lang.String r1 = "tid="
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1c
                long r1 = r1.getId()     // Catch: java.lang.Throwable -> L1c
                r0.append(r1)     // Catch: java.lang.Throwable -> L1c
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.v5 r0 = r3.a     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L1c
                com.amap.api.col.p0003l.v5.l(r0, r4)     // Catch: java.lang.Throwable -> L1c
            L1c:
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(java.lang.String r2) {
                r1 = this;
                com.amap.api.col.3l.v5 r0 = r1.a     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L7
                com.amap.api.col.p0003l.v5.m(r0, r2)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                com.amap.api.col.3l.v5 r1 = r0.a     // Catch: java.lang.Throwable -> L7
                if (r1 == 0) goto L7
                com.amap.api.col.p0003l.v5.j(r1, r2)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.amap.api.col.p0003l.v5.F = r0
            return
    }

    public v5(android.content.Context r6, android.os.Handler r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f4054e = r0
            r5.f4055f = r0
            r2 = 0
            r5.f4056g = r2
            r5.f4057h = r2
            r3 = 0
            r5.f4058i = r3
            r4 = 240(0xf0, float:3.36E-43)
            r5.f4059j = r4
            r4 = 80
            r5.f4060k = r4
            r5.l = r3
            r5.m = r0
            r4 = 0
            r5.n = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r5.o = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r5.p = r4
            r5.q = r2
            r5.r = r3
            r5.s = r3
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r4 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            r5.u = r4
            r4 = 1
            r5.v = r4
            r5.w = r0
            r5.x = r2
            r5.y = r3
            r5.z = r3
            r5.A = r2
            r5.B = r2
            r5.C = r2
            r5.f4051b = r6
            r5.a = r7
            java.lang.String r7 = "location"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch: java.lang.Throwable -> L58
            android.location.LocationManager r6 = (android.location.LocationManager) r6     // Catch: java.lang.Throwable -> L58
            r5.f4052c = r6     // Catch: java.lang.Throwable -> L58
            goto L60
        L58:
            r6 = move-exception
            java.lang.String r7 = "GpsLocation"
            java.lang.String r0 = "<init>"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7, r0)
        L60:
            com.autonavi.aps.amapapi.filters.a r6 = new com.autonavi.aps.amapapi.filters.a
            r6.<init>()
            r5.f4058i = r6
            return
    }

    private void B(com.amap.api.location.AMapLocation r2) {
            r1 = this;
            android.os.Handler r0 = r1.a
            if (r0 == 0) goto L12
            android.os.Message r0 = android.os.Message.obtain()
            r0.obj = r2
            r2 = 2
            r0.what = r2
            android.os.Handler r2 = r1.a
            r2.sendMessage(r0)
        L12:
            return
    }

    private void D(com.amap.api.location.AMapLocation r9) {
            r8 = this;
            java.lang.String r0 = "WGS84"
            r1 = 0
            double r2 = r9.getLatitude()     // Catch: java.lang.Throwable -> L50
            double r4 = r9.getLongitude()     // Catch: java.lang.Throwable -> L50
            boolean r2 = com.autonavi.aps.amapapi.utils.b.a(r2, r4)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L49
            com.amap.api.location.AMapLocationClientOption r2 = r8.f4053d     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2.isOffset()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L49
            android.content.Context r2 = r8.f4051b     // Catch: java.lang.Throwable -> L50
            com.amap.api.location.DPoint r3 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> L50
            double r4 = r9.getLatitude()     // Catch: java.lang.Throwable -> L50
            double r6 = r9.getLongitude()     // Catch: java.lang.Throwable -> L50
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L50
            com.amap.api.location.DPoint r2 = com.autonavi.aps.amapapi.utils.e.a(r2, r3)     // Catch: java.lang.Throwable -> L50
            double r3 = r2.getLatitude()     // Catch: java.lang.Throwable -> L50
            r9.setLatitude(r3)     // Catch: java.lang.Throwable -> L50
            double r2 = r2.getLongitude()     // Catch: java.lang.Throwable -> L50
            r9.setLongitude(r2)     // Catch: java.lang.Throwable -> L50
            com.amap.api.location.AMapLocationClientOption r2 = r8.f4053d     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2.isOffset()     // Catch: java.lang.Throwable -> L50
            r9.setOffset(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "GCJ02"
            r9.setCoordType(r2)     // Catch: java.lang.Throwable -> L50
            return
        L49:
            r9.setOffset(r1)     // Catch: java.lang.Throwable -> L50
            r9.setCoordType(r0)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r9.setOffset(r1)
            r9.setCoordType(r0)
            return
    }

    private void E(com.amap.api.location.AMapLocation r3) {
            r2 = this;
            int r0 = r2.q     // Catch: java.lang.Throwable -> L15
            r1 = 4
            if (r0 < r1) goto La
            r0 = 1
            r3.setGpsAccuracyStatus(r0)     // Catch: java.lang.Throwable -> L15
            return
        La:
            if (r0 != 0) goto L11
            r0 = -1
            r3.setGpsAccuracyStatus(r0)     // Catch: java.lang.Throwable -> L15
            return
        L11:
            r0 = 0
            r3.setGpsAccuracyStatus(r0)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    private com.amap.api.location.AMapLocation G(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r4)
            if (r0 != 0) goto L7
            goto Lc
        L7:
            int r0 = r3.f4057h
            r1 = 3
            if (r0 >= r1) goto Ld
        Lc:
            return r4
        Ld:
            float r0 = r4.getAccuracy()
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L21
            float r0 = r4.getAccuracy()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
        L21:
            r4.setAccuracy(r2)
        L24:
            float r0 = r4.getSpeed()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L34
            float r0 = r4.getSpeed()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L37
        L34:
            r4.setSpeed(r2)
        L37:
            com.autonavi.aps.amapapi.filters.a r0 = r3.f4058i
            com.amap.api.location.AMapLocation r4 = r0.a(r4)
            return r4
    }

    static /* synthetic */ void H() {
            L()
            return
    }

    static /* synthetic */ void I() {
            N()
            return
    }

    private static void J(com.amap.api.location.AMapLocation r7) {
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r7)
            if (r0 != 0) goto L7
            goto L27
        L7:
            boolean r0 = com.autonavi.aps.amapapi.utils.a.s()
            if (r0 == 0) goto L27
            long r0 = r7.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = com.autonavi.aps.amapapi.utils.a.t()
            long r4 = com.autonavi.aps.amapapi.utils.c.a(r0, r2, r4)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L27
            r7.setTime(r4)
            com.autonavi.aps.amapapi.utils.h.a(r0, r2)
        L27:
            return
    }

    private void K() {
            r15 = this;
            android.location.LocationManager r0 = r15.f4052c
            if (r0 != 0) goto L6
            goto L108
        L6:
            r1 = 0
            r15.P()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r0 = 1
            r15.v = r0     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            if (r0 != 0) goto L19
            android.content.Context r0 = r15.f4051b     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.os.Looper r0 = r0.getMainLooper()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        L19:
            r8 = r0
            goto L23
        L1b:
            r0 = move-exception
            r9 = r15
            goto L11d
        L1f:
            r0 = move-exception
            r9 = r15
            goto L136
        L23:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r15.f4054e = r2     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.location.LocationManager r0 = r15.f4052c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            boolean r0 = r(r0)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            if (r0 == 0) goto L109
            long r2 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L6e
            long r4 = com.amap.api.col.p0003l.v5.G     // Catch: java.lang.Throwable -> L6e
            long r2 = r2 - r4
            r4 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L90
            android.content.Context r0 = r15.f4051b     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw=="
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r2)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L70
            android.location.LocationManager r0 = r15.f4052c     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "gps"
            java.lang.String r3 = "force_xtra_injection"
            r0.sendExtraCommand(r2, r3, r1)     // Catch: java.lang.Throwable -> L6e
            long r2 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L6e
            com.amap.api.col.p0003l.v5.G = r2     // Catch: java.lang.Throwable -> L6e
            android.content.Context r0 = r15.f4051b     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "pref"
            android.content.SharedPreferences$Editor r0 = com.autonavi.aps.amapapi.utils.i.a(r0, r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "lagt"
            long r3 = com.amap.api.col.p0003l.v5.G     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r0)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L6e
            goto L90
        L6e:
            r0 = move-exception
            goto L7f
        L70:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "n_alec"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "OPENSDK_GL"
            java.lang.String r3 = "rlu_n_alec"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L6e
            goto L90
        L7f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            java.lang.String r3 = "GpsLocation | sendExtraCommand error: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        L90:
            android.location.LocationListener r0 = r15.y     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            if (r0 != 0) goto L9b
            com.amap.api.col.3l.v5$c r0 = new com.amap.api.col.3l.v5$c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r15.y = r0     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        L9b:
            com.amap.api.location.AMapLocationClientOption r0 = r15.f4053d     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            if (r0 == 0) goto Lca
            com.amap.api.location.AMapLocationClientOption r0 = r15.f4053d     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            float r0 = r0.getDeviceModeDistanceFilter()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lca
            android.location.LocationManager r2 = r15.f4052c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            java.lang.String r3 = "gps"
            com.amap.api.location.AMapLocationClientOption r0 = r15.f4053d     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            long r4 = r0.getInterval()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.amap.api.location.AMapLocationClientOption r0 = r15.f4053d     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            float r6 = r0.getDeviceModeDistanceFilter()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.location.LocationListener r7 = r15.y     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r2.requestLocationUpdates(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            goto Ld6
        Lca:
            android.location.LocationManager r2 = r15.f4052c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            java.lang.String r3 = "gps"
            android.location.LocationListener r7 = r15.y     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r4 = 900(0x384, double:4.447E-321)
            r6 = 0
            r2.requestLocationUpdates(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        Ld6:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r2 = 24
            if (r0 < r2) goto Le9
            com.amap.api.col.3l.v5$a r0 = new com.amap.api.col.3l.v5$a     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r15.t = r0     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.location.LocationManager r2 = r15.f4052c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.amap.api.col.p0003l.u5.a(r2, r0)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            goto Lf8
        Le9:
            com.amap.api.col.3l.v5$b r0 = new com.amap.api.col.3l.v5$b     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r15.s = r0     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            android.location.LocationManager r2 = r15.f4052c     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r2.addGpsStatusListener(r0)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        Lf8:
            java.lang.String r6 = "no enough satellites#1401"
            com.amap.api.location.AMapLocationClientOption r0 = r15.f4053d     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            long r7 = r0.getHttpTimeOut()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            r4 = 8
            r5 = 14
            r3 = r15
            r3.e(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
        L108:
            return
        L109:
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1f
            java.lang.String r12 = "no gps provider#1402"
            r13 = 0
            r10 = 8
            r11 = 14
            r9 = r15
            r9.e(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L119 java.lang.SecurityException -> L11b
            return
        L119:
            r0 = move-exception
            goto L11d
        L11b:
            r0 = move-exception
            goto L136
        L11d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GpsLocation | requestLocationUpdates error: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            com.autonavi.aps.amapapi.utils.d.a()
            java.lang.String r1 = "GpsLocation"
            java.lang.String r2 = "requestLocationUpdates part2"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
        L136:
            com.autonavi.aps.amapapi.utils.d.a()
            r2 = 0
            r9.v = r2
            r2 = 2121(0x849, float:2.972E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = "#1201"
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r13 = 0
            r10 = 2
            r11 = 12
            r9.e(r10, r11, r12, r13)
            return
    }

    private static void L() {
            com.autonavi.aps.amapapi.utils.d.a()
            return
    }

    private void M() {
            r1 = this;
            com.autonavi.aps.amapapi.utils.d.a()
            r0 = 0
            r1.q = r0
            return
    }

    private static void N() {
            com.autonavi.aps.amapapi.utils.d.a()
            return
    }

    private void O() {
            r4 = this;
            r0 = 0
            android.location.GpsStatus r1 = r4.r     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L34
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
            android.location.GpsStatus r2 = r4.r     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.getMaxSatellites()     // Catch: java.lang.Throwable -> L2c
        L15:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L34
            if (r0 >= r2) goto L34
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2c
            android.location.GpsSatellite r3 = (android.location.GpsSatellite) r3     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.usedInFix()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L15
            int r0 = r0 + 1
            goto L15
        L2c:
            r1 = move-exception
            java.lang.String r2 = "GpsLocation"
            java.lang.String r3 = "GPS_EVENT_SATELLITE_STATUS"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L34:
            r4.q = r0
            return
    }

    private void P() {
            r5 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.amap.api.col.p0003l.v5.E
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L31
            com.amap.api.location.AMapLocation r0 = com.amap.api.col.p0003l.v5.D
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r0 == 0) goto L31
            com.amap.api.location.AMapLocationClientOption r0 = r5.f4053d
            boolean r0 = r0.isMockEnable()
            if (r0 != 0) goto L26
            com.amap.api.location.AMapLocation r0 = com.amap.api.col.p0003l.v5.D
            boolean r0 = r0.isMock()
            if (r0 == 0) goto L26
            goto L31
        L26:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            r5.f4055f = r0
            com.amap.api.location.AMapLocation r0 = com.amap.api.col.p0003l.v5.D
            r5.z(r0)
        L31:
            return
    }

    private static boolean Q() {
            java.lang.String r0 = "KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "UaXNOYXZpU3RhcnRlZA=="
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)     // Catch: java.lang.Throwable -> L18
            r2 = 0
            java.lang.Object r0 = com.autonavi.aps.amapapi.utils.f.a(r0, r1, r2, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r0 = 0
            return r0
    }

    private com.amap.api.location.AMapLocation R() {
            r15 = this;
            r0 = 0
            com.amap.api.location.AMapLocation r1 = r15.l     // Catch: java.lang.Throwable -> Lf0
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> Lf0
            if (r1 != 0) goto La
            return r0
        La:
            boolean r1 = com.autonavi.aps.amapapi.utils.a.k()     // Catch: java.lang.Throwable -> Lf0
            if (r1 != 0) goto L11
            return r0
        L11:
            boolean r1 = Q()     // Catch: java.lang.Throwable -> Lf0
            if (r1 == 0) goto Lf0
            java.lang.String r1 = "KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="
            java.lang.String r1 = com.amap.api.col.p0003l.q4.u(r1)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r2 = "UZ2V0TmF2aUxvY2F0aW9u"
            java.lang.String r2 = com.amap.api.col.p0003l.q4.u(r2)     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r1 = com.autonavi.aps.amapapi.utils.f.a(r1, r2, r0, r0)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lf0
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r1 = "time"
            long r3 = r2.optLong(r1)     // Catch: java.lang.Throwable -> Lf0
            boolean r1 = r15.C     // Catch: java.lang.Throwable -> Lf0
            if (r1 != 0) goto L42
            r1 = 1
            r15.C = r1     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r1 = "useNaviLoc"
            java.lang.String r5 = "use NaviLoc"
            com.autonavi.aps.amapapi.utils.h.a(r1, r5)     // Catch: java.lang.Throwable -> Lf0
        L42:
            long r5 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> Lf0
            long r5 = r5 - r3
            r7 = 5500(0x157c, double:2.7174E-320)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto Lf0
            java.lang.String r1 = "lat"
            r5 = 0
            double r7 = r2.optDouble(r1, r5)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r1 = "lng"
            double r9 = r2.optDouble(r1, r5)     // Catch: java.lang.Throwable -> Lf0
            r1 = 0
            java.lang.String r11 = "accuracy"
            java.lang.String r12 = "0"
            java.lang.String r11 = r2.optString(r11, r12)     // Catch: java.lang.NumberFormatException -> L69 java.lang.Throwable -> Lf0
            float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.lang.NumberFormatException -> L69 java.lang.Throwable -> Lf0
            goto L6a
        L69:
            r11 = 0
        L6a:
            java.lang.String r12 = "altitude"
            double r5 = r2.optDouble(r12, r5)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r12 = "bearing"
            java.lang.String r13 = "0"
            java.lang.String r12 = r2.optString(r12, r13)     // Catch: java.lang.NumberFormatException -> L7d java.lang.Throwable -> Lf0
            float r12 = java.lang.Float.parseFloat(r12)     // Catch: java.lang.NumberFormatException -> L7d java.lang.Throwable -> Lf0
            goto L7e
        L7d:
            r12 = 0
        L7e:
            java.lang.String r13 = "speed"
            java.lang.String r14 = "0"
            java.lang.String r2 = r2.optString(r13, r14)     // Catch: java.lang.NumberFormatException -> L91 java.lang.Throwable -> Lf0
            float r1 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L91 java.lang.Throwable -> Lf0
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            r2 = 1108344832(0x42100000, float:36.0)
            float r1 = r1 / r2
        L91:
            com.amap.api.location.AMapLocation r2 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r13 = "lbs"
            r2.<init>(r13)     // Catch: java.lang.Throwable -> Lf0
            r13 = 9
            r2.setLocationType(r13)     // Catch: java.lang.Throwable -> Lf0
            r2.setLatitude(r7)     // Catch: java.lang.Throwable -> Lf0
            r2.setLongitude(r9)     // Catch: java.lang.Throwable -> Lf0
            r2.setAccuracy(r11)     // Catch: java.lang.Throwable -> Lf0
            r2.setAltitude(r5)     // Catch: java.lang.Throwable -> Lf0
            r2.setBearing(r12)     // Catch: java.lang.Throwable -> Lf0
            r2.setSpeed(r1)     // Catch: java.lang.Throwable -> Lf0
            r2.setTime(r3)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r5 = "GCJ02"
            r2.setCoordType(r5)     // Catch: java.lang.Throwable -> Lf0
            com.amap.api.location.AMapLocation r5 = r15.l     // Catch: java.lang.Throwable -> Lf0
            float r5 = com.autonavi.aps.amapapi.utils.j.a(r2, r5)     // Catch: java.lang.Throwable -> Lf0
            r6 = 1133903872(0x43960000, float:300.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto Lf0
            java.lang.Object r5 = r15.p     // Catch: java.lang.Throwable -> Lf0
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lf0
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch: java.lang.Throwable -> Led
            r6.setLongitude(r9)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch: java.lang.Throwable -> Led
            r6.setLatitude(r7)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch: java.lang.Throwable -> Led
            r6.setAccuracy(r11)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch: java.lang.Throwable -> Led
            r6.setBearing(r12)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r6 = r15.l     // Catch: java.lang.Throwable -> Led
            r6.setSpeed(r1)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r1 = r15.l     // Catch: java.lang.Throwable -> Led
            r1.setTime(r3)     // Catch: java.lang.Throwable -> Led
            com.amap.api.location.AMapLocation r1 = r15.l     // Catch: java.lang.Throwable -> Led
            java.lang.String r3 = "GCJ02"
            r1.setCoordType(r3)     // Catch: java.lang.Throwable -> Led
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Led
            return r2
        Led:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Led
            throw r1     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            return r0
    }

    static /* synthetic */ android.location.GpsStatus a(com.amap.api.col.p0003l.v5 r0, android.location.GpsStatus r1) {
            r0.r = r1
            return r1
    }

    private void d(int r3) {
            r2 = this;
            if (r3 != 0) goto L9
            r0 = 0
            r2.f4055f = r0     // Catch: java.lang.Throwable -> L9
            r3 = 0
            r2.q = r3     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    private void e(int r4, int r5, java.lang.String r6, long r7) {
            r3 = this;
            android.os.Handler r0 = r3.a     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L31
            com.amap.api.location.AMapLocationClientOption r0 = r3.f4053d     // Catch: java.lang.Throwable -> L31
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()     // Catch: java.lang.Throwable -> L31
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto L31
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L31
            com.amap.api.location.AMapLocation r1 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "gps"
            r1.setProvider(r2)     // Catch: java.lang.Throwable -> L31
            r1.setErrorCode(r5)     // Catch: java.lang.Throwable -> L31
            r1.setLocationDetail(r6)     // Catch: java.lang.Throwable -> L31
            r5 = 1
            r1.setLocationType(r5)     // Catch: java.lang.Throwable -> L31
            r0.obj = r1     // Catch: java.lang.Throwable -> L31
            r0.what = r4     // Catch: java.lang.Throwable -> L31
            android.os.Handler r4 = r3.a     // Catch: java.lang.Throwable -> L31
            r4.sendMessageDelayed(r0, r7)     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }

    private void f(android.location.GnssStatus r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L20
            r2 = 24
            if (r1 < r2) goto L28
            int r1 = androidx.core.location.e.a(r5)     // Catch: java.lang.Throwable -> L20
            r2 = 0
        Le:
            if (r0 >= r1) goto L1e
            boolean r3 = androidx.core.location.l.a(r5, r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L18
            int r2 = r2 + 1
        L18:
            int r0 = r0 + 1
            goto Le
        L1b:
            r5 = move-exception
            r0 = r2
            goto L21
        L1e:
            r0 = r2
            goto L28
        L20:
            r5 = move-exception
        L21:
            java.lang.String r1 = "GpsLocation_Gnss"
            java.lang.String r2 = "GPS_EVENT_SATELLITE_STATUS"
            com.autonavi.aps.amapapi.utils.b.a(r5, r1, r2)
        L28:
            r4.q = r0
            return
    }

    private void g(android.location.Location r10) {
            r9 = this;
            android.os.Handler r0 = r9.a
            if (r0 == 0) goto L9
            r1 = 8
            r0.removeMessages(r1)
        L9:
            if (r10 != 0) goto Ld
            goto Lfb
        Ld:
            com.amap.api.location.AMapLocation r0 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L48
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L48
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L1a
            goto Lfb
        L1a:
            java.lang.String r1 = "gps"
            r0.setProvider(r1)     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r0.setLocationType(r1)     // Catch: java.lang.Throwable -> L48
            boolean r2 = r9.f4056g     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L4b
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4b
            android.content.Context r2 = r9.f4051b     // Catch: java.lang.Throwable -> L48
            long r3 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L48
            long r5 = r9.f4054e     // Catch: java.lang.Throwable -> L48
            long r3 = r3 - r5
            double r5 = r0.getLatitude()     // Catch: java.lang.Throwable -> L48
            double r7 = r0.getLongitude()     // Catch: java.lang.Throwable -> L48
            boolean r5 = com.autonavi.aps.amapapi.utils.b.a(r5, r7)     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.utils.h.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L48
            r9.f4056g = r1     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r10 = move-exception
            goto Lff
        L4b:
            int r2 = r9.q     // Catch: java.lang.Throwable -> L48
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r0, r2)     // Catch: java.lang.Throwable -> L48
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L98
            r0.setMock(r1)     // Catch: java.lang.Throwable -> L48
            r2 = 4
            r0.setTrustedLevel(r2)     // Catch: java.lang.Throwable -> L48
            com.amap.api.location.AMapLocationClientOption r2 = r9.f4053d     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.isMockEnable()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L9a
            int r10 = r9.x     // Catch: java.lang.Throwable -> L48
            r2 = 3
            if (r10 <= r2) goto L94
            r10 = 2152(0x868, float:3.016E-42)
            com.autonavi.aps.amapapi.utils.h.a(r4, r10)     // Catch: java.lang.Throwable -> L48
            r10 = 15
            r0.setErrorCode(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.String r10 = "GpsLocation has been mocked!#1501"
            r0.setLocationDetail(r10)     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r0.setLatitude(r1)     // Catch: java.lang.Throwable -> L48
            r0.setLongitude(r1)     // Catch: java.lang.Throwable -> L48
            r0.setAltitude(r1)     // Catch: java.lang.Throwable -> L48
            r10 = 0
            r0.setSpeed(r10)     // Catch: java.lang.Throwable -> L48
            r0.setAccuracy(r10)     // Catch: java.lang.Throwable -> L48
            r0.setBearing(r10)     // Catch: java.lang.Throwable -> L48
            r0.setExtras(r4)     // Catch: java.lang.Throwable -> L48
            r9.z(r0)     // Catch: java.lang.Throwable -> L48
            return
        L94:
            int r10 = r10 + r1
            r9.x = r10     // Catch: java.lang.Throwable -> L48
            return
        L98:
            r9.x = r3     // Catch: java.lang.Throwable -> L48
        L9a:
            int r1 = r9.q     // Catch: java.lang.Throwable -> L48
            r0.setSatellites(r1)     // Catch: java.lang.Throwable -> L48
            r9.D(r0)     // Catch: java.lang.Throwable -> L48
            r9.E(r0)     // Catch: java.lang.Throwable -> L48
            J(r0)     // Catch: java.lang.Throwable -> L48
            com.amap.api.location.AMapLocation r0 = r9.G(r0)     // Catch: java.lang.Throwable -> L48
            r9.n(r0)     // Catch: java.lang.Throwable -> L48
            r9.t(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r9.o     // Catch: java.lang.Throwable -> L48
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L48
            com.amap.api.location.AMapLocation r2 = com.amap.api.col.p0003l.v5.J     // Catch: java.lang.Throwable -> Lfc
            r9.o(r0, r2)     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lfc
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r1 == 0) goto Lf8
            com.amap.api.location.AMapLocation r1 = r9.l     // Catch: java.lang.Throwable -> Ldb
            if (r1 == 0) goto Ldd
            long r1 = r10.getTime()     // Catch: java.lang.Throwable -> Ldb
            com.amap.api.location.AMapLocation r10 = r9.l     // Catch: java.lang.Throwable -> Ldb
            long r5 = r10.getTime()     // Catch: java.lang.Throwable -> Ldb
            long r1 = r1 - r5
            r9.m = r1     // Catch: java.lang.Throwable -> Ldb
            com.amap.api.location.AMapLocation r10 = r9.l     // Catch: java.lang.Throwable -> Ldb
            float r10 = com.autonavi.aps.amapapi.utils.j.a(r10, r0)     // Catch: java.lang.Throwable -> Ldb
            r9.n = r10     // Catch: java.lang.Throwable -> Ldb
            goto Ldd
        Ldb:
            r10 = move-exception
            goto Lf1
        Ldd:
            java.lang.Object r10 = r9.p     // Catch: java.lang.Throwable -> Ldb
            monitor-enter(r10)     // Catch: java.lang.Throwable -> Ldb
            com.amap.api.location.AMapLocation r1 = r0.clone()     // Catch: java.lang.Throwable -> Lee
            r9.l = r1     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lee
            r9.z = r4     // Catch: java.lang.Throwable -> Ldb
            r9.A = r3     // Catch: java.lang.Throwable -> Ldb
            r9.B = r3     // Catch: java.lang.Throwable -> Ldb
            goto Lf8
        Lee:
            r1 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lee
            throw r1     // Catch: java.lang.Throwable -> Ldb
        Lf1:
            java.lang.String r1 = "GpsLocation"
            java.lang.String r2 = "onLocationChangedLast"
            com.autonavi.aps.amapapi.utils.b.a(r10, r1, r2)     // Catch: java.lang.Throwable -> L48
        Lf8:
            r9.z(r0)     // Catch: java.lang.Throwable -> L48
        Lfb:
            return
        Lfc:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lfc
            throw r10     // Catch: java.lang.Throwable -> L48
        Lff:
            java.lang.String r0 = "GpsLocation"
            java.lang.String r1 = "onLocationChanged"
            com.autonavi.aps.amapapi.utils.b.a(r10, r0, r1)
            return
    }

    static /* synthetic */ void i(com.amap.api.col.p0003l.v5 r0) {
            r0.M()
            return
    }

    static /* synthetic */ void j(com.amap.api.col.p0003l.v5 r0, int r1) {
            r0.d(r1)
            return
    }

    static /* synthetic */ void k(com.amap.api.col.p0003l.v5 r0, android.location.GnssStatus r1) {
            r0.f(r1)
            return
    }

    static /* synthetic */ void l(com.amap.api.col.p0003l.v5 r0, android.location.Location r1) {
            r0.g(r1)
            return
    }

    static /* synthetic */ void m(com.amap.api.col.p0003l.v5 r0, java.lang.String r1) {
            r0.q(r1)
            return
    }

    private void n(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r4)
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            r3.f4055f = r0
            java.lang.Object r0 = com.amap.api.col.p0003l.v5.F
            monitor-enter(r0)
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L24
            com.amap.api.col.p0003l.v5.E = r1     // Catch: java.lang.Throwable -> L24
            com.amap.api.location.AMapLocation r4 = r4.clone()     // Catch: java.lang.Throwable -> L24
            com.amap.api.col.p0003l.v5.D = r4     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            int r4 = r3.f4057h
            int r4 = r4 + 1
            r3.f4057h = r4
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    private void o(com.amap.api.location.AMapLocation r3, com.amap.api.location.AMapLocation r4) {
            r2 = this;
            if (r4 == 0) goto L18
            com.amap.api.location.AMapLocationClientOption r0 = r2.f4053d
            boolean r0 = r0.isNeedAddress()
            if (r0 == 0) goto L18
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r3, r4)
            int r1 = r2.f4059j
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            com.autonavi.aps.amapapi.utils.b.a(r3, r4)
        L18:
            return
    }

    private void q(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "gps"
            boolean r3 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto Lf
            r0 = 0
            r2.f4055f = r0     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            r2.q = r3     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private static boolean r(android.location.LocationManager r2) {
            boolean r0 = com.amap.api.col.p0003l.v5.H     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L7
            boolean r2 = com.amap.api.col.p0003l.v5.I     // Catch: java.lang.Throwable -> L25
            return r2
        L7:
            java.util.List r2 = r2.getAllProviders()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L1c
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L1c
            java.lang.String r0 = "gps"
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.p0003l.v5.I = r2     // Catch: java.lang.Throwable -> L25
            goto L1f
        L1c:
            r2 = 0
            com.amap.api.col.p0003l.v5.I = r2     // Catch: java.lang.Throwable -> L25
        L1f:
            r2 = 1
            com.amap.api.col.p0003l.v5.H = r2     // Catch: java.lang.Throwable -> L25
            boolean r2 = com.amap.api.col.p0003l.v5.I     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GpsLocation | hasProvider error: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            com.autonavi.aps.amapapi.utils.d.a()
            boolean r2 = com.amap.api.col.p0003l.v5.I
            return r2
    }

    static /* synthetic */ android.location.GpsStatus s(com.amap.api.col.p0003l.v5 r0) {
            android.location.GpsStatus r0 = r0.r
            return r0
    }

    private void t(com.amap.api.location.AMapLocation r8) {
            r7 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r8)
            if (r0 != 0) goto L8
            goto L82
        L8:
            android.os.Handler r0 = r7.a
            if (r0 == 0) goto L82
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            com.amap.api.location.AMapLocationClientOption r2 = r7.f4053d
            long r2 = r2.getInterval()
            r4 = 8000(0x1f40, double:3.9525E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2a
            long r2 = r7.w
            long r0 = r0 - r2
            com.amap.api.location.AMapLocationClientOption r2 = r7.f4053d
            long r2 = r2.getInterval()
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L82
        L2a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "lat"
            double r2 = r8.getLatitude()
            r0.putDouble(r1, r2)
            java.lang.String r1 = "lon"
            double r2 = r8.getLongitude()
            r0.putDouble(r1, r2)
            java.lang.String r1 = "radius"
            float r2 = r8.getAccuracy()
            r0.putFloat(r1, r2)
            java.lang.String r1 = "time"
            long r2 = r8.getTime()
            r0.putLong(r1, r2)
            android.os.Message r1 = android.os.Message.obtain()
            r1.setData(r0)
            r0 = 5
            r1.what = r0
            java.lang.Object r0 = r7.o
            monitor-enter(r0)
            com.amap.api.location.AMapLocation r2 = com.amap.api.col.p0003l.v5.J     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L6c
            android.os.Handler r8 = r7.a     // Catch: java.lang.Throwable -> L6a
            r8.sendMessage(r1)     // Catch: java.lang.Throwable -> L6a
            goto L7e
        L6a:
            r8 = move-exception
            goto L80
        L6c:
            com.amap.api.location.AMapLocation r2 = com.amap.api.col.p0003l.v5.J     // Catch: java.lang.Throwable -> L6a
            float r8 = com.autonavi.aps.amapapi.utils.j.a(r8, r2)     // Catch: java.lang.Throwable -> L6a
            int r2 = r7.f4060k     // Catch: java.lang.Throwable -> L6a
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6a
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L7e
            android.os.Handler r8 = r7.a     // Catch: java.lang.Throwable -> L6a
            r8.sendMessage(r1)     // Catch: java.lang.Throwable -> L6a
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r8
        L82:
            return
    }

    private boolean w(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList r0 = com.autonavi.aps.amapapi.utils.j.b(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r3.z     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r1 = com.autonavi.aps.amapapi.utils.j.b(r1)     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f
            r2 = 8
            if (r0 < r2) goto L1f
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L1f
            if (r0 < r2) goto L1f
            java.lang.String r0 = r3.z     // Catch: java.lang.Throwable -> L1f
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r0, r4)     // Catch: java.lang.Throwable -> L1f
            return r4
        L1f:
            r4 = 0
            return r4
    }

    static /* synthetic */ void y(com.amap.api.col.p0003l.v5 r0) {
            r0.O()
            return
    }

    private void z(com.amap.api.location.AMapLocation r7) {
            r6 = this;
            int r0 = r7.getErrorCode()
            r1 = 15
            if (r0 != r1) goto L17
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            com.amap.api.location.AMapLocationClientOption r1 = r6.f4053d
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r1.getLocationMode()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L51
        L17:
            com.amap.api.location.AMapLocationClientOption r0 = r6.f4053d
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            com.amap.api.location.AMapLocationClientOption r0 = r6.f4053d
            float r0 = r0.getDeviceModeDistanceFilter()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L34
            r6.B(r7)
            return
        L34:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r6.w
            long r0 = r0 - r2
            com.amap.api.location.AMapLocationClientOption r2 = r6.f4053d
            long r2 = r2.getInterval()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L51
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            r6.w = r0
            r6.B(r7)
        L51:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final int A() {
            r3 = this;
            android.location.LocationManager r0 = r3.f4052c
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r(r0)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.content.Context r0 = r3.f4051b
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "location_mode"
            r2 = 0
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r2)
            r1 = 2
            if (r0 != 0) goto L1e
            return r1
        L1e:
            if (r0 != r1) goto L22
            r0 = 3
            return r0
        L22:
            boolean r0 = r3.v
            if (r0 != 0) goto L28
            r0 = 4
            return r0
        L28:
            return r2
    }

    public final int C() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public final boolean F() {
            r6 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r6.f4053d
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isOnceLocation()
            if (r0 == 0) goto Lc
            goto L1c
        Lc:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = r6.f4055f
            long r2 = r2 - r4
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            return r0
        L1c:
            return r1
    }

    public final com.amap.api.location.AMapLocation b(com.amap.api.location.AMapLocation r17, java.lang.String r18) {
            r16 = this;
            r1 = r16
            r0 = r18
            com.amap.api.location.AMapLocation r2 = r1.l
            if (r2 != 0) goto La
            goto La7
        La:
            com.amap.api.location.AMapLocationClientOption r2 = r1.f4053d
            boolean r2 = r2.isMockEnable()
            if (r2 != 0) goto L1c
            com.amap.api.location.AMapLocation r2 = r1.l
            boolean r2 = r2.isMock()
            if (r2 == 0) goto L1c
            goto La7
        L1c:
            com.amap.api.location.AMapLocation r2 = r1.l
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r2)
            if (r2 != 0) goto L26
            goto La7
        L26:
            com.amap.api.location.AMapLocation r2 = r1.R()
            r3 = 2
            if (r2 == 0) goto L37
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r2)
            if (r4 == 0) goto L37
            r2.setTrustedLevel(r3)
            return r2
        L37:
            com.amap.api.location.AMapLocation r2 = r1.l
            float r2 = r2.getSpeed()
            r4 = 0
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 != 0) goto L59
            long r7 = r1.m
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L59
            r9 = 8
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L59
            float r9 = r1.n
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 <= 0) goto L59
            float r2 = (float) r7
            float r2 = r9 / r2
        L59:
            r7 = 0
            r8 = 30000(0x7530, double:1.4822E-319)
            if (r17 == 0) goto L9b
            boolean r10 = com.autonavi.aps.amapapi.utils.j.a(r17)
            if (r10 == 0) goto L9b
            float r10 = r17.getAccuracy()
            r11 = 1128792064(0x43480000, float:200.0)
            r12 = 1084227584(0x40a00000, float:5.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L88
            int r10 = r1.B
            r11 = 1
            int r10 = r10 + r11
            r1.B = r10
            java.lang.String r13 = r1.z
            if (r13 != 0) goto L7e
            if (r10 < r3) goto L7e
            r1.A = r11
        L7e:
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L85
            r10 = 10000(0x2710, double:4.9407E-320)
            goto L9c
        L85:
            r10 = 15000(0x3a98, double:7.411E-320)
            goto L9c
        L88:
            java.lang.String r10 = r1.z
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L94
            r1.A = r7
            r1.B = r7
        L94:
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L9b
            r10 = 20000(0x4e20, double:9.8813E-320)
            goto L9c
        L9b:
            r10 = r8
        L9c:
            long r12 = com.autonavi.aps.amapapi.utils.j.b()
            long r14 = r1.f4055f
            long r12 = r12 - r14
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 <= 0) goto La8
        La7:
            return r17
        La8:
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 < 0) goto Ld4
            boolean r2 = r1.A
            if (r2 == 0) goto Lc1
            boolean r0 = r1.w(r0)
            if (r0 == 0) goto Lc1
            com.amap.api.location.AMapLocation r0 = r1.l
            com.amap.api.location.AMapLocation r0 = r0.clone()
            r2 = 3
            r0.setTrustedLevel(r2)
            return r0
        Lc1:
            r0 = 0
            r1.z = r0
            r1.B = r7
            java.lang.Object r2 = r1.p
            monitor-enter(r2)
            r1.l = r0     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld1
            r1.m = r4
            r1.n = r6
            return r17
        Ld1:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld1
            throw r0
        Ld4:
            java.lang.String r2 = r1.z
            if (r2 != 0) goto Lde
            int r2 = r1.B
            if (r2 < r3) goto Lde
            r1.z = r0
        Lde:
            com.amap.api.location.AMapLocation r0 = r1.l
            com.amap.api.location.AMapLocation r0 = r0.clone()
            r0.setTrustedLevel(r3)
            return r0
    }

    public final void c() {
            r5 = this;
            android.location.LocationManager r0 = r5.f4052c
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            android.location.LocationListener r2 = r5.y     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            r0.removeUpdates(r2)     // Catch: java.lang.Throwable -> L16
            android.location.LocationListener r0 = r5.y     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.v5$c r0 = (com.amap.api.col.3l.v5.c) r0     // Catch: java.lang.Throwable -> L16
            r0.a()     // Catch: java.lang.Throwable -> L16
            r5.y = r1     // Catch: java.lang.Throwable -> L16
        L16:
            android.location.GpsStatus$Listener r0 = r5.s     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1f
            android.location.LocationManager r2 = r5.f4052c     // Catch: java.lang.Throwable -> L1f
            r2.removeGpsStatusListener(r0)     // Catch: java.lang.Throwable -> L1f
        L1f:
            android.location.GnssStatus$Callback r0 = r5.t     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            android.location.LocationManager r2 = r5.f4052c     // Catch: java.lang.Throwable -> L28
            cn.jiguang.commons.J.b.a(r2, r0)     // Catch: java.lang.Throwable -> L28
        L28:
            android.os.Handler r0 = r5.a     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L31
            r2 = 8
            r0.removeMessages(r2)     // Catch: java.lang.Throwable -> L31
        L31:
            r0 = 0
            r5.q = r0
            r2 = 0
            r5.f4054e = r2
            r5.w = r2
            r5.f4055f = r2
            r5.f4057h = r0
            r5.x = r0
            com.autonavi.aps.amapapi.filters.a r4 = r5.f4058i
            r4.a()
            r5.l = r1
            r5.m = r2
            r2 = 0
            r5.n = r2
            r5.z = r1
            r5.C = r0
            return
    }

    public final void h(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L3f
            java.lang.Class<com.amap.api.location.AMapLocation> r0 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L37
            r3.setClassLoader(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "I_MAX_GEO_DIS"
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.f4059j = r0     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "I_MIN_GEO_DIS"
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.f4060k = r0     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "loc"
            android.os.Parcelable r3 = r3.getParcelable(r0)     // Catch: java.lang.Throwable -> L37
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r3.getAdCode()     // Catch: java.lang.Throwable -> L37
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r2.o     // Catch: java.lang.Throwable -> L37
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L37
            com.amap.api.col.p0003l.v5.J = r3     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L37
        L37:
            r3 = move-exception
            java.lang.String r0 = "GpsLocation"
            java.lang.String r1 = "setLastGeoLocation"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
        L3f:
            return
    }

    public final void p(com.amap.api.location.AMapLocationClientOption r5) {
            r4 = this;
            r4.f4053d = r5
            if (r5 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r5 = new com.amap.api.location.AMapLocationClientOption
            r5.<init>()
            r4.f4053d = r5
        Lb:
            android.content.Context r5 = r4.f4051b     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "pref"
            java.lang.String r1 = "lagt"
            long r2 = com.amap.api.col.p0003l.v5.G     // Catch: java.lang.Throwable -> L19
            long r0 = com.autonavi.aps.amapapi.utils.i.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.p0003l.v5.G = r0     // Catch: java.lang.Throwable -> L19
        L19:
            r4.K()
            return
    }

    public final void u(com.amap.api.location.AMapLocationClientOption r2) {
            r1 = this;
            if (r2 != 0) goto L7
            com.amap.api.location.AMapLocationClientOption r2 = new com.amap.api.location.AMapLocationClientOption
            r2.<init>()
        L7:
            r1.f4053d = r2
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = r2.getLocationMode()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r2 == r0) goto L1a
            android.os.Handler r2 = r1.a
            if (r2 == 0) goto L1a
            r0 = 8
            r2.removeMessages(r0)
        L1a:
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r1.u
            com.amap.api.location.AMapLocationClientOption r0 = r1.f4053d
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()
            if (r2 == r0) goto L2f
            java.lang.Object r2 = r1.o
            monitor-enter(r2)
            r0 = 0
            com.amap.api.col.p0003l.v5.J = r0     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2f:
            com.amap.api.location.AMapLocationClientOption r2 = r1.f4053d
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r2.getGeoLanguage()
            r1.u = r2
            return
    }

    public final boolean v() {
            r5 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r5.f4055f
            long r0 = r0 - r2
            r2 = 2800(0xaf0, double:1.3834E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public final void x() {
            r1 = this;
            r0 = 0
            r1.x = r0
            return
    }
}
