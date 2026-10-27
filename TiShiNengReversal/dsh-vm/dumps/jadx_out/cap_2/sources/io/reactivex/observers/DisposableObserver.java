package io.reactivex.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class DisposableObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;

    public DisposableObserver() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.s
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
            if (r2 == 0) goto Lb
            r1.onStart()
        Lb:
            return
    }
}
