package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t4 {
    private static java.lang.String r = "CoarseLocation";
    private static long s;
    private static boolean t;
    private static boolean u;
    private static boolean v;
    private static boolean w;
    public static volatile com.amap.api.location.AMapLocation x;
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3984b;

    /* renamed from: c, reason: collision with root package name */
    private int f3985c;

    /* renamed from: d, reason: collision with root package name */
    private com.autonavi.aps.amapapi.filters.a f3986d;

    /* renamed from: e, reason: collision with root package name */
    private int f3987e;

    /* renamed from: f, reason: collision with root package name */
    private int f3988f;

    /* renamed from: g, reason: collision with root package name */
    private int f3989g;

    /* renamed from: h, reason: collision with root package name */
    private android.os.Handler f3990h;

    /* renamed from: i, reason: collision with root package name */
    private android.content.Context f3991i;

    /* renamed from: j, reason: collision with root package name */
    private long f3992j;

    /* renamed from: k, reason: collision with root package name */
    private int f3993k;
    private android.location.LocationManager l;
    private com.amap.api.location.AMapLocationClientOption m;
    private java.lang.Object n;
    private boolean o;
    private com.amap.api.location.AMapLocationClientOption.GeoLanguage p;
    private android.location.LocationListener q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.location.LocationListener {
        private com.amap.api.col.p0003l.t4 a;

        a(com.amap.api.col.p0003l.t4 r1) {
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
        public final void onLocationChanged(android.location.Location r2) {
                r1 = this;
                com.amap.api.col.3l.t4 r0 = r1.a     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L7
                com.amap.api.col.p0003l.t4.i(r0, r2)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(java.lang.String r1) {
                r0 = this;
                com.amap.api.col.3l.t4 r1 = r0.a     // Catch: java.lang.Throwable -> L7
                if (r1 == 0) goto L7
                com.amap.api.col.p0003l.t4.g(r1)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "gps"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto Lb
                com.autonavi.aps.amapapi.utils.d.a()
            Lb:
                return
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                com.amap.api.col.3l.t4 r1 = r0.a     // Catch: java.lang.Throwable -> L7
                if (r1 == 0) goto L7
                com.amap.api.col.p0003l.t4.h(r1, r2)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }
    }

    static {
            return
    }

    public t4(android.content.Context r6, android.os.Handler r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.a = r0
            r2 = 0
            r5.f3984b = r2
            r5.f3985c = r2
            r3 = 0
            r5.f3986d = r3
            r4 = 240(0xf0, float:3.36E-43)
            r5.f3987e = r4
            r4 = 80
            r5.f3988f = r4
            r5.f3989g = r2
            r5.f3992j = r0
            r5.f3993k = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.n = r0
            r0 = 1
            r5.o = r0
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            r5.p = r0
            r5.q = r3
            r5.f3991i = r6
            r5.f3990h = r7
            java.lang.String r7 = "location"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch: java.lang.Throwable -> L3c
            android.location.LocationManager r6 = (android.location.LocationManager) r6     // Catch: java.lang.Throwable -> L3c
            r5.l = r6     // Catch: java.lang.Throwable -> L3c
            goto L44
        L3c:
            r6 = move-exception
            java.lang.String r7 = com.amap.api.col.p0003l.t4.r
            java.lang.String r0 = "<init>"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7, r0)
        L44:
            com.autonavi.aps.amapapi.filters.a r6 = new com.autonavi.aps.amapapi.filters.a
            r6.<init>()
            r5.f3986d = r6
            return
    }

    private void A() {
            r1 = this;
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L6
            r0 = 0
            r1.f3989g = r0     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    private static void B(com.amap.api.location.AMapLocation r7) {
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

    private static com.autonavi.aps.amapapi.model.a a(int r2, java.lang.String r3) {
            com.autonavi.aps.amapapi.model.a r0 = new com.autonavi.aps.amapapi.model.a
            java.lang.String r1 = ""
            r0.<init>(r1)
            r0.setErrorCode(r2)
            r0.setLocationDetail(r3)
            return r0
    }

    private void c(int r1) {
            r0 = this;
            if (r1 != 0) goto L8
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r0.f3989g = r1     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    private void d(int r4, java.lang.String r5, long r6) {
            r3 = this;
            android.os.Handler r0 = r3.f3990h     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L25
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L26
            com.amap.api.location.AMapLocation r1 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            r2 = 20
            r1.setErrorCode(r2)     // Catch: java.lang.Throwable -> L26
            r1.setLocationDetail(r5)     // Catch: java.lang.Throwable -> L26
            r5 = 11
            r1.setLocationType(r5)     // Catch: java.lang.Throwable -> L26
            r0.obj = r1     // Catch: java.lang.Throwable -> L26
            r0.what = r4     // Catch: java.lang.Throwable -> L26
            android.os.Handler r4 = r3.f3990h     // Catch: java.lang.Throwable -> L26
            r4.sendMessageDelayed(r0, r6)     // Catch: java.lang.Throwable -> L26
        L25:
            return
        L26:
            com.autonavi.aps.amapapi.utils.d.b()
            return
    }

    private void e(android.location.Location r10) {
            r9 = this;
            android.os.Handler r0 = r9.f3990h
            if (r0 == 0) goto L9
            r1 = 100
            r0.removeMessages(r1)
        L9:
            if (r10 != 0) goto Ld
            goto Leb
        Ld:
            com.amap.api.location.AMapLocation r0 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L1a
            goto Leb
        L1a:
            java.lang.String r1 = "gps"
            java.lang.String r2 = r10.getProvider()     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2f
            java.lang.String r1 = "gps_coarse"
            r0.setProvider(r1)     // Catch: java.lang.Throwable -> L2c
            goto L34
        L2c:
            r10 = move-exception
            goto Lef
        L2f:
            java.lang.String r1 = "network_coarse"
            r0.setProvider(r1)     // Catch: java.lang.Throwable -> L2c
        L34:
            r1 = 11
            r0.setLocationType(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r9.f3984b     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            if (r1 != 0) goto L5e
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L5e
            android.content.Context r1 = r9.f3991i     // Catch: java.lang.Throwable -> L2c
            long r3 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L2c
            long r5 = r9.a     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 - r5
            double r5 = r0.getLatitude()     // Catch: java.lang.Throwable -> L2c
            double r7 = r0.getLongitude()     // Catch: java.lang.Throwable -> L2c
            boolean r5 = com.autonavi.aps.amapapi.utils.b.a(r5, r7)     // Catch: java.lang.Throwable -> L2c
            com.autonavi.aps.amapapi.utils.h.b(r1, r3, r5)     // Catch: java.lang.Throwable -> L2c
            r9.f3984b = r2     // Catch: java.lang.Throwable -> L2c
        L5e:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            java.lang.String r4 = "isFromMockProvider"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = com.autonavi.aps.amapapi.utils.f.a(r10, r4, r5)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "CoarseLocation | isFromMock="
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L78
            r1.concat(r5)     // Catch: java.lang.Throwable -> L78
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L78
            goto L7a
        L78:
            r1 = r4
        L79:
            r4 = r1
        L7a:
            boolean r1 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Lc4
            r0.setMock(r2)     // Catch: java.lang.Throwable -> L2c
            r1 = 4
            r0.setTrustedLevel(r1)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.location.AMapLocationClientOption r1 = r9.m     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.isMockEnable()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto Lc6
            int r10 = r9.f3993k     // Catch: java.lang.Throwable -> L2c
            r1 = 3
            if (r10 <= r1) goto Lc0
            r10 = 2152(0x868, float:3.016E-42)
            r1 = 0
            com.autonavi.aps.amapapi.utils.h.a(r1, r10)     // Catch: java.lang.Throwable -> L2c
            r10 = 15
            r0.setErrorCode(r10)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r10 = "CoarseLocation has been mocked!#2007"
            r0.setLocationDetail(r10)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r0.setLatitude(r2)     // Catch: java.lang.Throwable -> L2c
            r0.setLongitude(r2)     // Catch: java.lang.Throwable -> L2c
            r0.setAltitude(r2)     // Catch: java.lang.Throwable -> L2c
            r10 = 0
            r0.setSpeed(r10)     // Catch: java.lang.Throwable -> L2c
            r0.setAccuracy(r10)     // Catch: java.lang.Throwable -> L2c
            r0.setBearing(r10)     // Catch: java.lang.Throwable -> L2c
            r0.setExtras(r1)     // Catch: java.lang.Throwable -> L2c
            r9.s(r0)     // Catch: java.lang.Throwable -> L2c
            goto Leb
        Lc0:
            int r10 = r10 + r2
            r9.f3993k = r10     // Catch: java.lang.Throwable -> L2c
            goto Leb
        Lc4:
            r9.f3993k = r3     // Catch: java.lang.Throwable -> L2c
        Lc6:
            int r10 = o(r10)     // Catch: java.lang.Throwable -> L2c
            r9.f3989g = r10     // Catch: java.lang.Throwable -> L2c
            r0.setSatellites(r10)     // Catch: java.lang.Throwable -> L2c
            r9.x(r0)     // Catch: java.lang.Throwable -> L2c
            B(r0)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.location.AMapLocation r10 = r9.y(r0)     // Catch: java.lang.Throwable -> L2c
            r9.j(r10)     // Catch: java.lang.Throwable -> L2c
            r9.p(r10)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r9.n     // Catch: java.lang.Throwable -> L2c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.location.AMapLocation r1 = com.amap.api.col.p0003l.t4.x     // Catch: java.lang.Throwable -> Lec
            r9.k(r10, r1)     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            r9.s(r10)     // Catch: java.lang.Throwable -> L2c
        Leb:
            return
        Lec:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            throw r10     // Catch: java.lang.Throwable -> L2c
        Lef:
            java.lang.String r0 = "CoarseLocation"
            java.lang.String r1 = "onLocationChanged"
            com.autonavi.aps.amapapi.utils.b.a(r10, r0, r1)
            return
    }

    static /* synthetic */ void g(com.amap.api.col.p0003l.t4 r0) {
            r0.A()
            return
    }

    static /* synthetic */ void h(com.amap.api.col.p0003l.t4 r0, int r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void i(com.amap.api.col.p0003l.t4 r0, android.location.Location r1) {
            r0.e(r1)
            return
    }

    private void j(com.amap.api.location.AMapLocation r1) {
            r0 = this;
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1)
            if (r1 != 0) goto L7
            return
        L7:
            int r1 = r0.f3985c
            int r1 = r1 + 1
            r0.f3985c = r1
            return
    }

    private void k(com.amap.api.location.AMapLocation r3, com.amap.api.location.AMapLocation r4) {
            r2 = this;
            if (r4 == 0) goto L18
            com.amap.api.location.AMapLocationClientOption r0 = r2.m
            boolean r0 = r0.isNeedAddress()
            if (r0 == 0) goto L18
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r3, r4)
            int r1 = r2.f3987e
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            com.autonavi.aps.amapapi.utils.b.a(r3, r4)
        L18:
            return
    }

    private static boolean m(android.location.LocationManager r2) {
            boolean r0 = com.amap.api.col.p0003l.t4.t     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L7
            boolean r2 = com.amap.api.col.p0003l.t4.u     // Catch: java.lang.Throwable -> L25
            return r2
        L7:
            java.util.List r2 = r2.getAllProviders()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L1c
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L1c
            java.lang.String r0 = "gps"
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.p0003l.t4.u = r2     // Catch: java.lang.Throwable -> L25
            goto L1f
        L1c:
            r2 = 0
            com.amap.api.col.p0003l.t4.u = r2     // Catch: java.lang.Throwable -> L25
        L1f:
            r2 = 1
            com.amap.api.col.p0003l.t4.t = r2     // Catch: java.lang.Throwable -> L25
            boolean r2 = com.amap.api.col.p0003l.t4.u     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoarseLocation | hasProvider error: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            com.autonavi.aps.amapapi.utils.d.a()
            boolean r2 = com.amap.api.col.p0003l.t4.u
            return r2
    }

    private static int o(android.location.Location r1) {
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto Ld
            java.lang.String r0 = "satellites"
            int r1 = r1.getInt(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            com.autonavi.aps.amapapi.utils.d.b()
            return r1
    }

    private void p(com.amap.api.location.AMapLocation r8) {
            r7 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r8)
            if (r0 != 0) goto L8
            goto L83
        L8:
            android.os.Handler r0 = r7.f3990h
            if (r0 == 0) goto L83
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            com.amap.api.location.AMapLocationClientOption r2 = r7.m
            long r2 = r2.getInterval()
            r4 = 8000(0x1f40, double:3.9525E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2a
            long r2 = r7.f3992j
            long r0 = r0 - r2
            com.amap.api.location.AMapLocationClientOption r2 = r7.m
            long r2 = r2.getInterval()
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L83
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
            r0 = 102(0x66, float:1.43E-43)
            r1.what = r0
            java.lang.Object r0 = r7.n
            monitor-enter(r0)
            com.amap.api.location.AMapLocation r2 = com.amap.api.col.p0003l.t4.x     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L6d
            android.os.Handler r8 = r7.f3990h     // Catch: java.lang.Throwable -> L6b
            r8.sendMessage(r1)     // Catch: java.lang.Throwable -> L6b
            goto L7f
        L6b:
            r8 = move-exception
            goto L81
        L6d:
            com.amap.api.location.AMapLocation r2 = com.amap.api.col.p0003l.t4.x     // Catch: java.lang.Throwable -> L6b
            float r8 = com.autonavi.aps.amapapi.utils.j.a(r8, r2)     // Catch: java.lang.Throwable -> L6b
            int r2 = r7.f3988f     // Catch: java.lang.Throwable -> L6b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6b
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L7f
            android.os.Handler r8 = r7.f3990h     // Catch: java.lang.Throwable -> L6b
            r8.sendMessage(r1)     // Catch: java.lang.Throwable -> L6b
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
        L83:
            return
    }

    private static boolean r(android.location.LocationManager r2) {
            boolean r0 = com.amap.api.col.p0003l.t4.v     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L7
            boolean r2 = com.amap.api.col.p0003l.t4.w     // Catch: java.lang.Throwable -> L13
            return r2
        L7:
            java.lang.String r0 = "network"
            boolean r2 = r2.isProviderEnabled(r0)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.t4.w = r2     // Catch: java.lang.Throwable -> L13
            r0 = 1
            com.amap.api.col.p0003l.t4.v = r0     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoarseLocation | hasProvider error: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            com.autonavi.aps.amapapi.utils.d.a()
            boolean r2 = com.amap.api.col.p0003l.t4.w
            return r2
    }

    private void s(com.amap.api.location.AMapLocation r7) {
            r6 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r6.m
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            com.amap.api.location.AMapLocationClientOption r0 = r6.m
            float r0 = r0.getDeviceModeDistanceFilter()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r6.v(r7)
            return
        L1d:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r6.f3992j
            long r0 = r0 - r2
            com.amap.api.location.AMapLocationClientOption r2 = r6.m
            long r2 = r2.getInterval()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3a
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            r6.f3992j = r0
            r6.v(r7)
        L3a:
            return
    }

    private boolean t() {
            r6 = this;
            r0 = 1
            int r1 = com.autonavi.aps.amapapi.utils.j.c()     // Catch: java.lang.Throwable -> L50
            r2 = 28
            r3 = 0
            if (r1 < r2) goto L32
            android.location.LocationManager r1 = r6.l     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L22
            android.content.Context r1 = r6.f3991i     // Catch: java.lang.Throwable -> L50
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L50
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "location"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch: java.lang.Throwable -> L50
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch: java.lang.Throwable -> L50
            r6.l = r1     // Catch: java.lang.Throwable -> L50
        L22:
            android.location.LocationManager r1 = r6.l     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "isLocationEnabled"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = com.autonavi.aps.amapapi.utils.f.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L50
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L50
        L32:
            int r1 = com.autonavi.aps.amapapi.utils.j.c()     // Catch: java.lang.Throwable -> L50
            r4 = 24
            if (r1 < r4) goto L4f
            int r1 = com.autonavi.aps.amapapi.utils.j.c()     // Catch: java.lang.Throwable -> L50
            if (r1 >= r2) goto L4f
            android.content.Context r1 = r6.f3991i     // Catch: java.lang.Throwable -> L50
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r2, r3)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L4f
            return r3
        L4f:
            return r0
        L50:
            com.autonavi.aps.amapapi.utils.d.a()
            return r0
    }

    private void u() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "定位服务没有开启，请在设置中打开定位服务开关#1206"
            r0.append(r1)
            r1 = 12
            java.lang.String r0 = r0.toString()
            com.autonavi.aps.amapapi.model.a r0 = a(r1, r0)
            r2.s(r0)
            return
    }

    private void v(com.amap.api.location.AMapLocation r2) {
            r1 = this;
            android.os.Handler r0 = r1.f3990h
            if (r0 == 0) goto L16
            com.autonavi.aps.amapapi.utils.d.a()
            android.os.Message r0 = android.os.Message.obtain()
            r0.obj = r2
            r2 = 101(0x65, float:1.42E-43)
            r0.what = r2
            android.os.Handler r2 = r1.f3990h
            r2.sendMessage(r0)
        L16:
            return
    }

    private void w() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "模糊权限下不支持连续定位#2006"
            r0.append(r1)
            r1 = 20
            java.lang.String r0 = r0.toString()
            com.autonavi.aps.amapapi.model.a r0 = a(r1, r0)
            r2.s(r0)
            return
    }

    private void x(com.amap.api.location.AMapLocation r9) {
            r8 = this;
            java.lang.String r0 = "WGS84"
            r1 = 0
            double r2 = r9.getLatitude()     // Catch: java.lang.Throwable -> L49
            double r4 = r9.getLongitude()     // Catch: java.lang.Throwable -> L49
            boolean r2 = com.autonavi.aps.amapapi.utils.b.a(r2, r4)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            com.amap.api.location.AMapLocationClientOption r2 = r8.m     // Catch: java.lang.Throwable -> L49
            boolean r2 = r2.isOffset()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            android.content.Context r2 = r8.f3991i     // Catch: java.lang.Throwable -> L49
            com.amap.api.location.DPoint r3 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> L49
            double r4 = r9.getLatitude()     // Catch: java.lang.Throwable -> L49
            double r6 = r9.getLongitude()     // Catch: java.lang.Throwable -> L49
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L49
            com.amap.api.location.DPoint r2 = com.autonavi.aps.amapapi.utils.e.a(r2, r3)     // Catch: java.lang.Throwable -> L49
            double r3 = r2.getLatitude()     // Catch: java.lang.Throwable -> L49
            r9.setLatitude(r3)     // Catch: java.lang.Throwable -> L49
            double r2 = r2.getLongitude()     // Catch: java.lang.Throwable -> L49
            r9.setLongitude(r2)     // Catch: java.lang.Throwable -> L49
            com.amap.api.location.AMapLocationClientOption r2 = r8.m     // Catch: java.lang.Throwable -> L49
            boolean r2 = r2.isOffset()     // Catch: java.lang.Throwable -> L49
            r9.setOffset(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "GCJ02"
            r9.setCoordType(r2)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r2 = move-exception
            goto L52
        L4b:
            r9.setOffset(r1)     // Catch: java.lang.Throwable -> L49
            r9.setCoordType(r0)     // Catch: java.lang.Throwable -> L49
            return
        L52:
            r9.setOffset(r1)
            r9.setCoordType(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "CoarseLocation | offset error: "
            r9.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r9.append(r0)
            com.autonavi.aps.amapapi.utils.d.a()
            return
    }

    private com.amap.api.location.AMapLocation y(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r4)
            if (r0 != 0) goto L7
            goto Lc
        L7:
            int r0 = r3.f3985c
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
            com.autonavi.aps.amapapi.filters.a r0 = r3.f3986d
            com.amap.api.location.AMapLocation r4 = r0.a(r4)
            return r4
    }

    private void z() {
            r11 = this;
            android.location.LocationManager r0 = r11.l
            if (r0 != 0) goto L6
            goto Lfd
        L6:
            r0 = 1
            r1 = 0
            r3 = 0
            r11.o = r0     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 != 0) goto L18
            android.content.Context r0 = r11.f3991i     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            android.os.Looper r0 = r0.getMainLooper()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        L18:
            r10 = r0
            goto L20
        L1a:
            r0 = move-exception
            goto Lfe
        L1d:
            r0 = move-exception
            goto L117
        L20:
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r11.a = r4     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            android.location.LocationManager r0 = r11.l     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            boolean r0 = r(r0)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 == 0) goto L4e
            android.location.LocationListener r0 = r11.q     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 != 0) goto L39
            com.amap.api.col.3l.t4$a r0 = new com.amap.api.col.3l.t4$a     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r11.q = r0     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        L39:
            android.location.LocationManager r4 = r11.l     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            java.lang.String r5 = "network"
            com.amap.api.location.AMapLocationClientOption r0 = r11.m     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            long r6 = r0.getInterval()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            com.amap.api.location.AMapLocationClientOption r0 = r11.m     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            float r8 = r0.getDeviceModeDistanceFilter()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            android.location.LocationListener r9 = r11.q     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r4.requestLocationUpdates(r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        L4e:
            android.location.LocationManager r0 = r11.l     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            boolean r0 = m(r0)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 == 0) goto Ld8
            long r4 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L93
            long r6 = com.amap.api.col.p0003l.t4.s     // Catch: java.lang.Throwable -> L93
            long r4 = r4 - r6
            r6 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto Lb5
            android.content.Context r0 = r11.f3991i     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw=="
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r4)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L95
            android.location.LocationManager r0 = r11.l     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "gps"
            java.lang.String r5 = "force_xtra_injection"
            r0.sendExtraCommand(r4, r5, r3)     // Catch: java.lang.Throwable -> L93
            long r4 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L93
            com.amap.api.col.p0003l.t4.s = r4     // Catch: java.lang.Throwable -> L93
            android.content.Context r0 = r11.f3991i     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "pref"
            android.content.SharedPreferences$Editor r0 = com.autonavi.aps.amapapi.utils.i.a(r0, r4)     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "lagt"
            long r5 = com.amap.api.col.p0003l.t4.s     // Catch: java.lang.Throwable -> L93
            com.autonavi.aps.amapapi.utils.i.a(r0, r4, r5)     // Catch: java.lang.Throwable -> L93
            com.autonavi.aps.amapapi.utils.i.a(r0)     // Catch: java.lang.Throwable -> L93
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L93
            goto Lb5
        L93:
            r0 = move-exception
            goto La4
        L95:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "n_alec"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "OPENSDK_CL"
            java.lang.String r5 = "rlu_n_alec"
            com.autonavi.aps.amapapi.utils.b.a(r0, r4, r5)     // Catch: java.lang.Throwable -> L93
            goto Lb5
        La4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            java.lang.String r5 = "CoarseLocation | sendExtraCommand error: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r4.append(r0)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        Lb5:
            android.location.LocationListener r0 = r11.q     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 != 0) goto Lc0
            com.amap.api.col.3l.t4$a r0 = new com.amap.api.col.3l.t4$a     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r11.q = r0     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        Lc0:
            android.location.LocationManager r4 = r11.l     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            java.lang.String r5 = "gps"
            com.amap.api.location.AMapLocationClientOption r0 = r11.m     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            long r6 = r0.getInterval()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            com.amap.api.location.AMapLocationClientOption r0 = r11.m     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            float r8 = r0.getDeviceModeDistanceFilter()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            android.location.LocationListener r9 = r11.q     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r4.requestLocationUpdates(r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        Ld8:
            boolean r0 = com.amap.api.col.p0003l.t4.u     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r4 = 100
            if (r0 != 0) goto Le2
            boolean r0 = com.amap.api.col.p0003l.t4.w     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 == 0) goto Led
        Le2:
            java.lang.String r0 = "系统返回定位结果超时#2002"
            com.amap.api.location.AMapLocationClientOption r5 = r11.m     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            long r5 = r5.getHttpTimeOut()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r11.d(r4, r0, r5)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        Led:
            boolean r0 = com.amap.api.col.p0003l.t4.u     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 != 0) goto Lfd
            boolean r0 = com.amap.api.col.p0003l.t4.w     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r0 != 0) goto Lfd
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            java.lang.String r0 = "系统定位当前不可用#2003"
            r11.d(r4, r0, r1)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
        Lfd:
            return
        Lfe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CoarseLocation | requestLocationUpdates error: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            com.autonavi.aps.amapapi.utils.d.a()
            java.lang.String r1 = "CoarseLocation"
            java.lang.String r2 = "requestLocationUpdates part2"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
        L117:
            com.autonavi.aps.amapapi.utils.d.a()
            r4 = 0
            r11.o = r4
            r4 = 2121(0x849, float:2.972E-42)
            com.autonavi.aps.amapapi.utils.h.a(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = "#2004"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 101(0x65, float:1.42E-43)
            r11.d(r3, r0, r1)
            return
    }

    public final void b() {
            r3 = this;
            com.autonavi.aps.amapapi.utils.d.a()
            android.location.LocationManager r0 = r3.l
            if (r0 != 0) goto L8
            return
        L8:
            android.location.LocationListener r1 = r3.q     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L2f
            r0.removeUpdates(r1)     // Catch: java.lang.Throwable -> L1d
            android.location.LocationListener r0 = r3.q     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.3l.t4$a r0 = (com.amap.api.col.3l.t4.a) r0     // Catch: java.lang.Throwable -> L1d
            r0.a()     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            r3.q = r0     // Catch: java.lang.Throwable -> L1d
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L1d
            goto L2f
        L1d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CoarseLocation | removeUpdates error "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            com.autonavi.aps.amapapi.utils.d.a()
        L2f:
            android.os.Handler r0 = r3.f3990h     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L38
            r1 = 100
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = 0
            r3.f3989g = r0
            r1 = 0
            r3.a = r1
            r3.f3992j = r1
            r3.f3985c = r0
            r3.f3993k = r0
            com.autonavi.aps.amapapi.filters.a r0 = r3.f3986d
            r0.a()
            return
    }

    public final void f(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L3f
            java.lang.Class<com.amap.api.location.AMapLocation> r0 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L37
            r3.setClassLoader(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "I_MAX_GEO_DIS"
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.f3987e = r0     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "I_MIN_GEO_DIS"
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.f3988f = r0     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "loc"
            android.os.Parcelable r3 = r3.getParcelable(r0)     // Catch: java.lang.Throwable -> L37
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r3.getAdCode()     // Catch: java.lang.Throwable -> L37
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r2.n     // Catch: java.lang.Throwable -> L37
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L37
            com.amap.api.col.p0003l.t4.x = r3     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L37
        L37:
            r3 = move-exception
            java.lang.String r0 = "CoarseLocation"
            java.lang.String r1 = "setLastGeoLocation"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
        L3f:
            return
    }

    public final void l(com.amap.api.location.AMapLocationClientOption r5) {
            r4 = this;
            r4.m = r5
            if (r5 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r5 = new com.amap.api.location.AMapLocationClientOption
            r5.<init>()
            r4.m = r5
        Lb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "option: "
            r5.<init>(r0)
            com.amap.api.location.AMapLocationClientOption r0 = r4.m
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            com.autonavi.aps.amapapi.utils.d.a()
            com.amap.api.location.AMapLocationClientOption r5 = r4.m
            boolean r5 = r5.isOnceLocation()
            if (r5 != 0) goto L2a
            r4.w()
            return
        L2a:
            boolean r5 = r4.t()
            if (r5 != 0) goto L34
            r4.u()
            return
        L34:
            android.content.Context r5 = r4.f3991i     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "pref"
            java.lang.String r1 = "lagt"
            long r2 = com.amap.api.col.p0003l.t4.s     // Catch: java.lang.Throwable -> L42
            long r0 = com.autonavi.aps.amapapi.utils.i.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            com.amap.api.col.p0003l.t4.s = r0     // Catch: java.lang.Throwable -> L42
        L42:
            r4.z()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final int n() {
            r3 = this;
            android.location.LocationManager r0 = r3.l
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = m(r0)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.content.Context r0 = r3.f3991i
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
            boolean r0 = r3.o
            if (r0 != 0) goto L28
            r0 = 4
            return r0
        L28:
            return r2
    }

    public final void q(com.amap.api.location.AMapLocationClientOption r2) {
            r1 = this;
            if (r2 != 0) goto L7
            com.amap.api.location.AMapLocationClientOption r2 = new com.amap.api.location.AMapLocationClientOption
            r2.<init>()
        L7:
            r1.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "option: "
            r2.<init>(r0)
            com.amap.api.location.AMapLocationClientOption r0 = r1.m
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            com.autonavi.aps.amapapi.utils.d.a()
            android.os.Handler r2 = r1.f3990h
            r0 = 100
            r2.removeMessages(r0)
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r1.p
            com.amap.api.location.AMapLocationClientOption r0 = r1.m
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()
            if (r2 == r0) goto L38
            java.lang.Object r2 = r1.n
            monitor-enter(r2)
            r0 = 0
            com.amap.api.col.p0003l.t4.x = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            com.amap.api.location.AMapLocationClientOption r2 = r1.m
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r2.getGeoLanguage()
            r1.p = r2
            return
    }
}
