package io.reactivex.internal.subscriptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FullArbiter<T> extends io.reactivex.internal.subscriptions.FullArbiterPad2 implements org.reactivestreams.Subscription {
    static final org.reactivestreams.Subscription INITIAL = null;
    static final java.lang.Object REQUEST = null;
    final org.reactivestreams.Subscriber<? super T> actual;
    volatile boolean cancelled;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
    long requested;
    io.reactivex.disposables.Disposable resource;
    volatile org.reactivestreams.Subscription s;


    static {
            io.reactivex.internal.subscriptions.FullArbiter$1 r0 = new io.reactivex.internal.subscriptions.FullArbiter$1
            r0.<init>()
            io.reactivex.internal.subscriptions.FullArbiter.INITIAL = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.subscriptions.FullArbiter.REQUEST = r0
            return
    }

    public FullArbiter(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.disposables.Disposable r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.resource = r2
            io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            r1.<init>(r3)
            r0.queue = r1
            org.reactivestreams.Subscription r1 = io.reactivex.internal.subscriptions.FullArbiter.INITIAL
            r0.s = r1
            return
    }

    public void cancel() {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 != 0) goto La
            r0 = 1
            r1.cancelled = r0
            r1.dispose()
        La:
            return
    }

    void dispose() {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.resource
            r1 = 0
            r2.resource = r1
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    void drain() {
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r11.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            goto L1e
        L9:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r11.queue
            org.reactivestreams.Subscriber<? super T> r1 = r11.actual
            r2 = 1
            r3 = 1
        Lf:
            java.lang.Object r4 = r0.poll()
            if (r4 != 0) goto L1f
            java.util.concurrent.atomic.AtomicInteger r4 = r11.wip
            int r3 = -r3
            int r3 = r4.addAndGet(r3)
            if (r3 != 0) goto Lf
        L1e:
            return
        L1f:
            java.lang.Object r5 = r0.poll()
            java.lang.Object r6 = io.reactivex.internal.subscriptions.FullArbiter.REQUEST
            r7 = 0
            if (r4 != r6) goto L41
            java.util.concurrent.atomic.AtomicLong r4 = r11.missedRequested
            long r4 = r4.getAndSet(r7)
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto Lf
            long r6 = r11.requested
            long r6 = io.reactivex.internal.util.BackpressureHelper.addCap(r6, r4)
            r11.requested = r6
            org.reactivestreams.Subscription r6 = r11.s
            r6.request(r4)
            goto Lf
        L41:
            org.reactivestreams.Subscription r6 = r11.s
            if (r4 != r6) goto Lf
            boolean r4 = io.reactivex.internal.util.NotificationLite.isSubscription(r5)
            if (r4 == 0) goto L63
            org.reactivestreams.Subscription r4 = io.reactivex.internal.util.NotificationLite.getSubscription(r5)
            boolean r5 = r11.cancelled
            if (r5 != 0) goto L5f
            r11.s = r4
            long r5 = r11.requested
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto Lf
            r4.request(r5)
            goto Lf
        L5f:
            r4.cancel()
            goto Lf
        L63:
            boolean r4 = io.reactivex.internal.util.NotificationLite.isError(r5)
            if (r4 == 0) goto L81
            r0.clear()
            r11.dispose()
            java.lang.Throwable r4 = io.reactivex.internal.util.NotificationLite.getError(r5)
            boolean r5 = r11.cancelled
            if (r5 != 0) goto L7d
            r11.cancelled = r2
            r1.onError(r4)
            goto Lf
        L7d:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            goto Lf
        L81:
            boolean r4 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
            if (r4 == 0) goto L98
            r0.clear()
            r11.dispose()
            boolean r4 = r11.cancelled
            if (r4 != 0) goto Lf
            r11.cancelled = r2
            r1.onComplete()
            goto Lf
        L98:
            long r9 = r11.requested
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto Lf
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r5)
            r1.onNext(r4)
            r4 = 1
            long r9 = r9 - r4
            r11.requested = r9
            goto Lf
    }

    public void onComplete(org.reactivestreams.Subscription r3) {
            r2 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()
            r0.offer(r3, r1)
            r2.drain()
            return
    }

    public void onError(java.lang.Throwable r2, org.reactivestreams.Subscription r3) {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
        L8:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
            r0.offer(r3, r2)
            r1.drain()
            return
    }

    public boolean onNext(T r2, org.reactivestreams.Subscription r3) {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
            r0.offer(r3, r2)
            r1.drain()
            r2 = 1
            return r2
    }

    public void request(long r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r0 == 0) goto L15
            java.util.concurrent.atomic.AtomicLong r0 = r1.missedRequested
            io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r1.queue
            java.lang.Object r3 = io.reactivex.internal.subscriptions.FullArbiter.REQUEST
            r2.offer(r3, r3)
            r1.drain()
        L15:
            return
    }

    public boolean setSubscription(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.cancelled
            if (r0 == 0) goto Lb
            if (r3 == 0) goto L9
            r3.cancel()
        L9:
            r3 = 0
            return r3
        Lb:
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
            org.reactivestreams.Subscription r1 = r2.s
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.subscription(r3)
            r0.offer(r1, r3)
            r2.drain()
            r3 = 1
            return r3
    }
}
