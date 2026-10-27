package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ca extends java.lang.Thread {

    /* renamed from: e, reason: collision with root package name */
    private static int f3103e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f3104f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static long f3105g = 30000;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f3106h;
    private java.lang.ref.WeakReference<android.content.Context> a;

    /* renamed from: b, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate f3107b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.3l.ca.b f3108c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f3109d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.ca a;

        a(com.amap.api.col.p0003l.ca r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r4) {
                r3 = this;
                super.handleMessage(r4)
                boolean r4 = com.amap.api.col.p0003l.ca.c()
                if (r4 == 0) goto La
                return
            La:
                com.amap.api.col.3l.ca r4 = r3.a
                com.amap.api.col.3l.ca$b r4 = com.amap.api.col.p0003l.ca.a(r4)
                if (r4 != 0) goto L36
                com.amap.api.col.3l.ca r4 = r3.a
                com.amap.api.col.3l.ca$b r0 = new com.amap.api.col.3l.ca$b
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = com.amap.api.col.p0003l.ca.e(r4)
                com.amap.api.col.3l.ca r2 = r3.a
                java.lang.ref.WeakReference r2 = com.amap.api.col.p0003l.ca.g(r2)
                if (r2 != 0) goto L24
                r2 = 0
                goto L30
            L24:
                com.amap.api.col.3l.ca r2 = r3.a
                java.lang.ref.WeakReference r2 = com.amap.api.col.p0003l.ca.g(r2)
                java.lang.Object r2 = r2.get()
                android.content.Context r2 = (android.content.Context) r2
            L30:
                r0.<init>(r1, r2)
                com.amap.api.col.p0003l.ca.b(r4, r0)
            L36:
                com.amap.api.col.3l.z2 r4 = com.amap.api.col.p0003l.z2.a()
                com.amap.api.col.3l.ca r0 = r3.a
                com.amap.api.col.3l.ca$b r0 = com.amap.api.col.p0003l.ca.a(r0)
                r4.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> f3110d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.ref.WeakReference<android.content.Context> f3111e;

        /* renamed from: g, reason: collision with root package name */
        private com.amap.api.col.p0003l.da f3112g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a implements java.lang.Runnable {
            final /* synthetic */ com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.3l.ca.b f3113b;

            a(com.amap.api.col.3l.ca.b r1, com.autonavi.base.amap.api.mapcore.IAMapDelegate r2) {
                    r0 = this;
                    r0.f3113b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r3 = this;
                    com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.a
                    if (r0 == 0) goto L44
                    com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()
                    if (r0 == 0) goto L44
                    com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.a
                    com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()
                    r1 = 0
                    r0.setProFunctionAuthEnable(r1)
                    boolean r1 = r0.isUseProFunction()
                    if (r1 == 0) goto L44
                    com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.a
                    boolean r0 = r0.isCustomStyleEnable()
                    r2 = 1
                    r1.setMapCustomEnable(r0, r2)
                    com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.a
                    r0.reloadMapCustomStyle()
                    com.amap.api.col.3l.ca$b r0 = r3.f3113b
                    java.lang.ref.WeakReference r0 = com.amap.api.col.3l.ca.b.a(r0)
                    if (r0 != 0) goto L33
                    r0 = 0
                    goto L3f
                L33:
                    com.amap.api.col.3l.ca$b r0 = r3.f3113b
                    java.lang.ref.WeakReference r0 = com.amap.api.col.3l.ca.b.a(r0)
                    java.lang.Object r0 = r0.get()
                    android.content.Context r0 = (android.content.Context) r0
                L3f:
                    java.lang.String r1 = "鉴权失败，当前key没有自定义纹理的使用权限，自定义纹理相关内容，将不会呈现！"
                    com.amap.api.col.p0003l.i2.b(r0, r1)
                L44:
                    return
            }
        }

        public b(com.autonavi.base.amap.api.mapcore.IAMapDelegate r2, android.content.Context r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f3110d = r0
                r1.f3111e = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f3110d = r0
                if (r3 == 0) goto L18
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.f3111e = r2
            L18:
                return
        }

        static /* synthetic */ java.lang.ref.WeakReference a(com.amap.api.col.3l.ca.b r0) {
                java.lang.ref.WeakReference<android.content.Context> r0 = r0.f3111e
                return r0
        }

        private void a() {
                r2 = this;
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r2.f3110d
                if (r0 == 0) goto L22
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L22
                java.lang.ref.WeakReference<com.autonavi.base.amap.api.mapcore.IAMapDelegate> r0 = r2.f3110d
                java.lang.Object r0 = r0.get()
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = (com.autonavi.base.amap.api.mapcore.IAMapDelegate) r0
                if (r0 == 0) goto L22
                com.autonavi.base.amap.mapcore.MapConfig r1 = r0.getMapConfig()
                if (r1 == 0) goto L22
                com.amap.api.col.3l.ca$b$a r1 = new com.amap.api.col.3l.ca$b$a
                r1.<init>(r2, r0)
                r0.queueEvent(r1)
            L22:
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r4 = this;
                boolean r0 = com.amap.api.col.p0003l.ca.c()     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L7
                goto L53
            L7:
                com.amap.api.col.3l.da r0 = r4.f3112g     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto L29
                java.lang.ref.WeakReference<android.content.Context> r0 = r4.f3111e     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L29
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L29
                com.amap.api.col.3l.da r0 = new com.amap.api.col.3l.da     // Catch: java.lang.Throwable -> L27
                java.lang.ref.WeakReference<android.content.Context> r1 = r4.f3111e     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L27
                android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = ""
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L27
                r4.f3112g = r0     // Catch: java.lang.Throwable -> L27
                goto L29
            L27:
                r0 = move-exception
                goto L54
            L29:
                com.amap.api.col.p0003l.ca.d()     // Catch: java.lang.Throwable -> L27
                int r0 = com.amap.api.col.p0003l.ca.f()     // Catch: java.lang.Throwable -> L27
                int r1 = com.amap.api.col.p0003l.ca.h()     // Catch: java.lang.Throwable -> L27
                if (r0 <= r1) goto L3d
                com.amap.api.col.p0003l.ca.i()     // Catch: java.lang.Throwable -> L27
                r4.a()     // Catch: java.lang.Throwable -> L27
                return
            L3d:
                com.amap.api.col.3l.da r0 = r4.f3112g     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L53
                java.lang.Object r0 = r0.m()     // Catch: java.lang.Throwable -> L27
                com.amap.api.col.3l.da$a r0 = (com.amap.api.col.3l.da.a) r0     // Catch: java.lang.Throwable -> L27
                if (r0 == 0) goto L53
                boolean r0 = r0.f3159d     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto L50
                r4.a()     // Catch: java.lang.Throwable -> L27
            L50:
                com.amap.api.col.p0003l.ca.i()     // Catch: java.lang.Throwable -> L27
            L53:
                return
            L54:
                java.lang.String r1 = "authForPro"
                java.lang.String r2 = "loadConfigData_uploadException"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
                java.lang.String r1 = com.amap.api.col.p0003l.c3.f3066e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "auth exception get data "
                r2.<init>(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.amap.api.col.p0003l.d3.l(r1, r0)
                return
        }
    }

    static {
            return
    }

    public ca(android.content.Context r3, com.autonavi.base.amap.api.mapcore.IAMapDelegate r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f3108c = r0
            com.amap.api.col.3l.ca$a r0 = new com.amap.api.col.3l.ca$a
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.f3109d = r0
            if (r3 == 0) goto L1c
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.a = r0
        L1c:
            r2.f3107b = r4
            j()
            return
    }

    static /* synthetic */ com.amap.api.col.3l.ca.b a(com.amap.api.col.p0003l.ca r0) {
            com.amap.api.col.3l.ca$b r0 = r0.f3108c
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.ca.b b(com.amap.api.col.p0003l.ca r0, com.amap.api.col.3l.ca.b r1) {
            r0.f3108c = r1
            return r1
    }

    static /* synthetic */ boolean c() {
            boolean r0 = com.amap.api.col.p0003l.ca.f3106h
            return r0
    }

    static /* synthetic */ int d() {
            int r0 = com.amap.api.col.p0003l.ca.f3103e
            int r1 = r0 + 1
            com.amap.api.col.p0003l.ca.f3103e = r1
            return r0
    }

    static /* synthetic */ com.autonavi.base.amap.api.mapcore.IAMapDelegate e(com.amap.api.col.p0003l.ca r0) {
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.f3107b
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = com.amap.api.col.p0003l.ca.f3103e
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference g(com.amap.api.col.p0003l.ca r0) {
            java.lang.ref.WeakReference<android.content.Context> r0 = r0.a
            return r0
    }

    static /* synthetic */ int h() {
            int r0 = com.amap.api.col.p0003l.ca.f3104f
            return r0
    }

    static /* synthetic */ boolean i() {
            r0 = 1
            com.amap.api.col.p0003l.ca.f3106h = r0
            return r0
    }

    private static void j() {
            r0 = 0
            com.amap.api.col.p0003l.ca.f3103e = r0
            com.amap.api.col.p0003l.ca.f3106h = r0
            return
    }

    private void k() {
            r7 = this;
            boolean r0 = com.amap.api.col.p0003l.ca.f3106h
            if (r0 != 0) goto L17
            r0 = 0
            r1 = 0
        L6:
            int r2 = com.amap.api.col.p0003l.ca.f3104f
            if (r1 > r2) goto L17
            android.os.Handler r2 = r7.f3109d
            int r1 = r1 + 1
            long r3 = (long) r1
            long r5 = com.amap.api.col.p0003l.ca.f3105g
            long r3 = r3 * r5
            r2.sendEmptyMessageDelayed(r0, r3)
            goto L6
        L17:
            return
    }

    @Override // java.lang.Thread
    public final void interrupt() {
            r2 = this;
            r0 = 0
            r2.f3107b = r0
            r2.a = r0
            android.os.Handler r1 = r2.f3109d
            if (r1 == 0) goto Lc
            r1.removeCallbacksAndMessages(r0)
        Lc:
            r2.f3109d = r0
            r2.f3108c = r0
            j()
            super.interrupt()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r4 = this;
            r4.k()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "AMapDelegateImpGLSurfaceView"
            java.lang.String r2 = "mVerfy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3066e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "auth pro exception "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amap.api.col.p0003l.d3.l(r1, r0)
            return
    }
}
