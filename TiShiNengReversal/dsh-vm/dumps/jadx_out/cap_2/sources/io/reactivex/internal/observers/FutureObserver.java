package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FutureObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;
    T value;

    public FutureObserver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.s = r0
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r2.s
            java.lang.Object r3 = r3.get()
            io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
            if (r3 == r2) goto L21
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r3 != r0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r3, r0)
            if (r0 == 0) goto L0
            if (r3 == 0) goto L1c
            r3.dispose()
        L1c:
            r2.countDown()
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            return
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
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.isDone()
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

    @Override // io.reactivex.Observer
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
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            if (r0 == r2) goto L29
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L1e
            goto L29
        L1e:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 == 0) goto Lf
            r2.countDown()
        L29:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L25
            r2.error = r3
        L6:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            if (r0 == r2) goto L21
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L15
            goto L21
        L15:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r2.s
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 == 0) goto L6
            r2.countDown()
            return
        L21:
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L25:
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.s
            java.lang.Object r2 = r2.get()
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            r2.dispose()
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "More than one element received"
            r2.<init>(r0)
            r1.onError(r2)
            return
        L1a:
            r1.value = r2
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
            return
    }
}
