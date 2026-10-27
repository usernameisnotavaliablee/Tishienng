package io.netty.channel.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelHealthChecker {
    public static final io.netty.channel.pool.ChannelHealthChecker ACTIVE = null;


    static {
            io.netty.channel.pool.ChannelHealthChecker$1 r0 = new io.netty.channel.pool.ChannelHealthChecker$1
            r0.<init>()
            io.netty.channel.pool.ChannelHealthChecker.ACTIVE = r0
            return
    }

    io.netty.util.concurrent.Future<java.lang.Boolean> isHealthy(io.netty.channel.Channel r1);
}
