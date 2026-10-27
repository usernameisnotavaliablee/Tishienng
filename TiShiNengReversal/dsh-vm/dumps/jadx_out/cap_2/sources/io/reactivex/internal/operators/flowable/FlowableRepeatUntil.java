package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableRepeatUntil<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BooleanSupplier until;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter sa;
        final org.reactivestreams.Publisher<? extends T> source;
        final io.reactivex.functions.BooleanSupplier stop;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BooleanSupplier r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r3, org.reactivestreams.Publisher<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sa = r3
                r0.source = r4
                r0.stop = r2
                return
        }

        public void onComplete() {
                r2 = this;
                io.reactivex.functions.BooleanSupplier r0 = r2.stop     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto Le
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                return
            Le:
                r2.subscribeNext()
                return
            L12:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super T> r1 = r2.actual
                r1.onError(r0)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
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
                if (r0 != 0) goto L13
                r0 = 1
            L7:
                org.reactivestreams.Publisher<? extends T> r1 = r2.source
                r1.subscribe(r2)
                int r0 = -r0
                int r0 = r2.addAndGet(r0)
                if (r0 != 0) goto L7
            L13:
                return
        }
    }

    public FlowableRepeatUntil(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.BooleanSupplier r2) {
            r0 = this;
            r0.<init>(r1)
            r0.until = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber
            io.reactivex.functions.BooleanSupplier r2 = r4.until
            org.reactivestreams.Publisher<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
