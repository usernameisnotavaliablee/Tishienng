package io.netty.handler.codec.string;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StringDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> {
    private final java.nio.charset.Charset charset;

    public StringDecoder() {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1.<init>(r0)
            return
    }

    public StringDecoder(java.nio.charset.Charset r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.charset = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "charset"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            java.nio.charset.Charset r1 = r0.charset
            java.lang.String r1 = r2.toString(r1)
            r3.add(r1)
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
