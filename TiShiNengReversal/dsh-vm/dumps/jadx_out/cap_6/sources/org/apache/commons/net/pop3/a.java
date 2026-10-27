package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.apache.commons.net.g {
    public static final int B = 110;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    static final java.lang.String G = "+OK";
    static final java.lang.String H = "+ ";
    static final java.lang.String I = "-ERR";
    static final java.lang.String J = "ISO-8859-1";
    protected org.apache.commons.net.ProtocolCommandSupport A;
    private int u;
    java.io.BufferedWriter v;
    java.io.BufferedReader w;
    int x;
    java.lang.String y;
    java.util.List<java.lang.String> z;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 110(0x6e, float:1.54E-43)
            r1.N(r0)
            r0 = -1
            r1.u = r0
            r0 = 0
            r1.w = r0
            r1.v = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.z = r0
            org.apache.commons.net.ProtocolCommandSupport r0 = new org.apache.commons.net.ProtocolCommandSupport
            r0.<init>(r1)
            r1.A = r0
            return
    }

    private void Z() throws java.io.IOException {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.z
            r0.clear()
            java.io.BufferedReader r0 = r4.w
            java.lang.String r0 = r0.readLine()
            if (r0 == 0) goto L58
            java.lang.String r1 = "+OK"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L19
            r1 = 0
            r4.x = r1
            goto L30
        L19:
            java.lang.String r1 = "-ERR"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L25
            r1 = 1
            r4.x = r1
            goto L30
        L25:
            java.lang.String r1 = "+ "
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L41
            r1 = 2
            r4.x = r1
        L30:
            java.util.List<java.lang.String> r1 = r4.z
            r1.add(r0)
            r4.y = r0
            int r0 = r4.x
            java.lang.String r1 = r4.b0()
            r4.p(r0, r1)
            return
        L41:
            org.apache.commons.net.MalformedServerReplyException r1 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Received invalid POP3 protocol response from server."
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L58:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "Connection closed without indication."
            r0.<init>(r1)
            throw r0
    }

    public void a0() throws java.io.IOException {
            r2 = this;
            java.io.BufferedReader r0 = r2.w
            java.lang.String r0 = r0.readLine()
        L6:
            if (r0 == 0) goto L1d
            java.util.List<java.lang.String> r1 = r2.z
            r1.add(r0)
            java.lang.String r1 = "."
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            goto L1d
        L16:
            java.io.BufferedReader r0 = r2.w
            java.lang.String r0 = r0.readLine()
            goto L6
        L1d:
            return
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
            r4.w = r0
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r4.i
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.v = r0
            r4.Z()
            r0 = 0
            r4.j0(r0)
            return
    }

    public java.lang.String b0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r3.z
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\r\n"
            r0.append(r2)
            goto Ld
        L22:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String[] c0() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.z
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public int d0() {
            r1 = this;
            int r0 = r1.u
            return r0
    }

    public void e0(org.apache.commons.net.f r1) {
            r0 = this;
            r0.K(r1)
            return
    }

    public int f0(int r2) throws java.io.IOException {
            r1 = this;
            java.lang.String[] r0 = org.apache.commons.net.pop3.c.p
            r2 = r0[r2]
            r0 = 0
            int r2 = r1.i0(r2, r0)
            return r2
    }

    public int g0(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String[] r0 = org.apache.commons.net.pop3.c.p
            r2 = r0[r2]
            int r2 = r1.i0(r2, r3)
            return r2
    }

    public int h0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.i0(r2, r0)
            return r2
    }

    public int i0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.io.BufferedWriter r0 = r2.v
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            if (r4 == 0) goto L16
            r1 = 32
            r0.append(r1)
            r0.append(r4)
        L16:
            java.lang.String r4 = "\r\n"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.BufferedWriter r0 = r2.v
            r0.write(r4)
            java.io.BufferedWriter r0 = r2.v
            r0.flush()
            r2.o(r3, r4)
            r2.Z()
            int r3 = r2.x
            return r3
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Socket is not connected"
            r3.<init>(r4)
            throw r3
    }

    public void j0(int r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            super.n()
            r0 = 0
            r1.w = r0
            r1.v = r0
            r1.y = r0
            java.util.List<java.lang.String> r0 = r1.z
            r0.clear()
            r0 = -1
            r1.j0(r0)
            return
    }

    @Override // org.apache.commons.net.g
    protected org.apache.commons.net.ProtocolCommandSupport s() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.A
            return r0
    }
}
