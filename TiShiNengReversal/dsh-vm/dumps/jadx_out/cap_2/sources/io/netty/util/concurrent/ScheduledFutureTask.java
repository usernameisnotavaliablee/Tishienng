package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class ScheduledFutureTask<V> extends io.netty.util.concurrent.PromiseTask<V> implements io.netty.util.concurrent.ScheduledFuture<V>, io.netty.util.internal.PriorityQueueNode {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long START_TIME = 0;
    private static final java.util.concurrent.atomic.AtomicLong nextTaskId = null;
    private long deadlineNanos;
    private final long id;
    private final long periodNanos;
    private int queueIndex;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            io.netty.util.concurrent.ScheduledFutureTask.nextTaskId = r0
            long r0 = java.lang.System.nanoTime()
            io.netty.util.concurrent.ScheduledFutureTask.START_TIME = r0
            return
    }

    ScheduledFutureTask(io.netty.util.concurrent.AbstractScheduledEventExecutor r1, java.lang.Runnable r2, V r3, long r4) {
            r0 = this;
            java.util.concurrent.Callable r2 = io.netty.util.concurrent.PromiseTask.toCallable(r2, r3)
            r0.<init>(r1, r2, r4)
            return
    }

    ScheduledFutureTask(io.netty.util.concurrent.AbstractScheduledEventExecutor r1, java.util.concurrent.Callable<V> r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.concurrent.atomic.AtomicLong r1 = io.netty.util.concurrent.ScheduledFutureTask.nextTaskId
            long r1 = r1.getAndIncrement()
            r0.id = r1
            r1 = -1
            r0.queueIndex = r1
            r0.deadlineNanos = r3
            r1 = 0
            r0.periodNanos = r1
            return
    }

    ScheduledFutureTask(io.netty.util.concurrent.AbstractScheduledEventExecutor r2, java.util.concurrent.Callable<V> r3, long r4, long r6) {
            r1 = this;
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicLong r2 = io.netty.util.concurrent.ScheduledFutureTask.nextTaskId
            long r2 = r2.getAndIncrement()
            r1.id = r2
            r2 = -1
            r1.queueIndex = r2
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            r1.deadlineNanos = r4
            r1.periodNanos = r6
            return
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "period: 0 (expected: != 0)"
            r2.<init>(r3)
            throw r2
    }

    static long deadlineNanos(long r3) {
            long r0 = nanoTime()
            long r0 = r0 + r3
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L11
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        L11:
            return r0
    }

    static long nanoTime() {
            long r0 = java.lang.System.nanoTime()
            long r2 = io.netty.util.concurrent.ScheduledFutureTask.START_TIME
            long r0 = r0 - r2
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            boolean r2 = super.cancel(r2)
            if (r2 == 0) goto Lf
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.AbstractScheduledEventExecutor r0 = (io.netty.util.concurrent.AbstractScheduledEventExecutor) r0
            r0.removeScheduled(r1)
        Lf:
            return r2
    }

    boolean cancelWithoutRemove(boolean r1) {
            r0 = this;
            boolean r1 = super.cancel(r1)
            return r1
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
            r0 = this;
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(java.util.concurrent.Delayed r8) {
            r7 = this;
            if (r7 != r8) goto L4
            r8 = 0
            return r8
        L4:
            io.netty.util.concurrent.ScheduledFutureTask r8 = (io.netty.util.concurrent.ScheduledFutureTask) r8
            long r0 = r7.deadlineNanos()
            long r2 = r8.deadlineNanos()
            long r0 = r0 - r2
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L17
            return r4
        L17:
            r0 = 1
            if (r5 <= 0) goto L1b
            return r0
        L1b:
            long r1 = r7.id
            long r5 = r8.id
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L24
            return r4
        L24:
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L29
            return r0
        L29:
            java.lang.Error r8 = new java.lang.Error
            r8.<init>()
            throw r8
    }

    public long deadlineNanos() {
            r2 = this;
            long r0 = r2.deadlineNanos
            return r0
    }

    public long delayNanos() {
            r4 = this;
            long r0 = r4.deadlineNanos()
            long r2 = nanoTime()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public long delayNanos(long r5) {
            r4 = this;
            long r0 = r4.deadlineNanos()
            long r2 = io.netty.util.concurrent.ScheduledFutureTask.START_TIME
            long r5 = r5 - r2
            long r0 = r0 - r5
            r5 = 0
            long r5 = java.lang.Math.max(r5, r0)
            return r5
    }

    @Override // io.netty.util.concurrent.DefaultPromise
    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super.executor()
            return r0
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.delayNanos()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    @Override // io.netty.util.internal.PriorityQueueNode
    public int priorityQueueIndex(io.netty.util.internal.DefaultPriorityQueue<?> r1) {
            r0 = this;
            int r1 = r0.queueIndex
            return r1
    }

    @Override // io.netty.util.internal.PriorityQueueNode
    public void priorityQueueIndex(io.netty.util.internal.DefaultPriorityQueue<?> r1, int r2) {
            r0 = this;
            r0.queueIndex = r2
            return
    }

    @Override // io.netty.util.concurrent.PromiseTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r5 = this;
            long r0 = r5.periodNanos     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            boolean r0 = r5.setUncancellableInternal()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L53
            java.util.concurrent.Callable<V> r0 = r5.task     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L18
            r5.setSuccessInternal(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            goto L54
        L1a:
            boolean r0 = r5.isCancelled()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L53
            java.util.concurrent.Callable<V> r0 = r5.task     // Catch: java.lang.Throwable -> L18
            r0.call()     // Catch: java.lang.Throwable -> L18
            io.netty.util.concurrent.EventExecutor r0 = r5.executor()     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L53
            long r0 = r5.periodNanos     // Catch: java.lang.Throwable -> L18
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3b
            long r2 = r5.deadlineNanos     // Catch: java.lang.Throwable -> L18
            long r2 = r2 + r0
            r5.deadlineNanos = r2     // Catch: java.lang.Throwable -> L18
            goto L42
        L3b:
            long r2 = nanoTime()     // Catch: java.lang.Throwable -> L18
            long r2 = r2 - r0
            r5.deadlineNanos = r2     // Catch: java.lang.Throwable -> L18
        L42:
            boolean r0 = r5.isCancelled()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L53
            io.netty.util.concurrent.EventExecutor r0 = r5.executor()     // Catch: java.lang.Throwable -> L18
            io.netty.util.concurrent.AbstractScheduledEventExecutor r0 = (io.netty.util.concurrent.AbstractScheduledEventExecutor) r0     // Catch: java.lang.Throwable -> L18
            io.netty.util.internal.PriorityQueue<io.netty.util.concurrent.ScheduledFutureTask<?>> r0 = r0.scheduledTaskQueue     // Catch: java.lang.Throwable -> L18
            r0.add(r5)     // Catch: java.lang.Throwable -> L18
        L53:
            return
        L54:
            r5.setFailureInternal(r0)
            return
    }

    @Override // io.netty.util.concurrent.PromiseTask, io.netty.util.concurrent.DefaultPromise
    protected java.lang.StringBuilder toStringBuilder() {
            r3 = this;
            java.lang.StringBuilder r0 = super.toStringBuilder()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r2 = 44
            r0.setCharAt(r1, r2)
            java.lang.String r1 = " id: "
            r0.append(r1)
            long r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", deadline: "
            r0.append(r1)
            long r1 = r3.deadlineNanos
            r0.append(r1)
            java.lang.String r1 = ", period: "
            r0.append(r1)
            long r1 = r3.periodNanos
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            return r0
    }
}
