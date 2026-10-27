package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingFirstSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    public BlockingFirstSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto L7
            r1.error = r2
            goto La
        L7:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        La:
            r1.countDown()
            return
    }

    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 != 0) goto Le
            r1.value = r2
            org.reactivestreams.Subscription r2 = r1.s
            r2.cancel()
            r1.countDown()
        Le:
            return
    }
}
