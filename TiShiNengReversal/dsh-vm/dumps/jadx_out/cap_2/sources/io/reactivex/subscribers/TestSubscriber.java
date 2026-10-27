package io.reactivex.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class TestSubscriber<T> extends io.reactivex.observers.BaseTestConsumer<T, io.reactivex.subscribers.TestSubscriber<T>> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private final org.reactivestreams.Subscriber<? super T> actual;
    private volatile boolean cancelled;
    private final java.util.concurrent.atomic.AtomicLong missedRequested;
    private io.reactivex.internal.fuseable.QueueSubscription<T> qs;
    private final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> subscription;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum EmptySubscriber extends java.lang.Enum<io.reactivex.subscribers.TestSubscriber.EmptySubscriber> implements org.reactivestreams.Subscriber<java.lang.Object> {
        private static final /* synthetic */ io.reactivex.subscribers.TestSubscriber.EmptySubscriber[] $VALUES = null;
        public static final io.reactivex.subscribers.TestSubscriber.EmptySubscriber INSTANCE = null;

        static {
                io.reactivex.subscribers.TestSubscriber$EmptySubscriber r0 = new io.reactivex.subscribers.TestSubscriber$EmptySubscriber
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.subscribers.TestSubscriber.EmptySubscriber.INSTANCE = r0
                r1 = 1
                io.reactivex.subscribers.TestSubscriber$EmptySubscriber[] r1 = new io.reactivex.subscribers.TestSubscriber.EmptySubscriber[r1]
                r1[r2] = r0
                io.reactivex.subscribers.TestSubscriber.EmptySubscriber.$VALUES = r1
                return
        }

        EmptySubscriber(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.subscribers.TestSubscriber.EmptySubscriber valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.subscribers.TestSubscriber$EmptySubscriber> r0 = io.reactivex.subscribers.TestSubscriber.EmptySubscriber.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.subscribers.TestSubscriber$EmptySubscriber r1 = (io.reactivex.subscribers.TestSubscriber.EmptySubscriber) r1
                return r1
        }

        public static io.reactivex.subscribers.TestSubscriber.EmptySubscriber[] values() {
                io.reactivex.subscribers.TestSubscriber$EmptySubscriber[] r0 = io.reactivex.subscribers.TestSubscriber.EmptySubscriber.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.subscribers.TestSubscriber$EmptySubscriber[] r0 = (io.reactivex.subscribers.TestSubscriber.EmptySubscriber[]) r0
                return r0
        }

        public void onComplete() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r1) {
                r0 = this;
                return
        }
    }

    public TestSubscriber() {
            r3 = this;
            io.reactivex.subscribers.TestSubscriber$EmptySubscriber r0 = io.reactivex.subscribers.TestSubscriber.EmptySubscriber.INSTANCE
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r0, r1)
            return
    }

    public TestSubscriber(long r2) {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber$EmptySubscriber r0 = io.reactivex.subscribers.TestSubscriber.EmptySubscriber.INSTANCE
            r1.<init>(r0, r2)
            return
    }

    public TestSubscriber(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.<init>(r3, r0)
            return
    }

    public TestSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.subscription = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>(r2)
            r0.missedRequested = r1
            return
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create() {
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>()
            return r0
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create(long r1) {
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subscribers.TestSubscriber<T> create(org.reactivestreams.Subscriber<? super T> r1) {
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>(r1)
            return r0
    }

    static java.lang.String fusionModeToString(int r2) {
            if (r2 == 0) goto L25
            r0 = 1
            if (r2 == r0) goto L22
            r0 = 2
            if (r2 == r0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L1f:
            java.lang.String r2 = "ASYNC"
            return r2
        L22:
            java.lang.String r2 = "SYNC"
            return r2
        L25:
            java.lang.String r2 = "NONE"
            return r2
    }

    final io.reactivex.subscribers.TestSubscriber<T> assertFuseable() {
            r2 = this;
            io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.qs
            if (r0 == 0) goto L5
            return r2
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Upstream is not fuseable."
            r0.<init>(r1)
            throw r0
    }

    final io.reactivex.subscribers.TestSubscriber<T> assertFusionMode(int r5) {
            r4 = this;
            int r0 = r4.establishedFusionMode
            if (r0 == r5) goto L36
            io.reactivex.internal.fuseable.QueueSubscription<T> r1 = r4.qs
            if (r1 == 0) goto L2f
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fusion mode different. Expected: "
            r2.append(r3)
            java.lang.String r5 = fusionModeToString(r5)
            r2.append(r5)
            java.lang.String r5 = ", actual: "
            r2.append(r5)
            java.lang.String r5 = fusionModeToString(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L2f:
            java.lang.String r5 = "Upstream is not fuseable"
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L36:
            return r4
    }

    final io.reactivex.subscribers.TestSubscriber<T> assertNotFuseable() {
            r2 = this;
            io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.qs
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Upstream is fuseable."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ io.reactivex.observers.BaseTestConsumer assertNotSubscribed() {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber r0 = r1.assertNotSubscribed()
            return r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.subscribers.TestSubscriber<T> assertNotSubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L18
            java.util.List<java.lang.Throwable> r0 = r1.errors
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.String r0 = "Not subscribed but errors found"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
        L18:
            java.lang.String r0 = "Subscribed!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final io.reactivex.subscribers.TestSubscriber<T> assertOf(io.reactivex.functions.Consumer<? super io.reactivex.subscribers.TestSubscriber<T>> r1) {
            r0 = this;
            r1.accept(r0)     // Catch: java.lang.Throwable -> L4
            return r0
        L4:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)
            throw r1
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ io.reactivex.observers.BaseTestConsumer assertSubscribed() {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber r0 = r1.assertSubscribed()
            return r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.subscribers.TestSubscriber<T> assertSubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "Not subscribed!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final void cancel() {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 != 0) goto Lc
            r0 = 1
            r1.cancelled = r0
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
        Lc:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r0 = this;
            r0.cancel()
            return
    }

    public final boolean hasSubscription() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    public void onComplete() {
            r4 = this;
            boolean r0 = r4.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r4.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r4.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L33
            r4.lastThread = r0     // Catch: java.lang.Throwable -> L33
            long r0 = r4.completions     // Catch: java.lang.Throwable -> L33
            r2 = 1
            long r0 = r0 + r2
            r4.completions = r0     // Catch: java.lang.Throwable -> L33
            org.reactivestreams.Subscriber<? super T> r0 = r4.actual     // Catch: java.lang.Throwable -> L33
            r0.onComplete()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.CountDownLatch r0 = r4.done
            r0.countDown()
            return
        L33:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r4.done
            r1.countDown()
            throw r0
    }

    public void onError(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r3.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L35
            r3.lastThread = r0     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Throwable> r0 = r3.errors     // Catch: java.lang.Throwable -> L35
            r0.add(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L37
            java.util.List<java.lang.Throwable> r0 = r3.errors     // Catch: java.lang.Throwable -> L35
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "onError received a null Subscription"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            r0.add(r1)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L42
        L37:
            org.reactivestreams.Subscriber<? super T> r0 = r3.actual     // Catch: java.lang.Throwable -> L35
            r0.onError(r4)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.CountDownLatch r4 = r3.done
            r4.countDown()
            return
        L42:
            java.util.concurrent.CountDownLatch r0 = r3.done
            r0.countDown()
            throw r4
    }

    public void onNext(T r4) {
            r3 = this;
            boolean r0 = r3.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r3.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.lastThread = r0
            int r0 = r3.establishedFusionMode
            r1 = 2
            if (r0 != r1) goto L3d
        L26:
            io.reactivex.internal.fuseable.QueueSubscription<T> r4 = r3.qs     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            java.util.List<T> r0 = r3.values     // Catch: java.lang.Throwable -> L34
            r0.add(r4)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r4 = move-exception
            goto L37
        L36:
            return
        L37:
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r0.add(r4)
            return
        L3d:
            java.util.List<T> r0 = r3.values
            r0.add(r4)
            if (r4 != 0) goto L50
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "onNext received a null Subscription"
            r1.<init>(r2)
            r0.add(r1)
        L50:
            org.reactivestreams.Subscriber<? super T> r0 = r3.actual
            r0.onNext(r4)
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r6) {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r5.lastThread = r0
            if (r6 != 0) goto L15
            java.util.List<java.lang.Throwable> r6 = r5.errors
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "onSubscribe received a null Subscription"
            r0.<init>(r1)
            r6.add(r0)
            return
        L15:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.subscription
            r1 = 0
            boolean r0 = androidx.camera.view.p.a(r0, r1, r6)
            if (r0 != 0) goto L47
            r6.cancel()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.subscription
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L46
            java.util.List<java.lang.Throwable> r0 = r5.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSubscribe received multiple subscriptions: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6)
            r0.add(r1)
        L46:
            return
        L47:
            int r0 = r5.initialFusionMode
            if (r0 == 0) goto L83
            boolean r1 = r6 instanceof io.reactivex.internal.fuseable.QueueSubscription
            if (r1 == 0) goto L83
            r1 = r6
            io.reactivex.internal.fuseable.QueueSubscription r1 = (io.reactivex.internal.fuseable.QueueSubscription) r1
            r5.qs = r1
            int r0 = r1.requestFusion(r0)
            r5.establishedFusionMode = r0
            r1 = 1
            if (r0 != r1) goto L83
            r5.checkSubscriptionOnce = r1
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r5.lastThread = r6
        L65:
            io.reactivex.internal.fuseable.QueueSubscription<T> r6 = r5.qs     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L75
            java.util.List<T> r0 = r5.values     // Catch: java.lang.Throwable -> L73
            r0.add(r6)     // Catch: java.lang.Throwable -> L73
            goto L65
        L73:
            r6 = move-exception
            goto L7d
        L75:
            long r0 = r5.completions     // Catch: java.lang.Throwable -> L73
            r2 = 1
            long r0 = r0 + r2
            r5.completions = r0     // Catch: java.lang.Throwable -> L73
            return
        L7d:
            java.util.List<java.lang.Throwable> r0 = r5.errors
            r0.add(r6)
            return
        L83:
            org.reactivestreams.Subscriber<? super T> r0 = r5.actual
            r0.onSubscribe(r6)
            java.util.concurrent.atomic.AtomicLong r0 = r5.missedRequested
            r1 = 0
            long r3 = r0.getAndSet(r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L97
            r6.request(r3)
        L97:
            r5.onStart()
            return
    }

    public final void request(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
            java.util.concurrent.atomic.AtomicLong r1 = r2.missedRequested
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
            return
    }

    @io.reactivex.annotations.Experimental
    public final io.reactivex.subscribers.TestSubscriber<T> requestMore(long r1) {
            r0 = this;
            r0.request(r1)
            return r0
    }

    final io.reactivex.subscribers.TestSubscriber<T> setInitialFusionMode(int r1) {
            r0 = this;
            r0.initialFusionMode = r1
            return r0
    }
}
