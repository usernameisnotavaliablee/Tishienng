package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableIntervalRange extends io.reactivex.Observable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class IntervalRangeObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        final io.reactivex.Observer<? super java.lang.Long> actual;
        long count;
        final long end;

        IntervalRangeObserver(io.reactivex.Observer<? super java.lang.Long> r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.end = r4
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
                boolean r0 = r5.isDisposed()
                if (r0 != 0) goto L25
                long r0 = r5.count
                io.reactivex.Observer<? super java.lang.Long> r2 = r5.actual
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                r2.onNext(r3)
                long r2 = r5.end
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L20
                io.reactivex.internal.disposables.DisposableHelper.dispose(r5)
                io.reactivex.Observer<? super java.lang.Long> r0 = r5.actual
                r0.onComplete()
                return
            L20:
                r2 = 1
                long r0 = r0 + r2
                r5.count = r0
            L25:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableIntervalRange(long r1, long r3, long r5, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r5
            r0.period = r7
            r0.unit = r9
            r0.scheduler = r10
            r0.start = r1
            r0.end = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r8) {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver r0 = new io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver
            long r2 = r7.start
            long r4 = r7.end
            r1 = r8
            r0.<init>(r1, r2, r4)
            r1.onSubscribe(r0)
            r1 = r0
            io.reactivex.Scheduler r0 = r7.scheduler
            long r2 = r7.initialDelay
            long r4 = r7.period
            java.util.concurrent.TimeUnit r6 = r7.unit
            io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
            r0 = r1
            r0.setResource(r8)
            return
    }
}
