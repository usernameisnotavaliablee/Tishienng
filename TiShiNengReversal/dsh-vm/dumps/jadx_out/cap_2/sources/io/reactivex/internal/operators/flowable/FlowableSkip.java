package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSkip<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SkipSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        long remaining;
        org.reactivestreams.Subscription s;

        SkipSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                long r0 = r5.remaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Le
                r2 = 1
                long r0 = r0 - r2
                r5.remaining = r0
                return
            Le:
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onNext(r6)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L14
                long r0 = r3.remaining
                r3.s = r4
                org.reactivestreams.Subscriber<? super T> r2 = r3.actual
                r2.onSubscribe(r3)
                r4.request(r0)
            L14:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableSkip(org.reactivestreams.Publisher<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.n = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableSkip$SkipSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkip$SkipSubscriber
            long r2 = r4.n
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
