package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SocksRequest extends io.netty.handler.codec.socks.SocksMessage {
    private final io.netty.handler.codec.socks.SocksRequestType requestType;

    protected SocksRequest(io.netty.handler.codec.socks.SocksRequestType r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksMessageType r0 = io.netty.handler.codec.socks.SocksMessageType.REQUEST
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.requestType = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "requestType"
            r2.<init>(r0)
            throw r2
    }

    public io.netty.handler.codec.socks.SocksRequestType requestType() {
            r1 = this;
            io.netty.handler.codec.socks.SocksRequestType r0 = r1.requestType
            return r0
    }
}
