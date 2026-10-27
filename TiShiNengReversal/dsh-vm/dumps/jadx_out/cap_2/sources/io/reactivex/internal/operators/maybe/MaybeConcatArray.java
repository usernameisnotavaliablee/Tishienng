package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeConcatArray<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] sources;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMaybeObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> current;
        final io.reactivex.internal.disposables.SequentialDisposable disposables;
        int index;
        long produced;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.MaybeSource<? extends T>[] sources;

        ConcatMaybeObserver(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.MaybeSource<? extends T>[] r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sources = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.disposables = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.util.NotificationLite r2 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r1.<init>(r2)
                r0.current = r1
                return
        }

        public void cancel() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.disposables
                r0.dispose()
                return
        }

        void drain() {
                r9 = this;
                int r0 = r9.getAndIncrement()
                if (r0 == 0) goto L7
                goto L57
            L7:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r9.current
                org.reactivestreams.Subscriber<? super T> r1 = r9.actual
            Lb:
                io.reactivex.internal.disposables.SequentialDisposable r2 = r9.disposables
                boolean r2 = r2.isDisposed()
                r3 = 0
                if (r2 == 0) goto L18
                r0.lazySet(r3)
                return
            L18:
                java.lang.Object r2 = r0.get()
                if (r2 == 0) goto L51
                io.reactivex.internal.util.NotificationLite r4 = io.reactivex.internal.util.NotificationLite.COMPLETE
                if (r2 == r4) goto L3a
                long r4 = r9.produced
                java.util.concurrent.atomic.AtomicLong r6 = r9.requested
                long r6 = r6.get()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L51
                r6 = 1
                long r4 = r4 + r6
                r9.produced = r4
                r0.lazySet(r3)
                r1.onNext(r2)
                goto L3d
            L3a:
                r0.lazySet(r3)
            L3d:
                int r2 = r9.index
                io.reactivex.MaybeSource<? extends T>[] r3 = r9.sources
                int r4 = r3.length
                if (r2 != r4) goto L48
                r1.onComplete()
                return
            L48:
                int r4 = r2 + 1
                r9.index = r4
                r2 = r3[r2]
                r2.subscribe(r9)
            L51:
                int r2 = r9.decrementAndGet()
                if (r2 != 0) goto Lb
            L57:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.current
                io.reactivex.internal.util.NotificationLite r1 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r0.lazySet(r1)
                r2.drain()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.disposables
                r0.replace(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.current
                r0.lazySet(r2)
                r1.drain()
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public MaybeConcatArray(io.reactivex.MaybeSource<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeConcatArray$ConcatMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeConcatArray$ConcatMaybeObserver
            io.reactivex.MaybeSource<? extends T>[] r1 = r2.sources
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            r0.drain()
            return
    }
}
