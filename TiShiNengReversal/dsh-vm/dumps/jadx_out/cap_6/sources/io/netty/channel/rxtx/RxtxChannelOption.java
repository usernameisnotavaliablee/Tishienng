package io.netty.channel.rxtx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RxtxChannelOption<T> extends io.netty.channel.ChannelOption<T> {
    public static final io.netty.channel.ChannelOption<java.lang.Integer> BAUD_RATE = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig.Databits> DATA_BITS = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> DTR = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig.Paritybit> PARITY_BIT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> READ_TIMEOUT = null;
    public static final io.netty.channel.ChannelOption<java.lang.Boolean> RTS = null;
    public static final io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig.Stopbits> STOP_BITS = null;
    public static final io.netty.channel.ChannelOption<java.lang.Integer> WAIT_TIME = null;

    static {
            java.lang.String r0 = "BAUD_RATE"
            java.lang.Class<io.netty.channel.rxtx.RxtxChannelOption> r1 = io.netty.channel.rxtx.RxtxChannelOption.class
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.BAUD_RATE = r0
            java.lang.String r0 = "DTR"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.DTR = r0
            java.lang.String r0 = "RTS"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.RTS = r0
            java.lang.String r0 = "STOP_BITS"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.STOP_BITS = r0
            java.lang.String r0 = "DATA_BITS"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.DATA_BITS = r0
            java.lang.String r0 = "PARITY_BIT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.PARITY_BIT = r0
            java.lang.String r0 = "WAIT_TIME"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.WAIT_TIME = r0
            java.lang.String r0 = "READ_TIMEOUT"
            io.netty.channel.ChannelOption r0 = io.netty.channel.ChannelOption.valueOf(r1, r0)
            io.netty.channel.rxtx.RxtxChannelOption.READ_TIMEOUT = r0
            return
    }

    private RxtxChannelOption() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }
}
