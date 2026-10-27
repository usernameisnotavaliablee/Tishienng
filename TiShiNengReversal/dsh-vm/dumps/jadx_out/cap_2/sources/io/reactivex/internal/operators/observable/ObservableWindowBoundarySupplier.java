package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int bufferSize;
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowBoundaryInnerObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> r0 = r1.parent
                r0.onComplete()
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
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.done
                if (r1 == 0) goto L5
                return
            L5:
                r1 = 1
                r0.done = r1
                r0.dispose()
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowBoundaryMainObserver<T, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        static final java.lang.Object NEXT = null;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> other;
        io.reactivex.disposables.Disposable s;
        io.reactivex.subjects.UnicastSubject<T> window;
        final java.util.concurrent.atomic.AtomicLong windows;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver.NEXT = r0
                return
        }

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r3, int r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.boundary = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.windows = r2
                r1.other = r3
                r1.bufferSize = r4
                r3 = 1
                r2.lazySet(r3)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void drainLoop() {
                r10 = this;
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r10.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r10.actual
                io.reactivex.subjects.UnicastSubject<T> r2 = r10.window
                r3 = 1
                r4 = 1
            La:
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L14
                r7 = 1
                goto L15
            L14:
                r7 = 0
            L15:
                if (r5 == 0) goto L2a
                if (r7 == 0) goto L2a
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r10.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L26
                r2.onError(r0)
                return
            L26:
                r2.onComplete()
                return
            L2a:
                if (r7 == 0) goto L34
                int r4 = -r4
                int r4 = r10.leave(r4)
                if (r4 != 0) goto La
                return
            L34:
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver.NEXT
                if (r6 != r5) goto L93
                r2.onComplete()
                java.util.concurrent.atomic.AtomicLong r5 = r10.windows
                long r5 = r5.decrementAndGet()
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L4d
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r10.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L4d:
                boolean r5 = r10.cancelled
                if (r5 == 0) goto L52
                goto La
            L52:
                java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2 = r10.other     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L86
                java.lang.String r5 = "The ObservableSource supplied is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r5)     // Catch: java.lang.Throwable -> L86
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2     // Catch: java.lang.Throwable -> L86
                int r5 = r10.bufferSize
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create(r5)
                java.util.concurrent.atomic.AtomicLong r6 = r10.windows
                r6.getAndIncrement()
                r10.window = r5
                r1.onNext(r5)
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryInnerObserver r6 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryInnerObserver
                r6.<init>(r10)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r7 = r10.boundary
                java.lang.Object r8 = r7.get()
                boolean r7 = androidx.camera.view.p.a(r7, r8, r6)
                if (r7 == 0) goto L84
                r2.subscribe(r6)
            L84:
                r2 = r5
                goto La
            L86:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r10.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                r1.onError(r0)
                return
            L93:
                java.lang.Object r5 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r5)
                goto La
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        void next() {
                r2 = this;
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver.NEXT
                r0.offer(r1)
                boolean r0 = r2.enter()
                if (r0 == 0) goto L10
                r2.drainLoop()
            L10:
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.done = r0
                boolean r0 = r5.enter()
                if (r0 == 0) goto L11
                r5.drainLoop()
            L11:
                java.util.concurrent.atomic.AtomicLong r0 = r5.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L22
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r5.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L22:
                io.reactivex.Observer<? super V> r0 = r5.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
                return
            L8:
                r5.error = r6
                r0 = 1
                r5.done = r0
                boolean r0 = r5.enter()
                if (r0 == 0) goto L16
                r5.drainLoop()
            L16:
                java.util.concurrent.atomic.AtomicLong r0 = r5.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L27
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r5.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L27:
                io.reactivex.Observer<? super V> r0 = r5.actual
                r0.onError(r6)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.fastEnter()
                if (r0 == 0) goto L13
                io.reactivex.subjects.UnicastSubject<T> r0 = r1.window
                r0.onNext(r2)
                r2 = -1
                int r2 = r1.leave(r2)
                if (r2 != 0) goto L23
                goto L22
            L13:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r1.queue
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
                r0.offer(r2)
                boolean r2 = r1.enter()
                if (r2 != 0) goto L23
            L22:
                return
            L23:
                r1.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r4) {
                r3 = this;
                io.reactivex.disposables.Disposable r0 = r3.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r4)
                if (r0 == 0) goto L4e
                r3.s = r4
                io.reactivex.Observer<? super V> r0 = r3.actual
                r0.onSubscribe(r3)
                boolean r1 = r3.cancelled
                if (r1 == 0) goto L14
                goto L4e
            L14:
                java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r1 = r3.other     // Catch: java.lang.Throwable -> L44
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L44
                java.lang.String r2 = "The first window ObservableSource supplied is null"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L44
                io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L44
                int r4 = r3.bufferSize
                io.reactivex.subjects.UnicastSubject r4 = io.reactivex.subjects.UnicastSubject.create(r4)
                r3.window = r4
                r0.onNext(r4)
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryInnerObserver r4 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryInnerObserver
                r4.<init>(r3)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.boundary
                r2 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r2, r4)
                if (r0 == 0) goto L4e
                java.util.concurrent.atomic.AtomicLong r0 = r3.windows
                r0.getAndIncrement()
                r1.subscribe(r4)
                return
            L44:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r4.dispose()
                r0.onError(r1)
            L4e:
                return
        }
    }

    public ObservableWindowBoundarySupplier(io.reactivex.ObservableSource<T> r1, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.bufferSize = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver r1 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r5)
            java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r5 = r4.other
            int r3 = r4.bufferSize
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}
