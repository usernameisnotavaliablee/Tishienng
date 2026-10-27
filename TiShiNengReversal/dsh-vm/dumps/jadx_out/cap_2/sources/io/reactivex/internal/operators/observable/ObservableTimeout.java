package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> itemTimeoutIndicator;
    final io.reactivex.ObservableSource<? extends T> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnTimeout {
        void innerError(java.lang.Throwable r1);

        void timeout(long r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutInnerObserver<T, U, V> extends io.reactivex.observers.DisposableObserver<java.lang.Object> {
        boolean done;
        final long index;
        final io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout parent;

        TimeoutInnerObserver(io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.done = r0
                io.reactivex.internal.operators.observable.ObservableTimeout$OnTimeout r0 = r3.parent
                long r1 = r3.index
                r0.timeout(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableTimeout$OnTimeout r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r3) {
                r2 = this;
                boolean r3 = r2.done
                if (r3 == 0) goto L5
                return
            L5:
                r3 = 1
                r2.done = r3
                r2.dispose()
                io.reactivex.internal.operators.observable.ObservableTimeout$OnTimeout r3 = r2.parent
                long r0 = r2.index
                r3.timeout(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutObserver<T, U, V> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout {
        private static final long serialVersionUID = 2672739326310051084L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.ObservableSource<U> firstTimeoutIndicator;
        volatile long index;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> itemTimeoutIndicator;
        io.reactivex.disposables.Disposable s;

        TimeoutObserver(io.reactivex.Observer<? super T> r1, io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.firstTimeoutIndicator = r2
                r0.itemTimeoutIndicator = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r0 == 0) goto Lb
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
            Lb:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.Observer<? super T> r2 = r4.actual
                r2.onNext(r5)
                java.lang.Object r2 = r4.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L17
                r2.dispose()
            L17:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3 = r4.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r3.apply(r5)     // Catch: java.lang.Throwable -> L34
                java.lang.String r3 = "The ObservableSource returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r3)     // Catch: java.lang.Throwable -> L34
                io.reactivex.ObservableSource r5 = (io.reactivex.ObservableSource) r5     // Catch: java.lang.Throwable -> L34
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver r3 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver
                r3.<init>(r4, r0)
                boolean r0 = r4.compareAndSet(r2, r3)
                if (r0 == 0) goto L33
                r5.subscribe(r3)
            L33:
                return
            L34:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r4.dispose()
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r5) {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r5)
                if (r0 == 0) goto L28
                r4.s = r5
                io.reactivex.Observer<? super T> r5 = r4.actual
                io.reactivex.ObservableSource<U> r0 = r4.firstTimeoutIndicator
                if (r0 == 0) goto L25
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver
                r2 = 0
                r1.<init>(r4, r2)
                r2 = 0
                boolean r2 = r4.compareAndSet(r2, r1)
                if (r2 == 0) goto L28
                r5.onSubscribe(r4)
                r0.subscribe(r1)
                return
            L25:
                r5.onSubscribe(r4)
            L28:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout
        public void timeout(long r4) {
                r3 = this;
                long r0 = r3.index
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L13
                r3.dispose()
                io.reactivex.Observer<? super T> r4 = r3.actual
                java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
                r5.<init>()
                r4.onError(r5)
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutOtherObserver<T, U, V> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout {
        private static final long serialVersionUID = -1957813281749686898L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.ObserverFullArbiter<T> arbiter;
        boolean done;
        final io.reactivex.ObservableSource<U> firstTimeoutIndicator;
        volatile long index;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> itemTimeoutIndicator;
        final io.reactivex.ObservableSource<? extends T> other;
        io.reactivex.disposables.Disposable s;

        TimeoutOtherObserver(io.reactivex.Observer<? super T> r1, io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3, io.reactivex.ObservableSource<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.firstTimeoutIndicator = r2
                r0.itemTimeoutIndicator = r3
                r0.other = r4
                io.reactivex.internal.disposables.ObserverFullArbiter r2 = new io.reactivex.internal.disposables.ObserverFullArbiter
                r3 = 8
                r2.<init>(r1, r0, r3)
                r0.arbiter = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r0 == 0) goto Lb
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
            Lb:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                r2.dispose()
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                io.reactivex.disposables.Disposable r1 = r2.s
                r0.onComplete(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                r2.dispose()
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                io.reactivex.disposables.Disposable r1 = r2.s
                r0.onError(r3, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                goto L3e
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r2 = r4.arbiter
                io.reactivex.disposables.Disposable r3 = r4.s
                boolean r2 = r2.onNext(r5, r3)
                if (r2 != 0) goto L17
                goto L3e
            L17:
                java.lang.Object r2 = r4.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L22
                r2.dispose()
            L22:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3 = r4.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r5 = r3.apply(r5)     // Catch: java.lang.Throwable -> L3f
                java.lang.String r3 = "The ObservableSource returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r3)     // Catch: java.lang.Throwable -> L3f
                io.reactivex.ObservableSource r5 = (io.reactivex.ObservableSource) r5     // Catch: java.lang.Throwable -> L3f
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver r3 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver
                r3.<init>(r4, r0)
                boolean r0 = r4.compareAndSet(r2, r3)
                if (r0 == 0) goto L3e
                r5.subscribe(r3)
            L3e:
                return
            L3f:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r5) {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r5)
                if (r0 == 0) goto L31
                r4.s = r5
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r4.arbiter
                r0.setDisposable(r5)
                io.reactivex.Observer<? super T> r5 = r4.actual
                io.reactivex.ObservableSource<U> r0 = r4.firstTimeoutIndicator
                if (r0 == 0) goto L2c
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutInnerObserver
                r2 = 0
                r1.<init>(r4, r2)
                r2 = 0
                boolean r2 = r4.compareAndSet(r2, r1)
                if (r2 == 0) goto L31
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r2 = r4.arbiter
                r5.onSubscribe(r2)
                r0.subscribe(r1)
                return
            L2c:
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r4.arbiter
                r5.onSubscribe(r0)
            L31:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.OnTimeout
        public void timeout(long r4) {
                r3 = this;
                long r0 = r3.index
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L15
                r3.dispose()
                io.reactivex.ObservableSource<? extends T> r4 = r3.other
                io.reactivex.internal.observers.FullArbiterObserver r5 = new io.reactivex.internal.observers.FullArbiterObserver
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r3.arbiter
                r5.<init>(r0)
                r4.subscribe(r5)
            L15:
                return
        }
    }

    public ObservableTimeout(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3, io.reactivex.ObservableSource<? extends T> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.firstTimeoutIndicator = r2
            r0.itemTimeoutIndicator = r3
            r0.other = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            io.reactivex.ObservableSource<? extends T> r0 = r5.other
            if (r0 != 0) goto L18
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r6)
            io.reactivex.ObservableSource<U> r6 = r5.firstTimeoutIndicator
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3 = r5.itemTimeoutIndicator
            r1.<init>(r2, r6, r3)
            r0.subscribe(r1)
            return
        L18:
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutOtherObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutOtherObserver
            io.reactivex.ObservableSource<U> r2 = r5.firstTimeoutIndicator
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3 = r5.itemTimeoutIndicator
            io.reactivex.ObservableSource<? extends T> r4 = r5.other
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
