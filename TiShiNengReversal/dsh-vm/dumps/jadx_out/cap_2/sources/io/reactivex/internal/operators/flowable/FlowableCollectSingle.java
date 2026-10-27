package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableCollectSingle<T, U> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToFlowable<U> {
    final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
    final java.util.concurrent.Callable<? extends U> initialSupplier;
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CollectSubscriber<T, U> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super U> actual;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
        boolean done;
        org.reactivestreams.Subscription s;
        final U u;

        CollectSubscriber(io.reactivex.SingleObserver<? super U> r1, U r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.collector = r3
                r0.u = r2
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
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.s = r0
                io.reactivex.SingleObserver<? super U> r0 = r2.actual
                U r1 = r2.u
                r0.onSuccess(r1)
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
                io.reactivex.SingleObserver<? super U> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.BiConsumer<? super U, ? super T> r0 = r2.collector     // Catch: java.lang.Throwable -> Ld
                U r1 = r2.u     // Catch: java.lang.Throwable -> Ld
                r0.accept(r1, r3)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.s
                r0.cancel()
                r2.onError(r3)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                io.reactivex.SingleObserver<? super U> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableCollectSingle(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<? extends U> r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialSupplier = r2
            r0.collector = r3
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<U> fuseToFlowable() {
            r4 = this;
            io.reactivex.internal.operators.flowable.FlowableCollect r0 = new io.reactivex.internal.operators.flowable.FlowableCollect
            org.reactivestreams.Publisher<T> r1 = r4.source
            java.util.concurrent.Callable<? extends U> r2 = r4.initialSupplier
            io.reactivex.functions.BiConsumer<? super U, ? super T> r3 = r4.collector
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super U> r5) {
            r4 = this;
            java.util.concurrent.Callable<? extends U> r0 = r4.initialSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The initialSupplier returned a null value"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            org.reactivestreams.Publisher<T> r1 = r4.source
            io.reactivex.internal.operators.flowable.FlowableCollectSingle$CollectSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableCollectSingle$CollectSubscriber
            io.reactivex.functions.BiConsumer<? super U, ? super T> r3 = r4.collector
            r2.<init>(r5, r0, r3)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
