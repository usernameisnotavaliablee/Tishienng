package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMapEagerMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.observers.InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        io.reactivex.internal.observers.InnerQueuedObserver<R> current;
        io.reactivex.disposables.Disposable d;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final int maxConcurrency;
        final java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> observers;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        ConcatMapEagerMainObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.maxConcurrency = r3
                r0.prefetch = r4
                r0.errorMode = r5
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.observers = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L11
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                r1.disposeAll()
            L11:
                return
        }

        void disposeAll() {
                r1 = this;
                io.reactivex.internal.observers.InnerQueuedObserver<R> r0 = r1.current
                if (r0 == 0) goto L7
                r0.dispose()
            L7:
                java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> r0 = r1.observers
                java.lang.Object r0 = r0.poll()
                io.reactivex.internal.observers.InnerQueuedObserver r0 = (io.reactivex.internal.observers.InnerQueuedObserver) r0
                if (r0 != 0) goto L12
                return
            L12:
                r0.dispose()
                goto L7
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L8
                goto L18c
            L8:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r13.queue
                java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> r1 = r13.observers
                io.reactivex.Observer<? super R> r2 = r13.actual
                io.reactivex.internal.util.ErrorMode r3 = r13.errorMode
                r4 = 1
                r5 = 1
            L12:
                int r6 = r13.activeCount
            L14:
                int r7 = r13.maxConcurrency
                if (r6 == r7) goto L9e
                boolean r7 = r13.cancelled
                if (r7 == 0) goto L23
                r0.clear()
                r13.disposeAll()
                return
            L23:
                io.reactivex.internal.util.ErrorMode r7 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r7) goto L41
                io.reactivex.internal.util.AtomicThrowable r7 = r13.error
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L41
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L41:
                java.lang.Object r7 = r0.poll()     // Catch: java.lang.Throwable -> L80
                if (r7 != 0) goto L48
                goto L9e
            L48:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r8 = r13.mapper     // Catch: java.lang.Throwable -> L80
                java.lang.Object r7 = r8.apply(r7)     // Catch: java.lang.Throwable -> L80
                java.lang.String r8 = "The mapper returned a null ObservableSource"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L80
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> L80
                boolean r8 = r7 instanceof java.util.concurrent.Callable
                if (r8 == 0) goto L70
                java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7     // Catch: java.lang.Throwable -> L66
                java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L66
                if (r7 == 0) goto L14
                r2.onNext(r7)
                goto L14
            L66:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                io.reactivex.internal.util.AtomicThrowable r8 = r13.error
                r8.addThrowable(r7)
                goto L14
            L70:
                io.reactivex.internal.observers.InnerQueuedObserver r8 = new io.reactivex.internal.observers.InnerQueuedObserver
                int r9 = r13.prefetch
                r8.<init>(r13, r9)
                r1.offer(r8)
                r7.subscribe(r8)
                int r6 = r6 + 1
                goto L14
            L80:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r3 = r13.d
                r3.dispose()
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                r0.addThrowable(r1)
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L9e:
                r13.activeCount = r6
                boolean r6 = r13.cancelled
                if (r6 == 0) goto Lab
                r0.clear()
                r13.disposeAll()
                return
            Lab:
                io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r6) goto Lc9
                io.reactivex.internal.util.AtomicThrowable r6 = r13.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lc9
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lc9:
                io.reactivex.internal.observers.InnerQueuedObserver<R> r6 = r13.current
                r7 = 0
                if (r6 != 0) goto L122
                io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r3 != r6) goto Lec
                io.reactivex.internal.util.AtomicThrowable r6 = r13.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lec
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lec:
                boolean r6 = r13.done
                java.lang.Object r8 = r1.poll()
                io.reactivex.internal.observers.InnerQueuedObserver r8 = (io.reactivex.internal.observers.InnerQueuedObserver) r8
                if (r8 != 0) goto Lf8
                r9 = 1
                goto Lf9
            Lf8:
                r9 = 0
            Lf9:
                if (r6 == 0) goto L11d
                if (r9 == 0) goto L11d
                io.reactivex.internal.util.AtomicThrowable r1 = r13.error
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L118
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                goto L18c
            L118:
                r2.onComplete()
                goto L18c
            L11d:
                if (r9 != 0) goto L121
                r13.current = r8
            L121:
                r6 = r8
            L122:
                if (r6 == 0) goto L185
                io.reactivex.internal.fuseable.SimpleQueue r8 = r6.queue()
            L128:
                boolean r9 = r13.cancelled
                if (r9 == 0) goto L133
                r0.clear()
                r13.disposeAll()
                return
            L133:
                boolean r9 = r6.isDone()
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r10) goto L155
                io.reactivex.internal.util.AtomicThrowable r10 = r13.error
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L155
                r0.clear()
                r13.disposeAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r13.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L155:
                r10 = 0
                java.lang.Object r11 = r8.poll()     // Catch: java.lang.Throwable -> L173
                if (r11 != 0) goto L15e
                r12 = 1
                goto L15f
            L15e:
                r12 = 0
            L15f:
                if (r9 == 0) goto L16c
                if (r12 == 0) goto L16c
                r13.current = r10
                int r6 = r13.activeCount
                int r6 = r6 - r4
                r13.activeCount = r6
                goto L12
            L16c:
                if (r12 == 0) goto L16f
                goto L185
            L16f:
                r2.onNext(r11)
                goto L128
            L173:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.internal.util.AtomicThrowable r7 = r13.error
                r7.addThrowable(r6)
                r13.current = r10
                int r6 = r13.activeCount
                int r6 = r6 - r4
                r13.activeCount = r6
                goto L12
            L185:
                int r5 = -r5
                int r5 = r13.addAndGet(r5)
                if (r5 != 0) goto L12
            L18c:
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<R> r1) {
                r0 = this;
                r1.setDone()
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerError(io.reactivex.internal.observers.InnerQueuedObserver<R> r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto L1a
                io.reactivex.internal.util.ErrorMode r3 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L13
                io.reactivex.disposables.Disposable r3 = r1.d
                r3.dispose()
            L13:
                r2.setDone()
                r1.drain()
                return
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<R> r1, R r2) {
                r0 = this;
                io.reactivex.internal.fuseable.SimpleQueue r1 = r1.queue()
                r1.offer(r2)
                r0.drain()
                return
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
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lf
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L9
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.offer(r2)
            L9:
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L41
                r2.d = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L27
                r2.sourceMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
                r2.drain()
                return
            L27:
                r1 = 2
                if (r0 != r1) goto L34
                r2.sourceMode = r0
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
                return
            L34:
                int r3 = r2.prefetch
                io.reactivex.internal.fuseable.SimpleQueue r3 = io.reactivex.internal.util.QueueDrainHelper.createQueue(r3)
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
            L41:
                return
        }
    }

    public ObservableConcatMapEager(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.internal.util.ErrorMode r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.errorMode = r3
            r0.maxConcurrency = r4
            r0.prefetch = r5
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r8) {
            r7 = this;
            io.reactivex.ObservableSource<T> r0 = r7.source
            io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3 = r7.mapper
            int r4 = r7.maxConcurrency
            int r5 = r7.prefetch
            io.reactivex.internal.util.ErrorMode r6 = r7.errorMode
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r1)
            return
    }
}
