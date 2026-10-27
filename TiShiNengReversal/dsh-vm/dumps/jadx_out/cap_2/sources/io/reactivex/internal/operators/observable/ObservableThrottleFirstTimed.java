package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableThrottleFirstTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DebounceTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        final io.reactivex.Observer<? super T> actual;
        boolean done;
        volatile boolean gate;
        io.reactivex.disposables.Disposable s;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5) {
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
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
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
                if (r0 != 0) goto L14
                r0 = 1
                r1.done = r0
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L14:
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
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.gate
                if (r0 != 0) goto L28
                boolean r0 = r3.done
                if (r0 != 0) goto L28
                r0 = 1
                r3.gate = r0
                io.reactivex.Observer<? super T> r0 = r3.actual
                r0.onNext(r4)
                java.lang.Object r4 = r3.get()
                io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4
                if (r4 == 0) goto L1b
                r4.dispose()
            L1b:
                io.reactivex.Scheduler$Worker r4 = r3.worker
                long r0 = r3.timeout
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r4.schedule(r3, r0, r2)
                io.reactivex.internal.disposables.DisposableHelper.replace(r3, r4)
            L28:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.gate = r0
                return
        }
    }

    public ObservableThrottleFirstTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r8) {
            r7 = this;
            io.reactivex.ObservableSource<T> r0 = r7.source
            io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed$DebounceTimedObserver r1 = new io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed$DebounceTimedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r8)
            long r3 = r7.timeout
            java.util.concurrent.TimeUnit r5 = r7.unit
            io.reactivex.Scheduler r8 = r7.scheduler
            io.reactivex.Scheduler$Worker r6 = r8.createWorker()
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r1)
            return
    }
}
