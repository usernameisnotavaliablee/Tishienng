package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DelayMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final io.reactivex.MaybeObserver<? super T> actual;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OtherSubscriber<T> implements org.reactivestreams.Subscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<T> main;
        org.reactivestreams.Subscription s;
        io.reactivex.MaybeSource<T> source;

        OtherSubscriber(io.reactivex.MaybeObserver<? super T> r2, io.reactivex.MaybeSource<T> r3) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver
                r0.<init>(r2)
                r1.main = r0
                r1.source = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver<T> r0 = r1.main
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver<T> r0 = r1.main
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        public void onComplete() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto Lb
                r2.s = r1
                r2.subscribeNext()
            Lb:
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L10
                r2.s = r1
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver<T> r0 = r2.main
                io.reactivex.MaybeObserver<? super T> r0 = r0.actual
                r0.onError(r3)
                return
            L10:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        public void onNext(java.lang.Object r2) {
                r1 = this;
                org.reactivestreams.Subscription r2 = r1.s
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r2 == r0) goto Le
                r2.cancel()
                r1.s = r0
                r1.subscribeNext()
            Le:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L19
                r2.s = r3
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver<T> r0 = r2.main
                io.reactivex.MaybeObserver<? super T> r0 = r0.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L19:
                return
        }

        void subscribeNext() {
                r2 = this;
                io.reactivex.MaybeSource<T> r0 = r2.source
                r1 = 0
                r2.source = r1
                io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$DelayMaybeObserver<T> r1 = r2.main
                r0.subscribe(r1)
                return
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(io.reactivex.MaybeSource<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<U> r0 = r3.other
            io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$OtherSubscriber r1 = new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$OtherSubscriber
            io.reactivex.MaybeSource<T> r2 = r3.source
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
