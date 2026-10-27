package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static boolean A;
    com.autonavi.aps.amapapi.utils.h a;

    /* renamed from: b, reason: collision with root package name */
    android.content.Context f2928b;

    /* renamed from: c, reason: collision with root package name */
    android.app.PendingIntent f2929c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f2930d;

    /* renamed from: e, reason: collision with root package name */
    com.amap.api.fence.GeoFenceListener f2931e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.Object f2932f;

    /* renamed from: g, reason: collision with root package name */
    volatile int f2933g;

    /* renamed from: h, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.fence.GeoFence> f2934h;

    /* renamed from: i, reason: collision with root package name */
    com.amap.api.col.3l.a.d f2935i;

    /* renamed from: j, reason: collision with root package name */
    java.lang.Object f2936j;

    /* renamed from: k, reason: collision with root package name */
    java.lang.Object f2937k;
    com.amap.api.col.3l.a.b l;
    com.amap.api.col.3l.a.c m;
    volatile boolean n;
    volatile boolean o;
    volatile boolean p;
    com.amap.api.col.p0003l.e0 q;
    com.amap.api.col.p0003l.e1 r;
    com.amap.api.location.AMapLocationClient s;
    volatile com.amap.api.location.AMapLocation t;
    long u;
    com.amap.api.location.AMapLocationClientOption v;
    int w;
    com.amap.api.location.AMapLocationListener x;
    final int y;
    volatile boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.col.3l.a$a, reason: collision with other inner class name */
    final class C0084a implements com.amap.api.location.AMapLocationListener {
        final /* synthetic */ com.amap.api.col.p0003l.a a;

        C0084a(com.amap.api.col.p0003l.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(com.amap.api.location.AMapLocation r13) {
                r12 = this;
                com.amap.api.col.3l.a r0 = r12.a     // Catch: java.lang.Throwable -> L9d
                boolean r0 = r0.z     // Catch: java.lang.Throwable -> L9d
                if (r0 == 0) goto L8
                goto L9d
            L8:
                com.amap.api.col.3l.a r0 = r12.a     // Catch: java.lang.Throwable -> L9d
                boolean r0 = r0.p     // Catch: java.lang.Throwable -> L9d
                if (r0 != 0) goto L10
                goto L9d
            L10:
                com.amap.api.col.3l.a r0 = r12.a     // Catch: java.lang.Throwable -> L9d
                r0.t = r13     // Catch: java.lang.Throwable -> L9d
                r0 = 1
                r1 = 0
                r3 = 0
                r4 = 8
                r5 = 0
                if (r13 == 0) goto L5c
                int r6 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L9d
                int r7 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L9d
                if (r7 != 0) goto L37
                com.amap.api.col.3l.a r13 = r12.a     // Catch: java.lang.Throwable -> L9d
                long r7 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L9d
                r13.u = r7     // Catch: java.lang.Throwable -> L9d
                com.amap.api.col.3l.a r13 = r12.a     // Catch: java.lang.Throwable -> L9d
                r7 = 5
                r13.j(r7, r3, r1)     // Catch: java.lang.Throwable -> L9d
                r13 = 1
                goto L5f
            L37:
                java.lang.String r7 = "定位失败"
                int r8 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L9d
                java.lang.String r9 = r13.getErrorInfo()     // Catch: java.lang.Throwable -> L9d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
                java.lang.String r11 = "locationDetail:"
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r13 = r13.getLocationDetail()     // Catch: java.lang.Throwable -> L9d
                r10.append(r13)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r13 = r10.toString()     // Catch: java.lang.Throwable -> L9d
                java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L9d
                com.amap.api.col.p0003l.a.p(r7, r8, r9, r13)     // Catch: java.lang.Throwable -> L9d
                r13 = 0
                goto L5f
            L5c:
                r13 = 0
                r6 = 8
            L5f:
                if (r13 == 0) goto L6a
                com.amap.api.col.3l.a r13 = r12.a     // Catch: java.lang.Throwable -> L9d
                r13.w = r5     // Catch: java.lang.Throwable -> L9d
                r0 = 6
                r13.j(r0, r3, r1)     // Catch: java.lang.Throwable -> L9d
                return
            L6a:
                android.os.Bundle r13 = new android.os.Bundle     // Catch: java.lang.Throwable -> L9d
                r13.<init>()     // Catch: java.lang.Throwable -> L9d
                com.amap.api.col.3l.a r1 = r12.a     // Catch: java.lang.Throwable -> L9d
                boolean r1 = r1.n     // Catch: java.lang.Throwable -> L9d
                if (r1 != 0) goto L87
                com.amap.api.col.3l.a r1 = r12.a     // Catch: java.lang.Throwable -> L9d
                r2 = 7
                r1.D(r2)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "interval"
                r2 = 2000(0x7d0, double:9.88E-321)
                r13.putLong(r1, r2)     // Catch: java.lang.Throwable -> L9d
                com.amap.api.col.3l.a r1 = r12.a     // Catch: java.lang.Throwable -> L9d
                r1.j(r4, r13, r2)     // Catch: java.lang.Throwable -> L9d
            L87:
                com.amap.api.col.3l.a r1 = r12.a     // Catch: java.lang.Throwable -> L9d
                int r2 = r1.w     // Catch: java.lang.Throwable -> L9d
                int r2 = r2 + r0
                r1.w = r2     // Catch: java.lang.Throwable -> L9d
                r0 = 3
                if (r2 < r0) goto L9d
                java.lang.String r0 = "location_errorcode"
                r13.putInt(r0, r6)     // Catch: java.lang.Throwable -> L9d
                com.amap.api.col.3l.a r0 = r12.a     // Catch: java.lang.Throwable -> L9d
                r1 = 1002(0x3ea, float:1.404E-42)
                r0.i(r1, r13)     // Catch: java.lang.Throwable -> L9d
            L9d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.a a;

        public b(com.amap.api.col.p0003l.a r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r2) {
                r1 = this;
                int r0 = r2.what     // Catch: java.lang.Throwable -> L7f
                switch(r0) {
                    case 0: goto L76;
                    case 1: goto L6c;
                    case 2: goto L62;
                    case 3: goto L58;
                    case 4: goto L4e;
                    case 5: goto L48;
                    case 6: goto L40;
                    case 7: goto L3a;
                    case 8: goto L30;
                    case 9: goto L26;
                    case 10: goto L20;
                    case 11: goto L16;
                    case 12: goto Lc;
                    case 13: goto L6;
                    default: goto L5;
                }     // Catch: java.lang.Throwable -> L7f
            L5:
                goto L7f
            L6:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L7f
                r2.V()     // Catch: java.lang.Throwable -> L7f
                return
            Lc:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.W(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L16:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.Y(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L20:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L7f
                r2.K()     // Catch: java.lang.Throwable -> L7f
                return
            L26:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.k(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L30:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.c0(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L3a:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L7f
                r2.O()     // Catch: java.lang.Throwable -> L7f
                return
            L40:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L7f
                com.amap.api.location.AMapLocation r0 = r2.t     // Catch: java.lang.Throwable -> L7f
                r2.m(r0)     // Catch: java.lang.Throwable -> L7f
                return
            L48:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L7f
                r2.R()     // Catch: java.lang.Throwable -> L7f
                return
            L4e:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.U(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L58:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.P(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L62:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.S(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L6c:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.M(r2)     // Catch: java.lang.Throwable -> L7f
                return
            L76:
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L7f
                android.os.Bundle r2 = r2.getData()     // Catch: java.lang.Throwable -> L7f
                r0.F(r2)     // Catch: java.lang.Throwable -> L7f
            L7f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends android.os.HandlerThread {
        public c(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
                r0 = this;
                super.run()     // Catch: java.lang.Throwable -> L3
            L3:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.a a;

        public d(com.amap.api.col.p0003l.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public d(com.amap.api.col.p0003l.a r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r2) {
                r1 = this;
                android.os.Bundle r0 = r2.getData()     // Catch: java.lang.Throwable -> L29
                int r2 = r2.what     // Catch: java.lang.Throwable -> L29
                switch(r2) {
                    case 1000: goto L24;
                    case 1001: goto L16;
                    case 1002: goto La;
                    default: goto L9;
                }     // Catch: java.lang.Throwable -> L29
            L9:
                goto L29
            La:
                java.lang.String r2 = "location_errorcode"
                int r2 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L29
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L29
                r0.L(r2)     // Catch: java.lang.Throwable -> L29
                return
            L16:
                java.lang.String r2 = "geoFence"
                android.os.Parcelable r2 = r0.getParcelable(r2)     // Catch: java.lang.Throwable -> L29
                com.amap.api.fence.GeoFence r2 = (com.amap.api.fence.GeoFence) r2     // Catch: java.lang.Throwable -> L29
                com.amap.api.col.3l.a r0 = r1.a     // Catch: java.lang.Throwable -> L29
                r0.G(r2)     // Catch: java.lang.Throwable -> L29
                return
            L24:
                com.amap.api.col.3l.a r2 = r1.a     // Catch: java.lang.Throwable -> L29
                r2.Z(r0)     // Catch: java.lang.Throwable -> L29
            L29:
                return
        }
    }

    static {
            return
    }

    public a(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.f2928b = r0
            r4.f2929c = r0
            r4.f2930d = r0
            r4.f2931e = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.f2932f = r1
            r1 = 1
            r4.f2933g = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f2934h = r1
            r4.f2935i = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.f2936j = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.f2937k = r1
            r4.l = r0
            r4.m = r0
            r1 = 0
            r4.n = r1
            r4.o = r1
            r4.p = r1
            r4.q = r0
            r4.r = r0
            r4.s = r0
            r4.t = r0
            r2 = 0
            r4.u = r2
            r4.v = r0
            r4.w = r1
            com.amap.api.col.3l.a$a r0 = new com.amap.api.col.3l.a$a
            r0.<init>(r4)
            r4.x = r0
            r0 = 3
            r4.y = r0
            r4.z = r1
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L64
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L64
            r4.f2928b = r5     // Catch: java.lang.Throwable -> L64
            r4.b0()     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r5 = move-exception
            java.lang.String r0 = "GeoFenceManger"
            java.lang.String r1 = "<init>"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    static float A(com.amap.api.location.DPoint r2, java.util.List<com.amap.api.location.DPoint> r3) {
            r0 = 1
            if (r2 == 0) goto L24
            if (r3 == 0) goto L24
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L24
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            com.amap.api.location.DPoint r1 = (com.amap.api.location.DPoint) r1
            float r1 = com.autonavi.aps.amapapi.utils.j.a(r2, r1)
            float r0 = java.lang.Math.max(r0, r1)
            goto Lf
        L24:
            return r0
    }

    private static com.amap.api.location.DPoint B(java.util.List<com.amap.api.location.DPoint> r9) {
            com.amap.api.location.DPoint r0 = new com.amap.api.location.DPoint
            r0.<init>()
            if (r9 == 0) goto L48
            java.util.Iterator r1 = r9.iterator()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r4 = r2
        Le:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L27
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.DPoint r6 = (com.amap.api.location.DPoint) r6     // Catch: java.lang.Throwable -> L25
            double r7 = r6.getLatitude()     // Catch: java.lang.Throwable -> L25
            double r2 = r2 + r7
            double r6 = r6.getLongitude()     // Catch: java.lang.Throwable -> L25
            double r4 = r4 + r6
            goto Le
        L25:
            r9 = move-exception
            goto L41
        L27:
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L25
            double r6 = (double) r1     // Catch: java.lang.Throwable -> L25
            double r2 = r2 / r6
            double r1 = com.autonavi.aps.amapapi.utils.j.b(r2)     // Catch: java.lang.Throwable -> L25
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L25
            double r6 = (double) r9     // Catch: java.lang.Throwable -> L25
            double r4 = r4 / r6
            double r3 = com.autonavi.aps.amapapi.utils.j.b(r4)     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.DPoint r9 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> L25
            r9.<init>(r1, r3)     // Catch: java.lang.Throwable -> L25
            return r9
        L41:
            java.lang.String r1 = "GeoFenceUtil"
            java.lang.String r2 = "getPolygonCenter"
            com.autonavi.aps.amapapi.utils.b.a(r9, r1, r2)
        L48:
            return r0
    }

    private void E(int r25, android.os.Bundle r26) {
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            java.lang.String r3 = "errorCode"
            java.lang.String r4 = "customId"
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r8.<init>()     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L136
            boolean r10 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r10 != 0) goto L136
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r10.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r11 = r2.getString(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r12 = "keyWords"
            java.lang.String r12 = r2.getString(r12)     // Catch: java.lang.Throwable -> L91
            java.lang.String r13 = "city"
            java.lang.String r18 = r2.getString(r13)     // Catch: java.lang.Throwable -> L91
            java.lang.String r13 = "poiType"
            java.lang.String r13 = r2.getString(r13)     // Catch: java.lang.Throwable -> L91
            java.lang.String r14 = "centerPoint"
            android.os.Parcelable r14 = r2.getParcelable(r14)     // Catch: java.lang.Throwable -> L91
            com.amap.api.location.DPoint r14 = (com.amap.api.location.DPoint) r14     // Catch: java.lang.Throwable -> L91
            java.lang.String r15 = "searchSize"
            r7 = 10
            int r7 = r2.getInt(r15, r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r15 = "aroundRadius"
            r6 = 1161527296(0x453b8000, float:3000.0)
            float r2 = r2.getFloat(r15, r6)     // Catch: java.lang.Throwable -> L91
            boolean r6 = v(r0, r12, r13, r14)     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L12a
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L91
            r6.<init>()     // Catch: java.lang.Throwable -> L91
            r6.putString(r4, r11)     // Catch: java.lang.Throwable -> L91
            java.lang.String r15 = "pendingIntentAction"
            java.lang.String r9 = r1.f2930d     // Catch: java.lang.Throwable -> L91
            r6.putString(r15, r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = "expiration"
            r17 = r13
            r15 = r14
            r13 = -1
            r6.putLong(r9, r13)     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = "activatesAction"
            int r13 = r1.f2933g     // Catch: java.lang.Throwable -> L91
            r6.putInt(r9, r13)     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = "fenceRadius"
            r14 = 2
            r13 = 1
            if (r0 == r13) goto Ld7
            if (r0 == r14) goto L95
            r13 = 3
            if (r0 == r13) goto L86
            r2 = 0
        L82:
            r7 = r2
            r2 = 3
            r12 = 2
            goto Lee
        L86:
            com.amap.api.col.3l.e0 r2 = r1.q     // Catch: java.lang.Throwable -> L91
            android.content.Context r7 = r1.f2928b     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = "http://restsdk.amap.com/v3/config/district?"
            java.lang.String r2 = r2.a(r7, r9, r12)     // Catch: java.lang.Throwable -> L91
            goto L82
        L91:
            r0 = move-exception
            r7 = 0
            goto L141
        L95:
            r13 = 3
            double r18 = r15.getLatitude()     // Catch: java.lang.Throwable -> L91
            double r18 = com.autonavi.aps.amapapi.utils.j.b(r18)     // Catch: java.lang.Throwable -> L91
            double r15 = r15.getLongitude()     // Catch: java.lang.Throwable -> L91
            double r15 = com.autonavi.aps.amapapi.utils.j.b(r15)     // Catch: java.lang.Throwable -> L91
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L91
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L91
            r13 = 1128792064(0x43480000, float:200.0)
            r6.putFloat(r9, r13)     // Catch: java.lang.Throwable -> L91
            com.amap.api.col.3l.e0 r13 = r1.q     // Catch: java.lang.Throwable -> L91
            r9 = 2
            android.content.Context r14 = r1.f2928b     // Catch: java.lang.Throwable -> L91
            r20 = r15
            java.lang.String r15 = "http://restsdk.amap.com/v3/place/around?"
            r22 = r18
            java.lang.String r18 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r19 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> L91
            java.lang.String r20 = java.lang.String.valueOf(r20)     // Catch: java.lang.Throwable -> L91
            java.lang.String r21 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L91
            r16 = r12
            r2 = 3
            r12 = 2
            java.lang.String r7 = r13.c(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L91
            goto Lee
        Ld7:
            r16 = r12
            r2 = 3
            r12 = 2
            r13 = 1148846080(0x447a0000, float:1000.0)
            r6.putFloat(r9, r13)     // Catch: java.lang.Throwable -> L91
            com.amap.api.col.3l.e0 r13 = r1.q     // Catch: java.lang.Throwable -> L91
            android.content.Context r14 = r1.f2928b     // Catch: java.lang.Throwable -> L91
            java.lang.String r15 = "http://restsdk.amap.com/v3/place/text?"
            java.lang.String r19 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r7 = r13.b(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L91
        Lee:
            if (r7 == 0) goto L128
            r13 = 1
            if (r13 != r0) goto Lf8
            int r9 = com.amap.api.col.p0003l.e1.b(r7, r10, r6)     // Catch: java.lang.Throwable -> L91
            goto Lf9
        Lf8:
            r9 = 0
        Lf9:
            if (r12 != r0) goto Lff
            int r9 = com.amap.api.col.p0003l.e1.e(r7, r10, r6)     // Catch: java.lang.Throwable -> L91
        Lff:
            if (r2 != r0) goto L107
            com.amap.api.col.3l.e1 r0 = r1.r     // Catch: java.lang.Throwable -> L91
            int r9 = r0.f(r7, r10, r6)     // Catch: java.lang.Throwable -> L91
        L107:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r0) goto L122
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L116
            r0 = 16
            r7 = 16
            goto L12c
        L116:
            int r7 = r1.c(r10)     // Catch: java.lang.Throwable -> L91
            if (r7 != 0) goto L12c
            r8.addAll(r10)     // Catch: java.lang.Throwable -> L120
            goto L12c
        L120:
            r0 = move-exception
            goto L141
        L122:
            int r0 = N(r9)     // Catch: java.lang.Throwable -> L91
            r7 = r0
            goto L12c
        L128:
            r7 = 4
            goto L12c
        L12a:
            r13 = 1
            r7 = 1
        L12c:
            r5.putString(r4, r11)     // Catch: java.lang.Throwable -> L120
            java.lang.String r0 = "resultList"
            r5.putParcelableArrayList(r0, r8)     // Catch: java.lang.Throwable -> L120
            r9 = r7
            goto L138
        L136:
            r13 = 1
            r9 = 1
        L138:
            r5.putInt(r3, r9)
        L13b:
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.i(r2, r5)
            return
        L141:
            java.lang.String r2 = "GeoFenceManager"
            java.lang.String r4 = "doAddGeoFenceNearby"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r4)     // Catch: java.lang.Throwable -> L14e
            r0 = 8
            r5.putInt(r3, r0)
            goto L13b
        L14e:
            r0 = move-exception
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.putInt(r3, r7)
            r1.i(r2, r5)
            throw r0
    }

    private static boolean H(com.amap.api.location.AMapLocation r8, com.amap.api.fence.GeoFence r9) {
            r0 = 0
            boolean r8 = y(r8, r9)     // Catch: java.lang.Throwable -> L23
            r1 = -1
            r3 = 1
            if (r8 == 0) goto L40
            long r4 = r9.getEnterTime()     // Catch: java.lang.Throwable -> L23
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L25
            int r8 = r9.getStatus()     // Catch: java.lang.Throwable -> L23
            if (r8 == r3) goto L51
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L23
            r9.setEnterTime(r1)     // Catch: java.lang.Throwable -> L23
            r9.setStatus(r3)     // Catch: java.lang.Throwable -> L23
            return r3
        L23:
            r8 = move-exception
            goto L52
        L25:
            int r8 = r9.getStatus()     // Catch: java.lang.Throwable -> L23
            r1 = 3
            if (r8 == r1) goto L51
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L23
            long r6 = r9.getEnterTime()     // Catch: java.lang.Throwable -> L23
            long r4 = r4 - r6
            r6 = 600000(0x927c0, double:2.964394E-318)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L51
            r9.setStatus(r1)     // Catch: java.lang.Throwable -> L23
            return r3
        L40:
            int r8 = r9.getStatus()     // Catch: java.lang.Throwable -> L23
            r4 = 2
            if (r8 == r4) goto L51
            r9.setStatus(r4)     // Catch: java.lang.Throwable -> L4e
            r9.setEnterTime(r1)     // Catch: java.lang.Throwable -> L4e
            return r3
        L4e:
            r8 = move-exception
            r0 = 1
            goto L52
        L51:
            return r0
        L52:
            java.lang.String r9 = "Utils"
            java.lang.String r1 = "isFenceStatusChanged"
            com.autonavi.aps.amapapi.utils.b.a(r8, r9, r1)
            return r0
    }

    private static boolean I(com.amap.api.location.AMapLocation r5, java.util.List<com.amap.api.location.DPoint> r6) {
            int r0 = r6.size()
            r1 = 3
            if (r0 >= r1) goto L9
            r5 = 0
            return r5
        L9:
            com.amap.api.location.DPoint r0 = new com.amap.api.location.DPoint
            double r1 = r5.getLatitude()
            double r3 = r5.getLongitude()
            r0.<init>(r1, r3)
            boolean r5 = com.autonavi.aps.amapapi.utils.b.a(r0, r6)
            return r5
    }

    private int J(com.amap.api.fence.GeoFence r4) {
            r3 = this;
            r0 = 0
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r3.f2934h     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            r3.f2934h = r1     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r4 = move-exception
            goto L20
        Lf:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r3.f2934h     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L1d
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r3.f2934h     // Catch: java.lang.Throwable -> Ld
            r1.add(r4)     // Catch: java.lang.Throwable -> Ld
            return r0
        L1d:
            r4 = 17
            return r4
        L20:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "addGeoFence2List"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r2)
            java.lang.String r4 = r4.getMessage()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "添加围栏失败"
            r2 = 8
            p(r1, r2, r4, r0)
            return r2
    }

    private static int N(int r5) {
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L27
            r2 = 7
            if (r5 == r2) goto L27
            r3 = 4
            if (r5 == r3) goto L27
            r4 = 5
            if (r5 == r4) goto L27
            r4 = 16
            if (r5 == r4) goto L27
            r4 = 17
            if (r5 == r4) goto L27
            switch(r5) {
                case 10000: goto L26;
                case 10001: goto L24;
                case 10002: goto L24;
                case 10003: goto L22;
                case 10004: goto L22;
                case 10005: goto L22;
                case 10006: goto L22;
                case 10007: goto L24;
                case 10008: goto L24;
                case 10009: goto L24;
                case 10010: goto L22;
                case 10011: goto L22;
                case 10012: goto L24;
                case 10013: goto L24;
                case 10014: goto L22;
                case 10015: goto L22;
                case 10016: goto L22;
                case 10017: goto L22;
                default: goto L18;
            }
        L18:
            r2 = 8
            switch(r5) {
                case 20000: goto L20;
                case 20001: goto L20;
                case 20002: goto L20;
                case 20003: goto L1d;
                default: goto L1d;
            }
        L1d:
            r5 = 8
            goto L27
        L20:
            r5 = 1
            goto L27
        L22:
            r5 = 4
            goto L27
        L24:
            r5 = 7
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L3a
            java.lang.String r1 = "searchErrCode is "
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "添加围栏失败"
            p(r2, r5, r1, r0)
        L3a:
            return r5
    }

    private void Q(com.amap.api.fence.GeoFence r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "geoFence"
            r0.putParcelable(r1, r3)
            r3 = 1001(0x3e9, float:1.403E-42)
            r2.i(r3, r0)
            return
    }

    private static float a(com.amap.api.location.AMapLocation r6, java.util.List<com.amap.api.fence.GeoFence> r7) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r6 == 0) goto L75
            int r1 = r6.getErrorCode()
            if (r1 != 0) goto L75
            if (r7 == 0) goto L75
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L75
            com.amap.api.location.DPoint r1 = new com.amap.api.location.DPoint
            double r2 = r6.getLatitude()
            double r4 = r6.getLongitude()
            r1.<init>(r2, r4)
            java.util.Iterator r6 = r7.iterator()
        L24:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            com.amap.api.fence.GeoFence r7 = (com.amap.api.fence.GeoFence) r7
            boolean r2 = r7.isAble()
            if (r2 == 0) goto L24
            com.amap.api.location.DPoint r2 = r7.getCenter()
            float r2 = com.autonavi.aps.amapapi.utils.j.a(r1, r2)
            float r3 = r7.getMinDis2Center()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L50
            float r3 = r7.getMaxDis2Center()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L50
            r6 = 0
            return r6
        L50:
            float r3 = r7.getMaxDis2Center()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L62
            float r3 = r7.getMaxDis2Center()
            float r3 = r2 - r3
            float r0 = java.lang.Math.min(r0, r3)
        L62:
            float r3 = r7.getMinDis2Center()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L24
            float r7 = r7.getMinDis2Center()
            float r7 = r7 - r2
            float r7 = java.lang.Math.min(r0, r7)
            r0 = r7
            goto L24
        L75:
            return r0
    }

    static float b(com.amap.api.location.DPoint r2, java.util.List<com.amap.api.location.DPoint> r3) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r2 == 0) goto L26
            if (r3 == 0) goto L26
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L26
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            com.amap.api.location.DPoint r1 = (com.amap.api.location.DPoint) r1
            float r1 = com.autonavi.aps.amapapi.utils.j.a(r2, r1)
            float r0 = java.lang.Math.min(r0, r1)
            goto L11
        L26:
            return r0
    }

    private void b0() {
            r4 = this;
            java.lang.String r0 = "GeoFenceManger"
            boolean r1 = r4.p
            r2 = 1
            if (r1 != 0) goto L9
            r4.p = r2
        L9:
            boolean r1 = r4.o
            if (r1 == 0) goto Lf
            goto Lb1
        Lf:
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            com.amap.api.col.3l.a$d r1 = new com.amap.api.col.3l.a$d     // Catch: java.lang.Throwable -> L23
            android.content.Context r3 = r4.f2928b     // Catch: java.lang.Throwable -> L23
            android.os.Looper r3 = r3.getMainLooper()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L23
            r4.f2935i = r1     // Catch: java.lang.Throwable -> L23
            goto L32
        L23:
            r1 = move-exception
            goto L2d
        L25:
            com.amap.api.col.3l.a$d r1 = new com.amap.api.col.3l.a$d     // Catch: java.lang.Throwable -> L23
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L23
            r4.f2935i = r1     // Catch: java.lang.Throwable -> L23
            goto L32
        L2d:
            java.lang.String r3 = "init 1"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        L32:
            com.amap.api.col.3l.a$c r1 = new com.amap.api.col.3l.a$c     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "fenceActionThread"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L52
            r4.m = r1     // Catch: java.lang.Throwable -> L52
            r3 = 5
            r1.setPriority(r3)     // Catch: java.lang.Throwable -> L52
            com.amap.api.col.3l.a$c r1 = r4.m     // Catch: java.lang.Throwable -> L52
            r1.start()     // Catch: java.lang.Throwable -> L52
            com.amap.api.col.3l.a$b r1 = new com.amap.api.col.3l.a$b     // Catch: java.lang.Throwable -> L52
            com.amap.api.col.3l.a$c r3 = r4.m     // Catch: java.lang.Throwable -> L52
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L52
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L52
            r4.l = r1     // Catch: java.lang.Throwable -> L52
            goto L58
        L52:
            r1 = move-exception
            java.lang.String r3 = "init 2"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        L58:
            com.amap.api.col.3l.e0 r1 = new com.amap.api.col.3l.e0     // Catch: java.lang.Throwable -> L89
            android.content.Context r3 = r4.f2928b     // Catch: java.lang.Throwable -> L89
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L89
            r4.q = r1     // Catch: java.lang.Throwable -> L89
            com.amap.api.col.3l.e1 r1 = new com.amap.api.col.3l.e1     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            r4.r = r1     // Catch: java.lang.Throwable -> L89
            com.amap.api.location.AMapLocationClientOption r1 = new com.amap.api.location.AMapLocationClientOption     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            r4.v = r1     // Catch: java.lang.Throwable -> L89
            com.amap.api.location.AMapLocationClient r1 = new com.amap.api.location.AMapLocationClient     // Catch: java.lang.Throwable -> L89
            android.content.Context r3 = r4.f2928b     // Catch: java.lang.Throwable -> L89
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L89
            r4.s = r1     // Catch: java.lang.Throwable -> L89
            com.amap.api.location.AMapLocationListener r3 = r4.x     // Catch: java.lang.Throwable -> L89
            r1.setLocationListener(r3)     // Catch: java.lang.Throwable -> L89
            com.autonavi.aps.amapapi.utils.h r1 = r4.a     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L8f
            com.autonavi.aps.amapapi.utils.h r1 = new com.autonavi.aps.amapapi.utils.h     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            r4.a = r1     // Catch: java.lang.Throwable -> L89
            goto L8f
        L89:
            r1 = move-exception
            java.lang.String r3 = "initBase"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        L8f:
            r4.o = r2
            java.lang.String r1 = r4.f2930d     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La3
            android.app.PendingIntent r3 = r4.f2929c     // Catch: java.lang.Throwable -> L9d
            if (r3 != 0) goto La3
            r4.d(r1)     // Catch: java.lang.Throwable -> L9d
            goto La3
        L9d:
            r1 = move-exception
            java.lang.String r3 = "init 4"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        La3:
            boolean r0 = com.amap.api.col.p0003l.a.A
            if (r0 != 0) goto Lb1
            com.amap.api.col.p0003l.a.A = r2
            android.content.Context r0 = r4.f2928b
            java.lang.String r1 = "O020"
            r2 = 0
            com.autonavi.aps.amapapi.utils.h.a(r0, r1, r2)
        Lb1:
            return
    }

    private int c(java.util.List<com.amap.api.fence.GeoFence> r4) {
            r3 = this;
            r0 = 0
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r3.f2934h     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            r3.f2934h = r1     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r4 = move-exception
            goto L24
        Lf:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.fence.GeoFence r1 = (com.amap.api.fence.GeoFence) r1     // Catch: java.lang.Throwable -> Ld
            r3.J(r1)     // Catch: java.lang.Throwable -> Ld
            goto L13
        L23:
            return r0
        L24:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "addGeoFenceList"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r2)
            java.lang.String r4 = r4.getMessage()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "添加围栏失败"
            r2 = 8
            p(r1, r2, r4, r0)
            return r2
    }

    private boolean d0() {
            r3 = this;
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r3.f2934h
            r1 = 1
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L26
        Lc:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r3.f2934h
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            com.amap.api.fence.GeoFence r2 = (com.amap.api.fence.GeoFence) r2
            boolean r2 = r2.isAble()
            if (r2 == 0) goto L12
            r0 = 0
            return r0
        L26:
            return r1
    }

    private static android.os.Bundle e(com.amap.api.fence.GeoFence r2, java.lang.String r3, java.lang.String r4, int r5, int r6) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r3 != 0) goto L9
            java.lang.String r3 = ""
        L9:
            java.lang.String r1 = "fenceid"
            r0.putString(r1, r3)
            java.lang.String r3 = "customId"
            r0.putString(r3, r4)
            java.lang.String r3 = "event"
            r0.putInt(r3, r5)
            java.lang.String r3 = "location_errorcode"
            r0.putInt(r3, r6)
            java.lang.String r3 = "fence"
            r0.putParcelable(r3, r2)
            return r0
    }

    private void e0() {
            r3 = this;
            java.lang.Object r0 = r3.f2937k     // Catch: java.lang.Throwable -> L14
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.a$d r1 = r3.f2935i     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 == 0) goto Le
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L12
        Le:
            r3.f2935i = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "destroyResultHandler"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private com.amap.api.fence.GeoFence f(android.os.Bundle r6, boolean r7) {
            r5 = this;
            com.amap.api.fence.GeoFence r0 = new com.amap.api.fence.GeoFence
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.amap.api.location.DPoint r2 = new com.amap.api.location.DPoint
            r2.<init>()
            if (r7 == 0) goto L30
            r7 = 1
            r0.setType(r7)
            java.lang.String r7 = "pointList"
            java.util.ArrayList r1 = r6.getParcelableArrayList(r7)
            if (r1 == 0) goto L21
            com.amap.api.location.DPoint r2 = B(r1)
        L21:
            float r7 = A(r2, r1)
            r0.setMaxDis2Center(r7)
            float r7 = b(r2, r1)
            r0.setMinDis2Center(r7)
            goto L5a
        L30:
            r7 = 0
            r0.setType(r7)
            java.lang.String r7 = "centerPoint"
            android.os.Parcelable r7 = r6.getParcelable(r7)
            r2 = r7
            com.amap.api.location.DPoint r2 = (com.amap.api.location.DPoint) r2
            if (r2 == 0) goto L42
            r1.add(r2)
        L42:
            java.lang.String r7 = "fenceRadius"
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r6.getFloat(r7, r3)
            r4 = 0
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L50
            goto L51
        L50:
            r3 = r7
        L51:
            r0.setRadius(r3)
            r0.setMinDis2Center(r3)
            r0.setMaxDis2Center(r3)
        L5a:
            int r7 = r5.f2933g
            r0.setActivatesAction(r7)
            java.lang.String r7 = "customId"
            java.lang.String r6 = r6.getString(r7)
            r0.setCustomId(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r1)
            r0.setPointList(r6)
            r0.setCenter(r2)
            java.lang.String r6 = r5.f2930d
            r0.setPendingIntentAction(r6)
            r6 = -1
            r0.setExpiration(r6)
            android.app.PendingIntent r6 = r5.f2929c
            r0.setPendingIntent(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r1 = com.amap.api.col.p0003l.e1.c()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.setFenceId(r6)
            com.autonavi.aps.amapapi.utils.h r6 = r5.a
            if (r6 == 0) goto La2
            android.content.Context r7 = r5.f2928b
            r1 = 2
            r6.a(r7, r1)
        La2:
            return r0
    }

    private void f0() {
            r3 = this;
            java.lang.Object r0 = r3.f2936j     // Catch: java.lang.Throwable -> L14
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.a$b r1 = r3.l     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 == 0) goto Le
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L12
        Le:
            r3.l = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "destroyActionHandler"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private void g0() {
            r4 = this;
            boolean r0 = r4.z
            if (r0 == 0) goto L5
            goto L22
        L5:
            com.amap.api.col.3l.a$b r0 = r4.l
            if (r0 == 0) goto L22
            boolean r0 = r4.i0()
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L1b
            r0 = 6
            r4.j(r0, r3, r1)
            r0 = 5
            r4.j(r0, r3, r1)
            return
        L1b:
            r0 = 7
            r4.D(r0)
            r4.j(r0, r3, r1)
        L22:
            return
    }

    private void h0() {
            r1 = this;
            boolean r0 = r1.n     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L9
            r0 = 8
            r1.D(r0)     // Catch: java.lang.Throwable -> L13
        L9:
            com.amap.api.location.AMapLocationClient r0 = r1.s     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            r0.stopLocation()     // Catch: java.lang.Throwable -> L13
        L10:
            r0 = 0
            r1.n = r0     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    private boolean i0() {
            r5 = this;
            com.amap.api.location.AMapLocation r0 = r5.t
            if (r0 == 0) goto L1b
            com.amap.api.location.AMapLocation r0 = r5.t
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)
            if (r0 == 0) goto L1b
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r5.u
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    static void p(java.lang.String r4, int r5, java.lang.String r6, java.lang.String... r7) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "===========================================\n"
            r0.append(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "              "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "                "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.append(r4)
            java.lang.String r4 = "\n"
            r0.append(r4)
            java.lang.String r2 = "-------------------------------------------\n"
            r0.append(r2)
            java.lang.String r2 = "errorCode:"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = "错误信息:"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r5.concat(r6)
            r0.append(r5)
            r0.append(r4)
            int r5 = r7.length
            if (r5 <= 0) goto L5c
            int r5 = r7.length
            r6 = 0
        L4f:
            if (r6 >= r5) goto L5c
            r2 = r7[r6]
            r0.append(r2)
            r0.append(r4)
            int r6 = r6 + 1
            goto L4f
        L5c:
            r0.append(r1)
            return
    }

    private static boolean v(int r5, java.lang.String r6, java.lang.String r7, com.amap.api.location.DPoint r8) {
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r0 = 0
            if (r6 == 0) goto L8
            return r0
        L8:
            r6 = 1
            if (r5 == r6) goto L6c
            r7 = 2
            if (r5 == r7) goto Lf
            goto L73
        Lf:
            if (r8 != 0) goto L12
            return r0
        L12:
            double r1 = r8.getLatitude()
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L46
            double r1 = r8.getLatitude()
            r3 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L46
            double r1 = r8.getLongitude()
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L46
            double r1 = r8.getLongitude()
            r3 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L73
        L46:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "经纬度错误，传入的纬度："
            r5.<init>(r6)
            double r6 = r8.getLatitude()
            r5.append(r6)
            java.lang.String r6 = "传入的经度:"
            r5.append(r6)
            double r6 = r8.getLongitude()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r7 = "添加围栏失败"
            p(r7, r0, r5, r6)
            return r0
        L6c:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L73
            return r0
        L73:
            return r6
    }

    private static boolean x(com.amap.api.fence.GeoFence r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            int r0 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            if (r0 != r2) goto L10
            r1 = 1
            goto L10
        Le:
            r4 = move-exception
            goto L28
        L10:
            r0 = r5 & 2
            r3 = 2
            if (r0 != r3) goto L1c
            int r0 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            if (r0 != r3) goto L1c
            r1 = 1
        L1c:
            r0 = 4
            r5 = r5 & r0
            if (r5 != r0) goto L2f
            int r4 = r4.getStatus()     // Catch: java.lang.Throwable -> Le
            r5 = 3
            if (r4 != r5) goto L2f
            return r2
        L28:
            java.lang.String r5 = "Utils"
            java.lang.String r0 = "remindStatus"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
        L2f:
            return r1
    }

    private static boolean y(com.amap.api.location.AMapLocation r4, com.amap.api.fence.GeoFence r5) {
            r0 = 0
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L57
            if (r5 == 0) goto L57
            java.util.List r1 = r5.getPointList()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L57
            java.util.List r1 = r5.getPointList()     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L57
            int r1 = r5.getType()     // Catch: java.lang.Throwable -> L45
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 == r2) goto L29
            r3 = 2
            if (r1 == r3) goto L48
            r3 = 3
            if (r1 == r3) goto L29
            goto L57
        L29:
            java.util.List r5 = r5.getPointList()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L45
        L31:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L45
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = I(r4, r1)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L31
            r0 = 1
            goto L31
        L45:
            r4 = move-exception
            goto L58
        L47:
            return r0
        L48:
            com.amap.api.location.DPoint r1 = r5.getCenter()     // Catch: java.lang.Throwable -> L45
            float r5 = r5.getRadius()     // Catch: java.lang.Throwable -> L45
            boolean r4 = z(r4, r1, r5)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L57
            return r2
        L57:
            return r0
        L58:
            java.lang.String r5 = "Utils"
            java.lang.String r1 = "isInGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r1)
            return r0
    }

    private static boolean z(com.amap.api.location.AMapLocation r8, com.amap.api.location.DPoint r9, float r10) {
            double r0 = r9.getLatitude()
            double r2 = r9.getLongitude()
            double r4 = r8.getLatitude()
            double r8 = r8.getLongitude()
            r6 = 4
            double[] r6 = new double[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r2
            r1 = 2
            r6[r1] = r4
            r1 = 3
            r6[r1] = r8
            float r8 = com.autonavi.aps.amapapi.utils.j.a(r6)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L28
            return r0
        L28:
            return r7
    }

    public final java.util.List<com.amap.api.fence.GeoFence> C() {
            r1 = this;
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r1.f2934h     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            r1.f2934h = r0     // Catch: java.lang.Throwable -> L14
        Lb:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r1.f2934h     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    final void D(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f2936j     // Catch: java.lang.Throwable -> L11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.a$b r1 = r2.l     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r3 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3     // Catch: java.lang.Throwable -> L11
        L11:
            r3 = move-exception
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "removeActionHandlerMessage"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    final void F(android.os.Bundle r12) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = ""
            java.lang.String r2 = "customId"
            r3 = 1
            if (r12 == 0) goto L8d
            boolean r4 = r12.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L8d
            java.lang.String r1 = "centerPoint"
            android.os.Parcelable r1 = r12.getParcelable(r1)     // Catch: java.lang.Throwable -> L64
            com.amap.api.location.DPoint r1 = (com.amap.api.location.DPoint) r1     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = r12.getString(r2)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L8c
            double r5 = r1.getLatitude()     // Catch: java.lang.Throwable -> L64
            r7 = 4636033603912859648(0x4056800000000000, double:90.0)
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L66
            double r5 = r1.getLatitude()     // Catch: java.lang.Throwable -> L64
            r7 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L66
            double r5 = r1.getLongitude()     // Catch: java.lang.Throwable -> L64
            r7 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L66
            double r5 = r1.getLongitude()     // Catch: java.lang.Throwable -> L64
            r7 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L56
            goto L66
        L56:
            com.amap.api.fence.GeoFence r12 = r11.f(r12, r9)     // Catch: java.lang.Throwable -> L64
            int r3 = r11.J(r12)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L8e
            r0.add(r12)     // Catch: java.lang.Throwable -> L64
            goto L8e
        L64:
            r12 = move-exception
            goto La6
        L66:
            java.lang.String r12 = "添加围栏失败"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "经纬度错误，传入的纬度："
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64
            double r6 = r1.getLatitude()     // Catch: java.lang.Throwable -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "传入的经度:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L64
            double r6 = r1.getLongitude()     // Catch: java.lang.Throwable -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L64
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L64
            p(r12, r3, r1, r5)     // Catch: java.lang.Throwable -> L64
            goto L8e
        L8c:
            r1 = r4
        L8d:
            r4 = r1
        L8e:
            android.os.Bundle r12 = new android.os.Bundle     // Catch: java.lang.Throwable -> L64
            r12.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "errorCode"
            r12.putInt(r1, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "resultList"
            r12.putParcelableArrayList(r1, r0)     // Catch: java.lang.Throwable -> L64
            r12.putString(r2, r4)     // Catch: java.lang.Throwable -> L64
            r0 = 1000(0x3e8, float:1.401E-42)
            r11.i(r0, r12)     // Catch: java.lang.Throwable -> L64
            return
        La6:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doAddGeoFenceRound"
            com.autonavi.aps.amapapi.utils.b.a(r12, r0, r1)
            return
    }

    final void G(com.amap.api.fence.GeoFence r7) {
            r6 = this;
            java.lang.Object r0 = r6.f2932f     // Catch: java.lang.Throwable -> L59
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L59
            android.content.Context r1 = r6.f2928b     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L55
            android.app.PendingIntent r1 = r6.f2929c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            android.app.PendingIntent r1 = r7.getPendingIntent()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r7 = move-exception
            goto L57
        L15:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r7.getFenceId()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r7.getCustomId()     // Catch: java.lang.Throwable -> L13
            int r4 = r7.getStatus()     // Catch: java.lang.Throwable -> L13
            r5 = 0
            android.os.Bundle r2 = e(r7, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            r1.putExtras(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r6.f2930d     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L35
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L13
        L35:
            android.content.Context r2 = r6.f2928b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = com.amap.api.col.p0003l.f4.g(r2)     // Catch: java.lang.Throwable -> L13
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L13
            android.app.PendingIntent r2 = r7.getPendingIntent()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L4e
            android.app.PendingIntent r7 = r7.getPendingIntent()     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = r6.f2928b     // Catch: java.lang.Throwable -> L13
            r7.send(r2, r5, r1)     // Catch: java.lang.Throwable -> L13
            goto L55
        L4e:
            android.app.PendingIntent r7 = r6.f2929c     // Catch: java.lang.Throwable -> L13
            android.content.Context r2 = r6.f2928b     // Catch: java.lang.Throwable -> L13
            r7.send(r2, r5, r1)     // Catch: java.lang.Throwable -> L13
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r7     // Catch: java.lang.Throwable -> L59
        L59:
            r7 = move-exception
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "resultTriggerGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r7, r0, r1)
            return
    }

    final void K() {
            r3 = this;
            boolean r0 = r3.o     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L5
            goto L13
        L5:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r3.f2934h     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            if (r0 == 0) goto Lf
            r0.clear()     // Catch: java.lang.Throwable -> L4f
            r3.f2934h = r1     // Catch: java.lang.Throwable -> L4f
        Lf:
            boolean r0 = r3.p     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L14
        L13:
            return
        L14:
            r3.f0()     // Catch: java.lang.Throwable -> L4f
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L23
            r0.stopLocation()     // Catch: java.lang.Throwable -> L4f
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L4f
            r0.onDestroy()     // Catch: java.lang.Throwable -> L4f
        L23:
            r3.s = r1     // Catch: java.lang.Throwable -> L4f
            com.amap.api.col.3l.a$c r0 = r3.m     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L2c
            r0.quitSafely()     // Catch: java.lang.Throwable -> L4f
        L2c:
            r3.m = r1     // Catch: java.lang.Throwable -> L4f
            r3.q = r1     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r3.f2932f     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4f
            android.app.PendingIntent r2 = r3.f2929c     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L3d
            r2.cancel()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r1 = move-exception
            goto L4d
        L3d:
            r3.f2929c = r1     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            r3.e0()     // Catch: java.lang.Throwable -> L4f
            com.autonavi.aps.amapapi.utils.h r0 = r3.a     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4f
            android.content.Context r1 = r3.f2928b     // Catch: java.lang.Throwable -> L4f
            r0.b(r1)     // Catch: java.lang.Throwable -> L4f
            goto L4f
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = 0
            r3.n = r0
            r3.o = r0
            return
    }

    final void L(int r5) {
            r4 = this;
            android.content.Context r0 = r4.f2928b     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.f2932f     // Catch: java.lang.Throwable -> L29
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L29
            android.app.PendingIntent r1 = r4.f2929c     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r5 = move-exception
            goto L27
        Lf:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            r3 = 0
            android.os.Bundle r5 = e(r3, r3, r3, r2, r5)     // Catch: java.lang.Throwable -> Ld
            r1.putExtras(r5)     // Catch: java.lang.Throwable -> Ld
            android.app.PendingIntent r5 = r4.f2929c     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = r4.f2928b     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            r5.send(r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r5     // Catch: java.lang.Throwable -> L29
        L29:
            r5 = move-exception
            goto L2c
        L2b:
            return
        L2c:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "resultRemindLocationError"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    final void M(android.os.Bundle r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = ""
            java.lang.String r2 = "customId"
            r3 = 1
            if (r7 == 0) goto L37
            boolean r4 = r7.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L37
            java.lang.String r1 = "pointList"
            java.util.ArrayList r1 = r7.getParcelableArrayList(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r7.getString(r2)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L34
            r5 = 2
            if (r1 > r5) goto L26
            goto L36
        L26:
            com.amap.api.fence.GeoFence r7 = r6.f(r7, r3)     // Catch: java.lang.Throwable -> L34
            int r3 = r6.J(r7)     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L36
            r0.add(r7)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r1 = r4
        L37:
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> L34
            r7.<init>()     // Catch: java.lang.Throwable -> L34
            r7.putString(r2, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "errorCode"
            r7.putInt(r1, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "resultList"
            r7.putParcelableArrayList(r1, r0)     // Catch: java.lang.Throwable -> L34
            r0 = 1000(0x3e8, float:1.401E-42)
            r6.i(r0, r7)     // Catch: java.lang.Throwable -> L34
            return
        L4f:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doAddGeoFencePolygon"
            com.autonavi.aps.amapapi.utils.b.a(r7, r0, r1)
            return
    }

    final void O() {
            r3 = this;
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            r3.h0()     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClientOption r0 = r3.v     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r0.setLocationCacheEnable(r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClientOption r0 = r3.v     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r0.setNeedAddress(r2)     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClientOption r0 = r3.v     // Catch: java.lang.Throwable -> L25
            r0.setOnceLocation(r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClientOption r1 = r3.v     // Catch: java.lang.Throwable -> L25
            r0.setLocationOption(r1)     // Catch: java.lang.Throwable -> L25
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L25
            r0.startLocation()     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r0 = move-exception
            goto L28
        L27:
            return
        L28:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "doStartOnceLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void P(android.os.Bundle r2) {
            r1 = this;
            r0 = 2
            r1.E(r0, r2)
            return
    }

    final void R() {
            r5 = this;
            boolean r0 = r5.z     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L5
            goto L1d
        L5:
            com.amap.api.location.AMapLocation r0 = r5.t     // Catch: java.lang.Throwable -> L3c
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Le
            goto L1d
        Le:
            com.amap.api.location.AMapLocation r0 = r5.t     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r5.f2934h     // Catch: java.lang.Throwable -> L3c
            float r0 = a(r0, r1)     // Catch: java.lang.Throwable -> L3c
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
        L1d:
            return
        L1e:
            r1 = 1148846080(0x447a0000, float:1000.0)
            r2 = 7
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L3e
            r5.D(r2)     // Catch: java.lang.Throwable -> L3c
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "interval"
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.putLong(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r1 = 8
            r2 = 500(0x1f4, double:2.47E-321)
            r5.j(r1, r0, r2)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            goto L65
        L3e:
            r3 = 1167867904(0x459c4000, float:5000.0)
            r4 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L52
            r5.h0()     // Catch: java.lang.Throwable -> L3c
            r5.D(r2)     // Catch: java.lang.Throwable -> L3c
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.j(r2, r4, r0)     // Catch: java.lang.Throwable -> L3c
            return
        L52:
            r5.h0()     // Catch: java.lang.Throwable -> L3c
            r5.D(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = 1165623296(0x457a0000, float:4000.0)
            float r0 = r0 - r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r3
            float r0 = r0 * r1
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3c
            r5.j(r2, r4, r0)     // Catch: java.lang.Throwable -> L3c
            return
        L65:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "doCheckLocationPolicy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void S(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.E(r0, r2)
            return
    }

    public final void T() {
            r4 = this;
            r4.b0()     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r4.z = r0     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r1 = 0
            r3 = 13
            r4.j(r3, r0, r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "pauseGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void U(android.os.Bundle r2) {
            r1 = this;
            r0 = 3
            r1.E(r0, r2)
            return
    }

    final void V() {
            r3 = this;
            r0 = 7
            r3.D(r0)     // Catch: java.lang.Throwable -> L11
            r0 = 8
            r3.D(r0)     // Catch: java.lang.Throwable -> L11
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0.stopLocation()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L17
        L13:
            r0 = 0
            r3.n = r0     // Catch: java.lang.Throwable -> L11
            return
        L17:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "doPauseGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void W(android.os.Bundle r5) {
            r4 = this;
            if (r5 == 0) goto L60
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L9
            goto L60
        L9:
            java.lang.String r0 = "fid"
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L47
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L16
            goto L60
        L16:
            java.lang.String r1 = "ab"
            r2 = 1
            boolean r5 = r5.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r4.f2934h     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r4.f2934h     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L47
        L2d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L47
            com.amap.api.fence.GeoFence r2 = (com.amap.api.fence.GeoFence) r2     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r2.getFenceId()     // Catch: java.lang.Throwable -> L47
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L2d
            r2.setAble(r5)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5 = move-exception
            goto L59
        L49:
            if (r5 != 0) goto L55
            boolean r5 = r4.d0()     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L60
            r4.V()     // Catch: java.lang.Throwable -> L47
            return
        L55:
            r4.g0()     // Catch: java.lang.Throwable -> L47
            return
        L59:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doSetGeoFenceAble"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
        L60:
            return
    }

    public final void X() {
            r3 = this;
            r3.b0()     // Catch: java.lang.Throwable -> Le
            boolean r0 = r3.z     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0 = 0
            r3.z = r0     // Catch: java.lang.Throwable -> Le
            r3.g0()     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L11
        L10:
            return
        L11:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "resumeGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void Y(android.os.Bundle r2) {
            r1 = this;
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r1.f2934h     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            java.lang.String r0 = "fc"
            android.os.Parcelable r2 = r2.getParcelable(r0)     // Catch: java.lang.Throwable -> L28
            com.amap.api.fence.GeoFence r2 = (com.amap.api.fence.GeoFence) r2     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r1.f2934h     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L19
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r1.f2934h     // Catch: java.lang.Throwable -> L28
            r0.remove(r2)     // Catch: java.lang.Throwable -> L28
        L19:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r2 = r1.f2934h     // Catch: java.lang.Throwable -> L28
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L28
            if (r2 > 0) goto L25
            r1.K()     // Catch: java.lang.Throwable -> L28
            return
        L25:
            r1.g0()     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    final void Z(android.os.Bundle r4) {
            r3 = this;
            if (r4 == 0) goto L42
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L42
            java.lang.String r0 = "errorCode"
            int r0 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "resultList"
            java.util.ArrayList r1 = r4.getParcelableArrayList(r1)     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L3b
        L1e:
            java.lang.String r2 = "customId"
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L28
            java.lang.String r4 = ""
        L28:
            com.amap.api.fence.GeoFenceListener r2 = r3.f2931e     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L35
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L1c
            r2.onGeoFenceCreateFinished(r1, r0, r4)     // Catch: java.lang.Throwable -> L1c
        L35:
            if (r0 != 0) goto L42
            r3.g0()     // Catch: java.lang.Throwable -> L1c
            return
        L3b:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "resultAddGeoFenceFinished"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
        L42:
            return
    }

    public final boolean a0() {
            r1 = this;
            boolean r0 = r1.z
            return r0
    }

    final void c0(android.os.Bundle r4) {
            r3 = this;
            com.amap.api.location.AMapLocationClient r0 = r3.s     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L44
            r0 = 2000(0x7d0, double:9.88E-321)
            if (r4 == 0) goto L17
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            java.lang.String r2 = "interval"
            long r0 = r4.getLong(r2, r0)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L45
        L17:
            com.amap.api.location.AMapLocationClientOption r4 = r3.v     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r4.setOnceLocation(r2)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r4 = r3.v     // Catch: java.lang.Throwable -> L15
            r4.setInterval(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r4 = r3.v     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r4.setLocationCacheEnable(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r4 = r3.v     // Catch: java.lang.Throwable -> L15
            r4.setNeedAddress(r2)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClient r4 = r3.s     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r1 = r3.v     // Catch: java.lang.Throwable -> L15
            r4.setLocationOption(r1)     // Catch: java.lang.Throwable -> L15
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L44
            com.amap.api.location.AMapLocationClient r4 = r3.s     // Catch: java.lang.Throwable -> L15
            r4.stopLocation()     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClient r4 = r3.s     // Catch: java.lang.Throwable -> L15
            r4.startLocation()     // Catch: java.lang.Throwable -> L15
            r3.n = r0     // Catch: java.lang.Throwable -> L15
        L44:
            return
        L45:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doStartContinueLocation"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final android.app.PendingIntent d(java.lang.String r6) {
            r5 = this;
            java.lang.Object r0 = r5.f2932f
            monitor-enter(r0)
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            android.content.Context r2 = r5.f2928b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = com.amap.api.col.p0003l.f4.g(r2)     // Catch: java.lang.Throwable -> L2d
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L2d
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2d
            r3 = 31
            r4 = 0
            if (r2 < r3) goto L2f
            android.content.Context r2 = r5.f2928b     // Catch: java.lang.Throwable -> L2d
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L2f
            android.content.Context r2 = r5.f2928b     // Catch: java.lang.Throwable -> L2d
            r3 = 33554432(0x2000000, float:9.403955E-38)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r4, r1, r3)     // Catch: java.lang.Throwable -> L2d
            r5.f2929c = r1     // Catch: java.lang.Throwable -> L2d
            goto L37
        L2d:
            r6 = move-exception
            goto L60
        L2f:
            android.content.Context r2 = r5.f2928b     // Catch: java.lang.Throwable -> L2d
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r4, r1, r4)     // Catch: java.lang.Throwable -> L2d
            r5.f2929c = r1     // Catch: java.lang.Throwable -> L2d
        L37:
            r5.f2930d = r6     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList<com.amap.api.fence.GeoFence> r6 = r5.f2934h     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L67
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L67
            java.util.ArrayList<com.amap.api.fence.GeoFence> r6 = r5.f2934h     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L2d
        L49:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L67
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L2d
            com.amap.api.fence.GeoFence r1 = (com.amap.api.fence.GeoFence) r1     // Catch: java.lang.Throwable -> L2d
            android.app.PendingIntent r2 = r5.f2929c     // Catch: java.lang.Throwable -> L2d
            r1.setPendingIntent(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f2930d     // Catch: java.lang.Throwable -> L2d
            r1.setPendingIntentAction(r2)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L60:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "createPendingIntent"
            com.autonavi.aps.amapapi.utils.b.a(r6, r1, r2)     // Catch: java.lang.Throwable -> L6b
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            android.app.PendingIntent r6 = r5.f2929c
            return r6
        L6b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r6
    }

    public final void g() {
            r4 = this;
            r0 = 0
            r4.p = r0     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r1 = 0
            r3 = 10
            r4.j(r3, r0, r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "removeGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void h(int r4) {
            r3 = this;
            r3.b0()     // Catch: java.lang.Throwable -> L1b
            r0 = 7
            if (r4 > r0) goto L8
            if (r4 > 0) goto L9
        L8:
            r4 = 1
        L9:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "activatesAction"
            r0.putInt(r1, r4)     // Catch: java.lang.Throwable -> L1b
            r4 = 9
            r1 = 0
            r3.j(r4, r0, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "setActivateAction"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    final void i(int r3, android.os.Bundle r4) {
            r2 = this;
            java.lang.Object r0 = r2.f2937k     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.3l.a$d r1 = r2.f2935i     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L16
            r1.what = r3     // Catch: java.lang.Throwable -> L16
            r1.setData(r4)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.a$d r3 = r2.f2935i     // Catch: java.lang.Throwable -> L16
            r3.sendMessage(r1)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            java.lang.String r4 = "GeoFenceManager"
            java.lang.String r0 = "sendResultHandlerMessage"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r0)
            return
    }

    final void j(int r3, android.os.Bundle r4, long r5) {
            r2 = this;
            java.lang.Object r0 = r2.f2936j     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.3l.a$b r1 = r2.l     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L16
            r1.what = r3     // Catch: java.lang.Throwable -> L16
            r1.setData(r4)     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.a$b r3 = r2.l     // Catch: java.lang.Throwable -> L16
            r3.sendMessageDelayed(r1, r5)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            java.lang.String r4 = "GeoFenceManager"
            java.lang.String r5 = "sendActionHandlerMessage"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r5)
            return
    }

    final void k(android.os.Bundle r5) {
            r4 = this;
            r0 = 1
            if (r5 == 0) goto Lc
            java.lang.String r1 = "activatesAction"
            int r0 = r5.getInt(r1, r0)     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r5 = move-exception
            goto L3c
        Lc:
            int r5 = r4.f2933g     // Catch: java.lang.Throwable -> La
            if (r5 == r0) goto L39
            java.util.ArrayList<com.amap.api.fence.GeoFence> r5 = r4.f2934h     // Catch: java.lang.Throwable -> La
            if (r5 == 0) goto L36
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> La
            if (r5 != 0) goto L36
            java.util.ArrayList<com.amap.api.fence.GeoFence> r5 = r4.f2934h     // Catch: java.lang.Throwable -> La
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> La
        L20:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L36
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> La
            com.amap.api.fence.GeoFence r1 = (com.amap.api.fence.GeoFence) r1     // Catch: java.lang.Throwable -> La
            r2 = 0
            r1.setStatus(r2)     // Catch: java.lang.Throwable -> La
            r2 = -1
            r1.setEnterTime(r2)     // Catch: java.lang.Throwable -> La
            goto L20
        L36:
            r4.g0()     // Catch: java.lang.Throwable -> La
        L39:
            r4.f2933g = r0     // Catch: java.lang.Throwable -> La
            return
        L3c:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doSetActivatesAction"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    public final void l(com.amap.api.fence.GeoFenceListener r1) {
            r0 = this;
            r0.f2931e = r1     // Catch: java.lang.Throwable -> L2
        L2:
            return
    }

    final void m(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            boolean r0 = r3.z     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L5
            goto L47
        L5:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r3.f2934h     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L10
            goto L47
        L10:
            if (r4 == 0) goto L47
            int r0 = r4.getErrorCode()     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L47
            java.util.ArrayList<com.amap.api.fence.GeoFence> r0 = r3.f2934h     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L45
        L1e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L45
            com.amap.api.fence.GeoFence r1 = (com.amap.api.fence.GeoFence) r1     // Catch: java.lang.Throwable -> L45
            boolean r2 = r1.isAble()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L1e
            boolean r2 = H(r4, r1)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L1e
            int r2 = r3.f2933g     // Catch: java.lang.Throwable -> L45
            boolean r2 = x(r1, r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L1e
            r1.setCurrentLocation(r4)     // Catch: java.lang.Throwable -> L45
            r3.Q(r1)     // Catch: java.lang.Throwable -> L45
            goto L1e
        L45:
            r4 = move-exception
            goto L48
        L47:
            return
        L48:
            java.lang.String r0 = "GeoFenceManager"
            java.lang.String r1 = "doCheckFence"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final void n(com.amap.api.location.AMapLocationClientOption r1) {
            r0 = this;
            com.amap.api.location.AMapLocationClientOption r1 = r1.clone()     // Catch: java.lang.Throwable -> L6
            r0.v = r1     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    public final void o(com.amap.api.location.DPoint r3, float r4, java.lang.String r5) {
            r2 = this;
            r2.b0()     // Catch: java.lang.Throwable -> L1e
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "centerPoint"
            r0.putParcelable(r1, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "fenceRadius"
            r0.putFloat(r3, r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "customId"
            r0.putString(r3, r5)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4 = 0
            r2.j(r3, r0, r4)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            java.lang.String r4 = "GeoFenceManager"
            java.lang.String r5 = "addRoundGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r5)
            return
    }

    public final void q(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r3.b0()     // Catch: java.lang.Throwable -> L19
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "keyWords"
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "customId"
            r0.putString(r4, r5)     // Catch: java.lang.Throwable -> L19
            r4 = 4
            r1 = 0
            r3.j(r4, r0, r1)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r4 = move-exception
            java.lang.String r5 = "GeoFenceManager"
            java.lang.String r0 = "addDistricetGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
            return
    }

    public final void r(java.lang.String r3, java.lang.String r4, com.amap.api.location.DPoint r5, float r6, int r7, java.lang.String r8) {
            r2 = this;
            r2.b0()     // Catch: java.lang.Throwable -> L46
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r0 = 1195593728(0x47435000, float:50000.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L12
        Lf:
            r6 = 1161527296(0x453b8000, float:3000.0)
        L12:
            if (r7 > 0) goto L16
            r7 = 10
        L16:
            r0 = 25
            if (r7 <= r0) goto L1c
            r7 = 25
        L1c:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "keyWords"
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "poiType"
            r0.putString(r3, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "centerPoint"
            r0.putParcelable(r3, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "aroundRadius"
            r0.putFloat(r3, r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "searchSize"
            r0.putInt(r3, r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "customId"
            r0.putString(r3, r8)     // Catch: java.lang.Throwable -> L46
            r3 = 3
            r4 = 0
            r2.j(r3, r0, r4)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r3 = move-exception
            java.lang.String r4 = "GeoFenceManager"
            java.lang.String r5 = "addNearbyGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r5)
            return
    }

    public final void s(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r2 = this;
            r2.b0()     // Catch: java.lang.Throwable -> L32
            if (r6 > 0) goto L7
            r6 = 10
        L7:
            r0 = 25
            if (r6 <= r0) goto Ld
            r6 = 25
        Ld:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "keyWords"
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "poiType"
            r0.putString(r3, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "city"
            r0.putString(r3, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "searchSize"
            r0.putInt(r3, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "customId"
            r0.putString(r3, r7)     // Catch: java.lang.Throwable -> L32
            r3 = 2
            r4 = 0
            r2.j(r3, r0, r4)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r3 = move-exception
            java.lang.String r4 = "GeoFenceManager"
            java.lang.String r5 = "addKeywordGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r5)
            return
    }

    public final void t(java.lang.String r4, boolean r5) {
            r3 = this;
            r3.b0()     // Catch: java.lang.Throwable -> L1a
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "fid"
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "ab"
            r0.putBoolean(r4, r5)     // Catch: java.lang.Throwable -> L1a
            r4 = 12
            r1 = 0
            r3.j(r4, r0, r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r4 = move-exception
            java.lang.String r5 = "GeoFenceManager"
            java.lang.String r0 = "setGeoFenceAble"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
            return
    }

    public final void u(java.util.List<com.amap.api.location.DPoint> r4, java.lang.String r5) {
            r3 = this;
            r3.b0()     // Catch: java.lang.Throwable -> L1e
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "pointList"
            r0.putParcelableArrayList(r4, r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "customId"
            r0.putString(r4, r5)     // Catch: java.lang.Throwable -> L1e
            r4 = 1
            r1 = 0
            r3.j(r4, r0, r1)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r4 = move-exception
            java.lang.String r5 = "GeoFenceManager"
            java.lang.String r0 = "addPolygonGeoFence"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
            return
    }

    public final boolean w(com.amap.api.fence.GeoFence r7) {
            r6 = this;
            r0 = 0
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r6.f2934h     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L35
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Lf
            goto L35
        Lf:
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r6.f2934h     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.contains(r7)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L34
            java.util.ArrayList<com.amap.api.fence.GeoFence> r1 = r6.f2934h     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            if (r1 != r4) goto L24
            r6.p = r0     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r7 = move-exception
            goto L3e
        L24:
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "fc"
            r1.putParcelable(r5, r7)     // Catch: java.lang.Throwable -> L22
            r7 = 11
            r6.j(r7, r1, r2)     // Catch: java.lang.Throwable -> L22
            return r4
        L34:
            return r0
        L35:
            r6.p = r0     // Catch: java.lang.Throwable -> L22
            r7 = 10
            r1 = 0
            r6.j(r7, r1, r2)     // Catch: java.lang.Throwable -> L22
            return r4
        L3e:
            java.lang.String r1 = "GeoFenceManager"
            java.lang.String r2 = "removeGeoFence(GeoFence)"
            com.autonavi.aps.amapapi.utils.b.a(r7, r1, r2)
            return r0
    }
}
