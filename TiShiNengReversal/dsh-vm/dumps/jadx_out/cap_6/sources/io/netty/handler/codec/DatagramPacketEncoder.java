package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramPacketEncoder<M> extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.channel.AddressedEnvelope<M, java.net.InetSocketAddress>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final io.netty.handler.codec.MessageToMessageEncoder<? super M> encoder;

    static {
            return
    }

    public DatagramPacketEncoder(io.netty.handler.codec.MessageToMessageEncoder<? super M> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "encoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.MessageToMessageEncoder r2 = (io.netty.handler.codec.MessageToMessageEncoder) r2
            r1.encoder = r2
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = super.acceptOutboundMessage(r4)
            r1 = 0
            if (r0 == 0) goto L2d
            io.netty.channel.AddressedEnvelope r4 = (io.netty.channel.AddressedEnvelope) r4
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r3.encoder
            java.lang.Object r2 = r4.content()
            boolean r0 = r0.acceptOutboundMessage(r2)
            if (r0 == 0) goto L2d
            java.net.SocketAddress r0 = r4.sender()
            boolean r0 = r0 instanceof java.net.InetSocketAddress
            if (r0 != 0) goto L23
            java.net.SocketAddress r0 = r4.sender()
            if (r0 != 0) goto L2d
        L23:
            java.net.SocketAddress r4 = r4.recipient()
            boolean r4 = r4 instanceof java.net.InetSocketAddress
            if (r4 == 0) goto L2d
            r4 = 1
            return r4
        L2d:
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.bind(r2, r3, r4)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.close(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.connect(r2, r3, r4, r5)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.deregister(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.disconnect(r2, r3)
            return
    }

    protected void encode(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.AddressedEnvelope<M, java.net.InetSocketAddress> r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r3.encoder
            java.lang.Object r1 = r5.content()
            r0.encode(r4, r1, r6)
            int r4 = r6.size()
            r0 = 1
            if (r4 != r0) goto L4d
            r4 = 0
            java.lang.Object r0 = r6.get(r4)
            boolean r1 = r0 instanceof io.netty.buffer.ByteBuf
            if (r1 == 0) goto L30
            io.netty.channel.socket.DatagramPacket r1 = new io.netty.channel.socket.DatagramPacket
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            java.net.SocketAddress r2 = r5.recipient()
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            java.net.SocketAddress r5 = r5.sender()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            r1.<init>(r0, r2, r5)
            r6.set(r4, r1)
            return
        L30:
            io.netty.handler.codec.EncoderException r4 = new io.netty.handler.codec.EncoderException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r6 = r3.encoder
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r5.append(r6)
            java.lang.String r6 = " must produce only ByteBuf."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            io.netty.handler.codec.EncoderException r4 = new io.netty.handler.codec.EncoderException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r6 = r3.encoder
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r5.append(r6)
            java.lang.String r6 = " must produce only one message."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.AddressedEnvelope r2 = (io.netty.channel.AddressedEnvelope) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.exceptionCaught(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.flush(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.handlerAdded(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.handlerRemoved(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter
    public boolean isSharable() {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            boolean r0 = r0.isSharable()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.MessageToMessageEncoder<? super M> r0 = r1.encoder
            r0.read(r2)
            return
    }
}
