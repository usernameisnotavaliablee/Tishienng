package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j0 implements com.amap.api.services.interfaces.IBusStationSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.busline.BusStationSearch.OnBusStationSearchListener f4518b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.busline.BusStationQuery f4519c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.busline.BusStationQuery f4520d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.busline.BusStationResult> f4521e;

    /* renamed from: f, reason: collision with root package name */
    private int f4522f;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f4523g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.j0 a;

        a(com.amap.api.col.s.j0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 7
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.u4$c r1 = new com.amap.api.col.s.u4$c     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.<init>()     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.j0 r2 = r4.a     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.services.busline.BusStationSearch$OnBusStationSearchListener r2 = com.amap.api.col.s.j0.a(r2)     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.f4737b = r2     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r0.obj = r1     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.j0 r2 = r4.a     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.services.busline.BusStationResult r2 = r2.searchBusStation()     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r3 = 1000(0x3e8, float:1.401E-42)
                r0.what = r3     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.a = r2     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
            L26:
                com.amap.api.col.s.j0 r1 = r4.a
                android.os.Handler r1 = com.amap.api.col.s.j0.e(r1)
                r1.sendMessage(r0)
                return
            L30:
                r1 = move-exception
                goto L3a
            L32:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L30
                r0.what = r1     // Catch: java.lang.Throwable -> L30
                goto L26
            L3a:
                com.amap.api.col.s.j0 r2 = r4.a
                android.os.Handler r2 = com.amap.api.col.s.j0.e(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    public j0(android.content.Context r4, com.amap.api.services.busline.BusStationQuery r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4521e = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L2c
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            r3.f4519c = r5
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4523g = r4
            return
        L2c:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r5 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r1 = 1
            r4.<init>(r5, r1, r5, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.busline.BusStationSearch.OnBusStationSearchListener a(com.amap.api.col.s.j0 r0) {
            com.amap.api.services.busline.BusStationSearch$OnBusStationSearchListener r0 = r0.f4518b
            return r0
    }

    private void b(com.amap.api.services.busline.BusStationResult r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4521e = r0
            r0 = 0
        L8:
            int r1 = r3.f4522f
            if (r0 > r1) goto L15
            java.util.ArrayList<com.amap.api.services.busline.BusStationResult> r1 = r3.f4521e
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L8
        L15:
            if (r1 <= 0) goto L22
            java.util.ArrayList<com.amap.api.services.busline.BusStationResult> r0 = r3.f4521e
            com.amap.api.services.busline.BusStationQuery r1 = r3.f4519c
            int r1 = r1.getPageNumber()
            r0.set(r1, r4)
        L22:
            return
    }

    private boolean c() {
            r2 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r2.f4519c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r0.getQueryString()
            boolean r0 = com.amap.api.col.s.j4.j(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            return r1
    }

    private boolean d(int r2) {
            r1 = this;
            int r0 = r1.f4522f
            if (r2 > r0) goto L8
            if (r2 < 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    static /* synthetic */ android.os.Handler e(com.amap.api.col.s.j0 r0) {
            android.os.Handler r0 = r0.f4523g
            return r0
    }

    private com.amap.api.services.busline.BusStationResult f(int r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Lf
            java.util.ArrayList<com.amap.api.services.busline.BusStationResult> r0 = r1.f4521e
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.services.busline.BusStationResult r2 = (com.amap.api.services.busline.BusStationResult) r2
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "page out of range"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final com.amap.api.services.busline.BusStationQuery getQuery() {
            r1 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r1.f4519c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final com.amap.api.services.busline.BusStationResult searchBusStation() throws com.amap.api.services.core.AMapException {
            r5 = this;
            java.lang.String r0 = "searchBusStation"
            java.lang.String r1 = "BusStationSearch"
            android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.col.s.s4.d(r2)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            boolean r2 = r5.c()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            if (r2 == 0) goto L74
            com.amap.api.services.busline.BusStationQuery r2 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationQuery r3 = r5.f4520d     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            boolean r2 = r2.weakEquals(r3)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            if (r2 != 0) goto L30
            com.amap.api.services.busline.BusStationQuery r2 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationQuery r2 = r2.clone()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r5.f4520d = r2     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r2 = 0
            r5.f4522f = r2     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            java.util.ArrayList<com.amap.api.services.busline.BusStationResult> r2 = r5.f4521e     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            if (r2 == 0) goto L30
            r2.clear()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            goto L30
        L2c:
            r2 = move-exception
            goto L7c
        L2e:
            r2 = move-exception
            goto L81
        L30:
            int r2 = r5.f4522f     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            if (r2 != 0) goto L4d
            com.amap.api.col.s.e4 r2 = new com.amap.api.col.s.e4     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            android.content.Context r3 = r5.a     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationQuery r4 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            java.lang.Object r2 = r2.O()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationResult r2 = (com.amap.api.services.busline.BusStationResult) r2     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            int r3 = r2.getPageCount()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r5.f4522f = r3     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r5.b(r2)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            return r2
        L4d:
            com.amap.api.services.busline.BusStationQuery r2 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            int r2 = r2.getPageNumber()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationResult r2 = r5.f(r2)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            if (r2 != 0) goto L73
            com.amap.api.col.s.e4 r2 = new com.amap.api.col.s.e4     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            android.content.Context r3 = r5.a     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationQuery r4 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            java.lang.Object r2 = r2.O()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationResult r2 = (com.amap.api.services.busline.BusStationResult) r2     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            java.util.ArrayList<com.amap.api.services.busline.BusStationResult> r3 = r5.f4521e     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            com.amap.api.services.busline.BusStationQuery r4 = r5.f4519c     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            int r4 = r4.getPageNumber()     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            r3.set(r4, r2)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
        L73:
            return r2
        L74:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            java.lang.String r3 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2c com.amap.api.services.core.AMapException -> L2e
        L7c:
            com.amap.api.col.s.j4.i(r2, r1, r0)
            r0 = 0
            return r0
        L81:
            com.amap.api.col.s.j4.i(r2, r1, r0)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r2.getErrorMessage()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void searchBusStationAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.j0$a r1 = new com.amap.api.col.s.j0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setOnBusStationSearchListener(com.amap.api.services.busline.BusStationSearch.OnBusStationSearchListener r1) {
            r0 = this;
            r0.f4518b = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setQuery(com.amap.api.services.busline.BusStationQuery r2) {
            r1 = this;
            com.amap.api.services.busline.BusStationQuery r0 = r1.f4519c
            boolean r0 = r2.weakEquals(r0)
            if (r0 != 0) goto La
            r1.f4519c = r2
        La:
            return
    }
}
