package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollEventLoopGroup extends io.netty.channel.MultithreadEventLoopGroup {
    public EpollEventLoopGroup() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public EpollEventLoopGroup(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public EpollEventLoopGroup(int r2, io.netty.channel.SelectStrategyFactory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public EpollEventLoopGroup(int r2, java.util.concurrent.Executor r3) {
            r1 = this;
            io.netty.channel.SelectStrategyFactory r0 = io.netty.channel.DefaultSelectStrategyFactory.INSTANCE
            r1.<init>(r2, r3, r0)
            return
    }

    public EpollEventLoopGroup(int r5, java.util.concurrent.Executor r6, io.netty.channel.SelectStrategyFactory r7) {
            r4 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            io.netty.util.concurrent.RejectedExecutionHandler r2 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            r0 = 1
            r3[r0] = r7
            r7 = 2
            r3[r7] = r2
            r4.<init>(r5, r6, r3)
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    public EpollEventLoopGroup(int r5, java.util.concurrent.Executor r6, io.netty.util.concurrent.EventExecutorChooserFactory r7, io.netty.channel.SelectStrategyFactory r8) {
            r4 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            io.netty.util.concurrent.RejectedExecutionHandler r2 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            r0 = 1
            r3[r0] = r8
            r8 = 2
            r3[r8] = r2
            r4.<init>(r5, r6, r7, r3)
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    public EpollEventLoopGroup(int r4, java.util.concurrent.Executor r5, io.netty.util.concurrent.EventExecutorChooserFactory r6, io.netty.channel.SelectStrategyFactory r7, io.netty.util.concurrent.RejectedExecutionHandler r8) {
            r3 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r0 = 1
            r2[r0] = r7
            r7 = 2
            r2[r7] = r8
            r3.<init>(r4, r5, r6, r2)
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    public EpollEventLoopGroup(int r4, java.util.concurrent.Executor r5, io.netty.util.concurrent.EventExecutorChooserFactory r6, io.netty.channel.SelectStrategyFactory r7, io.netty.util.concurrent.RejectedExecutionHandler r8, io.netty.channel.EventLoopTaskQueueFactory r9) {
            r3 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r0 = 1
            r2[r0] = r7
            r7 = 2
            r2[r7] = r8
            r7 = 3
            r2[r7] = r9
            r3.<init>(r4, r5, r6, r2)
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    public EpollEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public EpollEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3, int r4) {
            r1 = this;
            io.netty.channel.SelectStrategyFactory r0 = io.netty.channel.DefaultSelectStrategyFactory.INSTANCE
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public EpollEventLoopGroup(int r4, java.util.concurrent.ThreadFactory r5, int r6, io.netty.channel.SelectStrategyFactory r7) {
            r3 = this;
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            io.netty.util.concurrent.RejectedExecutionHandler r0 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r6 = 2
            r1[r6] = r0
            r3.<init>(r4, r5, r1)
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    public EpollEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3, io.netty.channel.SelectStrategyFactory r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    @Override // io.netty.channel.MultithreadEventLoopGroup
    protected io.netty.channel.EventLoop newChild(java.util.concurrent.Executor r9, java.lang.Object... r10) throws java.lang.Exception {
            r8 = this;
            int r0 = r10.length
            r1 = 4
            if (r0 != r1) goto Lb
            r0 = 3
            r0 = r10[r0]
            io.netty.channel.EventLoopTaskQueueFactory r0 = (io.netty.channel.EventLoopTaskQueueFactory) r0
        L9:
            r7 = r0
            goto Ld
        Lb:
            r0 = 0
            goto L9
        Ld:
            io.netty.channel.epoll.EpollEventLoop r1 = new io.netty.channel.epoll.EpollEventLoop
            r0 = 0
            r0 = r10[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            r0 = 1
            r0 = r10[r0]
            io.netty.channel.SelectStrategyFactory r0 = (io.netty.channel.SelectStrategyFactory) r0
            io.netty.channel.SelectStrategy r5 = r0.newSelectStrategy()
            r0 = 2
            r10 = r10[r0]
            r6 = r10
            io.netty.util.concurrent.RejectedExecutionHandler r6 = (io.netty.util.concurrent.RejectedExecutionHandler) r6
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // io.netty.channel.MultithreadEventLoopGroup
    /* renamed from: newChild */
    protected /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor mo96newChild(java.util.concurrent.Executor r1, java.lang.Object[] r2) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.EventLoop r1 = r0.newChild(r1, r2)
            return r1
    }

    public void setIoRatio(int r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.util.concurrent.EventExecutor r1 = (io.netty.util.concurrent.EventExecutor) r1
            io.netty.channel.epoll.EpollEventLoop r1 = (io.netty.channel.epoll.EpollEventLoop) r1
            r1.setIoRatio(r3)
            goto L4
        L16:
            return
    }
}
