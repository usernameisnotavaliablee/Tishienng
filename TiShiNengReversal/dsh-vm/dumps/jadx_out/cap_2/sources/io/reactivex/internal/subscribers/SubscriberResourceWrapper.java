package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SubscriberResourceWrapper<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable, org.reactivestreams.Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    final org.reactivestreams.Subscriber<? super T> actual;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> subscription;

    public SubscriberResourceWrapper(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.subscription = r0
            r1.actual = r2
            return
    }

    public void cancel() {
            r0 = this;
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r1 = this;
            r1.dispose()
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onComplete()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r1.dispose()
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual
            r0.onNext(r2)
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto L10
            r3.cancel()
            return
        L10:
            if (r0 == 0) goto L19
            r3.cancel()
            io.reactivex.internal.subscriptions.SubscriptionHelper.reportSubscriptionSet()
            return
        L19:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.subscription
            r1 = 0
            boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
            if (r0 == 0) goto L0
            org.reactivestreams.Subscriber<? super T> r3 = r2.actual
            r3.onSubscribe(r2)
            return
    }

    public void request(long r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
        L11:
            return
    }

    public void setResource(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
            return
    }
}
