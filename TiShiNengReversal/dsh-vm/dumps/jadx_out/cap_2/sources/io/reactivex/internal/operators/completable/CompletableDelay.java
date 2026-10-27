package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableDelay extends io.reactivex.Completable {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;
    final java.util.concurrent.TimeUnit unit;


    public CompletableDelay(io.reactivex.CompletableSource r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            io.reactivex.CompletableSource r1 = r3.source
            io.reactivex.internal.operators.completable.CompletableDelay$1 r2 = new io.reactivex.internal.operators.completable.CompletableDelay$1
            r2.<init>(r3, r0, r4)
            r1.subscribe(r2)
            return
    }
}
