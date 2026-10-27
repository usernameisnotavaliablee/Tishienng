package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableEmpty extends io.reactivex.Flowable<java.lang.Object> implements io.reactivex.internal.fuseable.ScalarCallable<java.lang.Object> {
    public static final io.reactivex.Flowable<java.lang.Object> INSTANCE = null;

    static {
            io.reactivex.internal.operators.flowable.FlowableEmpty r0 = new io.reactivex.internal.operators.flowable.FlowableEmpty
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowableEmpty.INSTANCE = r0
            return
    }

    private FlowableEmpty() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public java.lang.Object call() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Object> r1) {
            r0 = this;
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r1)
            return
    }
}
