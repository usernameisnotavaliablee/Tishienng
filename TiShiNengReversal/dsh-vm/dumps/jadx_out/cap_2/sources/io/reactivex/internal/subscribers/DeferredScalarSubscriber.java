package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DeferredScalarSubscriber<T, R> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<R> implements org.reactivestreams.Subscriber<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected org.reactivestreams.Subscription s;

    public DeferredScalarSubscriber(org.reactivestreams.Subscriber<? super R> r1) {
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
            boolean r0 = r1.hasValue
            if (r0 == 0) goto La
            T r0 = r1.value
            r1.complete(r0)
            return
        La:
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
