package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends org.junit.runner.notification.RunListener {
    private final java.io.PrintStream a;

    public h(java.io.PrintStream r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public h(org.junit.internal.e r1) {
            r0 = this;
            java.io.PrintStream r1 = r1.b()
            r0.<init>(r1)
            return
    }

    private java.io.PrintStream i() {
            r1 = this;
            java.io.PrintStream r0 = r1.a
            return r0
    }

    @Override // org.junit.runner.notification.RunListener
    public void b(org.junit.runner.notification.Failure r2) {
            r1 = this;
            java.io.PrintStream r2 = r1.a
            r0 = 69
            r2.append(r0)
            return
    }

    @Override // org.junit.runner.notification.RunListener
    public void d(org.junit.runner.Description r2) {
            r1 = this;
            java.io.PrintStream r2 = r1.a
            r0 = 73
            r2.append(r0)
            return
    }

    @Override // org.junit.runner.notification.RunListener
    public void e(org.junit.runner.Result r3) {
            r2 = this;
            long r0 = r3.getRunTime()
            r2.m(r0)
            r2.k(r3)
            r2.l(r3)
            return
    }

    @Override // org.junit.runner.notification.RunListener
    public void g(org.junit.runner.Description r2) {
            r1 = this;
            java.io.PrintStream r2 = r1.a
            r0 = 46
            r2.append(r0)
            return
    }

    protected java.lang.String h(long r4) {
            r3 = this;
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance()
            double r4 = (double) r4
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r1
            java.lang.String r4 = r0.format(r4)
            return r4
    }

    protected void j(org.junit.runner.notification.Failure r1, java.lang.String r2) {
            r0 = this;
            java.io.PrintStream r2 = r0.i()
            r1.getTestHeader()
            r2.getClass()
            java.io.PrintStream r2 = r0.i()
            r1.getTrace()
            r2.getClass()
            return
    }

    protected void k(org.junit.runner.Result r5) {
            r4 = this;
            java.util.List r5 = r5.getFailures()
            int r0 = r5.size()
            if (r0 != 0) goto Lb
            goto L4f
        Lb:
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L1d
            java.io.PrintStream r0 = r4.i()
            r5.size()
            r0.getClass()
            goto L27
        L1d:
            java.io.PrintStream r0 = r4.i()
            r5.size()
            r0.getClass()
        L27:
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r5.next()
            org.junit.runner.notification.Failure r0 = (org.junit.runner.notification.Failure) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            int r3 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.j(r0, r1)
            r1 = r3
            goto L2b
        L4f:
            return
    }

    protected void l(org.junit.runner.Result r2) {
            r1 = this;
            boolean r0 = r2.wasSuccessful()
            if (r0 == 0) goto L22
            java.io.PrintStream r0 = r1.i()
            r0.getClass()
            java.io.PrintStream r0 = r1.i()
            r0.getClass()
            java.io.PrintStream r0 = r1.i()
            r2.getRunCount()
            r2.getRunCount()
            r0.getClass()
            goto L3d
        L22:
            java.io.PrintStream r0 = r1.i()
            r0.getClass()
            java.io.PrintStream r0 = r1.i()
            r0.getClass()
            java.io.PrintStream r0 = r1.i()
            r2.getRunCount()
            r2.getFailureCount()
            r0.getClass()
        L3d:
            java.io.PrintStream r2 = r1.i()
            r2.getClass()
            return
    }

    protected void m(long r2) {
            r1 = this;
            java.io.PrintStream r0 = r1.i()
            r0.getClass()
            java.io.PrintStream r0 = r1.i()
            r1.h(r2)
            r0.getClass()
            return
    }
}
