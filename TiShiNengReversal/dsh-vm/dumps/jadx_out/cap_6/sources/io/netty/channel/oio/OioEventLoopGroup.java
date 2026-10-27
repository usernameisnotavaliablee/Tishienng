package io.netty.channel.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioEventLoopGroup extends io.netty.channel.ThreadPerChannelEventLoopGroup {
    public OioEventLoopGroup() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OioEventLoopGroup(int r2) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.<init>(r2, r0)
            return
    }

    public OioEventLoopGroup(int r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.<init>(r2, r3, r0)
            return
    }

    public OioEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.<init>(r2, r3, r0)
            return
    }
}
