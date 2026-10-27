package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapLocationClient {
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    com.amap.api.col.p0003l.e2 f4934b;

    public AMapLocationClient(android.content.Context r3) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            a(r3)
            if (r3 == 0) goto L20
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L1e
            r2.a = r0     // Catch: java.lang.Throwable -> L1e
            com.autonavi.aps.amapapi.utils.d.a(r0)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.3l.e2 r0 = new com.amap.api.col.3l.e2     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r0.<init>(r3, r1, r1)     // Catch: java.lang.Throwable -> L1e
            r2.f4934b = r0     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            goto L28
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "Context参数不能为null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L28:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "ne1"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public AMapLocationClient(android.content.Context r3, android.content.Intent r4) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            a(r3)
            if (r3 == 0) goto L1f
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L1d
            r2.a = r3     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.3l.e2 r3 = new com.amap.api.col.3l.e2     // Catch: java.lang.Throwable -> L1d
            android.content.Context r0 = r2.a     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r3.<init>(r0, r4, r1)     // Catch: java.lang.Throwable -> L1d
            r2.f4934b = r3     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            goto L27
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "Context参数不能为null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L27:
            java.lang.String r4 = "AMClt"
            java.lang.String r0 = "ne2"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r0)
            return
    }

    public AMapLocationClient(android.os.Looper r3, android.content.Context r4) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            a(r4)
            if (r4 == 0) goto L1f
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L1d
            r2.a = r4     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.3l.e2 r4 = new com.amap.api.col.3l.e2     // Catch: java.lang.Throwable -> L1d
            android.content.Context r0 = r2.a     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r4.<init>(r0, r1, r3)     // Catch: java.lang.Throwable -> L1d
            r2.f4934b = r4     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            goto L27
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "Context参数不能为null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L27:
            java.lang.String r4 = "AMClt"
            java.lang.String r0 = "ne3"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r0)
            return
    }

    private static void a(android.content.Context r2) throws java.lang.Exception {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()
            com.amap.api.col.3l.n4 r2 = com.amap.api.col.p0003l.ft.a(r2, r0)
            com.amap.api.col.3l.ft$c r0 = r2.a
            com.amap.api.col.3l.ft$c r1 = com.amap.api.col.3l.ft.c.a
            if (r0 != r1) goto Lf
            return
        Lf:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = r2.f3702b
            r0.<init>(r2)
            throw r0
    }

    public static java.lang.String getDeviceId(android.content.Context r0) {
            java.lang.String r0 = com.amap.api.col.p0003l.i4.a0(r0)
            return r0
    }

    public static void setApiKey(java.lang.String r2) {
            com.amap.api.location.AMapLocationClientOption.a = r2     // Catch: java.lang.Throwable -> L3
            return
        L3:
            r2 = move-exception
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "sKey"
            com.autonavi.aps.amapapi.utils.b.a(r2, r0, r1)
            return
    }

    public static void setHost(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            r1 = -1
            com.amap.api.col.p0003l.s6.a = r1
            java.lang.String r1 = ""
            com.amap.api.col.p0003l.s6.f3973b = r1
            return
        Le:
            r0 = 1
            com.amap.api.col.p0003l.s6.a = r0
            com.amap.api.col.p0003l.s6.f3973b = r1
            return
    }

    public static void updatePrivacyAgree(android.content.Context r1, boolean r2) {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()
            com.amap.api.col.p0003l.ft.i(r1, r2, r0)
            return
    }

    public static void updatePrivacyShow(android.content.Context r1, boolean r2, boolean r3) {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()
            com.amap.api.col.p0003l.ft.j(r1, r2, r3, r0)
            return
    }

    public void disableBackgroundLocation(boolean r3) {
            r2 = this;
            com.amap.api.col.3l.e2 r0 = r2.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.B(r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r3 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "dBackL"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void enableBackgroundLocation(int r2, android.app.Notification r3) {
            r1 = this;
            com.amap.api.col.3l.e2 r0 = r1.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.e(r2, r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r3 = "AMClt"
            java.lang.String r0 = "eBackL"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    public com.amap.api.location.AMapLocation getLastKnownLocation() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            com.amap.api.location.AMapLocation r0 = r0.c0()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "gLastL"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L11:
            r0 = 0
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = "6.4.3"
            return r0
    }

    public boolean isStarted() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "isS"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L11:
            r0 = 0
            return r0
    }

    public void onDestroy() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.W()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "onDy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void setLocationListener(com.amap.api.location.AMapLocationListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.amap.api.col.3l.e2 r0 = r2.f4934b     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            r0.x(r3)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            goto L15
        Lc:
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "listener参数不能为null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> La
            throw r3     // Catch: java.lang.Throwable -> La
        L15:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "sLocL"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void setLocationOption(com.amap.api.location.AMapLocationClientOption r3) {
            r2 = this;
            if (r3 == 0) goto L2f
            com.amap.api.col.3l.e2 r0 = r2.f4934b     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            r0.w(r3)     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r3 = move-exception
            goto L37
        Lc:
            boolean r0 = r3.f4939b     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L2e
            r0 = 0
            r3.f4939b = r0     // Catch: java.lang.Throwable -> La
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La
            r0.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = r3.f4940c     // Catch: java.lang.Throwable -> La
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L27
            java.lang.String r1 = "amap_loc_scenes_type"
            java.lang.String r3 = r3.f4940c     // Catch: java.lang.Throwable -> La
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> La
        L27:
            android.content.Context r3 = r2.a     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = "O019"
            com.autonavi.aps.amapapi.utils.h.a(r3, r1, r0)     // Catch: java.lang.Throwable -> La
        L2e:
            return
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "LocationManagerOption参数不能为null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> La
            throw r3     // Catch: java.lang.Throwable -> La
        L37:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "sLocnO"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void startAssistantLocation(android.webkit.WebView r3) {
            r2 = this;
            com.amap.api.col.3l.e2 r0 = r2.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.m(r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r3 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "sttAssL1"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void startLocation() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.G()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "stl"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void stopAssistantLocation() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.f0()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "stAssL"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void stopLocation() {
            r3 = this;
            com.amap.api.col.3l.e2 r0 = r3.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.R()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r1 = "AMClt"
            java.lang.String r2 = "stl"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void unRegisterLocationListener(com.amap.api.location.AMapLocationListener r3) {
            r2 = this;
            com.amap.api.col.3l.e2 r0 = r2.f4934b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.N(r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r3 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r0 = "AMClt"
            java.lang.String r1 = "unRL"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }
}
