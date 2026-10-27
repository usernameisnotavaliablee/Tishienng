package com.amap.api.fence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    com.amap.api.col.p0003l.a f4913b;

    public GeoFenceClient(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f4913b = r0
            if (r3 == 0) goto L1d
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L1b
            r2.a = r3     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.a r3 = a(r3)     // Catch: java.lang.Throwable -> L1b
            r2.f4913b = r3     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            goto L25
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Context参数不能为null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L25:
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "<init>"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    private static com.amap.api.col.p0003l.a a(android.content.Context r1) {
            com.amap.api.col.3l.a r0 = new com.amap.api.col.3l.a
            r0.<init>(r1)
            return r0
    }

    public void addGeoFence(com.amap.api.location.DPoint r2, float r3, java.lang.String r4) {
            r1 = this;
            com.amap.api.col.3l.a r0 = r1.f4913b     // Catch: java.lang.Throwable -> L6
            r0.o(r2, r3, r4)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r3 = "GeoFenceClient"
            java.lang.String r4 = "addGeoFence round"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r4)
            return
    }

    public void addGeoFence(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.amap.api.col.3l.a r0 = r1.f4913b     // Catch: java.lang.Throwable -> L6
            r0.q(r2, r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r3 = "GeoFenceClient"
            java.lang.String r0 = "addGeoFence district"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    public void addGeoFence(java.lang.String r8, java.lang.String r9, com.amap.api.location.DPoint r10, float r11, int r12, java.lang.String r13) {
            r7 = this;
            com.amap.api.col.3l.a r0 = r7.f4913b     // Catch: java.lang.Throwable -> Lc
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.r(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "GeoFenceClient"
            java.lang.String r10 = "addGeoFence searche"
            com.autonavi.aps.amapapi.utils.b.a(r8, r9, r10)
            return
    }

    public void addGeoFence(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11) {
            r6 = this;
            com.amap.api.col.3l.a r0 = r6.f4913b     // Catch: java.lang.Throwable -> Lb
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.s(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "GeoFenceClient"
            java.lang.String r9 = "addGeoFence searche"
            com.autonavi.aps.amapapi.utils.b.a(r7, r8, r9)
            return
    }

    public void addGeoFence(java.util.List<com.amap.api.location.DPoint> r2, java.lang.String r3) {
            r1 = this;
            com.amap.api.col.3l.a r0 = r1.f4913b     // Catch: java.lang.Throwable -> L6
            r0.u(r2, r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r3 = "GeoFenceClient"
            java.lang.String r0 = "addGeoFence polygon"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    public android.app.PendingIntent createPendingIntent(java.lang.String r3) {
            r2 = this;
            com.amap.api.col.3l.a r0 = r2.f4913b     // Catch: java.lang.Throwable -> L7
            android.app.PendingIntent r3 = r0.d(r3)     // Catch: java.lang.Throwable -> L7
            return r3
        L7:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "creatPendingIntent"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            r3 = 0
            return r3
    }

    public java.util.List<com.amap.api.fence.GeoFence> getAllGeoFence() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.amap.api.col.3l.a r1 = r4.f4913b     // Catch: java.lang.Throwable -> Lc
            java.util.List r0 = r1.C()     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r1 = move-exception
            java.lang.String r2 = "GeoFenceClient"
            java.lang.String r3 = "getGeoFenceList"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
            return r0
    }

    public boolean isPause() {
            r3 = this;
            com.amap.api.col.3l.a r0 = r3.f4913b     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.a0()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceClient"
            java.lang.String r2 = "isPause"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            r0 = 1
            return r0
    }

    public void pauseGeoFence() {
            r3 = this;
            com.amap.api.col.3l.a r0 = r3.f4913b     // Catch: java.lang.Throwable -> L6
            r0.T()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceClient"
            java.lang.String r2 = "pauseGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void removeGeoFence() {
            r3 = this;
            com.amap.api.col.3l.a r0 = r3.f4913b     // Catch: java.lang.Throwable -> L6
            r0.g()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceClient"
            java.lang.String r2 = "removeGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public boolean removeGeoFence(com.amap.api.fence.GeoFence r3) {
            r2 = this;
            com.amap.api.col.3l.a r0 = r2.f4913b     // Catch: java.lang.Throwable -> L7
            boolean r3 = r0.w(r3)     // Catch: java.lang.Throwable -> L7
            return r3
        L7:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "removeGeoFence1"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            r3 = 0
            return r3
    }

    public void resumeGeoFence() {
            r3 = this;
            com.amap.api.col.3l.a r0 = r3.f4913b     // Catch: java.lang.Throwable -> L6
            r0.X()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceClient"
            java.lang.String r2 = "resumeGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public void setActivateAction(int r3) {
            r2 = this;
            com.amap.api.col.3l.a r0 = r2.f4913b     // Catch: java.lang.Throwable -> L6
            r0.h(r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "setActivatesAction"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void setGeoFenceAble(java.lang.String r2, boolean r3) {
            r1 = this;
            com.amap.api.col.3l.a r0 = r1.f4913b     // Catch: java.lang.Throwable -> L6
            r0.t(r2, r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r3 = "GeoFenceClient"
            java.lang.String r0 = "setGeoFenceAble"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    public void setGeoFenceListener(com.amap.api.fence.GeoFenceListener r3) {
            r2 = this;
            com.amap.api.col.3l.a r0 = r2.f4913b     // Catch: java.lang.Throwable -> L6
            r0.l(r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "setGeoFenceListener"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public void setLocationClientOption(com.amap.api.location.AMapLocationClientOption r3) {
            r2 = this;
            com.amap.api.col.3l.a r0 = r2.f4913b     // Catch: java.lang.Throwable -> L6
            r0.n(r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceClient"
            java.lang.String r1 = "setGeoFenceListener"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }
}
