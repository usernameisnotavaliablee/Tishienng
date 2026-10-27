package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeUnsafeCreate<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    public MaybeUnsafeCreate(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r2) {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            r0.subscribe(r2)
            return
    }
}
