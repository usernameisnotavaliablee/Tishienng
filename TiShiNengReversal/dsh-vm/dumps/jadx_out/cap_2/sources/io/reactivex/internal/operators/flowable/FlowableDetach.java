package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableDetach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DetachSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscriber<? super T> actual;
        org.reactivestreams.Subscription s;

        DetachSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        public void cancel() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.s = r1
                org.reactivestreams.Subscriber r1 = io.reactivex.internal.util.EmptyComponent.asSubscriber()
                r2.actual = r1
                r0.cancel()
                return
        }

        public void onComplete() {
                r2 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.s = r1
                org.reactivestreams.Subscriber r1 = io.reactivex.internal.util.EmptyComponent.asSubscriber()
                r2.actual = r1
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
                r2.s = r1
                org.reactivestreams.Subscriber r1 = io.reactivex.internal.util.EmptyComponent.asSubscriber()
                r2.actual = r1
                r0.onError(r3)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableDetach(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableDetach$DetachSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDetach$DetachSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
