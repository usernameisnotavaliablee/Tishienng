package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelPromise extends io.netty.channel.ChannelFuture, io.netty.util.concurrent.Promise<java.lang.Void> {
    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise await() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise awaitUninterruptibly();

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.Channel channel();

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r1);

    io.netty.channel.ChannelPromise setSuccess();

    io.netty.channel.ChannelPromise setSuccess(java.lang.Void r1);

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise sync() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelFuture
    io.netty.channel.ChannelPromise syncUninterruptibly();

    boolean trySuccess();

    io.netty.channel.ChannelPromise unvoid();
}
