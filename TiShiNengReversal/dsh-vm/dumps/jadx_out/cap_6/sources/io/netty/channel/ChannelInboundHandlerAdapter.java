package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChannelInboundHandlerAdapter extends io.netty.channel.ChannelHandlerAdapter implements io.netty.channel.ChannelInboundHandler {
    public ChannelInboundHandlerAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelActive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelInactive()
            return
    }

    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelRead(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelRead(r2)
            return
    }

    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelRegistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelUnregistered(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelUnregistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) throws java.lang.Exception {
            r0 = this;
            r1.fireExceptionCaught(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandler
    @io.netty.channel.ChannelHandlerMask.Skip
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            r1.fireUserEventTriggered(r2)
            return
    }
}
