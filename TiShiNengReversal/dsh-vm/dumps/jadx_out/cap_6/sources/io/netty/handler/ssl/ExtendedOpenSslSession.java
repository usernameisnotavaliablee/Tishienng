package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class ExtendedOpenSslSession extends javax.net.ssl.ExtendedSSLSession implements io.netty.handler.ssl.OpenSslSession {
    private static final java.lang.String[] LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = null;
    private final io.netty.handler.ssl.OpenSslSession wrapped;

    static {
            java.lang.String r8 = "SHA1withRSA"
            java.lang.String r9 = "SHA1withECDSA"
            java.lang.String r0 = "SHA512withRSA"
            java.lang.String r1 = "SHA512withECDSA"
            java.lang.String r2 = "SHA384withRSA"
            java.lang.String r3 = "SHA384withECDSA"
            java.lang.String r4 = "SHA256withRSA"
            java.lang.String r5 = "SHA256withECDSA"
            java.lang.String r6 = "SHA224withRSA"
            java.lang.String r7 = "SHA224withECDSA"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            io.netty.handler.ssl.ExtendedOpenSslSession.LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = r0
            return
    }

    ExtendedOpenSslSession(io.netty.handler.ssl.OpenSslSession r1) {
            r0 = this;
            r0.<init>()
            r0.wrapped = r1
            return
    }

    @Override // javax.net.ssl.SSLSession
    public final int getApplicationBufferSize() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            int r0 = r0.getApplicationBufferSize()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.lang.String getCipherSuite() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.lang.String r0 = r0.getCipherSuite()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final long getCreationTime() {
            r2 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r2.wrapped
            long r0 = r0.getCreationTime()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final byte[] getId() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            byte[] r0 = r0.getId()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final long getLastAccessedTime() {
            r2 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r2.wrapped
            long r0 = r0.getLastAccessedTime()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.security.cert.Certificate[] getLocalCertificates() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.security.cert.Certificate[] r0 = r0.getLocalCertificates()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.security.Principal getLocalPrincipal() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.security.Principal r0 = r0.getLocalPrincipal()
            return r0
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final java.lang.String[] getLocalSupportedSignatureAlgorithms() {
            r1 = this;
            java.lang.String[] r0 = io.netty.handler.ssl.ExtendedOpenSslSession.LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPacketBufferSize() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            int r0 = r0.getPacketBufferSize()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            javax.security.cert.X509Certificate[] r0 = r0.getPeerCertificateChain()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.security.cert.Certificate[] r0 = r0.getPeerCertificates()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.lang.String getPeerHost() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.lang.String r0 = r0.getPeerHost()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPeerPort() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            int r0 = r0.getPeerPort()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.security.Principal r0 = r0.getPeerPrincipal()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public java.lang.String getProtocol() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.lang.String r0 = r0.getProtocol()
            return r0
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public abstract java.util.List getRequestedServerNames();

    @Override // javax.net.ssl.SSLSession
    public final javax.net.ssl.SSLSessionContext getSessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            javax.net.ssl.SSLSessionContext r0 = r0.getSessionContext()
            return r0
    }

    public java.util.List<byte[]> getStatusResponses() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final java.lang.Object getValue(java.lang.String r2) {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.lang.Object r2 = r0.getValue(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSession
    public final java.lang.String[] getValueNames() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            java.lang.String[] r0 = r0.getValueNames()
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslSession
    public final void handshakeFinished() throws javax.net.ssl.SSLException {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            r0.handshakeFinished()
            return
    }

    @Override // javax.net.ssl.SSLSession
    public final void invalidate() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            r0.invalidate()
            return
    }

    @Override // javax.net.ssl.SSLSession
    public final boolean isValid() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // javax.net.ssl.SSLSession
    public final void putValue(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            r0.putValue(r2, r3)
            return
    }

    @Override // javax.net.ssl.SSLSession
    public final void removeValue(java.lang.String r2) {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            r0.removeValue(r2)
            return
    }

    @Override // io.netty.handler.ssl.OpenSslSession
    public final void tryExpandApplicationBufferSize(int r2) {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.wrapped
            r0.tryExpandApplicationBufferSize(r2)
            return
    }
}
