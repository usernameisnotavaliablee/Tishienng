package io.netty.handler.codec.base64;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Base64Decoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> {
    private final io.netty.handler.codec.base64.Base64Dialect dialect;

    public Base64Decoder() {
            r1 = this;
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            r1.<init>(r0)
            return
    }

    public Base64Decoder(io.netty.handler.codec.base64.Base64Dialect r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.dialect = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "dialect"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int r3 = r4.readerIndex()
            int r0 = r4.readableBytes()
            io.netty.handler.codec.base64.Base64Dialect r1 = r2.dialect
            io.netty.buffer.ByteBuf r3 = io.netty.handler.codec.base64.Base64.decode(r4, r3, r0, r1)
            r5.add(r3)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.decode2(r1, r2, r3)
            return
    }
}
