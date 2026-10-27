package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableDelay<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DelayObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        final long delay;
        final boolean delayError;
        io.reactivex.disposables.Disposable s;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker w;




        DelayObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.delay = r2
                r0.unit = r4
                r0.w = r5
                r0.delayError = r6
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.w
                r0.dispose()
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.w
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r5 = this;
                io.reactivex.Scheduler$Worker r0 = r5.w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$3 r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$3
                r1.<init>(r5)
                long r2 = r5.delay
                java.util.concurrent.TimeUnit r4 = r5.unit
                r0.schedule(r1, r2, r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$2 r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$2
                r1.<init>(r4, r5)
                boolean r5 = r4.delayError
                if (r5 == 0) goto Le
                long r2 = r4.delay
                goto L10
            Le:
                r2 = 0
            L10:
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$1 r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$1
                r1.<init>(r4, r5)
                long r2 = r4.delay
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
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
    }

    public ObservableDelay(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            boolean r0 = r8.delayError
            if (r0 == 0) goto L6
            r2 = r9
            goto Lc
        L6:
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r9)
            r2 = r0
        Lc:
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            io.reactivex.ObservableSource<T> r9 = r8.source
            io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver
            long r3 = r8.delay
            java.util.concurrent.TimeUnit r5 = r8.unit
            boolean r7 = r8.delayError
            r1.<init>(r2, r3, r5, r6, r7)
            r9.subscribe(r1)
            return
    }
}
