package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k0 implements com.amap.api.services.interfaces.ICloudSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.cloud.CloudSearch.OnCloudSearchListener f4530b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.cloud.CloudSearch.Query f4531c;

    /* renamed from: d, reason: collision with root package name */
    private int f4532d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.HashMap<java.lang.Integer, com.amap.api.services.cloud.CloudResult> f4533e;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Handler f4534f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.cloud.CloudSearch.Query a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.k0 f4535b;

        a(com.amap.api.col.s.k0 r1, com.amap.api.services.cloud.CloudSearch.Query r2) {
                r0 = this;
                r0.f4535b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 12
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r1 = 700(0x2bc, float:9.81E-43)
                r0.what = r1     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.col.s.u4$e r1 = new com.amap.api.col.s.u4$e     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r1.<init>()     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.col.s.k0 r2 = r4.f4535b     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.services.cloud.CloudSearch$OnCloudSearchListener r2 = com.amap.api.col.s.k0.f(r2)     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r1.f4739b = r2     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r0.obj = r1     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.col.s.k0 r2 = r4.f4535b     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.services.cloud.CloudSearch$Query r3 = r4.a     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                com.amap.api.services.cloud.CloudResult r2 = com.amap.api.col.s.k0.d(r2, r3)     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r1.a = r2     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L37 com.amap.api.services.core.AMapException -> L39
            L2d:
                com.amap.api.col.s.k0 r1 = r4.f4535b
                android.os.Handler r1 = com.amap.api.col.s.k0.h(r1)
                r1.sendMessage(r0)
                return
            L37:
                r1 = move-exception
                goto L41
            L39:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L37
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L37
                goto L2d
            L41:
                com.amap.api.col.s.k0 r2 = r4.f4535b
                android.os.Handler r2 = com.amap.api.col.s.k0.h(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.k0 f4537c;

        b(com.amap.api.col.s.k0 r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.f4537c = r1
                r0.a = r2
                r0.f4536b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 12
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r1 = 701(0x2bd, float:9.82E-43)
                r0.what = r1     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                com.amap.api.col.s.u4$d r1 = new com.amap.api.col.s.u4$d     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r1.<init>()     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                com.amap.api.col.s.k0 r2 = r5.f4537c     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                com.amap.api.services.cloud.CloudSearch$OnCloudSearchListener r2 = com.amap.api.col.s.k0.f(r2)     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r1.f4738b = r2     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r0.obj = r1     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                com.amap.api.col.s.k0 r2 = r5.f4537c     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                java.lang.String r4 = r5.f4536b     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                com.amap.api.services.cloud.CloudItemDetail r2 = com.amap.api.col.s.k0.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r1.a = r2     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L39 com.amap.api.services.core.AMapException -> L3b
            L2f:
                com.amap.api.col.s.k0 r1 = r5.f4537c
                android.os.Handler r1 = com.amap.api.col.s.k0.h(r1)
                r1.sendMessage(r0)
                return
            L39:
                r1 = move-exception
                goto L43
            L3b:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L39
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L39
                goto L2f
            L43:
                com.amap.api.col.s.k0 r2 = r5.f4537c
                android.os.Handler r2 = com.amap.api.col.s.k0.h(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    public k0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
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
            r3.f4534f = r4
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

    static /* synthetic */ com.amap.api.services.cloud.CloudItemDetail a(com.amap.api.col.s.k0 r0, java.lang.String r1, java.lang.String r2) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.cloud.CloudItemDetail r0 = r0.b(r1, r2)
            return r0
    }

    private com.amap.api.services.cloud.CloudItemDetail b(java.lang.String r4, java.lang.String r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r4 == 0) goto L46
            java.lang.String r1 = r4.trim()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            if (r5 == 0) goto L40
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L40
            com.amap.api.col.s.j r0 = new com.amap.api.col.s.j     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2f
            com.amap.api.col.s.g4 r4 = new com.amap.api.col.s.g4     // Catch: java.lang.Throwable -> L2f
            android.content.Context r5 = r3.a     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r4.O()     // Catch: java.lang.Throwable -> L2f
            com.amap.api.services.cloud.CloudItemDetail r4 = (com.amap.api.services.cloud.CloudItemDetail) r4     // Catch: java.lang.Throwable -> L2f
            return r4
        L2f:
            r4 = move-exception
            java.lang.String r5 = "CloudSearch"
            java.lang.String r0 = "searchCloudDetail"
            com.amap.api.col.s.j4.i(r4, r5, r0)
            boolean r5 = r4 instanceof com.amap.api.services.core.AMapException
            if (r5 != 0) goto L3d
            r4 = 0
            return r4
        L3d:
            com.amap.api.services.core.AMapException r4 = (com.amap.api.services.core.AMapException) r4
            throw r4
        L40:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            r4.<init>(r0)
            throw r4
        L46:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            r4.<init>(r0)
            throw r4
    }

    private com.amap.api.services.cloud.CloudResult c(int r2) {
            r1 = this;
            boolean r0 = r1.i(r2)
            if (r0 == 0) goto L13
            java.util.HashMap<java.lang.Integer, com.amap.api.services.cloud.CloudResult> r0 = r1.f4533e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.services.cloud.CloudResult r2 = (com.amap.api.services.cloud.CloudResult) r2
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "page out of range"
            r2.<init>(r0)
            throw r2
    }

    static /* synthetic */ com.amap.api.services.cloud.CloudResult d(com.amap.api.col.s.k0 r0, com.amap.api.services.cloud.CloudSearch.Query r1) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.cloud.CloudResult r0 = r0.e(r1)
            return r0
    }

    private com.amap.api.services.cloud.CloudResult e(com.amap.api.services.cloud.CloudSearch.Query r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r0 = 0
            boolean r1 = j(r4)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L60
            com.amap.api.services.cloud.CloudSearch$Query r1 = r3.f4531c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r4.queryEquals(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 0
            r3.f4532d = r1     // Catch: java.lang.Throwable -> L20
            com.amap.api.services.cloud.CloudSearch$Query r1 = r4.clone()     // Catch: java.lang.Throwable -> L20
            r3.f4531c = r1     // Catch: java.lang.Throwable -> L20
            java.util.HashMap<java.lang.Integer, com.amap.api.services.cloud.CloudResult> r1 = r3.f4533e     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            r1.clear()     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L68
        L22:
            int r1 = r3.f4532d     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L3a
            com.amap.api.col.s.h4 r1 = new com.amap.api.col.s.h4     // Catch: java.lang.Throwable -> L20
            android.content.Context r2 = r3.a     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.O()     // Catch: java.lang.Throwable -> L20
            com.amap.api.services.cloud.CloudResult r1 = (com.amap.api.services.cloud.CloudResult) r1     // Catch: java.lang.Throwable -> L20
            r3.g(r1, r4)     // Catch: java.lang.Throwable -> L37
            return r1
        L37:
            r4 = move-exception
            r0 = r1
            goto L68
        L3a:
            int r1 = r4.getPageNum()     // Catch: java.lang.Throwable -> L20
            com.amap.api.services.cloud.CloudResult r0 = r3.c(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L5f
            com.amap.api.col.s.h4 r1 = new com.amap.api.col.s.h4     // Catch: java.lang.Throwable -> L20
            android.content.Context r2 = r3.a     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.O()     // Catch: java.lang.Throwable -> L20
            com.amap.api.services.cloud.CloudResult r1 = (com.amap.api.services.cloud.CloudResult) r1     // Catch: java.lang.Throwable -> L20
            java.util.HashMap<java.lang.Integer, com.amap.api.services.cloud.CloudResult> r0 = r3.f4533e     // Catch: java.lang.Throwable -> L37
            int r4 = r4.getPageNum()     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L37
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L37
            return r1
        L5f:
            return r0
        L60:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L20
        L68:
            java.lang.String r1 = "CloudSearch"
            java.lang.String r2 = "searchCloud"
            com.amap.api.col.s.j4.i(r4, r1, r2)
            boolean r1 = r4 instanceof com.amap.api.services.core.AMapException
            if (r1 != 0) goto L74
            return r0
        L74:
            com.amap.api.services.core.AMapException r4 = (com.amap.api.services.core.AMapException) r4
            throw r4
    }

    static /* synthetic */ com.amap.api.services.cloud.CloudSearch.OnCloudSearchListener f(com.amap.api.col.s.k0 r0) {
            com.amap.api.services.cloud.CloudSearch$OnCloudSearchListener r0 = r0.f4530b
            return r0
    }

    private void g(com.amap.api.services.cloud.CloudResult r3, com.amap.api.services.cloud.CloudSearch.Query r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f4533e = r0
            int r1 = r2.f4532d
            if (r1 <= 0) goto L16
            int r4 = r4.getPageNum()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r3)
        L16:
            return
    }

    static /* synthetic */ android.os.Handler h(com.amap.api.col.s.k0 r0) {
            android.os.Handler r0 = r0.f4534f
            return r0
    }

    private boolean i(int r2) {
            r1 = this;
            int r0 = r1.f4532d
            if (r2 > r0) goto L8
            if (r2 <= 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean j(com.amap.api.services.cloud.CloudSearch.Query r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r8.getTableID()
            boolean r1 = com.amap.api.col.s.j4.j(r1)
            if (r1 != 0) goto Lac
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            if (r1 != 0) goto L16
            goto Lac
        L16:
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            if (r1 == 0) goto L37
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L37
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenter()
            if (r1 != 0) goto L37
            return r0
        L37:
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            if (r1 == 0) goto L7b
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Rectangle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7b
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            com.amap.api.services.core.LatLonPoint r1 = r1.getLowerLeft()
            com.amap.api.services.cloud.CloudSearch$SearchBound r2 = r8.getBound()
            com.amap.api.services.core.LatLonPoint r2 = r2.getUpperRight()
            if (r1 == 0) goto L7a
            if (r2 != 0) goto L62
            goto L7a
        L62:
            double r3 = r1.getLatitude()
            double r5 = r2.getLatitude()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L7a
            double r3 = r1.getLongitude()
            double r1 = r2.getLongitude()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L7b
        L7a:
            return r0
        L7b:
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            if (r1 == 0) goto Laa
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r8.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Polygon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Laa
            com.amap.api.services.cloud.CloudSearch$SearchBound r8 = r8.getBound()
            java.util.List r8 = r8.getPolyGonList()
            r1 = 0
        L9a:
            int r2 = r8.size()
            if (r1 >= r2) goto Laa
            java.lang.Object r2 = r8.get(r1)
            if (r2 != 0) goto La7
            return r0
        La7:
            int r1 = r1 + 1
            goto L9a
        Laa:
            r8 = 1
            return r8
        Lac:
            return r0
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudAsyn(com.amap.api.services.cloud.CloudSearch.Query r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.k0$a r1 = new com.amap.api.col.s.k0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudDetailAsyn(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.k0$b r1 = new com.amap.api.col.s.k0$b     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void setOnCloudSearchListener(com.amap.api.services.cloud.CloudSearch.OnCloudSearchListener r1) {
            r0 = this;
            r0.f4530b = r1
            return
    }
}
