package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.id = r2
                r0.parent = r1
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                io.reactivex.internal.util.AtomicThrowable r0 = r0.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1c
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                boolean r0 = r2.delayErrors
                if (r0 != 0) goto L13
                r2.disposeAll()
            L13:
                r2 = 1
                r1.done = r2
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                r2.drain()
                return
            L1c:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(U r2) {
                r1 = this;
                int r0 = r1.fusionMode
                if (r0 != 0) goto La
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r0 = r1.parent
                r0.tryEmit(r2, r1)
                return
            La:
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r2 = r1.parent
                r2.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r2, r3)
                if (r0 == 0) goto L27
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L27
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L20
                r2.fusionMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver<T, U> r3 = r2.parent
                r3.drain()
                return
            L20:
                r1 = 2
                if (r0 != r1) goto L27
                r2.fusionMode = r0
                r2.queue = r3
            L27:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MergeObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] CANCELLED = null;
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        final io.reactivex.Observer<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[]> observers;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;
        io.reactivex.disposables.Disposable s;
        java.util.Queue<io.reactivex.ObservableSource<? extends U>> sources;
        long uniqueId;
        int wip;

        static {
                r0 = 0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r1 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r0]
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY = r1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r0]
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED = r0
                return
        }

        MergeObserver(io.reactivex.Observer<? super U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r3, boolean r4, int r5, int r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r1.errors = r0
                r1.actual = r2
                r1.mapper = r3
                r1.delayErrors = r4
                r1.maxConcurrency = r5
                r1.bufferSize = r6
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r2) goto L20
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>(r5)
                r1.sources = r2
            L20:
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r3 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY
                r2.<init>(r3)
                r1.observers = r2
                return
        }

        void addInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED
                if (r0 != r1) goto L10
                r5.dispose()
                return
            L10:
                int r1 = r0.length
                int r2 = r1 + 1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r2 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r2]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                r2[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r1 = r4.observers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L0
                return
        }

        boolean checkTerminate() {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                boolean r2 = r3.delayErrors
                if (r2 != 0) goto L23
                if (r0 == 0) goto L23
                r3.disposeAll()
                io.reactivex.Observer<? super U> r0 = r3.actual
                io.reactivex.internal.util.AtomicThrowable r2 = r3.errors
                java.lang.Throwable r2 = r2.terminate()
                r0.onError(r2)
                return r1
            L23:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r2.cancelled = r0
                boolean r0 = r2.disposeAll()
                if (r0 == 0) goto L1c
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L1c
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r1) goto L1c
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L1c:
                return
        }

        boolean disposeAll() {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.s
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.CANCELLED
                r2 = 0
                if (r0 == r1) goto L29
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r4.observers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                if (r0 == r1) goto L29
                int r1 = r0.length
            L1d:
                if (r2 >= r1) goto L27
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L1d
            L27:
                r0 = 1
                return r0
            L29:
                return r2
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
                r13 = this;
                io.reactivex.Observer<? super U> r0 = r13.actual
                r1 = 1
                r2 = 1
            L4:
                boolean r3 = r13.checkTerminate()
                if (r3 == 0) goto Lc
                goto L125
            Lc:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r3 = r13.queue
                if (r3 == 0) goto L25
            L10:
                boolean r4 = r13.checkTerminate()
                if (r4 == 0) goto L18
                goto L125
            L18:
                java.lang.Object r4 = r3.poll()
                if (r4 != 0) goto L21
                if (r4 != 0) goto L10
                goto L25
            L21:
                r0.onNext(r4)
                goto L10
            L25:
                boolean r3 = r13.done
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r4 = r13.queue
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r5 = r13.observers
                java.lang.Object r5 = r5.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r5
                int r6 = r5.length
                if (r3 == 0) goto L58
                if (r4 == 0) goto L3c
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L58
            L3c:
                if (r6 != 0) goto L58
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 != 0) goto L4d
                r0.onComplete()
                goto L125
            L4d:
                io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                goto L125
            L58:
                r3 = 0
                if (r6 == 0) goto Lf8
                long r7 = r13.lastId
                int r4 = r13.lastIndex
                if (r6 <= r4) goto L69
                r9 = r5[r4]
                long r9 = r9.id
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L88
            L69:
                if (r6 > r4) goto L6c
                r4 = 0
            L6c:
                r9 = 0
            L6d:
                if (r9 >= r6) goto L80
                r10 = r5[r4]
                long r10 = r10.id
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 != 0) goto L78
                goto L80
            L78:
                int r4 = r4 + 1
                if (r4 != r6) goto L7d
                r4 = 0
            L7d:
                int r9 = r9 + 1
                goto L6d
            L80:
                r13.lastIndex = r4
                r7 = r5[r4]
                long r7 = r7.id
                r13.lastId = r7
            L88:
                r7 = 0
                r8 = 0
            L8a:
                if (r7 >= r6) goto Lef
                boolean r9 = r13.checkTerminate()
                if (r9 == 0) goto L94
                goto L125
            L94:
                r9 = r5[r4]
            L96:
                boolean r10 = r13.checkTerminate()
                if (r10 == 0) goto L9e
                goto L125
            L9e:
                io.reactivex.internal.fuseable.SimpleQueue<U> r10 = r9.queue
                if (r10 != 0) goto La3
                goto Lab
            La3:
                java.lang.Object r11 = r10.poll()     // Catch: java.lang.Throwable -> Ld4
                if (r11 != 0) goto Lca
                if (r11 != 0) goto L96
            Lab:
                boolean r10 = r9.done
                io.reactivex.internal.fuseable.SimpleQueue<U> r11 = r9.queue
                if (r10 == 0) goto Lc4
                if (r11 == 0) goto Lb9
                boolean r10 = r11.isEmpty()
                if (r10 == 0) goto Lc4
            Lb9:
                r13.removeInner(r9)
                boolean r8 = r13.checkTerminate()
                if (r8 == 0) goto Lc3
                goto L125
            Lc3:
                r8 = 1
            Lc4:
                int r4 = r4 + 1
                if (r4 != r6) goto Led
                r4 = 0
                goto Led
            Lca:
                r0.onNext(r11)
                boolean r11 = r13.checkTerminate()
                if (r11 == 0) goto La3
                goto L125
            Ld4:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r9.dispose()
                io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
                r10.addThrowable(r8)
                boolean r8 = r13.checkTerminate()
                if (r8 == 0) goto Le7
                goto L125
            Le7:
                r13.removeInner(r9)
                int r7 = r7 + 1
                r8 = 1
            Led:
                int r7 = r7 + r1
                goto L8a
            Lef:
                r13.lastIndex = r4
                r3 = r5[r4]
                long r3 = r3.id
                r13.lastId = r3
                r3 = r8
            Lf8:
                if (r3 == 0) goto L11e
                int r3 = r13.maxConcurrency
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r4) goto L4
                monitor-enter(r13)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r3 = r13.sources     // Catch: java.lang.Throwable -> L114
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L114
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L114
                if (r3 != 0) goto L116
                int r3 = r13.wip     // Catch: java.lang.Throwable -> L114
                int r3 = r3 - r1
                r13.wip = r3     // Catch: java.lang.Throwable -> L114
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L114
                goto L4
            L114:
                r0 = move-exception
                goto L11c
            L116:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L114
                r13.subscribeInner(r3)
                goto L4
            L11c:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L114
                throw r0
            L11e:
                int r2 = -r2
                int r2 = r13.addAndGet(r2)
                if (r2 != 0) goto L4
            L125:
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
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L17
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L17:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L36
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = "The mapper returned a null ObservableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L36
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L36
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L32
                monitor-enter(r2)
                int r0 = r2.wip     // Catch: java.lang.Throwable -> L28
                int r1 = r2.maxConcurrency     // Catch: java.lang.Throwable -> L28
                if (r0 != r1) goto L2a
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r0 = r2.sources     // Catch: java.lang.Throwable -> L28
                r0.offer(r3)     // Catch: java.lang.Throwable -> L28
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                return
            L28:
                r3 = move-exception
                goto L30
            L2a:
                int r0 = r0 + 1
                r2.wip = r0     // Catch: java.lang.Throwable -> L28
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                goto L32
            L30:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                throw r3
            L32:
                r2.subscribeInner(r3)
                return
            L36:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.s
                r0.dispose()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                io.reactivex.Observer<? super U> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        void removeInner(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r0 = r6.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r0 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L39
            Lc:
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L18
                r4 = r0[r3]
                if (r4 != r7) goto L15
                goto L19
            L15:
                int r3 = r3 + 1
                goto Le
            L18:
                r3 = -1
            L19:
                if (r3 >= 0) goto L1c
                goto L39
            L1c:
                r4 = 1
                if (r1 != r4) goto L22
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.EMPTY
                goto L31
            L22:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L31:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r2 = r6.observers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L39:
                return
        }

        void subscribeInner(io.reactivex.ObservableSource<? extends U> r6) {
                r5 = this;
            L0:
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L2a
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                r5.tryEmitScalar(r6)
                int r6 = r5.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L29
                monitor-enter(r5)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r6 = r5.sources     // Catch: java.lang.Throwable -> L23
                java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L23
                io.reactivex.ObservableSource r6 = (io.reactivex.ObservableSource) r6     // Catch: java.lang.Throwable -> L23
                if (r6 != 0) goto L25
                int r6 = r5.wip     // Catch: java.lang.Throwable -> L23
                int r6 = r6 + (-1)
                r5.wip = r6     // Catch: java.lang.Throwable -> L23
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
                return
            L23:
                r6 = move-exception
                goto L27
            L25:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
                goto L0
            L27:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
                throw r6
            L29:
                return
            L2a:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r1 = r5.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r5.uniqueId = r3
                r0.<init>(r5, r1)
                r5.addInner(r0)
                r6.subscribe(r0)
                return
        }

        void tryEmit(U r3, io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> r4) {
                r2 = this;
                int r0 = r2.get()
                if (r0 != 0) goto L1a
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1a
                io.reactivex.Observer<? super U> r4 = r2.actual
                r4.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L31
                goto L30
            L1a:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r4.queue
                if (r0 != 0) goto L27
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                r4.queue = r0
            L27:
                r0.offer(r3)
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L31
            L30:
                return
            L31:
                r2.drainLoop()
                return
        }

        void tryEmitScalar(java.util.concurrent.Callable<? extends U> r3) {
                r2 = this;
                java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L59
                if (r3 != 0) goto L7
                goto L54
            L7:
                int r0 = r2.get()
                if (r0 != 0) goto L21
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L21
                io.reactivex.Observer<? super U> r0 = r2.actual
                r0.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L55
                goto L54
            L21:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                if (r0 != 0) goto L3d
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L34
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                goto L3b
            L34:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.maxConcurrency
                r0.<init>(r1)
            L3b:
                r2.queue = r0
            L3d:
                boolean r3 = r0.offer(r3)
                if (r3 != 0) goto L4e
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Scalar queue full?!"
                r3.<init>(r0)
                r2.onError(r3)
                return
            L4e:
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L55
            L54:
                return
            L55:
                r2.drainLoop()
                return
            L59:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                r0.addThrowable(r3)
                r2.drain()
                return
        }
    }

    public ObservableFlatMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            r0.bufferSize = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r8) {
            r7 = this;
            io.reactivex.ObservableSource<T> r0 = r7.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1 = r7.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r8, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.ObservableSource<T> r0 = r7.source
            io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver r1 = new io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r3 = r7.mapper
            boolean r4 = r7.delayErrors
            int r5 = r7.maxConcurrency
            int r6 = r7.bufferSize
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r1)
            return
    }
}
