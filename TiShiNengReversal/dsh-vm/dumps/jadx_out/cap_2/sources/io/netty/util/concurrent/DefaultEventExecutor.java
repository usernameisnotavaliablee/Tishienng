package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DefaultEventExecutor extends io.netty.util.concurrent.SingleThreadEventExecutor {
    public DefaultEventExecutor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public DefaultEventExecutor(io.netty.util.concurrent.EventExecutorGroup r3) {
            r2 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class<io.netty.util.concurrent.DefaultEventExecutor> r1 = io.netty.util.concurrent.DefaultEventExecutor.class
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public DefaultEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultEventExecutor(io.netty.util.concurrent.EventExecutorGroup r7, java.util.concurrent.Executor r8, int r9, io.netty.util.concurrent.RejectedExecutionHandler r10) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2, java.util.concurrent.ThreadFactory r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultEventExecutor(io.netty.util.concurrent.EventExecutorGroup r7, java.util.concurrent.ThreadFactory r8, int r9, io.netty.util.concurrent.RejectedExecutionHandler r10) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultEventExecutor(java.util.concurrent.Executor r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public DefaultEventExecutor(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.util.concurrent.SingleThreadEventExecutor
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
