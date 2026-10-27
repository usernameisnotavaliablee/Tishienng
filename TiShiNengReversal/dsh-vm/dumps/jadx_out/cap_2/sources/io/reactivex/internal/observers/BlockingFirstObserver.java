package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingFirstObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    public BlockingFirstObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto L6
            r1.error = r2
        L6:
            r1.countDown()
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto Le
            r1.value = r2
            io.reactivex.disposables.Disposable r2 = r1.d
            r2.dispose()
            r1.countDown()
        Le:
            return
    }
}
