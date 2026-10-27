package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends io.reactivex.Flowable<R> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    protected final org.reactivestreams.Publisher<T> source;

    AbstractFlowableWithUpstream(org.reactivestreams.Publisher<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "source is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            org.reactivestreams.Publisher r2 = (org.reactivestreams.Publisher) r2
            r1.source = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final org.reactivestreams.Publisher<T> source() {
            r1 = this;
            org.reactivestreams.Publisher<T> r0 = r1.source
            return r0
    }
}
