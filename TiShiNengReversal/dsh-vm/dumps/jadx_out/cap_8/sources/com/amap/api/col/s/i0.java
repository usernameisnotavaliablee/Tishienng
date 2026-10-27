package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i0 implements com.amap.api.services.interfaces.IBusLineSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.busline.BusLineSearch.OnBusLineSearchListener f4495b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.busline.BusLineQuery f4496c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.busline.BusLineQuery f4497d;

    /* renamed from: e, reason: collision with root package name */
    private int f4498e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.services.busline.BusLineResult> f4499f;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f4500g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.i0 a;

        a(com.amap.api.col.s.i0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 3
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.what = r1     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.u4$b r1 = new com.amap.api.col.s.u4$b     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.<init>()     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r0.obj = r1     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.i0 r2 = r3.a     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.services.busline.BusLineSearch$OnBusLineSearchListener r2 = com.amap.api.col.s.i0.a(r2)     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.f4736b = r2     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.col.s.i0 r2 = r3.a     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                com.amap.api.services.busline.BusLineResult r2 = r2.searchBusLine()     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
                r1.a = r2     // Catch: java.lang.Throwable -> L30 com.amap.api.services.core.AMapException -> L32
            L26:
                com.amap.api.col.s.i0 r1 = r3.a
                android.os.Handler r1 = com.amap.api.col.s.i0.e(r1)
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
                com.amap.api.col.s.i0 r2 = r3.a
                android.os.Handler r2 = com.amap.api.col.s.i0.e(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    public i0(android.content.Context r4, com.amap.api.services.busline.BusLineQuery r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4499f = r0
            r0 = 0
            r3.f4500g = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L37
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            r3.f4496c = r5
            if (r5 == 0) goto L30
            com.amap.api.services.busline.BusLineQuery r4 = r5.clone()
            r3.f4497d = r4
        L30:
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4500g = r4
            return
        L37:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r5 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r1 = 1
            r4.<init>(r5, r1, r5, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.busline.BusLineSearch.OnBusLineSearchListener a(com.amap.api.col.s.i0 r0) {
            com.amap.api.services.busline.BusLineSearch$OnBusLineSearchListener r0 = r0.f4495b
            return r0
    }

    private void b(com.amap.api.services.busline.BusLineResult r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f4499f = r0
            r0 = 0
        L8:
            int r1 = r3.f4498e
            if (r0 >= r1) goto L15
            java.util.ArrayList<com.amap.api.services.busline.BusLineResult> r1 = r3.f4499f
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L8
        L15:
            if (r1 < 0) goto L2e
            com.amap.api.services.busline.BusLineQuery r0 = r3.f4496c
            int r0 = r0.getPageNumber()
            boolean r0 = r3.d(r0)
            if (r0 == 0) goto L2e
            java.util.ArrayList<com.amap.api.services.busline.BusLineResult> r0 = r3.f4499f
            com.amap.api.services.busline.BusLineQuery r1 = r3.f4496c
            int r1 = r1.getPageNumber()
            r0.set(r1, r4)
        L2e:
            return
    }

    private boolean c() {
            r2 = this;
            com.amap.api.services.busline.BusLineQuery r0 = r2.f4496c
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
            int r0 = r1.f4498e
            if (r2 >= r0) goto L8
            if (r2 < 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    static /* synthetic */ android.os.Handler e(com.amap.api.col.s.i0 r0) {
            android.os.Handler r0 = r0.f4500g
            return r0
    }

    private com.amap.api.services.busline.BusLineResult f(int r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Lf
            java.util.ArrayList<com.amap.api.services.busline.BusLineResult> r0 = r1.f4499f
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.services.busline.BusLineResult r2 = (com.amap.api.services.busline.BusLineResult) r2
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "page out of range"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final com.amap.api.services.busline.BusLineQuery getQuery() {
            r1 = this;
            com.amap.api.services.busline.BusLineQuery r0 = r1.f4496c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final com.amap.api.services.busline.BusLineResult searchBusLine() throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r0 = r3.f4497d     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 == 0) goto L70
            boolean r0 = r3.c()     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 == 0) goto L70
            com.amap.api.services.busline.BusLineQuery r0 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r1 = r3.f4497d     // Catch: com.amap.api.services.core.AMapException -> L2c
            boolean r0 = r0.weakEquals(r1)     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 != 0) goto L2e
            com.amap.api.services.busline.BusLineQuery r0 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L2c
            r3.f4497d = r0     // Catch: com.amap.api.services.core.AMapException -> L2c
            r0 = 0
            r3.f4498e = r0     // Catch: com.amap.api.services.core.AMapException -> L2c
            java.util.ArrayList<com.amap.api.services.busline.BusLineResult> r0 = r3.f4499f     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 == 0) goto L2e
            r0.clear()     // Catch: com.amap.api.services.core.AMapException -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L78
        L2e:
            int r0 = r3.f4498e     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 != 0) goto L49
            com.amap.api.col.s.e4 r0 = new com.amap.api.col.s.e4     // Catch: com.amap.api.services.core.AMapException -> L2c
            android.content.Context r1 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r2 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r2 = r2.clone()     // Catch: com.amap.api.services.core.AMapException -> L2c
            r0.<init>(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L2c
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineResult r0 = (com.amap.api.services.busline.BusLineResult) r0     // Catch: com.amap.api.services.core.AMapException -> L2c
            r3.b(r0)     // Catch: com.amap.api.services.core.AMapException -> L2c
            return r0
        L49:
            com.amap.api.services.busline.BusLineQuery r0 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            int r0 = r0.getPageNumber()     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineResult r0 = r3.f(r0)     // Catch: com.amap.api.services.core.AMapException -> L2c
            if (r0 != 0) goto L6f
            com.amap.api.col.s.e4 r0 = new com.amap.api.col.s.e4     // Catch: com.amap.api.services.core.AMapException -> L2c
            android.content.Context r1 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r2 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            r0.<init>(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L2c
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineResult r0 = (com.amap.api.services.busline.BusLineResult) r0     // Catch: com.amap.api.services.core.AMapException -> L2c
            java.util.ArrayList<com.amap.api.services.busline.BusLineResult> r1 = r3.f4499f     // Catch: com.amap.api.services.core.AMapException -> L2c
            com.amap.api.services.busline.BusLineQuery r2 = r3.f4496c     // Catch: com.amap.api.services.core.AMapException -> L2c
            int r2 = r2.getPageNumber()     // Catch: com.amap.api.services.core.AMapException -> L2c
            r1.set(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L2c
        L6f:
            return r0
        L70:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L2c
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L2c
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L2c
        L78:
            java.lang.String r1 = "BusLineSearch"
            java.lang.String r2 = "searchBusLine"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = r0.getErrorMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void searchBusLineAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.i0$a r1 = new com.amap.api.col.s.i0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setOnBusLineSearchListener(com.amap.api.services.busline.BusLineSearch.OnBusLineSearchListener r1) {
            r0 = this;
            r0.f4495b = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setQuery(com.amap.api.services.busline.BusLineQuery r2) {
            r1 = this;
            com.amap.api.services.busline.BusLineQuery r0 = r1.f4496c
            boolean r0 = r0.weakEquals(r2)
            if (r0 != 0) goto L10
            r1.f4496c = r2
            com.amap.api.services.busline.BusLineQuery r2 = r2.clone()
            r1.f4497d = r2
        L10:
            return
    }
}
