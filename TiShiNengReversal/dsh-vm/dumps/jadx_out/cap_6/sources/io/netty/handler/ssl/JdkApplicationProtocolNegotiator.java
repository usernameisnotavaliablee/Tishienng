package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface JdkApplicationProtocolNegotiator extends io.netty.handler.ssl.ApplicationProtocolNegotiator {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class AllocatorAwareSslEngineWrapperFactory implements io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory {
        public AllocatorAwareSslEngineWrapperFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract javax.net.ssl.SSLEngine wrapSslEngine(javax.net.ssl.SSLEngine r1, io.netty.buffer.ByteBufAllocator r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3, boolean r4);

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory
        public final javax.net.ssl.SSLEngine wrapSslEngine(javax.net.ssl.SSLEngine r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3, boolean r4) {
                r1 = this;
                io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.ByteBufAllocator.DEFAULT
                javax.net.ssl.SSLEngine r2 = r1.wrapSslEngine(r2, r0, r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProtocolSelectionListener {
        void selected(java.lang.String r1) throws java.lang.Exception;

        void unsupported();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProtocolSelectionListenerFactory {
        io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener newListener(javax.net.ssl.SSLEngine r1, java.util.List<java.lang.String> r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProtocolSelector {
        java.lang.String select(java.util.List<java.lang.String> r1) throws java.lang.Exception;

        void unsupported();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ProtocolSelectorFactory {
        io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector newSelector(javax.net.ssl.SSLEngine r1, java.util.Set<java.lang.String> r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SslEngineWrapperFactory {
        javax.net.ssl.SSLEngine wrapSslEngine(javax.net.ssl.SSLEngine r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r2, boolean r3);
    }

    io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory protocolListenerFactory();

    io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory protocolSelectorFactory();

    io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory();
}
