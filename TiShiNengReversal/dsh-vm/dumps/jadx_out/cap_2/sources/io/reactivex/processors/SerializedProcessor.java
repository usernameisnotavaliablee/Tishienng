package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class SerializedProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final io.reactivex.processors.FlowableProcessor<T> actual;
    volatile boolean done;
    boolean emitting;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;

    SerializedProcessor(io.reactivex.processors.FlowableProcessor<T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
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
            goto L16
        Lc:
            r1 = 0
            r2.queue = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            io.reactivex.processors.FlowableProcessor<T> r1 = r2.actual
            r0.accept(r1)
            goto L0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r1 = this;
            io.reactivex.processors.FlowableProcessor<T> r0 = r1.actual
            java.lang.Throwable r0 = r0.getThrowable()
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            io.reactivex.processors.FlowableProcessor<T> r0 = r1.actual
            boolean r0 = r0.hasComplete()
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            io.reactivex.processors.FlowableProcessor<T> r0 = r1.actual
            boolean r0 = r0.hasSubscribers()
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r1 = this;
            io.reactivex.processors.FlowableProcessor<T> r0 = r1.actual
            boolean r0 = r0.hasThrowable()
            return r0
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
            r0 = 1
            r2.done = r0     // Catch: java.lang.Throwable -> Lc
            boolean r1 = r2.emitting     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L2a
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L21
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> Lc
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            r2.queue = r0     // Catch: java.lang.Throwable -> Lc
        L21:
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()     // Catch: java.lang.Throwable -> Lc
            r0.add(r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        L2a:
            r2.emitting = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            io.reactivex.processors.FlowableProcessor<T> r0 = r2.actual
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
            goto L30
        Lf:
            r2.done = r1     // Catch: java.lang.Throwable -> L22
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L2d
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L22
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r2.queue = r0     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L3d
        L24:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch: java.lang.Throwable -> L22
            r0.setFirst(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return
        L2d:
            r2.emitting = r1     // Catch: java.lang.Throwable -> L22
            r1 = 0
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L37
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L37:
            io.reactivex.processors.FlowableProcessor<T> r0 = r2.actual
            r0.onError(r3)
            return
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    public void onNext(T r3) {
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
            r3 = move-exception
            goto L34
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
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)     // Catch: java.lang.Throwable -> Lc
            r0.add(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        L27:
            r0 = 1
            r2.emitting = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            io.reactivex.processors.FlowableProcessor<T> r0 = r2.actual
            r0.onNext(r3)
            r2.emitLoop()
            return
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.done
            r1 = 1
            if (r0 != 0) goto L2e
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Lb
            goto L2a
        Lb:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L27
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L1c
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r2.queue = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L2c
        L1e:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.subscription(r3)     // Catch: java.lang.Throwable -> L1c
            r0.add(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L27:
            r2.emitting = r1     // Catch: java.lang.Throwable -> L1c
            r1 = 0
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L2e
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L2e:
            if (r1 == 0) goto L34
            r3.cancel()
            return
        L34:
            io.reactivex.processors.FlowableProcessor<T> r0 = r2.actual
            r0.onSubscribe(r3)
            r2.emitLoop()
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.processors.FlowableProcessor<T> r0 = r1.actual
            r0.subscribe(r2)
            return
    }
}
