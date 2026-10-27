package com.huawei.agconnect.core.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class b extends com.huawei.agconnect.d {
    private static java.util.List<com.huawei.agconnect.core.b> d;
    private static final java.lang.Object e = null;
    private static final java.util.Map<java.lang.String, com.huawei.agconnect.d> f = null;
    private static java.lang.String g;
    private final com.huawei.agconnect.e a;
    private final com.huawei.agconnect.core.a.d b;
    private final com.huawei.agconnect.core.a.d c;

    static class a implements com.huawei.agconnect.i.a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.huawei.agconnect.i.a
        public java.lang.String a(com.huawei.agconnect.e r3) {
                r2 = this;
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.c
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L13
                java.lang.String r0 = "/agcgw_all/CN"
            Le:
                java.lang.String r3 = r3.getString(r0)
                return r3
            L13:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.e
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L22
                java.lang.String r0 = "/agcgw_all/RU"
                goto Le
            L22:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.d
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L31
                java.lang.String r0 = "/agcgw_all/DE"
                goto Le
            L31:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.f
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L40
                java.lang.String r0 = "/agcgw_all/SG"
                goto Le
            L40:
                r3 = 0
                return r3
        }
    }

    /* renamed from: com.huawei.agconnect.core.a.b$b, reason: collision with other inner class name */
    static class C0023b implements com.huawei.agconnect.i.a {
        C0023b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.huawei.agconnect.i.a
        public java.lang.String a(com.huawei.agconnect.e r3) {
                r2 = this;
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.c
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L13
                java.lang.String r0 = "/agcgw_all/CN_back"
            Le:
                java.lang.String r3 = r3.getString(r0)
                return r3
            L13:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.e
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L22
                java.lang.String r0 = "/agcgw_all/RU_back"
                goto Le
            L22:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.d
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L31
                java.lang.String r0 = "/agcgw_all/DE_back"
                goto Le
            L31:
                com.huawei.agconnect.b r0 = r3.c()
                com.huawei.agconnect.b r1 = com.huawei.agconnect.b.f
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L40
                java.lang.String r0 = "/agcgw_all/SG_back"
                goto Le
            L40:
                r3 = 0
                return r3
        }
    }

    class c implements k1.b {
        final /* synthetic */ com.huawei.agconnect.h a;
        final /* synthetic */ com.huawei.agconnect.core.a.b b;

        c(com.huawei.agconnect.core.a.b r1, com.huawei.agconnect.h r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public com.huawei.hmf.tasks.k<k1.d> a(boolean r2) {
                r1 = this;
                com.huawei.agconnect.h r0 = r1.a
                com.huawei.hmf.tasks.k r2 = r0.a(r2)
                return r2
        }

        public com.huawei.hmf.tasks.k<k1.d> b() {
                r2 = this;
                com.huawei.agconnect.h r0 = r2.a
                r1 = 0
                com.huawei.hmf.tasks.k r0 = r0.a(r1)
                return r0
        }
    }

    class d implements k1.a {
        final /* synthetic */ com.huawei.agconnect.g a;
        final /* synthetic */ com.huawei.agconnect.core.a.b b;

        d(com.huawei.agconnect.core.a.b r1, com.huawei.agconnect.g r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public com.huawei.hmf.tasks.k<k1.d> a(boolean r2) {
                r1 = this;
                com.huawei.agconnect.g r0 = r1.a
                com.huawei.hmf.tasks.k r2 = r0.a(r2)
                return r2
        }

        public com.huawei.hmf.tasks.k<k1.d> b() {
                r2 = this;
                com.huawei.agconnect.g r0 = r2.a
                r1 = 0
                com.huawei.hmf.tasks.k r0 = r0.a(r1)
                return r0
        }

        public void c(k1.c r1) {
                r0 = this;
                return
        }

        public void d(k1.c r1) {
                r0 = this;
                return
        }

        public java.lang.String getUid() {
                r1 = this;
                java.lang.String r0 = ""
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.agconnect.core.a.b.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.agconnect.core.a.b.f = r0
            return
    }

    public b(com.huawei.agconnect.e r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            com.huawei.agconnect.core.a.d r0 = new com.huawei.agconnect.core.a.d
            java.util.List<com.huawei.agconnect.core.b> r1 = com.huawei.agconnect.core.a.b.d
            android.content.Context r2 = r4.getContext()
            r0.<init>(r1, r2)
            r3.b = r0
            com.huawei.agconnect.core.a.d r0 = new com.huawei.agconnect.core.a.d
            r1 = 0
            android.content.Context r2 = r4.getContext()
            r0.<init>(r1, r2)
            r3.c = r0
            boolean r1 = r4 instanceof com.huawei.agconnect.config.impl.d
            if (r1 == 0) goto L30
            r1 = r4
            com.huawei.agconnect.config.impl.d r1 = (com.huawei.agconnect.config.impl.d) r1
            java.util.List r1 = r1.e()
            android.content.Context r4 = r4.getContext()
            r0.e(r1, r4)
        L30:
            return
    }

    public static com.huawei.agconnect.d h() {
            java.lang.String r0 = com.huawei.agconnect.core.a.b.g
            if (r0 != 0) goto Lb
            java.lang.String r0 = "DEFAULT_INSTANCE"
            com.huawei.agconnect.d r0 = k(r0)
            return r0
        Lb:
            com.huawei.agconnect.d r0 = k(r0)
            return r0
    }

    public static com.huawei.agconnect.d i(com.huawei.agconnect.e r1) {
            r0 = 0
            com.huawei.agconnect.d r1 = j(r1, r0)
            return r1
    }

    private static com.huawei.agconnect.d j(com.huawei.agconnect.e r3, boolean r4) {
            java.lang.Object r0 = com.huawei.agconnect.core.a.b.e
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.agconnect.d> r1 = com.huawei.agconnect.core.a.b.f     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r3.getIdentifier()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L21
            com.huawei.agconnect.d r2 = (com.huawei.agconnect.d) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L13
            if (r4 == 0) goto L1f
        L13:
            com.huawei.agconnect.core.a.b r2 = new com.huawei.agconnect.core.a.b     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.getIdentifier()     // Catch: java.lang.Throwable -> L21
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r2
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public static com.huawei.agconnect.d k(java.lang.String r3) {
            java.lang.Object r0 = com.huawei.agconnect.core.a.b.e
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.agconnect.d> r1 = com.huawei.agconnect.core.a.b.f     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
            com.huawei.agconnect.d r1 = (com.huawei.agconnect.d) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.lang.String r2 = "DEFAULT_INSTANCE"
            r2.equals(r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public static synchronized void l(android.content.Context r2) {
            java.lang.Class<com.huawei.agconnect.core.a.b> r0 = com.huawei.agconnect.core.a.b.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.agconnect.d> r1 = com.huawei.agconnect.core.a.b.f     // Catch: java.lang.Throwable -> L16
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L16
            if (r1 <= 0) goto Ld
            monitor-exit(r0)
            return
        Ld:
            i1.a r1 = i1.a.d(r2)     // Catch: java.lang.Throwable -> L16
            m(r2, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    private static synchronized void m(android.content.Context r2, com.huawei.agconnect.e r3) {
            java.lang.Class<com.huawei.agconnect.core.a.b> r0 = com.huawei.agconnect.core.a.b.class
            monitor-enter(r0)
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r2 = r1
        Lf:
            q()     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.config.impl.c.o(r2)     // Catch: java.lang.Throwable -> L25
            java.util.List<com.huawei.agconnect.core.b> r1 = com.huawei.agconnect.core.a.b.d     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            com.huawei.agconnect.core.a.c r1 = new com.huawei.agconnect.core.a.c     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            java.util.List r2 = r1.b()     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.core.a.b.d = r2     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r2 = move-exception
            goto L3d
        L27:
            r2 = 1
            j(r3, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r3.getIdentifier()     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.core.a.b.g = r2     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.b r2 = r3.c()     // Catch: java.lang.Throwable -> L25
            r2.a()     // Catch: java.lang.Throwable -> L25
            com.huawei.agconnect.core.a.a.c()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public static synchronized void n(android.content.Context r1, com.huawei.agconnect.f r2) {
            java.lang.Class<com.huawei.agconnect.core.a.b> r0 = com.huawei.agconnect.core.a.b.class
            monitor-enter(r0)
            r(r1, r2)     // Catch: java.lang.Throwable -> Lf
            com.huawei.agconnect.e r2 = r2.a(r1)     // Catch: java.lang.Throwable -> Lf
            m(r1, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private static void q() {
            com.huawei.agconnect.core.a.b$a r0 = new com.huawei.agconnect.core.a.b$a
            r0.<init>()
            java.lang.String r1 = "/agcgw/url"
            com.huawei.agconnect.i.b(r1, r0)
            com.huawei.agconnect.core.a.b$b r0 = new com.huawei.agconnect.core.a.b$b
            r0.<init>()
            java.lang.String r1 = "/agcgw/backurl"
            com.huawei.agconnect.i.b(r1, r0)
            return
    }

    private static void r(android.content.Context r3, com.huawei.agconnect.f r4) {
            java.lang.String r0 = "UTF-8"
            i1.a r3 = i1.a.d(r3)
            java.io.InputStream r1 = r4.d()
            if (r1 == 0) goto L2b
            java.io.InputStream r1 = r4.d()     // Catch: java.io.IOException -> L2b
            java.lang.String r1 = com.huawei.agconnect.config.impl.b.g(r1, r0)     // Catch: java.io.IOException -> L2b
            java.io.InputStream r2 = r4.d()     // Catch: java.io.IOException -> L2b
            r2.reset()     // Catch: java.io.IOException -> L2b
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L2b
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.io.IOException -> L2b
            byte[] r0 = r1.getBytes(r0)     // Catch: java.io.IOException -> L2b
            r2.<init>(r0)     // Catch: java.io.IOException -> L2b
            r3.g(r2)     // Catch: java.io.IOException -> L2b
        L2b:
            java.util.Map r0 = r4.c()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r3.h(r2, r1)
            goto L37
        L53:
            com.huawei.agconnect.b r0 = r4.e()
            com.huawei.agconnect.b r1 = com.huawei.agconnect.b.b
            if (r0 == r1) goto L62
            com.huawei.agconnect.b r4 = r4.e()
            r3.i(r4)
        L62:
            return
    }

    @Override // com.huawei.agconnect.d
    public com.huawei.agconnect.e d() {
            r1 = this;
            com.huawei.agconnect.e r0 = r1.a
            return r0
    }

    @Override // com.huawei.agconnect.d
    public <T> T e(java.lang.Class<? super T> r2) {
            r1 = this;
            com.huawei.agconnect.core.a.d r0 = r1.c
            java.lang.Object r0 = r0.b(r1, r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            com.huawei.agconnect.core.a.d r0 = r1.b
            java.lang.Object r2 = r0.b(r1, r2)
            return r2
    }

    @Override // com.huawei.agconnect.d
    public android.content.Context getContext() {
            r1 = this;
            com.huawei.agconnect.e r0 = r1.a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // com.huawei.agconnect.d
    public java.lang.String getIdentifier() {
            r1 = this;
            com.huawei.agconnect.e r0 = r1.a
            java.lang.String r0 = r0.getIdentifier()
            return r0
    }

    public void o(com.huawei.agconnect.g r3) {
            r2 = this;
            com.huawei.agconnect.core.a.b$d r0 = new com.huawei.agconnect.core.a.b$d
            r0.<init>(r2, r3)
            java.lang.Class<k1.a> r3 = k1.a.class
            com.huawei.agconnect.core.b$b r3 = com.huawei.agconnect.core.b.e(r3, r0)
            com.huawei.agconnect.core.b r3 = r3.a()
            com.huawei.agconnect.core.a.d r0 = r2.c
            java.util.List r3 = java.util.Collections.singletonList(r3)
            com.huawei.agconnect.e r1 = r2.a
            android.content.Context r1 = r1.getContext()
            r0.e(r3, r1)
            return
    }

    public void p(com.huawei.agconnect.h r3) {
            r2 = this;
            com.huawei.agconnect.core.a.b$c r0 = new com.huawei.agconnect.core.a.b$c
            r0.<init>(r2, r3)
            java.lang.Class<k1.b> r3 = k1.b.class
            com.huawei.agconnect.core.b$b r3 = com.huawei.agconnect.core.b.e(r3, r0)
            com.huawei.agconnect.core.b r3 = r3.a()
            com.huawei.agconnect.core.a.d r0 = r2.c
            java.util.List r3 = java.util.Collections.singletonList(r3)
            com.huawei.agconnect.e r1 = r2.a
            android.content.Context r1 = r1.getContext()
            r0.e(r3, r1)
            return
    }
}
