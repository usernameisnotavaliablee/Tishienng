package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingLastObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    public BlockingLastObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            r1.error = r2
            r1.countDown()
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
