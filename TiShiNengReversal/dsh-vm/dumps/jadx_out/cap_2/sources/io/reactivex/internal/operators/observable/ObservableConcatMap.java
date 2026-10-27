package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableConcatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final io.reactivex.internal.util.ErrorMode delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMapDelayErrorObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final io.reactivex.Observer<? super R> actual;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter;
        final int bufferSize;
        volatile boolean cancelled;
        io.reactivex.disposables.Disposable d;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<R> observer;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;
        final boolean tillTheEnd;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class DelayErrorInnerObserver<R> implements io.reactivex.Observer<R> {
            final io.reactivex.Observer<? super R> actual;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(io.reactivex.Observer<? super R> r1, io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.parent = r2
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> r0 = r2.parent
                    r1 = 0
                    r0.active = r1
                    r0.drain()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r3) {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> r0 = r2.parent
                    io.reactivex.internal.util.AtomicThrowable r1 = r0.error
                    boolean r1 = r1.addThrowable(r3)
                    if (r1 == 0) goto L1a
                    boolean r3 = r0.tillTheEnd
                    if (r3 != 0) goto L13
                    io.reactivex.disposables.Disposable r3 = r0.d
                    r3.dispose()
                L13:
                    r3 = 0
                    r0.active = r3
                    r0.drain()
                    return
                L1a:
                    io.reactivex.plugins.RxJavaPlugins.onError(r3)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(R r2) {
                    r1 = this;
                    io.reactivex.Observer<? super R> r0 = r1.actual
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> r0 = r1.parent
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r0.arbiter
                    r0.replace(r2)
                    return
            }
        }

        ConcatMapDelayErrorObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.bufferSize = r3
                r0.tillTheEnd = r4
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r0.error = r2
                io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver
                r2.<init>(r1, r0)
                r0.observer = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.arbiter = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.arbiter
                r0.dispose()
                return
        }

        void drain() {
                r7 = this;
                int r0 = r7.getAndIncrement()
                if (r0 == 0) goto L8
                goto Lb4
            L8:
                io.reactivex.Observer<? super R> r0 = r7.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r7.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r7.error
            Le:
                boolean r3 = r7.active
                if (r3 != 0) goto Lae
                boolean r3 = r7.cancelled
                if (r3 == 0) goto L1a
                r1.clear()
                return
            L1a:
                boolean r3 = r7.tillTheEnd
                if (r3 != 0) goto L31
                java.lang.Object r3 = r2.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L31
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L31:
                boolean r3 = r7.done
                java.lang.Object r4 = r1.poll()     // Catch: java.lang.Throwable -> L9a
                r5 = 1
                if (r4 != 0) goto L3c
                r6 = 1
                goto L3d
            L3c:
                r6 = 0
            L3d:
                if (r3 == 0) goto L4f
                if (r6 == 0) goto L4f
                java.lang.Throwable r1 = r2.terminate()
                if (r1 == 0) goto L4b
                r0.onError(r1)
                goto Lb4
            L4b:
                r0.onComplete()
                goto Lb4
            L4f:
                if (r6 != 0) goto Lae
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3 = r7.mapper     // Catch: java.lang.Throwable -> L83
                java.lang.Object r3 = r3.apply(r4)     // Catch: java.lang.Throwable -> L83
                java.lang.String r4 = "The mapper returned a null ObservableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L83
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L83
                boolean r4 = r3 instanceof java.util.concurrent.Callable
                if (r4 == 0) goto L7b
                java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3     // Catch: java.lang.Throwable -> L73
                java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L73
                if (r3 == 0) goto Le
                boolean r4 = r7.cancelled
                if (r4 != 0) goto Le
                r0.onNext(r3)
                goto Le
            L73:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.addThrowable(r3)
                goto Le
            L7b:
                r7.active = r5
                io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver<R> r4 = r7.observer
                r3.subscribe(r4)
                goto Lae
            L83:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r4 = r7.d
                r4.dispose()
                r1.clear()
                r2.addThrowable(r3)
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L9a:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r3 = r7.d
                r3.dispose()
                r2.addThrowable(r1)
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            Lae:
                int r3 = r7.decrementAndGet()
                if (r3 != 0) goto Le
            Lb4:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = r0.isDisposed()
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
                if (r0 == 0) goto L42
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
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super R> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SourceObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final io.reactivex.Observer<? super U> actual;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        int fusionMode;
        final io.reactivex.Observer<U> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        io.reactivex.disposables.Disposable s;
        final io.reactivex.internal.disposables.SequentialDisposable sa;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class InnerObserver<U> implements io.reactivex.Observer<U> {
            final io.reactivex.Observer<? super U> actual;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> parent;

            InnerObserver(io.reactivex.Observer<? super U> r1, io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.parent = r2
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver<?, ?> r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver<?, ?> r0 = r1.parent
                    r0.dispose()
                    io.reactivex.Observer<? super U> r0 = r1.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(U r2) {
                    r1 = this;
                    io.reactivex.Observer<? super U> r0 = r1.actual
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver<?, ?> r0 = r1.parent
                    r0.innerSubscribe(r2)
                    return
            }
        }

        SourceObserver(io.reactivex.Observer<? super U> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.bufferSize = r3
                io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver
                r2.<init>(r1, r0)
                r0.inner = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.sa = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.sa
                r0.dispose()
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L18:
                return
        }

        void drain() {
                r4 = this;
                int r0 = r4.getAndIncrement()
                if (r0 == 0) goto L7
                goto L6f
            L7:
                boolean r0 = r4.disposed
                if (r0 == 0) goto L11
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r4.queue
                r0.clear()
                return
            L11:
                boolean r0 = r4.active
                if (r0 != 0) goto L69
                boolean r0 = r4.done
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue     // Catch: java.lang.Throwable -> L57
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L57
                r2 = 1
                if (r1 != 0) goto L22
                r3 = 1
                goto L23
            L22:
                r3 = 0
            L23:
                if (r0 == 0) goto L2d
                if (r3 == 0) goto L2d
                io.reactivex.Observer<? super U> r0 = r4.actual
                r0.onComplete()
                return
            L2d:
                if (r3 != 0) goto L69
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r4.mapper     // Catch: java.lang.Throwable -> L45
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L45
                java.lang.String r1 = "The mapper returned a null ObservableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L45
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L45
                r4.active = r2
                io.reactivex.Observer<U> r1 = r4.inner
                r0.subscribe(r1)
                goto L69
            L45:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.dispose()
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue
                r1.clear()
                io.reactivex.Observer<? super U> r1 = r4.actual
                r1.onError(r0)
                return
            L57:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.dispose()
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r4.queue
                r1.clear()
                io.reactivex.Observer<? super U> r1 = r4.actual
                r1.onError(r0)
                return
            L69:
                int r0 = r4.decrementAndGet()
                if (r0 != 0) goto L7
            L6f:
                return
        }

        void innerComplete() {
                r1 = this;
                r0 = 0
                r1.active = r0
                r1.drain()
                return
        }

        void innerSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.sa
                r0.update(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.drain()
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
                r1.dispose()
                io.reactivex.Observer<? super U> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.fusionMode
                if (r0 != 0) goto Le
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.offer(r2)
            Le:
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L42
                r2.s = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L27
                r2.fusionMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
                r2.drain()
                return
            L27:
                r1 = 2
                if (r0 != r1) goto L34
                r2.fusionMode = r0
                r2.queue = r3
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
                return
            L34:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super U> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }
    }

    public ObservableConcatMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r4
            r1 = 8
            int r1 = java.lang.Math.max(r1, r3)
            r0.bufferSize = r1
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r7) {
            r6 = this;
            io.reactivex.ObservableSource<T> r0 = r6.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1 = r6.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r7, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.internal.util.ErrorMode r0 = r6.delayErrors
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            if (r0 != r1) goto L25
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r7)
            io.reactivex.ObservableSource<T> r7 = r6.source
            io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2 = r6.mapper
            int r3 = r6.bufferSize
            r1.<init>(r0, r2, r3)
            r7.subscribe(r1)
            return
        L25:
            io.reactivex.ObservableSource<T> r0 = r6.source
            io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver r1 = new io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2 = r6.mapper
            int r3 = r6.bufferSize
            io.reactivex.internal.util.ErrorMode r4 = r6.delayErrors
            io.reactivex.internal.util.ErrorMode r5 = io.reactivex.internal.util.ErrorMode.END
            if (r4 != r5) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            r1.<init>(r7, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
