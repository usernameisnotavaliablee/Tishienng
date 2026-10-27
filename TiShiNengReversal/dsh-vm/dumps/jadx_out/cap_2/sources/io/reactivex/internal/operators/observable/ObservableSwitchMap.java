package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SwitchMapInnerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        volatile boolean done;
        final long index;
        final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<R> queue;

        SwitchMapInnerObserver(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r4)
                r0.queue = r1
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r5 = this;
                long r0 = r5.index
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r2 = r5.parent
                long r2 = r2.unique
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L12
                r0 = 1
                r5.done = r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r0 = r5.parent
                r0.drain()
            L12:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r0 = r1.parent
                r0.innerError(r1, r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(R r6) {
                r5 = this;
                long r0 = r5.index
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r2 = r5.parent
                long r2 = r2.unique
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L14
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> r0 = r5.queue
                r0.offer(r6)
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver<T, R> r6 = r5.parent
                r6.drain()
            L14:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SwitchMapObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> active;
        final io.reactivex.Observer<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        io.reactivex.disposables.Disposable s;
        volatile long unique;

        static {
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver
                r1 = -1
                r3 = 1
                r4 = 0
                r0.<init>(r4, r1, r3)
                io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED = r0
                r0.cancel()
                return
        }

        SwitchMapObserver(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.active = r0
                r1.actual = r2
                r1.mapper = r3
                r1.bufferSize = r4
                r1.delayErrors = r5
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.errors = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lf
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                r1.disposeInner()
            Lf:
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED
                if (r0 == r1) goto L1b
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                if (r0 == r1) goto L1b
                if (r0 == 0) goto L1b
                r0.cancel()
            L1b:
                return
        }

        void drain() {
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L8
                goto Ldd
            L8:
                io.reactivex.Observer<? super R> r0 = r10.actual
                r1 = 1
                r2 = 1
            Lc:
                boolean r3 = r10.cancelled
                if (r3 == 0) goto L12
                goto Ldd
            L12:
                boolean r3 = r10.done
                r4 = 0
                if (r3 == 0) goto L54
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r3 = r10.active
                java.lang.Object r3 = r3.get()
                if (r3 != 0) goto L21
                r3 = 1
                goto L22
            L21:
                r3 = 0
            L22:
                boolean r5 = r10.delayErrors
                if (r5 == 0) goto L3a
                if (r3 == 0) goto L54
                io.reactivex.internal.util.AtomicThrowable r1 = r10.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L36
                r0.onError(r1)
                return
            L36:
                r0.onComplete()
                return
            L3a:
                io.reactivex.internal.util.AtomicThrowable r5 = r10.errors
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L4e
                io.reactivex.internal.util.AtomicThrowable r1 = r10.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L4e:
                if (r3 == 0) goto L54
                r0.onComplete()
                return
            L54:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r3 = r10.active
                java.lang.Object r3 = r3.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r3 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r3
                if (r3 == 0) goto Ld6
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> r5 = r3.queue
                boolean r6 = r3.done
                r7 = 0
                if (r6 == 0) goto L92
                boolean r6 = r5.isEmpty()
                boolean r8 = r10.delayErrors
                if (r8 == 0) goto L75
                if (r6 == 0) goto L92
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r4 = r10.active
                androidx.camera.view.p.a(r4, r3, r7)
                goto Lc
            L75:
                io.reactivex.internal.util.AtomicThrowable r8 = r10.errors
                java.lang.Object r8 = r8.get()
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                if (r8 == 0) goto L89
                io.reactivex.internal.util.AtomicThrowable r1 = r10.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L89:
                if (r6 == 0) goto L92
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r4 = r10.active
                androidx.camera.view.p.a(r4, r3, r7)
                goto Lc
            L92:
                boolean r6 = r10.cancelled
                if (r6 == 0) goto L97
                goto Ldd
            L97:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r6 = r10.active
                java.lang.Object r6 = r6.get()
                if (r3 == r6) goto La1
                goto Lc
            La1:
                boolean r6 = r10.delayErrors
                if (r6 != 0) goto Lb9
                io.reactivex.internal.util.AtomicThrowable r6 = r10.errors
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lb9
                io.reactivex.internal.util.AtomicThrowable r1 = r10.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lb9:
                boolean r6 = r3.done
                java.lang.Object r8 = r5.poll()
                if (r8 != 0) goto Lc3
                r9 = 1
                goto Lc4
            Lc3:
                r9 = 0
            Lc4:
                if (r6 == 0) goto Lcf
                if (r9 == 0) goto Lcf
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r4 = r10.active
                androidx.camera.view.p.a(r4, r3, r7)
                goto Lc
            Lcf:
                if (r9 == 0) goto Ld2
                goto Ld6
            Ld2:
                r0.onNext(r8)
                goto L92
            Ld6:
                int r2 = -r2
                int r2 = r10.addAndGet(r2)
                if (r2 != 0) goto Lc
            Ldd:
                return
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> r6, java.lang.Throwable r7) {
                r5 = this;
                long r0 = r6.index
                long r2 = r5.unique
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L20
                io.reactivex.internal.util.AtomicThrowable r0 = r5.errors
                boolean r0 = r0.addThrowable(r7)
                if (r0 == 0) goto L20
                boolean r7 = r5.delayErrors
                if (r7 != 0) goto L19
                io.reactivex.disposables.Disposable r7 = r5.s
                r7.dispose()
            L19:
                r7 = 1
                r6.done = r7
                r5.drain()
                return
            L20:
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
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
                if (r0 != 0) goto La
                r0 = 1
                r1.done = r0
                r1.drain()
            La:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L14
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 != 0) goto Ld
                goto L14
            Ld:
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L14:
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L1b
                r1.disposeInner()
            L1b:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.unique
                r2 = 1
                long r0 = r0 + r2
                r4.unique = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r2 = r4.active
                java.lang.Object r2 = r2.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r2 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r2
                if (r2 == 0) goto L14
                r2.cancel()
            L14:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2 = r4.mapper     // Catch: java.lang.Throwable -> L42
                java.lang.Object r5 = r2.apply(r5)     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = "The ObservableSource returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r2)     // Catch: java.lang.Throwable -> L42
                io.reactivex.ObservableSource r5 = (io.reactivex.ObservableSource) r5     // Catch: java.lang.Throwable -> L42
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r2 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver
                int r3 = r4.bufferSize
                r2.<init>(r4, r0, r3)
            L29:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r0 = r4.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) r0
                io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.CANCELLED
                if (r0 != r1) goto L36
                return
            L36:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r1 = r4.active
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L29
                r5.subscribe(r2)
                return
            L42:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.disposables.Disposable r0 = r4.s
                r0.dispose()
                r4.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSwitchMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.bufferSize = r3
            r0.delayErrors = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(r0, r6, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver r1 = new io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2 = r5.mapper
            int r3 = r5.bufferSize
            boolean r4 = r5.delayErrors
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
