package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.apache.commons.net.telnet.d {
    private java.io.InputStream V;
    private java.io.OutputStream W;
    protected boolean X;
    private org.apache.commons.net.telnet.g Y;

    public e() {
            r1 = this;
            java.lang.String r0 = "VT100"
            r1.<init>(r0)
            r0 = 1
            r1.X = r0
            r0 = 0
            r1.V = r0
            r1.W = r0
            return
    }

    public e(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.X = r1
            r1 = 0
            r0.V = r1
            r0.W = r1
            return
    }

    @Override // org.apache.commons.net.telnet.d
    public void N0(org.apache.commons.net.telnet.k r1) throws org.apache.commons.net.telnet.InvalidTelnetOptionException, java.io.IOException {
            r0 = this;
            super.N0(r1)
            return
    }

    @Override // org.apache.commons.net.telnet.d
    public void O0(int r1) throws org.apache.commons.net.telnet.InvalidTelnetOptionException, java.io.IOException {
            r0 = this;
            super.O0(r1)
            return
    }

    @Override // org.apache.commons.net.telnet.d
    public void P0(org.apache.commons.net.telnet.i r1) {
            r0 = this;
            super.P0(r1)
            return
    }

    @Override // org.apache.commons.net.telnet.d
    public void Q0() {
            r0 = this;
            super.Q0()
            return
    }

    void R0() throws java.io.IOException {
            r2 = this;
            r0 = 0
            java.io.OutputStream r1 = r2.i     // Catch: java.lang.Throwable -> L9
            r1.close()     // Catch: java.lang.Throwable -> L9
            r2.i = r0
            return
        L9:
            r1 = move-exception
            r2.i = r0
            throw r1
    }

    void S0() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.i
            r0.flush()
            return
    }

    public java.io.InputStream T0() {
            r1 = this;
            java.io.InputStream r0 = r1.V
            return r0
    }

    public boolean U0(int r2) {
            r1 = this;
            boolean r0 = r1.K0(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.n0(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public java.io.OutputStream V0() {
            r1 = this;
            java.io.OutputStream r0 = r1.W
            return r0
    }

    public boolean W0() {
            r1 = this;
            boolean r0 = r1.X
            return r0
    }

    public boolean X0(int r2) {
            r1 = this;
            boolean r0 = r1.I0(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.l0(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    void Y0() {
            r1 = this;
            monitor-enter(r1)
            org.apache.commons.net.telnet.g r0 = r1.Y     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L9
            r0.a()
        L9:
            return
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public synchronized void Z0(org.apache.commons.net.telnet.g r1) {
            r0 = this;
            monitor-enter(r0)
            r0.Y = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public void a1(java.io.OutputStream r1) {
            r0 = this;
            super.g0(r1)
            return
    }

    @Override // org.apache.commons.net.telnet.d, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r3 = this;
            super.b()
            org.apache.commons.net.telnet.h r0 = new org.apache.commons.net.telnet.h
            java.io.InputStream r1 = r3.h
            boolean r2 = r3.X
            r0.<init>(r1, r3, r2)
            boolean r1 = r3.X
            if (r1 == 0) goto L13
            r0.c()
        L13:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r0)
            r3.V = r1
            org.apache.commons.net.telnet.l r0 = new org.apache.commons.net.telnet.l
            r0.<init>(r3)
            r3.W = r0
            return
    }

    public boolean b1(long r1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.InterruptedException {
            r0 = this;
            boolean r1 = r0.p0(r1)
            return r1
    }

    public void c1(byte r1) throws java.io.IOException, java.lang.IllegalArgumentException {
            r0 = this;
            r0.r0(r1)
            return
    }

    public void d1(int[] r3) throws java.io.IOException, java.lang.IllegalArgumentException {
            r2 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 < r1) goto L8
            r2.u0(r3)
            return
        L8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "zero length message"
            r3.<init>(r0)
            throw r3
    }

    public void e1(boolean r1) {
            r0 = this;
            r0.X = r1
            return
    }

    public void f1() {
            r0 = this;
            super.M0()
            return
    }

    public synchronized void g1() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.Y = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r2 = this;
            r0 = 0
            java.io.InputStream r1 = r2.V     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            r1.close()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r1 = move-exception
            goto L1a
        Lb:
            java.io.OutputStream r1 = r2.W     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L12
            r1.close()     // Catch: java.lang.Throwable -> L9
        L12:
            r2.W = r0
            r2.V = r0
            super.n()
            return
        L1a:
            r2.W = r0
            r2.V = r0
            super.n()
            throw r1
    }
}
