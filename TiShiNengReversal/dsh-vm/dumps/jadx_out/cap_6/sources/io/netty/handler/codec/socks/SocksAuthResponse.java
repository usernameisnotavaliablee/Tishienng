package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksAuthResponse extends io.netty.handler.codec.socks.SocksResponse {
    private static final io.netty.handler.codec.socks.SocksSubnegotiationVersion SUBNEGOTIATION_VERSION = null;
    private final io.netty.handler.codec.socks.SocksAuthStatus authStatus;

    static {
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.AUTH_PASSWORD
            io.netty.handler.codec.socks.SocksAuthResponse.SUBNEGOTIATION_VERSION = r0
            return
    }

    public SocksAuthResponse(io.netty.handler.codec.socks.SocksAuthStatus r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksResponseType r0 = io.netty.handler.codec.socks.SocksResponseType.AUTH
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.authStatus = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "authStatus"
            r2.<init>(r0)
            throw r2
    }

    public io.netty.handler.codec.socks.SocksAuthStatus authStatus() {
            r1 = this;
            io.netty.handler.codec.socks.SocksAuthStatus r0 = r1.authStatus
            return r0
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = io.netty.handler.codec.socks.SocksAuthResponse.SUBNEGOTIATION_VERSION
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            io.netty.handler.codec.socks.SocksAuthStatus r0 = r1.authStatus
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            return
    }
}
