package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.g {
    public static final int E = 20;
    public static final int F = 21;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;
    public static final int L = 5;
    public static final int M = 6;
    public static final int N = 7;
    public static final int O = 8;
    public static final int P = 9;
    public static final int Q = 10;
    public static final int R = 11;
    public static final int S = 12;
    public static final java.lang.String T = "ISO-8859-1";
    public static final int U = 3;
    private static final java.lang.String V = "AEILNTCFRPSBC";
    protected boolean A;
    private boolean B;
    protected java.io.BufferedReader C;
    protected java.io.BufferedWriter D;
    protected int u;
    protected java.util.ArrayList<java.lang.String> v;
    protected boolean w;
    protected java.lang.String x;
    protected java.lang.String y;
    protected org.apache.commons.net.ProtocolCommandSupport z;

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.A = r0
            r1 = 1
            r2.B = r1
            r1 = 21
            r2.N(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.v = r1
            r2.w = r0
            r0 = 0
            r2.x = r0
            java.lang.String r0 = "ISO-8859-1"
            r2.y = r0
            org.apache.commons.net.ProtocolCommandSupport r0 = new org.apache.commons.net.ProtocolCommandSupport
            r0.<init>(r2)
            r2.z = r0
            return
    }

    private java.lang.String Z(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            if (r3 == 0) goto L12
            r2 = 32
            r0.append(r2)
            r0.append(r3)
        L12:
            java.lang.String r2 = "\r\n"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private void a0() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.b0(r0)
            return
    }

    private void b0(boolean r9) throws java.io.IOException {
            r8 = this;
            r0 = 1
            r8.w = r0
            java.util.ArrayList<java.lang.String> r0 = r8.v
            r0.clear()
            java.io.BufferedReader r0 = r8.C
            java.lang.String r0 = r0.readLine()
            java.lang.String r1 = "Connection closed without indication."
            if (r0 == 0) goto L104
            int r2 = r0.length()
            r3 = 3
            if (r2 < r3) goto Led
            r4 = 0
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.NumberFormatException -> Ld6
            int r5 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Ld6
            r8.u = r5     // Catch: java.lang.NumberFormatException -> Ld6
            java.util.ArrayList<java.lang.String> r5 = r8.v
            r5.add(r0)
            java.lang.String r5 = "Truncated server reply: '"
            java.lang.String r6 = "'"
            if (r2 <= r3) goto L9e
            char r3 = r0.charAt(r3)
            r7 = 45
            if (r3 != r7) goto L5e
        L37:
            java.io.BufferedReader r0 = r8.C
            java.lang.String r0 = r0.readLine()
            if (r0 == 0) goto L58
            java.util.ArrayList<java.lang.String> r2 = r8.v
            r2.add(r0)
            boolean r2 = r8.A0()
            if (r2 == 0) goto L51
            boolean r0 = r8.g0(r0, r4)
            if (r0 == 0) goto La4
            goto L37
        L51:
            boolean r0 = r8.d0(r0)
            if (r0 != 0) goto L37
            goto La4
        L58:
            org.apache.commons.net.ftp.FTPConnectionClosedException r9 = new org.apache.commons.net.ftp.FTPConnectionClosedException
            r9.<init>(r1)
            throw r9
        L5e:
            boolean r1 = r8.B0()
            if (r1 == 0) goto La4
            r1 = 4
            if (r2 == r1) goto L86
            r1 = 32
            if (r3 != r1) goto L6c
            goto La4
        L6c:
            org.apache.commons.net.MalformedServerReplyException r9 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid server reply: '"
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L86:
            org.apache.commons.net.MalformedServerReplyException r9 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L9e:
            boolean r1 = r8.B0()
            if (r1 != 0) goto Lbe
        La4:
            if (r9 == 0) goto Laf
            int r9 = r8.u
            java.lang.String r0 = r8.w0()
            r8.p(r9, r0)
        Laf:
            int r9 = r8.u
            r0 = 421(0x1a5, float:5.9E-43)
            if (r9 == r0) goto Lb6
            return
        Lb6:
            org.apache.commons.net.ftp.FTPConnectionClosedException r9 = new org.apache.commons.net.ftp.FTPConnectionClosedException
            java.lang.String r0 = "FTP response 421 received.  Server closed connection."
            r9.<init>(r0)
            throw r9
        Lbe:
            org.apache.commons.net.MalformedServerReplyException r9 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        Ld6:
            org.apache.commons.net.MalformedServerReplyException r9 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not parse response code.\nServer Reply: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        Led:
            org.apache.commons.net.MalformedServerReplyException r9 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Truncated server reply: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L104:
            org.apache.commons.net.ftp.FTPConnectionClosedException r9 = new org.apache.commons.net.ftp.FTPConnectionClosedException
            r9.<init>(r1)
            throw r9
    }

    private boolean d0(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 3
            if (r0 <= r1) goto L1c
            char r0 = r3.charAt(r1)
            r1 = 45
            if (r0 == r1) goto L1c
            r0 = 0
            char r3 = r3.charAt(r0)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            r3 = 1
            return r3
    }

    private void f0(java.lang.String r2) throws java.io.IOException, org.apache.commons.net.ftp.FTPConnectionClosedException, java.net.SocketException {
            r1 = this;
            java.io.BufferedWriter r0 = r1.D     // Catch: java.net.SocketException -> Lb
            r0.write(r2)     // Catch: java.net.SocketException -> Lb
            java.io.BufferedWriter r2 = r1.D     // Catch: java.net.SocketException -> Lb
            r2.flush()     // Catch: java.net.SocketException -> Lb
            return
        Lb:
            r2 = move-exception
            boolean r0 = r1.J()
            if (r0 != 0) goto L1a
            org.apache.commons.net.ftp.FTPConnectionClosedException r2 = new org.apache.commons.net.ftp.FTPConnectionClosedException
            java.lang.String r0 = "Connection unexpectedly closed."
            r2.<init>(r0)
            throw r2
        L1a:
            throw r2
    }

    private boolean g0(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L12
            r2 = 3
            char r1 = r1.charAt(r2)
            r2 = 32
            if (r1 == r2) goto L10
            goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public boolean A0() {
            r1 = this;
            boolean r0 = r1.A
            return r0
    }

    public boolean B0() {
            r1 = this;
            boolean r0 = r1.B
            return r0
    }

    public int C0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.LIST
            int r0 = r1.e1(r0)
            return r0
    }

    public int D0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.LIST
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int E0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MDTM
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int F0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MFMT
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r3 = r2.f1(r0, r3)
            return r3
    }

    public int G0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MKD
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int H0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLSD
            int r0 = r1.e1(r0)
            return r0
    }

    public int I0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLSD
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int J0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLST
            int r0 = r1.e1(r0)
            return r0
    }

    public int K0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLST
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int L0(int r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MODE
            int r1 = r4 + 1
            java.lang.String r2 = "AEILNTCFRPSBC"
            java.lang.String r4 = r2.substring(r4, r1)
            int r4 = r3.f1(r0, r4)
            return r4
    }

    public int M0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.NLST
            int r0 = r1.e1(r0)
            return r0
    }

    public int N0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.NLST
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int O0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.NOOP
            int r0 = r1.e1(r0)
            return r0
    }

    public int P0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.PASS
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int Q0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.PASV
            int r0 = r1.e1(r0)
            return r0
    }

    public int R0(java.net.InetAddress r4, int r5) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 24
            r0.<init>(r1)
            java.lang.String r4 = r4.getHostAddress()
            r1 = 46
            r2 = 44
            java.lang.String r4 = r4.replace(r1, r2)
            r0.append(r4)
            int r4 = r5 >>> 8
            r0.append(r2)
            r0.append(r4)
            r0.append(r2)
            r4 = r5 & 255(0xff, float:3.57E-43)
            r0.append(r4)
            org.apache.commons.net.ftp.FTPCmd r4 = org.apache.commons.net.ftp.FTPCmd.PORT
            java.lang.String r5 = r0.toString()
            int r4 = r3.f1(r4, r5)
            return r4
    }

    public int S0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.PWD
            int r0 = r1.e1(r0)
            return r0
    }

    public int T0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.QUIT
            int r0 = r1.e1(r0)
            return r0
    }

    public int U0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.REIN
            int r0 = r1.e1(r0)
            return r0
    }

    public int V0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.REST
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int W0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RETR
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int X0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RMD
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int Y0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RNFR
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int Z0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RNTO
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int a1(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.b1(r2, r0)
            return r2
    }

    @Override // org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.h0(r0)
            return
    }

    @java.lang.Deprecated
    public int b1(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.ftp.e.b(r1)
            int r1 = r0.d1(r1, r2)
            return r1
    }

    protected void c0() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.b0(r0)
            return
    }

    public int c1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.d1(r2, r0)
            return r2
    }

    public int d1(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.io.BufferedWriter r0 = r1.D
            if (r0 == 0) goto L14
            java.lang.String r3 = r1.Z(r2, r3)
            r1.f0(r3)
            r1.o(r2, r3)
            r1.a0()
            int r2 = r1.u
            return r2
        L14:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Connection is not open"
            r2.<init>(r3)
            throw r2
    }

    protected void e0() throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.NOOP
            java.lang.String r0 = r0.getCommand()
            r1 = 0
            java.lang.String r0 = r2.Z(r0, r1)
            r2.f0(r0)
            r2.c0()
            return
    }

    public int e1(org.apache.commons.net.ftp.FTPCmd r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.f1(r2, r0)
            return r2
    }

    public int f1(org.apache.commons.net.ftp.FTPCmd r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getCommand()
            int r1 = r0.d1(r1, r2)
            return r1
    }

    public void g1(java.lang.String r1) {
            r0 = this;
            r0.y = r1
            return
    }

    protected void h0(java.io.Reader r4) throws java.io.IOException {
            r3 = this;
            super.b()
            if (r4 != 0) goto L18
            org.apache.commons.net.io.a r4 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.InputStream r1 = r3.h
            java.lang.String r2 = r3.t0()
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r3.C = r4
            goto L1f
        L18:
            org.apache.commons.net.io.a r0 = new org.apache.commons.net.io.a
            r0.<init>(r4)
            r3.C = r0
        L1f:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.OutputStream r1 = r3.i
            java.lang.String r2 = r3.t0()
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r3.D = r4
            int r4 = r3.l
            if (r4 <= 0) goto L6c
            java.net.Socket r4 = r3.e
            int r4 = r4.getSoTimeout()
            java.net.Socket r0 = r3.e
            int r1 = r3.l
            r0.setSoTimeout(r1)
            r3.a0()     // Catch: java.lang.Throwable -> L51 java.net.SocketTimeoutException -> L53
            int r0 = r3.u     // Catch: java.lang.Throwable -> L51 java.net.SocketTimeoutException -> L53
            boolean r0 = org.apache.commons.net.ftp.l.e(r0)     // Catch: java.lang.Throwable -> L51 java.net.SocketTimeoutException -> L53
            if (r0 == 0) goto L55
            r3.a0()     // Catch: java.lang.Throwable -> L51 java.net.SocketTimeoutException -> L53
            goto L55
        L51:
            r0 = move-exception
            goto L66
        L53:
            r0 = move-exception
            goto L5b
        L55:
            java.net.Socket r0 = r3.e
            r0.setSoTimeout(r4)
            return
        L5b:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "Timed out waiting for initial connect reply"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r1.initCause(r0)     // Catch: java.lang.Throwable -> L51
            throw r1     // Catch: java.lang.Throwable -> L51
        L66:
            java.net.Socket r1 = r3.e
            r1.setSoTimeout(r4)
            throw r0
        L6c:
            r3.a0()
            int r4 = r3.u
            boolean r4 = org.apache.commons.net.ftp.l.e(r4)
            if (r4 == 0) goto L7a
            r3.a0()
        L7a:
            return
    }

    public void h1(boolean r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public int i0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.ABOR
            int r0 = r1.e1(r0)
            return r0
    }

    public void i1(boolean r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public int j0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.ACCT
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int j1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.SITE
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int k0(int r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.ALLO
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int k1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.SMNT
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int l0(int r3, int r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.ALLO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r1.append(r3)
            java.lang.String r3 = " R "
            r1.append(r3)
            java.lang.String r3 = java.lang.Integer.toString(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r3 = r2.f1(r0, r3)
            return r3
    }

    public int l1() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STAT
            int r0 = r1.e1(r0)
            return r0
    }

    public int m0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.APPE
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int m1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STAT
            int r2 = r1.f1(r0, r2)
            return r2
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r2 = this;
            super.n()
            r0 = 0
            r2.C = r0
            r2.D = r0
            r1 = 0
            r2.w = r1
            r2.x = r0
            return
    }

    public int n0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.CDUP
            int r0 = r1.e1(r0)
            return r0
    }

    public int n1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOR
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int o0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.CWD
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int o1() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            int r0 = r1.e1(r0)
            return r0
    }

    public int p0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.DELE
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int p1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int q0(java.net.InetAddress r5, int r6) throws java.io.IOException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getHostAddress()
            java.lang.String r2 = "%"
            int r2 = r1.indexOf(r2)
            if (r2 <= 0) goto L16
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)
        L16:
            java.lang.String r2 = "|"
            r0.append(r2)
            boolean r3 = r5 instanceof java.net.Inet4Address
            if (r3 == 0) goto L25
            java.lang.String r5 = "1"
            r0.append(r5)
            goto L2e
        L25:
            boolean r5 = r5 instanceof java.net.Inet6Address
            if (r5 == 0) goto L2e
            java.lang.String r5 = "2"
            r0.append(r5)
        L2e:
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            r0.append(r2)
            org.apache.commons.net.ftp.FTPCmd r5 = org.apache.commons.net.ftp.FTPCmd.EPRT
            java.lang.String r6 = r0.toString()
            int r5 = r4.f1(r5, r6)
            return r5
    }

    public int q1(int r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STRU
            int r1 = r4 + 1
            java.lang.String r2 = "AEILNTCFRPSBC"
            java.lang.String r4 = r2.substring(r4, r1)
            int r4 = r3.f1(r0, r4)
            return r4
    }

    public int r0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.EPSV
            int r0 = r1.e1(r0)
            return r0
    }

    public int r1() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.SYST
            int r0 = r1.e1(r0)
            return r0
    }

    @Override // org.apache.commons.net.g
    protected org.apache.commons.net.ProtocolCommandSupport s() {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r0 = r1.z
            return r0
    }

    public int s0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.FEAT
            int r0 = r1.e1(r0)
            return r0
    }

    public int s1(int r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.TYPE
            int r1 = r4 + 1
            java.lang.String r2 = "AEILNTCFRPSBC"
            java.lang.String r4 = r2.substring(r4, r1)
            int r4 = r3.f1(r0, r4)
            return r4
    }

    public java.lang.String t0() {
            r1 = this;
            java.lang.String r0 = r1.y
            return r0
    }

    public int t1(int r4, int r5) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AEILNTCFRPSBC"
            char r2 = r1.charAt(r4)
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            r2 = 3
            if (r4 != r2) goto L1a
            r0.append(r5)
            goto L21
        L1a:
            char r4 = r1.charAt(r5)
            r0.append(r4)
        L21:
            org.apache.commons.net.ftp.FTPCmd r4 = org.apache.commons.net.ftp.FTPCmd.TYPE
            java.lang.String r5 = r0.toString()
            int r4 = r3.f1(r4, r5)
            return r4
    }

    public int u0() throws java.io.IOException {
            r1 = this;
            r1.a0()
            int r0 = r1.u
            return r0
    }

    public int u1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.USER
            int r2 = r1.f1(r0, r2)
            return r2
    }

    public int v0() {
            r1 = this;
            int r0 = r1.u
            return r0
    }

    public java.lang.String w0() {
            r3 = this;
            boolean r0 = r3.w
            if (r0 != 0) goto L7
            java.lang.String r0 = r3.x
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.util.ArrayList<java.lang.String> r1 = r3.v
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\r\n"
            r0.append(r2)
            goto L14
        L29:
            r1 = 0
            r3.w = r1
            java.lang.String r0 = r0.toString()
            r3.x = r0
            return r0
    }

    public java.lang.String[] x0() {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.v
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public int y0() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.HELP
            int r0 = r1.e1(r0)
            return r0
    }

    public int z0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.HELP
            int r2 = r1.f1(r0, r2)
            return r2
    }
}
