package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleTimeout<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;



    public SingleTimeout(io.reactivex.SingleSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.SingleSource<? extends T> r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r8) {
            r7 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r8.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            io.reactivex.Scheduler r2 = r7.scheduler
            io.reactivex.internal.operators.single.SingleTimeout$1 r3 = new io.reactivex.internal.operators.single.SingleTimeout$1
            r3.<init>(r7, r1, r0, r8)
            long r4 = r7.timeout
            java.util.concurrent.TimeUnit r6 = r7.unit
            io.reactivex.disposables.Disposable r2 = r2.scheduleDirect(r3, r4, r6)
            r0.add(r2)
            io.reactivex.SingleSource<T> r2 = r7.source
            io.reactivex.internal.operators.single.SingleTimeout$2 r3 = new io.reactivex.internal.operators.single.SingleTimeout$2
            r3.<init>(r7, r1, r0, r8)
            r2.subscribe(r3)
            return
    }
}
