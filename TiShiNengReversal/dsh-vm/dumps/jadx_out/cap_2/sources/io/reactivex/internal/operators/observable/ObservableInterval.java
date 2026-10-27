package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableInterval extends io.reactivex.Observable<java.lang.Long> {
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class IntervalObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        final io.reactivex.Observer<? super java.lang.Long> actual;
        long count;

        IntervalObserver(io.reactivex.Observer<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.Object r0 = r5.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L18
                io.reactivex.Observer<? super java.lang.Long> r0 = r5.actual
                long r1 = r5.count
                r3 = 1
                long r3 = r3 + r1
                r5.count = r3
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onNext(r1)
            L18:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableInterval(long r1, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r1
            r0.period = r3
            r0.unit = r5
            r0.scheduler = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r8) {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver r1 = new io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver
            r1.<init>(r8)
            r8.onSubscribe(r1)
            io.reactivex.Scheduler r0 = r7.scheduler
            long r2 = r7.initialDelay
            long r4 = r7.period
            java.util.concurrent.TimeUnit r6 = r7.unit
            io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
            r1.setResource(r8)
            return
    }
}
