package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultEventLoop extends io.netty.channel.SingleThreadEventLoop {
    public DefaultEventLoop() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public DefaultEventLoop(io.netty.channel.EventLoopGroup r3) {
            r2 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class<io.netty.channel.DefaultEventLoop> r1 = io.netty.channel.DefaultEventLoop.class
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public DefaultEventLoop(io.netty.channel.EventLoopGroup r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultEventLoop(io.netty.channel.EventLoopGroup r2, java.util.concurrent.ThreadFactory r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultEventLoop(java.util.concurrent.Executor r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public DefaultEventLoop(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    protected void run() {
            r1 = this;
        L0:
            java.lang.Runnable r0 = r1.takeTask()
            if (r0 == 0) goto Lc
            r0.run()
            r1.updateLastExecutionTime()
        Lc:
            boolean r0 = r1.confirmShutdown()
            if (r0 == 0) goto L0
            return
    }
}
