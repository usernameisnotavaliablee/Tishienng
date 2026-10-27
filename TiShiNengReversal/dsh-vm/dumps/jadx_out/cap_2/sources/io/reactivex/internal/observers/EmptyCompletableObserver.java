package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class EmptyCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -7545121636549663526L;

    public EmptyCompletableObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }
}
