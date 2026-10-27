package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends org.apache.commons.net.pop3.b {
    private static final int T = 995;
    private static final java.lang.String U = "TLS";
    private final boolean K;
    private final java.lang.String L;
    private javax.net.ssl.SSLContext M;
    private java.lang.String[] N;
    private java.lang.String[] O;
    private javax.net.ssl.TrustManager P;
    private javax.net.ssl.KeyManager Q;
    private javax.net.ssl.HostnameVerifier R;
    private boolean S;

    public f() {
            r2 = this;
            java.lang.String r0 = "TLS"
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public f(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public f(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public f(java.lang.String r2, boolean r3, javax.net.ssl.SSLContext r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.N = r0
            r1.O = r0
            r1.P = r0
            r1.Q = r0
            r1.R = r0
            r1.L = r2
            r1.K = r3
            r1.M = r4
            if (r3 == 0) goto L1b
            r2 = 995(0x3e3, float:1.394E-42)
            r1.N(r2)
        L1b:
            return
    }

    public f(javax.net.ssl.SSLContext r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public f(boolean r2) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2)
            return
    }

    public f(boolean r2, javax.net.ssl.SSLContext r3) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2, r3)
            return
    }

    private javax.net.ssl.KeyManager E0() {
            r1 = this;
            javax.net.ssl.KeyManager r0 = r1.Q
            return r0
    }

    private void G0() throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.M
            if (r0 != 0) goto L14
            java.lang.String r0 = r3.L
            javax.net.ssl.KeyManager r1 = r3.E0()
            javax.net.ssl.TrustManager r2 = r3.F0()
            javax.net.ssl.SSLContext r0 = org.apache.commons.net.util.d.a(r0, r1, r2)
            r3.M = r0
        L14:
            return
    }

    private void I0() throws java.io.IOException {
            r6 = this;
            r6.G0()
            javax.net.ssl.SSLContext r0 = r6.M
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
            boolean r2 = r6.S
            if (r2 == 0) goto L30
            org.apache.commons.net.util.e.a(r0)
        L30:
            java.lang.String[] r2 = r6.O
            if (r2 == 0) goto L37
            r0.setEnabledProtocols(r2)
        L37:
            java.lang.String[] r2 = r6.N
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
            javax.net.ssl.HostnameVerifier r2 = r6.R
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

    public boolean A0() throws javax.net.ssl.SSLException, java.io.IOException {
            r1 = this;
            java.lang.String r0 = "STLS"
            int r0 = r1.h0(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r1.I0()
            r0 = 1
            return r0
    }

    public java.lang.String[] B0() {
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

    public java.lang.String[] C0() {
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

    public javax.net.ssl.HostnameVerifier D0() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.R
            return r0
    }

    public javax.net.ssl.TrustManager F0() {
            r1 = this;
            javax.net.ssl.TrustManager r0 = r1.P
            return r0
    }

    public boolean H0() {
            r1 = this;
            boolean r0 = r1.S
            return r0
    }

    public void J0(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.N = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public void K0(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.O = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public void L0(boolean r1) {
            r0 = this;
            r0.S = r1
            return
    }

    public void M0(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void N0(javax.net.ssl.KeyManager r1) {
            r0 = this;
            r0.Q = r1
            return
    }

    public void O0(javax.net.ssl.TrustManager r1) {
            r0 = this;
            r0.P = r1
            return
    }

    @Override // org.apache.commons.net.pop3.a, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.K
            if (r0 == 0) goto L7
            r1.I0()
        L7:
            super.b()
            return
    }
}
