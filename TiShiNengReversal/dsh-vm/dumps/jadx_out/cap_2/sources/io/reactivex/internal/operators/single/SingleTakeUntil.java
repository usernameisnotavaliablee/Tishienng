package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleTakeUntil<T, U> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<U> other;
    final io.reactivex.SingleSource<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeUntilMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber other;

        TakeUntilMainObserver(io.reactivex.SingleObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r1 = new io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber
                r1.<init>(r0)
                r0.other = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r0 = r2.other
                r0.dispose()
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1d
                java.lang.Object r0 = r2.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L1d
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r0 = r2.other
                r0.dispose()
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1c
                java.lang.Object r0 = r2.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L1c
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L1c:
                return
        }

        void otherError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1d
                java.lang.Object r0 = r2.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L1d
                if (r0 == 0) goto L17
                r0.dispose()
            L17:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeUntilOtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<java.lang.Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> parent;

        TakeUntilOtherSubscriber(io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver<?> r0 = r2.parent
                java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
                r1.<init>()
                r0.otherError(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver<?> r0 = r1.parent
                r0.otherError(r2)
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                if (r1 == 0) goto L9
                r0.onComplete()
            L9:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3)
                if (r0 == 0) goto Le
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            Le:
                return
        }
    }

    public SingleTakeUntil(io.reactivex.SingleSource<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver r0 = new io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r3 = r2.other
            io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.SingleSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
