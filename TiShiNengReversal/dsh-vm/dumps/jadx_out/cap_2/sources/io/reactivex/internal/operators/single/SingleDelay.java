package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleDelay<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<? extends T> source;
    final long time;
    final java.util.concurrent.TimeUnit unit;


    public SingleDelay(io.reactivex.SingleSource<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.time = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r4.onSubscribe(r0)
            io.reactivex.SingleSource<? extends T> r1 = r3.source
            io.reactivex.internal.operators.single.SingleDelay$1 r2 = new io.reactivex.internal.operators.single.SingleDelay$1
            r2.<init>(r3, r0, r4)
            r1.subscribe(r2)
            return
    }
}
