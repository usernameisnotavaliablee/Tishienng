package com.autonavi.aps.amapapi.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a extends com.amap.api.location.AMapLocation {

    /* renamed from: d, reason: collision with root package name */
    protected java.lang.String f5708d;

    /* renamed from: e, reason: collision with root package name */
    boolean f5709e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f5710f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5711g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5712h;

    /* renamed from: i, reason: collision with root package name */
    private int f5713i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5714j;

    /* renamed from: k, reason: collision with root package name */
    private int f5715k;
    private java.lang.String l;
    private org.json.JSONObject m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;

    public a(java.lang.String r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.String r3 = ""
            r2.f5708d = r3
            r0 = 0
            r2.f5711g = r0
            r2.f5712h = r3
            r2.f5714j = r3
            r1 = 0
            r2.f5715k = r1
            java.lang.String r1 = "new"
            r2.l = r1
            r2.m = r0
            r2.n = r3
            r1 = 1
            r2.f5709e = r1
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.f5710f = r1
            r2.o = r3
            r2.p = r0
            return
    }

    private void i(java.lang.String r1) {
            r0 = this;
            r0.n = r1
            return
    }

    private void j(java.lang.String r7) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "\\*"
            java.lang.String[] r0 = r7.split(r0)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r1) goto L42
            r4 = r0[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L3f
            java.lang.String r0 = ","
            java.lang.String[] r0 = r4.split(r0)
            r1 = r0[r2]
            double r1 = com.autonavi.aps.amapapi.utils.j.c(r1)
            r6.setLongitude(r1)
            r1 = 1
            r1 = r0[r1]
            double r1 = com.autonavi.aps.amapapi.utils.j.c(r1)
            r6.setLatitude(r1)
            r1 = 2
            r0 = r0[r1]
            int r0 = com.autonavi.aps.amapapi.utils.j.e(r0)
            float r0 = (float) r0
            r6.setAccuracy(r0)
            goto L42
        L3f:
            int r3 = r3 + 1
            goto L10
        L42:
            r6.o = r7
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f5711g
            return r0
    }

    public final void a(int r1) {
            r0 = this;
            r0.f5715k = r1
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f5711g = r1
            return
    }

    public final void a(org.json.JSONObject r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public final void a(boolean r1) {
            r0 = this;
            r0.f5709e = r1
            return
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f5712h
            return r0
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            r0.f5712h = r1
            return
    }

    public final void b(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "flr"
            java.lang.String r1 = "floor"
            java.lang.String r2 = "pid"
            java.lang.String r3 = "poiid"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "type"
            java.lang.String r5 = r6.l     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.e(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "retype"
            java.lang.String r5 = r6.f5714j     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.d(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "cens"
            java.lang.String r5 = r6.o     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.j(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "desc"
            java.lang.String r5 = r6.f5708d     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.g(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "coord"
            int r5 = r6.f5713i     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.c(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "mcell"
            java.lang.String r5 = r6.n     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.i(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "isReversegeo"
            boolean r5 = r6.f5709e     // Catch: java.lang.Throwable -> L75
            boolean r4 = r7.optBoolean(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.a(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "geoLanguage"
            java.lang.String r5 = r6.f5710f     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r7.optString(r4, r5)     // Catch: java.lang.Throwable -> L75
            r6.f(r4)     // Catch: java.lang.Throwable -> L75
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r7, r3)     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L77
            java.lang.String r3 = r7.optString(r3)     // Catch: java.lang.Throwable -> L75
            r6.setBuildingId(r3)     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r7 = move-exception
            goto L9f
        L77:
            boolean r3 = com.autonavi.aps.amapapi.utils.j.a(r7, r2)     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L84
            java.lang.String r2 = r7.optString(r2)     // Catch: java.lang.Throwable -> L75
            r6.setBuildingId(r2)     // Catch: java.lang.Throwable -> L75
        L84:
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r7, r1)     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L91
            java.lang.String r1 = r7.optString(r1)     // Catch: java.lang.Throwable -> L75
            r6.setFloor(r1)     // Catch: java.lang.Throwable -> L75
        L91:
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r7, r0)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L9e
            java.lang.String r7 = r7.optString(r0)     // Catch: java.lang.Throwable -> L75
            r6.setFloor(r7)     // Catch: java.lang.Throwable -> L75
        L9e:
            return
        L9f:
            java.lang.String r0 = "AmapLoc"
            com.autonavi.aps.amapapi.utils.b.a(r7, r0, r0)
            return
    }

    public final int c() {
            r1 = this;
            int r0 = r1.f5713i
            return r0
    }

    public final void c(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r2 = 0
            r1.f5713i = r2
            goto L21
        L12:
            java.lang.String r0 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1e
            r2 = 1
            r1.f5713i = r2
            goto L21
        L1e:
            r2 = -1
            r1.f5713i = r2
        L21:
            int r2 = r1.f5713i
            if (r2 != 0) goto L2b
            java.lang.String r2 = "WGS84"
            super.setCoordType(r2)
            return
        L2b:
            java.lang.String r2 = "GCJ02"
            super.setCoordType(r2)
            return
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f5714j
            return r0
    }

    public final void d(java.lang.String r1) {
            r0 = this;
            r0.f5714j = r1
            return
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public final void e(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public final org.json.JSONObject f() {
            r1 = this;
            org.json.JSONObject r0 = r1.m
            return r0
    }

    public final void f(java.lang.String r1) {
            r0 = this;
            r0.f5710f = r1
            return
    }

    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public final void g(java.lang.String r1) {
            r0 = this;
            r0.f5708d = r1
            return
    }

    public final com.autonavi.aps.amapapi.model.a h() {
            r5 = this;
            java.lang.String r0 = r5.g()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 3
            if (r1 == r3) goto L17
            return r2
        L17:
            com.autonavi.aps.amapapi.model.a r1 = new com.autonavi.aps.amapapi.model.a
            java.lang.String r3 = ""
            r1.<init>(r3)
            java.lang.String r3 = r5.getProvider()
            r1.setProvider(r3)
            r3 = 0
            r3 = r0[r3]
            double r3 = com.autonavi.aps.amapapi.utils.j.c(r3)
            r1.setLongitude(r3)
            r3 = 1
            r3 = r0[r3]
            double r3 = com.autonavi.aps.amapapi.utils.j.c(r3)
            r1.setLatitude(r3)
            r3 = 2
            r0 = r0[r3]
            float r0 = com.autonavi.aps.amapapi.utils.j.d(r0)
            r1.setAccuracy(r0)
            java.lang.String r0 = r5.getCityCode()
            r1.setCityCode(r0)
            java.lang.String r0 = r5.getAdCode()
            r1.setAdCode(r0)
            java.lang.String r0 = r5.getCountry()
            r1.setCountry(r0)
            java.lang.String r0 = r5.getProvince()
            r1.setProvince(r0)
            java.lang.String r0 = r5.getCity()
            r1.setCity(r0)
            long r3 = r5.getTime()
            r1.setTime(r3)
            java.lang.String r0 = r5.e()
            r1.e(r0)
            int r0 = r5.c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.c(r0)
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r1)
            if (r0 != 0) goto L86
            return r2
        L86:
            return r1
    }

    public final void h(java.lang.String r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public final boolean i() {
            r1 = this;
            boolean r0 = r1.f5709e
            return r0
    }

    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.f5710f
            return r0
    }

    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.p
            return r0
    }

    public final int l() {
            r1 = this;
            int r0 = r1.f5715k
            return r0
    }

    @Override // com.amap.api.location.AMapLocation
    public final org.json.JSONObject toJson(int r4) {
            r3 = this;
            java.lang.String r0 = "offpct"
            org.json.JSONObject r1 = super.toJson(r4)     // Catch: java.lang.Throwable -> L50
            r2 = 1
            if (r4 == r2) goto L10
            r0 = 2
            if (r4 == r0) goto L52
            r0 = 3
            if (r4 == r0) goto L52
            return r1
        L10:
            java.lang.String r4 = "retype"
            java.lang.String r2 = r3.f5714j     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "cens"
            java.lang.String r2 = r3.o     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "coord"
            int r2 = r3.f5713i     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "mcell"
            java.lang.String r2 = r3.n     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "desc"
            java.lang.String r2 = r3.f5708d     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "address"
            java.lang.String r2 = r3.getAddress()     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L50
            org.json.JSONObject r4 = r3.m     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r1, r0)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            org.json.JSONObject r4 = r3.m     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r4.getString(r0)     // Catch: java.lang.Throwable -> L50
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r4 = move-exception
            goto L68
        L52:
            java.lang.String r4 = "type"
            java.lang.String r0 = r3.l     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "isReversegeo"
            boolean r0 = r3.f5709e     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "geoLanguage"
            java.lang.String r0 = r3.f5710f     // Catch: java.lang.Throwable -> L50
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L50
            return r1
        L68:
            java.lang.String r0 = "AmapLoc"
            java.lang.String r1 = "toStr"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            r4 = 0
            return r4
    }

    @Override // com.amap.api.location.AMapLocation
    public final java.lang.String toStr() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.toStr(r0)
            return r0
    }

    @Override // com.amap.api.location.AMapLocation
    public final java.lang.String toStr(int r4) {
            r3 = this;
            r0 = 0
            org.json.JSONObject r4 = r3.toJson(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "nb"
            java.lang.String r2 = r3.p     // Catch: java.lang.Throwable -> Ld
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> Ld
            goto L16
        Ld:
            r4 = move-exception
            java.lang.String r1 = "AMapLocation"
            java.lang.String r2 = "toStr part2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r2)
            r4 = r0
        L16:
            if (r4 != 0) goto L19
            return r0
        L19:
            java.lang.String r4 = r4.toString()
            return r4
    }
}
