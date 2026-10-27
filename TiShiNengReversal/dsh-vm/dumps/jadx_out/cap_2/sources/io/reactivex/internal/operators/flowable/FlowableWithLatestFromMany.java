package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;
    final org.reactivestreams.Publisher<?>[] otherArray;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> otherIterable;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WithLatestFromSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 1577321883966341961L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final java.util.concurrent.atomic.AtomicLong requested;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] subscribers;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> values;

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                r1.combiner = r3
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r2 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[r4]
                r3 = 0
            La:
                if (r3 >= r4) goto L16
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber
                r0.<init>(r1, r3)
                r2[r3] = r0
                int r3 = r3 + 1
                goto La
            L16:
                r1.subscribers = r2
                java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
                r2.<init>(r4)
                r1.values = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.s = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                return
        }

        public void cancel() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        void cancelAllBut(int r4) {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r3.subscribers
                r1 = 0
            L3:
                int r2 = r0.length
                if (r1 >= r2) goto L10
                if (r1 == r4) goto Ld
                r2 = r0[r1]
                r2.dispose()
            Ld:
                int r1 = r1 + 1
                goto L3
            L10:
                return
        }

        void innerComplete(int r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto Lf
                r2 = 1
                r0.done = r2
                r0.cancelAllBut(r1)
                org.reactivestreams.Subscriber<? super R> r1 = r0.actual
                io.reactivex.internal.util.AtomicThrowable r2 = r0.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r1, r0, r2)
            Lf:
                return
        }

        void innerError(int r2, java.lang.Throwable r3) {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r1.cancelAllBut(r2)
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                io.reactivex.internal.util.HalfSerializer.onError(r2, r3, r1, r0)
                return
        }

        void innerNext(int r2, java.lang.Object r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.values
                r0.set(r2, r3)
                return
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L12
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            L12:
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r4.values
                int r1 = r0.length()
                int r2 = r1 + 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
            L12:
                if (r3 >= r1) goto L2d
                java.lang.Object r5 = r0.get(r3)
                if (r5 != 0) goto L28
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r5 = r4.s
                java.lang.Object r5 = r5.get()
                org.reactivestreams.Subscription r5 = (org.reactivestreams.Subscription) r5
                r0 = 1
                r5.request(r0)
                return
            L28:
                int r3 = r3 + 1
                r2[r3] = r5
                goto L12
            L2d:
                io.reactivex.functions.Function<? super java.lang.Object[], R> r5 = r4.combiner     // Catch: java.lang.Throwable -> L41
                java.lang.Object r5 = r5.apply(r2)     // Catch: java.lang.Throwable -> L41
                java.lang.String r0 = "combiner returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)     // Catch: java.lang.Throwable -> L41
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r4.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r5, r4, r1)
                return
            L41:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r4.cancel()
                r4.onError(r5)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }

        void subscribe(org.reactivestreams.Publisher<?>[] r6, int r7) {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r5.subscribers
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1 = r5.s
                r2 = 0
            L5:
                if (r2 >= r7) goto L22
                java.lang.Object r3 = r1.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                boolean r3 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r3)
                if (r3 != 0) goto L22
                boolean r3 = r5.done
                if (r3 == 0) goto L18
                goto L22
            L18:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L5
            L22:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WithLatestInnerSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> parent;

        WithLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        public void onComplete() {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r3.parent
                int r1 = r3.index
                boolean r2 = r3.hasValue
                r0.innerComplete(r1, r2)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r1, r3)
                return
        }

        public void onNext(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r2.hasValue
                if (r0 != 0) goto L7
                r0 = 1
                r2.hasValue = r0
            L7:
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerNext(r1, r3)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3)
                if (r0 == 0) goto Le
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            Le:
                return
        }
    }

    public FlowableWithLatestFromMany(org.reactivestreams.Publisher<T> r1, java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.otherArray = r1
            r0.otherIterable = r2
            r0.combiner = r3
            return
    }

    public FlowableWithLatestFromMany(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<?>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.otherArray = r2
            r1 = 0
            r0.otherIterable = r1
            r0.combiner = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            org.reactivestreams.Publisher<?>[] r0 = r5.otherArray
            if (r0 != 0) goto L37
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> r1 = r5.otherIterable     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
            r2 = 0
        Lf:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L28
            org.reactivestreams.Publisher r3 = (org.reactivestreams.Publisher) r3     // Catch: java.lang.Throwable -> L28
            int r4 = r0.length     // Catch: java.lang.Throwable -> L28
            if (r2 != r4) goto L2a
            int r4 = r2 >> 1
            int r4 = r4 + r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L28
            org.reactivestreams.Publisher[] r0 = (org.reactivestreams.Publisher[]) r0     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L30
        L2a:
            int r4 = r2 + 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L28
            r2 = r4
            goto Lf
        L30:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
        L37:
            int r2 = r0.length
        L38:
            if (r2 != 0) goto L4a
            io.reactivex.internal.operators.flowable.FlowableMap r0 = new io.reactivex.internal.operators.flowable.FlowableMap
            org.reactivestreams.Publisher<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$1 r2 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$1
            r2.<init>(r5)
            r0.<init>(r1, r2)
            r0.subscribeActual(r6)
            return
        L4a:
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber
            io.reactivex.functions.Function<? super java.lang.Object[], R> r3 = r5.combiner
            r1.<init>(r6, r3, r2)
            r6.onSubscribe(r1)
            r1.subscribe(r0, r2)
            org.reactivestreams.Publisher<T> r6 = r5.source
            r6.subscribe(r1)
            return
    }
}
