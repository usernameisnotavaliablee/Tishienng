package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SocksResponse extends io.netty.handler.codec.socks.SocksMessage {
    private final io.netty.handler.codec.socks.SocksResponseType responseType;

    protected SocksResponse(io.netty.handler.codec.socks.SocksResponseType r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksMessageType r0 = io.netty.handler.codec.socks.SocksMessageType.RESPONSE
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.responseType = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "responseType"
            r2.<init>(r0)
            throw r2
    }

    public io.netty.handler.codec.socks.SocksResponseType responseType() {
            r1 = this;
            io.netty.handler.codec.socks.SocksResponseType r0 = r1.responseType
            return r0
    }
}
