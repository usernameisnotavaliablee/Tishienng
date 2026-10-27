package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Uninterruptibles {
    private Uninterruptibles() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.GwtIncompatible
    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch r1) {
            r0 = 0
        L1:
            r1.await()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            boolean r3 = r3.await(r4, r6)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r3 = move-exception
            goto L24
        L1c:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r4 = r1 - r4
            goto La
        L24:
            if (r0 == 0) goto L2d
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2d:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean awaitUninterruptibly(java.util.concurrent.locks.Condition r3, long r4, java.util.concurrent.TimeUnit r6) {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            boolean r3 = r3.await(r4, r6)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r3 = move-exception
            goto L24
        L1c:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r4 = r1 - r4
            goto La
        L24:
            if (r0 == 0) goto L2d
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2d:
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> r3, long r4, java.util.concurrent.TimeUnit r6) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r4
        La:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            java.lang.Object r3 = r3.get(r4, r6)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r3 = move-exception
            goto L24
        L1c:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r4 = r1 - r4
            goto La
        L24:
            if (r0 == 0) goto L2d
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2d:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static void joinUninterruptibly(java.lang.Thread r1) {
            r0 = 0
        L1:
            r1.join()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static void joinUninterruptibly(java.lang.Thread r3, long r4, java.util.concurrent.TimeUnit r6) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L1c
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1c
            long r1 = r1 + r4
        Ld:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1c java.lang.InterruptedException -> L1e
            r6.timedJoin(r3, r4)     // Catch: java.lang.Throwable -> L1c java.lang.InterruptedException -> L1e
            if (r0 == 0) goto L1b
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L1b:
            return
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            r0 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1c
            long r4 = r1 - r4
            goto Ld
        L26:
            if (r0 == 0) goto L2f
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2f:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> r1, E r2) {
            r0 = 0
        L1:
            r1.put(r2)     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L18:
            throw r1
        L19:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static void sleepUninterruptibly(long r3, java.util.concurrent.TimeUnit r5) {
            r0 = 0
            long r3 = r5.toNanos(r3)     // Catch: java.lang.Throwable -> L19
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L19
            long r1 = r1 + r3
        La:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            r5.sleep(r3)     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L1b
            if (r0 == 0) goto L18
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L18:
            return
        L19:
            r3 = move-exception
            goto L23
        L1b:
            r0 = 1
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L19
            long r3 = r1 - r3
            goto La
        L23:
            if (r0 == 0) goto L2c
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2c:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore r3, int r4, long r5, java.util.concurrent.TimeUnit r7) {
            r0 = 0
            long r5 = r7.toNanos(r5)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r5
        La:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            boolean r3 = r3.tryAcquire(r4, r5, r7)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1c
            if (r0 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return r3
        L1a:
            r3 = move-exception
            goto L24
        L1c:
            r0 = 1
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r5 = r1 - r5
            goto La
        L24:
            if (r0 == 0) goto L2d
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L2d:
            throw r3
    }

    @com.google.common.annotations.GwtIncompatible
    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = 1
            boolean r1 = tryAcquireUninterruptibly(r1, r0, r2, r4)
            return r1
    }
}
