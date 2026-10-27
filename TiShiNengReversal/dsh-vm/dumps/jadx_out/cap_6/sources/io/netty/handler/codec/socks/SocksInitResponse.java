package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksInitResponse extends io.netty.handler.codec.socks.SocksResponse {
    private final io.netty.handler.codec.socks.SocksAuthScheme authScheme;

    public SocksInitResponse(io.netty.handler.codec.socks.SocksAuthScheme r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksResponseType r0 = io.netty.handler.codec.socks.SocksResponseType.INIT
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.authScheme = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "authScheme"
            r2.<init>(r0)
            throw r2
    }

    public io.netty.handler.codec.socks.SocksAuthScheme authScheme() {
            r1 = this;
            io.netty.handler.codec.socks.SocksAuthScheme r0 = r1.authScheme
            return r0
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = r1.protocolVersion()
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            io.netty.handler.codec.socks.SocksAuthScheme r0 = r1.authScheme
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            return
    }
}
