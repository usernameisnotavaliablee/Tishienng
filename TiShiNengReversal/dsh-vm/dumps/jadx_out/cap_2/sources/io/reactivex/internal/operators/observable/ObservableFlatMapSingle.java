package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableFlatMapSingle<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlatMapSingleObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        final java.util.concurrent.atomic.AtomicInteger active;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        io.reactivex.disposables.Disposable d;
        final boolean delayErrors;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> queue;
        final io.reactivex.disposables.CompositeDisposable set;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver this$0;

            InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                    boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                    return r0
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver r0 = r1.this$0
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver r0 = r1.this$0
                    r0.innerSuccess(r1, r2)
                    return
            }
        }

        FlatMapSingleObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.active = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.queue = r1
                return
        }

        void clear() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r0 = r1.queue
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r0
                if (r0 == 0) goto Ld
                r0.clear()
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r8 = this;
                io.reactivex.Observer<? super R> r0 = r8.actual
                java.util.concurrent.atomic.AtomicInteger r1 = r8.active
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r2 = r8.queue
                r3 = 1
                r4 = 1
            L8:
                boolean r5 = r8.cancelled
                if (r5 == 0) goto L10
                r8.clear()
                return
            L10:
                boolean r5 = r8.delayErrors
                if (r5 != 0) goto L2b
                io.reactivex.internal.util.AtomicThrowable r5 = r8.errors
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L2b
                io.reactivex.internal.util.AtomicThrowable r1 = r8.errors
                java.lang.Throwable r1 = r1.terminate()
                r8.clear()
                r0.onError(r1)
                return
            L2b:
                int r5 = r1.get()
                r6 = 0
                if (r5 != 0) goto L34
                r5 = 1
                goto L35
            L34:
                r5 = 0
            L35:
                java.lang.Object r7 = r2.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r7 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r7
                if (r7 == 0) goto L42
                java.lang.Object r7 = r7.poll()
                goto L43
            L42:
                r7 = 0
            L43:
                if (r7 != 0) goto L46
                r6 = 1
            L46:
                if (r5 == 0) goto L5a
                if (r6 == 0) goto L5a
                io.reactivex.internal.util.AtomicThrowable r1 = r8.errors
                java.lang.Throwable r1 = r1.terminate()
                if (r1 == 0) goto L56
                r0.onError(r1)
                return
            L56:
                r0.onComplete()
                return
            L5a:
                if (r6 == 0) goto L64
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto L8
                return
            L64:
                r0.onNext(r7)
                goto L8
        }

        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> getOrCreateQueue() {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r0 = r3.queue
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = io.reactivex.Observable.bufferSize()
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r1 = r3.queue
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L0
                return r0
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver<T, R>.InnerObserver r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.delete(r2)
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                boolean r2 = r2.addThrowable(r3)
                if (r2 == 0) goto L24
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto L1b
                io.reactivex.disposables.Disposable r2 = r1.d
                r2.dispose()
                io.reactivex.disposables.CompositeDisposable r2 = r1.set
                r2.dispose()
            L1b:
                java.util.concurrent.atomic.AtomicInteger r2 = r1.active
                r2.decrementAndGet()
                r1.drain()
                return
            L24:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        void innerSuccess(io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver<T, R>.InnerObserver r3, R r4) {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                io.reactivex.Observer<? super R> r1 = r2.actual
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.active
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = 1
            L21:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r4 = r2.queue
                java.lang.Object r4 = r4.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r4 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                if (r3 == 0) goto L41
                io.reactivex.Observer<? super R> r4 = r2.actual
                r4.onError(r3)
                return
            L41:
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onComplete()
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                goto L62
            L4e:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = r2.getOrCreateQueue()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.active
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
            L62:
                return
            L63:
                r2.drainLoop()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                r0.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                r0.decrementAndGet()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1a
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto L16
                io.reactivex.disposables.CompositeDisposable r2 = r1.set
                r2.dispose()
            L16:
                r1.drain()
                return
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L21
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L21
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L21
                io.reactivex.SingleSource r3 = (io.reactivex.SingleSource) r3     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.atomic.AtomicInteger r0 = r2.active
                r0.getAndIncrement()
                io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver
                r0.<init>(r2)
                io.reactivex.disposables.CompositeDisposable r1 = r2.set
                r1.add(r0)
                r3.subscribe(r0)
                return
            L21:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.d
                r0.dispose()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableFlatMapSingle(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver r1 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
