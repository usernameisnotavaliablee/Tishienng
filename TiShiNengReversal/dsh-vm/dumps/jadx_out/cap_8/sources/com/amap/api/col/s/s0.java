package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s0 implements com.amap.api.services.interfaces.IRoutePOISearch {
    private com.amap.api.services.routepoisearch.RoutePOISearchQuery a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4670b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.routepoisearch.RoutePOISearch.OnRoutePOISearchListener f4671c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f4672d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.s0 a;

        a(com.amap.api.col.s.s0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                java.lang.String r0 = "errorCode"
                com.amap.api.col.s.s0 r1 = r6.a
                android.os.Handler r1 = com.amap.api.col.s.s0.a(r1)
                android.os.Message r1 = r1.obtainMessage()
                r2 = 14
                r1.arg1 = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 0
                com.amap.api.col.s.s0 r4 = r6.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.routepoisearch.RoutePOISearchResult r3 = r4.searchRoutePOI()     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r4 = 1000(0x3e8, float:1.401E-42)
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.col.s.u4$m r0 = new com.amap.api.col.s.u4$m
                r0.<init>()
            L26:
                com.amap.api.col.s.s0 r4 = r6.a
                com.amap.api.services.routepoisearch.RoutePOISearch$OnRoutePOISearchListener r4 = com.amap.api.col.s.s0.c(r4)
                r0.f4747b = r4
                r0.a = r3
                r1.obj = r0
                r1.setData(r2)
                com.amap.api.col.s.s0 r0 = r6.a
                android.os.Handler r0 = com.amap.api.col.s.s0.a(r0)
                r0.sendMessage(r1)
                return
            L3f:
                r0 = move-exception
                goto L4f
            L41:
                r4 = move-exception
                int r4 = r4.getErrorCode()     // Catch: java.lang.Throwable -> L3f
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L3f
                com.amap.api.col.s.u4$m r0 = new com.amap.api.col.s.u4$m
                r0.<init>()
                goto L26
            L4f:
                com.amap.api.col.s.u4$m r4 = new com.amap.api.col.s.u4$m
                r4.<init>()
                com.amap.api.col.s.s0 r5 = r6.a
                com.amap.api.services.routepoisearch.RoutePOISearch$OnRoutePOISearchListener r5 = com.amap.api.col.s.s0.c(r5)
                r4.f4747b = r5
                r4.a = r3
                r1.obj = r4
                r1.setData(r2)
                com.amap.api.col.s.s0 r2 = r6.a
                android.os.Handler r2 = com.amap.api.col.s.s0.a(r2)
                r2.sendMessage(r1)
                throw r0
        }
    }

    public s0(android.content.Context r4, com.amap.api.services.routepoisearch.RoutePOISearchQuery r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4672d = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L20
            r3.f4670b = r4
            r3.a = r5
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4672d = r4
            return
        L20:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r5 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r1 = 1
            r4.<init>(r5, r1, r5, r0)
            throw r4
    }

    static /* synthetic */ android.os.Handler a(com.amap.api.col.s.s0 r0) {
            android.os.Handler r0 = r0.f4672d
            return r0
    }

    private boolean b() {
            r2 = this;
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r2.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.amap.api.services.routepoisearch.RoutePOISearch$RoutePOISearchType r0 = r0.getSearchType()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r2.a
            com.amap.api.services.core.LatLonPoint r0 = r0.getFrom()
            if (r0 != 0) goto L26
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r2.a
            com.amap.api.services.core.LatLonPoint r0 = r0.getTo()
            if (r0 != 0) goto L26
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r2.a
            java.util.List r0 = r0.getPolylines()
            if (r0 != 0) goto L26
            return r1
        L26:
            r0 = 1
            return r0
    }

    static /* synthetic */ com.amap.api.services.routepoisearch.RoutePOISearch.OnRoutePOISearchListener c(com.amap.api.col.s.s0 r0) {
            com.amap.api.services.routepoisearch.RoutePOISearch$OnRoutePOISearchListener r0 = r0.f4671c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final com.amap.api.services.routepoisearch.RoutePOISearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r1.a
            return r0
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final com.amap.api.services.routepoisearch.RoutePOISearchResult searchRoutePOI() throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.f4670b     // Catch: com.amap.api.services.core.AMapException -> L1f
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L1f
            boolean r0 = r3.b()     // Catch: com.amap.api.services.core.AMapException -> L1f
            if (r0 == 0) goto L21
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L1f
            com.amap.api.services.routepoisearch.RoutePOISearchQuery r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L1f
            com.amap.api.col.s.u r1 = new com.amap.api.col.s.u     // Catch: com.amap.api.services.core.AMapException -> L1f
            android.content.Context r2 = r3.f4670b     // Catch: com.amap.api.services.core.AMapException -> L1f
            r1.<init>(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L1f
            java.lang.Object r0 = r1.O()     // Catch: com.amap.api.services.core.AMapException -> L1f
            com.amap.api.services.routepoisearch.RoutePOISearchResult r0 = (com.amap.api.services.routepoisearch.RoutePOISearchResult) r0     // Catch: com.amap.api.services.core.AMapException -> L1f
            return r0
        L1f:
            r0 = move-exception
            goto L29
        L21:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1f
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1f
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L1f
        L29:
            java.lang.String r1 = "RoutePOISearchCore"
            java.lang.String r2 = "searchRoutePOI"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            throw r0
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void searchRoutePOIAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()
            com.amap.api.col.s.s0$a r1 = new com.amap.api.col.s.s0$a
            r1.<init>(r2)
            r0.b(r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setQuery(com.amap.api.services.routepoisearch.RoutePOISearchQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setRoutePOISearchListener(com.amap.api.services.routepoisearch.RoutePOISearch.OnRoutePOISearchListener r1) {
            r0 = this;
            r0.f4671c = r1
            return
    }
}
