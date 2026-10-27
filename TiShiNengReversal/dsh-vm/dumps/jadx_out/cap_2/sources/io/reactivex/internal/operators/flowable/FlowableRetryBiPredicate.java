package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableRetryBiPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RetryBiSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;
        int retries;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RetryBiSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r3, org.reactivestreams.Publisher<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sa = r3
                r0.source = r4
                r0.predicate = r2
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r7) {
                r6 = this;
                r0 = 1
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r1 = r6.predicate     // Catch: java.lang.Throwable -> L1c
                int r2 = r6.retries     // Catch: java.lang.Throwable -> L1c
                int r2 = r2 + r0
                r6.retries = r2     // Catch: java.lang.Throwable -> L1c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r1.test(r2, r7)     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto L18
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onError(r7)
                return
            L18:
                r6.subscribeNext()
                return
            L1c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscriber<? super T> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
                io.reactivex.internal.subscriptions.SubscriptionArbiter r3 = r2.sa
                r0 = 1
                r3.produced(r0)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.sa
                r0.setSubscription(r2)
                return
        }

        void subscribeNext() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L1c
                r0 = 1
            L7:
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r2.sa
                boolean r1 = r1.isCancelled()
                if (r1 == 0) goto L10
                goto L1c
            L10:
                org.reactivestreams.Publisher<? extends T> r1 = r2.source
                r1.subscribe(r2)
                int r0 = -r0
                int r0 = r2.addAndGet(r0)
                if (r0 != 0) goto L7
            L1c:
                return
        }
    }

    public FlowableRetryBiPredicate(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber
            io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2 = r4.predicate
            org.reactivestreams.Publisher<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
