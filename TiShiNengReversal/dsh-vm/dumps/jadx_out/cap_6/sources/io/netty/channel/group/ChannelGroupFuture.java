package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelGroupFuture extends io.netty.util.concurrent.Future<java.lang.Void>, java.lang.Iterable<io.netty.channel.ChannelFuture> {
    io.netty.channel.group.ChannelGroupFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    io.netty.channel.group.ChannelGroupFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    io.netty.channel.group.ChannelGroupFuture await() throws java.lang.InterruptedException;

    io.netty.channel.group.ChannelGroupFuture awaitUninterruptibly();

    io.netty.channel.group.ChannelGroupException cause();

    io.netty.channel.ChannelFuture find(io.netty.channel.Channel r1);

    io.netty.channel.group.ChannelGroup group();

    boolean isPartialFailure();

    boolean isPartialSuccess();

    boolean isSuccess();

    @Override // java.lang.Iterable
    java.util.Iterator<io.netty.channel.ChannelFuture> iterator();

    io.netty.channel.group.ChannelGroupFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    io.netty.channel.group.ChannelGroupFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    io.netty.channel.group.ChannelGroupFuture sync() throws java.lang.InterruptedException;

    io.netty.channel.group.ChannelGroupFuture syncUninterruptibly();
}
