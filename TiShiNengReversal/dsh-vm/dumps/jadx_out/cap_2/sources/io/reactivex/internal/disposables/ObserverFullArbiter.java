package io.reactivex.internal.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObserverFullArbiter<T> extends io.reactivex.internal.disposables.FullArbiterPad1 implements io.reactivex.disposables.Disposable {
    final io.reactivex.Observer<? super T> actual;
    volatile boolean cancelled;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
    io.reactivex.disposables.Disposable resource;
    volatile io.reactivex.disposables.Disposable s;

    public ObserverFullArbiter(io.reactivex.Observer<? super T> r1, io.reactivex.disposables.Disposable r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.resource = r2
            io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            r1.<init>(r3)
            r0.queue = r1
            io.reactivex.internal.disposables.EmptyDisposable r1 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r0.s = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 != 0) goto La
            r0 = 1
            r1.cancelled = r0
            r1.disposeResource()
        La:
            return
    }

    void disposeResource() {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.resource
            r1 = 0
            r2.resource = r1
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    void drain() {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            goto L1e
        L9:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r7.queue
            io.reactivex.Observer<? super T> r1 = r7.actual
            r2 = 1
            r3 = 1
        Lf:
            java.lang.Object r4 = r0.poll()
            if (r4 != 0) goto L1f
            java.util.concurrent.atomic.AtomicInteger r4 = r7.wip
            int r3 = -r3
            int r3 = r4.addAndGet(r3)
            if (r3 != 0) goto Lf
        L1e:
            return
        L1f:
            java.lang.Object r5 = r0.poll()
            io.reactivex.disposables.Disposable r6 = r7.s
            if (r4 != r6) goto Lf
            boolean r4 = io.reactivex.internal.util.NotificationLite.isDisposable(r5)
            if (r4 == 0) goto L41
            io.reactivex.disposables.Disposable r4 = io.reactivex.internal.util.NotificationLite.getDisposable(r5)
            io.reactivex.disposables.Disposable r5 = r7.s
            r5.dispose()
            boolean r5 = r7.cancelled
            if (r5 != 0) goto L3d
            r7.s = r4
            goto Lf
        L3d:
            r4.dispose()
            goto Lf
        L41:
            boolean r4 = io.reactivex.internal.util.NotificationLite.isError(r5)
            if (r4 == 0) goto L5f
            r0.clear()
            r7.disposeResource()
            java.lang.Throwable r4 = io.reactivex.internal.util.NotificationLite.getError(r5)
            boolean r5 = r7.cancelled
            if (r5 != 0) goto L5b
            r7.cancelled = r2
            r1.onError(r4)
            goto Lf
        L5b:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
            goto Lf
        L5f:
            boolean r4 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
            if (r4 == 0) goto L75
            r0.clear()
            r7.disposeResource()
            boolean r4 = r7.cancelled
            if (r4 != 0) goto Lf
            r7.cancelled = r2
            r1.onComplete()
            goto Lf
        L75:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r5)
            r1.onNext(r4)
            goto Lf
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.resource
            if (r0 == 0) goto L9
            boolean r0 = r0.isDisposed()
            return r0
        L9:
            boolean r0 = r1.cancelled
            return r0
    }

    public void onComplete(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()
            r0.offer(r3, r1)
            r2.drain()
            return
    }

    public void onError(java.lang.Throwable r2, io.reactivex.disposables.Disposable r3) {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
        L8:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
            r0.offer(r3, r2)
            r1.drain()
            return
    }

    public boolean onNext(T r2, io.reactivex.disposables.Disposable r3) {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
            r0.offer(r3, r2)
            r1.drain()
            r2 = 1
            return r2
    }

    public boolean setDisposable(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            boolean r0 = r2.cancelled
            if (r0 == 0) goto L6
            r3 = 0
            return r3
        L6:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
            io.reactivex.disposables.Disposable r1 = r2.s
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.disposable(r3)
            r0.offer(r1, r3)
            r2.drain()
            r3 = 1
            return r3
    }
}
