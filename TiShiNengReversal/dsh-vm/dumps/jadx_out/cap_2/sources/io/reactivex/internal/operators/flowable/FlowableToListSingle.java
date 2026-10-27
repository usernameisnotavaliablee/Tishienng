package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableToListSingle<T, U extends java.util.Collection<? super T>> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToFlowable<U> {
    final java.util.concurrent.Callable<U> collectionSupplier;
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ToListSubscriber<T, U extends java.util.Collection<? super T>> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super U> actual;
        org.reactivestreams.Subscription s;
        U value;

        ToListSubscriber(io.reactivex.SingleObserver<? super U> r1, U r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.value = r2
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
                io.reactivex.SingleObserver<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                U extends java.util.Collection<? super T> r1 = r2.value
                r0.onSuccess(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.value = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.s = r0
                io.reactivex.SingleObserver<? super U extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                U extends java.util.Collection<? super T> r0 = r1.value
                r0.add(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                io.reactivex.SingleObserver<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableToListSingle(org.reactivestreams.Publisher<T> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r1.<init>(r2, r0)
            return
    }

    public FlowableToListSingle(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.collectionSupplier = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<U> fuseToFlowable() {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowableToList r0 = new io.reactivex.internal.operators.flowable.FlowableToList
            org.reactivestreams.Publisher<T> r1 = r3.source
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r2 = r3.collectionSupplier
            r0.<init>(r1, r2)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super U> r4) {
            r3 = this;
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r3.collectionSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L19
            org.reactivestreams.Publisher<T> r1 = r3.source
            io.reactivex.internal.operators.flowable.FlowableToListSingle$ToListSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableToListSingle$ToListSubscriber
            r2.<init>(r4, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
            return
    }
}
