package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractEventExecutor extends java.util.concurrent.AbstractExecutorService implements io.netty.util.concurrent.EventExecutor {
    static final long DEFAULT_SHUTDOWN_QUIET_PERIOD = 2;
    static final long DEFAULT_SHUTDOWN_TIMEOUT = 15;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.util.concurrent.EventExecutorGroup parent;
    private final java.util.Collection<io.netty.util.concurrent.EventExecutor> selfCollection;

    static {
            java.lang.Class<io.netty.util.concurrent.AbstractEventExecutor> r0 = io.netty.util.concurrent.AbstractEventExecutor.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.AbstractEventExecutor.logger = r0
            return
    }

    protected AbstractEventExecutor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected AbstractEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.Set r0 = java.util.Collections.singleton(r1)
            r1.selfCollection = r0
            r1.parent = r2
            return
    }

    protected static void safeExecute(java.lang.Runnable r3) {
            r3.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.concurrent.AbstractEventExecutor.logger
            java.lang.String r2 = "A task raised an exception. Task: {}"
            r1.warn(r2, r3, r0)
            return
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop() {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r1.inEventLoop(r0)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.lang.Iterable
    public java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator() {
            r1 = this;
            java.util.Collection<io.netty.util.concurrent.EventExecutor> r0 = r1.selfCollection
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.Future<V> newFailedFuture(java.lang.Throwable r2) {
            r1 = this;
            io.netty.util.concurrent.FailedFuture r0 = new io.netty.util.concurrent.FailedFuture
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.ProgressivePromise<V> newProgressivePromise() {
            r1 = this;
            io.netty.util.concurrent.DefaultProgressivePromise r0 = new io.netty.util.concurrent.DefaultProgressivePromise
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.Promise<V> newPromise() {
            r1 = this;
            io.netty.util.concurrent.DefaultPromise r0 = new io.netty.util.concurrent.DefaultPromise
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public <V> io.netty.util.concurrent.Future<V> newSucceededFuture(V r2) {
            r1 = this;
            io.netty.util.concurrent.SucceededFuture r0 = new io.netty.util.concurrent.SucceededFuture
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable r2, T r3) {
            r1 = this;
            io.netty.util.concurrent.PromiseTask r0 = new io.netty.util.concurrent.PromiseTask
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            io.netty.util.concurrent.PromiseTask r0 = new io.netty.util.concurrent.PromiseTask
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.EventExecutor next() {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public io.netty.util.concurrent.EventExecutorGroup parent() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.parent
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
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
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r1
    }

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
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

    @Override // java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            r1.shutdown()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public <T> io.netty.util.concurrent.Future<T> submit(java.lang.Runnable r1, T r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public <T> io.netty.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }
}
