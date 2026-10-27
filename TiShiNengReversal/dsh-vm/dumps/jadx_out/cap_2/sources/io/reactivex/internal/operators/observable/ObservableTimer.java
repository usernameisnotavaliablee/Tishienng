package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableTimer extends io.reactivex.Observable<java.lang.Long> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class IntervalOnceObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final io.reactivex.Observer<? super java.lang.Long> actual;

        IntervalOnceObserver(io.reactivex.Observer<? super java.lang.Long> r1) {
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
                r3 = this;
                boolean r0 = r3.isDisposed()
                if (r0 != 0) goto L1b
                io.reactivex.Observer<? super java.lang.Long> r0 = r3.actual
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onNext(r1)
                io.reactivex.Observer<? super java.lang.Long> r0 = r3.actual
                r0.onComplete()
                io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                r3.lazySet(r0)
            L1b:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableTimer(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            r0.<init>()
            r0.delay = r1
            r0.unit = r3
            r0.scheduler = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r5) {
            r4 = this;
            io.reactivex.internal.operators.observable.ObservableTimer$IntervalOnceObserver r0 = new io.reactivex.internal.operators.observable.ObservableTimer$IntervalOnceObserver
            r0.<init>(r5)
            r5.onSubscribe(r0)
            io.reactivex.Scheduler r5 = r4.scheduler
            long r1 = r4.delay
            java.util.concurrent.TimeUnit r3 = r4.unit
            io.reactivex.disposables.Disposable r5 = r5.scheduleDirect(r0, r1, r3)
            r0.setResource(r5)
            return
    }
}
