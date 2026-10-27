package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableEmpty extends io.reactivex.Completable {
    public static final io.reactivex.Completable INSTANCE = null;

    static {
            io.reactivex.internal.operators.completable.CompletableEmpty r0 = new io.reactivex.internal.operators.completable.CompletableEmpty
            r0.<init>()
            io.reactivex.internal.operators.completable.CompletableEmpty.INSTANCE = r0
            return
    }

    private CompletableEmpty() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r1) {
            r0 = this;
            io.reactivex.internal.disposables.EmptyDisposable.complete(r1)
            return
    }
}
