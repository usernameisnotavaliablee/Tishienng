package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultSelectStrategy implements io.netty.channel.SelectStrategy {
    static final io.netty.channel.SelectStrategy INSTANCE = null;

    static {
            io.netty.channel.DefaultSelectStrategy r0 = new io.netty.channel.DefaultSelectStrategy
            r0.<init>()
            io.netty.channel.DefaultSelectStrategy.INSTANCE = r0
            return
    }

    private DefaultSelectStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.channel.SelectStrategy
    public int calculateStrategy(io.netty.util.IntSupplier r1, boolean r2) throws java.lang.Exception {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.get()
            return r1
        L7:
            r1 = -1
            return r1
    }
}
