package io.netty.handler.codec.string;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LineEncoder extends io.netty.handler.codec.MessageToMessageEncoder<java.lang.CharSequence> {
    private final java.nio.charset.Charset charset;
    private final byte[] lineSeparator;

    public LineEncoder() {
            r2 = this;
            io.netty.handler.codec.string.LineSeparator r0 = io.netty.handler.codec.string.LineSeparator.DEFAULT
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            r2.<init>(r0, r1)
            return
    }

    public LineEncoder(io.netty.handler.codec.string.LineSeparator r2) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            r1.<init>(r2, r0)
            return
    }

    public LineEncoder(io.netty.handler.codec.string.LineSeparator r2, java.nio.charset.Charset r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "charset"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
            r1.charset = r0
            java.lang.String r0 = "lineSeparator"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.string.LineSeparator r2 = (io.netty.handler.codec.string.LineSeparator) r2
            java.lang.String r2 = r2.value()
            byte[] r2 = r2.getBytes(r3)
            r1.lineSeparator = r2
            return
    }

    public LineEncoder(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.handler.codec.string.LineSeparator r0 = io.netty.handler.codec.string.LineSeparator.DEFAULT
            r1.<init>(r0, r2)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, java.lang.CharSequence r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            io.netty.buffer.ByteBufAllocator r3 = r3.alloc()
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r4)
            java.nio.charset.Charset r0 = r2.charset
            byte[] r1 = r2.lineSeparator
            int r1 = r1.length
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.ByteBufUtil.encodeString(r3, r4, r0, r1)
            byte[] r4 = r2.lineSeparator
            r3.writeBytes(r4)
            r5.add(r3)
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
