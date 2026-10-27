package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableDoOnEvent extends io.reactivex.Completable {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onEvent;
    final io.reactivex.CompletableSource source;


    public CompletableDoOnEvent(io.reactivex.CompletableSource r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onEvent = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableDoOnEvent$1 r1 = new io.reactivex.internal.operators.completable.CompletableDoOnEvent$1
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
