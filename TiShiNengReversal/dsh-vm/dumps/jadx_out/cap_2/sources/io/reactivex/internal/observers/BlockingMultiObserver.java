package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingMultiObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver<T> {
    volatile boolean cancelled;
    io.reactivex.disposables.Disposable d;
    java.lang.Throwable error;
    T value;

    public BlockingMultiObserver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public boolean blockingAwait(long r6, java.util.concurrent.TimeUnit r8) {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            boolean r6 = r5.await(r6, r8)     // Catch: java.lang.InterruptedException -> L15
            if (r6 != 0) goto L1e
            r5.dispose()     // Catch: java.lang.InterruptedException -> L15
            r6 = 0
            return r6
        L15:
            r6 = move-exception
            r5.dispose()
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)
            throw r6
        L1e:
            java.lang.Throwable r6 = r5.error
            if (r6 != 0) goto L24
            r6 = 1
            return r6
        L24:
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)
            throw r6
    }

    public T blockingGet() {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            r5.await()     // Catch: java.lang.InterruptedException -> Le
            goto L17
        Le:
            r0 = move-exception
            r5.dispose()
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
        L17:
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L1e
            T r0 = r5.value
            return r0
        L1e:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    public T blockingGet(T r6) {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            r5.await()     // Catch: java.lang.InterruptedException -> Le
            goto L17
        Le:
            r6 = move-exception
            r5.dispose()
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)
            throw r6
        L17:
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L21
            T r0 = r5.value
            if (r0 == 0) goto L20
            return r0
        L20:
            return r6
        L21:
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r6
    }

    public java.lang.Throwable blockingGetError() {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            r5.await()     // Catch: java.lang.InterruptedException -> Le
            goto L13
        Le:
            r0 = move-exception
            r5.dispose()
            return r0
        L13:
            java.lang.Throwable r0 = r5.error
            return r0
    }

    public java.lang.Throwable blockingGetError(long r6, java.util.concurrent.TimeUnit r8) {
            r5 = this;
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            boolean r6 = r5.await(r6, r8)     // Catch: java.lang.InterruptedException -> L1e
            if (r6 == 0) goto L11
            goto L27
        L11:
            r5.dispose()     // Catch: java.lang.InterruptedException -> L1e
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.InterruptedException -> L1e
            r6.<init>()     // Catch: java.lang.InterruptedException -> L1e
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)     // Catch: java.lang.InterruptedException -> L1e
            throw r6     // Catch: java.lang.InterruptedException -> L1e
        L1e:
            r6 = move-exception
            r5.dispose()
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)
            throw r6
        L27:
            java.lang.Throwable r6 = r5.error
            return r6
    }

    void dispose() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            io.reactivex.disposables.Disposable r0 = r1.d
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r1) {
            r0 = this;
            r0.error = r1
            r0.countDown()
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.d = r2
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            r2.dispose()
        L9:
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r1) {
            r0 = this;
            r0.value = r1
            r0.countDown()
            return
    }
}
