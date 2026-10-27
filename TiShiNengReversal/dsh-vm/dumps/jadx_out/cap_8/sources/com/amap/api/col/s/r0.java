package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r0 implements com.amap.api.services.interfaces.IPoiSearchV2 {

    /* renamed from: j, reason: collision with root package name */
    private static java.util.HashMap<java.lang.Integer, com.amap.api.services.poisearch.PoiResultV2> f4635j;
    private com.amap.api.services.poisearch.PoiSearchV2.SearchBound a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.Query f4636b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f4637c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener f4638d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f4639e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.Query f4640f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.services.poisearch.PoiSearchV2.SearchBound f4641g;

    /* renamed from: h, reason: collision with root package name */
    private int f4642h;

    /* renamed from: i, reason: collision with root package name */
    private android.os.Handler f4643i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.r0 a;

        a(com.amap.api.col.s.r0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                java.lang.String r0 = "errorCode"
                com.amap.api.col.s.r0 r1 = r6.a
                android.os.Handler r1 = com.amap.api.col.s.r0.a(r1)
                android.os.Message r1 = r1.obtainMessage()
                r2 = 19
                r1.arg1 = r2
                r2 = 603(0x25b, float:8.45E-43)
                r1.what = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 0
                com.amap.api.col.s.r0 r4 = r6.a     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.services.poisearch.PoiResultV2 r3 = r4.searchPOI()     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                r4 = 1000(0x3e8, float:1.401E-42)
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.col.s.u4$k r0 = new com.amap.api.col.s.u4$k
                r0.<init>()
            L2a:
                com.amap.api.col.s.r0 r4 = r6.a
                com.amap.api.services.poisearch.PoiSearchV2$OnPoiSearchListener r4 = com.amap.api.col.s.r0.e(r4)
                r0.f4745b = r4
                r0.a = r3
                r1.obj = r0
                r1.setData(r2)
                com.amap.api.col.s.r0 r0 = r6.a
                android.os.Handler r0 = com.amap.api.col.s.r0.a(r0)
                r0.sendMessage(r1)
                return
            L43:
                r0 = move-exception
                goto L53
            L45:
                r4 = move-exception
                int r4 = r4.getErrorCode()     // Catch: java.lang.Throwable -> L43
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.s.u4$k r0 = new com.amap.api.col.s.u4$k
                r0.<init>()
                goto L2a
            L53:
                com.amap.api.col.s.u4$k r4 = new com.amap.api.col.s.u4$k
                r4.<init>()
                com.amap.api.col.s.r0 r5 = r6.a
                com.amap.api.services.poisearch.PoiSearchV2$OnPoiSearchListener r5 = com.amap.api.col.s.r0.e(r5)
                r4.f4745b = r5
                r4.a = r3
                r1.obj = r4
                r1.setData(r2)
                com.amap.api.col.s.r0 r2 = r6.a
                android.os.Handler r2 = com.amap.api.col.s.r0.a(r2)
                r2.sendMessage(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.r0 f4644b;

        b(com.amap.api.col.s.r0 r1, java.lang.String r2) {
                r0 = this;
                r0.f4644b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                android.os.Message r1 = r1.obtainMessage()
                r2 = 19
                r1.arg1 = r2
                r2 = 604(0x25c, float:8.46E-43)
                r1.what = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 0
                com.amap.api.col.s.r0 r4 = r7.f4644b     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                java.lang.String r5 = r7.a     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.services.core.PoiItemV2 r3 = r4.searchPOIId(r5)     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                r4 = 1000(0x3e8, float:1.401E-42)
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.col.s.u4$i r0 = new com.amap.api.col.s.u4$i
                r0.<init>()
            L2a:
                com.amap.api.col.s.r0 r4 = r7.f4644b
                com.amap.api.services.poisearch.PoiSearchV2$OnPoiSearchListener r4 = com.amap.api.col.s.r0.e(r4)
                r0.f4743b = r4
                r0.a = r3
                r1.obj = r0
                r1.setData(r2)
                com.amap.api.col.s.r0 r0 = r7.f4644b
                android.os.Handler r0 = com.amap.api.col.s.r0.a(r0)
                r0.sendMessage(r1)
                return
            L43:
                r0 = move-exception
                goto L5a
            L45:
                r4 = move-exception
                java.lang.String r5 = "PoiSearch"
                java.lang.String r6 = "searchPOIIdAsyn"
                com.amap.api.col.s.j4.i(r4, r5, r6)     // Catch: java.lang.Throwable -> L43
                int r4 = r4.getErrorCode()     // Catch: java.lang.Throwable -> L43
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.s.u4$i r0 = new com.amap.api.col.s.u4$i
                r0.<init>()
                goto L2a
            L5a:
                com.amap.api.col.s.u4$i r4 = new com.amap.api.col.s.u4$i
                r4.<init>()
                com.amap.api.col.s.r0 r5 = r7.f4644b
                com.amap.api.services.poisearch.PoiSearchV2$OnPoiSearchListener r5 = com.amap.api.col.s.r0.e(r5)
                r4.f4743b = r5
                r4.a = r3
                r1.obj = r4
                r1.setData(r2)
                com.amap.api.col.s.r0 r2 = r7.f4644b
                android.os.Handler r2 = com.amap.api.col.s.r0.a(r2)
                r2.sendMessage(r1)
                throw r0
        }
    }

    public r0(android.content.Context r4, com.amap.api.services.poisearch.PoiSearchV2.Query r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "zh-CN"
            r3.f4639e = r0
            r0 = 0
            r3.f4643i = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L2d
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.f4637c = r4
            r3.setQuery(r5)
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4643i = r4
            return
        L2d:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r5 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r1 = 1
            r4.<init>(r5, r1, r5, r0)
            throw r4
    }

    static /* synthetic */ android.os.Handler a(com.amap.api.col.s.r0 r0) {
            android.os.Handler r0 = r0.f4643i
            return r0
    }

    private com.amap.api.services.poisearch.PoiResultV2 b(int r2) {
            r1 = this;
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto L13
            java.util.HashMap<java.lang.Integer, com.amap.api.services.poisearch.PoiResultV2> r0 = com.amap.api.col.s.r0.f4635j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.services.poisearch.PoiResultV2 r2 = (com.amap.api.services.poisearch.PoiResultV2) r2
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "page out of range"
            r2.<init>(r0)
            throw r2
    }

    private void c(com.amap.api.services.poisearch.PoiResultV2 r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.s.r0.f4635j = r0
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r2.f4636b
            if (r0 == 0) goto L27
            if (r3 != 0) goto Le
            goto L27
        Le:
            int r1 = r2.f4642h
            if (r1 <= 0) goto L27
            int r0 = r0.getPageNum()
            if (r1 <= r0) goto L27
            java.util.HashMap<java.lang.Integer, com.amap.api.services.poisearch.PoiResultV2> r0 = com.amap.api.col.s.r0.f4635j
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r2.f4636b
            int r1 = r1.getPageNum()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r3)
        L27:
            return
    }

    private boolean d() {
            r2 = this;
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r2.f4636b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r0.getQueryString()
            boolean r0 = com.amap.api.col.s.j4.j(r0)
            if (r0 == 0) goto L1e
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r2.f4636b
            java.lang.String r0 = r0.getCategory()
            boolean r0 = com.amap.api.col.s.j4.j(r0)
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            r0 = 1
            return r0
    }

    static /* synthetic */ com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener e(com.amap.api.col.s.r0 r0) {
            com.amap.api.services.poisearch.PoiSearchV2$OnPoiSearchListener r0 = r0.f4638d
            return r0
    }

    private boolean f() {
            r3 = this;
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r3.getBound()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r0.getShape()
            java.lang.String r2 = "Bound"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            return r1
    }

    private boolean g(int r2) {
            r1 = this;
            int r0 = r1.f4642h
            if (r2 > r0) goto L8
            if (r2 < 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    private boolean h() {
            r8 = this;
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r8.getBound()
            if (r0 == 0) goto L77
            java.lang.String r1 = r0.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L1a
            com.amap.api.services.core.LatLonPoint r0 = r0.getCenter()
            if (r0 != 0) goto L77
            return r2
        L1a:
            java.lang.String r1 = r0.getShape()
            java.lang.String r3 = "Polygon"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L45
            java.util.List r0 = r0.getPolyGonList()
            if (r0 == 0) goto L44
            int r1 = r0.size()
            if (r1 != 0) goto L33
            goto L44
        L33:
            r1 = 0
        L34:
            int r3 = r0.size()
            if (r1 >= r3) goto L77
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L34
        L44:
            return r2
        L45:
            java.lang.String r1 = r0.getShape()
            java.lang.String r3 = "Rectangle"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L77
            com.amap.api.services.core.LatLonPoint r1 = r0.getLowerLeft()
            com.amap.api.services.core.LatLonPoint r0 = r0.getUpperRight()
            if (r1 == 0) goto L76
            if (r0 != 0) goto L5e
            goto L76
        L5e:
            double r3 = r1.getLatitude()
            double r5 = r0.getLatitude()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L76
            double r3 = r1.getLongitude()
            double r0 = r0.getLongitude()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L77
        L76:
            return r2
        L77:
            r0 = 1
            return r0
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r1.a
            return r0
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.f4639e
            return r0
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final com.amap.api.services.poisearch.PoiSearchV2.Query getQuery() {
            r1 = this;
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r1.f4636b
            return r0
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final com.amap.api.services.poisearch.PoiResultV2 searchPOI() throws com.amap.api.services.core.AMapException {
            r5 = this;
            android.content.Context r0 = r5.f4637c     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L1a
            boolean r0 = r5.f()     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            if (r0 != 0) goto L1d
            boolean r0 = r5.d()     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto L14
            goto L1d
        L14:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1a
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L1a
        L1a:
            r0 = move-exception
            goto L101
        L1d:
            boolean r0 = r5.h()     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto Lfb
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto Lf5
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r5.f4640f     // Catch: com.amap.api.services.core.AMapException -> L1a
            boolean r0 = r0.queryEquals(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 != 0) goto L33
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto L47
        L33:
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r5.f4640f     // Catch: com.amap.api.services.core.AMapException -> L1a
            boolean r0 = r0.queryEquals(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 != 0) goto L63
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r1 = r5.f4641g     // Catch: com.amap.api.services.core.AMapException -> L1a
            boolean r0 = r0.equals(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 != 0) goto L63
        L47:
            r0 = 0
            r5.f4642h = r0     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L1a
            r5.f4640f = r0     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto L5c
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L1a
            r5.f4641g = r0     // Catch: com.amap.api.services.core.AMapException -> L1a
        L5c:
            java.util.HashMap<java.lang.Integer, com.amap.api.services.poisearch.PoiResultV2> r0 = com.amap.api.col.s.r0.f4635j     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto L63
            r0.clear()     // Catch: com.amap.api.services.core.AMapException -> L1a
        L63:
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r0 == 0) goto L6c
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L1a
            goto L6d
        L6c:
            r0 = 0
        L6d:
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r2 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.lang.String r2 = r2.getQueryString()     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.f(r2)     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.col.s.q r2 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r3 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r3 = r3.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r2 = r2.B(r3)     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.setPageNum(r2)     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.col.s.q r2 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r3 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r3 = r3.getPageSize()     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r2 = r2.C(r3)     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.setPageSize(r2)     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r1 = r5.f4642h     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r1 != 0) goto Lc0
            com.amap.api.col.s.h r1 = new com.amap.api.col.s.h     // Catch: com.amap.api.services.core.AMapException -> L1a
            android.content.Context r2 = r5.f4637c     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.col.s.l r3 = new com.amap.api.col.s.l     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r4 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r4 = r4.clone()     // Catch: com.amap.api.services.core.AMapException -> L1a
            r3.<init>(r4, r0)     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.<init>(r2, r3)     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.lang.Object r0 = r1.O()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiResultV2 r0 = (com.amap.api.services.poisearch.PoiResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L1a
            r5.c(r0)     // Catch: com.amap.api.services.core.AMapException -> L1a
            return r0
        Lc0:
            com.amap.api.services.poisearch.PoiSearchV2$Query r1 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r1 = r1.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiResultV2 r1 = r5.b(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            if (r1 != 0) goto Lf4
            com.amap.api.col.s.h r1 = new com.amap.api.col.s.h     // Catch: com.amap.api.services.core.AMapException -> L1a
            android.content.Context r2 = r5.f4637c     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.col.s.l r3 = new com.amap.api.col.s.l     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r4 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r4 = r4.clone()     // Catch: com.amap.api.services.core.AMapException -> L1a
            r3.<init>(r4, r0)     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.<init>(r2, r3)     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.lang.Object r0 = r1.O()     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiResultV2 r0 = (com.amap.api.services.poisearch.PoiResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.util.HashMap<java.lang.Integer, com.amap.api.services.poisearch.PoiResultV2> r1 = com.amap.api.col.s.r0.f4635j     // Catch: com.amap.api.services.core.AMapException -> L1a
            com.amap.api.services.poisearch.PoiSearchV2$Query r2 = r5.f4636b     // Catch: com.amap.api.services.core.AMapException -> L1a
            int r2 = r2.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: com.amap.api.services.core.AMapException -> L1a
            r1.put(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L1a
            return r0
        Lf4:
            return r1
        Lf5:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1a
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L1a
        Lfb:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1a
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1a
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L1a
        L101:
            java.lang.String r1 = "PoiSearch"
            java.lang.String r2 = "searchPOI"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = r0.getErrorMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.r0$a r1 = new com.amap.api.col.s.r0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final com.amap.api.services.core.PoiItemV2 searchPOIId(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.f4637c
            com.amap.api.col.s.s4.d(r0)
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r3.f4636b
            if (r0 == 0) goto Le
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r0.clone()
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.amap.api.col.s.f r1 = new com.amap.api.col.s.f
            android.content.Context r2 = r3.f4637c
            r1.<init>(r2, r4, r0)
            java.lang.Object r4 = r1.O()
            com.amap.api.services.core.PoiItemV2 r4 = (com.amap.api.services.core.PoiItemV2) r4
            return r4
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIIdAsyn(java.lang.String r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()
            com.amap.api.col.s.r0$b r1 = new com.amap.api.col.s.r0$b
            r1.<init>(r2, r3)
            r0.b(r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setBound(com.amap.api.services.poisearch.PoiSearchV2.SearchBound r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setLanguage(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lb
            r1.f4639e = r0
            return
        Lb:
            java.lang.String r2 = "zh-CN"
            r1.f4639e = r2
            return
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener r1) {
            r0 = this;
            r0.f4638d = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setQuery(com.amap.api.services.poisearch.PoiSearchV2.Query r1) {
            r0 = this;
            r0.f4636b = r1
            return
    }
}
