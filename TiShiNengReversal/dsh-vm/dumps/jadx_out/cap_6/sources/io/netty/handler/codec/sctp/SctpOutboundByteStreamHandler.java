package io.netty.handler.codec.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SctpOutboundByteStreamHandler extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.buffer.ByteBuf> {
    private final int protocolIdentifier;
    private final int streamIdentifier;
    private final boolean unordered;

    public SctpOutboundByteStreamHandler(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SctpOutboundByteStreamHandler(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.streamIdentifier = r1
            r0.protocolIdentifier = r2
            r0.unordered = r3
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.sctp.SctpMessage r4 = new io.netty.channel.sctp.SctpMessage
            int r0 = r3.protocolIdentifier
            int r1 = r3.streamIdentifier
            boolean r2 = r3.unordered
            io.netty.buffer.ByteBuf r5 = r5.retain()
            r4.<init>(r0, r1, r2, r5)
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
