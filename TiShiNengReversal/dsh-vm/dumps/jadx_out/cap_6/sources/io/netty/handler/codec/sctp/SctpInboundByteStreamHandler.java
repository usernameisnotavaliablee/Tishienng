package io.netty.handler.codec.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SctpInboundByteStreamHandler extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.sctp.SctpMessage> {
    private final int protocolIdentifier;
    private final int streamIdentifier;

    public SctpInboundByteStreamHandler(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.protocolIdentifier = r1
            r0.streamIdentifier = r2
            return
    }

    protected boolean acceptInboundMessage(io.netty.channel.sctp.SctpMessage r3) {
            r2 = this;
            int r0 = r3.protocolIdentifier()
            int r1 = r2.protocolIdentifier
            if (r0 != r1) goto L12
            int r3 = r3.streamIdentifier()
            int r0 = r2.streamIdentifier
            if (r3 != r0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public final boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = super.acceptInboundMessage(r2)
            if (r0 == 0) goto Ld
            io.netty.channel.sctp.SctpMessage r2 = (io.netty.channel.sctp.SctpMessage) r2
            boolean r2 = r1.acceptInboundMessage(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.sctp.SctpMessage r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r2 = r3.isComplete()
            if (r2 == 0) goto L12
            io.netty.buffer.ByteBuf r2 = r3.content()
            io.netty.buffer.ByteBuf r2 = r2.retain()
            r4.add(r2)
            return
        L12:
            io.netty.handler.codec.CodecException r2 = new io.netty.handler.codec.CodecException
            java.lang.Class<io.netty.handler.codec.sctp.SctpMessageCompletionHandler> r3 = io.netty.handler.codec.sctp.SctpMessageCompletionHandler.class
            java.lang.String r3 = r3.getSimpleName()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "Received SctpMessage is not complete, please add %s in the pipeline before this handler"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.sctp.SctpMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.sctp.SctpMessage r2 = (io.netty.channel.sctp.SctpMessage) r2
            r0.decode2(r1, r2, r3)
            return
    }
}
