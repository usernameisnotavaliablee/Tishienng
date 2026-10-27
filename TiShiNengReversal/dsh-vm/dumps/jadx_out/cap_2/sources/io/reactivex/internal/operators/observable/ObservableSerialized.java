package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSerialized<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableSerialized(io.reactivex.Observable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.observers.SerializedObserver r1 = new io.reactivex.observers.SerializedObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
