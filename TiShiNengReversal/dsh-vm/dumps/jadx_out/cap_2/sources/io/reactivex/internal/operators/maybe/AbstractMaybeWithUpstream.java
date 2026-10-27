package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends io.reactivex.Maybe<R> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    protected final io.reactivex.MaybeSource<T> source;

    AbstractMaybeWithUpstream(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }
}
