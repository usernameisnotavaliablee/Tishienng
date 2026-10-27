package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableRedo<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, ? extends io.reactivex.ObservableSource<?>> manager;
    final boolean retryMode;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RedoObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -1151903143112844287L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter;
        final boolean retryMode;
        final io.reactivex.ObservableSource<? extends T> source;
        final io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> subject;
        final java.util.concurrent.atomic.AtomicInteger wip;

        RedoObserver(io.reactivex.Observer<? super T> r2, io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> r3, io.reactivex.ObservableSource<? extends T> r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.wip = r0
                r1.actual = r2
                r1.subject = r3
                r1.source = r4
                io.reactivex.internal.disposables.SequentialDisposable r2 = new io.reactivex.internal.disposables.SequentialDisposable
                r2.<init>()
                r1.arbiter = r2
                r1.retryMode = r5
                r2 = 1
                r1.lazySet(r2)
                return
        }

        void handle(io.reactivex.Notification<java.lang.Object> r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r1, r0)
                if (r0 == 0) goto L4d
                boolean r0 = r3.isOnError()
                if (r0 == 0) goto L1d
                io.reactivex.internal.disposables.SequentialDisposable r0 = r2.arbiter
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r2.actual
                java.lang.Throwable r3 = r3.getError()
                r0.onError(r3)
                return
            L1d:
                boolean r3 = r3.isOnNext()
                if (r3 == 0) goto L43
                java.util.concurrent.atomic.AtomicInteger r3 = r2.wip
                int r3 = r3.getAndIncrement()
                if (r3 != 0) goto L4d
            L2b:
                io.reactivex.internal.disposables.SequentialDisposable r3 = r2.arbiter
                boolean r3 = r3.isDisposed()
                if (r3 == 0) goto L34
                goto L4d
            L34:
                io.reactivex.ObservableSource<? extends T> r3 = r2.source
                r3.subscribe(r2)
                java.util.concurrent.atomic.AtomicInteger r3 = r2.wip
                int r0 = -r1
                int r1 = r3.addAndGet(r0)
                if (r1 != 0) goto L2b
                goto L4d
            L43:
                io.reactivex.internal.disposables.SequentialDisposable r3 = r2.arbiter
                r3.dispose()
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onComplete()
            L4d:
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1b
                boolean r0 = r2.retryMode
                if (r0 == 0) goto L12
                io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> r0 = r2.subject
                r0.onComplete()
                return
            L12:
                io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> r0 = r2.subject
                io.reactivex.Notification r1 = io.reactivex.Notification.createOnComplete()
                r0.onNext(r1)
            L1b:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1b
                boolean r0 = r2.retryMode
                if (r0 == 0) goto L16
                io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> r0 = r2.subject
                io.reactivex.Notification r3 = io.reactivex.Notification.createOnError(r3)
                r0.onNext(r3)
                return
            L16:
                io.reactivex.subjects.Subject<io.reactivex.Notification<java.lang.Object>> r0 = r2.subject
                r0.onError(r3)
            L1b:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.arbiter
                r0.replace(r2)
                return
        }
    }

    public ObservableRedo(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, ? extends io.reactivex.ObservableSource<?>> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.manager = r2
            r0.retryMode = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r8) {
            r7 = this;
            io.reactivex.subjects.BehaviorSubject r0 = io.reactivex.subjects.BehaviorSubject.create()
            io.reactivex.subjects.Subject r0 = r0.toSerialized()
            io.reactivex.internal.operators.observable.ObservableRedo$RedoObserver r1 = new io.reactivex.internal.operators.observable.ObservableRedo$RedoObserver
            io.reactivex.ObservableSource<T> r2 = r7.source
            boolean r3 = r7.retryMode
            r1.<init>(r8, r0, r2, r3)
            io.reactivex.internal.observers.ToNotificationObserver r2 = new io.reactivex.internal.observers.ToNotificationObserver
            io.reactivex.internal.operators.observable.ObservableRedo$1 r3 = new io.reactivex.internal.operators.observable.ObservableRedo$1
            r3.<init>(r7, r1)
            r2.<init>(r3)
            io.reactivex.internal.disposables.ListCompositeDisposable r3 = new io.reactivex.internal.disposables.ListCompositeDisposable
            io.reactivex.internal.disposables.SequentialDisposable r4 = r1.arbiter
            r5 = 2
            io.reactivex.disposables.Disposable[] r5 = new io.reactivex.disposables.Disposable[r5]
            r6 = 0
            r5[r6] = r4
            r4 = 1
            r5[r4] = r2
            r3.<init>(r5)
            r8.onSubscribe(r3)
            io.reactivex.functions.Function<? super io.reactivex.Observable<io.reactivex.Notification<java.lang.Object>>, ? extends io.reactivex.ObservableSource<?>> r3 = r7.manager     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r3.apply(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "The function returned a null ObservableSource"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r3)     // Catch: java.lang.Throwable -> L4b
            io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L4b
            r0.subscribe(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            io.reactivex.Notification r8 = io.reactivex.Notification.createOnNext(r8)
            r1.handle(r8)
            return
        L4b:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r8.onError(r0)
            return
    }
}
