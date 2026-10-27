package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Queues {
    private Queues() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <E> int drain(java.util.concurrent.BlockingQueue<E> r3, java.util.Collection<? super E> r4, int r5, long r6, java.util.concurrent.TimeUnit r8) throws java.lang.InterruptedException {
            com.google.common.base.Preconditions.checkNotNull(r4)
            long r0 = java.lang.System.nanoTime()
            long r6 = r8.toNanos(r6)
            long r0 = r0 + r6
            r6 = 0
        Ld:
            if (r6 >= r5) goto L2d
            int r7 = r5 - r6
            int r7 = r3.drainTo(r4, r7)
            int r6 = r6 + r7
            if (r6 >= r5) goto Ld
            long r7 = java.lang.System.nanoTime()
            long r7 = r0 - r7
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Object r7 = r3.poll(r7, r2)
            if (r7 != 0) goto L27
            return r6
        L27:
            r4.add(r7)
            int r6 = r6 + 1
            goto Ld
        L2d:
            return r6
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <E> int drainUninterruptibly(java.util.concurrent.BlockingQueue<E> r4, java.util.Collection<? super E> r5, int r6, long r7, java.util.concurrent.TimeUnit r9) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            long r0 = java.lang.System.nanoTime()
            long r7 = r9.toNanos(r7)
            long r0 = r0 + r7
            r7 = 0
            r8 = 0
        Le:
            if (r7 >= r6) goto L3c
            int r9 = r6 - r7
            int r9 = r4.drainTo(r5, r9)     // Catch: java.lang.Throwable -> L2e
            int r7 = r7 + r9
            if (r7 >= r6) goto Le
        L19:
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
            long r2 = r0 - r2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
            java.lang.Object r9 = r4.poll(r2, r9)     // Catch: java.lang.Throwable -> L2e java.lang.InterruptedException -> L30
            if (r9 != 0) goto L28
            goto L3c
        L28:
            r5.add(r9)     // Catch: java.lang.Throwable -> L2e
            int r7 = r7 + 1
            goto Le
        L2e:
            r4 = move-exception
            goto L32
        L30:
            r8 = 1
            goto L19
        L32:
            if (r8 == 0) goto L3b
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3b:
            throw r4
        L3c:
            if (r8 == 0) goto L45
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L45:
            return r7
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ArrayBlockingQueue<E> newArrayBlockingQueue(int r1) {
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque() {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            return r0
    }

    public static <E> java.util.ArrayDeque<E> newArrayDeque(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque() {
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(int r1) {
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingDeque<E> newLinkedBlockingDeque(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.concurrent.LinkedBlockingDeque r0 = new java.util.concurrent.LinkedBlockingDeque
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue() {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(int r1) {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.LinkedBlockingQueue<E> newLinkedBlockingQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue() {
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E extends java.lang.Comparable> java.util.concurrent.PriorityBlockingQueue<E> newPriorityBlockingQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue() {
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            return r0
    }

    public static <E extends java.lang.Comparable> java.util.PriorityQueue<E> newPriorityQueue(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        Le:
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.SynchronousQueue<E> newSynchronousQueue() {
            java.util.concurrent.SynchronousQueue r0 = new java.util.concurrent.SynchronousQueue
            r0.<init>()
            return r0
    }

    public static <E> java.util.Deque<E> synchronizedDeque(java.util.Deque<E> r1) {
            r0 = 0
            java.util.Deque r1 = com.google.common.collect.Synchronized.deque(r1, r0)
            return r1
    }

    public static <E> java.util.Queue<E> synchronizedQueue(java.util.Queue<E> r1) {
            r0 = 0
            java.util.Queue r1 = com.google.common.collect.Synchronized.queue(r1, r0)
            return r1
    }
}
