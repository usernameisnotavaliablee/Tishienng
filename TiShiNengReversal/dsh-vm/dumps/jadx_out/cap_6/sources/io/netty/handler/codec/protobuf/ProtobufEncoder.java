package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufEncoder extends io.netty.handler.codec.MessageToMessageEncoder<com.google.protobuf.MessageLiteOrBuilder> {
    public ProtobufEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, com.google.protobuf.MessageLiteOrBuilder r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r2 instanceof com.google.protobuf.MessageLite
            if (r1 == 0) goto L12
            com.google.protobuf.MessageLite r2 = (com.google.protobuf.MessageLite) r2
            byte[] r1 = r2.toByteArray()
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r1)
            r3.add(r1)
            return
        L12:
            boolean r1 = r2 instanceof com.google.protobuf.MessageLite.Builder
            if (r1 == 0) goto L27
            com.google.protobuf.MessageLite$Builder r2 = (com.google.protobuf.MessageLite.Builder) r2
            com.google.protobuf.MessageLite r1 = r2.build()
            byte[] r1 = r1.toByteArray()
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r1)
            r3.add(r1)
        L27:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, com.google.protobuf.MessageLiteOrBuilder r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            com.google.protobuf.MessageLiteOrBuilder r2 = (com.google.protobuf.MessageLiteOrBuilder) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
