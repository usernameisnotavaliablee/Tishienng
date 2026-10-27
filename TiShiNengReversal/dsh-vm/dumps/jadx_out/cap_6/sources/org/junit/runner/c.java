package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c {
    c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.junit.runner.manipulation.a a(java.lang.Class<? extends org.junit.runner.FilterFactory> r0, org.junit.runner.d r1) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            org.junit.runner.FilterFactory r0 = c(r0)
            org.junit.runner.manipulation.a r0 = r0.a(r1)
            return r0
    }

    public static org.junit.runner.manipulation.a b(java.lang.String r0, org.junit.runner.d r1) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            org.junit.runner.FilterFactory r0 = d(r0)
            org.junit.runner.manipulation.a r0 = r0.a(r1)
            return r0
    }

    static org.junit.runner.FilterFactory c(java.lang.Class<? extends org.junit.runner.FilterFactory> r1) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            r0 = 0
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> Lc
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Exception -> Lc
            org.junit.runner.FilterFactory r1 = (org.junit.runner.FilterFactory) r1     // Catch: java.lang.Exception -> Lc
            return r1
        Lc:
            r1 = move-exception
            org.junit.runner.FilterFactory$FilterNotCreatedException r0 = new org.junit.runner.FilterFactory$FilterNotCreatedException
            r0.<init>(r1)
            throw r0
    }

    static org.junit.runner.FilterFactory d(java.lang.String r1) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            java.lang.Class r1 = org.junit.internal.a.a(r1)     // Catch: java.lang.Exception -> Lf
            java.lang.Class<org.junit.runner.FilterFactory> r0 = org.junit.runner.FilterFactory.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch: java.lang.Exception -> Lf
            org.junit.runner.FilterFactory r1 = c(r1)
            return r1
        Lf:
            r1 = move-exception
            org.junit.runner.FilterFactory$FilterNotCreatedException r0 = new org.junit.runner.FilterFactory$FilterNotCreatedException
            r0.<init>(r1)
            throw r0
    }

    public static org.junit.runner.manipulation.a e(org.junit.runner.f r5, java.lang.String r6) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            org.junit.runner.g r5 = r5.h()
            org.junit.runner.Description r5 = r5.getDescription()
            java.lang.String r0 = "="
            boolean r1 = r6.contains(r0)
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.String[] r6 = r6.split(r0, r4)
            goto L21
        L18:
            java.lang.String[] r0 = new java.lang.String[r4]
            r0[r3] = r6
            java.lang.String r6 = ""
            r0[r2] = r6
            r6 = r0
        L21:
            r0 = r6[r3]
            org.junit.runner.d r1 = new org.junit.runner.d
            r6 = r6[r2]
            r1.<init>(r5, r6)
            org.junit.runner.manipulation.a r5 = b(r0, r1)
            return r5
    }
}
