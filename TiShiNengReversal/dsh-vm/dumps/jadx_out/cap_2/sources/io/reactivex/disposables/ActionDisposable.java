package io.reactivex.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class ActionDisposable extends io.reactivex.disposables.ReferenceDisposable<io.reactivex.functions.Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(io.reactivex.functions.Action r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: onDisposed, reason: avoid collision after fix types in other method */
    protected void onDisposed2(io.reactivex.functions.Action r1) {
            r0 = this;
            r1.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)
            throw r1
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected /* bridge */ /* synthetic */ void onDisposed(io.reactivex.functions.Action r1) {
            r0 = this;
            io.reactivex.functions.Action r1 = (io.reactivex.functions.Action) r1
            r0.onDisposed2(r1)
            return
    }
}
