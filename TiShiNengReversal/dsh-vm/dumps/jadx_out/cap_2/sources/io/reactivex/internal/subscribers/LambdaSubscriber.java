package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class LambdaSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;

    public LambdaSubscriber(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r4) {
            r0 = this;
            r0.<init>()
            r0.onNext = r1
            r0.onError = r2
            r0.onComplete = r3
            r0.onSubscribe = r4
            return
    }

    public void cancel() {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            r0.cancel()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L18
            r2.lazySet(r1)
            io.reactivex.functions.Action r0 = r2.onComplete     // Catch: java.lang.Throwable -> L11
            r0.run()     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L18:
            return
    }

    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Object r0 = r4.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L27
            r4.lazySet(r1)
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> L11
            r0.accept(r5)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            return
        L27:
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L1c
            io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> Lc
            r0.accept(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            java.lang.Object r0 = r1.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.cancel()
            r1.onError(r2)
        L1c:
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r1, r2)
            if (r0 == 0) goto L16
            io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r0 = r1.onSubscribe     // Catch: java.lang.Throwable -> Lc
            r0.accept(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r2.cancel()
            r1.onError(r0)
        L16:
            return
    }

    public void request(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
            return
    }
}
