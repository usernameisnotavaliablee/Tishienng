package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslTlsv13X509ExtendedTrustManager extends javax.net.ssl.X509ExtendedTrustManager {
    private final javax.net.ssl.X509ExtendedTrustManager tm;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DummySSLEngine extends javax.net.ssl.SSLEngine {
        private final boolean client;


        DummySSLEngine(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.client = r1
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void beginHandshake() throws javax.net.ssl.SSLException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void closeInbound() throws javax.net.ssl.SSLException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void closeOutbound() {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public java.lang.Runnable getDelegatedTask() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean getEnableSessionCreation() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public java.lang.String[] getEnabledCipherSuites() {
                r1 = this;
                java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public java.lang.String[] getEnabledProtocols() {
                r1 = this;
                java.lang.String r0 = "TLSv1.3"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public javax.net.ssl.SSLSession getHandshakeSession() {
                r1 = this;
                io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine$1 r0 = new io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine$1
                r0.<init>(r1)
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() {
                r1 = this;
                javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean getNeedClientAuth() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public javax.net.ssl.SSLSession getSession() {
                r1 = this;
                javax.net.ssl.SSLSession r0 = r1.getHandshakeSession()
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public java.lang.String[] getSupportedCipherSuites() {
                r1 = this;
                java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public java.lang.String[] getSupportedProtocols() {
                r1 = this;
                java.lang.String r0 = "TLSv1.3"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean getUseClientMode() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean getWantClientAuth() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean isInboundDone() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public boolean isOutboundDone() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // javax.net.ssl.SSLEngine
        public void setEnableSessionCreation(boolean r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void setEnabledCipherSuites(java.lang.String[] r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void setEnabledProtocols(java.lang.String[] r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void setNeedClientAuth(boolean r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void setUseClientMode(boolean r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public void setWantClientAuth(boolean r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLEngine
        public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer[] r2, int r3, int r4) throws javax.net.ssl.SSLException {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // javax.net.ssl.SSLEngine
        public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r1, int r2, int r3, java.nio.ByteBuffer r4) throws javax.net.ssl.SSLException {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    private OpenSslTlsv13X509ExtendedTrustManager(javax.net.ssl.X509ExtendedTrustManager r1) {
            r0 = this;
            r0.<init>()
            r0.tm = r1
            return
    }

    static javax.net.ssl.X509ExtendedTrustManager wrap(javax.net.ssl.X509ExtendedTrustManager r4, boolean r5) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 11
            if (r0 >= r1) goto L2e
            java.security.cert.X509Certificate r0 = io.netty.handler.ssl.OpenSsl.selfSignedCertificate()     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            r1 = 1
            java.security.cert.X509Certificate[] r2 = new java.security.cert.X509Certificate[r1]     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            java.lang.String r0 = "RSA"
            if (r5 == 0) goto L1f
            io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine r5 = new io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            r5.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            io.netty.handler.ssl.s.a(r4, r2, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            return r4
        L1f:
            io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine r5 = new io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$DummySSLEngine     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            r5.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            io.netty.handler.ssl.t.a(r4, r2, r0, r5)     // Catch: java.lang.IllegalArgumentException -> L28 java.lang.Throwable -> L2e
            return r4
        L28:
            io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager r5 = new io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager
            r5.<init>(r4)
            return r5
        L2e:
            return r4
    }

    private static javax.net.ssl.SSLEngine wrapEngine(javax.net.ssl.SSLEngine r3) {
            javax.net.ssl.SSLSession r0 = io.netty.handler.ssl.r.a(r3)
            if (r0 == 0) goto L18
            java.lang.String r1 = "TLSv1.3"
            java.lang.String r2 = r0.getProtocol()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L18
            io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$1 r1 = new io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager$1
            r1.<init>(r3, r3, r0)
            return r1
        L18:
            return r3
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            r0.checkClientTrusted(r2, r3)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3, java.net.Socket r4) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            io.netty.handler.ssl.u.a(r0, r2, r3, r4)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3, javax.net.ssl.SSLEngine r4) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            javax.net.ssl.SSLEngine r4 = wrapEngine(r4)
            io.netty.handler.ssl.t.a(r0, r2, r3, r4)
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            r0.checkServerTrusted(r2, r3)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3, java.net.Socket r4) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            io.netty.handler.ssl.v.a(r0, r2, r3, r4)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3, javax.net.ssl.SSLEngine r4) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            javax.net.ssl.SSLEngine r4 = wrapEngine(r4)
            io.netty.handler.ssl.s.a(r0, r2, r3, r4)
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r1 = this;
            javax.net.ssl.X509ExtendedTrustManager r0 = r1.tm
            java.security.cert.X509Certificate[] r0 = r0.getAcceptedIssuers()
            return r0
    }
}
