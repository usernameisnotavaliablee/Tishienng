package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MessageToMessageCodec<INBOUND_IN, OUTBOUND_IN> extends io.netty.channel.ChannelDuplexHandler {
    private final io.netty.handler.codec.MessageToMessageDecoder<java.lang.Object> decoder;
    private final io.netty.handler.codec.MessageToMessageEncoder<java.lang.Object> encoder;
    private final io.netty.util.internal.TypeParameterMatcher inboundMsgMatcher;
    private final io.netty.util.internal.TypeParameterMatcher outboundMsgMatcher;



    protected MessageToMessageCodec() {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.MessageToMessageCodec$1 r0 = new io.netty.handler.codec.MessageToMessageCodec$1
            r0.<init>(r2)
            r2.encoder = r0
            io.netty.handler.codec.MessageToMessageCodec$2 r0 = new io.netty.handler.codec.MessageToMessageCodec$2
            r0.<init>(r2)
            r2.decoder = r0
            java.lang.String r0 = "INBOUND_IN"
            java.lang.Class<io.netty.handler.codec.MessageToMessageCodec> r1 = io.netty.handler.codec.MessageToMessageCodec.class
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r1, r0)
            r2.inboundMsgMatcher = r0
            java.lang.String r0 = "OUTBOUND_IN"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r1, r0)
            r2.outboundMsgMatcher = r0
            return
    }

    protected MessageToMessageCodec(java.lang.Class<? extends INBOUND_IN> r2, java.lang.Class<? extends OUTBOUND_IN> r3) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.MessageToMessageCodec$1 r0 = new io.netty.handler.codec.MessageToMessageCodec$1
            r0.<init>(r1)
            r1.encoder = r0
            io.netty.handler.codec.MessageToMessageCodec$2 r0 = new io.netty.handler.codec.MessageToMessageCodec$2
            r0.<init>(r1)
            r1.decoder = r0
            io.netty.util.internal.TypeParameterMatcher r2 = io.netty.util.internal.TypeParameterMatcher.get(r2)
            r1.inboundMsgMatcher = r2
            io.netty.util.internal.TypeParameterMatcher r2 = io.netty.util.internal.TypeParameterMatcher.get(r3)
            r1.outboundMsgMatcher = r2
            return
    }

    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.inboundMsgMatcher
            boolean r2 = r0.match(r2)
            return r2
    }

    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.outboundMsgMatcher
            boolean r2 = r0.match(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<java.lang.Object> r0 = r1.decoder
            r0.channelRead(r2, r3)
            return
    }

    protected abstract void decode(io.netty.channel.ChannelHandlerContext r1, INBOUND_IN r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

    protected abstract void encode(io.netty.channel.ChannelHandlerContext r1, OUTBOUND_IN r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<java.lang.Object> r0 = r1.encoder
            r0.write(r2, r3, r4)
            return
    }
}
