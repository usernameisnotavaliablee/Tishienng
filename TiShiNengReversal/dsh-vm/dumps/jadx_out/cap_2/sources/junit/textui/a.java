package junit.textui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a implements junit.framework.i {
    java.io.PrintStream a;
    int b;

    public a(java.io.PrintStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.a = r2
            return
    }

    @Override // junit.framework.i
    public void a(junit.framework.f r1, java.lang.Throwable r2) {
            r0 = this;
            java.io.PrintStream r1 = r0.f()
            r1.getClass()
            return
    }

    @Override // junit.framework.i
    public void b(junit.framework.f r1, junit.framework.AssertionFailedError r2) {
            r0 = this;
            java.io.PrintStream r1 = r0.f()
            r1.getClass()
            return
    }

    @Override // junit.framework.i
    public void c(junit.framework.f r1) {
            r0 = this;
            return
    }

    @Override // junit.framework.i
    public void d(junit.framework.f r2) {
            r1 = this;
            java.io.PrintStream r2 = r1.f()
            r2.getClass()
            int r2 = r1.b
            int r0 = r2 + 1
            r1.b = r0
            r0 = 40
            if (r2 < r0) goto L1b
            java.io.PrintStream r2 = r1.f()
            r2.getClass()
            r2 = 0
            r1.b = r2
        L1b:
            return
    }

    protected java.lang.String e(long r4) {
            r3 = this;
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance()
            double r4 = (double) r4
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r1
            java.lang.String r4 = r0.format(r4)
            return r4
    }

    public java.io.PrintStream f() {
            r1 = this;
            java.io.PrintStream r0 = r1.a
            return r0
    }

    synchronized void g(junit.framework.j r1, long r2) {
            r0 = this;
            monitor-enter(r0)
            r0.o(r2)     // Catch: java.lang.Throwable -> Lf
            r0.l(r1)     // Catch: java.lang.Throwable -> Lf
            r0.m(r1)     // Catch: java.lang.Throwable -> Lf
            r0.n(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void h(junit.framework.h r1, int r2) {
            r0 = this;
            r0.i(r1, r2)
            r0.j(r1)
            return
    }

    protected void i(junit.framework.h r1, int r2) {
            r0 = this;
            java.io.PrintStream r2 = r0.f()
            junit.framework.f r1 = r1.b()
            java.util.Objects.toString(r1)
            r2.getClass()
            return
    }

    protected void j(junit.framework.h r2) {
            r1 = this;
            java.io.PrintStream r0 = r1.f()
            java.lang.String r2 = r2.e()
            junit.runner.a.i(r2)
            r0.getClass()
            return
    }

    protected void k(java.util.Enumeration<junit.framework.h> r2, int r3, java.lang.String r4) {
            r1 = this;
            if (r3 != 0) goto L3
            goto L27
        L3:
            r4 = 1
            if (r3 != r4) goto Le
            java.io.PrintStream r3 = r1.f()
            r3.getClass()
            goto L15
        Le:
            java.io.PrintStream r3 = r1.f()
            r3.getClass()
        L15:
            r3 = 1
        L16:
            boolean r0 = r2.hasMoreElements()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.nextElement()
            junit.framework.h r0 = (junit.framework.h) r0
            r1.h(r0, r3)
            int r3 = r3 + r4
            goto L16
        L27:
            return
    }

    protected void l(junit.framework.j r3) {
            r2 = this;
            java.util.Enumeration r0 = r3.g()
            int r3 = r3.f()
            java.lang.String r1 = "error"
            r2.k(r0, r3, r1)
            return
    }

    protected void m(junit.framework.j r3) {
            r2 = this;
            java.util.Enumeration r0 = r3.i()
            int r3 = r3.h()
            java.lang.String r1 = "failure"
            r2.k(r0, r3, r1)
            return
    }

    protected void n(junit.framework.j r2) {
            r1 = this;
            boolean r0 = r2.q()
            if (r0 == 0) goto L22
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r2.l()
            r2.l()
            r0.getClass()
            goto L40
        L22:
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r2.l()
            r2.h()
            r2.f()
            r0.getClass()
        L40:
            java.io.PrintStream r2 = r1.f()
            r2.getClass()
            return
    }

    protected void o(long r2) {
            r1 = this;
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r1.e(r2)
            r0.getClass()
            return
    }

    void p() {
            r1 = this;
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            java.io.PrintStream r0 = r1.f()
            r0.getClass()
            return
    }
}
