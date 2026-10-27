package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class f {
    private final java.util.Set<java.lang.Class<?>> a;

    public f() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a = r0
            return
    }

    private java.util.List<org.junit.runner.g> f(java.lang.Class<?>[] r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            r3 = r5[r2]
            org.junit.runner.g r3 = r4.g(r3)
            if (r3 == 0) goto L14
            r0.add(r3)
        L14:
            int r2 = r2 + 1
            goto L7
        L17:
            return r0
    }

    java.lang.Class<?> a(java.lang.Class<?> r4) throws org.junit.runners.model.InitializationError {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.a
            boolean r0 = r0.add(r4)
            if (r0 == 0) goto L9
            return r4
        L9:
            org.junit.runners.model.InitializationError r0 = new org.junit.runners.model.InitializationError
            java.lang.String r4 = r4.getName()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "class '%s' (possibly indirectly) contains itself as a SuiteClass"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    void b(java.lang.Class<?> r2) {
            r1 = this;
            java.util.Set<java.lang.Class<?>> r0 = r1.a
            r0.remove(r2)
            return
    }

    public abstract org.junit.runner.g c(java.lang.Class<?> r1) throws java.lang.Throwable;

    public java.util.List<org.junit.runner.g> d(java.lang.Class<?> r2, java.util.List<java.lang.Class<?>> r3) throws org.junit.runners.model.InitializationError {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.util.List r2 = r1.e(r2, r3)
            return r2
    }

    public java.util.List<org.junit.runner.g> e(java.lang.Class<?> r1, java.lang.Class<?>[] r2) throws org.junit.runners.model.InitializationError {
            r0 = this;
            r0.a(r1)
            java.util.List r2 = r0.f(r2)     // Catch: java.lang.Throwable -> Lb
            r0.b(r1)
            return r2
        Lb:
            r2 = move-exception
            r0.b(r1)
            throw r2
    }

    public org.junit.runner.g g(java.lang.Class<?> r3) {
            r2 = this;
            org.junit.runner.g r3 = r2.c(r3)     // Catch: java.lang.Throwable -> L5
            return r3
        L5:
            r0 = move-exception
            org.junit.internal.runners.b r1 = new org.junit.internal.runners.b
            r1.<init>(r3, r0)
            return r1
    }
}
