package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w0 implements com.amap.api.services.interfaces.IWeatherSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.weather.WeatherSearchQuery f4768b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.weather.WeatherSearch.OnWeatherSearchListener f4769c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.weather.LocalWeatherLiveResult f4770d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.weather.LocalWeatherForecastResult f4771e;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Handler f4772f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.w0 a;

        a(com.amap.api.col.s.w0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r10 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 13
                r0.arg1 = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearchQuery r2 = com.amap.api.col.s.w0.d(r2)
                java.lang.String r3 = "searchWeatherAsyn"
                java.lang.String r4 = "WeatherSearch"
                if (r2 == 0) goto L1b0
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearchQuery r2 = com.amap.api.col.s.w0.d(r2)
                int r2 = r2.getType()
                r5 = 1
                java.lang.String r6 = "searchWeatherAnsyThrowable"
                r7 = 1000(0x3e8, float:1.401E-42)
                java.lang.String r8 = "errorCode"
                if (r2 != r5) goto Le9
                r2 = 1301(0x515, float:1.823E-42)
                com.amap.api.col.s.w0 r5 = r10.a     // Catch: java.lang.Throwable -> L64 com.amap.api.services.core.AMapException -> L66
                com.amap.api.services.weather.LocalWeatherLiveResult r9 = com.amap.api.col.s.w0.f(r5)     // Catch: java.lang.Throwable -> L64 com.amap.api.services.core.AMapException -> L66
                com.amap.api.col.s.w0.c(r5, r9)     // Catch: java.lang.Throwable -> L64 com.amap.api.services.core.AMapException -> L66
                r1.putInt(r8, r7)     // Catch: java.lang.Throwable -> L64 com.amap.api.services.core.AMapException -> L66
                com.amap.api.col.s.u4$o r3 = new com.amap.api.col.s.u4$o
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4749b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherLiveResult r2 = com.amap.api.col.s.w0.h(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            L64:
                r3 = move-exception
                goto L68
            L66:
                r5 = move-exception
                goto L93
            L68:
                com.amap.api.col.s.j4.i(r3, r4, r6)     // Catch: java.lang.Throwable -> L91
                com.amap.api.col.s.u4$o r3 = new com.amap.api.col.s.u4$o
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4749b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherLiveResult r2 = com.amap.api.col.s.w0.h(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            L91:
                r3 = move-exception
                goto Lc3
            L93:
                int r6 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L91
                r1.putInt(r8, r6)     // Catch: java.lang.Throwable -> L91
                com.amap.api.col.s.j4.i(r5, r4, r3)     // Catch: java.lang.Throwable -> L91
                com.amap.api.col.s.u4$o r3 = new com.amap.api.col.s.u4$o
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4749b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherLiveResult r2 = com.amap.api.col.s.w0.h(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            Lc3:
                com.amap.api.col.s.u4$o r4 = new com.amap.api.col.s.u4$o
                r4.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r4.f4749b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherLiveResult r2 = com.amap.api.col.s.w0.h(r2)
                r4.a = r2
                r0.obj = r4
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                throw r3
            Le9:
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearchQuery r2 = com.amap.api.col.s.w0.d(r2)
                int r2 = r2.getType()
                r5 = 2
                if (r2 != r5) goto L1af
                r2 = 1302(0x516, float:1.824E-42)
                com.amap.api.col.s.w0 r5 = r10.a     // Catch: java.lang.Throwable -> L12a com.amap.api.services.core.AMapException -> L12c
                com.amap.api.services.weather.LocalWeatherForecastResult r9 = com.amap.api.col.s.w0.j(r5)     // Catch: java.lang.Throwable -> L12a com.amap.api.services.core.AMapException -> L12c
                com.amap.api.col.s.w0.a(r5, r9)     // Catch: java.lang.Throwable -> L12a com.amap.api.services.core.AMapException -> L12c
                r1.putInt(r8, r7)     // Catch: java.lang.Throwable -> L12a com.amap.api.services.core.AMapException -> L12c
                com.amap.api.col.s.u4$n r3 = new com.amap.api.col.s.u4$n
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4748b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherForecastResult r2 = com.amap.api.col.s.w0.k(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            L12a:
                r3 = move-exception
                goto L12e
            L12c:
                r5 = move-exception
                goto L159
            L12e:
                com.amap.api.col.s.j4.i(r3, r4, r6)     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.s.u4$n r3 = new com.amap.api.col.s.u4$n
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4748b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherForecastResult r2 = com.amap.api.col.s.w0.k(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            L157:
                r3 = move-exception
                goto L189
            L159:
                int r6 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L157
                r1.putInt(r8, r6)     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.s.j4.i(r5, r4, r3)     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.s.u4$n r3 = new com.amap.api.col.s.u4$n
                r3.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r3.f4748b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherForecastResult r2 = com.amap.api.col.s.w0.k(r2)
                r3.a = r2
                r0.obj = r3
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                return
            L189:
                com.amap.api.col.s.u4$n r4 = new com.amap.api.col.s.u4$n
                r4.<init>()
                r0.what = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r2 = com.amap.api.col.s.w0.g(r2)
                r4.f4748b = r2
                com.amap.api.col.s.w0 r2 = r10.a
                com.amap.api.services.weather.LocalWeatherForecastResult r2 = com.amap.api.col.s.w0.k(r2)
                r4.a = r2
                r0.obj = r4
                r0.setData(r1)
                com.amap.api.col.s.w0 r1 = r10.a
                android.os.Handler r1 = com.amap.api.col.s.w0.i(r1)
                r1.sendMessage(r0)
                throw r3
            L1af:
                return
            L1b0:
                com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1b8
                java.lang.String r1 = "无效的参数 - IllegalArgumentException"
                r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1b8
                throw r0     // Catch: com.amap.api.services.core.AMapException -> L1b8
            L1b8:
                r0 = move-exception
                com.amap.api.col.s.j4.i(r0, r4, r3)
                return
        }
    }

    public w0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4772f = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L26
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4772f = r4
            return
        L26:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherForecastResult a(com.amap.api.col.s.w0 r0, com.amap.api.services.weather.LocalWeatherForecastResult r1) {
            r0.f4771e = r1
            return r1
    }

    private com.amap.api.services.weather.LocalWeatherLiveResult b() throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.a
            com.amap.api.col.s.s4.d(r0)
            com.amap.api.services.weather.WeatherSearchQuery r0 = r3.f4768b
            if (r0 == 0) goto L21
            com.amap.api.col.s.e0 r1 = new com.amap.api.col.s.e0
            android.content.Context r2 = r3.a
            r1.<init>(r2, r0)
            java.lang.Object r0 = r1.U()
            com.amap.api.services.weather.WeatherSearchQuery r0 = (com.amap.api.services.weather.WeatherSearchQuery) r0
            java.lang.Object r1 = r1.O()
            com.amap.api.services.weather.LocalWeatherLive r1 = (com.amap.api.services.weather.LocalWeatherLive) r1
            com.amap.api.services.weather.LocalWeatherLiveResult r0 = com.amap.api.services.weather.LocalWeatherLiveResult.createPagedResult(r0, r1)
            return r0
        L21:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherLiveResult c(com.amap.api.col.s.w0 r0, com.amap.api.services.weather.LocalWeatherLiveResult r1) {
            r0.f4770d = r1
            return r1
    }

    static /* synthetic */ com.amap.api.services.weather.WeatherSearchQuery d(com.amap.api.col.s.w0 r0) {
            com.amap.api.services.weather.WeatherSearchQuery r0 = r0.f4768b
            return r0
    }

    private com.amap.api.services.weather.LocalWeatherForecastResult e() throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.a
            com.amap.api.col.s.s4.d(r0)
            com.amap.api.services.weather.WeatherSearchQuery r0 = r3.f4768b
            if (r0 == 0) goto L21
            com.amap.api.col.s.d0 r1 = new com.amap.api.col.s.d0
            android.content.Context r2 = r3.a
            r1.<init>(r2, r0)
            java.lang.Object r0 = r1.U()
            com.amap.api.services.weather.WeatherSearchQuery r0 = (com.amap.api.services.weather.WeatherSearchQuery) r0
            java.lang.Object r1 = r1.O()
            com.amap.api.services.weather.LocalWeatherForecast r1 = (com.amap.api.services.weather.LocalWeatherForecast) r1
            com.amap.api.services.weather.LocalWeatherForecastResult r0 = com.amap.api.services.weather.LocalWeatherForecastResult.createPagedResult(r0, r1)
            return r0
        L21:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherLiveResult f(com.amap.api.col.s.w0 r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.weather.LocalWeatherLiveResult r0 = r0.b()
            return r0
    }

    static /* synthetic */ com.amap.api.services.weather.WeatherSearch.OnWeatherSearchListener g(com.amap.api.col.s.w0 r0) {
            com.amap.api.services.weather.WeatherSearch$OnWeatherSearchListener r0 = r0.f4769c
            return r0
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherLiveResult h(com.amap.api.col.s.w0 r0) {
            com.amap.api.services.weather.LocalWeatherLiveResult r0 = r0.f4770d
            return r0
    }

    static /* synthetic */ android.os.Handler i(com.amap.api.col.s.w0 r0) {
            android.os.Handler r0 = r0.f4772f
            return r0
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherForecastResult j(com.amap.api.col.s.w0 r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.weather.LocalWeatherForecastResult r0 = r0.e()
            return r0
    }

    static /* synthetic */ com.amap.api.services.weather.LocalWeatherForecastResult k(com.amap.api.col.s.w0 r0) {
            com.amap.api.services.weather.LocalWeatherForecastResult r0 = r0.f4771e
            return r0
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final com.amap.api.services.weather.WeatherSearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.weather.WeatherSearchQuery r0 = r1.f4768b
            return r0
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void searchWeatherAsyn() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.w0$a r1 = new com.amap.api.col.s.w0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setOnWeatherSearchListener(com.amap.api.services.weather.WeatherSearch.OnWeatherSearchListener r1) {
            r0 = this;
            r0.f4769c = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setQuery(com.amap.api.services.weather.WeatherSearchQuery r1) {
            r0 = this;
            r0.f4768b = r1
            return
    }
}
