package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class InnerQueuedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;

    public InnerQueuedSubscriber(io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.prefetch = r2
            int r1 = r2 >> 2
            int r2 = r2 - r1
            r0.limit = r2
            return
    }

    public void cancel() {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
    }

    public boolean isDone() {
            r1 = this;
            boolean r0 = r1.done
            return r0
    }

    public void onComplete() {
            r1 = this;
            io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r0 = r1.parent
            r0.innerComplete(r1)
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r0 = r1.parent
            r0.innerError(r1, r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            int r0 = r1.fusionMode
            if (r0 != 0) goto La
            io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r0 = r1.parent
            r0.innerNext(r1, r2)
            return
        La:
            io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r2 = r1.parent
            r2.drain()
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r4) {
            r3 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
            if (r0 == 0) goto L3b
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
            if (r0 == 0) goto L2e
            r0 = r4
            io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
            r1 = 3
            int r1 = r0.requestFusion(r1)
            r2 = 1
            if (r1 != r2) goto L21
            r3.fusionMode = r1
            r3.queue = r0
            r3.done = r2
            io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> r4 = r3.parent
            r4.innerComplete(r3)
            return
        L21:
            r2 = 2
            if (r1 != r2) goto L2e
            r3.fusionMode = r1
            r3.queue = r0
            int r0 = r3.prefetch
            io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
            return
        L2e:
            int r0 = r3.prefetch
            io.reactivex.internal.fuseable.SimpleQueue r0 = io.reactivex.internal.util.QueueDrainHelper.createQueue(r0)
            r3.queue = r0
            int r0 = r3.prefetch
            io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
        L3b:
            return
    }

    public io.reactivex.internal.fuseable.SimpleQueue<T> queue() {
            r1 = this;
            io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
            return r0
    }

    public void request(long r4) {
            r3 = this;
            int r0 = r3.fusionMode
            r1 = 1
            if (r0 == r1) goto L1f
            long r0 = r3.produced
            long r0 = r0 + r4
            int r4 = r3.limit
            long r4 = (long) r4
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L1d
            r4 = 0
            r3.produced = r4
            java.lang.Object r4 = r3.get()
            org.reactivestreams.Subscription r4 = (org.reactivestreams.Subscription) r4
            r4.request(r0)
            return
        L1d:
            r3.produced = r0
        L1f:
            return
    }

    public void requestOne() {
            r5 = this;
            int r0 = r5.fusionMode
            r1 = 1
            if (r0 == r1) goto L21
            long r0 = r5.produced
            r2 = 1
            long r0 = r0 + r2
            int r2 = r5.limit
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1f
            r2 = 0
            r5.produced = r2
            java.lang.Object r2 = r5.get()
            org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
            r2.request(r0)
            return
        L1f:
            r5.produced = r0
        L21:
            return
    }

    public void setDone() {
            r1 = this;
            r0 = 1
            r1.done = r0
            return
    }
}
