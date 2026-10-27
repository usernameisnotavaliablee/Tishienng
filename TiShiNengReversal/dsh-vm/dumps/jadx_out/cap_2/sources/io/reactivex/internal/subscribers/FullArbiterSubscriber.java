package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FullArbiterSubscriber<T> implements org.reactivestreams.Subscriber<T> {
    final io.reactivex.internal.subscriptions.FullArbiter<T> arbiter;
    org.reactivestreams.Subscription s;

    public FullArbiterSubscriber(io.reactivex.internal.subscriptions.FullArbiter<T> r1) {
            r0 = this;
            r0.<init>()
            r0.arbiter = r1
            return
    }

    public void onComplete() {
            r2 = this;
            io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
            org.reactivestreams.Subscription r1 = r2.s
            r0.onComplete(r1)
            return
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
            io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
            org.reactivestreams.Subscription r1 = r2.s
            r0.onError(r3, r1)
            return
    }

    public void onNext(T r3) {
            r2 = this;
            io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
            org.reactivestreams.Subscription r1 = r2.s
            r0.onNext(r3, r1)
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.s = r2
            io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r1.arbiter
            r0.setSubscription(r2)
        Lf:
            return
    }
}
