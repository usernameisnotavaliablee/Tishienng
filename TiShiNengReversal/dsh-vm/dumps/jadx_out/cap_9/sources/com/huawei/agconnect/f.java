package com.huawei.agconnect;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class f {
    private static final java.lang.String f = "/client/product_id";
    private static final java.lang.String g = "/client/app_id";
    private static final java.lang.String h = "/client/cp_id";
    private static final java.lang.String i = "/client/api_key";
    private static final java.lang.String j = "/client/client_id";
    private static final java.lang.String k = "/client/client_secret";
    private java.lang.String a;
    private com.huawei.agconnect.b b;
    private java.io.InputStream c;
    private final java.util.Map<java.lang.String, java.lang.String> d;
    private final java.util.List<com.huawei.agconnect.core.b> e;

    class a implements k1.b {
        final /* synthetic */ com.huawei.agconnect.h a;
        final /* synthetic */ com.huawei.agconnect.f b;

        a(com.huawei.agconnect.f r1, com.huawei.agconnect.h r2) {
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

    class b implements k1.a {
        final /* synthetic */ com.huawei.agconnect.g a;
        final /* synthetic */ com.huawei.agconnect.f b;

        b(com.huawei.agconnect.f r1, com.huawei.agconnect.g r2) {
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
                com.huawei.agconnect.g r0 = r1.a
                java.lang.String r0 = r0.getUid()
                return r0
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            com.huawei.agconnect.b r0 = com.huawei.agconnect.b.b
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            return
    }

    public com.huawei.agconnect.e a(android.content.Context r9) {
            r8 = this;
            com.huawei.agconnect.config.impl.d r0 = new com.huawei.agconnect.config.impl.d
            java.lang.String r2 = r8.a
            com.huawei.agconnect.b r3 = r8.b
            java.io.InputStream r4 = r8.c
            java.util.Map<java.lang.String, java.lang.String> r5 = r8.d
            java.util.List<com.huawei.agconnect.core.b> r6 = r8.e
            r7 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public com.huawei.agconnect.e b(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            com.huawei.agconnect.config.impl.d r0 = new com.huawei.agconnect.config.impl.d
            java.lang.String r2 = r8.a
            com.huawei.agconnect.b r3 = r8.b
            java.io.InputStream r4 = r8.c
            java.util.Map<java.lang.String, java.lang.String> r5 = r8.d
            java.util.List<com.huawei.agconnect.core.b> r6 = r8.e
            r1 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> c() {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.d
            r0.<init>(r1)
            return r0
    }

    public java.io.InputStream d() {
            r1 = this;
            java.io.InputStream r0 = r1.c
            return r0
    }

    public com.huawei.agconnect.b e() {
            r1 = this;
            com.huawei.agconnect.b r0 = r1.b
            return r0
    }

    public com.huawei.agconnect.f f(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/api_key"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f g(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/app_id"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f h(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/cp_id"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f i(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/client_id"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f j(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/client_secret"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f k(com.huawei.agconnect.g r2) {
            r1 = this;
            if (r2 == 0) goto L16
            com.huawei.agconnect.f$b r0 = new com.huawei.agconnect.f$b
            r0.<init>(r1, r2)
            java.lang.Class<k1.a> r2 = k1.a.class
            com.huawei.agconnect.core.b$b r2 = com.huawei.agconnect.core.b.e(r2, r0)
            com.huawei.agconnect.core.b r2 = r2.a()
            java.util.List<com.huawei.agconnect.core.b> r0 = r1.e
            r0.add(r2)
        L16:
            return r1
    }

    public com.huawei.agconnect.f l(com.huawei.agconnect.h r2) {
            r1 = this;
            if (r2 == 0) goto L16
            com.huawei.agconnect.f$a r0 = new com.huawei.agconnect.f$a
            r0.<init>(r1, r2)
            java.lang.Class<k1.b> r2 = k1.b.class
            com.huawei.agconnect.core.b$b r2 = com.huawei.agconnect.core.b.e(r2, r0)
            com.huawei.agconnect.core.b r2 = r2.a()
            java.util.List<com.huawei.agconnect.core.b> r0 = r1.e
            r0.add(r2)
        L16:
            return r1
    }

    public com.huawei.agconnect.f m(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.d
            r0.put(r2, r3)
            return r1
    }

    public com.huawei.agconnect.f n(java.io.InputStream r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.huawei.agconnect.f o(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.huawei.agconnect.f p(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.d
            java.lang.String r1 = "/client/product_id"
            r0.put(r1, r3)
            return r2
    }

    public com.huawei.agconnect.f q(com.huawei.agconnect.b r1) {
            r0 = this;
            r0.b = r1
            return r0
    }
}
