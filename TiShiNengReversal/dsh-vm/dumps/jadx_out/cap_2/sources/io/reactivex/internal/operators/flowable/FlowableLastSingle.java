package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableLastSingle<T> extends io.reactivex.Single<T> {
    final T defaultItem;
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LastSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;
        final T defaultItem;
        T item;
        org.reactivestreams.Subscription s;

        LastSubscriber(io.reactivex.SingleObserver<? super T> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.defaultItem = r2
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
                T r0 = r2.item
                if (r0 == 0) goto L11
                r1 = 0
                r2.item = r1
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                return
            L11:
                T r0 = r2.defaultItem
                if (r0 == 0) goto L1b
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                return
            L1b:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                r0 = 0
                r1.item = r0
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                r0.item = r1
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

    public FlowableLastSingle(org.reactivestreams.Publisher<T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.defaultItem = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableLastSingle$LastSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableLastSingle$LastSubscriber
            T r2 = r3.defaultItem
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
