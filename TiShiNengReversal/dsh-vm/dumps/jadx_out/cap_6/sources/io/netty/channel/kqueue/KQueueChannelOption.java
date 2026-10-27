package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueueChannelOption<T> extends io.netty.channel.unix.UnixChannelOption<T> {
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> RCV_ALLOC_TRANSPORT_PROVIDES_GUESS = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.kqueue.AcceptFilter> SO_ACCEPTFILTER = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_SNDLOWAT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> TCP_NOPUSH = null;

    static {
            java.lang.String r0 = "SO_SNDLOWAT"
            java.lang.Class<io.netty.channel.kqueue.KQueueChannelOption> r1 = io.netty.channel.kqueue.KQueueChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.kqueue.KQueueChannelOption.SO_SNDLOWAT = r0
            java.lang.String r0 = "TCP_NOPUSH"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.kqueue.KQueueChannelOption.TCP_NOPUSH = r0
            java.lang.String r0 = "SO_ACCEPTFILTER"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.kqueue.KQueueChannelOption.SO_ACCEPTFILTER = r0
            java.lang.String r0 = "RCV_ALLOC_TRANSPORT_PROVIDES_GUESS"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.kqueue.KQueueChannelOption.RCV_ALLOC_TRANSPORT_PROVIDES_GUESS = r0
            return
    }

    private KQueueChannelOption() {
            r0 = this;
            r0.<init>()
            return
    }
}
