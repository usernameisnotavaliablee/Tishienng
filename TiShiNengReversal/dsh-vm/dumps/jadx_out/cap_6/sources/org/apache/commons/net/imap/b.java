package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.imap.IMAPClient {
    public static final int P = 993;
    public static final java.lang.String Q = "TLS";
    private final boolean G;
    private final java.lang.String H;
    private javax.net.ssl.SSLContext I;
    private java.lang.String[] J;
    private java.lang.String[] K;
    private javax.net.ssl.TrustManager L;
    private javax.net.ssl.KeyManager M;
    private javax.net.ssl.HostnameVerifier N;
    private boolean O;

    public b() {
            r2 = this;
            java.lang.String r0 = "TLS"
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public b(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public b(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public b(java.lang.String r2, boolean r3, javax.net.ssl.SSLContext r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.I = r0
            r1.J = r0
            r1.K = r0
            r1.L = r0
            r1.M = r0
            r1.N = r0
            r0 = 993(0x3e1, float:1.391E-42)
            r1.N(r0)
            r1.H = r2
            r1.G = r3
            r1.I = r4
            return
    }

    public b(javax.net.ssl.SSLContext r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public b(boolean r2) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2)
            return
    }

    public b(boolean r2, javax.net.ssl.SSLContext r3) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2, r3)
            return
    }

    private javax.net.ssl.KeyManager S0() {
            r1 = this;
            javax.net.ssl.KeyManager r0 = r1.M
            return r0
    }

    private void U0() throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.I
            if (r0 != 0) goto L14
            java.lang.String r0 = r3.H
            javax.net.ssl.KeyManager r1 = r3.S0()
            javax.net.ssl.TrustManager r2 = r3.T0()
            javax.net.ssl.SSLContext r0 = org.apache.commons.net.util.d.a(r0, r1, r2)
            r3.I = r0
        L14:
            return
    }

    private void W0() throws java.io.IOException {
            r6 = this;
            r6.U0()
            javax.net.ssl.SSLContext r0 = r6.I
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.lang.String r1 = r6.f
            if (r1 == 0) goto Le
            goto L16
        Le:
            java.net.InetAddress r1 = r6.B()
            java.lang.String r1 = r1.getHostAddress()
        L16:
            int r2 = r6.C()
            java.net.Socket r3 = r6.e
            r4 = 1
            java.net.Socket r0 = r0.createSocket(r3, r1, r2, r4)
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            r0.setEnableSessionCreation(r4)
            r0.setUseClientMode(r4)
            boolean r2 = r6.O
            if (r2 == 0) goto L30
            org.apache.commons.net.util.e.a(r0)
        L30:
            java.lang.String[] r2 = r6.K
            if (r2 == 0) goto L37
            r0.setEnabledProtocols(r2)
        L37:
            java.lang.String[] r2 = r6.J
            if (r2 == 0) goto L3e
            r0.setEnabledCipherSuites(r2)
        L3e:
            r0.startHandshake()
            r6.e = r0
            java.io.InputStream r2 = r0.getInputStream()
            r6.h = r2
            java.io.OutputStream r2 = r0.getOutputStream()
            r6.i = r2
            org.apache.commons.net.io.a r2 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.InputStream r4 = r6.h
            java.lang.String r5 = "ISO-8859-1"
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.w = r2
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.OutputStream r4 = r6.i
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.v = r2
            javax.net.ssl.HostnameVerifier r2 = r6.N
            if (r2 == 0) goto L84
            javax.net.ssl.SSLSession r0 = r0.getSession()
            boolean r0 = r2.verify(r1, r0)
            if (r0 == 0) goto L7c
            goto L84
        L7c:
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r1 = "Hostname doesn't match certificate"
            r0.<init>(r1)
            throw r0
        L84:
            return
    }

    public boolean O0() throws javax.net.ssl.SSLException, java.io.IOException {
            r1 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.STARTTLS
            java.lang.String r0 = org.apache.commons.net.imap.IMAPCommand.getCommand(r0)
            int r0 = r1.h0(r0)
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            r1.W0()
            r0 = 1
            return r0
    }

    public java.lang.String[] P0() {
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

    public java.lang.String[] Q0() {
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

    public javax.net.ssl.HostnameVerifier R0() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.N
            return r0
    }

    public javax.net.ssl.TrustManager T0() {
            r1 = this;
            javax.net.ssl.TrustManager r0 = r1.L
            return r0
    }

    public boolean V0() {
            r1 = this;
            boolean r0 = r1.O
            return r0
    }

    public void X0(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.J = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public void Y0(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.K = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public void Z0(boolean r1) {
            r0 = this;
            r0.O = r1
            return
    }

    public void a1(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.N = r1
            return
    }

    @Override // org.apache.commons.net.imap.IMAP, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.G
            if (r0 == 0) goto L7
            r1.W0()
        L7:
            super.b()
            return
    }

    public void b1(javax.net.ssl.KeyManager r1) {
            r0 = this;
            r0.M = r1
            return
    }

    public void c1(javax.net.ssl.TrustManager r1) {
            r0 = this;
            r0.L = r1
            return
    }
}
