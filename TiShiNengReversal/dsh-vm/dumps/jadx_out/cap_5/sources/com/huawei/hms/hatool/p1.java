package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p1 {
    private static com.huawei.hms.hatool.p1 b;
    private volatile java.util.Map<java.lang.String, com.huawei.hms.hatool.v0> a;

    private p1() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    private com.huawei.hms.hatool.v0 a(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.huawei.hms.hatool.v0> r0 = r2.a
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L12
            com.huawei.hms.hatool.v0 r0 = new com.huawei.hms.hatool.v0
            r0.<init>()
            java.util.Map<java.lang.String, com.huawei.hms.hatool.v0> r1 = r2.a
            r1.put(r3, r0)
        L12:
            java.util.Map<java.lang.String, com.huawei.hms.hatool.v0> r0 = r2.a
            java.lang.Object r3 = r0.get(r3)
            com.huawei.hms.hatool.v0 r3 = (com.huawei.hms.hatool.v0) r3
            return r3
    }

    public static com.huawei.hms.hatool.p1 c() {
            com.huawei.hms.hatool.p1 r0 = com.huawei.hms.hatool.p1.b
            if (r0 != 0) goto L7
            d()
        L7:
            com.huawei.hms.hatool.p1 r0 = com.huawei.hms.hatool.p1.b
            return r0
    }

    private static synchronized void d() {
            java.lang.Class<com.huawei.hms.hatool.p1> r0 = com.huawei.hms.hatool.p1.class
            monitor-enter(r0)
            com.huawei.hms.hatool.p1 r1 = com.huawei.hms.hatool.p1.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.p1 r1 = new com.huawei.hms.hatool.p1     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.p1.b = r1     // Catch: java.lang.Throwable -> Lf
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

    public com.huawei.hms.hatool.v0 b(java.lang.String r1, long r2) {
            r0 = this;
            com.huawei.hms.hatool.v0 r1 = r0.a(r1)
            r1.b(r2)
            return r1
    }
}
