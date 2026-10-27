package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableFromCallable extends io.reactivex.Completable {
    final java.util.concurrent.Callable<?> callable;

    public CompletableFromCallable(java.util.concurrent.Callable<?> r1) {
            r0 = this;
            r0.<init>()
            r0.callable = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r3.onSubscribe(r0)
            java.util.concurrent.Callable<?> r1 = r2.callable     // Catch: java.lang.Throwable -> L16
            r1.call()     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L23
            r3.onComplete()
            return
        L16:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L23
            r3.onError(r1)
        L23:
            return
    }
}
