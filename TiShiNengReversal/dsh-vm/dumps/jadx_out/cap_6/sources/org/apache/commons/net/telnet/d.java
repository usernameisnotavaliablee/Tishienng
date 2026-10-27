package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class d extends org.apache.commons.net.g {
    static final boolean D = false;
    static final boolean E = false;
    static final byte[] F = null;
    static final byte[] G = null;
    static final byte[] H = null;
    static final byte[] I = null;
    static final byte[] J = null;
    static final byte[] K = null;
    static final int L = 1;
    static final int M = 2;
    static final int N = 4;
    static final int O = 8;
    static final int P = 23;
    protected static final int Q = 24;
    protected static final int R = 1;
    protected static final int S = 0;
    static final byte[] T = null;
    static final byte[] U = null;
    private volatile boolean A;
    private volatile java.io.OutputStream B;
    private org.apache.commons.net.telnet.i C;
    int[] u;
    int[] v;
    int[] w;
    private java.lang.String x;
    private final org.apache.commons.net.telnet.k[] y;
    private final java.lang.Object z;

    static {
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x003a: FILL_ARRAY_DATA , data: [-1, -3} // fill-array
            org.apache.commons.net.telnet.d.F = r1
            byte[] r1 = new byte[r0]
            r1 = {x0040: FILL_ARRAY_DATA , data: [-1, -2} // fill-array
            org.apache.commons.net.telnet.d.G = r1
            byte[] r1 = new byte[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [-1, -5} // fill-array
            org.apache.commons.net.telnet.d.H = r1
            byte[] r1 = new byte[r0]
            r1 = {x004c: FILL_ARRAY_DATA , data: [-1, -4} // fill-array
            org.apache.commons.net.telnet.d.I = r1
            byte[] r1 = new byte[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [-1, -6} // fill-array
            org.apache.commons.net.telnet.d.J = r1
            byte[] r1 = new byte[r0]
            r1 = {x0058: FILL_ARRAY_DATA , data: [-1, -16} // fill-array
            org.apache.commons.net.telnet.d.K = r1
            byte[] r1 = new byte[r0]
            r1 = {x005e: FILL_ARRAY_DATA , data: [24, 0} // fill-array
            org.apache.commons.net.telnet.d.T = r1
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [-1, -10} // fill-array
            org.apache.commons.net.telnet.d.U = r0
            return
    }

    d() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.x = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.z = r1
            r1 = 1
            r2.A = r1
            r2.B = r0
            r2.C = r0
            r0 = 23
            r2.N(r0)
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2.u = r1
            int[] r1 = new int[r0]
            r2.v = r1
            int[] r1 = new int[r0]
            r2.w = r1
            org.apache.commons.net.telnet.k[] r0 = new org.apache.commons.net.telnet.k[r0]
            r2.y = r0
            return
    }

    d(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.x = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.z = r1
            r1 = 1
            r2.A = r1
            r2.B = r0
            r2.C = r0
            r0 = 23
            r2.N(r0)
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2.u = r1
            int[] r1 = new int[r0]
            r2.v = r1
            int[] r1 = new int[r0]
            r2.w = r1
            r2.x = r3
            org.apache.commons.net.telnet.k[] r3 = new org.apache.commons.net.telnet.k[r0]
            r2.y = r3
            return
    }

    void A0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 | 8
            r0[r3] = r1
            return
    }

    void B0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 & (-9)
            r0[r3] = r1
            return
    }

    void C0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 | 4
            r0[r3] = r1
            return
    }

    void D0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 & (-5)
            r0[r3] = r1
            return
    }

    void E0(int r4) throws java.io.IOException {
            r3 = this;
            int[] r0 = r3.w
            r1 = r0[r4]
            r2 = 1
            r1 = r1 | r2
            r0[r4] = r1
            boolean r0 = r3.n0(r4)
            if (r0 == 0) goto L24
            org.apache.commons.net.telnet.k[] r0 = r3.y
            r0 = r0[r4]
            if (r0 == 0) goto L24
            r0.n(r2)
            org.apache.commons.net.telnet.k[] r0 = r3.y
            r4 = r0[r4]
            int[] r4 = r4.o()
            if (r4 == 0) goto L24
            r3.u0(r4)
        L24:
            return
    }

    void F0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 & (-2)
            r0[r3] = r1
            org.apache.commons.net.telnet.k[] r0 = r2.y
            r3 = r0[r3]
            if (r3 == 0) goto L12
            r0 = 0
            r3.n(r0)
        L12:
            return
    }

    void G0(int r4) {
            r3 = this;
            java.io.OutputStream r0 = r3.B
            if (r0 == 0) goto L19
            r1 = 13
            if (r4 == r1) goto L19
            r2 = 10
            if (r4 != r2) goto Lf
            r0.write(r1)     // Catch: java.io.IOException -> L16
        Lf:
            r0.write(r4)     // Catch: java.io.IOException -> L16
            r0.flush()     // Catch: java.io.IOException -> L16
            return
        L16:
            r4 = 0
            r3.B = r4
        L19:
            return
    }

    void H0(int r3) {
            r2 = this;
            r0 = 1
            boolean r1 = r2.I0(r0)
            if (r1 == 0) goto Ld
            boolean r0 = r2.l0(r0)
            if (r0 != 0) goto L1b
        Ld:
            java.io.OutputStream r0 = r2.B
            if (r0 == 0) goto L1b
            r0.write(r3)     // Catch: java.io.IOException -> L18
            r0.flush()     // Catch: java.io.IOException -> L18
            return
        L18:
            r3 = 0
            r2.B = r3
        L1b:
            return
    }

    boolean I0(int r2) {
            r1 = this;
            int[] r0 = r1.w
            r2 = r0[r2]
            r2 = r2 & 2
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    boolean J0(int r1) {
            r0 = this;
            boolean r1 = r0.I0(r1)
            r1 = r1 ^ 1
            return r1
    }

    boolean K0(int r2) {
            r1 = this;
            int[] r0 = r1.w
            r2 = r0[r2]
            r0 = 1
            r2 = r2 & r0
            if (r2 == 0) goto L9
            return r0
        L9:
            r2 = 0
            return r2
    }

    boolean L0(int r1) {
            r0 = this;
            boolean r1 = r0.K0(r1)
            r1 = r1 ^ 1
            return r1
    }

    void M0() {
            r1 = this;
            r0 = 0
            r1.B = r0
            return
    }

    void N0(org.apache.commons.net.telnet.k r4) throws org.apache.commons.net.telnet.InvalidTelnetOptionException, java.io.IOException {
            r3 = this;
            int r0 = r4.g()
            boolean r1 = org.apache.commons.net.telnet.j.b(r0)
            if (r1 == 0) goto L33
            org.apache.commons.net.telnet.k[] r1 = r3.y
            r2 = r1[r0]
            if (r2 != 0) goto L2b
            r1[r0] = r4
            boolean r1 = r3.J()
            if (r1 == 0) goto L2a
            boolean r1 = r4.e()
            if (r1 == 0) goto L21
            r3.j0(r0)
        L21:
            boolean r4 = r4.f()
            if (r4 == 0) goto L2a
            r3.h0(r0)
        L2a:
            return
        L2b:
            org.apache.commons.net.telnet.InvalidTelnetOptionException r4 = new org.apache.commons.net.telnet.InvalidTelnetOptionException
            java.lang.String r1 = "Already registered option"
            r4.<init>(r1, r0)
            throw r4
        L33:
            org.apache.commons.net.telnet.InvalidTelnetOptionException r4 = new org.apache.commons.net.telnet.InvalidTelnetOptionException
            java.lang.String r1 = "Invalid Option Code"
            r4.<init>(r1, r0)
            throw r4
    }

    void O0(int r4) throws org.apache.commons.net.telnet.InvalidTelnetOptionException, java.io.IOException {
            r3 = this;
            boolean r0 = org.apache.commons.net.telnet.j.b(r4)
            if (r0 == 0) goto L2a
            org.apache.commons.net.telnet.k[] r0 = r3.y
            r1 = r0[r4]
            if (r1 == 0) goto L22
            r2 = 0
            r0[r4] = r2
            boolean r0 = r1.h()
            if (r0 == 0) goto L18
            r3.k0(r4)
        L18:
            boolean r0 = r1.d()
            if (r0 == 0) goto L21
            r3.i0(r4)
        L21:
            return
        L22:
            org.apache.commons.net.telnet.InvalidTelnetOptionException r0 = new org.apache.commons.net.telnet.InvalidTelnetOptionException
            java.lang.String r1 = "Unregistered option"
            r0.<init>(r1, r4)
            throw r0
        L2a:
            org.apache.commons.net.telnet.InvalidTelnetOptionException r0 = new org.apache.commons.net.telnet.InvalidTelnetOptionException
            java.lang.String r1 = "Invalid Option Code"
            r0.<init>(r1, r4)
            throw r0
    }

    public void P0(org.apache.commons.net.telnet.i r1) {
            r0 = this;
            r0.C = r1
            return
    }

    public void Q0() {
            r1 = this;
            r0 = 0
            r1.C = r0
            return
    }

    final synchronized void Z() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.z     // Catch: java.lang.Throwable -> L15
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r2.A = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r2.z     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = move-exception
            goto L19
        L17:
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    void a0(int r3) {
            r2 = this;
            org.apache.commons.net.telnet.i r0 = r2.C
            if (r0 == 0) goto L8
            r1 = 5
            r0.a(r1, r3)
        L8:
            return
    }

    @Override // org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L25
            int[] r2 = r4.u
            r2[r1] = r0
            int[] r2 = r4.v
            r2[r1] = r0
            int[] r2 = r4.w
            r2[r1] = r0
            org.apache.commons.net.telnet.k[] r2 = r4.y
            r2 = r2[r1]
            if (r2 == 0) goto L22
            r2.k(r0)
            org.apache.commons.net.telnet.k[] r2 = r4.y
            r2 = r2[r1]
            r2.n(r0)
        L22:
            int r1 = r1 + 1
            goto L2
        L25:
            super.b()
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.InputStream r3 = r4.h
            r1.<init>(r3)
            r4.h = r1
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            java.io.OutputStream r3 = r4.i
            r1.<init>(r3)
            r4.i = r1
        L3a:
            if (r0 >= r2) goto L6b
            org.apache.commons.net.telnet.k[] r1 = r4.y
            r1 = r1[r0]
            if (r1 == 0) goto L68
            boolean r1 = r1.e()
            if (r1 == 0) goto L53
            org.apache.commons.net.telnet.k[] r1 = r4.y
            r1 = r1[r0]
            int r1 = r1.g()
            r4.j0(r1)
        L53:
            org.apache.commons.net.telnet.k[] r1 = r4.y
            r1 = r1[r0]
            boolean r1 = r1.f()
            if (r1 == 0) goto L68
            org.apache.commons.net.telnet.k[] r1 = r4.y
            r1 = r1[r0]
            int r1 = r1.g()
            r4.h0(r1)
        L68:
            int r0 = r0 + 1
            goto L3a
        L6b:
            return
    }

    void b0(int r5) throws java.io.IOException {
            r4 = this;
            org.apache.commons.net.telnet.i r0 = r4.C
            r1 = 1
            if (r0 == 0) goto L8
            r0.a(r1, r5)
        L8:
            org.apache.commons.net.telnet.k[] r0 = r4.y
            r0 = r0[r5]
            if (r0 == 0) goto L13
            boolean r0 = r0.b()
            goto L24
        L13:
            r0 = 24
            if (r5 != r0) goto L23
            java.lang.String r0 = r4.x
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 <= 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            int[] r2 = r4.v
            r3 = r2[r5]
            if (r3 <= 0) goto L3c
            int r3 = r3 - r1
            r2[r5] = r3
            if (r3 <= 0) goto L3c
            boolean r2 = r4.K0(r5)
            if (r2 == 0) goto L3c
            int[] r2 = r4.v
            r3 = r2[r5]
            int r3 = r3 - r1
            r2[r5] = r3
        L3c:
            int[] r2 = r4.v
            r2 = r2[r5]
            if (r2 != 0) goto L5b
            boolean r2 = r4.o0(r5)
            if (r2 == 0) goto L5b
            if (r0 == 0) goto L51
            r4.C0(r5)
            r4.w0(r5)
            goto L5b
        L51:
            int[] r0 = r4.v
            r2 = r0[r5]
            int r2 = r2 + r1
            r0[r5] = r2
            r4.x0(r5)
        L5b:
            r4.E0(r5)
            return
    }

    void c0(int r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.telnet.i r0 = r2.C
            if (r0 == 0) goto L8
            r1 = 2
            r0.a(r1, r3)
        L8:
            int[] r0 = r2.v
            r1 = r0[r3]
            if (r1 <= 0) goto L22
            int r1 = r1 + (-1)
            r0[r3] = r1
            if (r1 <= 0) goto L22
            boolean r0 = r2.L0(r3)
            if (r0 == 0) goto L22
            int[] r0 = r2.v
            r1 = r0[r3]
            int r1 = r1 + (-1)
            r0[r3] = r1
        L22:
            int[] r0 = r2.v
            r0 = r0[r3]
            if (r0 != 0) goto L40
            boolean r0 = r2.n0(r3)
            if (r0 == 0) goto L40
            boolean r0 = r2.K0(r3)
            if (r0 != 0) goto L3a
            boolean r0 = r2.n0(r3)
            if (r0 == 0) goto L3d
        L3a:
            r2.x0(r3)
        L3d:
            r2.D0(r3)
        L40:
            r2.F0(r3)
            return
    }

    void d0(int[] r3, int r4) throws java.io.IOException {
            r2 = this;
            if (r4 <= 0) goto L21
            org.apache.commons.net.telnet.k[] r0 = r2.y
            r1 = 0
            r1 = r3[r1]
            r0 = r0[r1]
            if (r0 == 0) goto L13
            int[] r3 = r0.a(r3, r4)
            r2.u0(r3)
            return
        L13:
            r0 = 1
            if (r4 <= r0) goto L21
            r4 = 24
            if (r1 != r4) goto L21
            r3 = r3[r0]
            if (r3 != r0) goto L21
            r2.v0()
        L21:
            return
    }

    void e0(int r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.telnet.i r0 = r3.C
            if (r0 == 0) goto L8
            r1 = 3
            r0.a(r1, r4)
        L8:
            org.apache.commons.net.telnet.k[] r0 = r3.y
            r0 = r0[r4]
            if (r0 == 0) goto L13
            boolean r0 = r0.c()
            goto L14
        L13:
            r0 = 0
        L14:
            int[] r1 = r3.u
            r2 = r1[r4]
            if (r2 <= 0) goto L2e
            int r2 = r2 + (-1)
            r1[r4] = r2
            if (r2 <= 0) goto L2e
            boolean r1 = r3.I0(r4)
            if (r1 == 0) goto L2e
            int[] r1 = r3.u
            r2 = r1[r4]
            int r2 = r2 + (-1)
            r1[r4] = r2
        L2e:
            int[] r1 = r3.u
            r1 = r1[r4]
            if (r1 != 0) goto L4e
            boolean r1 = r3.m0(r4)
            if (r1 == 0) goto L4e
            if (r0 == 0) goto L43
            r3.A0(r4)
            r3.s0(r4)
            goto L4e
        L43:
            int[] r0 = r3.u
            r1 = r0[r4]
            int r1 = r1 + 1
            r0[r4] = r1
            r3.t0(r4)
        L4e:
            r3.y0(r4)
            return
    }

    void f0(int r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.telnet.i r0 = r2.C
            if (r0 == 0) goto L8
            r1 = 4
            r0.a(r1, r3)
        L8:
            int[] r0 = r2.u
            r1 = r0[r3]
            if (r1 <= 0) goto L22
            int r1 = r1 + (-1)
            r0[r3] = r1
            if (r1 <= 0) goto L22
            boolean r0 = r2.J0(r3)
            if (r0 == 0) goto L22
            int[] r0 = r2.u
            r1 = r0[r3]
            int r1 = r1 + (-1)
            r0[r3] = r1
        L22:
            int[] r0 = r2.u
            r0 = r0[r3]
            if (r0 != 0) goto L40
            boolean r0 = r2.l0(r3)
            if (r0 == 0) goto L40
            boolean r0 = r2.I0(r3)
            if (r0 != 0) goto L3a
            boolean r0 = r2.l0(r3)
            if (r0 == 0) goto L3d
        L3a:
            r2.t0(r3)
        L3d:
            r2.B0(r3)
        L40:
            r2.z0(r3)
            return
    }

    void g0(java.io.OutputStream r1) {
            r0 = this;
            r0.B = r1
            return
    }

    final synchronized void h0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            boolean r0 = r2.I0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L16
            goto L10
        Le:
            r3 = move-exception
            goto L28
        L10:
            boolean r0 = r2.l0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            r2.A0(r3)     // Catch: java.lang.Throwable -> Le
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r1 = r0[r3]     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r0[r3] = r1     // Catch: java.lang.Throwable -> Le
            r2.s0(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    final synchronized void i0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            boolean r0 = r2.J0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L16
            goto L10
        Le:
            r3 = move-exception
            goto L28
        L10:
            boolean r0 = r2.m0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            r2.B0(r3)     // Catch: java.lang.Throwable -> Le
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r1 = r0[r3]     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r0[r3] = r1     // Catch: java.lang.Throwable -> Le
            r2.t0(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    final synchronized void j0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.v     // Catch: java.lang.Throwable -> Le
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            boolean r0 = r2.K0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L16
            goto L10
        Le:
            r3 = move-exception
            goto L28
        L10:
            boolean r0 = r2.n0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            r2.C0(r3)     // Catch: java.lang.Throwable -> Le
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r1 = r0[r3]     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r0[r3] = r1     // Catch: java.lang.Throwable -> Le
            r2.w0(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    final synchronized void k0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.v     // Catch: java.lang.Throwable -> Le
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            boolean r0 = r2.L0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L16
            goto L10
        Le:
            r3 = move-exception
            goto L28
        L10:
            boolean r0 = r2.o0(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            r2.D0(r3)     // Catch: java.lang.Throwable -> Le
            int[] r0 = r2.u     // Catch: java.lang.Throwable -> Le
            r1 = r0[r3]     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r0[r3] = r1     // Catch: java.lang.Throwable -> Le
            r2.x0(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    boolean l0(int r2) {
            r1 = this;
            int[] r0 = r1.w
            r2 = r0[r2]
            r2 = r2 & 8
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    boolean m0(int r1) {
            r0 = this;
            boolean r1 = r0.l0(r1)
            r1 = r1 ^ 1
            return r1
    }

    boolean n0(int r2) {
            r1 = this;
            int[] r0 = r1.w
            r2 = r0[r2]
            r2 = r2 & 4
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    boolean o0(int r1) {
            r0 = this;
            boolean r1 = r0.n0(r1)
            r1 = r1 ^ 1
            return r1
    }

    final boolean p0(long r5) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.InterruptedException {
            r4 = this;
            java.lang.Object r0 = r4.z
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L21
            r1 = 0
            r4.A = r1     // Catch: java.lang.Throwable -> L26
            java.io.OutputStream r2 = r4.i     // Catch: java.lang.Throwable -> L26
            byte[] r3 = org.apache.commons.net.telnet.d.U     // Catch: java.lang.Throwable -> L26
            r2.write(r3)     // Catch: java.lang.Throwable -> L26
            java.io.OutputStream r2 = r4.i     // Catch: java.lang.Throwable -> L26
            r2.flush()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r4.z     // Catch: java.lang.Throwable -> L21
            r2.wait(r5)     // Catch: java.lang.Throwable -> L21
            boolean r5 = r4.A     // Catch: java.lang.Throwable -> L21
            r6 = 1
            if (r5 != 0) goto L23
            r4.A = r6     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r5 = move-exception
            goto L29
        L23:
            r1 = 1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r1
        L26:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L21
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    final synchronized void q0(int r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.OutputStream r0 = r1.i     // Catch: java.lang.Throwable -> Lb
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            r1.H0(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    final synchronized void r0(byte r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r1 = 255(0xff, float:3.57E-43)
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    final synchronized void s0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            byte[] r1 = org.apache.commons.net.telnet.d.F     // Catch: java.lang.Throwable -> L14
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    final synchronized void t0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            byte[] r1 = org.apache.commons.net.telnet.d.G     // Catch: java.lang.Throwable -> L14
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    final synchronized void u0(int[] r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L33
            java.io.OutputStream r0 = r4.i     // Catch: java.lang.Throwable -> L1a
            byte[] r1 = org.apache.commons.net.telnet.d.J     // Catch: java.lang.Throwable -> L1a
            r0.write(r1)     // Catch: java.lang.Throwable -> L1a
            int r0 = r5.length     // Catch: java.lang.Throwable -> L1a
            r1 = 0
        Lc:
            if (r1 >= r0) goto L24
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L1a
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1a
            r3 = -1
            if (r2 != r3) goto L1c
            java.io.OutputStream r3 = r4.i     // Catch: java.lang.Throwable -> L1a
            r3.write(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L31
        L1c:
            java.io.OutputStream r3 = r4.i     // Catch: java.lang.Throwable -> L1a
            r3.write(r2)     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 1
            goto Lc
        L24:
            java.io.OutputStream r5 = r4.i     // Catch: java.lang.Throwable -> L1a
            byte[] r0 = org.apache.commons.net.telnet.d.K     // Catch: java.lang.Throwable -> L1a
            r5.write(r0)     // Catch: java.lang.Throwable -> L1a
            java.io.OutputStream r5 = r4.i     // Catch: java.lang.Throwable -> L1a
            r5.flush()     // Catch: java.lang.Throwable -> L1a
            goto L33
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L33:
            monitor-exit(r4)
            return
    }

    final synchronized void v0() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.x     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            java.io.OutputStream r0 = r3.i     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = org.apache.commons.net.telnet.d.J     // Catch: java.lang.Throwable -> L2f
            r0.write(r1)     // Catch: java.lang.Throwable -> L2f
            java.io.OutputStream r0 = r3.i     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = org.apache.commons.net.telnet.d.T     // Catch: java.lang.Throwable -> L2f
            r0.write(r1)     // Catch: java.lang.Throwable -> L2f
            java.io.OutputStream r0 = r3.i     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r3.x     // Catch: java.lang.Throwable -> L2f
            java.nio.charset.Charset r2 = r3.q()     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L2f
            r0.write(r1)     // Catch: java.lang.Throwable -> L2f
            java.io.OutputStream r0 = r3.i     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = org.apache.commons.net.telnet.d.K     // Catch: java.lang.Throwable -> L2f
            r0.write(r1)     // Catch: java.lang.Throwable -> L2f
            java.io.OutputStream r0 = r3.i     // Catch: java.lang.Throwable -> L2f
            r0.flush()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r3)
            return
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    final synchronized void w0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            byte[] r1 = org.apache.commons.net.telnet.d.H     // Catch: java.lang.Throwable -> L14
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    final synchronized void x0(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            byte[] r1 = org.apache.commons.net.telnet.d.I     // Catch: java.lang.Throwable -> L14
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.i     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    void y0(int r3) throws java.io.IOException {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 | 2
            r0[r3] = r1
            boolean r0 = r2.l0(r3)
            if (r0 == 0) goto L25
            org.apache.commons.net.telnet.k[] r0 = r2.y
            r0 = r0[r3]
            if (r0 == 0) goto L25
            r1 = 1
            r0.k(r1)
            org.apache.commons.net.telnet.k[] r0 = r2.y
            r3 = r0[r3]
            int[] r3 = r3.p()
            if (r3 == 0) goto L25
            r2.u0(r3)
        L25:
            return
    }

    void z0(int r3) {
            r2 = this;
            int[] r0 = r2.w
            r1 = r0[r3]
            r1 = r1 & (-3)
            r0[r3] = r1
            org.apache.commons.net.telnet.k[] r0 = r2.y
            r3 = r0[r3]
            if (r3 == 0) goto L12
            r0 = 0
            r3.k(r0)
        L12:
            return
    }
}
