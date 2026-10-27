package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableScanSeed<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
    final java.util.concurrent.Callable<R> seedSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ScanSeedSubscriber<T, R> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, R> {
        private static final long serialVersionUID = -1776795561228106469L;
        final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;

        ScanSeedSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.BiFunction<R, ? super T, R> r2, R r3) {
                r0 = this;
                r0.<init>(r1)
                r0.accumulator = r2
                r0.value = r3
                return
        }

        public void onComplete() {
                r1 = this;
                R r0 = r1.value
                r1.complete(r0)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.value = r0
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                R r0 = r5.value
                io.reactivex.functions.BiFunction<R, ? super T, R> r1 = r5.accumulator     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r6 = r1.apply(r0, r6)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = "The accumulator returned a null value"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r1)     // Catch: java.lang.Throwable -> L1d
                r5.value = r6
                long r1 = r5.produced
                r3 = 1
                long r1 = r1 + r3
                r5.produced = r1
                org.reactivestreams.Subscriber<? super R> r6 = r5.actual
                r6.onNext(r0)
                return
            L1d:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                org.reactivestreams.Subscription r0 = r5.s
                r0.cancel()
                r5.onError(r6)
                return
        }
    }

    public FlowableScanSeed(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r3
            r0.seedSupplier = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            java.util.concurrent.Callable<R> r0 = r4.seedSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The seed supplied is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            org.reactivestreams.Publisher<T> r1 = r4.source
            io.reactivex.internal.operators.flowable.FlowableScanSeed$ScanSeedSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableScanSeed$ScanSeedSubscriber
            io.reactivex.functions.BiFunction<R, ? super T, R> r3 = r4.accumulator
            r2.<init>(r5, r3, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
    }
}
