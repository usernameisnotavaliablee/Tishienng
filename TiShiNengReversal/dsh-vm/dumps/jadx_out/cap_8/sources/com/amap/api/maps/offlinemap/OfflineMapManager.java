package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class OfflineMapManager {
    com.amap.api.col.p0003l.h0 a;

    /* renamed from: b, reason: collision with root package name */
    com.amap.api.col.p0003l.c0 f5038b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f5039c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener f5040d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener f5041e;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Handler f5042f;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f5043g;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OfflineMapDownloadListener {
        void onCheckUpdate(boolean r1, java.lang.String r2);

        void onDownload(int r1, int r2, java.lang.String r3);

        void onRemove(boolean r1, java.lang.String r2, java.lang.String r3);
    }

    public OfflineMapManager(android.content.Context r4, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener r5) throws java.lang.Exception {
            r3 = this;
            r3.<init>()
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r4, r0)
            com.amap.api.col.3l.ft$c r1 = r0.a
            com.amap.api.col.3l.ft$c r2 = com.amap.api.col.3l.ft.c.a
            if (r1 != r2) goto L44
            r3.f5040d = r5
            android.content.Context r5 = r4.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            r3.f5039c = r5
            android.os.Handler r5 = new android.os.Handler
            android.content.Context r0 = r3.f5039c
            android.os.Looper r0 = r0.getMainLooper()
            r5.<init>(r0)
            r3.f5042f = r5
            android.os.Handler r5 = new android.os.Handler
            android.content.Context r0 = r3.f5039c
            android.os.Looper r0 = r0.getMainLooper()
            r5.<init>(r0)
            r3.f5043g = r5
            r3.a(r4)
            com.amap.api.col.3l.k4 r4 = com.amap.api.col.p0003l.k4.a()
            android.content.Context r5 = r3.f5039c
            r4.c(r5)
            return
        L44:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = r0.f3702b
            r4.<init>(r5)
            throw r4
    }

    public OfflineMapManager(android.content.Context r1, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener r2, com.amap.api.maps.AMap r3) {
            r0 = this;
            r0.<init>()
            r0.f5040d = r2
            android.content.Context r2 = r1.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.f5039c = r2
            android.os.Handler r2 = new android.os.Handler
            android.content.Context r3 = r0.f5039c
            android.os.Looper r3 = r3.getMainLooper()
            r2.<init>(r3)
            r0.f5042f = r2
            android.os.Handler r2 = new android.os.Handler
            android.content.Context r3 = r0.f5039c
            android.os.Looper r3 = r3.getMainLooper()
            r2.<init>(r3)
            r0.f5043g = r2
            r0.a(r1)     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    static /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener a(com.amap.api.maps.offlinemap.OfflineMapManager r0) {
            com.amap.api.maps.offlinemap.OfflineMapManager$OfflineMapDownloadListener r0 = r0.f5040d
            return r0
    }

    private void a() throws com.amap.api.maps.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f5039c
            boolean r0 = com.amap.api.col.p0003l.b3.h0(r0)
            if (r0 == 0) goto L9
            return
        L9:
            com.amap.api.maps.AMapException r0 = new com.amap.api.maps.AMapException
            java.lang.String r1 = "http连接失败 - ConnectionException"
            r0.<init>(r1)
            throw r0
    }

    private void a(android.content.Context r3) {
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.f5039c = r0
            r1 = 0
            com.amap.api.col.p0003l.c0.p = r1
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.b(r0)
            r2.f5038b = r0
            com.amap.api.maps.offlinemap.OfflineMapManager$1 r1 = new com.amap.api.maps.offlinemap.OfflineMapManager$1
            r1.<init>(r2)
            r0.g(r1)
            com.amap.api.col.3l.c0 r0 = r2.f5038b     // Catch: java.lang.Throwable -> L29
            r0.d()     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.3l.c0 r0 = r2.f5038b     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.3l.h0 r0 = r0.f3052k     // Catch: java.lang.Throwable -> L29
            r2.a = r0     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.p0003l.y2.k(r3)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    private void a(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b
            r0.h(r2)
            return
    }

    static /* synthetic */ android.os.Handler b(com.amap.api.maps.offlinemap.OfflineMapManager r0) {
            android.os.Handler r0 = r0.f5042f
            return r0
    }

    private void b() {
            r1 = this;
            r0 = 0
            r1.f5040d = r0
            return
    }

    static /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener c(com.amap.api.maps.offlinemap.OfflineMapManager r0) {
            com.amap.api.maps.offlinemap.OfflineMapManager$OfflineLoadedListener r0 = r0.f5041e
            return r0
    }

    public final void destroy() {
            r2 = this;
            com.amap.api.col.3l.c0 r0 = r2.f5038b     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L7
            r0.A()     // Catch: java.lang.Throwable -> L1d
        L7:
            r2.b()     // Catch: java.lang.Throwable -> L1d
            android.os.Handler r0 = r2.f5042f     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L12
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L1d
        L12:
            r2.f5042f = r1     // Catch: java.lang.Throwable -> L1d
            android.os.Handler r0 = r2.f5043g     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L1d
        L1b:
            r2.f5043g = r1     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    public final void downloadByCityCode(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b     // Catch: java.lang.Throwable -> L5
            r0.C(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void downloadByCityName(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b     // Catch: java.lang.Throwable -> L5
            r0.y(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void downloadByProvinceName(java.lang.String r4) throws com.amap.api.maps.AMapException {
            r3 = this;
            r3.a()     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.offlinemap.OfflineMapProvince r4 = r3.getItemByProvinceName(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2f
            java.util.ArrayList r4 = r4.getCityList()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2c
        L11:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = (com.amap.api.maps.offlinemap.OfflineMapCity) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.getCity()     // Catch: java.lang.Throwable -> L2c
            android.os.Handler r1 = r3.f5043g     // Catch: java.lang.Throwable -> L2c
            com.amap.api.maps.offlinemap.OfflineMapManager$2 r2 = new com.amap.api.maps.offlinemap.OfflineMapManager$2     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            r1.post(r2)     // Catch: java.lang.Throwable -> L2c
            goto L11
        L2c:
            r4 = move-exception
            goto L37
        L2e:
            return
        L2f:
            com.amap.api.maps.AMapException r4 = new com.amap.api.maps.AMapException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L37:
            boolean r0 = r4 instanceof com.amap.api.maps.AMapException
            if (r0 != 0) goto L43
            java.lang.String r0 = "OfflineMapManager"
            java.lang.String r1 = "downloadByProvinceName"
            com.amap.api.col.p0003l.w5.p(r4, r0, r1)
            return
        L43:
            com.amap.api.maps.AMapException r4 = (com.amap.api.maps.AMapException) r4
            throw r4
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadOfflineMapCityList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.s()
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getDownloadOfflineMapProvinceList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.t()
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadingCityList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.u()
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getDownloadingProvinceList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.v()
            return r0
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity getItemByCityCode(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = r0.a(r2)
            return r2
    }

    public final com.amap.api.maps.offlinemap.OfflineMapCity getItemByCityName(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = r0.m(r2)
            return r2
    }

    public final com.amap.api.maps.offlinemap.OfflineMapProvince getItemByProvinceName(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = r0.r(r2)
            return r2
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getOfflineMapCityList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.n()
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapProvince> getOfflineMapProvinceList() {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.a
            java.util.ArrayList r0 = r0.b()
            return r0
    }

    public final void pause() {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b
            r0.w()
            return
    }

    public final void pauseByName(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b
            r0.v(r2)
            return
    }

    public final void remove(java.lang.String r4) {
            r3 = this;
            com.amap.api.col.3l.c0 r0 = r3.f5038b     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.m(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto Le
            com.amap.api.col.3l.c0 r0 = r3.f5038b     // Catch: java.lang.Throwable -> L4a
            r0.r(r4)     // Catch: java.lang.Throwable -> L4a
            return
        Le:
            com.amap.api.col.3l.h0 r0 = r3.a     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = r0.r(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L40
            java.util.ArrayList r1 = r0.getCityList()     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L1d
            goto L40
        L1d:
            java.util.ArrayList r4 = r0.getCityList()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4a
        L25:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = (com.amap.api.maps.offlinemap.OfflineMapCity) r0     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r0.getCity()     // Catch: java.lang.Throwable -> L4a
            android.os.Handler r1 = r3.f5043g     // Catch: java.lang.Throwable -> L4a
            com.amap.api.maps.offlinemap.OfflineMapManager$3 r2 = new com.amap.api.maps.offlinemap.OfflineMapManager$3     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4a
            r1.post(r2)     // Catch: java.lang.Throwable -> L4a
            goto L25
        L40:
            com.amap.api.maps.offlinemap.OfflineMapManager$OfflineMapDownloadListener r0 = r3.f5040d     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4a
            java.lang.String r1 = "没有该城市"
            r2 = 0
            r0.onRemove(r2, r4, r1)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
    }

    public final void restart() {
            r0 = this;
            return
    }

    public final void setOnOfflineLoadedListener(com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener r1) {
            r0 = this;
            r0.f5041e = r1
            return
    }

    public final void stop() {
            r1 = this;
            com.amap.api.col.3l.c0 r0 = r1.f5038b
            r0.t()
            return
    }

    public final void updateOfflineCityByCode(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = r1.getItemByCityCode(r2)
            if (r2 == 0) goto L14
            java.lang.String r0 = r2.getCity()
            if (r0 == 0) goto L14
            java.lang.String r2 = r2.getCity()
            r1.a(r2)
            return
        L14:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r0)
            throw r2
    }

    public final void updateOfflineCityByName(java.lang.String r1) throws com.amap.api.maps.AMapException {
            r0 = this;
            r0.a(r1)
            return
    }

    public final void updateOfflineMapProvinceByName(java.lang.String r1) throws com.amap.api.maps.AMapException {
            r0 = this;
            r0.a(r1)
            return
    }
}
