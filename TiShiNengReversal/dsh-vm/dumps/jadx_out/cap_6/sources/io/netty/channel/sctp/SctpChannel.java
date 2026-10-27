package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SctpChannel extends io.netty.channel.Channel {
    java.util.Set<java.net.InetSocketAddress> allLocalAddresses();

    java.util.Set<java.net.InetSocketAddress> allRemoteAddresses();

    com.sun.nio.sctp.Association association();

    io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r1);

    io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r1, io.netty.channel.ChannelPromise r2);

    @Override // io.netty.channel.Channel
    io.netty.channel.sctp.SctpChannelConfig config();

    @Override // io.netty.channel.Channel
    java.net.InetSocketAddress localAddress();

    @Override // io.netty.channel.Channel
    io.netty.channel.sctp.SctpServerChannel parent();

    @Override // io.netty.channel.Channel
    java.net.InetSocketAddress remoteAddress();

    io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r1);

    io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r1, io.netty.channel.ChannelPromise r2);
}
