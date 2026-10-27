package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Java9SslEngine extends io.netty.handler.ssl.JdkSslEngine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final io.netty.handler.ssl.Java9SslEngine.AlpnSelector alpnSelector;
    private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener selectionListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AlpnSelector implements java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean called;
        private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector selector;
        final /* synthetic */ io.netty.handler.ssl.Java9SslEngine this$0;

        static {
                return
        }

        AlpnSelector(io.netty.handler.ssl.Java9SslEngine r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.selector = r2
                return
        }

        @Override // java.util.function.BiFunction
        public /* bridge */ /* synthetic */ java.lang.String apply(javax.net.ssl.SSLEngine r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                javax.net.ssl.SSLEngine r1 = (javax.net.ssl.SSLEngine) r1
                java.util.List r2 = (java.util.List) r2
                java.lang.String r1 = r0.apply2(r1, r2)
                return r1
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public java.lang.String apply2(javax.net.ssl.SSLEngine r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r1 = 1
                r0.called = r1
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r1 = r0.selector     // Catch: java.lang.Exception -> Le
                java.lang.String r1 = r1.select(r2)     // Catch: java.lang.Exception -> Le
                if (r1 != 0) goto Ld
                java.lang.String r1 = ""
            Ld:
                return r1
            Le:
                r1 = 0
                return r1
        }

        void checkUnsupported() {
                r1 = this;
                boolean r0 = r1.called
                if (r0 == 0) goto L5
                goto L16
            L5:
                io.netty.handler.ssl.Java9SslEngine r0 = r1.this$0
                java.lang.String r0 = r0.getApplicationProtocol()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r0 = r1.selector
                r0.unsupported()
            L16:
                return
        }
    }

    static {
            return
    }

    Java9SslEngine(javax.net.ssl.SSLEngine r3, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r4, boolean r5) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            if (r5 == 0) goto L24
            r2.selectionListener = r0
            io.netty.handler.ssl.Java9SslEngine$AlpnSelector r5 = new io.netty.handler.ssl.Java9SslEngine$AlpnSelector
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r0 = r4.protocolSelectorFactory()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            java.util.List r4 = r4.protocols()
            r1.<init>(r4)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r4 = r0.newSelector(r2, r1)
            r5.<init>(r2, r4)
            r2.alpnSelector = r5
            io.netty.handler.ssl.Java9SslUtils.setHandshakeApplicationProtocolSelector(r3, r5)
            return
        L24:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r5 = r4.protocolListenerFactory()
            java.util.List r1 = r4.protocols()
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r5 = r5.newListener(r2, r1)
            r2.selectionListener = r5
            r2.alpnSelector = r0
            java.util.List r4 = r4.protocols()
            io.netty.handler.ssl.Java9SslUtils.setApplicationProtocols(r3, r4)
            return
    }

    private javax.net.ssl.SSLEngineResult verifyProtocolSelection(javax.net.ssl.SSLEngineResult r3) throws javax.net.ssl.SSLException {
            r2 = this;
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r3.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r0 != r1) goto L2c
            io.netty.handler.ssl.Java9SslEngine$AlpnSelector r0 = r2.alpnSelector
            if (r0 != 0) goto L29
            java.lang.String r0 = r2.getApplicationProtocol()     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r0 = r2.selectionListener     // Catch: java.lang.Throwable -> L1c
            r0.unsupported()     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            goto L24
        L1e:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r1 = r2.selectionListener     // Catch: java.lang.Throwable -> L1c
            r1.selected(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L24:
            javax.net.ssl.SSLHandshakeException r3 = io.netty.handler.ssl.SslUtils.toSSLHandshakeException(r3)
            throw r3
        L29:
            r0.checkUnsupported()
        L2c:
            return r3
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String getApplicationProtocol() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            java.lang.String r0 = io.netty.handler.ssl.Java9SslUtils.getApplicationProtocol(r0)
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.lang.String getHandshakeApplicationProtocol() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            java.lang.String r0 = io.netty.handler.ssl.Java9SslUtils.getHandshakeApplicationProtocol(r0)
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> getHandshakeApplicationProtocolSelector() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            java.util.function.BiFunction r0 = io.netty.handler.ssl.Java9SslUtils.getHandshakeApplicationProtocolSelector(r0)
            return r0
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, io.netty.handler.ssl.ApplicationProtocolAccessor
    public java.lang.String getNegotiatedApplicationProtocol() {
            r2 = this;
            java.lang.String r0 = r2.getApplicationProtocol()
            if (r0 == 0) goto Ld
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            r0 = 0
        Ld:
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public void setHandshakeApplicationProtocolSelector(java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            io.netty.handler.ssl.Java9SslUtils.setHandshakeApplicationProtocolSelector(r0, r2)
            return
    }

    @Override // io.netty.handler.ssl.JdkSslEngine
    void setNegotiatedApplicationProtocol(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer r2) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.unwrap(r1, r2)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer[] r2) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.unwrap(r1, r2)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer[] r2, int r3, int r4) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.unwrap(r1, r2, r3, r4)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer r2) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.wrap(r1, r2)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r1, int r2, int r3, java.nio.ByteBuffer r4) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.wrap(r1, r2, r3, r4)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r1, java.nio.ByteBuffer r2) throws javax.net.ssl.SSLException {
            r0 = this;
            javax.net.ssl.SSLEngineResult r1 = super.wrap(r1, r2)
            javax.net.ssl.SSLEngineResult r1 = r0.verifyProtocolSelection(r1)
            return r1
    }
}
