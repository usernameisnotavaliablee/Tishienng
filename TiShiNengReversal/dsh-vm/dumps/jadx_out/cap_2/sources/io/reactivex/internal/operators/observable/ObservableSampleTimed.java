package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSampleTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SampleTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Observer<? super T> actual;
        final long period;
        io.reactivex.disposables.Disposable s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final java.util.concurrent.TimeUnit unit;

        SampleTimedObserver(io.reactivex.Observer<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.period = r3
                r1.unit = r5
                r1.scheduler = r6
                return
        }

        void cancelTimer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r1.cancelTimer()
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r1.cancelTimer()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancelTimer()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L21
                r7.s = r8
                io.reactivex.Observer<? super T> r8 = r7.actual
                r8.onSubscribe(r7)
                io.reactivex.Scheduler r0 = r7.scheduler
                long r2 = r7.period
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r8)
                return
            L21:
                r1 = r7
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                r0 = 0
                java.lang.Object r0 = r2.getAndSet(r0)
                if (r0 == 0) goto Lc
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            Lc:
                return
        }
    }

    public ObservableSampleTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.period = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r7) {
            r6 = this;
            io.reactivex.observers.SerializedObserver r1 = new io.reactivex.observers.SerializedObserver
            r1.<init>(r7)
            io.reactivex.ObservableSource<T> r7 = r6.source
            io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver r0 = new io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver
            long r2 = r6.period
            java.util.concurrent.TimeUnit r4 = r6.unit
            io.reactivex.Scheduler r5 = r6.scheduler
            r0.<init>(r1, r2, r4, r5)
            r7.subscribe(r0)
            return
    }
}
