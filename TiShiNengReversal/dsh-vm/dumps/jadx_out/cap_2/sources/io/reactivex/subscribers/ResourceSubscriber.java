package io.reactivex.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ResourceSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicLong missedRequested;
    private final io.reactivex.internal.disposables.ListCompositeDisposable resources;
    private final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;

    public ResourceSubscriber() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = new io.reactivex.internal.disposables.ListCompositeDisposable
            r0.<init>()
            r1.resources = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.missedRequested = r0
            return
    }

    public final void add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "resource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.add(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            if (r0 == 0) goto Ld
            io.reactivex.internal.disposables.ListCompositeDisposable r0 = r1.resources
            r0.dispose()
        Ld:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
            return r0
    }

    protected void onStart() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.request(r0)
            return
    }

    public final void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            java.util.concurrent.atomic.AtomicLong r1 = r2.missedRequested
            boolean r3 = io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
            if (r3 == 0) goto Ld
            r2.onStart()
        Ld:
            return
    }

    protected final void request(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            java.util.concurrent.atomic.AtomicLong r1 = r2.missedRequested
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
            return
    }
}
