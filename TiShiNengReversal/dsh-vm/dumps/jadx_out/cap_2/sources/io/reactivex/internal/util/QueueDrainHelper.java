package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> boolean checkTerminated(boolean r2, boolean r3, io.reactivex.Observer<?> r4, boolean r5, io.reactivex.internal.fuseable.SimpleQueue<?> r6, io.reactivex.disposables.Disposable r7, io.reactivex.internal.util.ObservableQueueDrain<T, U> r8) {
            boolean r0 = r8.cancelled()
            r1 = 1
            if (r0 == 0) goto Le
            r6.clear()
            r7.dispose()
            return r1
        Le:
            if (r2 == 0) goto L3e
            if (r5 == 0) goto L25
            if (r3 == 0) goto L3e
            r7.dispose()
            java.lang.Throwable r2 = r8.error()
            if (r2 == 0) goto L21
            r4.onError(r2)
            goto L24
        L21:
            r4.onComplete()
        L24:
            return r1
        L25:
            java.lang.Throwable r2 = r8.error()
            if (r2 == 0) goto L35
            r6.clear()
            r7.dispose()
            r4.onError(r2)
            return r1
        L35:
            if (r3 == 0) goto L3e
            r7.dispose()
            r4.onComplete()
            return r1
        L3e:
            r2 = 0
            return r2
    }

    public static <T, U> boolean checkTerminated(boolean r2, boolean r3, org.reactivestreams.Subscriber<?> r4, boolean r5, io.reactivex.internal.fuseable.SimpleQueue<?> r6, io.reactivex.internal.util.QueueDrain<T, U> r7) {
            boolean r0 = r7.cancelled()
            r1 = 1
            if (r0 == 0) goto Lb
            r6.clear()
            return r1
        Lb:
            if (r2 == 0) goto L32
            if (r5 == 0) goto L1f
            if (r3 == 0) goto L32
            java.lang.Throwable r2 = r7.error()
            if (r2 == 0) goto L1b
            r4.onError(r2)
            goto L1e
        L1b:
            r4.onComplete()
        L1e:
            return r1
        L1f:
            java.lang.Throwable r2 = r7.error()
            if (r2 == 0) goto L2c
            r6.clear()
            r4.onError(r2)
            return r1
        L2c:
            if (r3 == 0) goto L32
            r4.onComplete()
            return r1
        L32:
            r2 = 0
            return r2
    }

    public static <T> io.reactivex.internal.fuseable.SimpleQueue<T> createQueue(int r1) {
            if (r1 >= 0) goto L9
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            int r1 = -r1
            r0.<init>(r1)
            return r0
        L9:
            io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
            r0.<init>(r1)
            return r0
    }

    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimpleQueue<T> r9, io.reactivex.Observer<? super U> r10, boolean r11, io.reactivex.disposables.Disposable r12, io.reactivex.internal.util.ObservableQueueDrain<T, U> r13) {
            r0 = 1
            r1 = 1
        L2:
            boolean r2 = r13.done()
            boolean r3 = r9.isEmpty()
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            boolean r9 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L16
            goto L35
        L16:
            boolean r2 = r8.done()
            java.lang.Object r9 = r6.poll()     // Catch: java.lang.Throwable -> L40
            if (r9 != 0) goto L22
            r3 = 1
            goto L24
        L22:
            r10 = 0
            r3 = 0
        L24:
            boolean r10 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            r11 = r3
            if (r10 == 0) goto L2c
            goto L35
        L2c:
            if (r11 == 0) goto L3c
            int r9 = -r1
            int r1 = r8.leave(r9)
            if (r1 != 0) goto L36
        L35:
            return
        L36:
            r10 = r4
            r11 = r5
            r9 = r6
            r12 = r7
            r13 = r8
            goto L2
        L3c:
            r8.accept(r4, r9)
            goto L16
        L40:
            r0 = move-exception
            r9 = r0
            io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
            r4.onError(r9)
            return
    }

    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimpleQueue<T> r11, org.reactivestreams.Subscriber<? super U> r12, boolean r13, io.reactivex.internal.util.QueueDrain<T, U> r14) {
            r0 = 1
            r1 = 1
        L2:
            boolean r2 = r14.done()
            boolean r3 = r11.isEmpty()
            r6 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            boolean r11 = checkTerminated(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L15
            goto L61
        L15:
            long r11 = r7.requested()
            r13 = 0
            r8 = r13
        L1c:
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r2 == 0) goto L4a
            boolean r2 = r7.done()
            java.lang.Object r10 = r6.poll()     // Catch: java.lang.Throwable -> L41
            if (r10 != 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L34
            goto L61
        L34:
            if (r3 == 0) goto L37
            goto L4a
        L37:
            boolean r2 = r7.accept(r4, r10)
            if (r2 == 0) goto L1c
            r2 = 1
            long r8 = r8 + r2
            goto L1c
        L41:
            r0 = move-exception
            r11 = r0
            io.reactivex.exceptions.Exceptions.throwIfFatal(r11)
            r4.onError(r11)
            return
        L4a:
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 == 0) goto L5a
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L5a
            r7.produced(r8)
        L5a:
            int r11 = -r1
            int r1 = r7.leave(r11)
            if (r1 != 0) goto L62
        L61:
            return
        L62:
            r12 = r4
            r13 = r5
            r11 = r6
            r14 = r7
            goto L2
    }

    public static <T, U> void drainMaxLoop(io.reactivex.internal.fuseable.SimpleQueue<T> r9, org.reactivestreams.Subscriber<? super U> r10, boolean r11, io.reactivex.disposables.Disposable r12, io.reactivex.internal.util.QueueDrain<T, U> r13) {
            r0 = 1
            r1 = 1
        L2:
            boolean r2 = r13.done()
            java.lang.Object r8 = r9.poll()     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L12
            r3 = 1
        Ld:
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            goto L14
        L12:
            r3 = 0
            goto Ld
        L14:
            boolean r9 = checkTerminated(r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L20
            if (r12 == 0) goto L29
            r12.dispose()
            return
        L20:
            if (r3 == 0) goto L2f
            int r9 = -r1
            int r1 = r7.leave(r9)
            if (r1 != 0) goto L2a
        L29:
            return
        L2a:
            r10 = r4
            r11 = r5
            r9 = r6
            r13 = r7
            goto L2
        L2f:
            long r9 = r7.requested()
            r2 = 0
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L4e
            boolean r11 = r7.accept(r4, r8)
            if (r11 == 0) goto L2a
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L2a
            r9 = 1
            r7.produced(r9)
            goto L2a
        L4e:
            r6.clear()
            if (r12 == 0) goto L56
            r12.dispose()
        L56:
            io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r10 = "Could not emit value due to lack of requests."
            r9.<init>(r10)
            r4.onError(r9)
            return
        L61:
            r0 = move-exception
            r4 = r10
            r9 = r0
            io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
            r4.onError(r9)
            return
    }

    static boolean isCancelled(io.reactivex.functions.BooleanSupplier r0) {
            boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r0 = 1
            return r0
    }

    public static <T> void postComplete(org.reactivestreams.Subscriber<? super T> r9, java.util.Queue<T> r10, java.util.concurrent.atomic.AtomicLong r11, io.reactivex.functions.BooleanSupplier r12) {
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
            r9.onComplete()
            return
        La:
            long r1 = r11.get()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r9 = postCompleteDrain(r1, r3, r4, r5, r6)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            if (r9 == 0) goto L1d
            goto L3b
        L1d:
            long r9 = r4.get()
            r11 = -9223372036854775808
            long r0 = r9 & r11
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L2c
            goto L3b
        L2c:
            long r0 = r9 | r11
            boolean r11 = r4.compareAndSet(r9, r0)
            if (r11 == 0) goto L1d
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3b
            postCompleteDrain(r0, r2, r3, r4, r5)
        L3b:
            return
    }

    static <T> boolean postCompleteDrain(long r9, org.reactivestreams.Subscriber<? super T> r11, java.util.Queue<T> r12, java.util.concurrent.atomic.AtomicLong r13, io.reactivex.functions.BooleanSupplier r14) {
            r0 = -9223372036854775808
            long r2 = r9 & r0
        L4:
            r4 = 1
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 == 0) goto L21
            boolean r5 = isCancelled(r14)
            if (r5 == 0) goto L10
            return r4
        L10:
            java.lang.Object r5 = r12.poll()
            if (r5 != 0) goto L1a
            r11.onComplete()
            return r4
        L1a:
            r11.onNext(r5)
            r4 = 1
            long r2 = r2 + r4
            goto L4
        L21:
            boolean r9 = isCancelled(r14)
            if (r9 == 0) goto L28
            return r4
        L28:
            boolean r9 = r12.isEmpty()
            if (r9 == 0) goto L32
            r11.onComplete()
            return r4
        L32:
            long r9 = r13.get()
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L4
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r9
            long r2 = -r2
            long r2 = r13.addAndGet(r2)
            long r9 = r9 & r2
            r4 = 0
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 != 0) goto L4e
            r9 = 0
            return r9
        L4e:
            long r9 = r2 & r0
            r7 = r2
            r2 = r9
            r9 = r7
            goto L4
    }

    public static <T> boolean postCompleteRequest(long r8, org.reactivestreams.Subscriber<? super T> r10, java.util.Queue<T> r11, java.util.concurrent.atomic.AtomicLong r12, io.reactivex.functions.BooleanSupplier r13) {
        L0:
            long r0 = r12.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            r4 = -9223372036854775808
            long r6 = r0 & r4
            long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r2, r8)
            long r2 = r2 | r6
            boolean r2 = r12.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L23
            long r8 = r8 | r4
            postCompleteDrain(r8, r10, r11, r12, r13)
            r8 = 1
            return r8
        L23:
            r8 = 0
            return r8
    }

    public static void request(org.reactivestreams.Subscription r2, int r3) {
            if (r3 >= 0) goto L8
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L9
        L8:
            long r0 = (long) r3
        L9:
            r2.request(r0)
            return
    }
}
