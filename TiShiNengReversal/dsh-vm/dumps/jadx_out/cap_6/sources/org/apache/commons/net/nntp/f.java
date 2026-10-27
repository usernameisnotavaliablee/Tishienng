package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends org.apache.commons.net.nntp.e {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private void N0(org.apache.commons.net.nntp.b r3, org.apache.commons.net.nntp.d r4) {
            r2 = this;
            if (r4 == 0) goto Lb
            java.lang.String r0 = r3.a
            r4.b = r0
            long r0 = r3.b
            int r3 = (int) r0
            r4.a = r3
        Lb:
            return
    }

    private org.apache.commons.net.nntp.b O0(org.apache.commons.net.nntp.d r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            org.apache.commons.net.nntp.b r1 = new org.apache.commons.net.nntp.b
            r1.<init>()
            return r1
    }

    static org.apache.commons.net.nntp.a P0(java.lang.String r3) {
            org.apache.commons.net.nntp.a r0 = new org.apache.commons.net.nntp.a
            r0.<init>()
            r0.B(r3)
            java.lang.String r1 = "\t"
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 6
            if (r1 <= r2) goto L3a
            r1 = 0
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r0.y(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r1 = 1
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            r0.B(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r1 = 2
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            r0.A(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r1 = 3
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            r0.z(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r1 = 4
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            r0.w(r1)     // Catch: java.lang.NumberFormatException -> L3a
            r1 = 5
            r3 = r3[r1]     // Catch: java.lang.NumberFormatException -> L3a
            r0.j(r3)     // Catch: java.lang.NumberFormatException -> L3a
        L3a:
            return r0
    }

    private void Q0(java.lang.String r4, org.apache.commons.net.nntp.b r5) throws org.apache.commons.net.MalformedServerReplyException {
            r3 = this;
            java.lang.String r0 = " "
            java.lang.String[] r0 = r4.split(r0)
            int r1 = r0.length
            r2 = 3
            if (r1 < r2) goto L19
            r1 = 1
            r1 = r0[r1]     // Catch: java.lang.NumberFormatException -> L19
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L19
            r5.b = r1     // Catch: java.lang.NumberFormatException -> L19
            r1 = 2
            r0 = r0[r1]     // Catch: java.lang.NumberFormatException -> L19
            r5.a = r0     // Catch: java.lang.NumberFormatException -> L19
            return
        L19:
            org.apache.commons.net.MalformedServerReplyException r5 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not parse article pointer.\nServer reply: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    private static void R0(java.lang.String r3, org.apache.commons.net.nntp.j r4) throws org.apache.commons.net.MalformedServerReplyException {
            java.lang.String r0 = " "
            java.lang.String[] r0 = r3.split(r0)
            int r1 = r0.length
            r2 = 5
            if (r1 < r2) goto L33
            r1 = 1
            r1 = r0[r1]     // Catch: java.lang.NumberFormatException -> L33
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L33
            r4.a(r1)     // Catch: java.lang.NumberFormatException -> L33
            r1 = 2
            r1 = r0[r1]     // Catch: java.lang.NumberFormatException -> L33
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L33
            r4.b(r1)     // Catch: java.lang.NumberFormatException -> L33
            r1 = 3
            r1 = r0[r1]     // Catch: java.lang.NumberFormatException -> L33
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L33
            r4.c(r1)     // Catch: java.lang.NumberFormatException -> L33
            r1 = 4
            r0 = r0[r1]     // Catch: java.lang.NumberFormatException -> L33
            r4.d(r0)     // Catch: java.lang.NumberFormatException -> L33
            r0 = 0
            r4.e(r0)     // Catch: java.lang.NumberFormatException -> L33
            return
        L33:
            org.apache.commons.net.MalformedServerReplyException r4 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not parse newsgroup info.\nServer reply: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    static org.apache.commons.net.nntp.j S0(java.lang.String r12) {
            java.lang.String r0 = " "
            java.lang.String[] r12 = r12.split(r0)
            int r0 = r12.length
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto Lc
            return r2
        Lc:
            org.apache.commons.net.nntp.j r0 = new org.apache.commons.net.nntp.j
            r0.<init>()
            r1 = 0
            r3 = r12[r1]
            r0.d(r3)
            r3 = 1
            r4 = r12[r3]     // Catch: java.lang.NumberFormatException -> L6f
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L6f
            r6 = 2
            r7 = r12[r6]     // Catch: java.lang.NumberFormatException -> L6f
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L6f
            r0.b(r7)     // Catch: java.lang.NumberFormatException -> L6f
            r0.c(r4)     // Catch: java.lang.NumberFormatException -> L6f
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L39
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L39
            r0.a(r9)     // Catch: java.lang.NumberFormatException -> L6f
            goto L40
        L39:
            long r4 = r4 - r7
            r7 = 1
            long r4 = r4 + r7
            r0.a(r4)     // Catch: java.lang.NumberFormatException -> L6f
        L40:
            r2 = 3
            r12 = r12[r2]
            char r12 = r12.charAt(r1)
            r4 = 77
            if (r12 == r4) goto L6b
            r4 = 78
            if (r12 == r4) goto L67
            r4 = 89
            if (r12 == r4) goto L63
            r4 = 121(0x79, float:1.7E-43)
            if (r12 == r4) goto L63
            r4 = 109(0x6d, float:1.53E-43)
            if (r12 == r4) goto L6b
            r3 = 110(0x6e, float:1.54E-43)
            if (r12 == r3) goto L67
            r0.e(r1)
            return r0
        L63:
            r0.e(r6)
            return r0
        L67:
            r0.e(r2)
            return r0
        L6b:
            r0.e(r3)
            return r0
        L6f:
            return r2
    }

    private org.apache.commons.net.nntp.j[] T0() throws java.io.IOException {
            r4 = this;
            org.apache.commons.net.io.d r0 = new org.apache.commons.net.io.d
            java.io.BufferedReader r1 = r4.x
            r0.<init>(r1)
            java.util.Vector r1 = new java.util.Vector
            r2 = 2048(0x800, float:2.87E-42)
            r1.<init>(r2)
        Le:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L26
            org.apache.commons.net.nntp.j r3 = S0(r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            r1.addElement(r3)     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r1 = move-exception
            goto L3a
        L20:
            org.apache.commons.net.MalformedServerReplyException r1 = new org.apache.commons.net.MalformedServerReplyException     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L26:
            r0.close()
            int r0 = r1.size()
            r2 = 1
            if (r0 >= r2) goto L34
            r0 = 0
            org.apache.commons.net.nntp.j[] r0 = new org.apache.commons.net.nntp.j[r0]
            return r0
        L34:
            org.apache.commons.net.nntp.j[] r0 = new org.apache.commons.net.nntp.j[r0]
            r1.copyInto(r0)
            return r0
        L3a:
            r0.close()
            throw r1
    }

    private java.io.BufferedReader U0(int r1, long r2, org.apache.commons.net.nntp.b r4) throws java.io.IOException {
            r0 = this;
            java.lang.String r2 = java.lang.Long.toString(r2)
            int r1 = r0.E0(r1, r2)
            boolean r1 = org.apache.commons.net.nntp.h.d(r1)
            if (r1 != 0) goto L10
            r1 = 0
            return r1
        L10:
            if (r4 == 0) goto L19
            java.lang.String r1 = r0.m0()
            r0.Q0(r1, r4)
        L19:
            org.apache.commons.net.io.d r1 = new org.apache.commons.net.io.d
            java.io.BufferedReader r2 = r0.x
            r1.<init>(r2)
            return r1
    }

    private java.io.BufferedReader V0(int r2, java.lang.String r3, org.apache.commons.net.nntp.b r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            if (r3 == 0) goto Le
            int r2 = r1.E0(r2, r3)
            boolean r2 = org.apache.commons.net.nntp.h.d(r2)
            if (r2 != 0) goto L19
            return r0
        Le:
            int r2 = r1.D0(r2)
            boolean r2 = org.apache.commons.net.nntp.h.d(r2)
            if (r2 != 0) goto L19
            return r0
        L19:
            if (r4 == 0) goto L22
            java.lang.String r2 = r1.m0()
            r1.Q0(r2, r4)
        L22:
            org.apache.commons.net.io.d r2 = new org.apache.commons.net.io.d
            java.io.BufferedReader r3 = r1.x
            r2.<init>(r3)
            return r2
    }

    private java.io.BufferedReader W0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r2 = r1.M0(r2)
            boolean r2 = org.apache.commons.net.nntp.h.d(r2)
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            org.apache.commons.net.io.d r2 = new org.apache.commons.net.io.d
            java.io.BufferedReader r0 = r1.x
            r2.<init>(r0)
            return r2
    }

    private java.io.BufferedReader X0(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.L0(r1, r2)
            boolean r1 = org.apache.commons.net.nntp.h.d(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            org.apache.commons.net.io.d r1 = new org.apache.commons.net.io.d
            java.io.BufferedReader r2 = r0.x
            r1.<init>(r2)
            return r1
    }

    public java.io.BufferedReader A1(long r2, org.apache.commons.net.nntp.b r4) throws java.io.IOException {
            r1 = this;
            r0 = 1
            java.io.BufferedReader r2 = r1.U0(r0, r2, r4)
            return r2
    }

    public java.io.BufferedReader B1(java.lang.String r2, org.apache.commons.net.nntp.b r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            java.io.BufferedReader r2 = r1.V0(r0, r2, r3)
            return r2
    }

    public java.io.Reader C1() throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.Reader r0 = r1.F1(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.io.Reader D1(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            java.io.BufferedReader r3 = r2.z1(r0)
            return r3
    }

    @java.lang.Deprecated
    public java.io.Reader E1(int r4, org.apache.commons.net.nntp.d r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.nntp.b r0 = r3.O0(r5)
            long r1 = (long) r4
            java.io.BufferedReader r4 = r3.A1(r1, r0)
            r3.N0(r0, r5)
            return r4
    }

    public java.io.Reader F1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.B1(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    public java.io.Reader G1(java.lang.String r2, org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.b r0 = r1.O0(r3)
            java.io.BufferedReader r2 = r1.B1(r2, r0)
            r1.N0(r0, r3)
            return r2
    }

    public java.io.BufferedReader H1(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.I1(r2, r0)
            return r2
    }

    public java.io.BufferedReader I1(long r2, org.apache.commons.net.nntp.b r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            java.io.BufferedReader r2 = r1.U0(r0, r2, r4)
            return r2
    }

    public java.io.BufferedReader J1(java.lang.String r2, org.apache.commons.net.nntp.b r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            java.io.BufferedReader r2 = r1.V0(r0, r2, r3)
            return r2
    }

    public java.io.Reader K1() throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.Reader r0 = r1.N1(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.io.Reader L1(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            java.io.BufferedReader r3 = r2.H1(r0)
            return r3
    }

    @java.lang.Deprecated
    public java.io.Reader M1(int r4, org.apache.commons.net.nntp.d r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.nntp.b r0 = r3.O0(r5)
            long r1 = (long) r4
            java.io.BufferedReader r4 = r3.I1(r1, r0)
            r3.N0(r0, r5)
            return r4
    }

    public java.io.Reader N1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.J1(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    public java.io.Reader O1(java.lang.String r2, org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.b r0 = r1.O0(r3)
            java.io.BufferedReader r2 = r1.J1(r2, r0)
            r1.N0(r0, r3)
            return r2
    }

    public java.io.BufferedReader P1(long r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.io.BufferedReader r1 = r0.W0(r1)
            return r1
    }

    public java.io.BufferedReader Q1(long r2, long r4) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            java.io.BufferedReader r2 = r1.W0(r2)
            return r2
    }

    @java.lang.Deprecated
    public java.io.Reader R1(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            java.io.BufferedReader r3 = r2.P1(r0)
            return r3
    }

    @java.lang.Deprecated
    public java.io.Reader S1(int r3, int r4) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            long r3 = (long) r4
            java.io.BufferedReader r3 = r2.Q1(r0, r3)
            return r3
    }

    public java.io.BufferedReader T1(java.lang.String r1, long r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.io.BufferedReader r1 = r0.X0(r1, r2)
            return r1
    }

    public java.io.BufferedReader U1(java.lang.String r2, long r3, long r5) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "-"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.io.BufferedReader r2 = r1.X0(r2, r3)
            return r2
    }

    @java.lang.Deprecated
    public java.io.Reader V1(java.lang.String r3, int r4) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r4
            java.io.BufferedReader r3 = r2.T1(r3, r0)
            return r3
    }

    @java.lang.Deprecated
    public java.io.Reader W1(java.lang.String r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            long r2 = (long) r8
            long r4 = (long) r9
            r0 = r6
            r1 = r7
            java.io.BufferedReader r7 = r0.U1(r1, r2, r4)
            return r7
    }

    @java.lang.Deprecated
    public boolean X1(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            boolean r3 = r2.Z1(r0)
            return r3
    }

    public boolean Y0(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            int r2 = r1.f0(r2)
            r0 = 381(0x17d, float:5.34E-43)
            if (r2 != r0) goto L14
            int r2 = r1.e0(r3)
            r3 = 281(0x119, float:3.94E-43)
            if (r2 != r3) goto L14
            r2 = 1
            r1.u = r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public boolean Y1(int r4, org.apache.commons.net.nntp.d r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.nntp.b r0 = r3.O0(r5)
            long r1 = (long) r4
            boolean r4 = r3.a2(r1, r0)
            r3.N0(r0, r5)
            return r4
    }

    public boolean Z0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.k0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            return r0
    }

    public boolean Z1(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.a2(r2, r0)
            return r2
    }

    public java.io.Writer a1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r2 = r1.t0(r2)
            boolean r2 = org.apache.commons.net.nntp.h.e(r2)
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            org.apache.commons.net.io.e r2 = new org.apache.commons.net.io.e
            java.io.BufferedWriter r0 = r1.y
            r2.<init>(r0)
            return r2
    }

    public boolean a2(long r1, org.apache.commons.net.nntp.b r3) throws java.io.IOException {
            r0 = this;
            int r1 = r0.J0(r1)
            boolean r1 = org.apache.commons.net.nntp.h.d(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            if (r3 == 0) goto L15
            java.lang.String r1 = r0.m0()
            r0.Q0(r1, r3)
        L15:
            r1 = 1
            return r1
    }

    public java.lang.Iterable<org.apache.commons.net.nntp.a> b1(long r1, long r3) throws java.io.IOException {
            r0 = this;
            java.io.BufferedReader r1 = r0.Q1(r1, r3)
            if (r1 == 0) goto L12
            org.apache.commons.net.nntp.c r2 = new org.apache.commons.net.nntp.c
            org.apache.commons.net.nntp.l r3 = new org.apache.commons.net.nntp.l
            r4 = 0
            r3.<init>(r1, r4)
            r2.<init>(r3)
            return r2
        L12:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "XOVER command failed: "
            r2.append(r3)
            java.lang.String r3 = r0.m0()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public boolean b2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.c2(r2, r0)
            return r2
    }

    public java.lang.Iterable<java.lang.String> c1(org.apache.commons.net.nntp.i r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r1 = r7.e()
            java.lang.String r2 = r7.c()
            java.lang.String r3 = r7.f()
            boolean r4 = r7.g()
            java.lang.String r5 = r7.d()
            r0 = r6
            int r7 = r0.z0(r1, r2, r3, r4, r5)
            boolean r7 = org.apache.commons.net.nntp.h.d(r7)
            if (r7 == 0) goto L27
            org.apache.commons.net.nntp.l r7 = new org.apache.commons.net.nntp.l
            java.io.BufferedReader r1 = r0.x
            r7.<init>(r1)
            return r7
        L27:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NEWNEWS command failed: "
            r1.append(r2)
            java.lang.String r2 = r6.m0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.<init>(r1)
            throw r7
    }

    public boolean c2(java.lang.String r2, org.apache.commons.net.nntp.b r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Le
            int r2 = r1.K0(r2)
            boolean r2 = org.apache.commons.net.nntp.h.d(r2)
            if (r2 != 0) goto L19
            return r0
        Le:
            int r2 = r1.H0()
            boolean r2 = org.apache.commons.net.nntp.h.d(r2)
            if (r2 != 0) goto L19
            return r0
        L19:
            if (r3 == 0) goto L22
            java.lang.String r2 = r1.m0()
            r1.Q0(r2, r3)
        L22:
            r2 = 1
            return r2
    }

    public java.lang.Iterable<java.lang.String> d1(org.apache.commons.net.nntp.i r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r4.c()
            java.lang.String r1 = r4.f()
            boolean r2 = r4.g()
            java.lang.String r4 = r4.d()
            int r4 = r3.y0(r0, r1, r2, r4)
            boolean r4 = org.apache.commons.net.nntp.h.d(r4)
            if (r4 == 0) goto L22
            org.apache.commons.net.nntp.l r4 = new org.apache.commons.net.nntp.l
            java.io.BufferedReader r0 = r3.x
            r4.<init>(r0)
            return r4
        L22:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NEWGROUPS command failed: "
            r0.append(r1)
            java.lang.String r1 = r3.m0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @java.lang.Deprecated
    public boolean d2(java.lang.String r2, org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.b r0 = r1.O0(r3)
            boolean r2 = r1.c2(r2, r0)
            r1.N0(r0, r3)
            return r2
    }

    public java.lang.Iterable<org.apache.commons.net.nntp.j> e1(org.apache.commons.net.nntp.i r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.k r0 = new org.apache.commons.net.nntp.k
            java.lang.Iterable r2 = r1.d1(r2)
            r0.<init>(r2)
            return r0
    }

    public boolean e2(org.apache.commons.net.nntp.b r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.c2(r0, r2)
            return r2
    }

    public java.lang.Iterable<java.lang.String> f1() throws java.io.IOException {
            r3 = this;
            int r0 = r3.w0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 == 0) goto L12
            org.apache.commons.net.nntp.l r0 = new org.apache.commons.net.nntp.l
            java.io.BufferedReader r1 = r3.x
            r0.<init>(r1)
            return r0
        L12:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LIST command failed: "
            r1.append(r2)
            java.lang.String r2 = r3.m0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public boolean f2(org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.nntp.b r0 = r2.O0(r3)
            boolean r1 = r2.e2(r0)
            r2.N0(r0, r3)
            return r1
    }

    public java.lang.Iterable<java.lang.String> g1(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.x0(r4)
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 == 0) goto L12
            org.apache.commons.net.nntp.l r4 = new org.apache.commons.net.nntp.l
            java.io.BufferedReader r0 = r3.x
            r4.<init>(r0)
            return r4
        L12:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LIST ACTIVE "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " command failed: "
            r1.append(r4)
            java.lang.String r4 = r3.m0()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean g2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r2 = r1.h2(r2, r0)
            return r2
    }

    public java.lang.Iterable<org.apache.commons.net.nntp.j> h1() throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.nntp.k r0 = new org.apache.commons.net.nntp.k
            java.lang.Iterable r1 = r2.f1()
            r0.<init>(r1)
            return r0
    }

    public boolean h2(java.lang.String r1, org.apache.commons.net.nntp.j r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.n0(r1)
            boolean r1 = org.apache.commons.net.nntp.h.d(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            if (r2 == 0) goto L15
            java.lang.String r1 = r0.m0()
            R0(r1, r2)
        L15:
            r1 = 1
            return r1
    }

    public java.lang.Iterable<org.apache.commons.net.nntp.j> i1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.k r0 = new org.apache.commons.net.nntp.k
            java.lang.Iterable r2 = r1.g1(r2)
            r0.<init>(r2)
            return r0
    }

    public boolean i2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r0 = r1.j2(r0)
            return r0
    }

    public java.lang.String j1() throws java.io.IOException {
            r3 = this;
            int r0 = r3.s0()
            boolean r0 = org.apache.commons.net.nntp.h.a(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            org.apache.commons.net.io.d r1 = new org.apache.commons.net.io.d
            java.io.BufferedReader r2 = r3.x
            r1.<init>(r2)
            org.apache.commons.net.io.l.c(r1, r0)
            r1.close()
            r0.close()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean j2(org.apache.commons.net.nntp.b r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.A0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            if (r2 == 0) goto L15
            java.lang.String r0 = r1.m0()
            r1.Q0(r0, r2)
        L15:
            r2 = 1
            return r2
    }

    public java.lang.String[] k1(org.apache.commons.net.nntp.i r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r2 = r8.e()
            java.lang.String r3 = r8.c()
            java.lang.String r4 = r8.f()
            boolean r5 = r8.g()
            java.lang.String r6 = r8.d()
            r1 = r7
            int r8 = r1.z0(r2, r3, r4, r5, r6)
            boolean r8 = org.apache.commons.net.nntp.h.d(r8)
            if (r8 != 0) goto L21
            r8 = 0
            return r8
        L21:
            java.util.Vector r8 = new java.util.Vector
            r8.<init>()
            org.apache.commons.net.io.d r2 = new org.apache.commons.net.io.d
            java.io.BufferedReader r0 = r1.x
            r2.<init>(r0)
        L2d:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L3a
            r8.addElement(r0)     // Catch: java.lang.Throwable -> L37
            goto L2d
        L37:
            r0 = move-exception
            r8 = r0
            goto L4e
        L3a:
            r2.close()
            int r0 = r8.size()
            r2 = 1
            if (r0 >= r2) goto L48
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            return r8
        L48:
            java.lang.String[] r0 = new java.lang.String[r0]
            r8.copyInto(r0)
            return r0
        L4e:
            r2.close()
            throw r8
    }

    @java.lang.Deprecated
    public boolean k2(org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.nntp.b r0 = r2.O0(r3)
            boolean r1 = r2.j2(r0)
            r2.N0(r0, r3)
            return r1
    }

    public org.apache.commons.net.nntp.j[] l1(org.apache.commons.net.nntp.i r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r4.c()
            java.lang.String r1 = r4.f()
            boolean r2 = r4.g()
            java.lang.String r4 = r4.d()
            int r4 = r3.y0(r0, r1, r2, r4)
            boolean r4 = org.apache.commons.net.nntp.h.d(r4)
            if (r4 != 0) goto L1c
            r4 = 0
            return r4
        L1c:
            org.apache.commons.net.nntp.j[] r4 = r3.T0()
            return r4
    }

    public boolean l2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m2(r0)
            return r0
    }

    public org.apache.commons.net.nntp.j[] m1() throws java.io.IOException {
            r1 = this;
            int r0 = r1.w0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            org.apache.commons.net.nntp.j[] r0 = r1.T0()
            return r0
    }

    public boolean m2(org.apache.commons.net.nntp.b r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.v0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            if (r2 == 0) goto L15
            java.lang.String r0 = r1.m0()
            r1.Q0(r0, r2)
        L15:
            r2 = 1
            return r2
    }

    public org.apache.commons.net.nntp.j[] n1(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.x0(r1)
            boolean r1 = org.apache.commons.net.nntp.h.d(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            org.apache.commons.net.nntp.j[] r1 = r0.T0()
            return r1
    }

    @java.lang.Deprecated
    public boolean n2(org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.nntp.b r0 = r2.O0(r3)
            boolean r1 = r2.m2(r0)
            r2.N0(r0, r3)
            return r1
    }

    public java.lang.String[] o1() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "LIST"
            java.lang.String r1 = "OVERVIEW.FMT"
            int r0 = r3.G0(r0, r1)
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            org.apache.commons.net.io.d r0 = new org.apache.commons.net.io.d
            java.io.BufferedReader r1 = r3.x
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1c:
            java.lang.String r2 = r0.readLine()
            if (r2 == 0) goto L26
            r1.add(r2)
            goto L1c
        L26:
            r0.close()
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public boolean p1() throws java.io.IOException {
            r1 = this;
            int r0 = r1.C0()
            boolean r0 = org.apache.commons.net.nntp.h.d(r0)
            return r0
    }

    public java.io.Writer q1() throws java.io.IOException {
            r2 = this;
            int r0 = r2.B0()
            boolean r0 = org.apache.commons.net.nntp.h.e(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            org.apache.commons.net.io.e r0 = new org.apache.commons.net.io.e
            java.io.BufferedWriter r1 = r2.y
            r0.<init>(r1)
            return r0
    }

    public java.io.BufferedReader r1(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.s1(r2, r0)
            return r2
    }

    public java.io.BufferedReader s1(long r2, org.apache.commons.net.nntp.b r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.U0(r0, r2, r4)
            return r2
    }

    public java.io.BufferedReader t1(java.lang.String r2, org.apache.commons.net.nntp.b r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.V0(r0, r2, r3)
            return r2
    }

    public java.io.Reader u1() throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.Reader r0 = r1.x1(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.io.Reader v1(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            java.io.BufferedReader r3 = r2.r1(r0)
            return r3
    }

    @java.lang.Deprecated
    public java.io.Reader w1(int r4, org.apache.commons.net.nntp.d r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.nntp.b r0 = r3.O0(r5)
            long r1 = (long) r4
            java.io.BufferedReader r4 = r3.s1(r1, r0)
            r3.N0(r0, r5)
            return r4
    }

    public java.io.Reader x1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.t1(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    public java.io.Reader y1(java.lang.String r2, org.apache.commons.net.nntp.d r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.nntp.b r0 = r1.O0(r3)
            java.io.BufferedReader r2 = r1.t1(r2, r0)
            r1.N0(r0, r3)
            return r2
    }

    public java.io.BufferedReader z1(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.BufferedReader r2 = r1.A1(r2, r0)
            return r2
    }
}
