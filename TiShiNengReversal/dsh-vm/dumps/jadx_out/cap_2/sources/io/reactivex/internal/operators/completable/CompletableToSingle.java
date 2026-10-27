package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableToSingle<T> extends io.reactivex.Single<T> {
    final T completionValue;
    final java.util.concurrent.Callable<? extends T> completionValueSupplier;
    final io.reactivex.CompletableSource source;


    public CompletableToSingle(io.reactivex.CompletableSource r1, java.util.concurrent.Callable<? extends T> r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.completionValue = r3
            r0.completionValueSupplier = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableToSingle$1 r1 = new io.reactivex.internal.operators.completable.CompletableToSingle$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
