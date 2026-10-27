package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableToList<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> collectionSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ToListSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<U> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8134157938864266736L;
        org.reactivestreams.Subscription s;

        ToListSubscriber(org.reactivestreams.Subscriber<? super U> r1, U r2) {
                r0 = this;
                r0.<init>(r1)
                r0.value = r2
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                T r0 = r1.value
                r1.complete(r0)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.value = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                T r0 = r1.value
                java.util.Collection r0 = (java.util.Collection) r0
                r0.add(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableToList(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.collectionSupplier = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r4) {
            r3 = this;
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r3.collectionSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L19
            org.reactivestreams.Publisher<T> r1 = r3.source
            io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber
            r2.<init>(r4, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
            return
    }
}
