package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramPacketDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.socket.DatagramPacket> {
    private final io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> decoder;

    public DatagramPacketDecoder(io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "decoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.MessageToMessageDecoder r2 = (io.netty.handler.codec.MessageToMessageDecoder) r2
            r1.decoder = r2
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.socket.DatagramPacket
            if (r0 == 0) goto L11
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            io.netty.channel.socket.DatagramPacket r2 = (io.netty.channel.socket.DatagramPacket) r2
            java.lang.Object r2 = r2.content()
            boolean r2 = r0.acceptInboundMessage(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelActive(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelInactive(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelReadComplete(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelRegistered(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelUnregistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelUnregistered(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.channelWritabilityChanged(r2)
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.socket.DatagramPacket r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            java.lang.Object r3 = r3.content()
            r0.decode(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.socket.DatagramPacket r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r2 = (io.netty.channel.socket.DatagramPacket) r2
            r0.decode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.exceptionCaught(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.handlerAdded(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.handlerRemoved(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter
    public boolean isSharable() {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            boolean r0 = r0.isSharable()
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> r0 = r1.decoder
            r0.userEventTriggered(r2, r3)
            return
    }
}
