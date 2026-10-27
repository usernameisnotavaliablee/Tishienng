package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DuplexChannel extends io.netty.channel.Channel {
    boolean isInputShutdown();

    boolean isOutputShutdown();

    boolean isShutdown();

    io.netty.channel.ChannelFuture shutdown();

    io.netty.channel.ChannelFuture shutdown(io.netty.channel.ChannelPromise r1);

    io.netty.channel.ChannelFuture shutdownInput();

    io.netty.channel.ChannelFuture shutdownInput(io.netty.channel.ChannelPromise r1);

    io.netty.channel.ChannelFuture shutdownOutput();

    io.netty.channel.ChannelFuture shutdownOutput(io.netty.channel.ChannelPromise r1);
}
