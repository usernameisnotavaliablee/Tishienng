package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSerialized<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableSerialized(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.subscribers.SerializedSubscriber r1 = new io.reactivex.subscribers.SerializedSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
