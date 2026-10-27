package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleDefer<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> singleSupplier;

    public SingleDefer(java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> r1) {
            r0 = this;
            r0.<init>()
            r0.singleSupplier = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> r0 = r2.singleSupplier     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "The singleSupplier returned a null SingleSource"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
            io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0     // Catch: java.lang.Throwable -> L12
            r0.subscribe(r3)
            return
        L12:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
