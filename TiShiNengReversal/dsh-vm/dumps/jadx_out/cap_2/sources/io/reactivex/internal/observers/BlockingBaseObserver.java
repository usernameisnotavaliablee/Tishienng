package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BlockingBaseObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    volatile boolean cancelled;
    io.reactivex.disposables.Disposable d;
    java.lang.Throwable error;
    T value;

    public BlockingBaseObserver() {
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

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            r0 = 1
            r1.cancelled = r0
            io.reactivex.disposables.Disposable r0 = r1.d
            if (r0 == 0) goto La
            r0.dispose()
        La:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
            r0 = this;
            r0.countDown()
            return
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            r1.d = r2
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            r2.dispose()
        L9:
            return
    }
}
