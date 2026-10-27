package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnorderedThreadPoolEventExecutor extends java.util.concurrent.ScheduledThreadPoolExecutor implements io.netty.util.concurrent.EventExecutor {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Set<io.netty.util.concurrent.EventExecutor> executorSet;
    private final io.netty.util.concurrent.Promise<?> terminationFuture;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NonNotifyRunnable implements java.lang.Runnable {
        private final java.lang.Runnable task;

        NonNotifyRunnable(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.task
                r0.run()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class RunnableScheduledFutureTask<V> extends io.netty.util.concurrent.PromiseTask<V> implements java.util.concurrent.RunnableScheduledFuture<V>, io.netty.util.concurrent.ScheduledFuture<V> {
        private final java.util.concurrent.RunnableScheduledFuture<V> future;

        RunnableScheduledFutureTask(io.netty.util.concurrent.EventExecutor r2, java.lang.Runnable r3, java.util.concurrent.RunnableScheduledFuture<V> r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.future = r4
                return
        }

        RunnableScheduledFutureTask(io.netty.util.concurrent.EventExecutor r1, java.util.concurrent.Callable<V> r2, java.util.concurrent.RunnableScheduledFuture<V> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.future = r3
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
                r0 = this;
                java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(java.util.concurrent.Delayed r2) {
                r1 = this;
                java.util.concurrent.RunnableScheduledFuture<V> r0 = r1.future
                int r2 = r0.compareTo(r2)
                return r2
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit r3) {
                r2 = this;
                java.util.concurrent.RunnableScheduledFuture<V> r0 = r2.future
                long r0 = r0.getDelay(r3)
                return r0
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
                r1 = this;
                java.util.concurrent.RunnableScheduledFuture<V> r0 = r1.future
                boolean r0 = r0.isPeriodic()
                return r0
        }

        @Override // io.netty.util.concurrent.PromiseTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
                r3 = this;
                boolean r0 = r3.isPeriodic()
                if (r0 != 0) goto La
                super.run()
                return
            La:
                boolean r0 = r3.isDone()
                if (r0 != 0) goto L26
                java.util.concurrent.Callable<V> r0 = r3.task     // Catch: java.lang.Throwable -> L16
                r0.call()     // Catch: java.lang.Throwable -> L16
                return
            L16:
                r0 = move-exception
                boolean r1 = r3.tryFailureInternal(r0)
                if (r1 != 0) goto L26
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.access$000()
                java.lang.String r2 = "Failure during execution of task"
                r1.warn(r2, r0)
            L26:
                return
        }
    }

    static {
            java.lang.Class<io.netty.util.concurrent.UnorderedThreadPoolEventExecutor> r0 = io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.logger = r0
            return
    }

    public UnorderedThreadPoolEventExecutor(int r3) {
            r2 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class<io.netty.util.concurrent.UnorderedThreadPoolEventExecutor> r1 = io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.class
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public UnorderedThreadPoolEventExecutor(int r3, java.util.concurrent.RejectedExecutionHandler r4) {
            r2 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class<io.netty.util.concurrent.UnorderedThreadPoolEventExecutor> r1 = io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.class
            r0.<init>(r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public UnorderedThreadPoolEventExecutor(int r1, java.util.concurrent.ThreadFactory r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            io.netty.util.concurrent.Promise r1 = r1.newPromise()
            r0.terminationFuture = r1
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0.executorSet = r1
            return
    }

    public UnorderedThreadPoolEventExecutor(int r1, java.util.concurrent.ThreadFactory r2, java.util.concurrent.RejectedExecutionHandler r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            io.netty.util.concurrent.Promise r1 = r1.newPromise()
            r0.terminationFuture = r1
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0.executorSet = r1
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.logger
            return r0
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.lang.Runnable r2, java.util.concurrent.RunnableScheduledFuture<V> r3) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.concurrent.UnorderedThreadPoolEventExecutor.NonNotifyRunnable
            if (r0 == 0) goto L5
            return r3
        L5:
            io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask r0 = new io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.util.concurrent.Callable<V> r2, java.util.concurrent.RunnableScheduledFuture<V> r3) {
            r1 = this;
            io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask r0 = new io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$RunnableScheduledFutureTask
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable r4) {
            r3 = this;
            io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable r0 = new io.netty.util.concurrent.UnorderedThreadPoolEventExecutor$NonNotifyRunnable
            r0.<init>(r4)
            r1 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            super.schedule(r0, r1, r4)
            return
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(java.lang.Thread r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r1 = this;
            boolean r0 = r1.isShutdown()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.lang.Iterable
    public java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator() {
            r1 = this;
            java.util.Set<io.netty.util.concurrent.EventExecutor> r0 = r1.executorSet
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

    @Override // io.netty.util.concurrent.EventExecutor, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.EventExecutor next() {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public io.netty.util.concurrent.EventExecutorGroup parent() {
            r0 = this;
            return r0
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ScheduledFuture r1 = super.schedule(r1, r2, r4)
            io.netty.util.concurrent.ScheduledFuture r1 = (io.netty.util.concurrent.ScheduledFuture) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            java.util.concurrent.ScheduledFuture r1 = super.schedule(r1, r2, r4)
            io.netty.util.concurrent.ScheduledFuture r1 = (io.netty.util.concurrent.ScheduledFuture) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.util.concurrent.ScheduledFuture r1 = super.scheduleAtFixedRate(r1, r2, r4, r6)
            io.netty.util.concurrent.ScheduledFuture r1 = (io.netty.util.concurrent.ScheduledFuture) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.util.concurrent.ScheduledFuture r1 = super.scheduleWithFixedDelay(r1, r2, r4, r6)
            io.netty.util.concurrent.ScheduledFuture r1 = (io.netty.util.concurrent.ScheduledFuture) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public void shutdown() {
            r2 = this;
            super.shutdown()
            io.netty.util.concurrent.Promise<?> r0 = r2.terminationFuture
            r1 = 0
            r0.trySuccess(r1)
            return
    }

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
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r1, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            r0.shutdown()
            io.netty.util.concurrent.Future r1 = r0.terminationFuture()
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r3 = this;
            java.util.List r0 = super.shutdownNow()
            io.netty.util.concurrent.Promise<?> r1 = r3.terminationFuture
            r2 = 0
            r1.trySuccess(r2)
            return r0
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public <T> io.netty.util.concurrent.Future<T> submit(java.lang.Runnable r1, T r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    public <T> io.netty.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            io.netty.util.concurrent.Future r1 = (io.netty.util.concurrent.Future) r1
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Promise<?> r0 = r1.terminationFuture
            return r0
    }
}
