package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NonStickyEventExecutorGroup implements io.netty.util.concurrent.EventExecutorGroup {
    private final io.netty.util.concurrent.EventExecutorGroup group;
    private final int maxTaskExecutePerRun;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NonStickyOrderedEventExecutor extends io.netty.util.concurrent.AbstractEventExecutor implements java.lang.Runnable, io.netty.util.concurrent.OrderedEventExecutor {
        private static final int NONE = 0;
        private static final int RUNNING = 2;
        private static final int SUBMITTED = 1;
        private final io.netty.util.concurrent.EventExecutor executor;
        private final int maxTaskExecutePerRun;
        private final java.util.concurrent.atomic.AtomicInteger state;
        private final java.util.Queue<java.lang.Runnable> tasks;

        NonStickyOrderedEventExecutor(io.netty.util.concurrent.EventExecutor r2, int r3) {
                r1 = this;
                r1.<init>(r2)
                java.util.Queue r0 = io.netty.util.internal.PlatformDependent.newMpscQueue()
                r1.tasks = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.state = r0
                r1.executor = r2
                r1.maxTaskExecutePerRun = r3
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                boolean r2 = r0.awaitTermination(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.util.Queue<java.lang.Runnable> r0 = r3.tasks
                boolean r0 = r0.offer(r4)
                if (r0 == 0) goto L22
                java.util.concurrent.atomic.AtomicInteger r0 = r3.state
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L21
                io.netty.util.concurrent.EventExecutor r0 = r3.executor     // Catch: java.lang.Throwable -> L18
                r0.execute(r3)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r0 = move-exception
                java.util.Queue<java.lang.Runnable> r1 = r3.tasks
                r1.remove(r4)
                io.netty.util.internal.PlatformDependent.throwException(r0)
            L21:
                return
            L22:
                java.util.concurrent.RejectedExecutionException r4 = new java.util.concurrent.RejectedExecutionException
                r4.<init>()
                throw r4
        }

        @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor
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

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                boolean r0 = r0.isShutdown()
                return r0
        }

        @Override // io.netty.util.concurrent.EventExecutorGroup
        public boolean isShuttingDown() {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                boolean r0 = r0.isShutdown()
                return r0
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                boolean r0 = r0.isTerminated()
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r6.state
                r1 = 1
                r2 = 2
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 != 0) goto Lc
                goto L7c
            Lc:
                r0 = 0
                r3 = 0
            Le:
                int r4 = r6.maxTaskExecutePerRun     // Catch: java.lang.Throwable -> L23
                if (r3 >= r4) goto L25
                java.util.Queue<java.lang.Runnable> r4 = r6.tasks     // Catch: java.lang.Throwable -> L23
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L23
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L23
                if (r4 != 0) goto L1d
                goto L25
            L1d:
                io.netty.util.concurrent.AbstractEventExecutor.safeExecute(r4)     // Catch: java.lang.Throwable -> L23
                int r3 = r3 + 1
                goto Le
            L23:
                r4 = move-exception
                goto L50
            L25:
                int r4 = r6.maxTaskExecutePerRun
                if (r3 != r4) goto L3a
                java.util.concurrent.atomic.AtomicInteger r0 = r6.state     // Catch: java.lang.Throwable -> L34
                r0.set(r1)     // Catch: java.lang.Throwable -> L34
                io.netty.util.concurrent.EventExecutor r0 = r6.executor     // Catch: java.lang.Throwable -> L34
                r0.execute(r6)     // Catch: java.lang.Throwable -> L34
                goto L7c
            L34:
                java.util.concurrent.atomic.AtomicInteger r0 = r6.state
                r0.set(r2)
                goto Lc
            L3a:
                java.util.concurrent.atomic.AtomicInteger r3 = r6.state
                r3.set(r0)
                java.util.Queue<java.lang.Runnable> r3 = r6.tasks
                java.lang.Object r3 = r3.peek()
                if (r3 == 0) goto L7c
                java.util.concurrent.atomic.AtomicInteger r3 = r6.state
                boolean r0 = r3.compareAndSet(r0, r2)
                if (r0 != 0) goto Lc
                goto L7c
            L50:
                int r5 = r6.maxTaskExecutePerRun
                if (r3 != r5) goto L65
                java.util.concurrent.atomic.AtomicInteger r0 = r6.state     // Catch: java.lang.Throwable -> L5f
                r0.set(r1)     // Catch: java.lang.Throwable -> L5f
                io.netty.util.concurrent.EventExecutor r0 = r6.executor     // Catch: java.lang.Throwable -> L5f
                r0.execute(r6)     // Catch: java.lang.Throwable -> L5f
                goto L7c
            L5f:
                java.util.concurrent.atomic.AtomicInteger r0 = r6.state
                r0.set(r2)
                goto L7b
            L65:
                java.util.concurrent.atomic.AtomicInteger r1 = r6.state
                r1.set(r0)
                java.util.Queue<java.lang.Runnable> r1 = r6.tasks
                java.lang.Object r1 = r1.peek()
                if (r1 == 0) goto L7c
                java.util.concurrent.atomic.AtomicInteger r1 = r6.state
                boolean r0 = r1.compareAndSet(r0, r2)
                if (r0 != 0) goto L7b
                goto L7c
            L7b:
                throw r4
            L7c:
                return
        }

        @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
        public void shutdown() {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                r0.shutdown()
                return
        }

        @Override // io.netty.util.concurrent.EventExecutorGroup
        public io.netty.util.concurrent.Future<?> shutdownGracefully(long r7, long r9, java.util.concurrent.TimeUnit r11) {
                r6 = this;
                io.netty.util.concurrent.EventExecutor r0 = r6.executor
                r1 = r7
                r3 = r9
                r5 = r11
                io.netty.util.concurrent.Future r7 = r0.shutdownGracefully(r1, r3, r5)
                return r7
        }

        @Override // io.netty.util.concurrent.EventExecutorGroup
        public io.netty.util.concurrent.Future<?> terminationFuture() {
                r1 = this;
                io.netty.util.concurrent.EventExecutor r0 = r1.executor
                io.netty.util.concurrent.Future r0 = r0.terminationFuture()
                return r0
        }
    }

    public NonStickyEventExecutorGroup(io.netty.util.concurrent.EventExecutorGroup r2) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r0)
            return
    }

    public NonStickyEventExecutorGroup(io.netty.util.concurrent.EventExecutorGroup r1, int r2) {
            r0 = this;
            r0.<init>()
            io.netty.util.concurrent.EventExecutorGroup r1 = verify(r1)
            r0.group = r1
            java.lang.String r1 = "maxTaskExecutePerRun"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositive(r2, r1)
            r0.maxTaskExecutePerRun = r1
            return
    }

    static /* synthetic */ io.netty.util.concurrent.NonStickyEventExecutorGroup.NonStickyOrderedEventExecutor access$000(io.netty.util.concurrent.NonStickyEventExecutorGroup r0, io.netty.util.concurrent.EventExecutor r1) {
            io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor r0 = r0.newExecutor(r1)
            return r0
    }

    private io.netty.util.concurrent.NonStickyEventExecutorGroup.NonStickyOrderedEventExecutor newExecutor(io.netty.util.concurrent.EventExecutor r3) {
            r2 = this;
            io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor r0 = new io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor
            int r1 = r2.maxTaskExecutePerRun
            r0.<init>(r3, r1)
            return r0
    }

    private static io.netty.util.concurrent.EventExecutorGroup verify(io.netty.util.concurrent.EventExecutorGroup r4) {
            java.lang.String r0 = "group"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.util.concurrent.EventExecutorGroup r0 = (io.netty.util.concurrent.EventExecutorGroup) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            io.netty.util.concurrent.EventExecutor r1 = (io.netty.util.concurrent.EventExecutor) r1
            boolean r2 = r1 instanceof io.netty.util.concurrent.OrderedEventExecutor
            if (r2 != 0) goto L1d
            goto Lc
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "EventExecutorGroup "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " contains OrderedEventExecutors: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L3c:
            return r4
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            boolean r0 = r0.isShuttingDown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.lang.Iterable
    public java.util.Iterator<io.netty.util.concurrent.EventExecutor> iterator() {
            r2 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r2.group
            java.util.Iterator r0 = r0.iterator()
            io.netty.util.concurrent.NonStickyEventExecutorGroup$1 r1 = new io.netty.util.concurrent.NonStickyEventExecutorGroup$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.EventExecutor next() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.EventExecutor r0 = r0.next()
            io.netty.util.concurrent.NonStickyEventExecutorGroup$NonStickyOrderedEventExecutor r0 = r1.newExecutor(r0)
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.ScheduledFuture r2 = r0.schedule(r2, r3, r5)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
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
            io.netty.util.concurrent.EventExecutorGroup r0 = r7.group
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
            io.netty.util.concurrent.EventExecutorGroup r0 = r7.group
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
    public void shutdown() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            r0.shutdown()
            return
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.Future r0 = r0.shutdownGracefully()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r7, long r9, java.util.concurrent.TimeUnit r11) {
            r6 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r6.group
            r1 = r7
            r3 = r9
            r5 = r11
            io.netty.util.concurrent.Future r7 = r0.shutdownGracefully(r1, r3, r5)
            return r7
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public io.netty.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public <T> io.netty.util.concurrent.Future<T> submit(java.lang.Runnable r2, T r3) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ExecutorService
    public <T> io.netty.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
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

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = r1.group
            io.netty.util.concurrent.Future r0 = r0.terminationFuture()
            return r0
    }
}
