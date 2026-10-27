package com.tsn.chat.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends io.netty.channel.ChannelInitializer<io.netty.channel.socket.SocketChannel> {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void a(io.netty.channel.socket.SocketChannel r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            com.tsn.chat.handler.c r0 = new com.tsn.chat.handler.c
            r0.<init>()
            java.lang.String r1 = "encoder"
            r3.addLast(r1, r0)
            com.tsn.chat.handler.b r0 = new com.tsn.chat.handler.b
            r0.<init>()
            java.lang.String r1 = "decoder"
            r3.addLast(r1, r0)
            com.tsn.chat.handler.a r0 = new com.tsn.chat.handler.a
            r0.<init>()
            java.lang.String r1 = "handler"
            r3.addLast(r1, r0)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.util.Objects.toString(r3)
            r0.getClass()
            super.channelRead(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            super.channelReadComplete(r2)
            return
    }

    @Override // io.netty.channel.ChannelInitializer
    protected /* bridge */ /* synthetic */ void initChannel(io.netty.channel.socket.SocketChannel r1) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.socket.SocketChannel r1 = (io.netty.channel.socket.SocketChannel) r1
            r0.a(r1)
            return
    }
}
