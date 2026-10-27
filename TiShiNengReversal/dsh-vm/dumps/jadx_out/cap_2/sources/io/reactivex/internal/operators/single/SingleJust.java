package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleJust<T> extends io.reactivex.Single<T> {
    final T value;

    public SingleJust(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
            r2.onSubscribe(r0)
            T r0 = r1.value
            r2.onSuccess(r0)
            return
    }
}
