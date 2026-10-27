package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufEncoderNano extends io.netty.handler.codec.MessageToMessageEncoder<com.google.protobuf.nano.MessageNano> {
    public ProtobufEncoderNano() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r5, com.google.protobuf.nano.MessageNano r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            int r0 = r6.getSerializedSize()
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            io.netty.buffer.ByteBuf r5 = r5.heapBuffer(r0, r0)
            byte[] r1 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.capacity()
            com.google.protobuf.nano.CodedOutputByteBufferNano r1 = com.google.protobuf.nano.CodedOutputByteBufferNano.newInstance(r1, r2, r3)
            r6.writeTo(r1)
            r5.writerIndex(r0)
            r7.add(r5)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, com.google.protobuf.nano.MessageNano r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            com.google.protobuf.nano.MessageNano r2 = (com.google.protobuf.nano.MessageNano) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
