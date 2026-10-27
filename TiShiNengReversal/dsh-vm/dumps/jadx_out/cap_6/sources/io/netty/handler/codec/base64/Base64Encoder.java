package io.netty.handler.codec.base64;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Base64Encoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.buffer.ByteBuf> {
    private final boolean breakLines;
    private final io.netty.handler.codec.base64.Base64Dialect dialect;

    public Base64Encoder() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public Base64Encoder(boolean r2) {
            r1 = this;
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            r1.<init>(r2, r0)
            return
    }

    public Base64Encoder(boolean r1, io.netty.handler.codec.base64.Base64Dialect r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto La
            r0.breakLines = r1
            r0.dialect = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "dialect"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int r4 = r5.readerIndex()
            int r0 = r5.readableBytes()
            boolean r1 = r3.breakLines
            io.netty.handler.codec.base64.Base64Dialect r2 = r3.dialect
            io.netty.buffer.ByteBuf r4 = io.netty.handler.codec.base64.Base64.encode(r5, r4, r0, r1, r2)
            r6.add(r4)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
