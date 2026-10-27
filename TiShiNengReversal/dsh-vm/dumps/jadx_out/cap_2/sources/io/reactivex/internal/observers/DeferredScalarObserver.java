package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DeferredScalarObserver<T, R> extends io.reactivex.internal.observers.DeferredScalarDisposable<R> implements io.reactivex.Observer<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected io.reactivex.disposables.Disposable s;

    public DeferredScalarObserver(io.reactivex.Observer<? super R> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            super.dispose()
            io.reactivex.disposables.Disposable r0 = r1.s
            r0.dispose()
            return
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            T r0 = r2.value
            if (r0 == 0) goto Lb
            r1 = 0
            r2.value = r1
            r2.complete(r0)
            return
        Lb:
            r2.complete()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            r1.error(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.s = r2
            io.reactivex.Observer<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        Lf:
            return
    }
}
