package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d1 {
    static java.util.Map<java.lang.String, com.huawei.hms.hatool.k0> b;
    private static com.huawei.hms.hatool.d1 c;
    private com.huawei.hms.hatool.u a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.hatool.d1.b = r0
            return
    }

    private d1() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.hatool.u r0 = new com.huawei.hms.hatool.u
            r0.<init>()
            r1.a = r0
            return
    }

    public static com.huawei.hms.hatool.d1 e() {
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.c
            if (r0 != 0) goto L7
            f()
        L7:
            com.huawei.hms.hatool.d1 r0 = com.huawei.hms.hatool.d1.c
            return r0
    }

    private static synchronized void f() {
            java.lang.Class<com.huawei.hms.hatool.d1> r0 = com.huawei.hms.hatool.d1.class
            monitor-enter(r0)
            com.huawei.hms.hatool.d1 r1 = com.huawei.hms.hatool.d1.c     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.d1 r1 = new com.huawei.hms.hatool.d1     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.d1.c = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public com.huawei.hms.hatool.k0 a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.huawei.hms.hatool.k0> r0 = com.huawei.hms.hatool.d1.b
            java.lang.Object r2 = r0.get(r2)
            com.huawei.hms.hatool.k0 r2 = (com.huawei.hms.hatool.k0) r2
            return r2
    }

    public java.util.Set<java.lang.String> b() {
            r1 = this;
            java.util.Map<java.lang.String, com.huawei.hms.hatool.k0> r0 = com.huawei.hms.hatool.d1.b
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public void c(java.lang.String r2, com.huawei.hms.hatool.k0 r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.huawei.hms.hatool.k0> r0 = com.huawei.hms.hatool.d1.b
            r0.put(r2, r3)
            return
    }

    public com.huawei.hms.hatool.u d() {
            r1 = this;
            com.huawei.hms.hatool.u r0 = r1.a
            return r0
    }
}
