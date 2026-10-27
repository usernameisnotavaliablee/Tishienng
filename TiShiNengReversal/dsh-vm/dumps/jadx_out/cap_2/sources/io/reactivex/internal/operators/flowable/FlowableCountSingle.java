package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Long> {
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CountSubscriber implements org.reactivestreams.Subscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Long> actual;
        long count;
        org.reactivestreams.Subscription s;

        CountSubscriber(io.reactivex.SingleObserver<? super java.lang.Long> r1) {
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
                r3 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r3.s = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r3.actual
                long r1 = r3.count
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(java.lang.Object r5) {
                r4 = this;
                long r0 = r4.count
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableCountSingle(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<java.lang.Long> fuseToFlowable() {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableCount r0 = new io.reactivex.internal.operators.flowable.FlowableCount
            org.reactivestreams.Publisher<T> r1 = r2.source
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableCountSingle$CountSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableCountSingle$CountSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
