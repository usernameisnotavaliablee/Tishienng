package io.netty.channel.embedded;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class EmbeddedEventLoop extends io.netty.util.concurrent.AbstractScheduledEventExecutor implements io.netty.channel.EventLoop {
    private final java.util.Queue<java.lang.Runnable> tasks;

    EmbeddedEventLoop() {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 2
            r0.<init>(r1)
            r2.tasks = r0
            return
    }

    public boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void cancelScheduledTasks() {
            r0 = this;
            super.cancelScheduledTasks()
            return
    }

    public void execute(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.Queue<java.lang.Runnable> r0 = r1.tasks
            r0.add(r2)
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "command"
            r2.<init>(r0)
            throw r2
    }

    public boolean inEventLoop() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean inEventLoop(java.lang.Thread r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean isShutdown() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isShuttingDown() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isTerminated() {
            r1 = this;
            r0 = 0
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
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m144next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }

    long nextScheduledTask() {
            r2 = this;
            long r0 = r2.nextScheduledTaskNano()
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
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutorGroup m145parent() {
            r1 = this;
            io.netty.channel.EventLoopGroup r0 = r1.parent()
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
            io.netty.channel.Channel$Unsafe r1 = r1.unsafe()
            r1.register(r0, r2)
            return r2
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

    long runScheduledTasks() {
            r3 = this;
            long r0 = io.netty.util.concurrent.AbstractScheduledEventExecutor.nanoTime()
        L4:
            java.lang.Runnable r2 = r3.pollScheduledTask(r0)
            if (r2 != 0) goto Lf
            long r0 = r3.nextScheduledTaskNano()
            return r0
        Lf:
            r2.run()
            goto L4
    }

    void runTasks() {
            r1 = this;
        L0:
            java.util.Queue<java.lang.Runnable> r0 = r1.tasks
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r0.run()
            goto L0
    }

    @java.lang.Deprecated
    public void shutdown() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r1, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
