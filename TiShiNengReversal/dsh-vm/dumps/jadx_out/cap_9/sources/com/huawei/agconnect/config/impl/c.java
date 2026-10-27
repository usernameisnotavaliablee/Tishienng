package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c extends com.huawei.agconnect.c {
    private static final java.util.Map<java.lang.String, com.huawei.agconnect.c> b = null;
    private static final java.lang.Object c = null;
    private static java.lang.String d;
    private i1.a a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.agconnect.config.impl.c.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.agconnect.config.impl.c.c = r0
            return
    }

    private c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            i1.a r1 = i1.a.e(r1, r2)
            r0.a = r1
            return
    }

    public static com.huawei.agconnect.c n() {
            java.lang.String r0 = com.huawei.agconnect.config.impl.c.d
            com.huawei.agconnect.c r0 = q(r0)
            return r0
    }

    public static com.huawei.agconnect.c o(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r0
        Lc:
            java.lang.String r0 = r1.getPackageName()
            com.huawei.agconnect.config.impl.c.d = r0
            com.huawei.agconnect.c r1 = p(r1, r0)
            return r1
    }

    public static com.huawei.agconnect.c p(android.content.Context r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L22
            java.lang.Object r0 = com.huawei.agconnect.config.impl.c.c
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.agconnect.c> r1 = com.huawei.agconnect.config.impl.c.b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L1c
            com.huawei.agconnect.c r2 = (com.huawei.agconnect.c) r2     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1e
            com.huawei.agconnect.config.impl.c r3 = new com.huawei.agconnect.config.impl.c     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1c
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r2
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "packageName can not be empty"
            r4.<init>(r5)
            throw r4
    }

    public static com.huawei.agconnect.c q(java.lang.String r2) {
            java.lang.Object r0 = com.huawei.agconnect.config.impl.c.c
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.agconnect.c> r1 = com.huawei.agconnect.config.impl.c.b     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            com.huawei.agconnect.c r2 = (com.huawei.agconnect.c) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            goto L19
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "you should call AGConnectApp.initialize first"
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // com.huawei.agconnect.c
    public void e(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/api_key"
            r0.h(r1, r3)
            return
    }

    @Override // com.huawei.agconnect.c
    public void f(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/app_id"
            r0.h(r1, r3)
            return
    }

    @Override // com.huawei.agconnect.c
    public void g(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/client_id"
            r0.h(r1, r3)
            return
    }

    @Override // com.huawei.agconnect.c
    public void h(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/client_secret"
            r0.h(r1, r3)
            return
    }

    @Override // com.huawei.agconnect.c
    public void i(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/cp_id"
            r0.h(r1, r3)
            return
    }

    @Override // com.huawei.agconnect.c
    public void j(com.huawei.agconnect.g r2) {
            r1 = this;
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            com.huawei.agconnect.core.a.b r0 = (com.huawei.agconnect.core.a.b) r0
            r0.o(r2)
            return
    }

    @Override // com.huawei.agconnect.c
    public void k(com.huawei.agconnect.h r2) {
            r1 = this;
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            com.huawei.agconnect.core.a.b r0 = (com.huawei.agconnect.core.a.b) r0
            r0.p(r2)
            return
    }

    @Override // com.huawei.agconnect.c
    public void l(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            i1.a r0 = r1.a
            r0.h(r2, r3)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "path can not be empty"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.huawei.agconnect.c
    public void m(java.lang.String r3) {
            r2 = this;
            i1.a r0 = r2.a
            java.lang.String r1 = "/client/product_id"
            r0.h(r1, r3)
            return
    }
}
