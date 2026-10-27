package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultSelectStrategyFactory implements io.netty.channel.SelectStrategyFactory {
    public static final io.netty.channel.SelectStrategyFactory INSTANCE = null;

    static {
            io.netty.channel.DefaultSelectStrategyFactory r0 = new io.netty.channel.DefaultSelectStrategyFactory
            r0.<init>()
            io.netty.channel.DefaultSelectStrategyFactory.INSTANCE = r0
            return
    }

    private DefaultSelectStrategyFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.channel.SelectStrategyFactory
    public io.netty.channel.SelectStrategy newSelectStrategy() {
            r1 = this;
            io.netty.channel.SelectStrategy r0 = io.netty.channel.DefaultSelectStrategy.INSTANCE
            return r0
    }
}
