package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<? extends T> main;
    final io.reactivex.ObservableSource<U> other;


    public ObservableDelaySubscriptionOther(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<U> r2) {
            r0 = this;
            r0.<init>()
            r0.main = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r3.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$1 r1 = new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$1
            r1.<init>(r2, r0, r3)
            io.reactivex.ObservableSource<U> r3 = r2.other
            r3.subscribe(r1)
            return
    }
}
