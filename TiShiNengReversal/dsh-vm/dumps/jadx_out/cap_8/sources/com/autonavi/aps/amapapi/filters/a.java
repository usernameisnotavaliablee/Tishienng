package com.autonavi.aps.amapapi.filters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    com.autonavi.aps.amapapi.model.a a;

    /* renamed from: b, reason: collision with root package name */
    long f5701b;

    /* renamed from: c, reason: collision with root package name */
    long f5702c;

    /* renamed from: d, reason: collision with root package name */
    int f5703d;

    /* renamed from: e, reason: collision with root package name */
    long f5704e;

    /* renamed from: f, reason: collision with root package name */
    com.amap.api.location.AMapLocation f5705f;

    /* renamed from: g, reason: collision with root package name */
    long f5706g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5707h;

    public a() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r1 = 0
            r4.f5701b = r1
            r4.f5702c = r1
            r3 = 1
            r4.f5707h = r3
            r3 = 0
            r4.f5703d = r3
            r4.f5704e = r1
            r4.f5705f = r0
            r4.f5706g = r1
            return
    }

    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.model.a r3) {
            r2 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r3)
            if (r0 == 0) goto L2c
            boolean r0 = r2.f5707h
            if (r0 == 0) goto L27
            long r0 = r3.getTime()
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a(r0)
            if (r0 == 0) goto L27
            int r0 = r3.getLocationType()
            r1 = 5
            if (r0 == r1) goto L22
            int r0 = r3.getLocationType()
            r1 = 6
            if (r0 != r1) goto L2c
        L22:
            r0 = 4
            r3.setLocationType(r0)
            return r3
        L27:
            int r0 = r2.f5703d
            r3.setLocationType(r0)
        L2c:
            return r3
    }

    public final com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r6) {
            r5 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r6)
            if (r0 != 0) goto L7
            goto L1a
        L7:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r5.f5706g
            long r0 = r0 - r2
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r5.f5706g = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
        L1a:
            return r6
        L1b:
            com.amap.api.location.AMapLocation r0 = r5.f5705f
            if (r0 != 0) goto L22
            r5.f5705f = r6
            return r6
        L22:
            r1 = 1
            int r0 = r0.getLocationType()
            if (r1 == r0) goto L3a
            com.amap.api.location.AMapLocation r0 = r5.f5705f
            java.lang.String r0 = r0.getProvider()
            java.lang.String r1 = "gps"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3a
            r5.f5705f = r6
            return r6
        L3a:
            com.amap.api.location.AMapLocation r0 = r5.f5705f
            double r0 = r0.getAltitude()
            double r2 = r6.getAltitude()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L59
            com.amap.api.location.AMapLocation r0 = r5.f5705f
            double r0 = r0.getLongitude()
            double r2 = r6.getLongitude()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L59
            r5.f5705f = r6
            return r6
        L59:
            long r0 = r6.getTime()
            com.amap.api.location.AMapLocation r2 = r5.f5705f
            long r2 = r2.getTime()
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 30000(0x7530, double:1.4822E-319)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L71
            r5.f5705f = r6
            return r6
        L71:
            com.amap.api.location.AMapLocation r2 = r5.f5705f
            float r2 = r2.getSpeed()
            float r3 = r6.getSpeed()
            float r2 = r2 + r3
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1157234688(0x44fa0000, float:2000.0)
            float r2 = r2 / r0
            com.amap.api.location.AMapLocation r0 = r5.f5705f
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r6, r0)
            com.amap.api.location.AMapLocation r1 = r5.f5705f
            float r1 = r1.getAccuracy()
            float r3 = r6.getAccuracy()
            float r1 = r1 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r2 = r2 + r1
            r1 = 1161527296(0x453b8000, float:3000.0)
            float r2 = r2 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La3
            com.amap.api.location.AMapLocation r6 = r5.f5705f
            return r6
        La3:
            r5.f5705f = r6
            return r6
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = r0.f5704e
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1c
            r0.a = r1
            long r1 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5704e = r1
            com.autonavi.aps.amapapi.model.a r1 = r0.a
            return r1
        L1c:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5704e = r2
            com.autonavi.aps.amapapi.model.a r2 = r0.a
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r2)
            if (r2 == 0) goto L173
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r1)
            if (r2 != 0) goto L32
            goto L173
        L32:
            long r2 = r1.getTime()
            com.autonavi.aps.amapapi.model.a r6 = r0.a
            long r6 = r6.getTime()
            r8 = 1133903872(0x43960000, float:300.0)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L4b
            float r2 = r1.getAccuracy()
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L4b
            return r1
        L4b:
            java.lang.String r2 = "gps"
            java.lang.String r3 = r1.getProvider()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
        L60:
            int r2 = r1.c()
            com.autonavi.aps.amapapi.model.a r3 = r0.a
            int r3 = r3.c()
            if (r2 == r3) goto L75
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
        L75:
            java.lang.String r2 = r1.getBuildingId()
            if (r2 == 0) goto L9e
            java.lang.String r2 = r1.getBuildingId()
            com.autonavi.aps.amapapi.model.a r3 = r0.a
            java.lang.String r3 = r3.getBuildingId()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            java.lang.String r2 = r1.getBuildingId()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L9e
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
        L9e:
            int r2 = r1.getLocationType()
            r0.f5703d = r2
            com.autonavi.aps.amapapi.model.a r2 = r0.a
            float r2 = com.autonavi.aps.amapapi.utils.j.a(r1, r2)
            com.autonavi.aps.amapapi.model.a r3 = r0.a
            float r3 = r3.getAccuracy()
            float r6 = r1.getAccuracy()
            float r7 = r6 - r3
            long r9 = com.autonavi.aps.amapapi.utils.j.b()
            long r11 = r0.f5701b
            long r11 = r9 - r11
            r13 = 0
            r14 = 1
            r15 = 1120403456(0x42c80000, float:100.0)
            r16 = 1133871104(0x43958000, float:299.0)
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 > 0) goto Ld0
            int r17 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r17 <= 0) goto Ld0
            r17 = 1
            goto Ld2
        Ld0:
            r17 = 0
        Ld2:
            int r18 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r18 <= 0) goto Ldb
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 <= 0) goto Ldb
            r13 = 1
        Ldb:
            r19 = r4
            r4 = 0
            if (r17 != 0) goto L154
            if (r13 == 0) goto Le4
            goto L154
        Le4:
            int r13 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r13 >= 0) goto Lf1
            if (r18 <= 0) goto Lf1
            r0.f5701b = r9
            r0.a = r1
            r0.f5702c = r4
            return r1
        Lf1:
            int r13 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r13 > 0) goto Lf7
            r0.f5702c = r4
        Lf7:
            r4 = 1092616192(0x41200000, float:10.0)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L131
            double r4 = (double) r2
            r13 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 <= 0) goto L131
            r2 = 1084227584(0x40a00000, float:5.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L131
            r2 = -1013579776(0xffffffffc3960000, float:-300.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L11c
            com.autonavi.aps.amapapi.model.a r1 = r0.a
            com.autonavi.aps.amapapi.model.a r1 = r0.b(r1)
            r0.a = r1
            return r1
        L11c:
            float r3 = r3 / r6
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L128
            r0.f5701b = r9
            r0.a = r1
            return r1
        L128:
            com.autonavi.aps.amapapi.model.a r1 = r0.a
            com.autonavi.aps.amapapi.model.a r1 = r0.b(r1)
            r0.a = r1
            return r1
        L131:
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 < 0) goto L14b
            int r2 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r2 < 0) goto L142
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
        L142:
            com.autonavi.aps.amapapi.model.a r1 = r0.a
            com.autonavi.aps.amapapi.model.a r1 = r0.b(r1)
            r0.a = r1
            return r1
        L14b:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
        L154:
            long r2 = r0.f5702c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L15d
            r0.f5702c = r9
            goto L16a
        L15d:
            long r2 = r9 - r2
            int r6 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r6 <= 0) goto L16a
            r0.f5701b = r9
            r0.a = r1
            r0.f5702c = r4
            return r1
        L16a:
            com.autonavi.aps.amapapi.model.a r1 = r0.a
            com.autonavi.aps.amapapi.model.a r1 = r0.b(r1)
            r0.a = r1
            return r1
        L173:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            r0.f5701b = r2
            r0.a = r1
            return r1
    }

    public final void a() {
            r3 = this;
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.f5701b = r1
            r3.f5702c = r1
            r3.f5705f = r0
            r3.f5706g = r1
            return
    }

    public final void a(boolean r1) {
            r0 = this;
            r0.f5707h = r1
            return
    }
}
