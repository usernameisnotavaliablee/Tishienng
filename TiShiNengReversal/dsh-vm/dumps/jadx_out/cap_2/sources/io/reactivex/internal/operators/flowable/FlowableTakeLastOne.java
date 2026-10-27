package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTakeLastOne<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeLastOneSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = -5467847744262967226L;
        org.reactivestreams.Subscription s;

        TakeLastOneSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                T r0 = r1.value
                if (r0 == 0) goto L8
                r1.complete(r0)
                return
            L8:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.value = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                r0.value = r1
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableTakeLastOne(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableTakeLastOne$TakeLastOneSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTakeLastOne$TakeLastOneSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
