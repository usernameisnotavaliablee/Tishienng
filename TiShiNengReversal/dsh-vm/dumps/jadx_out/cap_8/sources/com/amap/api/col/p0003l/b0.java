package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b0 implements com.amap.api.maps.LocationSource {
    private java.lang.reflect.Method A;
    private java.lang.reflect.Method B;
    private java.lang.reflect.Method C;
    private java.lang.reflect.Method D;
    private java.lang.reflect.Method E;
    private java.lang.reflect.Method F;
    private java.lang.reflect.Method G;
    private java.lang.reflect.Method H;
    private java.lang.reflect.Method I;
    private boolean J;
    private long K;
    private java.lang.reflect.InvocationHandler L;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.LocationSource.OnLocationChangedListener f2993b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Object f2994c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.Object f2995d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Object f2996e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.reflect.Method f2997f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.reflect.Method f2998g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.reflect.Method f2999h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.reflect.Method f3000i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.reflect.Method f3001j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.reflect.Method f3002k;
    private java.lang.reflect.Method l;
    private java.lang.reflect.Method m;
    private java.lang.reflect.Method n;
    private java.lang.reflect.Method o;
    private java.lang.reflect.Method p;
    private java.lang.reflect.Method q;
    private java.lang.reflect.Method r;
    private java.lang.reflect.Method s;
    private java.lang.reflect.Method t;
    private java.lang.reflect.Method u;
    private java.lang.reflect.Method v;
    private java.lang.reflect.Method w;
    private java.lang.reflect.Method x;
    private java.lang.reflect.Method y;
    private java.lang.reflect.Method z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.reflect.InvocationHandler {
        final /* synthetic */ com.amap.api.col.p0003l.b0 a;

        a(com.amap.api.col.p0003l.b0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) throws java.lang.Throwable {
                r4 = this;
                java.lang.String r5 = r6.getName()
                java.lang.String r6 = "onLocationChanged"
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                r6 = 0
                if (r5 == 0) goto L21f
                com.amap.api.col.3l.b0 r5 = r4.a
                com.amap.api.maps.LocationSource$OnLocationChangedListener r5 = com.amap.api.col.p0003l.b0.a(r5)
                if (r5 != 0) goto L16
                return r6
            L16:
                if (r7 != 0) goto L19
                return r6
            L19:
                int r5 = r7.length
                r0 = 1
                if (r5 == r0) goto L1e
                return r6
            L1e:
                r5 = 0
                r7 = r7[r5]
                r0 = r7
                android.location.Location r0 = (android.location.Location) r0
                android.os.Bundle r1 = r0.getExtras()
                if (r1 != 0) goto L2f
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
            L2f:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.f(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.Integer
                if (r3 == 0) goto L4a
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                java.lang.String r3 = "errorCode"
                r1.putInt(r3, r2)
            L4a:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.h(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L61
                java.lang.String r3 = "errorInfo"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L61:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.j(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.Integer
                if (r3 == 0) goto L7c
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                java.lang.String r3 = "locationType"
                r1.putInt(r3, r2)
            L7c:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.k(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.Float
                if (r3 == 0) goto L97
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                java.lang.String r3 = "Accuracy"
                r1.putFloat(r3, r2)
            L97:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.l(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto Lae
                java.lang.String r3 = "AdCode"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            Lae:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.m(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto Lc5
                java.lang.String r3 = "Address"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            Lc5:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.n(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto Ldc
                java.lang.String r3 = "AoiName"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            Ldc:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.o(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto Lf3
                java.lang.String r3 = "City"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            Lf3:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.p(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L10a
                java.lang.String r3 = "CityCode"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L10a:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.q(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L121
                java.lang.String r3 = "Country"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L121:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.r(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L138
                java.lang.String r3 = "District"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L138:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.s(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L14f
                java.lang.String r3 = "Street"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L14f:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.t(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L166
                java.lang.String r3 = "StreetNum"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L166:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.u(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L17d
                java.lang.String r3 = "PoiName"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L17d:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.v(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L194
                java.lang.String r3 = "Province"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L194:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.w(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.Float
                if (r3 == 0) goto L1af
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                java.lang.String r3 = "Speed"
                r1.putFloat(r3, r2)
            L1af:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.x(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L1c6
                java.lang.String r3 = "Floor"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L1c6:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.y(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.Float
                if (r3 == 0) goto L1e1
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                java.lang.String r3 = "Bearing"
                r1.putFloat(r3, r2)
            L1e1:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.z(r2)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Object r2 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r3)
                boolean r3 = r2 instanceof java.lang.String
                if (r3 == 0) goto L1f8
                java.lang.String r3 = "BuildingId"
                java.lang.String r2 = (java.lang.String) r2
                r1.putString(r3, r2)
            L1f8:
                com.amap.api.col.3l.b0 r2 = r4.a
                java.lang.reflect.Method r2 = com.amap.api.col.p0003l.b0.A(r2)
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Object r5 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r5)
                boolean r7 = r5 instanceof java.lang.Double
                if (r7 == 0) goto L213
                java.lang.Double r5 = (java.lang.Double) r5
                double r2 = r5.doubleValue()
                java.lang.String r5 = "Altitude"
                r1.putDouble(r5, r2)
            L213:
                r0.setExtras(r1)
                com.amap.api.col.3l.b0 r5 = r4.a
                com.amap.api.maps.LocationSource$OnLocationChangedListener r5 = com.amap.api.col.p0003l.b0.a(r5)
                r5.onLocationChanged(r0)
            L21f:
                return r6
        }
    }

    public b0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.J = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.K = r0
            com.amap.api.col.3l.b0$a r0 = new com.amap.api.col.3l.b0$a
            r0.<init>(r2)
            r2.L = r0
            r2.a = r3
            r2.b()
            r2.g()
            r2.i()
            return
    }

    static /* synthetic */ java.lang.reflect.Method A(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.I
            return r0
    }

    static /* synthetic */ com.amap.api.maps.LocationSource.OnLocationChangedListener a(com.amap.api.col.p0003l.b0 r0) {
            com.amap.api.maps.LocationSource$OnLocationChangedListener r0 = r0.f2993b
            return r0
    }

    private void b() {
            r6 = this;
            java.lang.String r0 = "com.amap.api.location.AMapLocationClient"
            java.lang.String r1 = "setLocationListener"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            java.lang.Class<com.amap.api.location.AMapLocationListener> r4 = com.amap.api.location.AMapLocationListener.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> L42
            r6.f2997f = r1     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = "setLocationOption"
            java.lang.String r3 = "com.amap.api.location.AMapLocationClientOption"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L42
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            r2[r5] = r3     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L42
            r6.f2998g = r1     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = "startLocation"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L42
            r6.f2999h = r1     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = "stopLocation"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L42
            r6.f3000i = r1     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = "onDestroy"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r0 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L42
            r6.f3001j = r0     // Catch: java.lang.Exception -> L42
        L42:
            return
    }

    private void e(boolean r7) {
            r6 = this;
            java.lang.Object r0 = r6.f2995d
            if (r0 == 0) goto L89
            java.lang.Object r0 = r6.f2994c
            if (r0 == 0) goto L89
            java.lang.reflect.Method r1 = r6.f3001j     // Catch: java.lang.Exception -> L89
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r1, r3)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = "com.amap.api.location.AMapLocationClient"
            r1 = 1
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L89
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L89
            android.content.Context r4 = r6.a     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            r5[r2] = r4     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.newInstance(r0, r3, r5)     // Catch: java.lang.Exception -> L89
            r6.f2994c = r0     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.amap.api.col.3l.b0> r0 = com.amap.api.col.p0003l.b0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L89
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.amap.api.location.AMapLocationListener> r4 = com.amap.api.location.AMapLocationListener.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L89
            java.lang.reflect.InvocationHandler r4 = r6.L     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r3, r4)     // Catch: java.lang.Exception -> L89
            r6.f2996e = r0     // Catch: java.lang.Exception -> L89
            java.lang.Object r3 = r6.f2994c     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r4 = r6.f2997f     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            r5[r2] = r0     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r3, r4, r5)     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = r6.f2995d     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r3 = r6.l     // Catch: java.lang.Exception -> L89
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            r5[r2] = r4     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r3, r5)     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = r6.f2995d     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r3 = r6.n     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L89
            r4[r2] = r5     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r3, r4)     // Catch: java.lang.Exception -> L89
            if (r7 != 0) goto L73
            java.lang.Object r0 = r6.f2995d     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r3 = r6.f3002k     // Catch: java.lang.Exception -> L89
            long r4 = r6.K     // Catch: java.lang.Exception -> L89
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            r5[r2] = r4     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r3, r5)     // Catch: java.lang.Exception -> L89
        L73:
            java.lang.Object r0 = r6.f2994c     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r3 = r6.f2998g     // Catch: java.lang.Exception -> L89
            java.lang.Object r4 = r6.f2995d     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L89
            r1[r2] = r4     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r3, r1)     // Catch: java.lang.Exception -> L89
            java.lang.Object r0 = r6.f2994c     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r1 = r6.f2999h     // Catch: java.lang.Exception -> L89
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L89
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L89
        L89:
            r6.J = r7
            return
    }

    static /* synthetic */ java.lang.reflect.Method f(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.p
            return r0
    }

    private void g() {
            r7 = this;
            java.lang.String r0 = "com.amap.api.location.AMapLocationClientOption"
            java.lang.String r1 = "setInterval"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L48
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L48
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> L48
            r7.f3002k = r1     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "setOnceLocation"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L48
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L48
            r4[r5] = r3     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r4)     // Catch: java.lang.Exception -> L48
            r7.l = r1     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "setLocationMode"
            java.lang.String r4 = "com.amap.api.location.AMapLocationClientOption$AMapLocationMode"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L48
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L48
            r6[r5] = r4     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r6)     // Catch: java.lang.Exception -> L48
            r7.m = r1     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "setNeedAddress"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L48
            r2[r5] = r3     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L48
            r7.n = r1     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "getInterval"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r0 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L48
            r7.o = r0     // Catch: java.lang.Exception -> L48
        L48:
            return
    }

    static /* synthetic */ java.lang.reflect.Method h(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.q
            return r0
    }

    private void i() {
            r4 = this;
            java.lang.String r0 = "com.amap.api.location.AMapLocation"
            java.lang.String r1 = "getErrorCode"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.p = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getErrorInfo"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.q = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getLocationType"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.r = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getAccuracy"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.s = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getAdCode"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.t = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getAddress"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.u = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getAoiName"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.v = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getCity"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.w = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getCityCode"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.x = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getCountry"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.y = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getDistrict"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.z = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getStreet"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.A = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getStreetNum"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.B = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getPoiName"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.C = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getProvince"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.D = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getSpeed"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.E = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getFloor"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.F = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getBearing"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.G = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getBuildingId"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r1 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r3)     // Catch: java.lang.Exception -> Lcb
            r4.H = r1     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = "getAltitude"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lcb
            java.lang.reflect.Method r0 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> Lcb
            r4.I = r0     // Catch: java.lang.Exception -> Lcb
        Lcb:
            return
    }

    static /* synthetic */ java.lang.reflect.Method j(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.r
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method k(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.s
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method l(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.t
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method m(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.u
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method n(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.v
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method o(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.w
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method p(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.x
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method q(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.y
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method r(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.z
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method s(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.A
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method t(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.B
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method u(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.C
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method v(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.D
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method w(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.E
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method x(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.F
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method y(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.G
            return r0
    }

    static /* synthetic */ java.lang.reflect.Method z(com.amap.api.col.p0003l.b0 r0) {
            java.lang.reflect.Method r0 = r0.H
            return r0
    }

    @Override // com.amap.api.maps.LocationSource
    public final void activate(com.amap.api.maps.LocationSource.OnLocationChangedListener r7) {
            r6 = this;
            r6.f2993b = r7
            android.content.Context r7 = r6.a
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r7 = com.amap.api.col.p0003l.ft.a(r7, r0)
            com.amap.api.col.3l.ft$c r7 = r7.a
            com.amap.api.col.3l.ft$c r0 = com.amap.api.col.3l.ft.c.a
            if (r7 == r0) goto L14
            goto Lb4
        L14:
            java.lang.Object r7 = r6.f2994c
            if (r7 == 0) goto L1a
            goto Lb4
        L1a:
            java.lang.String r7 = "com.amap.api.location.AMapLocationClient"
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> Lb4
            android.content.Context r2 = r6.a     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r4[r3] = r2     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.newInstance(r7, r1, r4)     // Catch: java.lang.Exception -> Lb4
            r6.f2994c = r7     // Catch: java.lang.Exception -> Lb4
            if (r7 != 0) goto L34
            goto Lb4
        L34:
            java.lang.String r7 = "com.amap.api.location.AMapLocationClientOption"
            r1 = 0
            java.lang.Object r7 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.newInstance(r7, r1, r1)     // Catch: java.lang.Exception -> Lb4
            r6.f2995d = r7     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<com.amap.api.col.3l.b0> r7 = com.amap.api.col.p0003l.b0.class
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> Lb4
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<com.amap.api.location.AMapLocationListener> r4 = com.amap.api.location.AMapLocationListener.class
            r2[r3] = r4     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.InvocationHandler r4 = r6.L     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r7, r2, r4)     // Catch: java.lang.Exception -> Lb4
            r6.f2996e = r7     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r2 = r6.f2994c     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r4 = r6.f2997f     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r5[r3] = r7     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r2, r4, r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r6.f2995d     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r2 = r6.f3002k     // Catch: java.lang.Exception -> Lb4
            long r4 = r6.K     // Catch: java.lang.Exception -> Lb4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r5[r3] = r4     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r6.f2995d     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r2 = r6.l     // Catch: java.lang.Exception -> Lb4
            boolean r4 = r6.J     // Catch: java.lang.Exception -> Lb4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r5[r3] = r4     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r2, r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r7 = "com.amap.api.location.AMapLocationClientOption$AMapLocationMode"
            java.lang.String r2 = "Hight_Accuracy"
            java.lang.Object r7 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.getField(r7, r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r1 = r6.f2995d     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r2 = r6.m     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r4[r3] = r7     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r1, r2, r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r6.f2995d     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r1 = r6.n     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lb4
            r2[r3] = r4     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r6.f2994c     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r1 = r6.f2998g     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r2 = r6.f2995d     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Lb4
            r0[r3] = r2     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r1, r0)     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r6.f2994c     // Catch: java.lang.Exception -> Lb4
            java.lang.reflect.Method r0 = r6.f2999h     // Catch: java.lang.Exception -> Lb4
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lb4
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r7, r0, r1)     // Catch: java.lang.Exception -> Lb4
        Lb4:
            return
    }

    public final void c(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lb
            if (r2 != 0) goto L6
            goto Lb
        L6:
            r2 = 0
            r1.e(r2)
            return
        Lb:
            r1.e(r0)
            return
    }

    public final void d(long r7) {
            r6 = this;
            java.lang.Object r0 = r6.f2995d
            if (r0 == 0) goto L3c
            java.lang.Object r1 = r6.f2994c
            if (r1 == 0) goto L3c
            java.lang.reflect.Method r1 = r6.o
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r0 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r1, r3)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L3c
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L3c
            java.lang.Object r0 = r6.f2995d
            java.lang.reflect.Method r1 = r6.f3002k
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r2] = r3
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r1, r5)
            java.lang.Object r0 = r6.f2994c
            java.lang.reflect.Method r1 = r6.f2998g
            java.lang.Object r3 = r6.f2995d
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r0, r1, r4)
        L3c:
            r6.K = r7
            return
    }

    @Override // com.amap.api.maps.LocationSource
    public final void deactivate() {
            r5 = this;
            r0 = 0
            r5.f2993b = r0
            java.lang.Object r1 = r5.f2994c
            if (r1 == 0) goto L18
            java.lang.reflect.Method r2 = r5.f3000i
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r1, r2, r4)
            java.lang.Object r1 = r5.f2994c
            java.lang.reflect.Method r2 = r5.f3001j
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.autonavi.base.ae.gmap.glyph.ReflectUtil.invokeMethod(r1, r2, r3)
        L18:
            r5.f2994c = r0
            return
    }
}
