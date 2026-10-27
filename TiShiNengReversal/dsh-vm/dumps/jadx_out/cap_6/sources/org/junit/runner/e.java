package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private final org.junit.runner.notification.a a;

    public e() {
            r1 = this;
            r1.<init>()
            org.junit.runner.notification.a r0 = new org.junit.runner.notification.a
            r0.<init>()
            r1.a = r0
            return
    }

    static org.junit.runner.a b() {
            org.junit.runner.a r0 = new org.junit.runner.a
            r0.<init>()
            return r0
    }

    public static void d(java.lang.String... r2) {
            org.junit.runner.e r0 = new org.junit.runner.e
            r0.<init>()
            org.junit.internal.g r1 = new org.junit.internal.g
            r1.<init>()
            org.junit.runner.Result r2 = r0.m(r1, r2)
            boolean r2 = r2.wasSuccessful()
            r2 = r2 ^ 1
            java.lang.System.exit(r2)
            return
    }

    public static org.junit.runner.Result k(org.junit.runner.a r1, java.lang.Class<?>... r2) {
            org.junit.runner.e r0 = new org.junit.runner.e
            r0.<init>()
            org.junit.runner.Result r1 = r0.g(r1, r2)
            return r1
    }

    public static org.junit.runner.Result l(java.lang.Class<?>... r1) {
            org.junit.runner.a r0 = b()
            org.junit.runner.Result r1 = k(r0, r1)
            return r1
    }

    public void a(org.junit.runner.notification.RunListener r2) {
            r1 = this;
            org.junit.runner.notification.a r0 = r1.a
            r0.d(r2)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = junit.runner.c.a()
            return r0
    }

    public void e(org.junit.runner.notification.RunListener r2) {
            r1 = this;
            org.junit.runner.notification.a r0 = r1.a
            r0.n(r2)
            return
    }

    public org.junit.runner.Result f(junit.framework.f r2) {
            r1 = this;
            org.junit.internal.runners.d r0 = new org.junit.internal.runners.d
            r0.<init>(r2)
            org.junit.runner.Result r2 = r1.i(r0)
            return r2
    }

    public org.junit.runner.Result g(org.junit.runner.a r1, java.lang.Class<?>... r2) {
            r0 = this;
            org.junit.runner.f r1 = org.junit.runner.f.c(r1, r2)
            org.junit.runner.Result r1 = r0.h(r1)
            return r1
    }

    public org.junit.runner.Result h(org.junit.runner.f r1) {
            r0 = this;
            org.junit.runner.g r1 = r1.h()
            org.junit.runner.Result r1 = r0.i(r1)
            return r1
    }

    public org.junit.runner.Result i(org.junit.runner.g r5) {
            r4 = this;
            org.junit.runner.Result r0 = new org.junit.runner.Result
            r0.<init>()
            org.junit.runner.notification.RunListener r1 = r0.createListener()
            org.junit.runner.notification.a r2 = r4.a
            r2.c(r1)
            org.junit.runner.notification.a r2 = r4.a     // Catch: java.lang.Throwable -> L25
            org.junit.runner.Description r3 = r5.getDescription()     // Catch: java.lang.Throwable -> L25
            r2.k(r3)     // Catch: java.lang.Throwable -> L25
            org.junit.runner.notification.a r2 = r4.a     // Catch: java.lang.Throwable -> L25
            r5.a(r2)     // Catch: java.lang.Throwable -> L25
            org.junit.runner.notification.a r5 = r4.a     // Catch: java.lang.Throwable -> L25
            r5.j(r0)     // Catch: java.lang.Throwable -> L25
            r4.e(r1)
            return r0
        L25:
            r5 = move-exception
            r4.e(r1)
            throw r5
    }

    public org.junit.runner.Result j(java.lang.Class<?>... r2) {
            r1 = this;
            org.junit.runner.a r0 = b()
            org.junit.runner.Result r2 = r1.g(r0, r2)
            return r2
    }

    org.junit.runner.Result m(org.junit.internal.e r2, java.lang.String... r3) {
            r1 = this;
            java.io.PrintStream r0 = r2.b()
            junit.runner.c.a()
            r0.getClass()
            org.junit.runner.JUnitCommandLineParseResult r3 = org.junit.runner.JUnitCommandLineParseResult.g(r3)
            org.junit.internal.h r0 = new org.junit.internal.h
            r0.<init>(r2)
            r1.a(r0)
            org.junit.runner.a r2 = b()
            org.junit.runner.f r2 = r3.c(r2)
            org.junit.runner.Result r2 = r1.h(r2)
            return r2
    }
}
