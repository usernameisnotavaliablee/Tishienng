package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private org.junit.runner.notification.a a;
    private org.junit.internal.runners.i b;
    private org.junit.runner.Description c;
    private final java.lang.Runnable d;

    public a(org.junit.runner.notification.a r1, org.junit.internal.runners.i r2, org.junit.runner.Description r3, java.lang.Runnable r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private void b() {
            r3 = this;
            org.junit.internal.runners.i r0 = r3.b
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 0
            r1.invoke(r2, r2)     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L20
            goto La
        L1b:
            r1 = move-exception
            r3.a(r1)
            goto La
        L20:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getTargetException()
            r3.a(r1)
            goto La
        L29:
            return
    }

    private void c() throws org.junit.internal.runners.c {
            r3 = this;
            org.junit.internal.runners.i r0 = r3.b     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            r2 = 0
            r1.invoke(r2, r2)     // Catch: java.lang.Throwable -> L1b java.lang.reflect.InvocationTargetException -> L1d org.junit.internal.AssumptionViolatedException -> L2e
            goto La
        L1b:
            r0 = move-exception
            goto L25
        L1d:
            r0 = move-exception
            goto L20
        L1f:
            return
        L20:
            java.lang.Throwable r0 = r0.getTargetException()     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L2e
            throw r0     // Catch: java.lang.Throwable -> L1b org.junit.internal.AssumptionViolatedException -> L2e
        L25:
            r3.a(r0)
            org.junit.internal.runners.c r0 = new org.junit.internal.runners.c
            r0.<init>()
            throw r0
        L2e:
            org.junit.internal.runners.c r0 = new org.junit.internal.runners.c
            r0.<init>()
            throw r0
    }

    protected void a(java.lang.Throwable r4) {
            r3 = this;
            org.junit.runner.notification.a r0 = r3.a
            org.junit.runner.notification.Failure r1 = new org.junit.runner.notification.Failure
            org.junit.runner.Description r2 = r3.c
            r1.<init>(r2, r4)
            r0.f(r1)
            return
    }

    public void d() {
            r1 = this;
            r1.c()     // Catch: java.lang.Throwable -> La org.junit.internal.runners.c -> Lf
            r1.e()     // Catch: java.lang.Throwable -> La org.junit.internal.runners.c -> Lf
            r1.b()
            return
        La:
            r0 = move-exception
            r1.b()
            throw r0
        Lf:
            r1.b()
            return
    }

    protected void e() {
            r1 = this;
            java.lang.Runnable r0 = r1.d
            r0.run()
            return
    }
}
