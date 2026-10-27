package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SocksMessage {
    private final io.netty.handler.codec.socks.SocksProtocolVersion protocolVersion;
    private final io.netty.handler.codec.socks.SocksMessageType type;

    protected SocksMessage(io.netty.handler.codec.socks.SocksMessageType r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = io.netty.handler.codec.socks.SocksProtocolVersion.SOCKS5
            r1.protocolVersion = r0
            if (r2 == 0) goto Lc
            r1.type = r2
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "type"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public abstract void encodeAsByteBuf(io.netty.buffer.ByteBuf r1);

    public io.netty.handler.codec.socks.SocksProtocolVersion protocolVersion() {
            r1 = this;
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = r1.protocolVersion
            return r0
    }

    public io.netty.handler.codec.socks.SocksMessageType type() {
            r1 = this;
            io.netty.handler.codec.socks.SocksMessageType r0 = r1.type
            return r0
    }
}
