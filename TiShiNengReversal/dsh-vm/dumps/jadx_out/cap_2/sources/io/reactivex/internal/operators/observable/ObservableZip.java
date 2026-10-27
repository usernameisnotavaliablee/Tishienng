package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableZip<T, R> extends io.reactivex.Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        final boolean delayError;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] observers;
        final T[] row;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.zipper = r2
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver[] r1 = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver[r3]
                r0.observers = r1
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r0.row = r1
                r0.delayError = r4
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, io.reactivex.Observer<? super R> r5, boolean r6, io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<?, ?> r7) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r2.clear()
                return r1
            L9:
                if (r3 == 0) goto L32
                if (r6 == 0) goto L1e
                if (r4 == 0) goto L32
                java.lang.Throwable r3 = r7.error
                r2.clear()
                if (r3 == 0) goto L1a
                r5.onError(r3)
                goto L1d
            L1a:
                r5.onComplete()
            L1d:
                return r1
            L1e:
                java.lang.Throwable r3 = r7.error
                if (r3 == 0) goto L29
                r2.clear()
                r5.onError(r3)
                return r1
            L29:
                if (r4 == 0) goto L32
                r2.clear()
                r5.onComplete()
                return r1
            L32:
                r3 = 0
                return r3
        }

        void clear() {
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.dispose()
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3 = r3.queue
                r3.clear()
                int r2 = r2 + 1
                goto L4
            L13:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L10
                r0 = 1
                r1.cancelled = r0
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L10
                r1.clear()
            L10:
                return
        }

        public void drain() {
                r16 = this;
                r1 = r16
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L9
                goto L5b
            L9:
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r1.observers
                io.reactivex.Observer<? super R> r4 = r1.actual
                T[] r7 = r1.row
                boolean r5 = r1.delayError
                r8 = 1
                r9 = 1
            L13:
                int r10 = r0.length
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L18:
                if (r12 >= r10) goto L52
                r6 = r0[r12]
                r2 = r7[r14]
                if (r2 != 0) goto L3c
                boolean r2 = r6.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3 = r6.queue
                java.lang.Object r15 = r3.poll()
                if (r15 != 0) goto L2c
                r3 = 1
                goto L2d
            L2c:
                r3 = 0
            L2d:
                boolean r2 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L34
                goto L5b
            L34:
                if (r3 != 0) goto L39
                r7[r14] = r15
                goto L4d
            L39:
                int r13 = r13 + 1
                goto L4d
            L3c:
                boolean r2 = r6.done
                if (r2 == 0) goto L4d
                if (r5 != 0) goto L4d
                java.lang.Throwable r2 = r6.error
                if (r2 == 0) goto L4d
                r1.clear()
                r4.onError(r2)
                return
            L4d:
                int r14 = r14 + 1
                int r12 = r12 + 1
                goto L18
            L52:
                if (r13 == 0) goto L5c
                int r2 = -r9
                int r9 = r1.addAndGet(r2)
                if (r9 != 0) goto L13
            L5b:
                return
            L5c:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2 = r1.zipper     // Catch: java.lang.Throwable -> L74
                java.lang.Object r3 = r7.clone()     // Catch: java.lang.Throwable -> L74
                java.lang.Object r2 = r2.apply(r3)     // Catch: java.lang.Throwable -> L74
                java.lang.String r3 = "The zipper returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L74
                r4.onNext(r2)
                r2 = 0
                java.util.Arrays.fill(r7, r2)
                goto L13
            L74:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.clear()
                r4.onError(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] r6, int r7) {
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r5.observers
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L11
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver r4 = new io.reactivex.internal.operators.observable.ObservableZip$ZipObserver
                r4.<init>(r5, r7)
                r0[r3] = r4
                int r3 = r3 + 1
                goto L5
            L11:
                r5.lazySet(r2)
                io.reactivex.Observer<? super R> r7 = r5.actual
                r7.onSubscribe(r5)
            L19:
                if (r2 >= r1) goto L2a
                boolean r7 = r5.cancelled
                if (r7 == 0) goto L20
                goto L2a
            L20:
                r7 = r6[r2]
                r3 = r0[r2]
                r7.subscribe(r3)
                int r2 = r2 + 1
                goto L19
            L2a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipObserver<T, R> implements io.reactivex.Observer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;

        ZipObserver(io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.s = r0
                r1.parent = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r3)
                r1.queue = r2
                return
        }

        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r1 = r0.parent
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator<T, R> r2 = r1.parent
                r2.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    public ObservableZip(io.reactivex.ObservableSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.zipper = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r7) {
            r6 = this;
            io.reactivex.ObservableSource<? extends T>[] r0 = r6.sources
            if (r0 != 0) goto L2e
            r0 = 8
            io.reactivex.Observable[] r0 = new io.reactivex.Observable[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1 = r6.sourcesIterable
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r1.next()
            io.reactivex.ObservableSource r4 = (io.reactivex.ObservableSource) r4
            int r5 = r0.length
            if (r3 != r5) goto L28
            int r5 = r3 >> 2
            int r5 = r5 + r3
            io.reactivex.ObservableSource[] r5 = new io.reactivex.ObservableSource[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            r0 = r5
        L28:
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
            goto L10
        L2e:
            int r3 = r0.length
        L2f:
            if (r3 != 0) goto L35
            io.reactivex.internal.disposables.EmptyDisposable.complete(r7)
            return
        L35:
            io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator r1 = new io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2 = r6.zipper
            boolean r4 = r6.delayError
            r1.<init>(r7, r2, r3, r4)
            int r7 = r6.bufferSize
            r1.subscribe(r0, r7)
            return
    }
}
