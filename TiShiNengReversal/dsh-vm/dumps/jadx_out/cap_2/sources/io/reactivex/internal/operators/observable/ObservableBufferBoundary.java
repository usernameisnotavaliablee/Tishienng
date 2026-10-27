package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> bufferClose;
    final io.reactivex.ObservableSource<? extends Open> bufferOpen;
    final java.util.concurrent.Callable<U> bufferSupplier;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> bufferClose;
        final io.reactivex.ObservableSource<? extends Open> bufferOpen;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;
        final io.reactivex.disposables.CompositeDisposable resources;
        io.reactivex.disposables.Disposable s;
        final java.util.concurrent.atomic.AtomicInteger windows;

        BufferBoundaryObserver(io.reactivex.Observer<? super U> r2, io.reactivex.ObservableSource<? extends Open> r3, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r4, java.util.concurrent.Callable<U> r5) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.windows = r2
                r1.bufferOpen = r3
                r1.bufferClose = r4
                r1.bufferSupplier = r5
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                io.reactivex.disposables.CompositeDisposable r2 = new io.reactivex.disposables.CompositeDisposable
                r2.<init>()
                r1.resources = r2
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                return
        }

        void close(U r2, io.reactivex.disposables.Disposable r3) {
                r1 = this;
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L22
                boolean r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
                if (r0 == 0) goto Le
                r0 = 0
                r1.fastPathOrderedEmit(r2, r0, r1)
            Le:
                io.reactivex.disposables.CompositeDisposable r2 = r1.resources
                boolean r2 = r2.remove(r3)
                if (r2 == 0) goto L21
                java.util.concurrent.atomic.AtomicInteger r2 = r1.windows
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L21
                r1.complete()
            L21:
                return
            L22:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
                throw r2
        }

        void complete() {
                r3 = this;
                monitor-enter(r3)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
                java.util.List<U extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L34
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L34
                java.util.List<U extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L34
                r1.clear()     // Catch: java.lang.Throwable -> L34
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r3.queue
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r0.next()
                java.util.Collection r2 = (java.util.Collection) r2
                r1.offer(r2)
                goto L14
            L24:
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L33
                io.reactivex.Observer<? super V> r0 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r1, r0, r2, r3, r3)
            L33:
                return
            L34:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
            Lc:
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
                java.util.concurrent.atomic.AtomicInteger r0 = r1.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Lb
                r1.complete()
            Lb:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.dispose()
                r0 = 1
                r1.cancelled = r0
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L13
                r0.clear()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
            L13:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L17
                r1.add(r3)     // Catch: java.lang.Throwable -> L17
                goto L7
            L17:
                r3 = move-exception
                goto L1b
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r3
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L24
                r2.s = r3
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferOpenObserver r3 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferOpenObserver
                r3.<init>(r2)
                io.reactivex.disposables.CompositeDisposable r0 = r2.resources
                r0.add(r3)
                io.reactivex.Observer<? super V> r0 = r2.actual
                r0.onSubscribe(r2)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.windows
                r1 = 1
                r0.lazySet(r1)
                io.reactivex.ObservableSource<? extends Open> r0 = r2.bufferOpen
                r0.subscribe(r3)
            L24:
                return
        }

        void open(Open r3) {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L5
                goto L25
            L5:
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L52
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L52
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L52
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L52
                io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r1 = r2.bufferClose     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r3 = r1.apply(r3)     // Catch: java.lang.Throwable -> L4a
                java.lang.String r1 = "The buffer closing Observable is null"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)     // Catch: java.lang.Throwable -> L4a
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L26
            L25:
                return
            L26:
                monitor-enter(r2)
                boolean r1 = r2.cancelled     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L2f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                return
            L2d:
                r3 = move-exception
                goto L48
            L2f:
                java.util.List<U extends java.util.Collection<? super T>> r1 = r2.buffers     // Catch: java.lang.Throwable -> L2d
                r1.add(r0)     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver
                r1.<init>(r0, r2)
                io.reactivex.disposables.CompositeDisposable r0 = r2.resources
                r0.add(r1)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.windows
                r0.getAndIncrement()
                r3.subscribe(r1)
                return
            L48:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
                throw r3
            L4a:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
            L52:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
        }

        void openFinished(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                java.util.concurrent.atomic.AtomicInteger r2 = r1.windows
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L13
                r1.complete()
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferCloseObserver<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.observers.DisposableObserver<Close> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, U, Open, Close> parent;
        final U value;

        BufferCloseObserver(U r1, io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, U, Open, Close> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r2
                r0.value = r1
                return
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
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r2.parent
                U extends java.util.Collection<? super T> r1 = r2.value
                r0.close(r1, r2)
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
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(Close r1) {
                r0 = this;
                r0.onComplete()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferOpenObserver<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.observers.DisposableObserver<Open> {
        boolean done;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, U, Open, Close> parent;

        BufferOpenObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, U, Open, Close> r1) {
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
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.openFinished(r1)
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
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(Open r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, Open, Close> r0 = r1.parent
                r0.open(r2)
                return
        }
    }

    public ObservableBufferBoundary(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r3, java.util.concurrent.Callable<U> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferOpen = r2
            r0.bufferClose = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r6)
            io.reactivex.ObservableSource<? extends Open> r6 = r5.bufferOpen
            io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> r3 = r5.bufferClose
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r4 = r5.bufferSupplier
            r1.<init>(r2, r6, r3, r4)
            r0.subscribe(r1)
            return
    }
}
