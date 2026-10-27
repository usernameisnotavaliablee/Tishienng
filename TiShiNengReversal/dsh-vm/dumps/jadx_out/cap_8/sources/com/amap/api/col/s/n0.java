package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n0 implements com.amap.api.services.interfaces.IGeocodeSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener f4575b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f4576c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.geocoder.RegeocodeQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.n0 f4577b;

        a(com.amap.api.col.s.n0 r1, com.amap.api.services.geocoder.RegeocodeQuery r2) {
                r0 = this;
                r0.f4577b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 2
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1 = 201(0xc9, float:2.82E-43)
                r0.what = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.u4$l r1 = new com.amap.api.col.s.u4$l     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.<init>()     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.n0 r2 = r5.f4577b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.GeocodeSearch$OnGeocodeSearchListener r2 = com.amap.api.col.s.n0.a(r2)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.f4746b = r2     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r0.obj = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.n0 r2 = r5.f4577b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.RegeocodeQuery r3 = r5.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.RegeocodeAddress r2 = r2.getFromLocation(r3)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.RegeocodeResult r3 = new com.amap.api.services.geocoder.RegeocodeResult     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.RegeocodeQuery r4 = r5.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.a = r3     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
            L33:
                com.amap.api.col.s.n0 r1 = r5.f4577b
                android.os.Handler r1 = com.amap.api.col.s.n0.c(r1)
                r1.sendMessage(r0)
                return
            L3d:
                r1 = move-exception
                goto L47
            L3f:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L3d
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L3d
                goto L33
            L47:
                com.amap.api.col.s.n0 r2 = r5.f4577b
                android.os.Handler r2 = com.amap.api.col.s.n0.c(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.geocoder.GeocodeQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.n0 f4578b;

        b(com.amap.api.col.s.n0 r1, com.amap.api.services.geocoder.GeocodeQuery r2) {
                r0 = this;
                r0.f4578b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 200(0xc8, float:2.8E-43)
                r0.what = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1 = 2
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.u4$f r1 = new com.amap.api.col.s.u4$f     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.<init>()     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.n0 r2 = r5.f4578b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.GeocodeSearch$OnGeocodeSearchListener r2 = com.amap.api.col.s.n0.a(r2)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.f4740b = r2     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r0.obj = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.n0 r2 = r5.f4578b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.GeocodeQuery r3 = r5.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                java.util.List r2 = r2.getFromLocationName(r3)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.GeocodeResult r3 = new com.amap.api.services.geocoder.GeocodeResult     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.geocoder.GeocodeQuery r4 = r5.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.a = r3     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
            L33:
                com.amap.api.col.s.n0 r1 = r5.f4578b
                android.os.Handler r1 = com.amap.api.col.s.n0.c(r1)
                r1.sendMessage(r0)
                return
            L3d:
                r1 = move-exception
                goto L47
            L3f:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L3d
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L3d
                goto L33
            L47:
                com.amap.api.col.s.n0 r2 = r5.f4578b
                android.os.Handler r2 = com.amap.api.col.s.n0.c(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    public n0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
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
            r3.f4576c = r4
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

    static /* synthetic */ com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener a(com.amap.api.col.s.n0 r0) {
            com.amap.api.services.geocoder.GeocodeSearch$OnGeocodeSearchListener r0 = r0.f4575b
            return r0
    }

    private static boolean b(com.amap.api.services.geocoder.RegeocodeQuery r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            com.amap.api.services.core.LatLonPoint r1 = r2.getPoint()
            if (r1 == 0) goto L13
            java.lang.String r2 = r2.getLatLonType()
            if (r2 != 0) goto L11
            goto L13
        L11:
            r2 = 1
            return r2
        L13:
            return r0
    }

    static /* synthetic */ android.os.Handler c(com.amap.api.col.s.n0 r0) {
            android.os.Handler r0 = r0.f4576c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final com.amap.api.services.geocoder.RegeocodeAddress getFromLocation(com.amap.api.services.geocoder.RegeocodeQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L19
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L19
            boolean r0 = b(r3)     // Catch: com.amap.api.services.core.AMapException -> L19
            if (r0 == 0) goto L1b
            com.amap.api.col.s.r r0 = new com.amap.api.col.s.r     // Catch: com.amap.api.services.core.AMapException -> L19
            android.content.Context r1 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L19
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L19
            java.lang.Object r3 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L19
            com.amap.api.services.geocoder.RegeocodeAddress r3 = (com.amap.api.services.geocoder.RegeocodeAddress) r3     // Catch: com.amap.api.services.core.AMapException -> L19
            return r3
        L19:
            r3 = move-exception
            goto L23
        L1b:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L19
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L19
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L19
        L23:
            java.lang.String r0 = "GeocodeSearch"
            java.lang.String r1 = "getFromLocationAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationAsyn(com.amap.api.services.geocoder.RegeocodeQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.n0$a r1 = new com.amap.api.col.s.n0$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "GeocodeSearch"
            java.lang.String r1 = "getFromLocationAsyn_threadcreate"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final java.util.List<com.amap.api.services.geocoder.GeocodeAddress> getFromLocationName(com.amap.api.services.geocoder.GeocodeQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L15
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L15
            if (r3 == 0) goto L17
            com.amap.api.col.s.p4 r0 = new com.amap.api.col.s.p4     // Catch: com.amap.api.services.core.AMapException -> L15
            android.content.Context r1 = r2.a     // Catch: com.amap.api.services.core.AMapException -> L15
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L15
            java.lang.Object r3 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L15
            java.util.List r3 = (java.util.List) r3     // Catch: com.amap.api.services.core.AMapException -> L15
            return r3
        L15:
            r3 = move-exception
            goto L1f
        L17:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L15
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L15
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L15
        L1f:
            java.lang.String r0 = "GeocodeSearch"
            java.lang.String r1 = "getFromLocationName"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationNameAsyn(com.amap.api.services.geocoder.GeocodeQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.n0$b r1 = new com.amap.api.col.s.n0$b     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "GeocodeSearch"
            java.lang.String r1 = "getFromLocationNameAsynThrowable"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void setOnGeocodeSearchListener(com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener r1) {
            r0 = this;
            r0.f4575b = r1
            return
    }
}
