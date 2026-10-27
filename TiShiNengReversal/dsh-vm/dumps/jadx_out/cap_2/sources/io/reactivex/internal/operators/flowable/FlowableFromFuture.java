package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableFromFuture<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public FlowableFromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            r0.timeout = r2
            r0.unit = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.internal.subscriptions.DeferredScalarSubscription r0 = new io.reactivex.internal.subscriptions.DeferredScalarSubscription
            r0.<init>(r6)
            r6.onSubscribe(r0)
            java.util.concurrent.TimeUnit r1 = r5.unit     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.util.concurrent.Future<? extends T> r2 = r5.future     // Catch: java.lang.Throwable -> L15
            long r3 = r5.timeout     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r2.get(r3, r1)     // Catch: java.lang.Throwable -> L15
            goto L1d
        L15:
            r1 = move-exception
            goto L2e
        L17:
            java.util.concurrent.Future<? extends T> r1 = r5.future     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L15
        L1d:
            if (r1 != 0) goto L2a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "The future returned null"
            r0.<init>(r1)
            r6.onError(r0)
            return
        L2a:
            r0.complete(r1)
            return
        L2e:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L3a
            r6.onError(r1)
        L3a:
            return
    }
}
