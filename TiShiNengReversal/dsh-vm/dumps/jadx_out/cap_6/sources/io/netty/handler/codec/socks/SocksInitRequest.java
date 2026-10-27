package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksInitRequest extends io.netty.handler.codec.socks.SocksRequest {
    private final java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> authSchemes;

    public SocksInitRequest(java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> r2) {
            r1 = this;
            io.netty.handler.codec.socks.SocksRequestType r0 = io.netty.handler.codec.socks.SocksRequestType.INIT
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.authSchemes = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "authSchemes"
            r2.<init>(r0)
            throw r2
    }

    public java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> authSchemes() {
            r1 = this;
            java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> r0 = r1.authSchemes
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = r2.protocolVersion()
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> r0 = r2.authSchemes
            int r0 = r0.size()
            r3.writeByte(r0)
            java.util.List<io.netty.handler.codec.socks.SocksAuthScheme> r0 = r2.authSchemes
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.socks.SocksAuthScheme r1 = (io.netty.handler.codec.socks.SocksAuthScheme) r1
            byte r1 = r1.byteValue()
            r3.writeByte(r1)
            goto L1a
        L2e:
            return
    }
}
