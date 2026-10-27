package io.reactivex.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DefaultObserver<T> implements io.reactivex.Observer<T> {
    private io.reactivex.disposables.Disposable s;

    public DefaultObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void cancel() {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.s
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r2.s = r1
            r0.dispose()
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Ld
            r1.s = r2
            r1.onStart()
        Ld:
            return
    }
}
