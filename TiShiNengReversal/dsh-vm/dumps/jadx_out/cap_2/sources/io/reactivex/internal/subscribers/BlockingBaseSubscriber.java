package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BlockingBaseSubscriber<T> extends java.util.concurrent.CountDownLatch implements org.reactivestreams.Subscriber<T> {
    volatile boolean cancelled;
    java.lang.Throwable error;
    org.reactivestreams.Subscription s;
    T value;

    public BlockingBaseSubscriber() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public final T blockingGet() {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1f
            r5.await()     // Catch: java.lang.InterruptedException -> Le
            goto L1f
        Le:
            r0 = move-exception
            org.reactivestreams.Subscription r1 = r5.s
            io.reactivex.internal.subscriptions.SubscriptionHelper r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r5.s = r2
            if (r1 == 0) goto L1a
            r1.cancel()
        L1a:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
        L1f:
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L26
            T r0 = r5.value
            return r0
        L26:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    public final void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    public final void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            org.reactivestreams.Subscription r0 = r2.s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
            if (r0 == 0) goto L21
            r2.s = r3
            boolean r0 = r2.cancelled
            if (r0 != 0) goto L21
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            boolean r0 = r2.cancelled
            if (r0 == 0) goto L21
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r2.s = r0
            r3.cancel()
        L21:
            return
    }
}
