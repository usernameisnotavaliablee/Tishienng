package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnixChannelOption<T> extends io.netty.channel.ChannelOption<T> {
    public static final io.netty.channel.ChannelOption<io.netty.channel.unix.DomainSocketReadMode> DOMAIN_SOCKET_READ_MODE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> SO_REUSEPORT = null;

    static {
            java.lang.String r0 = "SO_REUSEPORT"
            java.lang.Class<io.netty.channel.unix.UnixChannelOption> r1 = io.netty.channel.unix.UnixChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT = r0
            java.lang.String r0 = "DOMAIN_SOCKET_READ_MODE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.unix.UnixChannelOption.DOMAIN_SOCKET_READ_MODE = r0
            return
    }

    protected UnixChannelOption() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }
}
