package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollChannelOption<T> extends io.netty.channel.unix.UnixChannelOption<T> {
    public static final io.netty.channel.ChannelOption<io.netty.channel.epoll.EpollMode> EPOLL_MODE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> IP_FREEBIND = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> IP_RECVORIGDSTADDR = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> IP_TRANSPARENT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SO_BUSY_POLL = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> TCP_CORK = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_DEFER_ACCEPT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_FASTOPEN = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> TCP_FASTOPEN_CONNECT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_KEEPCNT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_KEEPIDLE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_KEEPINTVL = null;
    public static final io.netty.channel.ChannelOption<java.util.Map<java.net.InetAddress, byte[]>> TCP_MD5SIG = null;
    public static final io.netty.channel.ChannelOption<java.lang.Long> TCP_NOTSENT_LOWAT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> TCP_QUICKACK = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> TCP_USER_TIMEOUT = null;

    static {
            java.lang.String r0 = "TCP_CORK"
            java.lang.Class<io.netty.channel.epoll.EpollChannelOption> r1 = io.netty.channel.epoll.EpollChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_CORK = r0
            java.lang.String r0 = "TCP_NOTSENT_LOWAT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_NOTSENT_LOWAT = r0
            java.lang.String r0 = "TCP_KEEPIDLE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_KEEPIDLE = r0
            java.lang.String r0 = "TCP_KEEPINTVL"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_KEEPINTVL = r0
            java.lang.String r0 = "TCP_KEEPCNT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_KEEPCNT = r0
            java.lang.String r0 = "TCP_USER_TIMEOUT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_USER_TIMEOUT = r0
            java.lang.String r0 = "IP_FREEBIND"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r0)
            io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND = r0
            java.lang.String r0 = "IP_TRANSPARENT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r0)
            io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT = r0
            java.lang.String r0 = "IP_RECVORIGDSTADDR"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r0)
            io.netty.channel.epoll.EpollChannelOption.IP_RECVORIGDSTADDR = r0
            java.lang.String r0 = "TCP_FASTOPEN"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_FASTOPEN = r0
            java.lang.String r0 = "TCP_FASTOPEN_CONNECT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_FASTOPEN_CONNECT = r0
            java.lang.String r0 = "TCP_DEFER_ACCEPT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_DEFER_ACCEPT = r0
            java.lang.String r0 = "TCP_QUICKACK"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_QUICKACK = r0
            java.lang.String r0 = "SO_BUSY_POLL"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.SO_BUSY_POLL = r0
            java.lang.String r0 = "EPOLL_MODE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.epoll.EpollChannelOption.EPOLL_MODE = r0
            java.lang.String r0 = "TCP_MD5SIG"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r0)
            io.netty.channel.epoll.EpollChannelOption.TCP_MD5SIG = r0
            return
    }

    private EpollChannelOption() {
            r0 = this;
            r0.<init>()
            return
    }
}
