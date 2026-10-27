package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableCombineLatest<T, R> extends io.reactivex.Observable<R> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
    final boolean delayError;
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CombinerObserver<T, R> implements io.reactivex.Observer<T> {
        final int index;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> parent;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;

        CombinerObserver(io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.s = r0
                r1.parent = r2
                r1.index = r3
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
                r3 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r3.parent
                r1 = 0
                int r2 = r3.index
                r0.combine(r1, r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r2.parent
                r0.onError(r3)
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r3 = r2.parent
                r0 = 0
                int r1 = r2.index
                r3.combine(r0, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r2.parent
                int r1 = r2.index
                r0.combine(r3, r1)
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LatestCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final T[] latest;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] observers;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;

        LatestCoordinator(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, int r5, boolean r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r1.errors = r0
                r1.actual = r2
                r1.combiner = r3
                r1.delayError = r6
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r1.latest = r2
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver[] r2 = new io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver[r4]
                r1.observers = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r5)
                r1.queue = r2
                return
        }

        void cancel(io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r4) {
                r3 = this;
                r3.clear(r4)
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver<T, R>[] r4 = r3.observers
                int r0 = r4.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L11
                r2 = r4[r1]
                r2.dispose()
                int r1 = r1 + 1
                goto L7
            L11:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, io.reactivex.Observer<?> r5, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r6, boolean r7) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r2.cancel(r6)
                return r1
            L9:
                if (r3 == 0) goto L46
                if (r7 == 0) goto L24
                if (r4 == 0) goto L46
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r2.queue
                r2.clear(r3)
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                if (r3 == 0) goto L20
                r5.onError(r3)
                goto L23
            L20:
                r5.onComplete()
            L23:
                return r1
            L24:
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L3b
                r2.cancel(r6)
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                r5.onError(r3)
                return r1
            L3b:
                if (r4 == 0) goto L46
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r2.queue
                r2.clear(r3)
                r5.onComplete()
                return r1
            L46:
                r3 = 0
                return r3
        }

        void clear(io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r3) {
                r2 = this;
                monitor-enter(r2)
                T[] r0 = r2.latest     // Catch: java.lang.Throwable -> Lc
                r1 = 0
                java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                r3.clear()
                return
            Lc:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        void combine(T r7, int r8) {
                r6 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver<T, R>[] r0 = r6.observers
                r0 = r0[r8]
                monitor-enter(r6)
                boolean r1 = r6.cancelled     // Catch: java.lang.Throwable -> Lb
                if (r1 == 0) goto Ld
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r7 = move-exception
                goto L59
            Ld:
                T[] r1 = r6.latest     // Catch: java.lang.Throwable -> Lb
                int r2 = r1.length     // Catch: java.lang.Throwable -> Lb
                r3 = r1[r8]     // Catch: java.lang.Throwable -> Lb
                int r4 = r6.active     // Catch: java.lang.Throwable -> Lb
                if (r3 != 0) goto L1a
                int r4 = r4 + 1
                r6.active = r4     // Catch: java.lang.Throwable -> Lb
            L1a:
                int r5 = r6.complete     // Catch: java.lang.Throwable -> Lb
                if (r7 != 0) goto L23
                int r5 = r5 + 1
                r6.complete = r5     // Catch: java.lang.Throwable -> Lb
                goto L25
            L23:
                r1[r8] = r7     // Catch: java.lang.Throwable -> Lb
            L25:
                r8 = 1
                if (r4 != r2) goto L2a
                r4 = 1
                goto L2b
            L2a:
                r4 = 0
            L2b:
                if (r5 == r2) goto L4d
                if (r7 != 0) goto L32
                if (r3 != 0) goto L32
                goto L4d
            L32:
                if (r7 == 0) goto L40
                if (r4 == 0) goto L40
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r8 = r6.queue     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> Lb
                r8.offer(r0, r1)     // Catch: java.lang.Throwable -> Lb
                goto L4f
            L40:
                if (r7 != 0) goto L4f
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
                if (r0 == 0) goto L4f
                r6.done = r8     // Catch: java.lang.Throwable -> Lb
                goto L4f
            L4d:
                r6.done = r8     // Catch: java.lang.Throwable -> Lb
            L4f:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
                if (r4 != 0) goto L55
                if (r7 == 0) goto L55
                return
            L55:
                r6.drain()
                return
            L59:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
                throw r7
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L12
                r0 = 1
                r1.cancelled = r0
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L12
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r1.cancel(r0)
            L12:
                return
        }

        void drain() {
                r8 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L8
                r1 = r8
                goto L3b
            L8:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r5 = r8.queue
                io.reactivex.Observer<? super R> r4 = r8.actual
                boolean r6 = r8.delayError
                r7 = 1
                r0 = 1
            L10:
                boolean r2 = r8.done
                boolean r3 = r5.isEmpty()
                r1 = r8
                boolean r2 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L1e
                goto L3b
            L1e:
                boolean r2 = r1.done
                java.lang.Object r3 = r5.poll()
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver r3 = (io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver) r3
                if (r3 != 0) goto L2a
                r3 = 1
                goto L2b
            L2a:
                r3 = 0
            L2b:
                boolean r2 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r2 == 0) goto L32
                goto L3b
            L32:
                if (r3 == 0) goto L3c
                int r0 = -r0
                int r0 = r8.addAndGet(r0)
                if (r0 != 0) goto L10
            L3b:
                return
            L3c:
                java.lang.Object r2 = r5.poll()
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3 = r1.combiner     // Catch: java.lang.Throwable -> L52
                java.lang.Object r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L52
                java.lang.String r3 = "The combiner returned a null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L52
                r4.onNext(r2)
                goto L1e
            L52:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.cancelled = r7
                r8.cancel(r5)
                r4.onError(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 != 0) goto Lb
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lb:
                return
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] r6) {
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver<T, R>[] r0 = r5.observers
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L11
                io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver r4 = new io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver
                r4.<init>(r5, r3)
                r0[r3] = r4
                int r3 = r3 + 1
                goto L5
            L11:
                r5.lazySet(r2)
                io.reactivex.Observer<? super R> r3 = r5.actual
                r3.onSubscribe(r5)
            L19:
                if (r2 >= r1) goto L2a
                boolean r3 = r5.cancelled
                if (r3 == 0) goto L20
                goto L2a
            L20:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L19
            L2a:
                return
        }
    }

    public ObservableCombineLatest(io.reactivex.ObservableSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.combiner = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r8) {
            r7 = this;
            io.reactivex.ObservableSource<? extends T>[] r0 = r7.sources
            if (r0 != 0) goto L30
            r0 = 8
            io.reactivex.Observable[] r0 = new io.reactivex.Observable[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1 = r7.sourcesIterable
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2e
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
            r4 = r3
            goto L32
        L30:
            int r3 = r0.length
            goto L2e
        L32:
            if (r4 != 0) goto L38
            io.reactivex.internal.disposables.EmptyDisposable.complete(r8)
            return
        L38:
            io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator r1 = new io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3 = r7.combiner
            int r5 = r7.bufferSize
            boolean r6 = r7.delayError
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r1.subscribe(r0)
            return
    }
}
