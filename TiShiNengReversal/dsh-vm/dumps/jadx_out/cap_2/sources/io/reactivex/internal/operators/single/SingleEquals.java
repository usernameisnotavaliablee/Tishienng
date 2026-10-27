package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleEquals<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.SingleSource<? extends T> first;
    final io.reactivex.SingleSource<? extends T> second;


    public SingleEquals(io.reactivex.SingleSource<? extends T> r1, io.reactivex.SingleSource<? extends T> r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r9) {
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r1 = 0
            r4[r0] = r1
            r0 = 1
            r4[r0] = r1
            io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
            r3.<init>()
            r9.onSubscribe(r3)
            io.reactivex.SingleSource<? extends T> r7 = r8.first
            io.reactivex.internal.operators.single.SingleEquals$1InnerObserver r0 = new io.reactivex.internal.operators.single.SingleEquals$1InnerObserver
            r2 = 0
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.subscribe(r0)
            io.reactivex.SingleSource<? extends T> r9 = r1.second
            io.reactivex.internal.operators.single.SingleEquals$1InnerObserver r0 = new io.reactivex.internal.operators.single.SingleEquals$1InnerObserver
            r2 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.subscribe(r0)
            return
    }
}
