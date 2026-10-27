package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleDoOnEvent<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onEvent;
    final io.reactivex.SingleSource<T> source;


    public SingleDoOnEvent(io.reactivex.SingleSource<T> r1, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onEvent = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleDoOnEvent$1 r1 = new io.reactivex.internal.operators.single.SingleDoOnEvent$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
