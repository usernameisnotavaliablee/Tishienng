package io.reactivex.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class FutureDisposable extends io.reactivex.disposables.ReferenceDisposable<java.util.concurrent.Future<?>> {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    FutureDisposable(java.util.concurrent.Future<?> r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.allowInterrupt = r2
            return
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected /* bridge */ /* synthetic */ void onDisposed(java.util.concurrent.Future<?> r1) {
            r0 = this;
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r0.onDisposed2(r1)
            return
    }

    /* renamed from: onDisposed, reason: avoid collision after fix types in other method */
    protected void onDisposed2(java.util.concurrent.Future<?> r2) {
            r1 = this;
            boolean r0 = r1.allowInterrupt
            r2.cancel(r0)
            return
    }
}
