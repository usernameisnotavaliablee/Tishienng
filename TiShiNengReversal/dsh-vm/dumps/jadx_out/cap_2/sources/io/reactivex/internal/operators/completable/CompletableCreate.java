package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableCreate extends io.reactivex.Completable {
    final io.reactivex.CompletableOnSubscribe source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Emitter extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.CompletableObserver actual;

        Emitter(io.reactivex.CompletableObserver r1) {
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

        @Override // io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.CompletableEmitter
        public void onComplete() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L22
                java.lang.Object r0 = r2.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L22
                io.reactivex.CompletableObserver r1 = r2.actual     // Catch: java.lang.Throwable -> L1b
                r1.onComplete()     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L22
                r0.dispose()
                return
            L1b:
                r1 = move-exception
                if (r0 == 0) goto L21
                r0.dispose()
            L21:
                throw r1
            L22:
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                if (r3 != 0) goto L9
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
            L9:
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L2b
                java.lang.Object r0 = r2.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L2b
                io.reactivex.CompletableObserver r1 = r2.actual     // Catch: java.lang.Throwable -> L24
                r1.onError(r3)     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L23
                r0.dispose()
            L23:
                return
            L24:
                r3 = move-exception
                if (r0 == 0) goto L2a
                r0.dispose()
            L2a:
                throw r3
            L2b:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.CompletableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                return
        }
    }

    public CompletableCreate(io.reactivex.CompletableOnSubscribe r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableCreate$Emitter r0 = new io.reactivex.internal.operators.completable.CompletableCreate$Emitter
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.CompletableOnSubscribe r2 = r1.source     // Catch: java.lang.Throwable -> Le
            r2.subscribe(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r0.onError(r2)
            return
    }
}
