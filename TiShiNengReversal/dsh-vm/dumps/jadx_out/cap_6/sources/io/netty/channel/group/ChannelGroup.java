package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelGroup extends java.util.Set<io.netty.channel.Channel>, java.lang.Comparable<io.netty.channel.group.ChannelGroup> {
    io.netty.channel.group.ChannelGroupFuture close();

    io.netty.channel.group.ChannelGroupFuture close(io.netty.channel.group.ChannelMatcher r1);

    @java.lang.Deprecated
    io.netty.channel.group.ChannelGroupFuture deregister();

    @java.lang.Deprecated
    io.netty.channel.group.ChannelGroupFuture deregister(io.netty.channel.group.ChannelMatcher r1);

    io.netty.channel.group.ChannelGroupFuture disconnect();

    io.netty.channel.group.ChannelGroupFuture disconnect(io.netty.channel.group.ChannelMatcher r1);

    io.netty.channel.Channel find(io.netty.channel.ChannelId r1);

    io.netty.channel.group.ChannelGroup flush();

    io.netty.channel.group.ChannelGroup flush(io.netty.channel.group.ChannelMatcher r1);

    @java.lang.Deprecated
    io.netty.channel.group.ChannelGroupFuture flushAndWrite(java.lang.Object r1);

    @java.lang.Deprecated
    io.netty.channel.group.ChannelGroupFuture flushAndWrite(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2);

    java.lang.String name();

    io.netty.channel.group.ChannelGroupFuture newCloseFuture();

    io.netty.channel.group.ChannelGroupFuture newCloseFuture(io.netty.channel.group.ChannelMatcher r1);

    io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r1);

    io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2);

    io.netty.channel.group.ChannelGroupFuture write(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2, boolean r3);

    io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r1);

    io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2);

    io.netty.channel.group.ChannelGroupFuture writeAndFlush(java.lang.Object r1, io.netty.channel.group.ChannelMatcher r2, boolean r3);
}
