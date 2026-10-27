package io.reactivex.internal.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FutureSubscriber<T> extends java.util.concurrent.CountDownLatch implements org.reactivestreams.Subscriber<T>, java.util.concurrent.Future<T>, org.reactivestreams.Subscription {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;
    T value;

    public FutureSubscriber() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            return
    }

    public void cancel() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.s
            java.lang.Object r3 = r3.get()
            org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
            if (r3 == r2) goto L21
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r3 != r0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r3, r0)
            if (r0 == 0) goto L0
            if (r3 == 0) goto L1c
            r3.cancel()
        L1c:
            r2.countDown()
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r5.await()
        Ld:
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L20
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L1a
            T r0 = r5.value
            return r0
        L1a:
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
            r1.<init>(r0)
            throw r1
        L20:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public T get(long r6, java.util.concurrent.TimeUnit r8) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            boolean r6 = r5.await(r6, r8)
            if (r6 == 0) goto L11
            goto L17
        L11:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException
            r6.<init>()
            throw r6
        L17:
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L2a
            java.lang.Throwable r6 = r5.error
            if (r6 != 0) goto L24
            T r6 = r5.value
            return r6
        L24:
            java.util.concurrent.ExecutionException r7 = new java.util.concurrent.ExecutionException
            r7.<init>(r6)
            throw r7
        L2a:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            r6.<init>()
            throw r6
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r2 = this;
            T r0 = r2.value
            if (r0 != 0) goto Lf
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The source is empty"
            r0.<init>(r1)
            r2.onError(r0)
            return
        Lf:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            if (r0 == r2) goto L29
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto L1e
            goto L29
        L1e:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 == 0) goto Lf
            r2.countDown()
        L29:
            return
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            if (r0 == r2) goto L1d
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto Lf
            goto L1d
        Lf:
            r2.error = r3
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 == 0) goto L0
            r2.countDown()
            return
        L1d:
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.s
            java.lang.Object r2 = r2.get()
            org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
            r2.cancel()
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "More than one element received"
            r2.<init>(r0)
            r1.onError(r2)
            return
        L1a:
            r1.value = r2
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r3)
            if (r0 == 0) goto L10
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
        L10:
            return
    }

    public void request(long r1) {
            r0 = this;
            return
    }
}
