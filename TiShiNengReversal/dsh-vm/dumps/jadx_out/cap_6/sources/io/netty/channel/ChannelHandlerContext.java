package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelHandlerContext extends io.netty.util.AttributeMap, io.netty.channel.ChannelInboundInvoker, io.netty.channel.ChannelOutboundInvoker {
    io.netty.buffer.ByteBufAllocator alloc();

    @java.lang.Deprecated
    <T> io.netty.util.Attribute<T> attr(io.netty.util.AttributeKey<T> r1);

    io.netty.channel.Channel channel();

    io.netty.util.concurrent.EventExecutor executor();

    io.netty.channel.ChannelHandlerContext fireChannelActive();

    io.netty.channel.ChannelHandlerContext fireChannelInactive();

    io.netty.channel.ChannelHandlerContext fireChannelRead(java.lang.Object r1);

    io.netty.channel.ChannelHandlerContext fireChannelReadComplete();

    io.netty.channel.ChannelHandlerContext fireChannelRegistered();

    io.netty.channel.ChannelHandlerContext fireChannelUnregistered();

    io.netty.channel.ChannelHandlerContext fireChannelWritabilityChanged();

    io.netty.channel.ChannelHandlerContext fireExceptionCaught(java.lang.Throwable r1);

    io.netty.channel.ChannelHandlerContext fireUserEventTriggered(java.lang.Object r1);

    io.netty.channel.ChannelHandlerContext flush();

    io.netty.channel.ChannelHandler handler();

    @java.lang.Deprecated
    <T> boolean hasAttr(io.netty.util.AttributeKey<T> r1);

    boolean isRemoved();

    java.lang.String name();

    io.netty.channel.ChannelPipeline pipeline();

    io.netty.channel.ChannelHandlerContext read();
}
