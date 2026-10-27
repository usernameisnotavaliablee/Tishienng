package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class JdkBaseApplicationProtocolNegotiator implements io.netty.handler.ssl.JdkApplicationProtocolNegotiator {
    static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory FAIL_SELECTION_LISTENER_FACTORY = null;
    static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory FAIL_SELECTOR_FACTORY = null;
    static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory NO_FAIL_SELECTION_LISTENER_FACTORY = null;
    static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory NO_FAIL_SELECTOR_FACTORY = null;
    private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory listenerFactory;
    private final java.util.List<java.lang.String> protocols;
    private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory selectorFactory;
    private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class FailProtocolSelectionListener extends io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NoFailProtocolSelectionListener {
        FailProtocolSelectionListener(io.netty.handler.ssl.JdkSslEngine r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NoFailProtocolSelectionListener
        protected void noSelectedMatchFound(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                javax.net.ssl.SSLHandshakeException r2 = new javax.net.ssl.SSLHandshakeException
                java.lang.String r0 = "No compatible protocols found"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class FailProtocolSelector extends io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NoFailProtocolSelector {
        FailProtocolSelector(io.netty.handler.ssl.JdkSslEngine r1, java.util.Set<java.lang.String> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NoFailProtocolSelector
        public java.lang.String noSelectMatchFound() throws java.lang.Exception {
                r2 = this;
                javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
                java.lang.String r1 = "Selected protocol is not supported"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class NoFailProtocolSelectionListener implements io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener {
        private final io.netty.handler.ssl.JdkSslEngine engineWrapper;
        private final java.util.List<java.lang.String> supportedProtocols;

        NoFailProtocolSelectionListener(io.netty.handler.ssl.JdkSslEngine r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.engineWrapper = r1
                r0.supportedProtocols = r2
                return
        }

        protected void noSelectedMatchFound(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener
        public void selected(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.supportedProtocols
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Le
                io.netty.handler.ssl.JdkSslEngine r0 = r1.engineWrapper
                r0.setNegotiatedApplicationProtocol(r2)
                return
            Le:
                r1.noSelectedMatchFound(r2)
                return
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener
        public void unsupported() {
                r2 = this;
                io.netty.handler.ssl.JdkSslEngine r0 = r2.engineWrapper
                r1 = 0
                r0.setNegotiatedApplicationProtocol(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class NoFailProtocolSelector implements io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector {
        private final io.netty.handler.ssl.JdkSslEngine engineWrapper;
        private final java.util.Set<java.lang.String> supportedProtocols;

        NoFailProtocolSelector(io.netty.handler.ssl.JdkSslEngine r1, java.util.Set<java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.engineWrapper = r1
                r0.supportedProtocols = r2
                return
        }

        public java.lang.String noSelectMatchFound() throws java.lang.Exception {
                r2 = this;
                io.netty.handler.ssl.JdkSslEngine r0 = r2.engineWrapper
                r1 = 0
                r0.setNegotiatedApplicationProtocol(r1)
                return r1
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector
        public java.lang.String select(java.util.List<java.lang.String> r4) throws java.lang.Exception {
                r3 = this;
                java.util.Set<java.lang.String> r0 = r3.supportedProtocols
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                boolean r2 = r4.contains(r1)
                if (r2 == 0) goto L6
                io.netty.handler.ssl.JdkSslEngine r4 = r3.engineWrapper
                r4.setNegotiatedApplicationProtocol(r1)
                return r1
            L1e:
                java.lang.String r4 = r3.noSelectMatchFound()
                return r4
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector
        public void unsupported() {
                r2 = this;
                io.netty.handler.ssl.JdkSslEngine r0 = r2.engineWrapper
                r1 = 0
                r0.setNegotiatedApplicationProtocol(r1)
                return
        }
    }

    static {
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$1 r0 = new io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$1
            r0.<init>()
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTOR_FACTORY = r0
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$2 r0 = new io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$2
            r0.<init>()
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTOR_FACTORY = r0
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$3 r0 = new io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$3
            r0.<init>()
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTION_LISTENER_FACTORY = r0
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$4 r0 = new io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator$4
            r0.<init>()
            io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTION_LISTENER_FACTORY = r0
            return
    }

    JdkBaseApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.Iterable<java.lang.String> r4) {
            r0 = this;
            java.util.List r4 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private JdkBaseApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r3, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r4, java.util.List<java.lang.String> r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "wrapperFactory"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r2 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory) r2
            r1.wrapperFactory = r2
            java.lang.String r2 = "selectorFactory"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r2 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory) r2
            r1.selectorFactory = r2
            java.lang.String r2 = "listenerFactory"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r2 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory) r2
            r1.listenerFactory = r2
            java.lang.String r2 = "protocols"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r2)
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.protocols = r2
            return
    }

    JdkBaseApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.String... r4) {
            r0 = this;
            java.util.List r4 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory protocolListenerFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r0 = r1.listenerFactory
            return r0
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory protocolSelectorFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r0 = r1.selectorFactory
            return r0
    }

    @Override // io.netty.handler.ssl.ApplicationProtocolNegotiator
    public java.util.List<java.lang.String> protocols() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.protocols
            return r0
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = r1.wrapperFactory
            return r0
    }
}
