package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleFromCallable<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends T> callable;

    public SingleFromCallable(java.util.concurrent.Callable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.callable = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r3.onSubscribe(r0)
            java.util.concurrent.Callable<? extends T> r0 = r2.callable     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r3.onSuccess(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            goto L1e
        L13:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "The callable returned a null value"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            r3.onError(r0)     // Catch: java.lang.Throwable -> L11
            return
        L1e:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r3.onError(r0)
            return
    }
}
