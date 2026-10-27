package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeNever extends io.reactivex.Maybe<java.lang.Object> {
    public static final io.reactivex.internal.operators.maybe.MaybeNever INSTANCE = null;

    static {
            io.reactivex.internal.operators.maybe.MaybeNever r0 = new io.reactivex.internal.operators.maybe.MaybeNever
            r0.<init>()
            io.reactivex.internal.operators.maybe.MaybeNever.INSTANCE = r0
            return
    }

    public MaybeNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Object> r2) {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.NEVER
            r2.onSubscribe(r0)
            return
    }
}
