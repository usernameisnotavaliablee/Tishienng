package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class JdkNpnApplicationProtocolNegotiator extends io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator {
    private static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory NPN_WRAPPER = null;


    static {
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator$1 r0 = new io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator$1
            r0.<init>()
            io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator.NPN_WRAPPER = r0
            return
    }

    public JdkNpnApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.Iterable<java.lang.String> r4) {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator.NPN_WRAPPER
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.String... r4) {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = io.netty.handler.ssl.JdkNpnApplicationProtocolNegotiator.NPN_WRAPPER
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(boolean r1, java.lang.Iterable<java.lang.String> r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(boolean r1, boolean r2, java.lang.Iterable<java.lang.String> r3) {
            r0 = this;
            if (r1 == 0) goto L5
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTOR_FACTORY
            goto L7
        L5:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTOR_FACTORY
        L7:
            if (r2 == 0) goto Lc
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTION_LISTENER_FACTORY
            goto Le
        Lc:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTION_LISTENER_FACTORY
        Le:
            r0.<init>(r1, r2, r3)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(boolean r1, boolean r2, java.lang.String... r3) {
            r0 = this;
            if (r1 == 0) goto L5
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTOR_FACTORY
            goto L7
        L5:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTOR_FACTORY
        L7:
            if (r2 == 0) goto Lc
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTION_LISTENER_FACTORY
            goto Le
        Lc:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTION_LISTENER_FACTORY
        Le:
            r0.<init>(r1, r2, r3)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(boolean r1, java.lang.String... r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    public JdkNpnApplicationProtocolNegotiator(java.lang.String... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory protocolListenerFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r0 = super.protocolListenerFactory()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory protocolSelectorFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r0 = super.protocolSelectorFactory()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.ApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ java.util.List protocols() {
            r1 = this;
            java.util.List r0 = super.protocols()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = super.wrapperFactory()
            return r0
    }
}
