package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface EventLoopGroup extends io.netty.util.concurrent.EventExecutorGroup {
    io.netty.channel.EventLoop next();

    io.netty.channel.ChannelFuture register(io.netty.channel.Channel r1);

    @java.lang.Deprecated
    io.netty.channel.ChannelFuture register(io.netty.channel.Channel r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture register(io.netty.channel.ChannelPromise r1);
}
