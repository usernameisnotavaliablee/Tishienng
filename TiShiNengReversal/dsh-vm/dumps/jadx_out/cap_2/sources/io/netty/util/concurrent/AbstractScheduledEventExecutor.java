package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractScheduledEventExecutor extends io.netty.util.concurrent.AbstractEventExecutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Comparator<io.netty.util.concurrent.ScheduledFutureTask<?>> SCHEDULED_FUTURE_TASK_COMPARATOR = null;
    io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> scheduledTaskQueue;




    static {
            io.netty.util.concurrent.AbstractScheduledEventExecutor$1 r0 = new io.netty.util.concurrent.AbstractScheduledEventExecutor$1
            r0.<init>()
            io.netty.util.concurrent.AbstractScheduledEventExecutor.SCHEDULED_FUTURE_TASK_COMPARATOR = r0
            return
    }

    protected AbstractScheduledEventExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    protected AbstractScheduledEventExecutor(io.netty.util.concurrent.EventExecutorGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static boolean isNullOrEmpty(java.util.Queue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    protected static long nanoTime() {
            long r0 = io.netty.util.concurrent.ScheduledFutureTask.nanoTime()
            return r0
    }

    private void validateScheduled0(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.validateScheduled(r1, r3)
            return
    }

    protected void cancelScheduledTasks() {
            r6 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r6.scheduledTaskQueue
            boolean r1 = isNullOrEmpty(r0)
            if (r1 == 0) goto L9
            return
        L9:
            r1 = 0
            io.netty.util.concurrent.ScheduledFutureTask[] r2 = new io.netty.util.concurrent.ScheduledFutureTask[r1]
            java.lang.Object[] r2 = r0.toArray(r2)
            io.netty.util.concurrent.ScheduledFutureTask[] r2 = (io.netty.util.concurrent.ScheduledFutureTask[]) r2
            int r3 = r2.length
            r4 = 0
        L14:
            if (r4 >= r3) goto L1e
            r5 = r2[r4]
            r5.cancelWithoutRemove(r1)
            int r4 = r4 + 1
            goto L14
        L1e:
            r0.clearIgnoringIndexes()
            return
    }

    protected final boolean hasScheduledTasks() {
            r5 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r5.scheduledTaskQueue
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.peek()
            io.netty.util.concurrent.ScheduledFutureTask r0 = (io.netty.util.concurrent.ScheduledFutureTask) r0
        Lc:
            if (r0 == 0) goto L1c
            long r0 = r0.deadlineNanos()
            long r2 = nanoTime()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    protected final long nextScheduledTaskNano() {
            r4 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r4.scheduledTaskQueue
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.peek()
            io.netty.util.concurrent.ScheduledFutureTask r0 = (io.netty.util.concurrent.ScheduledFutureTask) r0
        Lc:
            if (r0 != 0) goto L11
            r0 = -1
            return r0
        L11:
            long r0 = r0.deadlineNanos()
            long r2 = nanoTime()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    final io.netty.util.concurrent.ScheduledFutureTask<?> peekScheduledTask() {
            r1 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r1.scheduledTaskQueue
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.peek()
            io.netty.util.concurrent.ScheduledFutureTask r0 = (io.netty.util.concurrent.ScheduledFutureTask) r0
            return r0
    }

    protected final java.lang.Runnable pollScheduledTask() {
            r2 = this;
            long r0 = nanoTime()
            java.lang.Runnable r0 = r2.pollScheduledTask(r0)
            return r0
    }

    protected final java.lang.Runnable pollScheduledTask(long r7) {
            r6 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r6.scheduledTaskQueue
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto Ld
        L7:
            java.lang.Object r2 = r0.peek()
            io.netty.util.concurrent.ScheduledFutureTask r2 = (io.netty.util.concurrent.ScheduledFutureTask) r2
        Ld:
            if (r2 != 0) goto L10
            return r1
        L10:
            long r3 = r2.deadlineNanos()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L1c
            r0.remove()
            return r2
        L1c:
            return r1
    }

    final void removeScheduled(io.netty.util.concurrent.ScheduledFutureTask<?> r2) {
            r1 = this;
            boolean r0 = r1.inEventLoop()
            if (r0 == 0) goto Le
            io.netty.util.internal.PriorityQueue r0 = r1.scheduledTaskQueue()
            r0.removeTyped(r2)
            return
        Le:
            io.netty.util.concurrent.AbstractScheduledEventExecutor$3 r0 = new io.netty.util.concurrent.AbstractScheduledEventExecutor$3
            r0.<init>(r1, r2)
            r1.execute(r0)
            return
    }

    <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(io.netty.util.concurrent.ScheduledFutureTask<V> r2) {
            r1 = this;
            boolean r0 = r1.inEventLoop()
            if (r0 == 0) goto Le
            io.netty.util.internal.PriorityQueue r0 = r1.scheduledTaskQueue()
            r0.add(r2)
            return r2
        Le:
            io.netty.util.concurrent.AbstractScheduledEventExecutor$2 r0 = new io.netty.util.concurrent.AbstractScheduledEventExecutor$2
            r0.<init>(r1, r2)
            r1.execute(r0)
            return r2
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            java.lang.String r0 = "command"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            java.lang.String r0 = "unit"
            io.netty.util.internal.ObjectUtil.checkNotNull(r10, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L11
            r8 = r0
        L11:
            r6.validateScheduled0(r8, r10)
            io.netty.util.concurrent.ScheduledFutureTask r0 = new io.netty.util.concurrent.ScheduledFutureTask
            long r8 = r10.toNanos(r8)
            long r4 = io.netty.util.concurrent.ScheduledFutureTask.deadlineNanos(r8)
            r3 = 0
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4)
            io.netty.util.concurrent.ScheduledFuture r7 = r6.schedule(r0)
            return r7
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            java.lang.String r0 = "callable"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.lang.String r0 = "unit"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L11
            r5 = r0
        L11:
            r3.validateScheduled0(r5, r7)
            io.netty.util.concurrent.ScheduledFutureTask r0 = new io.netty.util.concurrent.ScheduledFutureTask
            long r5 = r7.toNanos(r5)
            long r5 = io.netty.util.concurrent.ScheduledFutureTask.deadlineNanos(r5)
            r0.<init>(r3, r4, r5)
            io.netty.util.concurrent.ScheduledFuture r4 = r3.schedule(r0)
            return r4
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
            return r1
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r13, long r14, long r16, java.util.concurrent.TimeUnit r18) {
            r12 = this;
            r4 = r16
            r6 = r18
            java.lang.String r7 = "command"
            io.netty.util.internal.ObjectUtil.checkNotNull(r13, r7)
            java.lang.String r7 = "unit"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r7)
            r7 = 0
            r8 = 1
            r9 = 0
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 < 0) goto L53
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L3f
            r12.validateScheduled0(r14, r6)
            r12.validateScheduled0(r4, r6)
            io.netty.util.concurrent.ScheduledFutureTask r7 = new io.netty.util.concurrent.ScheduledFutureTask
            r8 = 0
            java.util.concurrent.Callable r0 = java.util.concurrent.Executors.callable(r13, r8)
            long r2 = r6.toNanos(r14)
            long r2 = io.netty.util.concurrent.ScheduledFutureTask.deadlineNanos(r2)
            long r5 = r6.toNanos(r4)
            r1 = r12
            r3 = r2
            r2 = r0
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            io.netty.util.concurrent.ScheduledFuture r0 = r12.schedule(r0)
            return r0
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            java.lang.String r2 = "period: %d (expected: > 0)"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r2)
            throw r0
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            java.lang.String r2 = "initialDelay: %d (expected: >= 0)"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r1
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutorGroup, java.util.concurrent.ScheduledExecutorService
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r13, long r14, long r16, java.util.concurrent.TimeUnit r18) {
            r12 = this;
            r4 = r16
            r6 = r18
            java.lang.String r7 = "command"
            io.netty.util.internal.ObjectUtil.checkNotNull(r13, r7)
            java.lang.String r7 = "unit"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r7)
            r7 = 0
            r8 = 1
            r9 = 0
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 < 0) goto L54
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L40
            r12.validateScheduled0(r14, r6)
            r12.validateScheduled0(r4, r6)
            io.netty.util.concurrent.ScheduledFutureTask r7 = new io.netty.util.concurrent.ScheduledFutureTask
            r8 = 0
            java.util.concurrent.Callable r0 = java.util.concurrent.Executors.callable(r13, r8)
            long r2 = r6.toNanos(r14)
            long r2 = io.netty.util.concurrent.ScheduledFutureTask.deadlineNanos(r2)
            long r4 = r6.toNanos(r4)
            long r5 = -r4
            r1 = r12
            r3 = r2
            r2 = r0
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            io.netty.util.concurrent.ScheduledFuture r0 = r12.schedule(r0)
            return r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            java.lang.String r2 = "delay: %d (expected: > 0)"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r2)
            throw r0
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            java.lang.String r2 = "initialDelay: %d (expected: >= 0)"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = this;
            io.netty.util.concurrent.ScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r1
    }

    io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> scheduledTaskQueue() {
            r3 = this;
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r3.scheduledTaskQueue
            if (r0 != 0) goto Lf
            io.netty.util.internal.DefaultPriorityQueue r0 = new io.netty.util.internal.DefaultPriorityQueue
            java.util.Comparator<io.netty.util.concurrent.ScheduledFutureTask<?>> r1 = io.netty.util.concurrent.AbstractScheduledEventExecutor.SCHEDULED_FUTURE_TASK_COMPARATOR
            r2 = 11
            r0.<init>(r1, r2)
            r3.scheduledTaskQueue = r0
        Lf:
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r3.scheduledTaskQueue
            return r0
    }

    @java.lang.Deprecated
    protected void validateScheduled(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            return
    }
}
