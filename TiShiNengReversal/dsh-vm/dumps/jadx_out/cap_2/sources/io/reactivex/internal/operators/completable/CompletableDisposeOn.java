package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableDisposeOn extends io.reactivex.Completable {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CompletableObserverImplementation implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        io.reactivex.disposables.Disposable d;
        volatile boolean disposed;
        final io.reactivex.CompletableObserver s;
        final io.reactivex.Scheduler scheduler;

        CompletableObserverImplementation(io.reactivex.CompletableObserver r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.s = r1
                r0.scheduler = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.Scheduler r0 = r1.scheduler
                r0.scheduleDirect(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.CompletableObserver r0 = r1.s
                r0.onComplete()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.disposed
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.CompletableObserver r0 = r1.s
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.CompletableObserver r2 = r1.s
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.d = r0
                return
        }
    }

    public CompletableDisposeOn(io.reactivex.CompletableSource r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.CompletableSource r0 = r3.source
            io.reactivex.internal.operators.completable.CompletableDisposeOn$CompletableObserverImplementation r1 = new io.reactivex.internal.operators.completable.CompletableDisposeOn$CompletableObserverImplementation
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
