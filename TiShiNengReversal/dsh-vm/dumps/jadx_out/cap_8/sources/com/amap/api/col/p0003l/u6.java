package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u6 {
    java.lang.Object a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4015b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.location.AMapLocationClient f4016c;

    /* renamed from: d, reason: collision with root package name */
    private android.webkit.WebView f4017d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f4018e;

    /* renamed from: f, reason: collision with root package name */
    com.amap.api.location.AMapLocationClientOption f4019f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f4020g;

    /* renamed from: h, reason: collision with root package name */
    com.amap.api.col.3l.u6.c f4021h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.webkit.ValueCallback<java.lang.String> {
        final /* synthetic */ com.amap.api.col.p0003l.u6 a;

        a(com.amap.api.col.p0003l.u6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(java.lang.String r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.u6 f4022b;

        b(com.amap.api.col.p0003l.u6 r1, java.lang.String r2) {
                r0 = this;
                r0.f4022b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.3l.u6 r0 = r3.f4022b
                android.webkit.WebView r0 = com.amap.api.col.p0003l.u6.f(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "javascript:"
                r1.<init>(r2)
                com.amap.api.col.3l.u6 r2 = r3.f4022b
                java.lang.String r2 = com.amap.api.col.p0003l.u6.a(r2)
                r1.append(r2)
                java.lang.String r2 = "('"
                r1.append(r2)
                java.lang.String r2 = r3.a
                r1.append(r2)
                java.lang.String r2 = "')"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.loadUrl(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.amap.api.location.AMapLocationListener {
        final /* synthetic */ com.amap.api.col.p0003l.u6 a;

        c(com.amap.api.col.p0003l.u6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(com.amap.api.location.AMapLocation r2) {
                r1 = this;
                com.amap.api.col.3l.u6 r0 = r1.a
                boolean r0 = com.amap.api.col.p0003l.u6.j(r0)
                if (r0 == 0) goto L11
                com.amap.api.col.3l.u6 r0 = r1.a
                java.lang.String r2 = com.amap.api.col.p0003l.u6.b(r2)
                com.amap.api.col.p0003l.u6.d(r0, r2)
            L11:
                return
        }
    }

    public u6(android.content.Context r3, android.webkit.WebView r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.a = r0
            r0 = 0
            r2.f4016c = r0
            r2.f4017d = r0
            java.lang.String r1 = "AMap.Geolocation.cbk"
            r2.f4018e = r1
            r2.f4019f = r0
            r1 = 0
            r2.f4020g = r1
            r2.f4021h = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.f4015b = r3
            r2.f4017d = r4
            com.amap.api.col.3l.u6$c r3 = new com.amap.api.col.3l.u6$c
            r3.<init>(r2)
            r2.f4021h = r3
            return
    }

    static /* synthetic */ java.lang.String a(com.amap.api.col.p0003l.u6 r0) {
            java.lang.String r0 = r0.f4018e
            return r0
    }

    static /* synthetic */ java.lang.String b(com.amap.api.location.AMapLocation r0) {
            java.lang.String r0 = g(r0)
            return r0
    }

    static /* synthetic */ void d(com.amap.api.col.p0003l.u6 r0, java.lang.String r1) {
            r0.i(r1)
            return
    }

    private void e(java.lang.String r9) {
            r8 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r8.f4019f
            if (r0 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r8.f4019f = r0
        Lb:
            r0 = 5
            r1 = 30000(0x7530, double:1.4822E-319)
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = "to"
            long r1 = r4.optLong(r9, r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = "useGPS"
            r5 = 1
            int r9 = r4.optInt(r9, r5)     // Catch: java.lang.Throwable -> L4f
            if (r9 != r5) goto L25
            r9 = 1
            goto L26
        L25:
            r9 = 0
        L26:
            java.lang.String r6 = "watch"
            int r6 = r4.optInt(r6, r3)     // Catch: java.lang.Throwable -> L4e
            if (r6 != r5) goto L2f
            r3 = 1
        L2f:
            java.lang.String r5 = "interval"
            int r0 = r4.optInt(r5, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "callback"
            r6 = 0
            java.lang.String r4 = r4.optString(r5, r6)     // Catch: java.lang.Throwable -> L4a
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 != 0) goto L45
            r8.f4018e = r4     // Catch: java.lang.Throwable -> L4a
            goto L53
        L45:
            java.lang.String r4 = "AMap.Geolocation.cbk"
            r8.f4018e = r4     // Catch: java.lang.Throwable -> L4a
            goto L53
        L4a:
            r7 = r3
            r3 = r9
            r9 = r7
            goto L50
        L4e:
            r3 = r9
        L4f:
            r9 = 0
        L50:
            r7 = r3
            r3 = r9
            r9 = r7
        L53:
            com.amap.api.location.AMapLocationClientOption r4 = r8.f4019f     // Catch: java.lang.Throwable -> L7a
            r4.setHttpTimeOut(r1)     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L62
            com.amap.api.location.AMapLocationClientOption r9 = r8.f4019f     // Catch: java.lang.Throwable -> L7a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: java.lang.Throwable -> L7a
            r9.setLocationMode(r1)     // Catch: java.lang.Throwable -> L7a
            goto L69
        L62:
            com.amap.api.location.AMapLocationClientOption r9 = r8.f4019f     // Catch: java.lang.Throwable -> L7a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: java.lang.Throwable -> L7a
            r9.setLocationMode(r1)     // Catch: java.lang.Throwable -> L7a
        L69:
            com.amap.api.location.AMapLocationClientOption r9 = r8.f4019f     // Catch: java.lang.Throwable -> L7a
            r1 = r3 ^ 1
            r9.setOnceLocation(r1)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7a
            com.amap.api.location.AMapLocationClientOption r9 = r8.f4019f     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L7a
            r9.setInterval(r0)     // Catch: java.lang.Throwable -> L7a
        L7a:
            return
    }

    static /* synthetic */ android.webkit.WebView f(com.amap.api.col.p0003l.u6 r0) {
            android.webkit.WebView r0 = r0.f4017d
            return r0
    }

    private static java.lang.String g(com.amap.api.location.AMapLocation r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errorInfo"
            java.lang.String r2 = "errorCode"
            if (r5 != 0) goto L16
            r5 = -1
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "unknownError"
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lc1
            goto Lc1
        L16:
            int r3 = r5.getErrorCode()     // Catch: java.lang.Throwable -> Lc1
            if (r3 != 0) goto Laa
            r1 = 0
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> Lc1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "x"
            double r3 = r5.getLongitude()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "y"
            double r3 = r5.getLatitude()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "precision"
            float r3 = r5.getAccuracy()     // Catch: java.lang.Throwable -> Lc1
            double r3 = (double) r3     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "type"
            int r3 = r5.getLocationType()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "country"
            java.lang.String r3 = r5.getCountry()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "province"
            java.lang.String r3 = r5.getProvince()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "city"
            java.lang.String r3 = r5.getCity()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "cityCode"
            java.lang.String r3 = r5.getCityCode()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "district"
            java.lang.String r3 = r5.getDistrict()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "adCode"
            java.lang.String r3 = r5.getAdCode()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "street"
            java.lang.String r3 = r5.getStreet()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "streetNum"
            java.lang.String r3 = r5.getStreetNum()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "floor"
            java.lang.String r3 = r5.getFloor()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "address"
            java.lang.String r5 = r5.getAddress()     // Catch: java.lang.Throwable -> Lc1
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "result"
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lc1
            goto Lc1
        Laa:
            int r3 = r5.getErrorCode()     // Catch: java.lang.Throwable -> Lc1
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r5.getErrorInfo()     // Catch: java.lang.Throwable -> Lc1
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "locationDetail"
            java.lang.String r5 = r5.getLocationDetail()     // Catch: java.lang.Throwable -> Lc1
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void i(java.lang.String r4) {
            r3 = this;
            android.webkit.WebView r0 = r3.f4017d     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "javascript:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r3.f4018e     // Catch: java.lang.Throwable -> L2a
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "('"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            r1.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "')"
            r1.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            com.amap.api.col.3l.u6$a r1 = new com.amap.api.col.3l.u6$a     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            r0.evaluateJavascript(r4, r1)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r4 = move-exception
            goto L2d
        L2c:
            return
        L2d:
            java.lang.String r0 = "H5LocationClient"
            java.lang.String r1 = "callbackJs()"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    static /* synthetic */ boolean j(com.amap.api.col.p0003l.u6 r0) {
            boolean r0 = r0.f4020g
            return r0
    }

    public final void c() {
            r3 = this;
            android.webkit.WebView r0 = r3.f4017d
            if (r0 == 0) goto L44
            android.content.Context r0 = r3.f4015b
            if (r0 != 0) goto L9
            goto L44
        L9:
            boolean r0 = r3.f4020g
            if (r0 == 0) goto Le
            goto L44
        Le:
            android.webkit.WebView r0 = r3.f4017d     // Catch: java.lang.Throwable -> L44
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Throwable -> L44
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Throwable -> L44
            android.webkit.WebView r0 = r3.f4017d     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "AMapAndroidLoc"
            r0.addJavascriptInterface(r3, r2)     // Catch: java.lang.Throwable -> L44
            android.webkit.WebView r0 = r3.f4017d     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.Throwable -> L44
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L30
            android.webkit.WebView r0 = r3.f4017d     // Catch: java.lang.Throwable -> L44
            r0.reload()     // Catch: java.lang.Throwable -> L44
        L30:
            com.amap.api.location.AMapLocationClient r0 = r3.f4016c     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L42
            com.amap.api.location.AMapLocationClient r0 = new com.amap.api.location.AMapLocationClient     // Catch: java.lang.Throwable -> L44
            android.content.Context r2 = r3.f4015b     // Catch: java.lang.Throwable -> L44
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L44
            r3.f4016c = r0     // Catch: java.lang.Throwable -> L44
            com.amap.api.col.3l.u6$c r2 = r3.f4021h     // Catch: java.lang.Throwable -> L44
            r0.setLocationListener(r2)     // Catch: java.lang.Throwable -> L44
        L42:
            r3.f4020g = r1     // Catch: java.lang.Throwable -> L44
        L44:
            return
    }

    @android.webkit.JavascriptInterface
    public final void getLocation(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.f4020g     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L23
        Lb:
            r2.e(r3)     // Catch: java.lang.Throwable -> L9
            com.amap.api.location.AMapLocationClient r3 = r2.f4016c     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L21
            com.amap.api.location.AMapLocationClientOption r1 = r2.f4019f     // Catch: java.lang.Throwable -> L9
            r3.setLocationOption(r1)     // Catch: java.lang.Throwable -> L9
            com.amap.api.location.AMapLocationClient r3 = r2.f4016c     // Catch: java.lang.Throwable -> L9
            r3.stopLocation()     // Catch: java.lang.Throwable -> L9
            com.amap.api.location.AMapLocationClient r3 = r2.f4016c     // Catch: java.lang.Throwable -> L9
            r3.startLocation()     // Catch: java.lang.Throwable -> L9
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public final void h() {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            r1 = 0
            r4.f4020g = r1     // Catch: java.lang.Throwable -> L1d
            com.amap.api.location.AMapLocationClient r1 = r4.f4016c     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            if (r1 == 0) goto L1f
            com.amap.api.col.3l.u6$c r3 = r4.f4021h     // Catch: java.lang.Throwable -> L1d
            r1.unRegisterLocationListener(r3)     // Catch: java.lang.Throwable -> L1d
            com.amap.api.location.AMapLocationClient r1 = r4.f4016c     // Catch: java.lang.Throwable -> L1d
            r1.stopLocation()     // Catch: java.lang.Throwable -> L1d
            com.amap.api.location.AMapLocationClient r1 = r4.f4016c     // Catch: java.lang.Throwable -> L1d
            r1.onDestroy()     // Catch: java.lang.Throwable -> L1d
            r4.f4016c = r2     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            r4.f4019f = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    @android.webkit.JavascriptInterface
    public final void stopLocation() {
            r1 = this;
            boolean r0 = r1.f4020g
            if (r0 != 0) goto L5
            goto Lc
        L5:
            com.amap.api.location.AMapLocationClient r0 = r1.f4016c
            if (r0 == 0) goto Lc
            r0.stopLocation()
        Lc:
            return
    }
}
