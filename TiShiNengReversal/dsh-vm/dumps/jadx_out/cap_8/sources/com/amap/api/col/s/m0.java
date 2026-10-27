package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m0 implements com.amap.api.services.interfaces.IDistrictSearch {

    /* renamed from: g, reason: collision with root package name */
    private static java.util.HashMap<java.lang.Integer, com.amap.api.services.district.DistrictResult> f4561g;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.district.DistrictSearchQuery f4562b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.district.DistrictSearch.OnDistrictSearchListener f4563c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.district.DistrictSearchQuery f4564d;

    /* renamed from: e, reason: collision with root package name */
    private int f4565e;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Handler f4566f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.m0 a;

        a(com.amap.api.col.s.m0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "result"
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                android.os.Message r1 = r1.obtainMessage()
                com.amap.api.services.district.DistrictResult r2 = new com.amap.api.services.district.DistrictResult
                r2.<init>()
                com.amap.api.col.s.m0 r3 = r7.a
                com.amap.api.services.district.DistrictSearchQuery r3 = com.amap.api.col.s.m0.b(r3)
                r2.setQuery(r3)
                r3 = 4
                com.amap.api.col.s.m0 r4 = r7.a     // Catch: java.lang.Throwable -> L2a com.amap.api.services.core.AMapException -> L2c
                com.amap.api.services.district.DistrictResult r2 = r4.searchDistrict()     // Catch: java.lang.Throwable -> L2a com.amap.api.services.core.AMapException -> L2c
                if (r2 == 0) goto L2e
                com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L2a com.amap.api.services.core.AMapException -> L2c
                r4.<init>()     // Catch: java.lang.Throwable -> L2a com.amap.api.services.core.AMapException -> L2c
                r2.setAMapException(r4)     // Catch: java.lang.Throwable -> L2a com.amap.api.services.core.AMapException -> L2c
                goto L2e
            L2a:
                r4 = move-exception
                goto L55
            L2c:
                r4 = move-exception
                goto L85
            L2e:
                r1.arg1 = r3
                com.amap.api.col.s.m0 r3 = r7.a
                com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r3 = com.amap.api.col.s.m0.e(r3)
                r1.obj = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putParcelable(r0, r2)
                r1.setData(r3)
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                if (r0 == 0) goto La6
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                r0.sendMessage(r1)
                return
            L55:
                java.lang.String r5 = "DistrictSearch"
                java.lang.String r6 = "searchDistrictAnsyThrowable"
                com.amap.api.col.s.j4.i(r4, r5, r6)     // Catch: java.lang.Throwable -> L83
                r1.arg1 = r3
                com.amap.api.col.s.m0 r3 = r7.a
                com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r3 = com.amap.api.col.s.m0.e(r3)
                r1.obj = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putParcelable(r0, r2)
                r1.setData(r3)
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                if (r0 == 0) goto La6
            L79:
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                r0.sendMessage(r1)
                goto La6
            L83:
                r4 = move-exception
                goto La7
            L85:
                r2.setAMapException(r4)     // Catch: java.lang.Throwable -> L83
                r1.arg1 = r3
                com.amap.api.col.s.m0 r3 = r7.a
                com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r3 = com.amap.api.col.s.m0.e(r3)
                r1.obj = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putParcelable(r0, r2)
                r1.setData(r3)
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                if (r0 == 0) goto La6
                goto L79
            La6:
                return
            La7:
                r1.arg1 = r3
                com.amap.api.col.s.m0 r3 = r7.a
                com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r3 = com.amap.api.col.s.m0.e(r3)
                r1.obj = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putParcelable(r0, r2)
                r1.setData(r3)
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                if (r0 == 0) goto Lcd
                com.amap.api.col.s.m0 r0 = r7.a
                android.os.Handler r0 = com.amap.api.col.s.m0.g(r0)
                r0.sendMessage(r1)
            Lcd:
                throw r4
        }
    }

    public m0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
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
            r3.f4566f = r4
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

    private com.amap.api.services.district.DistrictResult a(int r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            boolean r0 = r1.f(r2)
            if (r0 == 0) goto L13
            java.util.HashMap<java.lang.Integer, com.amap.api.services.district.DistrictResult> r0 = com.amap.api.col.s.m0.f4561g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.services.district.DistrictResult r2 = (com.amap.api.services.district.DistrictResult) r2
            return r2
        L13:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r0)
            throw r2
    }

    static /* synthetic */ com.amap.api.services.district.DistrictSearchQuery b(com.amap.api.col.s.m0 r0) {
            com.amap.api.services.district.DistrictSearchQuery r0 = r0.f4562b
            return r0
    }

    private void c(com.amap.api.services.district.DistrictResult r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.s.m0.f4561g = r0
            com.amap.api.services.district.DistrictSearchQuery r0 = r2.f4562b
            if (r0 == 0) goto L27
            if (r3 != 0) goto Le
            goto L27
        Le:
            int r1 = r2.f4565e
            if (r1 <= 0) goto L27
            int r0 = r0.getPageNum()
            if (r1 <= r0) goto L27
            java.util.HashMap<java.lang.Integer, com.amap.api.services.district.DistrictResult> r0 = com.amap.api.col.s.m0.f4561g
            com.amap.api.services.district.DistrictSearchQuery r1 = r2.f4562b
            int r1 = r1.getPageNum()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r3)
        L27:
            return
    }

    private boolean d() {
            r1 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r1.f4562b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    static /* synthetic */ com.amap.api.services.district.DistrictSearch.OnDistrictSearchListener e(com.amap.api.col.s.m0 r0) {
            com.amap.api.services.district.DistrictSearch$OnDistrictSearchListener r0 = r0.f4563c
            return r0
    }

    private boolean f(int r2) {
            r1 = this;
            int r0 = r1.f4565e
            if (r2 >= r0) goto L8
            if (r2 < 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    static /* synthetic */ android.os.Handler g(com.amap.api.col.s.m0 r0) {
            android.os.Handler r0 = r0.f4566f
            return r0
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final com.amap.api.services.district.DistrictSearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.district.DistrictSearchQuery r0 = r1.f4562b
            return r0
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final com.amap.api.services.district.DistrictResult searchDistrict() throws com.amap.api.services.core.AMapException {
            r3 = this;
            com.amap.api.services.district.DistrictResult r0 = new com.amap.api.services.district.DistrictResult     // Catch: com.amap.api.services.core.AMapException -> L18
            r0.<init>()     // Catch: com.amap.api.services.core.AMapException -> L18
            android.content.Context r1 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.col.s.s4.d(r1)     // Catch: com.amap.api.services.core.AMapException -> L18
            boolean r1 = r3.d()     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r1 != 0) goto L1b
            com.amap.api.services.district.DistrictSearchQuery r1 = new com.amap.api.services.district.DistrictSearchQuery     // Catch: com.amap.api.services.core.AMapException -> L18
            r1.<init>()     // Catch: com.amap.api.services.core.AMapException -> L18
            r3.f4562b = r1     // Catch: com.amap.api.services.core.AMapException -> L18
            goto L1b
        L18:
            r0 = move-exception
            goto La4
        L1b:
            com.amap.api.services.district.DistrictSearchQuery r1 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r1 = r1.clone()     // Catch: com.amap.api.services.core.AMapException -> L18
            r0.setQuery(r1)     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r0 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r1 = r3.f4564d     // Catch: com.amap.api.services.core.AMapException -> L18
            boolean r0 = r0.weakEquals(r1)     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r0 != 0) goto L40
            r0 = 0
            r3.f4565e = r0     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r0 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L18
            r3.f4564d = r0     // Catch: com.amap.api.services.core.AMapException -> L18
            java.util.HashMap<java.lang.Integer, com.amap.api.services.district.DistrictResult> r0 = com.amap.api.col.s.m0.f4561g     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r0 == 0) goto L40
            r0.clear()     // Catch: com.amap.api.services.core.AMapException -> L18
        L40:
            int r0 = r3.f4565e     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r0 != 0) goto L64
            com.amap.api.col.s.l4 r0 = new com.amap.api.col.s.l4     // Catch: com.amap.api.services.core.AMapException -> L18
            android.content.Context r1 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r2 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r2 = r2.clone()     // Catch: com.amap.api.services.core.AMapException -> L18
            r0.<init>(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L18
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictResult r0 = (com.amap.api.services.district.DistrictResult) r0     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r0 != 0) goto L5a
            return r0
        L5a:
            int r1 = r0.getPageCount()     // Catch: com.amap.api.services.core.AMapException -> L18
            r3.f4565e = r1     // Catch: com.amap.api.services.core.AMapException -> L18
            r3.c(r0)     // Catch: com.amap.api.services.core.AMapException -> L18
            return r0
        L64:
            com.amap.api.services.district.DistrictSearchQuery r0 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            int r0 = r0.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictResult r0 = r3.a(r0)     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r0 != 0) goto La3
            com.amap.api.col.s.l4 r0 = new com.amap.api.col.s.l4     // Catch: com.amap.api.services.core.AMapException -> L18
            android.content.Context r1 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r2 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r2 = r2.clone()     // Catch: com.amap.api.services.core.AMapException -> L18
            r0.<init>(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L18
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictResult r0 = (com.amap.api.services.district.DistrictResult) r0     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r1 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r1 == 0) goto La3
            if (r0 != 0) goto L8a
            goto La3
        L8a:
            int r2 = r3.f4565e     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r2 <= 0) goto La3
            int r1 = r1.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L18
            if (r2 <= r1) goto La3
            java.util.HashMap<java.lang.Integer, com.amap.api.services.district.DistrictResult> r1 = com.amap.api.col.s.m0.f4561g     // Catch: com.amap.api.services.core.AMapException -> L18
            com.amap.api.services.district.DistrictSearchQuery r2 = r3.f4562b     // Catch: com.amap.api.services.core.AMapException -> L18
            int r2 = r2.getPageNum()     // Catch: com.amap.api.services.core.AMapException -> L18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: com.amap.api.services.core.AMapException -> L18
            r1.put(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L18
        La3:
            return r0
        La4:
            java.lang.String r1 = "DistrictSearch"
            java.lang.String r2 = "searchDistrict"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            throw r0
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAnsy() {
            r0 = this;
            r0.searchDistrictAsyn()
            return
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.m0$a r1 = new com.amap.api.col.s.m0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setOnDistrictSearchListener(com.amap.api.services.district.DistrictSearch.OnDistrictSearchListener r1) {
            r0 = this;
            r0.f4563c = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setQuery(com.amap.api.services.district.DistrictSearchQuery r1) {
            r0 = this;
            r0.f4562b = r1
            return
    }
}
