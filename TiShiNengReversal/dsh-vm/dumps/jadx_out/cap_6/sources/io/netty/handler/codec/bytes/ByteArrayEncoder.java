package io.netty.handler.codec.bytes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ByteArrayEncoder extends io.netty.handler.codec.MessageToMessageEncoder<byte[]> {
    public ByteArrayEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, byte[] r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            byte[] r2 = (byte[]) r2
            r0.encode2(r1, r2, r3)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, byte[] r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            r3.add(r1)
            return
    }
}
