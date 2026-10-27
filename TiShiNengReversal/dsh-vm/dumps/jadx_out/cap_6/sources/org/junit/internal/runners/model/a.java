package org.junit.internal.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private final org.junit.runner.notification.a a;
    private final org.junit.runner.Description b;

    public a(org.junit.runner.notification.a r1, org.junit.runner.Description r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private void c(org.junit.runners.model.MultipleFailureException r2) {
            r1 = this;
            java.util.List r2 = r2.getFailures()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.b(r0)
            goto L8
        L18:
            return
    }

    public void a(org.junit.internal.AssumptionViolatedException r4) {
            r3 = this;
            org.junit.runner.notification.a r0 = r3.a
            org.junit.runner.notification.Failure r1 = new org.junit.runner.notification.Failure
            org.junit.runner.Description r2 = r3.b
            r1.<init>(r2, r4)
            r0.e(r1)
            return
    }

    public void b(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.junit.runners.model.MultipleFailureException
            if (r0 == 0) goto La
            org.junit.runners.model.MultipleFailureException r4 = (org.junit.runners.model.MultipleFailureException) r4
            r3.c(r4)
            return
        La:
            org.junit.runner.notification.a r0 = r3.a
            org.junit.runner.notification.Failure r1 = new org.junit.runner.notification.Failure
            org.junit.runner.Description r2 = r3.b
            r1.<init>(r2, r4)
            r0.f(r1)
            return
    }

    public void d() {
            r2 = this;
            org.junit.runner.notification.a r0 = r2.a
            org.junit.runner.Description r1 = r2.b
            r0.h(r1)
            return
    }

    public void e() {
            r2 = this;
            org.junit.runner.notification.a r0 = r2.a
            org.junit.runner.Description r1 = r2.b
            r0.i(r1)
            return
    }

    public void f() {
            r2 = this;
            org.junit.runner.notification.a r0 = r2.a
            org.junit.runner.Description r1 = r2.b
            r0.l(r1)
            return
    }
}
