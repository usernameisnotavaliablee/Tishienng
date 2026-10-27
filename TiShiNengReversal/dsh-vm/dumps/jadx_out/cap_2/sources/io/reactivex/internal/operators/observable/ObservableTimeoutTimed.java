package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    static final io.reactivex.disposables.Disposable NEW_TIMER = null;
    final io.reactivex.ObservableSource<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8387234228317808253L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean done;
        volatile long index;
        io.reactivex.disposables.Disposable s;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;


        TimeoutTimedObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
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
                r1.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
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
                r1.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.Observer<? super T> r2 = r4.actual
                r2.onNext(r5)
                r4.scheduleTimeout(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L14
                r2.s = r3
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
                r0 = 0
                r2.scheduleTimeout(r0)
            L14:
                return
        }

        void scheduleTimeout(long r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto Lb
                r0.dispose()
            Lb:
                io.reactivex.disposables.Disposable r1 = io.reactivex.internal.operators.observable.ObservableTimeoutTimed.NEW_TIMER
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L25
                io.reactivex.Scheduler$Worker r0 = r3.worker
                io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedObserver$1 r1 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedObserver$1
                r1.<init>(r3, r4)
                long r4 = r3.timeout
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r0.schedule(r1, r4, r2)
                io.reactivex.internal.disposables.DisposableHelper.replace(r3, r4)
            L25:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutTimedOtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4619702551964128179L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.ObserverFullArbiter<T> arbiter;
        volatile boolean done;
        volatile long index;
        final io.reactivex.ObservableSource<? extends T> other;
        io.reactivex.disposables.Disposable s;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;


        TimeoutTimedOtherObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, io.reactivex.ObservableSource<? extends T> r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                r0.other = r6
                io.reactivex.internal.disposables.ObserverFullArbiter r2 = new io.reactivex.internal.disposables.ObserverFullArbiter
                r3 = 8
                r2.<init>(r1, r0, r3)
                r0.arbiter = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
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
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                io.reactivex.disposables.Disposable r1 = r2.s
                r0.onComplete(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                io.reactivex.disposables.Disposable r1 = r2.s
                r0.onError(r3, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                goto L19
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r2 = r4.arbiter
                io.reactivex.disposables.Disposable r3 = r4.s
                boolean r5 = r2.onNext(r5, r3)
                if (r5 == 0) goto L19
                r4.scheduleTimeout(r0)
            L19:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L1e
                r2.s = r3
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                boolean r3 = r0.setDisposable(r3)
                if (r3 == 0) goto L1e
                io.reactivex.Observer<? super T> r3 = r2.actual
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
                r3.onSubscribe(r0)
                r0 = 0
                r2.scheduleTimeout(r0)
            L1e:
                return
        }

        void scheduleTimeout(long r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto Lb
                r0.dispose()
            Lb:
                io.reactivex.disposables.Disposable r1 = io.reactivex.internal.operators.observable.ObservableTimeoutTimed.NEW_TIMER
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L25
                io.reactivex.Scheduler$Worker r0 = r3.worker
                io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedOtherObserver$1 r1 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedOtherObserver$1
                r1.<init>(r3, r4)
                long r4 = r3.timeout
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r0.schedule(r1, r4, r2)
                io.reactivex.internal.disposables.DisposableHelper.replace(r3, r4)
            L25:
                return
        }

        void subscribeNext() {
                r3 = this;
                io.reactivex.ObservableSource<? extends T> r0 = r3.other
                io.reactivex.internal.observers.FullArbiterObserver r1 = new io.reactivex.internal.observers.FullArbiterObserver
                io.reactivex.internal.disposables.ObserverFullArbiter<T> r2 = r3.arbiter
                r1.<init>(r2)
                r0.subscribe(r1)
                return
        }
    }

    static {
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed$1 r0 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$1
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed.NEW_TIMER = r0
            return
    }

    public ObservableTimeoutTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.ObservableSource<? extends T> r6) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            io.reactivex.ObservableSource<? extends T> r0 = r8.other
            if (r0 != 0) goto L1e
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r9)
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r1)
            return
        L1e:
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedOtherObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedOtherObserver
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r2 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r2.createWorker()
            io.reactivex.ObservableSource<? extends T> r7 = r8.other
            r2 = r9
            r1.<init>(r2, r3, r5, r6, r7)
            r0.subscribe(r1)
            return
    }
}
