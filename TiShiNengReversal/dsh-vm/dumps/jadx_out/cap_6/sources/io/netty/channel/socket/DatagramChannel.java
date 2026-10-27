package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DatagramChannel extends io.netty.channel.Channel {
    io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.InetAddress r2);

    io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.InetAddress r2, io.netty.channel.ChannelPromise r3);

    io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3);

    io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4);

    @Override // io.netty.channel.Channel
    io.netty.channel.socket.DatagramChannelConfig config();

    boolean isConnected();

    io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1);

    io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3);

    io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4);

    io.netty.channel.ChannelFuture joinGroup(java.net.InetSocketAddress r1, java.net.NetworkInterface r2);

    io.netty.channel.ChannelFuture joinGroup(java.net.InetSocketAddress r1, java.net.NetworkInterface r2, io.netty.channel.ChannelPromise r3);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, io.netty.channel.ChannelPromise r2);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetSocketAddress r1, java.net.NetworkInterface r2);

    io.netty.channel.ChannelFuture leaveGroup(java.net.InetSocketAddress r1, java.net.NetworkInterface r2, io.netty.channel.ChannelPromise r3);

    @Override // io.netty.channel.Channel
    java.net.InetSocketAddress localAddress();

    @Override // io.netty.channel.Channel
    java.net.InetSocketAddress remoteAddress();
}
