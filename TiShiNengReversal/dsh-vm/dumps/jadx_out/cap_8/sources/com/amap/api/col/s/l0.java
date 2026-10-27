package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l0 implements com.amap.api.services.interfaces.IDistanceSearch {

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f4550d = "l0";
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f4551b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.DistanceSearch.OnDistanceSearchListener f4552c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.DistanceSearch.DistanceQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.l0 f4553b;

        a(com.amap.api.col.s.l0 r1, com.amap.api.services.route.DistanceSearch.DistanceQuery r2) {
                r0 = this;
                r0.f4553b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 400(0x190, float:5.6E-43)
                r2.what = r3
                r3 = 16
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.l0 r5 = r7.f4553b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.DistanceSearch$DistanceQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.DistanceResult r4 = r5.calculateRouteDistance(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.l0 r0 = r7.f4553b
                com.amap.api.services.route.DistanceSearch$OnDistanceSearchListener r0 = com.amap.api.col.s.l0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.l0 r0 = r7.f4553b
                android.os.Handler r0 = com.amap.api.col.s.l0.c(r0)
                r0.sendMessage(r2)
                return
            L3f:
                r0 = move-exception
                goto L4a
            L41:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3f
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f
                goto L27
            L4a:
                com.amap.api.col.s.l0 r5 = r7.f4553b
                com.amap.api.services.route.DistanceSearch$OnDistanceSearchListener r5 = com.amap.api.col.s.l0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.l0 r1 = r7.f4553b
                android.os.Handler r1 = com.amap.api.col.s.l0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    static {
            return
    }

    public l0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L23
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4551b = r4
            return
        L23:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.route.DistanceSearch.OnDistanceSearchListener a(com.amap.api.col.s.l0 r0) {
            com.amap.api.services.route.DistanceSearch$OnDistanceSearchListener r0 = r0.f4552c
            return r0
    }

    private static boolean b(com.amap.api.services.route.DistanceSearch.DistanceQuery r2) {
            com.amap.api.services.core.LatLonPoint r0 = r2.getDestination()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List r0 = r2.getOrigins()
            if (r0 == 0) goto L1b
            java.util.List r2 = r2.getOrigins()
            int r2 = r2.size()
            if (r2 > 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            return r1
    }

    static /* synthetic */ android.os.Handler c(com.amap.api.col.s.l0 r0) {
            android.os.Handler r0 = r0.f4551b
            return r0
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public com.amap.api.services.route.DistanceResult calculateRouteDistance(com.amap.api.services.route.DistanceSearch.DistanceQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L26
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L26
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L2f
            boolean r1 = b(r3)     // Catch: com.amap.api.services.core.AMapException -> L26
            if (r1 != 0) goto L29
            com.amap.api.services.route.DistanceSearch$DistanceQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L26
            com.amap.api.col.s.k4 r0 = new com.amap.api.col.s.k4     // Catch: com.amap.api.services.core.AMapException -> L26
            android.content.Context r1 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L26
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L26
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L26
            com.amap.api.services.route.DistanceResult r0 = (com.amap.api.services.route.DistanceResult) r0     // Catch: com.amap.api.services.core.AMapException -> L26
            if (r0 == 0) goto L28
            r0.setDistanceQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L26
            return r0
        L26:
            r3 = move-exception
            goto L35
        L28:
            return r0
        L29:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L26
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L26
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L26
        L2f:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L26
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L26
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L26
        L35:
            java.lang.String r0 = com.amap.api.col.s.l0.f4550d
            java.lang.String r1 = "calculateWalkRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void calculateRouteDistanceAsyn(com.amap.api.services.route.DistanceSearch.DistanceQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()
            com.amap.api.col.s.l0$a r1 = new com.amap.api.col.s.l0$a
            r1.<init>(r2, r3)
            r0.b(r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void setDistanceSearchListener(com.amap.api.services.route.DistanceSearch.OnDistanceSearchListener r1) {
            r0 = this;
            r0.f4552c = r1
            return
    }
}
