package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelProgressiveFuture extends io.netty.channel.ChannelFuture, io.netty.util.concurrent.ProgressiveFuture<java.lang.Void> {
    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture await() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture awaitUninterruptibly();

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture sync() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressiveFuture syncUninterruptibly();
}
