package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ga {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> f3418b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.HandlerThread f3419c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f3420d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.3l.ga.c f3421e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Runnable f3422f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.Runnable f3423g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.ga a;

        a(com.amap.api.col.p0003l.ga r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.3l.ga r0 = r4.a
                com.amap.api.col.3l.ga$c r0 = com.amap.api.col.p0003l.ga.a(r0)
                if (r0 != 0) goto L18
                com.amap.api.col.3l.ga r0 = r4.a
                com.amap.api.col.3l.ga$c r1 = new com.amap.api.col.3l.ga$c
                android.content.Context r2 = com.amap.api.col.p0003l.ga.e(r0)
                com.amap.api.col.3l.ga r3 = r4.a
                r1.<init>(r2, r3)
                com.amap.api.col.p0003l.ga.b(r0, r1)
            L18:
                com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.ga r1 = r4.a
                com.amap.api.col.3l.ga$c r1 = com.amap.api.col.p0003l.ga.a(r1)
                r0.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.p0003l.ga a;

        b(com.amap.api.col.p0003l.ga r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.amap.api.col.3l.ga r0 = r2.a
                java.lang.ref.WeakReference r0 = com.amap.api.col.p0003l.ga.g(r0)
                java.lang.Object r0 = r0.get()
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r0
                if (r0 == 0) goto L12
                r1 = 0
                r0.setTerrainAuth(r1)
            L12:
                com.amap.api.col.3l.ga r0 = r2.a
                android.content.Context r0 = com.amap.api.col.p0003l.ga.e(r0)
                java.lang.String r1 = "地形图鉴权失败，当前key没有地形图的使用权限，地形图，将不会呈现！"
                com.amap.api.col.p0003l.i2.b(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        private android.content.Context f3424d;

        /* renamed from: e, reason: collision with root package name */
        private com.amap.api.col.p0003l.ga f3425e;

        /* renamed from: g, reason: collision with root package name */
        private com.amap.api.col.3l.ga.d f3426g;

        public c(android.content.Context r2, com.amap.api.col.p0003l.ga r3) {
                r1 = this;
                r1.<init>()
                r1.f3424d = r2
                r1.f3425e = r3
                com.amap.api.col.3l.ga$d r3 = new com.amap.api.col.3l.ga$d
                java.lang.String r0 = ""
                r3.<init>(r2, r0)
                r1.f3426g = r3
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r3 = this;
                r0 = 30000(0x7530, double:1.4822E-319)
                com.amap.api.col.3l.ga$d r2 = r3.f3426g     // Catch: com.amap.api.col.p0003l.fc -> L1c
                java.lang.Object r2 = r2.m()     // Catch: com.amap.api.col.p0003l.fc -> L1c
                com.amap.api.col.3l.ga$e r2 = (com.amap.api.col.3l.ga.e) r2     // Catch: com.amap.api.col.p0003l.fc -> L1c
                if (r2 != 0) goto L12
                com.amap.api.col.3l.ga r2 = r3.f3425e     // Catch: com.amap.api.col.p0003l.fc -> L1c
                r2.d(r0)     // Catch: com.amap.api.col.p0003l.fc -> L1c
                return
            L12:
                boolean r2 = r2.f3429d     // Catch: com.amap.api.col.p0003l.fc -> L1c
                if (r2 != 0) goto L1b
                com.amap.api.col.3l.ga r2 = r3.f3425e     // Catch: com.amap.api.col.p0003l.fc -> L1c
                com.amap.api.col.p0003l.ga.i(r2)     // Catch: com.amap.api.col.p0003l.fc -> L1c
            L1b:
                return
            L1c:
                com.amap.api.col.3l.ga r2 = r3.f3425e
                r2.d(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends com.amap.api.col.p0003l.y3<java.lang.String, com.amap.api.col.3l.ga.e> {
        private boolean w;

        public d(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = "/rest/feedback/terrain"
                r0.u = r1
                r1 = 0
                r0.isPostFlag = r1
                r1 = 1
                r0.w = r1
                return
        }

        private static com.amap.api.col.3l.ga.e o(java.lang.String r4) throws com.amap.api.col.p0003l.fc {
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L35
                r0.<init>(r4)     // Catch: org.json.JSONException -> L35
                java.lang.String r4 = "info"
                java.lang.String r4 = r0.optString(r4)     // Catch: org.json.JSONException -> L35
                java.lang.String r1 = "infocode"
                java.lang.String r1 = r0.optString(r1)     // Catch: org.json.JSONException -> L35
                java.lang.String r2 = "status"
                java.lang.String r0 = r0.optString(r2)     // Catch: org.json.JSONException -> L35
                com.amap.api.col.3l.ga$e r2 = new com.amap.api.col.3l.ga$e     // Catch: org.json.JSONException -> L35
                r3 = 0
                r2.<init>(r3)     // Catch: org.json.JSONException -> L35
                r2.a = r4     // Catch: org.json.JSONException -> L35
                r2.f3427b = r1     // Catch: org.json.JSONException -> L35
                r2.f3428c = r0     // Catch: org.json.JSONException -> L35
                boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L35
                if (r4 != 0) goto L32
                java.lang.String r4 = "10000"
                boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: org.json.JSONException -> L35
                if (r4 == 0) goto L32
                r3 = 1
            L32:
                r2.f3429d = r3     // Catch: org.json.JSONException -> L35
                return r2
            L35:
                r4 = 0
                return r4
        }

        private static com.amap.api.col.3l.ga.e p(byte[] r3) throws com.amap.api.col.p0003l.fc {
                r0 = 0
                java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L9
                java.lang.String r2 = "utf-8"
                r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L9
                goto Lb
            L9:
                r1 = r0
            Lb:
                if (r1 == 0) goto L1b
                java.lang.String r3 = ""
                boolean r3 = r3.equals(r1)
                if (r3 == 0) goto L16
                goto L1b
            L16:
                com.amap.api.col.3l.ga$e r3 = o(r1)
                return r3
            L1b:
                return r0
        }

        @Override // com.amap.api.col.p0003l.y3
        protected final /* synthetic */ com.amap.api.col.3l.ga.e g(java.lang.String r1) throws com.amap.api.col.p0003l.fc {
                r0 = this;
                com.amap.api.col.3l.ga$e r1 = o(r1)
                return r1
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getIPV6URL() {
                r1 = this;
                java.lang.String r0 = r1.getURL()
                java.lang.String r0 = com.amap.api.col.p0003l.b3.y(r0)
                return r0
        }

        @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
        public final java.util.Map<java.lang.String, java.lang.String> getParams() {
                r4 = this;
                java.util.Hashtable r0 = new java.util.Hashtable
                r1 = 16
                r0.<init>(r1)
                android.content.Context r1 = r4.t
                java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
                java.lang.String r2 = "key"
                r0.put(r2, r1)
                boolean r1 = r4.w
                if (r1 == 0) goto L1d
                java.lang.String r1 = "pname"
                java.lang.String r2 = "3dmap"
                r0.put(r1, r2)
            L1d:
                java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
                android.content.Context r2 = r4.t
                java.lang.String r3 = com.amap.api.col.p0003l.q4.r(r0)
                java.lang.String r2 = com.amap.api.col.p0003l.h4.c(r2, r1, r3)
                java.lang.String r3 = "ts"
                r0.put(r3, r1)
                java.lang.String r1 = "scode"
                r0.put(r1, r2)
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getURL() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "http://restsdk.amap.com"
                r0.<init>(r1)
                java.lang.String r1 = r2.u
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.amap.api.col.p0003l.y3
        protected final /* synthetic */ com.amap.api.col.3l.ga.e h(byte[] r1) throws com.amap.api.col.p0003l.fc {
                r0 = this;
                com.amap.api.col.3l.ga$e r1 = p(r1)
                return r1
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final boolean isSupportIPV6() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.amap.api.col.p0003l.y3
        protected final java.lang.String l() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f3427b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f3428c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3429d;

        private e() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f3429d = r0
                return
        }

        /* synthetic */ e(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ga(android.content.Context r2, com.autonavi.base.amap.api.mapcore.IAMapDelegate r3) {
            r1 = this;
            r1.<init>()
            com.amap.api.col.3l.ga$a r0 = new com.amap.api.col.3l.ga$a
            r0.<init>(r1)
            r1.f3422f = r0
            com.amap.api.col.3l.ga$b r0 = new com.amap.api.col.3l.ga$b
            r0.<init>(r1)
            r1.f3423g = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.f3418b = r2
            r1.f()
            return
    }

    static /* synthetic */ com.amap.api.col.3l.ga.c a(com.amap.api.col.p0003l.ga r0) {
            com.amap.api.col.3l.ga$c r0 = r0.f3421e
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.ga.c b(com.amap.api.col.p0003l.ga r0, com.amap.api.col.3l.ga.c r1) {
            r0.f3421e = r1
            return r1
    }

    static /* synthetic */ android.content.Context e(com.amap.api.col.p0003l.ga r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    private void f() {
            r2 = this;
            android.os.HandlerThread r0 = r2.f3419c
            if (r0 != 0) goto L1d
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "terrain_auth"
            r0.<init>(r1)
            r2.f3419c = r0
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r2.f3419c
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r2.f3420d = r0
        L1d:
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference g(com.amap.api.col.p0003l.ga r0) {
            java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r0.f3418b
            return r0
    }

    private void h() {
            r4 = this;
            android.os.Handler r0 = r4.f3420d
            if (r0 == 0) goto Lb
            java.lang.Runnable r1 = r4.f3423g
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
        Lb:
            return
    }

    static /* synthetic */ void i(com.amap.api.col.p0003l.ga r0) {
            r0.h()
            return
    }

    public final void c() {
            r2 = this;
            android.os.Handler r0 = r2.f3420d
            r1 = 0
            if (r0 == 0) goto La
            r0.removeCallbacksAndMessages(r1)
            r2.f3420d = r1
        La:
            android.os.HandlerThread r0 = r2.f3419c
            if (r0 == 0) goto L13
            r0.quitSafely()
            r2.f3419c = r1
        L13:
            return
    }

    public final void d(long r3) {
            r2 = this;
            android.os.Handler r0 = r2.f3420d
            if (r0 == 0) goto L9
            java.lang.Runnable r1 = r2.f3422f
            r0.postDelayed(r1, r3)
        L9:
            return
    }
}
