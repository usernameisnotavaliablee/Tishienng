package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface OpenSslApplicationProtocolNegotiator extends io.netty.handler.ssl.ApplicationProtocolNegotiator {
    io.netty.handler.ssl.ApplicationProtocolConfig.Protocol protocol();

    io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior();

    io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior();
}
