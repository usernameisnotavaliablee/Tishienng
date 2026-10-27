package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UnknownSocksRequest extends io.netty.handler.codec.socks.SocksRequest {
    public UnknownSocksRequest() {
            r1 = this;
            io.netty.handler.codec.socks.SocksRequestType r0 = io.netty.handler.codec.socks.SocksRequestType.UNKNOWN
            r1.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            return
    }
}
