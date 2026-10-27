package io.reactivex.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DisposableSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;

    public DisposableSubscriber() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            return
    }

    protected final void cancel() {
            r0 = this;
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onStart() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.request(r1)
            return
    }

    public final void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
            if (r2 == 0) goto Lb
            r1.onStart()
        Lb:
            return
    }

    protected final void request(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
            return
    }
}
