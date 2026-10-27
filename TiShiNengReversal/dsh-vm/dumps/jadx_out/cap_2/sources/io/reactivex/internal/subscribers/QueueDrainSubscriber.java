package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriberPad4 implements org.reactivestreams.Subscriber<T>, io.reactivex.internal.util.QueueDrain<U, V> {
    protected final org.reactivestreams.Subscriber<? super V> actual;
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected java.lang.Throwable error;
    protected final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(org.reactivestreams.Subscriber<? super V> r1, io.reactivex.internal.fuseable.SimplePlainQueue<U> r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.queue = r2
            return
    }

    public boolean accept(org.reactivestreams.Subscriber<? super V> r1, U r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
            r1 = this;
            boolean r0 = r1.done
            return r0
    }

    public void drain(boolean r3) {
            r2 = this;
            boolean r0 = r2.enter()
            if (r0 == 0) goto Ld
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
            org.reactivestreams.Subscriber<? super V> r1 = r2.actual
            io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r3, r2)
        Ld:
            return
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r0 = r0.getAndIncrement()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final java.lang.Throwable error() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            return r0
    }

    public final boolean fastEnter() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.wip
            int r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicInteger r0 = r3.wip
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L13
            return r2
        L13:
            return r1
    }

    protected final void fastPathEmitMax(U r8, boolean r9, io.reactivex.disposables.Disposable r10) {
            r7 = this;
            org.reactivestreams.Subscriber<? super V> r0 = r7.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r7.queue
            java.util.concurrent.atomic.AtomicInteger r2 = r7.wip
            int r2 = r2.get()
            if (r2 != 0) goto L4c
            java.util.concurrent.atomic.AtomicInteger r2 = r7.wip
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L4c
            java.util.concurrent.atomic.AtomicLong r2 = r7.requested
            long r2 = r2.get()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L3e
            boolean r8 = r7.accept(r0, r8)
            if (r8 == 0) goto L36
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L36
            r2 = 1
            r7.produced(r2)
        L36:
            r8 = -1
            int r8 = r7.leave(r8)
            if (r8 != 0) goto L56
            goto L55
        L3e:
            r10.dispose()
            io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r9 = "Could not emit buffer due to lack of requests"
            r8.<init>(r9)
            r0.onError(r8)
            return
        L4c:
            r1.offer(r8)
            boolean r8 = r7.enter()
            if (r8 != 0) goto L56
        L55:
            return
        L56:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r1, r0, r9, r10, r7)
            return
    }

    protected final void fastPathOrderedEmitMax(U r9, boolean r10, io.reactivex.disposables.Disposable r11) {
            r8 = this;
            org.reactivestreams.Subscriber<? super V> r0 = r8.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r8.queue
            java.util.concurrent.atomic.AtomicInteger r2 = r8.wip
            int r2 = r2.get()
            if (r2 != 0) goto L58
            java.util.concurrent.atomic.AtomicInteger r2 = r8.wip
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L58
            java.util.concurrent.atomic.AtomicLong r2 = r8.requested
            long r2 = r2.get()
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L48
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L44
            boolean r9 = r8.accept(r0, r9)
            if (r9 == 0) goto L3c
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L3c
            r2 = 1
            r8.produced(r2)
        L3c:
            r9 = -1
            int r9 = r8.leave(r9)
            if (r9 != 0) goto L62
            goto L61
        L44:
            r1.offer(r9)
            goto L62
        L48:
            r8.cancelled = r4
            r11.dispose()
            io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r10 = "Could not emit buffer due to lack of requests"
            r9.<init>(r10)
            r0.onError(r9)
            return
        L58:
            r1.offer(r9)
            boolean r9 = r8.enter()
            if (r9 != 0) goto L62
        L61:
            return
        L62:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r1, r0, r10, r11, r8)
            return
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r2 = r0.addAndGet(r2)
            return r2
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            long r2 = -r2
            long r2 = r0.addAndGet(r2)
            return r2
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.requested
            long r0 = r0.get()
            return r0
    }

    public final void requested(long r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r0 == 0) goto Lb
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
        Lb:
            return
    }
}
