package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class fa implements com.amap.api.col.3l.v6.a {
    private final android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.io.RandomAccessFile f3306b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.p0003l.b7 f3307c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f3308d;

    /* renamed from: e, reason: collision with root package name */
    com.amap.api.col.3l.fa.a f3309e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        protected java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        protected java.lang.String f3310b;

        /* renamed from: c, reason: collision with root package name */
        protected java.lang.String f3311c;

        /* renamed from: d, reason: collision with root package name */
        protected java.lang.String f3312d;

        /* renamed from: e, reason: collision with root package name */
        protected java.lang.String f3313e;

        /* renamed from: f, reason: collision with root package name */
        protected com.amap.api.col.3l.fa.c f3314f;

        public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f3310b = r2
                r0.f3311c = r3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                java.lang.String r2 = ".tmp"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.f3312d = r1
                r0.f3313e = r4
                return
        }

        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public final void b(com.amap.api.col.3l.fa.c r1) {
                r0 = this;
                r0.f3314f = r1
                return
        }

        public final java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.f3310b
                return r0
        }

        public final java.lang.String d() {
                r1 = this;
                java.lang.String r0 = r1.f3312d
                return r0
        }

        public final java.lang.String e() {
                r1 = this;
                java.lang.String r0 = r1.f3313e
                return r0
        }

        public final com.amap.api.col.3l.fa.c f() {
                r1 = this;
                com.amap.api.col.3l.fa$c r0 = r1.f3314f
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.amap.api.col.p0003l.g2 {
        private final com.amap.api.col.3l.fa.a r;

        b(com.amap.api.col.3l.fa.a r1) {
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

        @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
        public final java.util.Map<java.lang.String, java.lang.String> getParams() {
                r1 = this;
                r0 = 0
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
                com.amap.api.col.3l.fa$a r0 = r1.r
                if (r0 == 0) goto L9
                java.lang.String r0 = r0.a()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public final boolean isSupportIPV6() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c {
        protected java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        protected java.lang.String f3315b;

        public c(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f3315b = r2
                return
        }

        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.f3315b
                return r0
        }

        public final boolean c() {
                r1 = this;
                java.lang.String r0 = r1.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L12
                java.lang.String r0 = r1.f3315b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends com.amap.api.col.3l.fa.a {
        public d(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public final void g(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                com.amap.api.col.3l.fa$c r0 = new com.amap.api.col.3l.fa$c
                r0.<init>(r2, r3)
                r1.b(r0)
                return
        }
    }

    public fa(android.content.Context r2, com.amap.api.col.3l.fa.a r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            r1.f3309e = r3
            com.amap.api.col.3l.b7 r2 = new com.amap.api.col.3l.b7
            com.amap.api.col.3l.fa$b r0 = new com.amap.api.col.3l.fa$b
            r0.<init>(r3)
            r2.<init>(r0)
            r1.f3307c = r2
            java.lang.String r2 = r3.d()
            r1.f3308d = r2
            return
    }

    private boolean b() {
            r4 = this;
            com.amap.api.col.3l.fa$a r0 = r4.f3309e
            com.amap.api.col.3l.fa$c r0 = r0.f()
            if (r0 == 0) goto L2c
            boolean r1 = r0.c()
            if (r1 == 0) goto L2c
            android.content.Context r1 = r4.a
            java.lang.String r2 = r0.a()
            java.lang.String r0 = r0.b()
            java.lang.String r3 = ""
            java.lang.String r0 = com.amap.api.col.p0003l.r2.b(r1, r2, r0, r3)
            com.amap.api.col.3l.fa$a r1 = r4.f3309e
            java.lang.String r1 = r1.c()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = 1
            return r0
    }

    public final void a() {
            r3 = this;
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            if (r0 == 0) goto L15
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r0, r1)
            com.amap.api.col.3l.ft$c r0 = r0.a
            com.amap.api.col.3l.ft$c r1 = com.amap.api.col.3l.ft.c.a
            if (r0 == r1) goto L15
            goto L25
        L15:
            boolean r0 = r3.b()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            com.amap.api.col.3l.b7 r0 = r3.f3307c     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            r0.b(r3)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            goto L26
        L25:
            return
        L26:
            java.lang.String r1 = "AuthTaskDownload"
            java.lang.String r2 = "startDownload()"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onDownload(byte[] r4, long r5) {
            r3 = this;
            java.io.RandomAccessFile r0 = r3.f3306b     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r3.f3308d     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L1b
            r1.mkdirs()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L2f
        L1b:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L19
            r3.f3306b = r1     // Catch: java.lang.Throwable -> L19
        L24:
            java.io.RandomAccessFile r0 = r3.f3306b     // Catch: java.lang.Throwable -> L19
            r0.seek(r5)     // Catch: java.lang.Throwable -> L19
            java.io.RandomAccessFile r5 = r3.f3306b     // Catch: java.lang.Throwable -> L19
            r5.write(r4)     // Catch: java.lang.Throwable -> L19
            return
        L2f:
            java.lang.String r5 = "AuthTaskDownload"
            java.lang.String r6 = "onDownload()"
            com.amap.api.col.p0003l.w5.p(r4, r5, r6)
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onException(java.lang.Throwable r3) {
            r2 = this;
            java.io.RandomAccessFile r3 = r2.f3306b     // Catch: java.lang.Throwable -> L9
            if (r3 != 0) goto L5
            return
        L5:
            r3.close()     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            java.lang.String r0 = "AuthTaskDownload"
            java.lang.String r1 = "onException()"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onFinish() {
            r11 = this;
            java.lang.String r1 = "AuthTaskDownload"
            java.io.RandomAccessFile r0 = r11.f3306b     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L8
            goto L89
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r0 = move-exception
            java.lang.String r2 = "onFinish3"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L76
        L12:
            com.amap.api.col.3l.fa$a r0 = r11.f3309e     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r11.f3308d     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = com.amap.api.col.p0003l.m4.a(r2)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L78
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L78
            com.amap.api.col.3l.fa$a r0 = r11.f3309e     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.e()     // Catch: java.lang.Throwable -> L76
            com.amap.api.col.3l.u0 r3 = new com.amap.api.col.3l.u0     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r11.f3308d     // Catch: java.lang.Throwable -> L63
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L63
            long r8 = com.amap.api.col.p0003l.a1.b(r4)     // Catch: java.lang.Throwable -> L63
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L63
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L63
            r6 = -1
            r10 = 0
            r3.b(r4, r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L63
            com.amap.api.col.3l.fa$a r0 = r11.f3309e     // Catch: java.lang.Throwable -> L63
            com.amap.api.col.3l.fa$c r0 = r0.f()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L65
            boolean r3 = r0.c()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L65
            android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L63
            com.amap.api.col.p0003l.r2.c(r3, r4, r0, r2)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L70
        L65:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r11.f3308d     // Catch: java.lang.Throwable -> L63
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L63
            r0.delete()     // Catch: java.lang.Throwable -> L63
            goto L89
        L70:
            java.lang.String r2 = "onFinish1"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L76
            goto L89
        L76:
            r0 = move-exception
            goto L8a
        L78:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r11.f3308d     // Catch: java.lang.Throwable -> L83
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L83
            r0.delete()     // Catch: java.lang.Throwable -> L83
            goto L89
        L83:
            r0 = move-exception
            java.lang.String r2 = "onFinish"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L76
        L89:
            return
        L8a:
            java.lang.String r2 = "onFinish()"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public final void onStop() {
            r0 = this;
            return
    }
}
