package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class JdkSslEngine extends javax.net.ssl.SSLEngine implements io.netty.handler.ssl.ApplicationProtocolAccessor {
    private volatile java.lang.String applicationProtocol;
    private final javax.net.ssl.SSLEngine engine;

    JdkSslEngine(javax.net.ssl.SSLEngine r1) {
            r0 = this;
            r0.<init>()
            r0.engine = r1
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.beginHandshake()
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.closeInbound()
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.closeOutbound()
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.Runnable getDelegatedTask() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.Runnable r0 = r0.getDelegatedTask()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.getEnableSessionCreation()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String[] getEnabledCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.String[] r0 = r0.getEnabledCipherSuites()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String[] getEnabledProtocols() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.String[] r0 = r0.getEnabledProtocols()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLSession getHandshakeSession() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLSession r0 = io.netty.handler.ssl.r.a(r0)
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.getNeedClientAuth()
            return r0
    }

    public java.lang.String getNegotiatedApplicationProtocol() {
            r1 = this;
            java.lang.String r0 = r1.applicationProtocol
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String getPeerHost() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.String r0 = r0.getPeerHost()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public int getPeerPort() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            int r0 = r0.getPeerPort()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLParameters getSSLParameters() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLParameters r0 = r0.getSSLParameters()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLSession getSession() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLSession r0 = r0.getSession()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.String[] r0 = r0.getSupportedCipherSuites()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String[] getSupportedProtocols() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            java.lang.String[] r0 = r0.getSupportedProtocols()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.getUseClientMode()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.getWantClientAuth()
            return r0
    }

    public javax.net.ssl.SSLEngine getWrappedEngine() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.isInboundDone()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.isOutboundDone()
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setEnableSessionCreation(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(java.lang.String[] r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setEnabledCipherSuites(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(java.lang.String[] r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setEnabledProtocols(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setNeedClientAuth(r2)
            return
    }

    void setNegotiatedApplicationProtocol(java.lang.String r1) {
            r0 = this;
            r0.applicationProtocol = r1
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setSSLParameters(javax.net.ssl.SSLParameters r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setSSLParameters(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setUseClientMode(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            r0.setWantClientAuth(r2)
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r2, java.nio.ByteBuffer r3) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.unwrap(r2, r3)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r2, java.nio.ByteBuffer[] r3) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.unwrap(r2, r3)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r2, java.nio.ByteBuffer[] r3, int r4, int r5) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.unwrap(r2, r3, r4, r5)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer r2, java.nio.ByteBuffer r3) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.wrap(r2, r3)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r2, int r3, int r4, java.nio.ByteBuffer r5) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.wrap(r2, r3, r4, r5)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r2, java.nio.ByteBuffer r3) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            javax.net.ssl.SSLEngineResult r2 = r0.wrap(r2, r3)
            return r2
    }
}
