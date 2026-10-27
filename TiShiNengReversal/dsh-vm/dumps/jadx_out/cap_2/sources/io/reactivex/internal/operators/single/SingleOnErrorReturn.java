package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleOnErrorReturn<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> source;
    final T value;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;


    public SingleOnErrorReturn(io.reactivex.SingleSource<? extends T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.valueSupplier = r2
            r0.value = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<? extends T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleOnErrorReturn$1 r1 = new io.reactivex.internal.operators.single.SingleOnErrorReturn$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
