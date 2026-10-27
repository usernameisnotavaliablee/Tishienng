package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableRepeat<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long count;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long remaining;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter sa;
        final org.reactivestreams.Publisher<? extends T> source;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, io.reactivex.internal.subscriptions.SubscriptionArbiter r4, org.reactivestreams.Publisher<? extends T> r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sa = r4
                r0.source = r5
                r0.remaining = r2
                return
        }

        public void onComplete() {
                r5 = this;
                long r0 = r5.remaining
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                r2 = 1
                long r2 = r0 - r2
                r5.remaining = r2
            L11:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1b
                r5.subscribeNext()
                return
            L1b:
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onComplete()
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

    public FlowableRepeat(org.reactivestreams.Publisher<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r4 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r4.<init>()
            r8.onSubscribe(r4)
            io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber
            long r1 = r7.count
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L19
            r5 = 1
            long r5 = r1 - r5
        L19:
            r2 = r5
            org.reactivestreams.Publisher<T> r5 = r7.source
            r1 = r8
            r0.<init>(r1, r2, r4, r5)
            r0.subscribeNext()
            return
    }
}
