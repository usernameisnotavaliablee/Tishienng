package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableZipIterable<T, U, V> extends io.reactivex.Flowable<V> {
    final java.lang.Iterable<U> other;
    final org.reactivestreams.Publisher<? extends T> source;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipIterableSubscriber<T, U, V> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super V> actual;
        boolean done;
        final java.util.Iterator<U> iterator;
        org.reactivestreams.Subscription s;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

        ZipIterableSubscriber(org.reactivestreams.Subscriber<? super V> r1, java.util.Iterator<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.iterator = r2
                r0.zipper = r3
                return
        }

        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        void error(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onComplete()
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
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                goto L37
            L5:
                java.util.Iterator<U> r0 = r2.iterator     // Catch: java.lang.Throwable -> L42
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L42
                java.lang.String r1 = "The iterator returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L42
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r1 = r2.zipper     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r3 = r1.apply(r3, r0)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r0 = "The zipper function returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L3d
                org.reactivestreams.Subscriber<? super V> r0 = r2.actual
                r0.onNext(r3)
                java.util.Iterator<U> r3 = r2.iterator     // Catch: java.lang.Throwable -> L38
                boolean r3 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
                if (r3 != 0) goto L37
                r3 = 1
                r2.done = r3
                org.reactivestreams.Subscription r3 = r2.s
                r3.cancel()
                org.reactivestreams.Subscriber<? super V> r3 = r2.actual
                r3.onComplete()
            L37:
                return
            L38:
                r3 = move-exception
                r2.error(r3)
                return
            L3d:
                r3 = move-exception
                r2.error(r3)
                return
            L42:
                r3 = move-exception
                r2.error(r3)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super V> r2 = r1.actual
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

    public FlowableZipIterable(org.reactivestreams.Publisher<? extends T> r1, java.lang.Iterable<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            r0.zipper = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super V> r5) {
            r4 = this;
            java.lang.Iterable<U> r0 = r4.other     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "The iterator returned by other is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L18
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r5)
            return
        L18:
            org.reactivestreams.Publisher<? extends T> r1 = r4.source
            io.reactivex.internal.operators.flowable.FlowableZipIterable$ZipIterableSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableZipIterable$ZipIterableSubscriber
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3 = r4.zipper
            r2.<init>(r5, r0, r3)
            r1.subscribe(r2)
            return
        L25:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
        L2d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
    }
}
