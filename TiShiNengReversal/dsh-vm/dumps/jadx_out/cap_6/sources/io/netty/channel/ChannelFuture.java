package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelFuture extends io.netty.util.concurrent.Future<java.lang.Void> {
    io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    io.netty.channel.ChannelFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    io.netty.channel.ChannelFuture await() throws java.lang.InterruptedException;

    io.netty.channel.ChannelFuture awaitUninterruptibly();

    io.netty.channel.Channel channel();

    boolean isVoid();

    io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1);

    io.netty.channel.ChannelFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1);

    io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException;

    io.netty.channel.ChannelFuture syncUninterruptibly();
}
