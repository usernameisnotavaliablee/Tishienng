package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleContains<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> comparer;
    final io.reactivex.SingleSource<T> source;
    final java.lang.Object value;


    public SingleContains(io.reactivex.SingleSource<T> r1, java.lang.Object r2, io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.value = r2
            r0.comparer = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleContains$1 r1 = new io.reactivex.internal.operators.single.SingleContains$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
