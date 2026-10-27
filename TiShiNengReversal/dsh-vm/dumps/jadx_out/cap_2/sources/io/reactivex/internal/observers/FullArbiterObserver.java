package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FullArbiterObserver<T> implements io.reactivex.Observer<T> {
    final io.reactivex.internal.disposables.ObserverFullArbiter<T> arbiter;
    io.reactivex.disposables.Disposable s;

    public FullArbiterObserver(io.reactivex.internal.disposables.ObserverFullArbiter<T> r1) {
            r0 = this;
            r0.<init>()
            r0.arbiter = r1
            return
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
            io.reactivex.disposables.Disposable r1 = r2.s
            r0.onComplete(r1)
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
            io.reactivex.disposables.Disposable r1 = r2.s
            r0.onError(r3, r1)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r3) {
            r2 = this;
            io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r2.arbiter
            io.reactivex.disposables.Disposable r1 = r2.s
            r0.onNext(r3, r1)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.s = r2
            io.reactivex.internal.disposables.ObserverFullArbiter<T> r0 = r1.arbiter
            r0.setDisposable(r2)
        Lf:
            return
    }
}
