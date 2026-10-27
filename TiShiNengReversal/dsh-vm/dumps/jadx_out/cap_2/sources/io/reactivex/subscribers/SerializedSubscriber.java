package io.reactivex.subscribers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SerializedSubscriber<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
    static final int QUEUE_LINK_SIZE = 4;
    final org.reactivestreams.Subscriber<? super T> actual;
    final boolean delayError;
    volatile boolean done;
    boolean emitting;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
    org.reactivestreams.Subscription subscription;

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.delayError = r2
            return
    }

    public void cancel() {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.subscription
            r0.cancel()
            return
    }

    void emitLoop() {
            r2 = this;
        L0:
            monitor-enter(r2)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            r0 = 0
            r2.emitting = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            goto L19
        Lc:
            r1 = 0
            r2.queue = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            org.reactivestreams.Subscriber<? super T> r1 = r2.actual
            boolean r0 = r0.accept(r1)
            if (r0 == 0) goto L0
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public void onComplete() {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto L33
        Le:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L27
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1e
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> Lc
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            r2.queue = r0     // Catch: java.lang.Throwable -> Lc
        L1e:
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()     // Catch: java.lang.Throwable -> Lc
            r0.add(r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        L27:
            r0 = 1
            r2.done = r0     // Catch: java.lang.Throwable -> Lc
            r2.emitting = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            r0.onComplete()
            return
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L8:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto Lf
            goto L3a
        Lf:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L35
            r2.done = r1     // Catch: java.lang.Throwable -> L22
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L22
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r2.queue = r0     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L47
        L24:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch: java.lang.Throwable -> L22
            boolean r1 = r2.delayError     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L30
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
            goto L33
        L30:
            r0.setFirst(r3)     // Catch: java.lang.Throwable -> L22
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return
        L35:
            r2.done = r1     // Catch: java.lang.Throwable -> L22
            r2.emitting = r1     // Catch: java.lang.Throwable -> L22
            r1 = 0
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L41
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L41:
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            r0.onError(r3)
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    public void onNext(T r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 != 0) goto L17
            org.reactivestreams.Subscription r3 = r2.subscription
            r3.cancel()
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r3.<init>(r0)
            r2.onError(r3)
            return
        L17:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            goto L46
        L20:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L39
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L30
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L1e
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r2.queue = r0     // Catch: java.lang.Throwable -> L1e
        L30:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)     // Catch: java.lang.Throwable -> L1e
            r0.add(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L39:
            r0 = 1
            r2.emitting = r0     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            org.reactivestreams.Subscriber<? super T> r0 = r2.actual
            r0.onNext(r3)
            r2.emitLoop()
            return
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.subscription
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.subscription = r2
            org.reactivestreams.Subscriber<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        Lf:
            return
    }

    public void request(long r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.subscription
            r0.request(r2)
            return
    }
}
