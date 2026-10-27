package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelProgressivePromise extends io.netty.util.concurrent.ProgressivePromise<java.lang.Void>, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelPromise {
    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise await() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise awaitUninterruptibly();

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    @Override // io.netty.channel.ChannelPromise
    io.netty.channel.ChannelProgressivePromise setFailure(java.lang.Throwable r1);

    io.netty.channel.ChannelProgressivePromise setProgress(long r1, long r3);

    @Override // io.netty.channel.ChannelPromise
    io.netty.channel.ChannelProgressivePromise setSuccess();

    @Override // io.netty.channel.ChannelPromise
    io.netty.channel.ChannelProgressivePromise setSuccess(java.lang.Void r1);

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise sync() throws java.lang.InterruptedException;

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    io.netty.channel.ChannelProgressivePromise syncUninterruptibly();

    @Override // io.netty.channel.ChannelPromise
    io.netty.channel.ChannelProgressivePromise unvoid();
}
