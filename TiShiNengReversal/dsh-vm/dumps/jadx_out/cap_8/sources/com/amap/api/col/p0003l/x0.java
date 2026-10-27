package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x0 implements com.amap.api.col.3l.v6.a {
    com.amap.api.col.p0003l.y0 a;

    /* renamed from: b, reason: collision with root package name */
    long f4114b;

    /* renamed from: c, reason: collision with root package name */
    long f4115c;

    /* renamed from: d, reason: collision with root package name */
    long f4116d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4117e;

    /* renamed from: f, reason: collision with root package name */
    private android.content.Context f4118f;

    /* renamed from: g, reason: collision with root package name */
    com.amap.api.col.p0003l.s0 f4119g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.by f4120h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f4121i;

    /* renamed from: j, reason: collision with root package name */
    private com.amap.api.col.p0003l.b7 f4122j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.col.p0003l.t0 f4123k;
    long l;
    private boolean m;
    com.amap.api.col.3l.x0.a n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void c();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends com.amap.api.col.p0003l.g2 {
        private final java.lang.String r;

        public b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.r = r1
                return
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getIPV6URL() {
                r1 = this;
                java.lang.String r0 = r1.getURL()
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final java.lang.String getURL() {
                r1 = this;
                java.lang.String r0 = r1.r
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final boolean isSupportIPV6() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public x0(com.amap.api.col.p0003l.y0 r4, java.lang.String r5, android.content.Context r6, com.amap.api.col.p0003l.by r7) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = 0
            r3.f4114b = r0
            r3.f4115c = r0
            r2 = 1
            r3.f4117e = r2
            r3.l = r0
            r0 = 0
            r3.m = r0
            android.content.Context r0 = r6.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.3l.s0 r0 = com.amap.api.col.p0003l.s0.b(r0)
            r3.f4119g = r0
            r3.a = r4
            r3.f4118f = r6
            r3.f4121i = r5
            r3.f4120h = r7
            r3.f()
            return
    }

    private void b(long r6) {
            r5 = this;
            long r0 = r5.f4116d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            com.amap.api.col.3l.by r2 = r5.f4120h
            if (r2 == 0) goto L15
            r2.a(r0, r6)
            long r6 = java.lang.System.currentTimeMillis()
            r5.l = r6
        L15:
            return
    }

    private void e() throws java.io.IOException {
            r8 = this;
            com.amap.api.col.3l.d1 r1 = new com.amap.api.col.3l.d1
            java.lang.String r0 = r8.f4121i
            r1.<init>(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectionTimeout(r0)
            r1.setSoTimeout(r0)
            com.amap.api.col.3l.b7 r0 = new com.amap.api.col.3l.b7
            long r2 = r8.f4114b
            long r4 = r8.f4115c
            int r6 = com.amap.api.maps.MapsInitializer.getProtocol()
            r7 = 2
            if (r6 != r7) goto L1e
            r6 = 1
            goto L1f
        L1e:
            r6 = 0
        L1f:
            r0.<init>(r1, r2, r4, r6)
            r8.f4122j = r0
            com.amap.api.col.3l.t0 r0 = new com.amap.api.col.3l.t0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.amap.api.col.3l.y0 r2 = r8.a
            java.lang.String r2 = r2.b()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            com.amap.api.col.3l.y0 r2 = r8.a
            java.lang.String r2 = r2.c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r2 = r8.f4114b
            r0.<init>(r1, r2)
            r8.f4123k = r0
            return
    }

    private void f() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.amap.api.col.3l.y0 r1 = r2.a
            java.lang.String r1 = r1.b()
            r0.append(r1)
            com.amap.api.col.3l.y0 r1 = r2.a
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L43
            r0 = 0
            r2.f4117e = r0
            long r0 = r1.length()
            r2.f4114b = r0
            long r0 = r2.i()     // Catch: java.io.IOException -> L38
            r2.f4116d = r0     // Catch: java.io.IOException -> L38
            r2.f4115c = r0     // Catch: java.io.IOException -> L38
            return
        L38:
            com.amap.api.col.3l.by r0 = r2.f4120h
            if (r0 == 0) goto L42
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3026c
            r0.b(r1)
        L42:
            return
        L43:
            r0 = 0
            r2.f4114b = r0
            r2.f4115c = r0
            return
    }

    private boolean g() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.amap.api.col.3l.y0 r1 = r5.a
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            com.amap.api.col.3l.y0 r1 = r5.a
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            long r0 = r1.length()
            r2 = 10
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L31
            r0 = 0
            return r0
        L31:
            r0 = 1
            return r0
    }

    private void h() throws com.amap.api.maps.AMapException {
            r6 = this;
            int r0 = com.amap.api.col.p0003l.g4.a
            r1 = 1
            if (r0 == r1) goto L25
            r0 = 0
        L6:
            r2 = 3
            if (r0 >= r2) goto L25
            android.content.Context r2 = r6.f4118f     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.p4 r3 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = ""
            r5 = 0
            com.amap.api.col.p0003l.g4.c(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            int r2 = com.amap.api.col.p0003l.g4.a     // Catch: java.lang.Throwable -> L1a
            if (r2 != r1) goto L22
            goto L25
        L1a:
            r2 = move-exception
            java.lang.String r3 = "SiteFileFetch"
            java.lang.String r4 = "authOffLineDownLoad"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
        L22:
            int r0 = r0 + 1
            goto L6
        L25:
            return
    }

    private long i() throws java.io.IOException {
            r5 = this;
            android.content.Context r0 = r5.f4118f
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r0, r1)
            com.amap.api.col.3l.ft$c r0 = r0.a
            com.amap.api.col.3l.ft$c r1 = com.amap.api.col.3l.ft.c.a
            if (r0 == r1) goto L13
            r0 = -1
            return r0
        L13:
            com.amap.api.col.3l.y0 r0 = r5.a
            java.lang.String r0 = r0.a()
            com.amap.api.col.p0003l.z6.n()     // Catch: com.amap.api.col.p0003l.fk -> L30
            com.amap.api.col.3l.x0$b r1 = new com.amap.api.col.3l.x0$b     // Catch: com.amap.api.col.p0003l.fk -> L30
            r1.<init>(r0)     // Catch: com.amap.api.col.p0003l.fk -> L30
            int r0 = com.amap.api.maps.MapsInitializer.getProtocol()     // Catch: com.amap.api.col.p0003l.fk -> L30
            r2 = 2
            if (r0 != r2) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            java.util.Map r0 = com.amap.api.col.p0003l.z6.q(r1, r0)     // Catch: com.amap.api.col.p0003l.fk -> L30
            goto L31
        L30:
            r0 = 0
        L31:
            r1 = -1
            if (r0 == 0) goto L5b
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L3c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Content-Length"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L3c
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            goto L3c
        L5b:
            long r0 = (long) r1
            return r0
    }

    private void j() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.amap.api.col.3l.y0 r2 = r7.a
            if (r2 == 0) goto L1c
            long r2 = r7.l
            long r2 = r0 - r2
            r4 = 500(0x1f4, double:2.47E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1c
            r7.k()
            r7.l = r0
            long r0 = r7.f4114b
            r7.b(r0)
        L1c:
            return
    }

    private void k() {
            r9 = this;
            com.amap.api.col.3l.s0 r0 = r9.f4119g
            com.amap.api.col.3l.y0 r1 = r9.a
            java.lang.String r1 = r1.e()
            com.amap.api.col.3l.y0 r2 = r9.a
            int r2 = r2.d()
            long r3 = r9.f4116d
            long r5 = r9.f4114b
            long r7 = r9.f4115c
            r0.f(r1, r2, r3, r5, r7)
            return
    }

    public final void a() {
            r5 = this;
            android.content.Context r0 = r5.f4118f     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            boolean r0 = com.amap.api.col.p0003l.b3.h0(r0)     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 == 0) goto L5e
            r5.h()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            int r0 = com.amap.api.col.p0003l.g4.a     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r1 = 1
            if (r0 == r1) goto L1e
            com.amap.api.col.3l.by r0 = r5.f4120h     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 == 0) goto L82
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.a     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r0.b(r1)     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            return
        L1a:
            goto L68
        L1c:
            r0 = move-exception
            goto L72
        L1e:
            boolean r0 = r5.g()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 != 0) goto L26
            r5.f4117e = r1     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
        L26:
            boolean r0 = r5.f4117e     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 == 0) goto L42
            long r0 = r5.i()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r5.f4116d = r0     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3e
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3e
            r5.f4115c = r0     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
        L3e:
            r0 = 0
            r5.f4114b = r0     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
        L42:
            com.amap.api.col.3l.by r0 = r5.f4120h     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 == 0) goto L49
            r0.m()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
        L49:
            long r0 = r5.f4114b     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            long r2 = r5.f4115c     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L55
            r5.onFinish()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            return
        L55:
            r5.e()     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            com.amap.api.col.3l.b7 r0 = r5.f4122j     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r0.b(r5)     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            return
        L5e:
            com.amap.api.col.3l.by r0 = r5.f4120h     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            if (r0 == 0) goto L82
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3025b     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            r0.b(r1)     // Catch: java.io.IOException -> L1a com.amap.api.maps.AMapException -> L1c
            return
        L68:
            com.amap.api.col.3l.by r0 = r5.f4120h
            if (r0 == 0) goto L82
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3026c
            r0.b(r1)
            goto L82
        L72:
            java.lang.String r1 = "SiteFileFetch"
            java.lang.String r2 = "download"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.3l.by r0 = r5.f4120h
            if (r0 == 0) goto L82
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.a
            r0.b(r1)
        L82:
            return
    }

    public final void c(com.amap.api.col.3l.x0.a r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public final void d() {
            r1 = this;
            com.amap.api.col.3l.b7 r0 = r1.f4122j
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onDownload(byte[] r2, long r3) {
            r1 = this;
            com.amap.api.col.3l.t0 r0 = r1.f4123k     // Catch: java.io.IOException -> Lb
            r0.a(r2)     // Catch: java.io.IOException -> Lb
            r1.f4114b = r3
            r1.j()
            return
        Lb:
            r2 = move-exception
            java.lang.String r3 = "fileAccessI"
            java.lang.String r4 = "fileAccessI.write(byte[] data)"
            com.amap.api.col.p0003l.w5.p(r2, r3, r4)
            com.amap.api.col.3l.by r2 = r1.f4120h
            if (r2 == 0) goto L1c
            com.amap.api.col.3l.by$a r3 = com.amap.api.col.3l.by.a.f3026c
            r2.b(r3)
        L1c:
            com.amap.api.col.3l.b7 r2 = r1.f4122j
            if (r2 == 0) goto L23
            r2.a()
        L23:
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onException(java.lang.Throwable r3) {
            r2 = this;
            r0 = 1
            r2.m = r0
            r2.d()
            com.amap.api.col.3l.by r0 = r2.f4120h
            if (r0 == 0) goto Lf
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3025b
            r0.b(r1)
        Lf:
            boolean r3 = r3 instanceof java.io.IOException
            if (r3 == 0) goto L14
            goto L1b
        L14:
            com.amap.api.col.3l.t0 r3 = r2.f4123k
            if (r3 == 0) goto L1b
            r3.b()
        L1b:
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onFinish() {
            r1 = this;
            r1.j()
            com.amap.api.col.3l.by r0 = r1.f4120h
            if (r0 == 0) goto La
            r0.n()
        La:
            com.amap.api.col.3l.t0 r0 = r1.f4123k
            if (r0 == 0) goto L11
            r0.b()
        L11:
            com.amap.api.col.3l.x0$a r0 = r1.n
            if (r0 == 0) goto L18
            r0.c()
        L18:
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onStop() {
            r1 = this;
            boolean r0 = r1.m
            if (r0 == 0) goto L5
            return
        L5:
            com.amap.api.col.3l.by r0 = r1.f4120h
            if (r0 == 0) goto Lc
            r0.a()
        Lc:
            r1.k()
            return
    }
}
