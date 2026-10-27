package org.junit.experimental.categories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class a implements org.junit.runner.FilterFactory {
    a() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List<java.lang.Class<?>> c(java.lang.String r5) throws java.lang.ClassNotFoundException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            java.lang.Class r3 = org.junit.internal.a.a(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1b:
            return r0
    }

    @Override // org.junit.runner.FilterFactory
    public org.junit.runner.manipulation.a a(org.junit.runner.d r2) throws org.junit.runner.FilterFactory.FilterNotCreatedException {
            r1 = this;
            java.lang.String r2 = r2.a()     // Catch: java.lang.ClassNotFoundException -> Ld
            java.util.List r2 = r1.c(r2)     // Catch: java.lang.ClassNotFoundException -> Ld
            org.junit.runner.manipulation.a r2 = r1.b(r2)     // Catch: java.lang.ClassNotFoundException -> Ld
            return r2
        Ld:
            r2 = move-exception
            org.junit.runner.FilterFactory$FilterNotCreatedException r0 = new org.junit.runner.FilterFactory$FilterNotCreatedException
            r0.<init>(r2)
            throw r0
    }

    protected abstract org.junit.runner.manipulation.a b(java.util.List<java.lang.Class<?>> r1);
}
