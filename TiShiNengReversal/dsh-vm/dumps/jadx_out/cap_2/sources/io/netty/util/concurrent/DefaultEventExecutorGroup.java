package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultEventExecutorGroup extends io.netty.util.concurrent.MultithreadEventExecutorGroup {
    public DefaultEventExecutorGroup(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultEventExecutorGroup(int r3, java.util.concurrent.ThreadFactory r4) {
            r2 = this;
            int r0 = io.netty.util.concurrent.SingleThreadEventExecutor.DEFAULT_MAX_PENDING_EXECUTOR_TASKS
            io.netty.util.concurrent.RejectedExecutionHandler r1 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public DefaultEventExecutorGroup(int r3, java.util.concurrent.ThreadFactory r4, int r5, io.netty.util.concurrent.RejectedExecutionHandler r6) {
            r2 = this;
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r6
            r2.<init>(r3, r4, r0)
            return
    }

    @Override // io.netty.util.concurrent.MultithreadEventExecutorGroup
    protected io.netty.util.concurrent.EventExecutor newChild(java.util.concurrent.Executor r4, java.lang.Object... r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.concurrent.DefaultEventExecutor r0 = new io.netty.util.concurrent.DefaultEventExecutor
            r1 = 0
            r1 = r5[r1]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            r5 = r5[r2]
            io.netty.util.concurrent.RejectedExecutionHandler r5 = (io.netty.util.concurrent.RejectedExecutionHandler) r5
            r0.<init>(r3, r4, r1, r5)
            return r0
    }
}
