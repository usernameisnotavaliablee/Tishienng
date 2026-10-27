package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ResumeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
    final io.reactivex.SingleObserver<? super T> actual;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

    public ResumeSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.SingleObserver<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.actual = r2
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.SingleObserver<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.parent
            io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r2) {
            r1 = this;
            io.reactivex.SingleObserver<? super T> r0 = r1.actual
            r0.onSuccess(r2)
            return
    }
}
