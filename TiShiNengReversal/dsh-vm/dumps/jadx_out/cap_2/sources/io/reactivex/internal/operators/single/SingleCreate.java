package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleCreate<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleOnSubscribe<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Emitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.SingleObserver<? super T> actual;

        Emitter(io.reactivex.SingleObserver<? super T> r1) {
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

        @Override // io.reactivex.SingleEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.SingleEmitter
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
                io.reactivex.SingleObserver<? super T> r1 = r2.actual     // Catch: java.lang.Throwable -> L24
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

        @Override // io.reactivex.SingleEmitter
        public void onSuccess(T r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L32
                java.lang.Object r0 = r3.getAndSet(r1)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == r1) goto L32
                if (r4 != 0) goto L21
                io.reactivex.SingleObserver<? super T> r4 = r3.actual     // Catch: java.lang.Throwable -> L1f
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
                r4.onError(r1)     // Catch: java.lang.Throwable -> L1f
                goto L26
            L1f:
                r4 = move-exception
                goto L2c
            L21:
                io.reactivex.SingleObserver<? super T> r1 = r3.actual     // Catch: java.lang.Throwable -> L1f
                r1.onSuccess(r4)     // Catch: java.lang.Throwable -> L1f
            L26:
                if (r0 == 0) goto L32
                r0.dispose()
                return
            L2c:
                if (r0 == 0) goto L31
                r0.dispose()
            L31:
                throw r4
            L32:
                return
        }

        @Override // io.reactivex.SingleEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.SingleEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                return
        }
    }

    public SingleCreate(io.reactivex.SingleOnSubscribe<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.single.SingleCreate$Emitter r0 = new io.reactivex.internal.operators.single.SingleCreate$Emitter
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.SingleOnSubscribe<T> r2 = r1.source     // Catch: java.lang.Throwable -> Le
            r2.subscribe(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r0.onError(r2)
            return
    }
}
