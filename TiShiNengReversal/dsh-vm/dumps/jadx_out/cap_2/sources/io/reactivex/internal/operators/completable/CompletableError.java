package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableError extends io.reactivex.Completable {
    final java.lang.Throwable error;

    public CompletableError(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.error = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r2)
            return
    }
}
