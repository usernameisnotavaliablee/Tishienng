package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractEventExecutorGroup implements io.netty.util.concurrent.EventExecutorGroup {
    public AbstractEventExecutorGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            io.netty.util.concurrent.ScheduledFuture r2 = r0.schedule(r2, r3, r5)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            io.netty.util.concurrent.ScheduledFuture r2 = r0.schedule(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            io.netty.util.concurrent.EventExecutor r0 = r7.next()
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            io.netty.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r8
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            io.netty.util.concurrent.EventExecutor r0 = r7.next()
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            io.netty.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r8
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public abstract void shutdown();

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully() {
            r6 = this;
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 2
            r0 = r6
            io.netty.util.concurrent.Future r1 = r0.shutdownGracefully(r1, r3, r5)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            r1.shutdown()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public io.netty.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            io.netty.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public <T> io.netty.util.concurrent.Future<T> submit(java.lang.Runnable r2, T r3) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            io.netty.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public <T> io.netty.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.next()
            io.netty.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }

    @Override // java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }
}
