package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableJust<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    private final T value;

    public ObservableJust(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable r0 = new io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable
            T r1 = r2.value
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            r0.run()
            return
    }
}
