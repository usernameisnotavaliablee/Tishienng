package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SctpChannelOption<T> extends io.netty.channel.ChannelOption<T> {
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SCTP_DISABLE_FRAGMENTS = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SCTP_EXPLICIT_COMPLETE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SCTP_FRAGMENT_INTERLEAVE = null;
    public static final io.netty.channel.ChannelOption<com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams> SCTP_INIT_MAXSTREAMS = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SCTP_NODELAY = null;
    public static final io.netty.channel.ChannelOption<java.net.SocketAddress> SCTP_PRIMARY_ADDR = null;
    public static final io.netty.channel.ChannelOption<java.net.SocketAddress> SCTP_SET_PEER_PRIMARY_ADDR = null;

    static {
            java.lang.String r0 = "SCTP_DISABLE_FRAGMENTS"
            java.lang.Class<io.netty.channel.sctp.SctpChannelOption> r1 = io.netty.channel.sctp.SctpChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_DISABLE_FRAGMENTS = r0
            java.lang.String r0 = "SCTP_EXPLICIT_COMPLETE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_EXPLICIT_COMPLETE = r0
            java.lang.String r0 = "SCTP_FRAGMENT_INTERLEAVE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_FRAGMENT_INTERLEAVE = r0
            java.lang.String r0 = "SCTP_INIT_MAXSTREAMS"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_INIT_MAXSTREAMS = r0
            java.lang.String r0 = "SCTP_NODELAY"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_NODELAY = r0
            java.lang.String r0 = "SCTP_PRIMARY_ADDR"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_PRIMARY_ADDR = r0
            java.lang.String r0 = "SCTP_SET_PEER_PRIMARY_ADDR"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.sctp.SctpChannelOption.SCTP_SET_PEER_PRIMARY_ADDR = r0
            return
    }

    private SctpChannelOption() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }
}
