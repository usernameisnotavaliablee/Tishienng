package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.CompletableSource source;

    public CompletableToFlowable(io.reactivex.CompletableSource r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.internal.observers.SubscriberCompletableObserver r0 = new io.reactivex.internal.observers.SubscriberCompletableObserver
            r0.<init>(r2)
            io.reactivex.CompletableSource r2 = r1.source
            r2.subscribe(r0)
            return
    }
}
