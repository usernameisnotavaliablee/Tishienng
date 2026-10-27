package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class JdkDefaultApplicationProtocolNegotiator implements io.netty.handler.ssl.JdkApplicationProtocolNegotiator {
    private static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory DEFAULT_SSL_ENGINE_WRAPPER_FACTORY = null;
    public static final io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator INSTANCE = null;


    static {
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r0 = new io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator
            r0.<init>()
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE = r0
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1 r0 = new io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator$1
            r0.<init>()
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.DEFAULT_SSL_ENGINE_WRAPPER_FACTORY = r0
            return
    }

    private JdkDefaultApplicationProtocolNegotiator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory protocolListenerFactory() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Application protocol negotiation unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory protocolSelectorFactory() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Application protocol negotiation unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.ssl.ApplicationProtocolNegotiator
    public java.util.List<java.lang.String> protocols() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.DEFAULT_SSL_ENGINE_WRAPPER_FACTORY
            return r0
    }
}
