package io.reactivex.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DefaultSubscriber<T> implements org.reactivestreams.Subscriber<T> {
    private org.reactivestreams.Subscription s;

    public DefaultSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void cancel() {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.s
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r2.s = r1
            r0.cancel()
            return
    }

    protected void onStart() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.request(r0)
            return
    }

    public final void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
            if (r0 == 0) goto Ld
            r1.s = r2
            r1.onStart()
        Ld:
            return
    }

    protected final void request(long r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.s
            if (r0 == 0) goto L7
            r0.request(r2)
        L7:
            return
    }
}
