package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservablePublish<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> current;
    final io.reactivex.ObservableSource<T> onSubscribe;
    final io.reactivex.ObservableSource<T> source;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final io.reactivex.Observer<? super T> child;

        InnerDisposable(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.lang.Object r0 = r1.getAndSet(r1)
                if (r0 == 0) goto Ld
                if (r0 == r1) goto Ld
                io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r0 = (io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) r0
                r0.remove(r1)
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        void setParent(io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> r2) {
                r1 = this;
                r0 = 0
                boolean r0 = r1.compareAndSet(r0, r2)
                if (r0 != 0) goto La
                r2.remove(r1)
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PublishObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] EMPTY = null;
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] TERMINATED = null;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> current;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[]> observers;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect;

        static {
                r0 = 0
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[r0]
                io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.EMPTY = r1
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[r0]
                io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED = r0
                return
        }

        PublishObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.s = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.EMPTY
                r0.<init>(r1)
                r2.observers = r0
                r2.current = r3
                java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                r3.<init>()
                r2.shouldConnect = r3
                return
        }

        boolean add(io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r3 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r1 = r4.observers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r2.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r2.observers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r0 = r2.current
                r1 = 0
                androidx.camera.view.p.a(r0, r2, r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L1f:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r2.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r0 = r4.current
                r1 = 0
                androidx.camera.view.p.a(r0, r4, r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r4.observers
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                int r1 = r0.length
                r2 = 0
            L12:
                if (r2 >= r1) goto L1e
                r3 = r0[r2]
                io.reactivex.Observer<? super T> r3 = r3.child
                r3.onComplete()
                int r2 = r2 + 1
                goto L12
            L1e:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r0 = r4.current
                r1 = 0
                androidx.camera.view.p.a(r0, r4, r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r4.observers
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                int r1 = r0.length
                if (r1 == 0) goto L22
                int r1 = r0.length
                r2 = 0
            L15:
                if (r2 >= r1) goto L21
                r3 = r0[r2]
                io.reactivex.Observer<? super T> r3 = r3.child
                r3.onError(r5)
                int r2 = r2 + 1
                goto L15
            L21:
                return
            L22:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                io.reactivex.Observer<? super T> r3 = r3.child
                r3.onNext(r5)
                int r2 = r2 + 1
                goto La
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void remove(io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r0 = r6.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L3d
            Lc:
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3d
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable[] r5 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable<T>[]> r2 = r6.observers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3d:
                return
        }
    }

    private ObservablePublish(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<T> r2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> r3) {
            r0 = this;
            r0.<init>()
            r0.onSubscribe = r1
            r0.source = r2
            r0.current = r3
            return
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> r3) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservablePublish$1 r1 = new io.reactivex.internal.operators.observable.ObservablePublish$1
            r1.<init>(r0)
            io.reactivex.internal.operators.observable.ObservablePublish r2 = new io.reactivex.internal.operators.observable.ObservablePublish
            r2.<init>(r1, r3, r0)
            io.reactivex.observables.ConnectableObservable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r0 = (io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L21
        L10:
            io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r1 = new io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r4.current
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r4.current
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 != 0) goto L20
            goto L0
        L20:
            r0 = r1
        L21:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L34
            r2 = 1
        L34:
            r5.accept(r0)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3e
            io.reactivex.ObservableSource<T> r5 = r4.source
            r5.subscribe(r0)
        L3e:
            return
        L3f:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public io.reactivex.ObservableSource<T> source() {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.onSubscribe
            r0.subscribe(r2)
            return
    }
}
