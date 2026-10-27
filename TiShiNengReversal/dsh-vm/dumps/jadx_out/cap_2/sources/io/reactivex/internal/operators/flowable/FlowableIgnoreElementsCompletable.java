package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableIgnoreElementsCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class IgnoreElementsSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver actual;
        org.reactivestreams.Subscription s;

        IgnoreElementsSubscriber(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableIgnoreElementsCompletable(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<T> fuseToFlowable() {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableIgnoreElements r0 = new io.reactivex.internal.operators.flowable.FlowableIgnoreElements
            org.reactivestreams.Publisher<T> r1 = r2.source
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable$IgnoreElementsSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable$IgnoreElementsSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
