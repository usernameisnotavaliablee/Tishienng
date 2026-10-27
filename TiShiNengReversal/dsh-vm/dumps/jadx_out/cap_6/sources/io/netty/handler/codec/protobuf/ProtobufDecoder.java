package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> {
    private static final boolean HAS_PARSER = false;
    private final com.google.protobuf.ExtensionRegistryLite extensionRegistry;
    private final com.google.protobuf.MessageLite prototype;

    static {
            java.lang.Class<com.google.protobuf.MessageLite> r0 = com.google.protobuf.MessageLite.class
            java.lang.String r1 = "getParserForType"
            r2 = 0
            r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            io.netty.handler.codec.protobuf.ProtobufDecoder.HAS_PARSER = r0
            return
    }

    public ProtobufDecoder(com.google.protobuf.MessageLite r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ProtobufDecoder(com.google.protobuf.MessageLite r1, com.google.protobuf.ExtensionRegistry r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ProtobufDecoder(com.google.protobuf.MessageLite r1, com.google.protobuf.ExtensionRegistryLite r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Le
            com.google.protobuf.MessageLite r1 = r1.getDefaultInstanceForType()
            r0.prototype = r1
            r0.extensionRegistry = r2
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "prototype"
            r1.<init>(r2)
            throw r1
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
            com.google.protobuf.ExtensionRegistryLite r5 = r3.extensionRegistry
            if (r5 != 0) goto L49
            boolean r5 = io.netty.handler.codec.protobuf.ProtobufDecoder.HAS_PARSER
            if (r5 == 0) goto L37
            com.google.protobuf.MessageLite r5 = r3.prototype
            com.google.protobuf.Parser r5 = r5.getParserForType()
            java.lang.Object r4 = r5.parseFrom(r0, r1, r4)
            r6.add(r4)
            return
        L37:
            com.google.protobuf.MessageLite r5 = r3.prototype
            com.google.protobuf.MessageLite$Builder r5 = r5.newBuilderForType()
            com.google.protobuf.MessageLite$Builder r4 = r5.mergeFrom(r0, r1, r4)
            com.google.protobuf.MessageLite r4 = r4.build()
            r6.add(r4)
            return
        L49:
            boolean r5 = io.netty.handler.codec.protobuf.ProtobufDecoder.HAS_PARSER
            if (r5 == 0) goto L5d
            com.google.protobuf.MessageLite r5 = r3.prototype
            com.google.protobuf.Parser r5 = r5.getParserForType()
            com.google.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry
            java.lang.Object r4 = r5.parseFrom(r0, r1, r4, r2)
            r6.add(r4)
            return
        L5d:
            com.google.protobuf.MessageLite r5 = r3.prototype
            com.google.protobuf.MessageLite$Builder r5 = r5.newBuilderForType()
            com.google.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry
            com.google.protobuf.MessageLite$Builder r4 = r5.mergeFrom(r0, r1, r4, r2)
            com.google.protobuf.MessageLite r4 = r4.build()
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
