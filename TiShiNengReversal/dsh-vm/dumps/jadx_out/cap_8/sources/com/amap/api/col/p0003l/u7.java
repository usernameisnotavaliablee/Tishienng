package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u7 {

    /* renamed from: g, reason: collision with root package name */
    static com.autonavi.aps.amapapi.storage.b f4023g;

    /* renamed from: h, reason: collision with root package name */
    static com.amap.api.col.p0003l.f6 f4024h;

    /* renamed from: i, reason: collision with root package name */
    static long f4025i;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f4026b;

    /* renamed from: c, reason: collision with root package name */
    com.autonavi.aps.amapapi.storage.b f4027c;

    /* renamed from: d, reason: collision with root package name */
    com.autonavi.aps.amapapi.storage.b f4028d;

    /* renamed from: e, reason: collision with root package name */
    long f4029e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4030f;

    static {
            return
    }

    public u7(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f4026b = r0
            r2.f4027c = r0
            r2.f4028d = r0
            r0 = 0
            r2.f4029e = r0
            r0 = 0
            r2.f4030f = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.a = r3
            return
    }

    private void g() {
            r5 = this;
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g
            if (r0 == 0) goto L12
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.amap.api.col.p0003l.u7.f4025i
            long r0 = r0 - r2
            r2 = 180000(0x2bf20, double:8.8932E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2a
        L12:
            com.autonavi.aps.amapapi.storage.b r0 = r5.h()
            long r1 = com.autonavi.aps.amapapi.utils.j.b()
            com.amap.api.col.p0003l.u7.f4025i = r1
            if (r0 == 0) goto L2a
            com.amap.api.location.AMapLocation r1 = r0.a()
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1)
            if (r1 == 0) goto L2a
            com.amap.api.col.p0003l.u7.f4023g = r0
        L2a:
            return
    }

    private com.autonavi.aps.amapapi.storage.b h() {
            r7 = this;
            android.content.Context r0 = r7.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r7.b()
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.u7.f4024h     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.String r2 = "_id=1"
            java.lang.Class<com.autonavi.aps.amapapi.storage.b> r3 = com.autonavi.aps.amapapi.storage.b.class
            java.util.List r0 = r0.p(r2, r3)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L6f
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L6a
            if (r2 <= 0) goto L6f
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L6a
            com.autonavi.aps.amapapi.storage.b r0 = (com.autonavi.aps.amapapi.storage.b) r0     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r0.c()     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.amap.api.col.p0003l.j4.g(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "UTF-8"
            if (r2 == 0) goto L47
            int r4 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r4 <= 0) goto L47
            java.lang.String r4 = r7.f4026b     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.autonavi.aps.amapapi.security.a.b(r2, r4)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            int r4 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r4 <= 0) goto L47
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L45
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r1 = move-exception
            goto L8f
        L47:
            r4 = r1
        L48:
            java.lang.String r2 = r0.b()     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.amap.api.col.p0003l.j4.g(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L65
            int r5 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r5 <= 0) goto L65
            java.lang.String r5 = r7.f4026b     // Catch: java.lang.Throwable -> L45
            byte[] r2 = com.autonavi.aps.amapapi.security.a.b(r2, r5)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L65
            int r5 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r5 <= 0) goto L65
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L45
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45
        L65:
            r0.a(r1)     // Catch: java.lang.Throwable -> L45
            r1 = r4
            goto L70
        L6a:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L8f
        L6f:
            r0 = r1
        L70:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L8e
            com.amap.api.location.AMapLocation r2 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = ""
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L45
            com.autonavi.aps.amapapi.utils.b.a(r2, r3)     // Catch: java.lang.Throwable -> L45
            boolean r1 = com.autonavi.aps.amapapi.utils.j.b(r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L8e
            r0.a(r2)     // Catch: java.lang.Throwable -> L45
        L8e:
            return r0
        L8f:
            java.lang.String r2 = "LastLocationManager"
            java.lang.String r3 = "readLastFix"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
            return r0
    }

    public final com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r8, java.lang.String r9, long r10) {
            r7 = this;
            if (r8 != 0) goto L3
            return r8
        L3:
            int r0 = r8.getErrorCode()
            if (r0 == 0) goto L7c
            int r0 = r8.getLocationType()
            r1 = 1
            if (r0 == r1) goto L7c
            int r0 = r8.getErrorCode()
            r2 = 7
            if (r0 != r2) goto L18
            goto L7c
        L18:
            r7.g()     // Catch: java.lang.Throwable -> L49
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7c
            com.amap.api.location.AMapLocation r0 = r0.a()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L26
            goto L7c
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L49
            com.autonavi.aps.amapapi.storage.b r9 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L49
            long r4 = r9.d()     // Catch: java.lang.Throwable -> L49
            long r2 = r2 - r4
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L43
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 > 0) goto L43
            r9 = 1
            goto L44
        L43:
            r9 = 0
        L44:
            r10 = 3
            r8.setTrustedLevel(r10)     // Catch: java.lang.Throwable -> L49
            goto L59
        L49:
            r9 = move-exception
            goto L75
        L4b:
            com.autonavi.aps.amapapi.storage.b r10 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L49
            java.lang.String r10 = r10.b()     // Catch: java.lang.Throwable -> L49
            boolean r9 = com.autonavi.aps.amapapi.utils.j.a(r10, r9)     // Catch: java.lang.Throwable -> L49
            r10 = 2
            r8.setTrustedLevel(r10)     // Catch: java.lang.Throwable -> L49
        L59:
            if (r9 == 0) goto L7c
            com.autonavi.aps.amapapi.storage.b r9 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L49
            com.amap.api.location.AMapLocation r9 = r9.a()     // Catch: java.lang.Throwable -> L49
            r10 = 9
            r9.setLocationType(r10)     // Catch: java.lang.Throwable -> L71
            r9.setFixLastLocation(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r8.getLocationDetail()     // Catch: java.lang.Throwable -> L71
            r9.setLocationDetail(r8)     // Catch: java.lang.Throwable -> L71
            return r9
        L71:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            java.lang.String r10 = "LastLocationManager"
            java.lang.String r11 = "fixLastLocation"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r11)
        L7c:
            return r8
    }

    public final void b() {
            r3 = this;
            boolean r0 = r3.f4030f
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = r3.f4026b     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.String r0 = "MD5"
            java.lang.String r1 = com.amap.api.col.p0003l.i4.P()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = com.autonavi.aps.amapapi.security.a.a(r0, r1)     // Catch: java.lang.Throwable -> L16
            r3.f4026b = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L2c
        L18:
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.u7.f4024h     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L33
            java.lang.Class<com.autonavi.aps.amapapi.storage.c> r0 = com.autonavi.aps.amapapi.storage.c.class
            com.amap.api.col.3l.e6 r0 = com.amap.api.col.p0003l.f6.c(r0)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.f6 r1 = new com.amap.api.col.3l.f6     // Catch: java.lang.Throwable -> L16
            android.content.Context r2 = r3.a     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.p0003l.u7.f4024h = r1     // Catch: java.lang.Throwable -> L16
            goto L33
        L2c:
            java.lang.String r1 = "LastLocationManager"
            java.lang.String r2 = "<init>:DBOperation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L33:
            r0 = 1
            r3.f4030f = r0
            return
    }

    public final boolean c(com.amap.api.location.AMapLocation r6, java.lang.String r7) {
            r5 = this;
            android.content.Context r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L71
            if (r6 != 0) goto L8
            goto L71
        L8:
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r6)
            if (r0 == 0) goto L71
            int r0 = r6.getLocationType()
            r2 = 2
            if (r0 == r2) goto L71
            boolean r0 = r6.isMock()
            if (r0 != 0) goto L71
            boolean r0 = r6.isFixLastLocation()
            if (r0 == 0) goto L22
            goto L71
        L22:
            com.autonavi.aps.amapapi.storage.b r0 = new com.autonavi.aps.amapapi.storage.b
            r0.<init>()
            r0.a(r6)
            int r6 = r6.getLocationType()
            r2 = 1
            if (r6 != r2) goto L36
            r6 = 0
            r0.a(r6)
            goto L39
        L36:
            r0.a(r7)
        L39:
            com.amap.api.col.p0003l.u7.f4023g = r0     // Catch: java.lang.Throwable -> L5a
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L5a
            com.amap.api.col.p0003l.u7.f4025i = r6     // Catch: java.lang.Throwable -> L5a
            r5.f4027c = r0     // Catch: java.lang.Throwable -> L5a
            com.autonavi.aps.amapapi.storage.b r6 = r5.f4028d     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            com.amap.api.location.AMapLocation r6 = r6.a()     // Catch: java.lang.Throwable -> L5a
            com.amap.api.location.AMapLocation r7 = r0.a()     // Catch: java.lang.Throwable -> L5a
            float r6 = com.autonavi.aps.amapapi.utils.j.a(r6, r7)     // Catch: java.lang.Throwable -> L5a
            r7 = 1140457472(0x43fa0000, float:500.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L5c
            return r1
        L5a:
            r6 = move-exception
            goto L6a
        L5c:
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L5a
            long r3 = r5.f4029e     // Catch: java.lang.Throwable -> L5a
            long r6 = r6 - r3
            r3 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L71
            return r2
        L6a:
            java.lang.String r7 = "LastLocationManager"
            java.lang.String r0 = "setLastFix"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7, r0)
        L71:
            return r1
    }

    public final com.amap.api.location.AMapLocation d() {
            r2 = this;
            r2.g()
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            com.amap.api.location.AMapLocation r0 = r0.a()
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r0 != 0) goto L14
            return r1
        L14:
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g
            com.amap.api.location.AMapLocation r0 = r0.a()
            return r0
    }

    public final void e() {
            r3 = this;
            r3.f()     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r3.f4029e = r0     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r3.f4030f = r0     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r3.f4027c = r0     // Catch: java.lang.Throwable -> L10
            r3.f4028d = r0     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "LastLocationManager"
            java.lang.String r2 = "destroy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void f() {
            r6 = this;
            java.lang.String r0 = "UTF-8"
            r6.b()     // Catch: java.lang.Throwable -> L69
            com.autonavi.aps.amapapi.storage.b r1 = r6.f4027c     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L9c
            com.amap.api.location.AMapLocation r1 = r1.a()     // Catch: java.lang.Throwable -> L69
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L9c
            com.amap.api.col.3l.f6 r1 = com.amap.api.col.p0003l.u7.f4024h     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L9c
            com.autonavi.aps.amapapi.storage.b r1 = r6.f4027c     // Catch: java.lang.Throwable -> L69
            com.autonavi.aps.amapapi.storage.b r2 = r6.f4028d     // Catch: java.lang.Throwable -> L69
            if (r1 == r2) goto L9c
            long r1 = r1.d()     // Catch: java.lang.Throwable -> L69
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L29
            goto L9c
        L29:
            com.autonavi.aps.amapapi.storage.b r1 = r6.f4027c     // Catch: java.lang.Throwable -> L69
            com.amap.api.location.AMapLocation r1 = r1.a()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.toStr()     // Catch: java.lang.Throwable -> L69
            com.autonavi.aps.amapapi.storage.b r2 = r6.f4027c     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L69
            com.autonavi.aps.amapapi.storage.b r3 = r6.f4027c     // Catch: java.lang.Throwable -> L69
            r6.f4028d = r3     // Catch: java.lang.Throwable -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L69
            r4 = 0
            if (r3 != 0) goto L6b
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r6.f4026b     // Catch: java.lang.Throwable -> L69
            byte[] r1 = com.autonavi.aps.amapapi.security.a.a(r1, r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = com.amap.api.col.p0003l.j4.f(r1)     // Catch: java.lang.Throwable -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L66
            byte[] r0 = r2.getBytes(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r6.f4026b     // Catch: java.lang.Throwable -> L69
            byte[] r0 = com.autonavi.aps.amapapi.security.a.a(r0, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = com.amap.api.col.p0003l.j4.f(r0)     // Catch: java.lang.Throwable -> L69
        L66:
            r0 = r4
            r4 = r1
            goto L6c
        L69:
            r0 = move-exception
            goto L9d
        L6b:
            r0 = r4
        L6c:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L9c
            com.autonavi.aps.amapapi.storage.b r1 = new com.autonavi.aps.amapapi.storage.b     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            r1.b(r4)     // Catch: java.lang.Throwable -> L69
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L69
            r1.a(r2)     // Catch: java.lang.Throwable -> L69
            r1.a(r0)     // Catch: java.lang.Throwable -> L69
            com.amap.api.col.3l.f6 r0 = com.amap.api.col.p0003l.u7.f4024h     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "_id=1"
            r0.h(r1, r2)     // Catch: java.lang.Throwable -> L69
            long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L69
            r6.f4029e = r0     // Catch: java.lang.Throwable -> L69
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L9c
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L69
            r0.a(r1)     // Catch: java.lang.Throwable -> L69
        L9c:
            return
        L9d:
            java.lang.String r1 = "LastLocationManager"
            java.lang.String r2 = "saveLastFix"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }
}
