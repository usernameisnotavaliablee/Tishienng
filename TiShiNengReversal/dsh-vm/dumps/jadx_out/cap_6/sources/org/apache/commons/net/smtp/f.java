package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f extends org.apache.commons.net.smtp.c {
    private static final java.lang.String N = "TLS";
    private final boolean E;
    private final java.lang.String F;
    private javax.net.ssl.SSLContext G;
    private java.lang.String[] H;
    private java.lang.String[] I;
    private javax.net.ssl.TrustManager J;
    private javax.net.ssl.KeyManager K;
    private javax.net.ssl.HostnameVerifier L;
    private boolean M;

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
            r1.<init>()
            r0 = 0
            r1.G = r0
            r1.H = r0
            r1.I = r0
            r1.J = r0
            r1.K = r0
            r1.L = r0
            r1.F = r2
            r1.E = r3
            return
    }

    public f(java.lang.String r1, boolean r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            r3 = 0
            r0.G = r3
            r0.H = r3
            r0.I = r3
            r0.J = r3
            r0.K = r3
            r0.L = r3
            r0.F = r1
            r0.E = r2
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
            r1.<init>()
            r0 = 0
            r1.H = r0
            r1.I = r0
            r1.J = r0
            r1.K = r0
            r1.L = r0
            r1.E = r2
            r1.G = r3
            java.lang.String r2 = "TLS"
            r1.F = r2
            return
    }

    private void X0() throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.G
            if (r0 != 0) goto L14
            java.lang.String r0 = r3.F
            javax.net.ssl.KeyManager r1 = r3.V0()
            javax.net.ssl.TrustManager r2 = r3.W0()
            javax.net.ssl.SSLContext r0 = org.apache.commons.net.util.d.a(r0, r1, r2)
            r3.G = r0
        L14:
            return
    }

    private void Z0() throws java.io.IOException {
            r6 = this;
            r6.X0()
            javax.net.ssl.SSLContext r0 = r6.G
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
            boolean r2 = r6.M
            if (r2 == 0) goto L30
            org.apache.commons.net.util.e.a(r0)
        L30:
            java.lang.String[] r2 = r6.I
            if (r2 == 0) goto L37
            r0.setEnabledProtocols(r2)
        L37:
            java.lang.String[] r2 = r6.H
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
            java.lang.String r5 = r6.u
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.w = r2
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.OutputStream r4 = r6.i
            java.lang.String r5 = r6.u
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r6.x = r2
            javax.net.ssl.HostnameVerifier r2 = r6.L
            if (r2 == 0) goto L86
            javax.net.ssl.SSLSession r0 = r0.getSession()
            boolean r0 = r2.verify(r1, r0)
            if (r0 == 0) goto L7e
            goto L86
        L7e:
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r1 = "Hostname doesn't match certificate"
            r0.<init>(r1)
            throw r0
        L86:
            return
    }

    public boolean R0() throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "STARTTLS"
            int r0 = r1.v0(r0)
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r1.Z0()
            r0 = 1
            return r0
    }

    public java.lang.String[] S0() {
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

    public java.lang.String[] T0() {
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

    public javax.net.ssl.HostnameVerifier U0() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.L
            return r0
    }

    public javax.net.ssl.KeyManager V0() {
            r1 = this;
            javax.net.ssl.KeyManager r0 = r1.K
            return r0
    }

    public javax.net.ssl.TrustManager W0() {
            r1 = this;
            javax.net.ssl.TrustManager r0 = r1.J
            return r0
    }

    public boolean Y0() {
            r1 = this;
            boolean r0 = r1.M
            return r0
    }

    public void a1(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.H = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    @Override // org.apache.commons.net.smtp.b, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.E
            if (r0 == 0) goto L7
            r1.Z0()
        L7:
            super.b()
            return
    }

    public void b1(java.lang.String[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.I = r0
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public void c1(boolean r1) {
            r0 = this;
            r0.M = r1
            return
    }

    public void d1(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void e1(javax.net.ssl.KeyManager r1) {
            r0 = this;
            r0.K = r1
            return
    }

    public void f1(javax.net.ssl.TrustManager r1) {
            r0 = this;
            r0.J = r1
            return
    }
}
