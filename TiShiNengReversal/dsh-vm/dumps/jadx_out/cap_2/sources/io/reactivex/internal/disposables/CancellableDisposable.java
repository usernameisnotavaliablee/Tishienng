package io.reactivex.internal.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CancellableDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.functions.Cancellable> implements io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(io.reactivex.functions.Cancellable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r0)
            io.reactivex.functions.Cancellable r0 = (io.reactivex.functions.Cancellable) r0
            if (r0 == 0) goto L1a
            r0.cancel()     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L1a:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
