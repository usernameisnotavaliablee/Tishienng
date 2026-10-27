package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableBlockingSubscribe {
    private FlowableBlockingSubscribe() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r4) {
            io.reactivex.internal.util.BlockingIgnoringReceiver r0 = new io.reactivex.internal.util.BlockingIgnoringReceiver
            r0.<init>()
            io.reactivex.internal.subscribers.LambdaSubscriber r1 = new io.reactivex.internal.subscribers.LambdaSubscriber
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<org.reactivestreams.Subscription> r3 = io.reactivex.internal.functions.Functions.REQUEST_MAX
            r1.<init>(r2, r0, r0, r3)
            r4.subscribe(r1)
            io.reactivex.internal.util.BlockingHelper.awaitForComplete(r0, r1)
            java.lang.Throwable r4 = r0.error
            if (r4 != 0) goto L1b
            return
        L1b:
            java.lang.RuntimeException r4 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r4)
            throw r4
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4, io.reactivex.functions.Action r5) {
            io.reactivex.internal.subscribers.LambdaSubscriber r0 = new io.reactivex.internal.subscribers.LambdaSubscriber
            io.reactivex.functions.Consumer<org.reactivestreams.Subscription> r1 = io.reactivex.internal.functions.Functions.REQUEST_MAX
            r0.<init>(r3, r4, r5, r1)
            subscribe(r2, r0)
            return
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Subscriber<? super T> r5) {
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            io.reactivex.internal.subscribers.BlockingSubscriber r1 = new io.reactivex.internal.subscribers.BlockingSubscriber
            r1.<init>(r0)
            r4.subscribe(r1)
        Ld:
            boolean r2 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L26
            if (r2 == 0) goto L14
            goto L39
        L14:
            java.lang.Object r2 = r0.poll()     // Catch: java.lang.InterruptedException -> L26
            if (r2 != 0) goto L28
            boolean r2 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L26
            if (r2 == 0) goto L21
            goto L39
        L21:
            java.lang.Object r2 = r0.take()     // Catch: java.lang.InterruptedException -> L26
            goto L28
        L26:
            r4 = move-exception
            goto L3a
        L28:
            boolean r3 = r1.isCancelled()     // Catch: java.lang.InterruptedException -> L26
            if (r3 == 0) goto L2f
            goto L39
        L2f:
            java.lang.Object r3 = io.reactivex.internal.subscribers.BlockingSubscriber.TERMINATED     // Catch: java.lang.InterruptedException -> L26
            if (r4 == r3) goto L39
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r5)     // Catch: java.lang.InterruptedException -> L26
            if (r2 == 0) goto Ld
        L39:
            return
        L3a:
            r1.cancel()
            r5.onError(r4)
            return
    }
}
