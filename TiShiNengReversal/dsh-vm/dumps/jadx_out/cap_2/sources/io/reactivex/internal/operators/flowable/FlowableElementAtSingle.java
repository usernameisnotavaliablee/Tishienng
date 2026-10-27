package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableElementAtSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final T defaultValue;
    final long index;
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ElementAtSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;
        long count;
        final T defaultValue;
        boolean done;
        final long index;
        org.reactivestreams.Subscription s;

        ElementAtSubscriber(io.reactivex.SingleObserver<? super T> r1, long r2, T r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.defaultValue = r4
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
                r2 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.s = r0
                boolean r0 = r2.done
                if (r0 != 0) goto L1f
                r0 = 1
                r2.done = r0
                T r0 = r2.defaultValue
                if (r0 == 0) goto L15
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                return
            L15:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
            L1f:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r5.count
                long r2 = r5.index
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1f
                r0 = 1
                r5.done = r0
                org.reactivestreams.Subscription r0 = r5.s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r5.s = r0
                io.reactivex.SingleObserver<? super T> r0 = r5.actual
                r0.onSuccess(r6)
                return
            L1f:
                r2 = 1
                long r0 = r0 + r2
                r5.count = r0
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableElementAtSingle(org.reactivestreams.Publisher<T> r1, long r2, T r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.index = r2
            r0.defaultValue = r4
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<T> fuseToFlowable() {
            r5 = this;
            io.reactivex.internal.operators.flowable.FlowableElementAt r0 = new io.reactivex.internal.operators.flowable.FlowableElementAt
            org.reactivestreams.Publisher<T> r1 = r5.source
            long r2 = r5.index
            T r4 = r5.defaultValue
            r0.<init>(r1, r2, r4)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableElementAtSingle$ElementAtSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableElementAtSingle$ElementAtSubscriber
            long r2 = r5.index
            T r4 = r5.defaultValue
            r1.<init>(r6, r2, r4)
            r0.subscribe(r1)
            return
    }
}
