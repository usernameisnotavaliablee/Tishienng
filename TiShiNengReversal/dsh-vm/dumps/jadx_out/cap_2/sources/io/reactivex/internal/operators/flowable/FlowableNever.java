package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableNever extends io.reactivex.Flowable<java.lang.Object> {
    public static final io.reactivex.Flowable<java.lang.Object> INSTANCE = null;

    static {
            io.reactivex.internal.operators.flowable.FlowableNever r0 = new io.reactivex.internal.operators.flowable.FlowableNever
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowableNever.INSTANCE = r0
            return
    }

    private FlowableNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Object> r2) {
            r1 = this;
            io.reactivex.internal.subscriptions.EmptySubscription r0 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
            r2.onSubscribe(r0)
            return
    }
}
