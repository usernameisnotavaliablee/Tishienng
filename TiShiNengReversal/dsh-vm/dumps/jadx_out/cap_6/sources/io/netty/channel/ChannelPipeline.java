package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelPipeline extends io.netty.channel.ChannelInboundInvoker, io.netty.channel.ChannelOutboundInvoker, java.lang.Iterable<java.util.Map.Entry<java.lang.String, io.netty.channel.ChannelHandler>> {
    io.netty.channel.ChannelPipeline addAfter(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4);

    io.netty.channel.ChannelPipeline addAfter(java.lang.String r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelPipeline addBefore(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, java.lang.String r3, io.netty.channel.ChannelHandler r4);

    io.netty.channel.ChannelPipeline addBefore(java.lang.String r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelPipeline addFirst(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelPipeline addFirst(io.netty.util.concurrent.EventExecutorGroup r1, io.netty.channel.ChannelHandler... r2);

    io.netty.channel.ChannelPipeline addFirst(java.lang.String r1, io.netty.channel.ChannelHandler r2);

    io.netty.channel.ChannelPipeline addFirst(io.netty.channel.ChannelHandler... r1);

    io.netty.channel.ChannelPipeline addLast(io.netty.util.concurrent.EventExecutorGroup r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelPipeline addLast(io.netty.util.concurrent.EventExecutorGroup r1, io.netty.channel.ChannelHandler... r2);

    io.netty.channel.ChannelPipeline addLast(java.lang.String r1, io.netty.channel.ChannelHandler r2);

    io.netty.channel.ChannelPipeline addLast(io.netty.channel.ChannelHandler... r1);

    io.netty.channel.Channel channel();

    io.netty.channel.ChannelHandlerContext context(io.netty.channel.ChannelHandler r1);

    io.netty.channel.ChannelHandlerContext context(java.lang.Class<? extends io.netty.channel.ChannelHandler> r1);

    io.netty.channel.ChannelHandlerContext context(java.lang.String r1);

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelActive();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelInactive();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelRead(java.lang.Object r1);

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelReadComplete();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelRegistered();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelUnregistered();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireChannelWritabilityChanged();

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireExceptionCaught(java.lang.Throwable r1);

    @Override // io.netty.channel.ChannelInboundInvoker
    io.netty.channel.ChannelPipeline fireUserEventTriggered(java.lang.Object r1);

    io.netty.channel.ChannelHandler first();

    io.netty.channel.ChannelHandlerContext firstContext();

    @Override // io.netty.channel.ChannelOutboundInvoker
    io.netty.channel.ChannelPipeline flush();

    <T extends io.netty.channel.ChannelHandler> T get(java.lang.Class<T> r1);

    io.netty.channel.ChannelHandler get(java.lang.String r1);

    io.netty.channel.ChannelHandler last();

    io.netty.channel.ChannelHandlerContext lastContext();

    java.util.List<java.lang.String> names();

    <T extends io.netty.channel.ChannelHandler> T remove(java.lang.Class<T> r1);

    io.netty.channel.ChannelHandler remove(java.lang.String r1);

    io.netty.channel.ChannelPipeline remove(io.netty.channel.ChannelHandler r1);

    io.netty.channel.ChannelHandler removeFirst();

    io.netty.channel.ChannelHandler removeLast();

    <T extends io.netty.channel.ChannelHandler> T replace(java.lang.Class<T> r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelHandler replace(java.lang.String r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    io.netty.channel.ChannelPipeline replace(io.netty.channel.ChannelHandler r1, java.lang.String r2, io.netty.channel.ChannelHandler r3);

    java.util.Map<java.lang.String, io.netty.channel.ChannelHandler> toMap();
}
