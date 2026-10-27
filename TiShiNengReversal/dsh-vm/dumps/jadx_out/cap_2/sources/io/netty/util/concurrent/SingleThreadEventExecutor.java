package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SingleThreadEventExecutor extends io.netty.util.concurrent.AbstractScheduledEventExecutor implements io.netty.util.concurrent.OrderedEventExecutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int DEFAULT_MAX_PENDING_EXECUTOR_TASKS = 0;
    private static final java.lang.Runnable NOOP_TASK = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor, io.netty.util.concurrent.ThreadProperties> PROPERTIES_UPDATER = null;
    private static final long SCHEDULE_PURGE_INTERVAL = 0;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> STATE_UPDATER = null;
    private static final int ST_NOT_STARTED = 1;
    private static final int ST_SHUTDOWN = 4;
    private static final int ST_SHUTTING_DOWN = 3;
    private static final int ST_STARTED = 2;
    private static final int ST_TERMINATED = 5;
    private static final java.lang.Runnable WAKEUP_TASK = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean addTaskWakesUp;
    private final java.util.concurrent.Executor executor;
    private volatile long gracefulShutdownQuietPeriod;
    private long gracefulShutdownStartTime;
    private volatile long gracefulShutdownTimeout;
    private volatile boolean interrupted;
    private long lastExecutionTime;
    private final int maxPendingTasks;
    private final io.netty.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler;
    private final java.util.Set<java.lang.Runnable> shutdownHooks;
    private volatile int state;
    private final java.util.Queue<java.lang.Runnable> taskQueue;
    private final io.netty.util.concurrent.Promise<?> terminationFuture;
    private volatile java.lang.Thread thread;
    private final java.util.concurrent.CountDownLatch threadLock;
    private volatile io.netty.util.concurrent.ThreadProperties threadProperties;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultThreadProperties implements io.netty.util.concurrent.ThreadProperties {
        private final java.lang.Thread t;

        DefaultThreadProperties(java.lang.Thread r1) {
                r0 = this;
                r0.<init>()
                r0.t = r1
                return
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public long id() {
                r2 = this;
                java.lang.Thread r0 = r2.t
                long r0 = r0.getId()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public boolean isAlive() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                boolean r0 = r0.isAlive()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public boolean isDaemon() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                boolean r0 = r0.isDaemon()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public boolean isInterrupted() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                boolean r0 = r0.isInterrupted()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public java.lang.String name() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public int priority() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                int r0 = r0.getPriority()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public java.lang.StackTraceElement[] stackTrace() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                java.lang.StackTraceElement[] r0 = r0.getStackTrace()
                return r0
        }

        @Override // io.netty.util.concurrent.ThreadProperties
        public java.lang.Thread.State state() {
                r1 = this;
                java.lang.Thread r0 = r1.t
                java.lang.Thread$State r0 = r0.getState()
                return r0
        }
    }

    static {
            java.lang.String r0 = "io.netty.eventexecutor.maxPendingTasks"
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            r1 = 16
            int r0 = java.lang.Math.max(r1, r0)
            io.netty.util.concurrent.SingleThreadEventExecutor.DEFAULT_MAX_PENDING_EXECUTOR_TASKS = r0
            java.lang.Class<io.netty.util.concurrent.SingleThreadEventExecutor> r0 = io.netty.util.concurrent.SingleThreadEventExecutor.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.SingleThreadEventExecutor.logger = r1
            io.netty.util.concurrent.SingleThreadEventExecutor$1 r1 = new io.netty.util.concurrent.SingleThreadEventExecutor$1
            r1.<init>()
            io.netty.util.concurrent.SingleThreadEventExecutor.WAKEUP_TASK = r1
            io.netty.util.concurrent.SingleThreadEventExecutor$2 r1 = new io.netty.util.concurrent.SingleThreadEventExecutor$2
            r1.<init>()
            io.netty.util.concurrent.SingleThreadEventExecutor.NOOP_TASK = r1
            java.lang.String r1 = "state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER = r1
            java.lang.Class<io.netty.util.concurrent.ThreadProperties> r1 = io.netty.util.concurrent.ThreadProperties.class
            java.lang.String r2 = "threadProperties"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            io.netty.util.concurrent.SingleThreadEventExecutor.PROPERTIES_UPDATER = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toNanos(r1)
            io.netty.util.concurrent.SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL = r0
            return
    }

    protected SingleThreadEventExecutor(io.netty.util.concurrent.EventExecutorGroup r7, java.util.concurrent.Executor r8, boolean r9) {
            r6 = this;
            int r4 = io.netty.util.concurrent.SingleThreadEventExecutor.DEFAULT_MAX_PENDING_EXECUTOR_TASKS
            io.netty.util.concurrent.RejectedExecutionHandler r5 = io.netty.util.concurrent.RejectedExecutionHandlers.reject()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected SingleThreadEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2, java.util.concurrent.Executor r3, boolean r4, int r5, io.netty.util.concurrent.RejectedExecutionHandler r6) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.threadLock = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.shutdownHooks = r2
            r1.state = r0
            io.netty.util.concurrent.DefaultPromise r2 = new io.netty.util.concurrent.DefaultPromise
            io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r2.<init>(r0)
            r1.terminationFuture = r2
            r1.addTaskWakesUp = r4
            r2 = 16
            int r2 = java.lang.Math.max(r2, r5)
            r1.maxPendingTasks = r2
            java.util.concurrent.Executor r3 = io.netty.util.internal.ThreadExecutorMap.apply(r3, r1)
            r1.executor = r3
            java.util.Queue r2 = r1.newTaskQueue(r2)
            r1.taskQueue = r2
            java.lang.String r2 = "rejectedHandler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r2)
            io.netty.util.concurrent.RejectedExecutionHandler r2 = (io.netty.util.concurrent.RejectedExecutionHandler) r2
            r1.rejectedExecutionHandler = r2
            return
    }

    protected SingleThreadEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2, java.util.concurrent.Executor r3, boolean r4, java.util.Queue<java.lang.Runnable> r5, io.netty.util.concurrent.RejectedExecutionHandler r6) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.threadLock = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.shutdownHooks = r2
            r1.state = r0
            io.netty.util.concurrent.DefaultPromise r2 = new io.netty.util.concurrent.DefaultPromise
            io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r2.<init>(r0)
            r1.terminationFuture = r2
            r1.addTaskWakesUp = r4
            int r2 = io.netty.util.concurrent.SingleThreadEventExecutor.DEFAULT_MAX_PENDING_EXECUTOR_TASKS
            r1.maxPendingTasks = r2
            java.util.concurrent.Executor r2 = io.netty.util.internal.ThreadExecutorMap.apply(r3, r1)
            r1.executor = r2
            java.lang.String r2 = "taskQueue"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r2)
            java.util.Queue r2 = (java.util.Queue) r2
            r1.taskQueue = r2
            java.lang.String r2 = "rejectedHandler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r2)
            io.netty.util.concurrent.RejectedExecutionHandler r2 = (io.netty.util.concurrent.RejectedExecutionHandler) r2
            r1.rejectedExecutionHandler = r2
            return
    }

    protected SingleThreadEventExecutor(io.netty.util.concurrent.EventExecutorGroup r2, java.util.concurrent.ThreadFactory r3, boolean r4) {
            r1 = this;
            io.netty.util.concurrent.ThreadPerTaskExecutor r0 = new io.netty.util.concurrent.ThreadPerTaskExecutor
            r0.<init>(r3)
            r1.<init>(r2, r0, r4)
            return
    }

    protected SingleThreadEventExecutor(io.netty.util.concurrent.EventExecutorGroup r7, java.util.concurrent.ThreadFactory r8, boolean r9, int r10, io.netty.util.concurrent.RejectedExecutionHandler r11) {
            r6 = this;
            io.netty.util.concurrent.ThreadPerTaskExecutor r2 = new io.netty.util.concurrent.ThreadPerTaskExecutor
            r2.<init>(r8)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ java.util.Set access$000(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            java.util.Set<java.lang.Runnable> r0 = r0.shutdownHooks
            return r0
    }

    static /* synthetic */ java.lang.Thread access$100(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            java.lang.Thread r0 = r0.thread
            return r0
    }

    static /* synthetic */ java.lang.Thread access$102(io.netty.util.concurrent.SingleThreadEventExecutor r0, java.lang.Thread r1) {
            r0.thread = r1
            return r1
    }

    static /* synthetic */ boolean access$200(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            boolean r0 = r0.interrupted
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$300() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.SingleThreadEventExecutor.logger
            return r0
    }

    static /* synthetic */ int access$400(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            int r0 = r0.state
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$500() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r0 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            return r0
    }

    static /* synthetic */ long access$600(io.netty.util.concurrent.SingleThreadEventExecutor r2) {
            long r0 = r2.gracefulShutdownStartTime
            return r0
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch access$700(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            java.util.concurrent.CountDownLatch r0 = r0.threadLock
            return r0
    }

    static /* synthetic */ java.util.Queue access$800(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            java.util.Queue<java.lang.Runnable> r0 = r0.taskQueue
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.Promise access$900(io.netty.util.concurrent.SingleThreadEventExecutor r0) {
            io.netty.util.concurrent.Promise<?> r0 = r0.terminationFuture
            return r0
    }

    private void doStartThread() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            io.netty.util.concurrent.SingleThreadEventExecutor$5 r1 = new io.netty.util.concurrent.SingleThreadEventExecutor$5
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    private boolean ensureThreadStarted(int r4) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L1b
            r3.doStartThread()     // Catch: java.lang.Throwable -> L7
            goto L1b
        L7:
            r4 = move-exception
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r1 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            r2 = 5
            r1.set(r3, r2)
            io.netty.util.concurrent.Promise<?> r1 = r3.terminationFuture
            r1.tryFailure(r4)
            boolean r1 = r4 instanceof java.lang.Exception
            if (r1 != 0) goto L1a
            io.netty.util.internal.PlatformDependent.throwException(r4)
        L1a:
            return r0
        L1b:
            r4 = 0
            return r4
    }

    private boolean fetchFromScheduledTaskQueue() {
            r4 = this;
            long r0 = io.netty.util.concurrent.AbstractScheduledEventExecutor.nanoTime()
            java.lang.Runnable r2 = r4.pollScheduledTask(r0)
        L8:
            if (r2 == 0) goto L22
            java.util.Queue<java.lang.Runnable> r3 = r4.taskQueue
            boolean r3 = r3.offer(r2)
            if (r3 != 0) goto L1d
            io.netty.util.internal.PriorityQueue r0 = r4.scheduledTaskQueue()
            io.netty.util.concurrent.ScheduledFutureTask r2 = (io.netty.util.concurrent.ScheduledFutureTask) r2
            r0.add(r2)
            r0 = 0
            return r0
        L1d:
            java.lang.Runnable r2 = r4.pollScheduledTask(r0)
            goto L8
        L22:
            r0 = 1
            return r0
    }

    protected static java.lang.Runnable pollTaskFrom(java.util.Queue<java.lang.Runnable> r2) {
        L0:
            java.lang.Object r0 = r2.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r1 = io.netty.util.concurrent.SingleThreadEventExecutor.WAKEUP_TASK
            if (r0 != r1) goto Lb
            goto L0
        Lb:
            return r0
    }

    protected static void reject() {
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "event executor terminated"
            r0.<init>(r1)
            throw r0
    }

    private boolean runShutdownHooks() {
            r4 = this;
            r0 = 0
        L1:
            java.util.Set<java.lang.Runnable> r1 = r4.shutdownHooks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set<java.lang.Runnable> r2 = r4.shutdownHooks
            r1.<init>(r2)
            java.util.Set<java.lang.Runnable> r2 = r4.shutdownHooks
            r2.clear()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1
            java.lang.Object r0 = r1.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch: java.lang.Throwable -> L29
            goto L31
        L29:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.SingleThreadEventExecutor.logger
            java.lang.String r3 = "Shutdown hook raised an exception."
            r2.warn(r3, r0)
        L31:
            r0 = 1
            goto L19
        L33:
            if (r0 == 0) goto L3b
            long r1 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            r4.lastExecutionTime = r1
        L3b:
            return r0
    }

    private void startThread() {
            r4 = this;
            int r0 = r4.state
            r1 = 1
            if (r0 != r1) goto L19
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r0 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            r2 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L19
            r4.doStartThread()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r3 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            r3.compareAndSet(r4, r2, r1)
            throw r0
        L19:
            return
    }

    private void throwIfInEventLoop(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.inEventLoop()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Calling "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " from within the EventLoop is not allowed"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void addShutdownHook(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.inEventLoop()
            if (r0 == 0) goto Lc
            java.util.Set<java.lang.Runnable> r0 = r1.shutdownHooks
            r0.add(r2)
            return
        Lc:
            io.netty.util.concurrent.SingleThreadEventExecutor$3 r0 = new io.netty.util.concurrent.SingleThreadEventExecutor$3
            r0.<init>(r1, r2)
            r1.execute(r0)
            return
    }

    protected void addTask(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            boolean r0 = r1.offerTask(r2)
            if (r0 != 0) goto Lb
            r1.reject(r2)
        Lb:
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "task"
            r2.<init>(r0)
            throw r2
    }

    protected void afterRunningAllTasks() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            if (r4 == 0) goto L1a
            boolean r0 = r1.inEventLoop()
            if (r0 != 0) goto L12
            java.util.concurrent.CountDownLatch r0 = r1.threadLock
            r0.await(r2, r4)
            boolean r2 = r1.isTerminated()
            return r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "cannot await termination of the current thread"
            r2.<init>(r3)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "unit"
            r2.<init>(r3)
            throw r2
    }

    protected void cleanup() {
            r0 = this;
            return
    }

    protected boolean confirmShutdown() {
            r9 = this;
            boolean r0 = r9.isShuttingDown()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r9.inEventLoop()
            if (r0 == 0) goto L67
            r9.cancelScheduledTasks()
            long r2 = r9.gracefulShutdownStartTime
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1f
            long r2 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            r9.gracefulShutdownStartTime = r2
        L1f:
            boolean r0 = r9.runAllTasks()
            r2 = 1
            if (r0 != 0) goto L55
            boolean r0 = r9.runShutdownHooks()
            if (r0 == 0) goto L2d
            goto L55
        L2d:
            long r3 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            boolean r0 = r9.isShutdown()
            if (r0 != 0) goto L54
            long r5 = r9.gracefulShutdownStartTime
            long r5 = r3 - r5
            long r7 = r9.gracefulShutdownTimeout
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L42
            goto L54
        L42:
            long r5 = r9.lastExecutionTime
            long r3 = r3 - r5
            long r5 = r9.gracefulShutdownQuietPeriod
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
            r9.wakeup(r2)
            r2 = 100
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L53
        L53:
            return r1
        L54:
            return r2
        L55:
            boolean r0 = r9.isShutdown()
            if (r0 == 0) goto L5c
            return r2
        L5c:
            long r6 = r9.gracefulShutdownQuietPeriod
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L63
            return r2
        L63:
            r9.wakeup(r2)
            return r1
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "must be invoked from an event loop"
            r0.<init>(r1)
            throw r0
    }

    protected long deadlineNanos() {
            r4 = this;
            io.netty.util.concurrent.ScheduledFutureTask r0 = r4.peekScheduledTask()
            if (r0 != 0) goto Le
            long r0 = io.netty.util.concurrent.AbstractScheduledEventExecutor.nanoTime()
            long r2 = io.netty.util.concurrent.SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL
            long r0 = r0 + r2
            return r0
        Le:
            long r0 = r0.deadlineNanos()
            return r0
    }

    protected long delayNanos(long r2) {
            r1 = this;
            io.netty.util.concurrent.ScheduledFutureTask r0 = r1.peekScheduledTask()
            if (r0 != 0) goto L9
            long r2 = io.netty.util.concurrent.SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL
            return r2
        L9:
            long r2 = r0.delayNanos(r2)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            if (r3 == 0) goto L2d
            boolean r0 = r2.inEventLoop()
            r2.addTask(r3)
            if (r0 != 0) goto L1f
            r2.startThread()
            boolean r1 = r2.isShutdown()
            if (r1 == 0) goto L1f
            boolean r1 = r2.removeTask(r3)     // Catch: java.lang.UnsupportedOperationException -> L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L1f
            reject()
        L1f:
            boolean r1 = r2.addTaskWakesUp
            if (r1 != 0) goto L2c
            boolean r3 = r2.wakesUpForTask(r3)
            if (r3 == 0) goto L2c
            r2.wakeup(r0)
        L2c:
            return
        L2d:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "task"
            r3.<init>(r0)
            throw r3
    }

    protected boolean hasTasks() {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
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

    protected void interruptThread() {
            r1 = this;
            java.lang.Thread r0 = r1.thread
            if (r0 != 0) goto L8
            r0 = 1
            r1.interrupted = r0
            return
        L8:
            r0.interrupt()
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = "invokeAll"
            r1.throwIfInEventLoop(r0)
            java.util.List r2 = super.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = "invokeAll"
            r1.throwIfInEventLoop(r0)
            java.util.List r2 = super.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.lang.String r0 = "invokeAny"
            r1.throwIfInEventLoop(r0)
            java.lang.Object r2 = super.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.lang.String r0 = "invokeAny"
            r1.throwIfInEventLoop(r0)
            java.lang.Object r2 = super.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 < r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
            r2 = this;
            int r0 = r2.state
            r1 = 3
            if (r0 < r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r2 = this;
            int r0 = r2.state
            r1 = 5
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    protected java.util.Queue<java.lang.Runnable> newTaskQueue() {
            r1 = this;
            int r0 = r1.maxPendingTasks
            java.util.Queue r0 = r1.newTaskQueue(r0)
            return r0
    }

    protected java.util.Queue<java.lang.Runnable> newTaskQueue(int r2) {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>(r2)
            return r0
    }

    final boolean offerTask(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isShutdown()
            if (r0 == 0) goto L9
            reject()
        L9:
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            boolean r2 = r0.offer(r2)
            return r2
    }

    protected java.lang.Runnable peekTask() {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            java.lang.Object r0 = r0.peek()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
    }

    public int pendingTasks() {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            int r0 = r0.size()
            return r0
    }

    protected java.lang.Runnable pollTask() {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            java.lang.Runnable r0 = pollTaskFrom(r0)
            return r0
    }

    protected final void reject(java.lang.Runnable r2) {
            r1 = this;
            io.netty.util.concurrent.RejectedExecutionHandler r0 = r1.rejectedExecutionHandler
            r0.rejected(r2, r1)
            return
    }

    public void removeShutdownHook(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.inEventLoop()
            if (r0 == 0) goto Lc
            java.util.Set<java.lang.Runnable> r0 = r1.shutdownHooks
            r0.remove(r2)
            return
        Lc:
            io.netty.util.concurrent.SingleThreadEventExecutor$4 r0 = new io.netty.util.concurrent.SingleThreadEventExecutor$4
            r0.<init>(r1, r2)
            r1.execute(r0)
            return
    }

    protected boolean removeTask(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.util.Queue<java.lang.Runnable> r0 = r1.taskQueue
            boolean r2 = r0.remove(r2)
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "task"
            r2.<init>(r0)
            throw r2
    }

    protected abstract void run();

    protected boolean runAllTasks() {
            r3 = this;
            r0 = 0
        L1:
            boolean r1 = r3.fetchFromScheduledTaskQueue()
            java.util.Queue<java.lang.Runnable> r2 = r3.taskQueue
            boolean r2 = r3.runAllTasksFrom(r2)
            if (r2 == 0) goto Le
            r0 = 1
        Le:
            if (r1 == 0) goto L1
            if (r0 == 0) goto L18
            long r1 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            r3.lastExecutionTime = r1
        L18:
            r3.afterRunningAllTasks()
            return r0
    }

    protected boolean runAllTasks(long r8) {
            r7 = this;
            r7.fetchFromScheduledTaskQueue()
            java.lang.Runnable r0 = r7.pollTask()
            if (r0 != 0) goto Le
            r7.afterRunningAllTasks()
            r8 = 0
            return r8
        Le:
            long r1 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            long r1 = r1 + r8
            r8 = 0
            r3 = r8
        L16:
            io.netty.util.concurrent.AbstractEventExecutor.safeExecute(r0)
            r5 = 1
            long r3 = r3 + r5
            r5 = 63
            long r5 = r5 & r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L2c
            long r5 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto L36
        L2c:
            java.lang.Runnable r0 = r7.pollTask()
            if (r0 != 0) goto L16
            long r5 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
        L36:
            r7.afterRunningAllTasks()
            r7.lastExecutionTime = r5
            r8 = 1
            return r8
    }

    protected final boolean runAllTasksFrom(java.util.Queue<java.lang.Runnable> r2) {
            r1 = this;
            java.lang.Runnable r0 = pollTaskFrom(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            io.netty.util.concurrent.AbstractEventExecutor.safeExecute(r0)
            java.lang.Runnable r0 = pollTaskFrom(r2)
            if (r0 != 0) goto L8
            r2 = 1
            return r2
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    @java.lang.Deprecated
    public void shutdown() {
            r5 = this;
            boolean r0 = r5.isShutdown()
            if (r0 == 0) goto L7
            goto L37
        L7:
            boolean r0 = r5.inEventLoop()
        Lb:
            boolean r1 = r5.isShuttingDown()
            if (r1 == 0) goto L12
            goto L37
        L12:
            int r1 = r5.state
            r2 = 4
            r3 = 1
            if (r0 == 0) goto L19
            goto L23
        L19:
            if (r1 == r3) goto L23
            r4 = 2
            if (r1 == r4) goto L23
            r4 = 3
            if (r1 == r4) goto L23
            r3 = 0
            r2 = r1
        L23:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r4 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            boolean r2 = r4.compareAndSet(r5, r1, r2)
            if (r2 == 0) goto Lb
            boolean r1 = r5.ensureThreadStarted(r1)
            if (r1 == 0) goto L32
            goto L37
        L32:
            if (r3 == 0) goto L37
            r5.wakeup(r0)
        L37:
            return
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> shutdownGracefully(long r6, long r8, java.util.concurrent.TimeUnit r10) {
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L87
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L63
            if (r10 == 0) goto L5b
            boolean r0 = r5.isShuttingDown()
            if (r0 == 0) goto L17
            io.netty.util.concurrent.Future r6 = r5.terminationFuture()
            return r6
        L17:
            boolean r0 = r5.inEventLoop()
        L1b:
            boolean r1 = r5.isShuttingDown()
            if (r1 == 0) goto L26
            io.netty.util.concurrent.Future r6 = r5.terminationFuture()
            return r6
        L26:
            int r1 = r5.state
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L2d
            goto L34
        L2d:
            if (r1 == r3) goto L34
            r4 = 2
            if (r1 == r4) goto L34
            r3 = 0
            r2 = r1
        L34:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor> r4 = io.netty.util.concurrent.SingleThreadEventExecutor.STATE_UPDATER
            boolean r2 = r4.compareAndSet(r5, r1, r2)
            if (r2 == 0) goto L1b
            long r6 = r10.toNanos(r6)
            r5.gracefulShutdownQuietPeriod = r6
            long r6 = r10.toNanos(r8)
            r5.gracefulShutdownTimeout = r6
            boolean r6 = r5.ensureThreadStarted(r1)
            if (r6 == 0) goto L51
            io.netty.util.concurrent.Promise<?> r6 = r5.terminationFuture
            return r6
        L51:
            if (r3 == 0) goto L56
            r5.wakeup(r0)
        L56:
            io.netty.util.concurrent.Future r6 = r5.terminationFuture()
            return r6
        L5b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "unit"
            r6.<init>(r7)
            throw r6
        L63:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "timeout: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " (expected >= quietPeriod ("
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = "))"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r10.<init>(r6)
            throw r10
        L87:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "quietPeriod: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = " (expected >= 0)"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r8.<init>(r6)
            throw r8
    }

    protected java.lang.Runnable takeTask() {
            r7 = this;
            java.util.Queue<java.lang.Runnable> r0 = r7.taskQueue
            boolean r1 = r0 instanceof java.util.concurrent.BlockingQueue
            if (r1 == 0) goto L41
            java.util.concurrent.BlockingQueue r0 = (java.util.concurrent.BlockingQueue) r0
        L8:
            io.netty.util.concurrent.ScheduledFutureTask r1 = r7.peekScheduledTask()
            r2 = 0
            if (r1 != 0) goto L1d
            java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Runnable r1 = io.netty.util.concurrent.SingleThreadEventExecutor.WAKEUP_TASK     // Catch: java.lang.InterruptedException -> L1b
            if (r0 != r1) goto L1a
            return r2
        L1a:
            return r0
        L1b:
            r2 = r0
        L1c:
            return r2
        L1d:
            long r3 = r1.delayNanos()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L32
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L31
            java.lang.Object r1 = r0.poll(r3, r1)     // Catch: java.lang.InterruptedException -> L31
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.InterruptedException -> L31
            r2 = r1
            goto L32
        L31:
            return r2
        L32:
            if (r2 != 0) goto L3e
            r7.fetchFromScheduledTaskQueue()
            java.lang.Object r1 = r0.poll()
            r2 = r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2
        L3e:
            if (r2 == 0) goto L8
            return r2
        L41:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public io.netty.util.concurrent.Future<?> terminationFuture() {
            r1 = this;
            io.netty.util.concurrent.Promise<?> r0 = r1.terminationFuture
            return r0
    }

    public final io.netty.util.concurrent.ThreadProperties threadProperties() {
            r3 = this;
            io.netty.util.concurrent.ThreadProperties r0 = r3.threadProperties
            if (r0 != 0) goto L25
            java.lang.Thread r0 = r3.thread
            if (r0 != 0) goto L13
            java.lang.Runnable r0 = io.netty.util.concurrent.SingleThreadEventExecutor.NOOP_TASK
            io.netty.util.concurrent.Future r0 = r3.submit(r0)
            r0.syncUninterruptibly()
            java.lang.Thread r0 = r3.thread
        L13:
            io.netty.util.concurrent.SingleThreadEventExecutor$DefaultThreadProperties r1 = new io.netty.util.concurrent.SingleThreadEventExecutor$DefaultThreadProperties
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.SingleThreadEventExecutor, io.netty.util.concurrent.ThreadProperties> r0 = io.netty.util.concurrent.SingleThreadEventExecutor.PROPERTIES_UPDATER
            r2 = 0
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r2, r1)
            if (r0 != 0) goto L24
            io.netty.util.concurrent.ThreadProperties r0 = r3.threadProperties
            return r0
        L24:
            return r1
        L25:
            return r0
    }

    protected void updateLastExecutionTime() {
            r2 = this;
            long r0 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            r2.lastExecutionTime = r0
            return
    }

    protected boolean wakesUpForTask(java.lang.Runnable r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    protected void wakeup(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            int r2 = r1.state
            r0 = 3
            if (r2 != r0) goto L8
            goto L9
        L8:
            return
        L9:
            java.util.Queue<java.lang.Runnable> r2 = r1.taskQueue
            java.lang.Runnable r0 = io.netty.util.concurrent.SingleThreadEventExecutor.WAKEUP_TASK
            r2.offer(r0)
            return
    }
}
