package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableScan<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> accumulator;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ScanSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.BiFunction<T, T, T> accumulator;
        final org.reactivestreams.Subscriber<? super T> actual;
        org.reactivestreams.Subscription s;
        T value;

        ScanSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r4) {
                r3 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                T r1 = r3.value
                if (r1 != 0) goto Lc
                r3.value = r4
                r0.onNext(r4)
                return
            Lc:
                io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r4 = r2.apply(r1, r4)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "The value returned by the accumulator is null"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)     // Catch: java.lang.Throwable -> L1e
                r3.value = r4
                r0.onNext(r4)
                return
            L1e:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.reactivestreams.Subscription r1 = r3.s
                r1.cancel()
                r0.onError(r4)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableScan(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableScan$ScanSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableScan$ScanSubscriber
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
