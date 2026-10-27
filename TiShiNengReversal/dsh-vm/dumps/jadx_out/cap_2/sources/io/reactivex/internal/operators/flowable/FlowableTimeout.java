package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> itemTimeoutIndicator;
    final org.reactivestreams.Publisher<? extends T> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnTimeout {
        void onError(java.lang.Throwable r1);

        void timeout(long r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutInnerSubscriber<T, U, V> extends io.reactivex.subscribers.DisposableSubscriber<java.lang.Object> {
        boolean done;
        final long index;
        final io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout parent;

        TimeoutInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        public void onComplete() {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.done = r0
                io.reactivex.internal.operators.flowable.FlowableTimeout$OnTimeout r0 = r3.parent
                long r1 = r3.index
                r0.timeout(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableTimeout$OnTimeout r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(java.lang.Object r3) {
                r2 = this;
                boolean r3 = r2.done
                if (r3 == 0) goto L5
                return
            L5:
                r3 = 1
                r2.done = r3
                r2.cancel()
                io.reactivex.internal.operators.flowable.FlowableTimeout$OnTimeout r3 = r2.parent
                long r0 = r2.index
                r3.timeout(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutOtherSubscriber<T, U, V> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.subscriptions.FullArbiter<T> arbiter;
        volatile boolean cancelled;
        boolean done;
        final org.reactivestreams.Publisher<U> firstTimeoutIndicator;
        volatile long index;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> itemTimeoutIndicator;
        final org.reactivestreams.Publisher<? extends T> other;
        org.reactivestreams.Subscription s;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timeout;

        TimeoutOtherSubscriber(org.reactivestreams.Subscriber<? super T> r2, org.reactivestreams.Publisher<U> r3, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r4, org.reactivestreams.Publisher<? extends T> r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timeout = r0
                r1.actual = r2
                r1.firstTimeoutIndicator = r3
                r1.itemTimeoutIndicator = r4
                r1.other = r5
                io.reactivex.internal.subscriptions.FullArbiter r3 = new io.reactivex.internal.subscriptions.FullArbiter
                r4 = 8
                r3.<init>(r2, r1, r4)
                r1.arbiter = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timeout
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                r2.dispose()
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                org.reactivestreams.Subscription r1 = r2.s
                r0.onComplete(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                r2.dispose()
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                org.reactivestreams.Subscription r1 = r2.s
                r0.onError(r3, r1)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                goto L42
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.internal.subscriptions.FullArbiter<T> r2 = r4.arbiter
                org.reactivestreams.Subscription r3 = r4.s
                boolean r2 = r2.onNext(r5, r3)
                if (r2 != 0) goto L17
                goto L42
            L17:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r4.timeout
                java.lang.Object r2 = r2.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L24
                r2.dispose()
            L24:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3 = r4.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L43
                java.lang.Object r5 = r3.apply(r5)     // Catch: java.lang.Throwable -> L43
                java.lang.String r3 = "The publisher returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r3)     // Catch: java.lang.Throwable -> L43
                org.reactivestreams.Publisher r5 = (org.reactivestreams.Publisher) r5     // Catch: java.lang.Throwable -> L43
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber r3 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber
                r3.<init>(r4, r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timeout
                boolean r0 = androidx.camera.view.p.a(r0, r2, r3)
                if (r0 == 0) goto L42
                r5.subscribe(r3)
            L42:
                return
            L43:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r5) {
                r4 = this;
                org.reactivestreams.Subscription r0 = r4.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r5)
                if (r0 != 0) goto L9
                goto L32
            L9:
                r4.s = r5
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r4.arbiter
                boolean r5 = r0.setSubscription(r5)
                if (r5 != 0) goto L14
                goto L32
            L14:
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                org.reactivestreams.Publisher<U> r0 = r4.firstTimeoutIndicator
                if (r0 == 0) goto L33
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber
                r2 = 0
                r1.<init>(r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r4.timeout
                r3 = 0
                boolean r2 = androidx.camera.view.p.a(r2, r3, r1)
                if (r2 == 0) goto L32
                io.reactivex.internal.subscriptions.FullArbiter<T> r2 = r4.arbiter
                r5.onSubscribe(r2)
                r0.subscribe(r1)
            L32:
                return
            L33:
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r4.arbiter
                r5.onSubscribe(r0)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout
        public void timeout(long r4) {
                r3 = this;
                long r0 = r3.index
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L15
                r3.dispose()
                org.reactivestreams.Publisher<? extends T> r4 = r3.other
                io.reactivex.internal.subscribers.FullArbiterSubscriber r5 = new io.reactivex.internal.subscribers.FullArbiterSubscriber
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r3.arbiter
                r5.<init>(r0)
                r4.subscribe(r5)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutSubscriber<T, U, V> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout {
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final org.reactivestreams.Publisher<U> firstTimeoutIndicator;
        volatile long index;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> itemTimeoutIndicator;
        org.reactivestreams.Subscription s;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timeout;

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> r2, org.reactivestreams.Publisher<U> r3, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timeout = r0
                r1.actual = r2
                r1.firstTimeoutIndicator = r3
                r1.itemTimeoutIndicator = r4
                return
        }

        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timeout
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        public void onComplete() {
                r1 = this;
                r1.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                org.reactivestreams.Subscriber<? super T> r2 = r4.actual
                r2.onNext(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r4.timeout
                java.lang.Object r2 = r2.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L19
                r2.dispose()
            L19:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3 = r4.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L38
                java.lang.Object r5 = r3.apply(r5)     // Catch: java.lang.Throwable -> L38
                java.lang.String r3 = "The publisher returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r3)     // Catch: java.lang.Throwable -> L38
                org.reactivestreams.Publisher r5 = (org.reactivestreams.Publisher) r5     // Catch: java.lang.Throwable -> L38
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber r3 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber
                r3.<init>(r4, r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timeout
                boolean r0 = androidx.camera.view.p.a(r0, r2, r3)
                if (r0 == 0) goto L37
                r5.subscribe(r3)
            L37:
                return
            L38:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r4.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r5) {
                r4 = this;
                org.reactivestreams.Subscription r0 = r4.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r5)
                if (r0 != 0) goto L9
                goto L2c
            L9:
                r4.s = r5
                boolean r5 = r4.cancelled
                if (r5 == 0) goto L10
                goto L2c
            L10:
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                org.reactivestreams.Publisher<U> r0 = r4.firstTimeoutIndicator
                if (r0 == 0) goto L2d
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutInnerSubscriber
                r2 = 0
                r1.<init>(r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r4.timeout
                r3 = 0
                boolean r2 = androidx.camera.view.p.a(r2, r3, r1)
                if (r2 == 0) goto L2c
                r5.onSubscribe(r4)
                r0.subscribe(r1)
            L2c:
                return
            L2d:
                r5.onSubscribe(r4)
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.OnTimeout
        public void timeout(long r4) {
                r3 = this;
                long r0 = r3.index
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L13
                r3.cancel()
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
                r5.<init>()
                r4.onError(r5)
            L13:
                return
        }
    }

    public FlowableTimeout(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3, org.reactivestreams.Publisher<? extends T> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.firstTimeoutIndicator = r2
            r0.itemTimeoutIndicator = r3
            r0.other = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r5.other
            if (r0 != 0) goto L18
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r6)
            org.reactivestreams.Publisher<U> r6 = r5.firstTimeoutIndicator
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3 = r5.itemTimeoutIndicator
            r1.<init>(r2, r6, r3)
            r0.subscribe(r1)
            return
        L18:
            org.reactivestreams.Publisher<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutOtherSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutOtherSubscriber
            org.reactivestreams.Publisher<U> r3 = r5.firstTimeoutIndicator
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r4 = r5.itemTimeoutIndicator
            r2.<init>(r6, r3, r4, r0)
            r1.subscribe(r2)
            return
    }
}
