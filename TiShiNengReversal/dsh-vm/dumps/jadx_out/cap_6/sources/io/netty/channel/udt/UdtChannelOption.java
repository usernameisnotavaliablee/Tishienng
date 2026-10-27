package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UdtChannelOption<T> extends io.netty.channel.ChannelOption<T> {
    public static final io.netty.channel.ChannelOption<java.lang.Integer> PROTOCOL_RECEIVE_BUFFER_SIZE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> PROTOCOL_SEND_BUFFER_SIZE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SYSTEM_RECEIVE_BUFFER_SIZE = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> SYSTEM_SEND_BUFFER_SIZE = null;

    static {
            java.lang.String r0 = "PROTOCOL_RECEIVE_BUFFER_SIZE"
            java.lang.Class<io.netty.channel.udt.UdtChannelOption> r1 = io.netty.channel.udt.UdtChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.udt.UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE = r0
            java.lang.String r0 = "PROTOCOL_SEND_BUFFER_SIZE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.udt.UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE = r0
            java.lang.String r0 = "SYSTEM_RECEIVE_BUFFER_SIZE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.udt.UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE = r0
            java.lang.String r0 = "SYSTEM_SEND_BUFFER_SIZE"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.udt.UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE = r0
            return
    }

    private UdtChannelOption() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }
}
