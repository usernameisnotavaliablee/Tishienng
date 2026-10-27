package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingLastSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    public BlockingLastSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            r1.error = r2
            r1.countDown()
            return
    }

    public void onNext(T r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
