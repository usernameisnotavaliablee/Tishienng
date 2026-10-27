package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.junit.runner.g {
    private final java.util.List<java.lang.Throwable> a;
    private final java.lang.Class<?> b;

    public b(java.lang.Class<?> r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Le
            r0.b = r1
            java.util.List r1 = r0.f(r2)
            r0.a = r1
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Test class cannot be null"
            r1.<init>(r2)
            throw r1
    }

    private org.junit.runner.Description e(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Class<?> r2 = r1.b
            java.lang.String r0 = "initializationError"
            org.junit.runner.Description r2 = org.junit.runner.Description.createTestDescription(r2, r0)
            return r2
    }

    private java.util.List<java.lang.Throwable> f(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Ld
            java.lang.Throwable r3 = r3.getCause()
            java.util.List r3 = r2.f(r3)
            return r3
        Ld:
            boolean r0 = r3 instanceof org.junit.runners.model.InitializationError
            if (r0 == 0) goto L18
            org.junit.runners.model.InitializationError r3 = (org.junit.runners.model.InitializationError) r3
            java.util.List r3 = r3.getCauses()
            return r3
        L18:
            boolean r0 = r3 instanceof org.junit.internal.runners.InitializationError
            if (r0 == 0) goto L23
            org.junit.internal.runners.InitializationError r3 = (org.junit.internal.runners.InitializationError) r3
            java.util.List r3 = r3.getCauses()
            return r3
        L23:
            r0 = 1
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            return r3
    }

    private void g(java.lang.Throwable r3, org.junit.runner.notification.a r4) {
            r2 = this;
            org.junit.runner.Description r0 = r2.e(r3)
            r4.l(r0)
            org.junit.runner.notification.Failure r1 = new org.junit.runner.notification.Failure
            r1.<init>(r0, r3)
            r4.f(r1)
            r4.h(r0)
            return
    }

    @Override // org.junit.runner.g
    public void a(org.junit.runner.notification.a r3) {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2.g(r1, r3)
            goto L6
        L16:
            return
    }

    @Override // org.junit.runner.g, org.junit.runner.b
    public org.junit.runner.Description getDescription() {
            r3 = this;
            java.lang.Class<?> r0 = r3.b
            org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0)
            java.util.List<java.lang.Throwable> r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            org.junit.runner.Description r2 = r3.e(r2)
            r0.addChild(r2)
            goto Lc
        L20:
            return r0
    }
}
