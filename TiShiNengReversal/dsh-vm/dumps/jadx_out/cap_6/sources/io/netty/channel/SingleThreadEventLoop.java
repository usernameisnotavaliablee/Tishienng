package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SingleThreadEventLoop extends io.netty.util.concurrent.SingleThreadEventExecutor implements io.netty.channel.EventLoop {
    protected static final int DEFAULT_MAX_PENDING_TASKS = 0;
    private final java.util.Queue<java.lang.Runnable> tailTasks;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface NonWakeupRunnable extends java.lang.Runnable {
    }

    static {
            java.lang.String r0 = "io.netty.eventLoop.maxPendingTasks"
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            r1 = 16
            int r0 = java.lang.Math.max(r1, r0)
            io.netty.channel.SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS = r0
            return
    }

    protected SingleThreadEventLoop(io.netty.channel.EventLoopGroup r7, java.util.concurrent.Executor r8, boolean r9) {
            r6 = this;
            int r4 = io.netty.channel.SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS
            io.netty.util.concurrent.RejectedExecutionHandler r5 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected SingleThreadEventLoop(io.netty.channel.EventLoopGroup r1, java.util.concurrent.Executor r2, boolean r3, int r4, io.netty.util.concurrent.RejectedExecutionHandler r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            java.util.Queue r2 = r0.newTaskQueue(r4)
            r1.tailTasks = r2
            return
    }

    protected SingleThreadEventLoop(io.netty.channel.EventLoopGroup r7, java.util.concurrent.Executor r8, boolean r9, java.util.Queue<java.lang.Runnable> r10, java.util.Queue<java.lang.Runnable> r11, io.netty.util.concurrent.RejectedExecutionHandler r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r7 = "tailTaskQueue"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r11, r7)
            java.util.Queue r7 = (java.util.Queue) r7
            r0.tailTasks = r7
            return
    }

    protected SingleThreadEventLoop(io.netty.channel.EventLoopGroup r7, java.util.concurrent.ThreadFactory r8, boolean r9) {
            r6 = this;
            int r4 = io.netty.channel.SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS
            io.netty.util.concurrent.RejectedExecutionHandler r5 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected SingleThreadEventLoop(io.netty.channel.EventLoopGroup r1, java.util.concurrent.ThreadFactory r2, boolean r3, int r4, io.netty.util.concurrent.RejectedExecutionHandler r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            java.util.Queue r2 = r0.newTaskQueue(r4)
            r1.tailTasks = r2
            return
    }

    protected void afterRunningAllTasks() {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.tailTasks
            r1.runAllTasksFrom(r0)
            return
    }

    public final void executeAfterEventLoopIteration(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "task"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            boolean r0 = r1.isShutdown()
            if (r0 == 0) goto Le
            io.netty.util.concurrent.SingleThreadEventExecutor.reject()
        Le:
            java.util.Queue<java.lang.Runnable> r0 = r1.tailTasks
            boolean r0 = r0.offer(r2)
            if (r0 != 0) goto L19
            r1.reject(r2)
        L19:
            boolean r2 = r1.wakesUpForTask(r2)
            if (r2 == 0) goto L26
            boolean r2 = r1.inEventLoop()
            r1.wakeup(r2)
        L26:
            return
    }

    protected boolean hasTasks() {
            r1 = this;
            boolean r0 = super.hasTasks()
            if (r0 != 0) goto L11
            java.util.Queue<java.lang.Runnable> r0 = r1.tailTasks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.EventLoop next() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super/*io.netty.util.concurrent.AbstractEventExecutor*/.next()
            io.netty.channel.EventLoop r0 = (io.netty.channel.EventLoop) r0
            return r0
    }

    /* renamed from: next, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m123next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }

    @Override // io.netty.channel.EventLoop
    public io.netty.channel.EventLoopGroup parent() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = super/*io.netty.util.concurrent.AbstractEventExecutor*/.parent()
            io.netty.channel.EventLoopGroup r0 = (io.netty.channel.EventLoopGroup) r0
            return r0
    }

    /* renamed from: parent, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutorGroup m124parent() {
            r1 = this;
            io.netty.channel.EventLoopGroup r0 = r1.parent()
            return r0
    }

    public int pendingTasks() {
            r2 = this;
            int r0 = super.pendingTasks()
            java.util.Queue<java.lang.Runnable> r1 = r2.tailTasks
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPromise r0 = new io.netty.channel.DefaultChannelPromise
            r0.<init>(r2, r1)
            io.netty.channel.ChannelFuture r2 = r1.register(r0)
            return r2
    }

    @Override // io.netty.channel.EventLoopGroup
    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r1, io.netty.channel.ChannelPromise r2) {
            r0 = this;
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            io.netty.channel.Channel$Unsafe r1 = r1.unsafe()
            r1.register(r0, r2)
            return r2
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "promise"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "channel"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            r0.register(r1, r2)
            return r2
    }

    public int registeredChannels() {
            r1 = this;
            r0 = -1
            return r0
    }

    final boolean removeAfterEventLoopIterationTask(java.lang.Runnable r3) {
            r2 = this;
            java.util.Queue<java.lang.Runnable> r0 = r2.tailTasks
            java.lang.String r1 = "task"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            boolean r3 = r0.remove(r3)
            return r3
    }

    protected boolean wakesUpForTask(java.lang.Runnable r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.SingleThreadEventLoop.NonWakeupRunnable
            r1 = r1 ^ 1
            return r1
    }
}
