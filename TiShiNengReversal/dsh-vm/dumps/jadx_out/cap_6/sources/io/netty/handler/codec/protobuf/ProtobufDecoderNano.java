package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufDecoderNano extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> {
    private final java.lang.Class<? extends com.google.protobuf.nano.MessageNano> clazz;

    public ProtobufDecoderNano(java.lang.Class<? extends com.google.protobuf.nano.MessageNano> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "You must provide a Class"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.clazz = r2
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int r4 = r5.readableBytes()
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L18
            byte[] r0 = r5.array()
            int r1 = r5.arrayOffset()
            int r5 = r5.readerIndex()
            int r1 = r1 + r5
            goto L21
        L18:
            int r0 = r5.readerIndex()
            r1 = 0
            byte[] r0 = io.netty.buffer.ByteBufUtil.getBytes(r5, r0, r4, r1)
        L21:
            java.lang.Class<? extends com.google.protobuf.nano.MessageNano> r5 = r3.clazz
            r2 = 0
            java.lang.reflect.Constructor r5 = r5.getConstructor(r2)
            java.lang.Object r5 = r5.newInstance(r2)
            com.google.protobuf.nano.MessageNano r5 = (com.google.protobuf.nano.MessageNano) r5
            com.google.protobuf.nano.MessageNano r4 = com.google.protobuf.nano.MessageNano.mergeFrom(r5, r0, r1, r4)
            r6.add(r4)
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
