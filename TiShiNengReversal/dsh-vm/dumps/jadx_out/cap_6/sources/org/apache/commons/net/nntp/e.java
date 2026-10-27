package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.apache.commons.net.g {
    public static final int A = 119;
    private static final java.lang.String B = "ISO-8859-1";
    boolean u;
    int v;
    java.lang.String w;
    protected java.io.BufferedReader x;
    protected java.io.BufferedWriter y;
    protected org.apache.commons.net.ProtocolCommandSupport z;

    public e() {
            r1 = this;
            r1.<init>()
            r0 = 119(0x77, float:1.67E-43)
            r1.N(r0)
            r0 = 0
            r1.w = r0
            r1.x = r0
            r1.y = r0
            r0 = 0
            r1.u = r0
            org.apache.commons.net.ProtocolCommandSupport r0 = new org.apache.commons.net.ProtocolCommandSupport
            r0.<init>(r1)
            r1.z = r0
            return
    }

    private void Z() throws java.io.IOException {
            r3 = this;
            java.io.BufferedReader r0 = r3.x
            java.lang.String r0 = r0.readLine()
            r3.w = r0
            if (r0 == 0) goto L75
            int r0 = r0.length()
            r1 = 3
            if (r0 < r1) goto L5c
            java.lang.String r0 = r3.w     // Catch: java.lang.NumberFormatException -> L43
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)     // Catch: java.lang.NumberFormatException -> L43
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L43
            r3.v = r0     // Catch: java.lang.NumberFormatException -> L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.w
            r1.append(r2)
            java.lang.String r2 = "\r\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.p(r0, r1)
            int r0 = r3.v
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L3b
            return
        L3b:
            org.apache.commons.net.nntp.NNTPConnectionClosedException r0 = new org.apache.commons.net.nntp.NNTPConnectionClosedException
            java.lang.String r1 = "NNTP response 400 received.  Server closed connection."
            r0.<init>(r1)
            throw r0
        L43:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not parse response code.\nServer Reply: "
            r1.append(r2)
            java.lang.String r2 = r3.w
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Truncated server reply: "
            r1.append(r2)
            java.lang.String r2 = r3.w
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            org.apache.commons.net.nntp.NNTPConnectionClosedException r0 = new org.apache.commons.net.nntp.NNTPConnectionClosedException
            java.lang.String r1 = "Connection closed without indication."
            r0.<init>(r1)
            throw r0
    }

    public int A0() throws java.io.IOException {
            r1 = this;
            r0 = 10
            int r0 = r1.D0(r0)
            return r0
    }

    public int B0() throws java.io.IOException {
            r1 = this;
            r0 = 11
            int r0 = r1.D0(r0)
            return r0
    }

    public int C0() throws java.io.IOException {
            r1 = this;
            r0 = 12
            int r0 = r1.D0(r0)
            return r0
    }

    public int D0(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.E0(r2, r0)
            return r2
    }

    public int E0(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.nntp.g.a(r1)
            int r1 = r0.G0(r1, r2)
            return r1
    }

    public int F0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.G0(r2, r0)
            return r2
    }

    public int G0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            if (r4 == 0) goto L12
            r1 = 32
            r0.append(r1)
            r0.append(r4)
        L12:
            java.lang.String r4 = "\r\n"
            r0.append(r4)
            java.io.BufferedWriter r4 = r2.y
            java.lang.String r0 = r0.toString()
            r4.write(r0)
            java.io.BufferedWriter r4 = r2.y
            r4.flush()
            r2.o(r3, r0)
            r2.Z()
            int r3 = r2.v
            return r3
    }

    public int H0() throws java.io.IOException {
            r1 = this;
            r0 = 14
            int r0 = r1.D0(r0)
            return r0
    }

    @java.lang.Deprecated
    public int I0(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            int r3 = r2.J0(r0)
            return r3
    }

    public int J0(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 14
            java.lang.String r2 = java.lang.Long.toString(r2)
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int K0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 14
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int L0(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            r2 = 17
            java.lang.String r3 = r0.toString()
            int r2 = r1.E0(r2, r3)
            return r2
    }

    public int M0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 16
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int a0() throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r0 = r1.D0(r0)
            return r0
    }

    @Override // org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r4 = this;
            super.b()
            org.apache.commons.net.io.a r0 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r2 = r4.h
            java.lang.String r3 = "ISO-8859-1"
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.x = r0
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r4.i
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.y = r0
            r4.Z()
            int r0 = r4.v
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r4.u = r0
            return
    }

    @java.lang.Deprecated
    public int b0(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            int r3 = r2.c0(r0)
            return r3
    }

    public int c0(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.lang.String r2 = java.lang.Long.toString(r2)
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int d0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int e0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PASS "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 15
            int r3 = r2.E0(r0, r3)
            return r3
    }

    public int f0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "USER "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 15
            int r3 = r2.E0(r0, r3)
            return r3
    }

    public int g0() throws java.io.IOException {
            r1 = this;
            r0 = 1
            int r0 = r1.D0(r0)
            return r0
    }

    @java.lang.Deprecated
    public int h0(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            int r3 = r2.i0(r0)
            return r3
    }

    public int i0(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            java.lang.String r2 = java.lang.Long.toString(r2)
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int j0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int k0() throws java.io.IOException {
            r1 = this;
            r1.Z()
            int r0 = r1.v
            return r0
    }

    public int l0() {
            r1 = this;
            int r0 = r1.v
            return r0
    }

    public java.lang.String m0() {
            r1 = this;
            java.lang.String r0 = r1.w
            return r0
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            super.n()
            r0 = 0
            r1.x = r0
            r1.y = r0
            r1.w = r0
            r0 = 0
            r1.u = r0
            return
    }

    public int n0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 2
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int o0() throws java.io.IOException {
            r1 = this;
            r0 = 3
            int r0 = r1.D0(r0)
            return r0
    }

    @java.lang.Deprecated
    public int p0(int r3) throws java.io.IOException {
            r2 = this;
            long r0 = (long) r3
            int r3 = r2.q0(r0)
            return r3
    }

    public int q0(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 3
            java.lang.String r2 = java.lang.Long.toString(r2)
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public int r0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 3
            int r2 = r1.E0(r0, r2)
            return r2
    }

    @Override // org.apache.commons.net.g
    protected org.apache.commons.net.ProtocolCommandSupport s() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.z
            return r0
    }

    public int s0() throws java.io.IOException {
            r1 = this;
            r0 = 4
            int r0 = r1.D0(r0)
            return r0
    }

    public int t0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 5
            int r2 = r1.E0(r0, r2)
            return r2
    }

    public boolean u0() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public int v0() throws java.io.IOException {
            r1 = this;
            r0 = 6
            int r0 = r1.D0(r0)
            return r0
    }

    public int w0() throws java.io.IOException {
            r1 = this;
            r0 = 7
            int r0 = r1.D0(r0)
            return r0
    }

    public int x0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ACTIVE "
            r0.<init>(r1)
            r0.append(r3)
            r3 = 7
            java.lang.String r0 = r0.toString()
            int r3 = r2.E0(r3, r0)
            return r3
    }

    public int y0(java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            r0.append(r3)
            if (r4 == 0) goto L1a
            r0.append(r2)
            java.lang.String r2 = "GMT"
            r0.append(r2)
        L1a:
            if (r5 == 0) goto L29
            java.lang.String r2 = " <"
            r0.append(r2)
            r0.append(r5)
            r2 = 62
            r0.append(r2)
        L29:
            r2 = 8
            java.lang.String r3 = r0.toString()
            int r2 = r1.E0(r2, r3)
            return r2
    }

    public int z0(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            if (r5 == 0) goto L20
            r0.append(r2)
            java.lang.String r2 = "GMT"
            r0.append(r2)
        L20:
            if (r6 == 0) goto L2f
            java.lang.String r2 = " <"
            r0.append(r2)
            r0.append(r6)
            r2 = 62
            r0.append(r2)
        L2f:
            r2 = 9
            java.lang.String r3 = r0.toString()
            int r2 = r1.E0(r2, r3)
            return r2
    }
}
