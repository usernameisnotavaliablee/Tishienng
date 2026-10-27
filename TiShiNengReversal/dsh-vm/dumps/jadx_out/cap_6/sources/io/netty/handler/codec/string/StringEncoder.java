package io.netty.handler.codec.string;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StringEncoder extends io.netty.handler.codec.MessageToMessageEncoder<java.lang.CharSequence> {
    private final java.nio.charset.Charset charset;

    public StringEncoder() {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1.<init>(r0)
            return
    }

    public StringEncoder(java.nio.charset.Charset r2) {
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

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, java.lang.CharSequence r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            int r0 = r3.length()
            if (r0 != 0) goto L7
            return
        L7:
            io.netty.buffer.ByteBufAllocator r2 = r2.alloc()
            java.nio.CharBuffer r3 = java.nio.CharBuffer.wrap(r3)
            java.nio.charset.Charset r0 = r1.charset
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.ByteBufUtil.encodeString(r2, r3, r0)
            r4.add(r2)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, java.lang.CharSequence r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
