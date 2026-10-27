package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class GlobalEventExecutor extends io.netty.util.concurrent.AbstractScheduledEventExecutor implements io.netty.util.concurrent.OrderedEventExecutor {
    public static final io.netty.util.concurrent.GlobalEventExecutor INSTANCE = null;
    private static final long SCHEDULE_QUIET_PERIOD_INTERVAL = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    final io.netty.util.concurrent.ScheduledFutureTask<java.lang.Void> quietPeriodTask;
    private final java.util.concurrent.atomic.AtomicBoolean started;
    final java.util.concurrent.BlockingQueue<java.lang.Runnable> taskQueue;
    private final io.netty.util.concurrent.GlobalEventExecutor.TaskRunner taskRunner;
    private final io.netty.util.concurrent.Future<?> terminationFuture;
    volatile java.lang.Thread thread;
    final java.util.concurrent.ThreadFactory threadFactory;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class TaskRunner implements java.lang.Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final /* synthetic */ io.netty.util.concurrent.GlobalEventExecutor this$0;

        static {
                return
        }

        TaskRunner(io.netty.util.concurrent.GlobalEventExecutor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
            L0:
                io.netty.util.concurrent.GlobalEventExecutor r0 = r4.this$0
                java.lang.Runnable r0 = r0.takeTask()
                if (r0 == 0) goto L1d
                r0.run()     // Catch: java.lang.Throwable -> Lc
                goto L16
            Lc:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.GlobalEventExecutor.access$000()
                java.lang.String r3 = "Unexpected exception from the global event executor: "
                r2.warn(r3, r1)
            L16:
                io.netty.util.concurrent.GlobalEventExecutor r1 = r4.this$0
                io.netty.util.concurrent.ScheduledFutureTask<java.lang.Void> r1 = r1.quietPeriodTask
                if (r0 == r1) goto L1d
                goto L0
            L1d:
                io.netty.util.concurrent.GlobalEventExecutor r0 = r4.this$0
                io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r1 = r0.scheduledTaskQueue
                java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r0.taskQueue
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L0
                r0 = 1
                if (r1 == 0) goto L32
                int r2 = r1.size()
                if (r2 != r0) goto L0
            L32:
                io.netty.util.concurrent.GlobalEventExecutor r2 = r4.this$0
                java.util.concurrent.atomic.AtomicBoolean r2 = io.netty.util.concurrent.GlobalEventExecutor.access$100(r2)
                r3 = 0
                r2.compareAndSet(r0, r3)
                io.netty.util.concurrent.GlobalEventExecutor r2 = r4.this$0
                java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r2.taskQueue
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L4f
                if (r1 == 0) goto L5b
                int r1 = r1.size()
                if (r1 != r0) goto L4f
                goto L5b
            L4f:
                io.netty.util.concurrent.GlobalEventExecutor r1 = r4.this$0
                java.util.concurrent.atomic.AtomicBoolean r1 = io.netty.util.concurrent.GlobalEventExecutor.access$100(r1)
                boolean r0 = r1.compareAndSet(r3, r0)
                if (r0 != 0) goto L0
            L5b:
                return
        }
    }

    static {
            java.lang.Class<io.netty.util.concurrent.GlobalEventExecutor> r0 = io.netty.util.concurrent.GlobalEventExecutor.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.GlobalEventExecutor.logger = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toNanos(r1)
            io.netty.util.concurrent.GlobalEventExecutor.SCHEDULE_QUIET_PERIOD_INTERVAL = r0
            io.netty.util.concurrent.GlobalEventExecutor r0 = new io.netty.util.concurrent.GlobalEventExecutor
            r0.<init>()
            io.netty.util.concurrent.GlobalEventExecutor.INSTANCE = r0
            return
    }

    private GlobalEventExecutor() {
            r9 = this;
            r9.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r9.taskQueue = r0
            io.netty.util.concurrent.ScheduledFutureTask r1 = new io.netty.util.concurrent.ScheduledFutureTask
            io.netty.util.concurrent.GlobalEventExecutor$1 r0 = new io.netty.util.concurrent.GlobalEventExecutor$1
            r0.<init>(r9)
            r8 = 0
            java.util.concurrent.Callable r3 = java.util.concurrent.Executors.callable(r0, r8)
            long r4 = io.netty.util.concurrent.GlobalEventExecutor.SCHEDULE_QUIET_PERIOD_INTERVAL
            r6 = r4
            long r4 = io.netty.util.concurrent.ScheduledFutureTask.deadlineNanos(r6)
            long r6 = -r6
            r2 = r9
            r1.<init>(r2, r3, r4, r6)
            r2.quietPeriodTask = r1
            io.netty.util.concurrent.GlobalEventExecutor$TaskRunner r0 = new io.netty.util.concurrent.GlobalEventExecutor$TaskRunner
            r0.<init>(r9)
            r2.taskRunner = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.started = r0
            io.netty.util.concurrent.FailedFuture r0 = new io.netty.util.concurrent.FailedFuture
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            r0.<init>(r9, r3)
            r2.terminationFuture = r0
            io.netty.util.internal.PriorityQueue r0 = r9.scheduledTaskQueue()
            r0.add(r1)
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class<io.netty.util.concurrent.GlobalEventExecutor> r1 = io.netty.util.concurrent.GlobalEventExecutor.class
            java.lang.String r1 = io.netty.util.concurrent.DefaultThreadFactory.toPoolName(r1)
            r3 = 0
            r4 = 5
            r0.<init>(r1, r3, r4, r8)
            java.util.concurrent.ThreadFactory r0 = io.netty.util.internal.ThreadExecutorMap.apply(r0, r9)
            r2.threadFactory = r0
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.GlobalEventExecutor.logger
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$100(io.netty.util.concurrent.GlobalEventExecutor r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.started
            return r0
    }

    private void addTask(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r1.taskQueue
            r0.add(r2)
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "task"
            r2.<init>(r0)
            throw r2
    }

    private void fetchFromScheduledTaskQueue() {
            r4 = this;
            long r0 = io.netty.util.concurrent.AbstractScheduledEventExecutor.nanoTime()
            java.lang.Runnable r2 = r4.pollScheduledTask(r0)
        L8:
            if (r2 == 0) goto L14
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r3 = r4.taskQueue
            r3.add(r2)
            java.lang.Runnable r2 = r4.pollScheduledTask(r0)
            goto L8
        L14:
            return
    }

    private void startThread() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.started
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1f
            java.util.concurrent.ThreadFactory r0 = r3.threadFactory
            io.netty.util.concurrent.GlobalEventExecutor$TaskRunner r1 = r3.taskRunner
            java.lang.Thread r0 = r0.newThread(r1)
            io.netty.util.concurrent.GlobalEventExecutor$2 r1 = new io.netty.util.concurrent.GlobalEventExecutor$2
            r1.<init>(r3, r0)
            java.security.AccessController.doPrivileged(r1)
            r3.thread = r0
            r0.start()
        L1f:
            return
    }

    public boolean awaitInactivity(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            if (r4 == 0) goto L1c
            java.lang.Thread r0 = r1.thread
            if (r0 == 0) goto L14
            long r2 = r4.toMillis(r2)
            r0.join(r2)
            boolean r2 = r0.isAlive()
            r2 = r2 ^ 1
            return r2
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "thread was not started"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "unit"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            r1.addTask(r2)
            boolean r2 = r1.inEventLoop()
            if (r2 != 0) goto Le
            r1.startThread()
        Le:
            return
        Lf:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "task"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(java.lang.Thread r2) {
            r1 = this;
            java.lang.Thread r0 = r1.thread
            if (r2 != r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int pendingTasks() {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r1.taskQueue
            int r0 = r0.size()
            return r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public void shutdown() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r1, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            io.netty.util.concurrent.Future r1 = r0.terminationFuture()
            return r1
    }

    java.lang.Runnable takeTask() {
            r7 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r7.taskQueue
        L2:
            io.netty.util.concurrent.ScheduledFutureTask r1 = r7.peekScheduledTask()
            r2 = 0
            if (r1 != 0) goto L11
            java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L10
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.InterruptedException -> L10
            return r0
        L10:
            return r2
        L11:
            long r3 = r1.delayNanos()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L25
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L24
            java.lang.Object r1 = r0.poll(r3, r1)     // Catch: java.lang.InterruptedException -> L24
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.InterruptedException -> L24
            goto L2b
        L24:
            return r2
        L25:
            java.lang.Object r1 = r0.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L2b:
            if (r1 != 0) goto L36
            r7.fetchFromScheduledTaskQueue()
            java.lang.Object r1 = r0.poll()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L36:
            if (r1 == 0) goto L2
            return r1
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Future<?> r0 = r1.terminationFuture
            return r0
    }
}
