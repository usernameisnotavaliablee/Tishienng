package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelOutboundInvoker {
    io.netty.channel.ChannelFuture bind(java.net.SocketAddress r1);

    io.netty.channel.ChannelFuture bind(java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture close();

    io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r1);

    io.netty.channel.ChannelFuture connect(java.net.SocketAddress r1);

    io.netty.channel.ChannelFuture connect(java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture connect(java.net.SocketAddress r1, java.net.SocketAddress r2);

    io.netty.channel.ChannelFuture connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3);

    io.netty.channel.ChannelFuture deregister();

    io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r1);

    io.netty.channel.ChannelFuture disconnect();

    io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r1);

    io.netty.channel.ChannelOutboundInvoker flush();

    io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r1);

    io.netty.channel.ChannelProgressivePromise newProgressivePromise();

    io.netty.channel.ChannelPromise newPromise();

    io.netty.channel.ChannelFuture newSucceededFuture();

    io.netty.channel.ChannelOutboundInvoker read();

    io.netty.channel.ChannelPromise voidPromise();

    io.netty.channel.ChannelFuture write(java.lang.Object r1);

    io.netty.channel.ChannelFuture write(java.lang.Object r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r1);

    io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r1, io.netty.channel.ChannelPromise r2);
}
