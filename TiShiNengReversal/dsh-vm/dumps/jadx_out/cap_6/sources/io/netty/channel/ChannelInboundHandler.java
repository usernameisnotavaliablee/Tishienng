package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelInboundHandler extends io.netty.channel.ChannelHandler {
    void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void channelRead(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception;

    void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void channelRegistered(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void channelUnregistered(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) throws java.lang.Exception;

    void userEventTriggered(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception;
}
