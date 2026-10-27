package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m extends org.apache.commons.net.ftp.c {
    public static final int Z0 = 989;
    public static final int a1 = 990;
    private static final java.lang.String[] b1 = null;
    private static final java.lang.String c1 = "C";
    private static final java.lang.String d1 = "TLS";
    private static final java.lang.String e1 = "AUTH";
    private static final java.lang.String f1 = "ADAT";
    private static final java.lang.String g1 = "PROT";
    private static final java.lang.String h1 = "PBSZ";
    private static final java.lang.String i1 = "MIC";
    private static final java.lang.String j1 = "CONF";
    private static final java.lang.String k1 = "ENC";
    private static final java.lang.String l1 = "CCC";

    @java.lang.Deprecated
    public static java.lang.String m1;

    @java.lang.Deprecated
    public static java.lang.String n1;

    @java.lang.Deprecated
    public static java.lang.String o1;

    @java.lang.Deprecated
    public static java.lang.String p1;
    private final boolean K0;
    private final java.lang.String L0;
    private java.lang.String M0;
    private javax.net.ssl.SSLContext N0;
    private java.net.Socket O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private java.lang.String[] T0;
    private java.lang.String[] U0;
    private javax.net.ssl.TrustManager V0;
    private javax.net.ssl.KeyManager W0;
    private javax.net.ssl.HostnameVerifier X0;
    private boolean Y0;

    static {
            java.lang.String r0 = "S"
            java.lang.String r1 = "P"
            java.lang.String r2 = "C"
            java.lang.String r3 = "E"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            org.apache.commons.net.ftp.m.b1 = r0
            return
    }

    public m() {
            r2 = this;
            java.lang.String r0 = "TLS"
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public m(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public m(java.lang.String r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "TLS"
            r2.M0 = r0
            r0 = 1
            r2.P0 = r0
            r2.Q0 = r0
            r0 = 0
            r2.R0 = r0
            r2.S0 = r0
            r0 = 0
            r2.T0 = r0
            r2.U0 = r0
            javax.net.ssl.X509TrustManager r1 = org.apache.commons.net.util.g.d()
            r2.V0 = r1
            r2.W0 = r0
            r2.X0 = r0
            r2.L0 = r3
            r2.K0 = r4
            if (r4 == 0) goto L2b
            r3 = 990(0x3de, float:1.387E-42)
            r2.N(r3)
        L2b:
            return
    }

    public m(javax.net.ssl.SSLContext r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public m(boolean r2) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2)
            return
    }

    public m(boolean r2, javax.net.ssl.SSLContext r3) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2)
            r1.N0 = r3
            return
    }

    private boolean Z3(java.lang.String r6) {
            r5 = this;
            java.lang.String[] r0 = org.apache.commons.net.ftp.m.b1
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L11
            r6 = 1
            return r6
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }

    private java.lang.String j4(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r4.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto L9
            r3 = 0
            return r3
        L9:
            int r3 = r3.length()
            int r0 = r0 + r3
            java.lang.String r3 = r4.substring(r0)
            java.lang.String r3 = r3.trim()
            return r3
    }

    private javax.net.ssl.KeyManager p4() {
            r1 = this;
            javax.net.ssl.KeyManager r0 = r1.W0
            return r0
    }

    private void u4() throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.N0
            if (r0 != 0) goto L14
            java.lang.String r0 = r3.L0
            javax.net.ssl.KeyManager r1 = r3.p4()
            javax.net.ssl.TrustManager r2 = r3.r4()
            javax.net.ssl.SSLContext r0 = org.apache.commons.net.util.d.a(r0, r1, r2)
            r3.N0 = r0
        L14:
            return
    }

    public void A4(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.U0 = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    @Override // org.apache.commons.net.ftp.c
    @java.lang.Deprecated
    protected java.net.Socket B1(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.ftp.e.b(r1)
            java.net.Socket r1 = r0.C1(r1, r2)
            return r1
    }

    public void B4(boolean r1) {
            r0 = this;
            r0.P0 = r1
            return
    }

    @Override // org.apache.commons.net.ftp.c
    protected java.net.Socket C1(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.net.Socket r2 = super.C1(r2, r3)
            r1.Y3(r2)
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocket
            if (r3 == 0) goto L37
            r3 = r2
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            boolean r0 = r1.Q0
            r3.setUseClientMode(r0)
            boolean r0 = r1.P0
            r3.setEnableSessionCreation(r0)
            boolean r0 = r1.Q0
            if (r0 != 0) goto L26
            boolean r0 = r1.R0
            r3.setNeedClientAuth(r0)
            boolean r0 = r1.S0
            r3.setWantClientAuth(r0)
        L26:
            java.lang.String[] r0 = r1.T0
            if (r0 == 0) goto L2d
            r3.setEnabledCipherSuites(r0)
        L2d:
            java.lang.String[] r0 = r1.U0
            if (r0 == 0) goto L34
            r3.setEnabledProtocols(r0)
        L34:
            r3.startHandshake()
        L37:
            return r2
    }

    public void C4(boolean r1) {
            r0 = this;
            r0.Y0 = r1
            return
    }

    public void D4(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.X0 = r1
            return
    }

    public void E4(javax.net.ssl.KeyManager r1) {
            r0 = this;
            r0.W0 = r1
            return
    }

    public void F4(boolean r1) {
            r0 = this;
            r0.R0 = r1
            return
    }

    public void G4(javax.net.ssl.TrustManager r1) {
            r0 = this;
            r0.V0 = r1
            return
    }

    public void H4(boolean r1) {
            r0 = this;
            r0.Q0 = r1
            return
    }

    public void I4(boolean r1) {
            r0 = this;
            r0.S0 = r1
            return
    }

    protected void J4() throws java.io.IOException {
            r6 = this;
            java.net.Socket r0 = r6.e
            r6.O0 = r0
            r6.u4()
            javax.net.ssl.SSLContext r0 = r6.N0
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.lang.String r1 = r6.f
            if (r1 == 0) goto L12
            goto L1a
        L12:
            java.net.InetAddress r1 = r6.B()
            java.lang.String r1 = r1.getHostAddress()
        L1a:
            java.net.Socket r2 = r6.e
            int r2 = r2.getPort()
            java.net.Socket r3 = r6.e
            r4 = 0
            java.net.Socket r0 = r0.createSocket(r3, r1, r2, r4)
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            boolean r2 = r6.P0
            r0.setEnableSessionCreation(r2)
            boolean r2 = r6.Q0
            r0.setUseClientMode(r2)
            boolean r2 = r6.Q0
            if (r2 == 0) goto L3f
            boolean r2 = r6.Y0
            if (r2 == 0) goto L49
            org.apache.commons.net.util.e.a(r0)
            goto L49
        L3f:
            boolean r2 = r6.R0
            r0.setNeedClientAuth(r2)
            boolean r2 = r6.S0
            r0.setWantClientAuth(r2)
        L49:
            java.lang.String[] r2 = r6.U0
            if (r2 == 0) goto L50
            r0.setEnabledProtocols(r2)
        L50:
            java.lang.String[] r2 = r6.T0
            if (r2 == 0) goto L57
            r0.setEnabledCipherSuites(r2)
        L57:
            r0.startHandshake()
            r6.e = r0
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.InputStream r4 = r0.getInputStream()
            java.lang.String r5 = r6.t0()
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.C = r2
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.OutputStream r4 = r0.getOutputStream()
            java.lang.String r5 = r6.t0()
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.D = r2
            boolean r2 = r6.Q0
            if (r2 == 0) goto L9f
            javax.net.ssl.HostnameVerifier r2 = r6.X0
            if (r2 == 0) goto L9f
            javax.net.ssl.SSLSession r0 = r0.getSession()
            boolean r0 = r2.verify(r1, r0)
            if (r0 == 0) goto L97
            goto L9f
        L97:
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r1 = "Hostname doesn't match certificate"
            r0.<init>(r1)
            throw r0
        L9f:
            return
    }

    protected void Y3(java.net.Socket r1) throws java.io.IOException {
            r0 = this;
            return
    }

    public int a4(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "ADAT"
            if (r2 == 0) goto Ld
            java.lang.String r2 = org.apache.commons.net.util.a.r(r2)
            int r2 = r1.d1(r0, r2)
            return r2
        Ld:
            int r2 = r1.c1(r0)
            return r2
    }

    @Override // org.apache.commons.net.ftp.c, org.apache.commons.net.ftp.b, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.K0
            if (r0 == 0) goto L7
            r1.J4()
        L7:
            super.b()
            boolean r0 = r1.K0
            if (r0 != 0) goto L14
            r1.c4()
            r1.J4()
        L14:
            return
    }

    public int b4(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "AUTH"
            int r2 = r1.d1(r0, r2)
            return r2
    }

    protected void c4() throws javax.net.ssl.SSLException, java.io.IOException {
            r2 = this;
            java.lang.String r0 = "AUTH"
            java.lang.String r1 = r2.M0
            int r0 = r2.d1(r0, r1)
            r1 = 334(0x14e, float:4.68E-43)
            if (r1 != r0) goto Ld
            goto L11
        Ld:
            r1 = 234(0xea, float:3.28E-43)
            if (r1 != r0) goto L12
        L11:
            return
        L12:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            java.lang.String r1 = r2.w0()
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.net.ftp.b
    public int d1(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            int r5 = super.d1(r4, r5)
            java.lang.String r0 = "CCC"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L50
            r4 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L46
            java.net.Socket r4 = r3.e
            r4.close()
            java.net.Socket r4 = r3.O0
            r3.e = r4
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.net.Socket r1 = r3.e
            java.io.InputStream r1 = r1.getInputStream()
            java.lang.String r2 = r3.t0()
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r3.C = r4
            java.io.BufferedWriter r4 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.net.Socket r1 = r3.e
            java.io.OutputStream r1 = r1.getOutputStream()
            java.lang.String r2 = r3.t0()
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r3.D = r4
            return r5
        L46:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r5 = r3.w0()
            r4.<init>(r5)
            throw r4
        L50:
            return r5
    }

    public int d4() throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "CCC"
            int r0 = r1.c1(r0)
            return r0
    }

    public int e4(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "CONF"
            if (r2 == 0) goto Ld
            java.lang.String r2 = org.apache.commons.net.util.a.r(r2)
            int r2 = r1.d1(r0, r2)
            return r2
        Ld:
            java.lang.String r2 = ""
            int r2 = r1.d1(r0, r2)
            return r2
    }

    public int f4(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "ENC"
            if (r2 == 0) goto Ld
            java.lang.String r2 = org.apache.commons.net.util.a.r(r2)
            int r2 = r1.d1(r0, r2)
            return r2
        Ld:
            java.lang.String r2 = ""
            int r2 = r1.d1(r0, r2)
            return r2
    }

    public int g4(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "MIC"
            if (r2 == 0) goto Ld
            java.lang.String r2 = org.apache.commons.net.util.a.r(r2)
            int r2 = r1.d1(r0, r2)
            return r2
        Ld:
            java.lang.String r2 = ""
            int r2 = r1.d1(r0, r2)
            return r2
    }

    public void h4(long r4) throws javax.net.ssl.SSLException, java.io.IOException {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L28
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L28
            java.lang.String r0 = "PBSZ"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r4 = r3.d1(r0, r4)
            r5 = 200(0xc8, float:2.8E-43)
            if (r5 != r4) goto L1e
            return
        L1e:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r5 = r3.w0()
            r4.<init>(r5)
            throw r4
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public void i4(java.lang.String r4) throws javax.net.ssl.SSLException, java.io.IOException {
            r3 = this;
            java.lang.String r0 = "C"
            if (r4 != 0) goto L5
            r4 = r0
        L5:
            boolean r1 = r3.Z3(r4)
            if (r1 == 0) goto L45
            java.lang.String r1 = "PROT"
            int r1 = r3.d1(r1, r4)
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L3b
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L23
            r4 = 0
            r3.W(r4)
            r3.T(r4)
            return
        L23:
            org.apache.commons.net.ftp.p r4 = new org.apache.commons.net.ftp.p
            javax.net.ssl.SSLContext r0 = r3.N0
            r4.<init>(r0)
            r3.W(r4)
            org.apache.commons.net.ftp.o r4 = new org.apache.commons.net.ftp.o
            javax.net.ssl.SSLContext r0 = r3.N0
            r4.<init>(r0)
            r3.T(r4)
            r3.u4()
            return
        L3b:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r0 = r3.w0()
            r4.<init>(r0)
            throw r4
        L45:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public java.lang.String k4() {
            r1 = this;
            java.lang.String r0 = r1.M0
            return r0
    }

    public boolean l4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            boolean r0 = r0.getEnableSessionCreation()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public java.lang.String[] m4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            java.lang.String[] r0 = r0.getEnabledCipherSuites()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.net.ftp.c, org.apache.commons.net.ftp.b, org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            super.n()
            java.net.Socket r0 = r1.O0
            if (r0 == 0) goto La
            r0.close()
        La:
            r0 = 0
            r1.W(r0)
            r1.T(r0)
            return
    }

    public java.lang.String[] n4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            java.lang.String[] r0 = r0.getEnabledProtocols()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public javax.net.ssl.HostnameVerifier o4() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.X0
            return r0
    }

    public boolean q4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            boolean r0 = r0.getNeedClientAuth()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public javax.net.ssl.TrustManager r4() {
            r1 = this;
            javax.net.ssl.TrustManager r0 = r1.V0
            return r0
    }

    public boolean s4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            boolean r0 = r0.getUseClientMode()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean t4() {
            r2 = this;
            java.net.Socket r0 = r2.e
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto Ld
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            boolean r0 = r0.getWantClientAuth()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean v4() {
            r1 = this;
            boolean r0 = r1.Y0
            return r0
    }

    public byte[] w4(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "ADAT="
            java.lang.String r2 = r1.j4(r0, r2)
            byte[] r2 = org.apache.commons.net.util.a.f(r2)
            return r2
    }

    public long x4(long r4) throws javax.net.ssl.SSLException, java.io.IOException {
            r3 = this;
            r3.h4(r4)
            java.lang.String r0 = "PBSZ="
            java.lang.String r1 = r3.w0()
            java.lang.String r0 = r3.j4(r0, r1)
            if (r0 == 0) goto L18
            long r0 = java.lang.Long.parseLong(r0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L18
            return r0
        L18:
            return r4
    }

    public void y4(java.lang.String r1) {
            r0 = this;
            r0.M0 = r1
            return
    }

    public void z4(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.T0 = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }
}
