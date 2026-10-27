package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslNpnApplicationProtocolNegotiator implements io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator {
    private final java.util.List<java.lang.String> protocols;

    public OpenSslNpnApplicationProtocolNegotiator(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            r1.<init>()
            java.util.List r2 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r2)
            java.lang.String r0 = "protocols"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.List r2 = (java.util.List) r2
            r1.protocols = r2
            return
    }

    public OpenSslNpnApplicationProtocolNegotiator(java.lang.String... r2) {
            r1 = this;
            r1.<init>()
            java.util.List r2 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r2)
            java.lang.String r0 = "protocols"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.List r2 = (java.util.List) r2
            r1.protocols = r2
            return
    }

    @Override // io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
    public io.netty.handler.ssl.ApplicationProtocolConfig.Protocol protocol() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN
            return r0
    }

    @Override // io.netty.handler.ssl.ApplicationProtocolNegotiator
    public java.util.List<java.lang.String> protocols() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.protocols
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
    public io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator
    public io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL
            return r0
    }
}
