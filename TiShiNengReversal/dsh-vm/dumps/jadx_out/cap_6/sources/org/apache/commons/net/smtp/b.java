package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.g {
    public static final int C = 25;
    private static final java.lang.String D = "ISO-8859-1";
    private boolean A;
    private java.lang.String B;
    protected final java.lang.String u;
    protected org.apache.commons.net.ProtocolCommandSupport v;
    java.io.BufferedReader w;
    java.io.BufferedWriter x;
    private int y;
    private final java.util.ArrayList<java.lang.String> z;

    public b() {
            r1 = this;
            java.lang.String r0 = "ISO-8859-1"
            r1.<init>(r0)
            return
    }

    public b(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 25
            r1.N(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.z = r0
            r0 = 0
            r1.A = r0
            r0 = 0
            r1.B = r0
            org.apache.commons.net.ProtocolCommandSupport r0 = new org.apache.commons.net.ProtocolCommandSupport
            r0.<init>(r1)
            r1.v = r0
            r1.u = r2
            return
    }

    private void Z() throws java.io.IOException {
            r7 = this;
            r0 = 1
            r7.A = r0
            java.util.ArrayList<java.lang.String> r0 = r7.z
            r0.clear()
            java.io.BufferedReader r0 = r7.w
            java.lang.String r0 = r0.readLine()
            java.lang.String r1 = "Connection closed without indication."
            if (r0 == 0) goto La4
            int r2 = r0.length()
            r3 = 3
            if (r2 < r3) goto L8d
            r4 = 0
            java.lang.String r5 = r0.substring(r4, r3)     // Catch: java.lang.NumberFormatException -> L76
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L76
            r7.y = r5     // Catch: java.lang.NumberFormatException -> L76
            java.util.ArrayList<java.lang.String> r5 = r7.z
            r5.add(r0)
            if (r2 <= r3) goto L5e
            char r0 = r0.charAt(r3)
            r2 = 45
            if (r0 != r2) goto L5e
        L33:
            java.io.BufferedReader r0 = r7.w
            java.lang.String r0 = r0.readLine()
            if (r0 == 0) goto L58
            java.util.ArrayList<java.lang.String> r5 = r7.z
            r5.add(r0)
            int r5 = r0.length()
            r6 = 4
            if (r5 < r6) goto L33
            char r5 = r0.charAt(r3)
            if (r5 == r2) goto L33
            char r0 = r0.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L33
            goto L5e
        L58:
            org.apache.commons.net.smtp.SMTPConnectionClosedException r0 = new org.apache.commons.net.smtp.SMTPConnectionClosedException
            r0.<init>(r1)
            throw r0
        L5e:
            int r0 = r7.y
            java.lang.String r1 = r7.g0()
            r7.p(r0, r1)
            int r0 = r7.y
            r1 = 421(0x1a5, float:5.9E-43)
            if (r0 == r1) goto L6e
            return
        L6e:
            org.apache.commons.net.smtp.SMTPConnectionClosedException r0 = new org.apache.commons.net.smtp.SMTPConnectionClosedException
            java.lang.String r1 = "SMTP response 421 received.  Server closed connection."
            r0.<init>(r1)
            throw r0
        L76:
            org.apache.commons.net.MalformedServerReplyException r1 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not parse response code.\nServer Reply: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L8d:
            org.apache.commons.net.MalformedServerReplyException r1 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Truncated server reply: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        La4:
            org.apache.commons.net.smtp.SMTPConnectionClosedException r0 = new org.apache.commons.net.smtp.SMTPConnectionClosedException
            r0.<init>(r1)
            throw r0
    }

    private int a0(int r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.smtp.d.a(r1)
            int r1 = r0.b0(r1, r2, r3)
            return r1
    }

    private int b0(java.lang.String r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            if (r3 == 0) goto L14
            if (r4 == 0) goto L11
            r4 = 32
            r0.append(r4)
        L11:
            r0.append(r3)
        L14:
            java.lang.String r3 = "\r\n"
            r0.append(r3)
            java.io.BufferedWriter r3 = r1.x
            java.lang.String r4 = r0.toString()
            r3.write(r4)
            java.io.BufferedWriter r3 = r1.x
            r3.flush()
            r1.o(r2, r4)
            r1.Z()
            int r2 = r1.y
            return r2
    }

    @Override // org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r4 = this;
            super.b()
            org.apache.commons.net.io.a r0 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r2 = r4.h
            java.lang.String r3 = r4.u
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.w = r0
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r4.i
            java.lang.String r3 = r4.u
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.x = r0
            r4.Z()
            return
    }

    public int c0() throws java.io.IOException {
            r1 = this;
            r0 = 3
            int r0 = r1.t0(r0)
            return r0
    }

    public int d0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 9
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public int e0() throws java.io.IOException {
            r1 = this;
            r1.Z()
            int r0 = r1.y
            return r0
    }

    public int f0() {
            r1 = this;
            int r0 = r1.y
            return r0
    }

    public java.lang.String g0() {
            r3 = this;
            boolean r0 = r3.A
            if (r0 != 0) goto L7
            java.lang.String r0 = r3.B
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList<java.lang.String> r1 = r3.z
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\r\n"
            r0.append(r2)
            goto L12
        L27:
            r1 = 0
            r3.A = r1
            java.lang.String r0 = r0.toString()
            r3.B = r0
            return r0
    }

    public java.lang.String[] h0() {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.z
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public int i0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public int j0() throws java.io.IOException {
            r1 = this;
            r0 = 10
            int r0 = r1.t0(r0)
            return r0
    }

    public int k0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 10
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public int l0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r1 = 0
            int r3 = r2.a0(r0, r3, r1)
            return r3
    }

    public int m0() throws java.io.IOException {
            r1 = this;
            r0 = 11
            int r0 = r1.t0(r0)
            return r0
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            super.n()
            r0 = 0
            r1.w = r0
            r1.x = r0
            r1.B = r0
            java.util.ArrayList<java.lang.String> r0 = r1.z
            r0.clear()
            r0 = 0
            r1.A = r0
            return
    }

    public int n0() throws java.io.IOException {
            r1 = this;
            r0 = 13
            int r0 = r1.t0(r0)
            return r0
    }

    public int o0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = 2
            r1 = 0
            int r3 = r2.a0(r0, r3, r1)
            return r3
    }

    public void p0(org.apache.commons.net.f r1) {
            r0 = this;
            r0.K(r1)
            return
    }

    public int q0() throws java.io.IOException {
            r1 = this;
            r0 = 7
            int r0 = r1.t0(r0)
            return r0
    }

    public int r0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 6
            int r2 = r1.u0(r0, r2)
            return r2
    }

    @Override // org.apache.commons.net.g
    protected org.apache.commons.net.ProtocolCommandSupport s() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.v
            return r0
    }

    public int s0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 4
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public int t0(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.u0(r2, r0)
            return r2
    }

    public int u0(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.smtp.d.a(r1)
            int r1 = r0.w0(r1, r2)
            return r1
    }

    public int v0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.w0(r2, r0)
            return r2
    }

    public int w0(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            int r2 = r1.b0(r2, r3, r0)
            return r2
    }

    public int x0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 5
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public int y0() throws java.io.IOException {
            r1 = this;
            r0 = 12
            int r0 = r1.t0(r0)
            return r0
    }

    public int z0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 8
            int r2 = r1.u0(r0, r2)
            return r2
    }
}
