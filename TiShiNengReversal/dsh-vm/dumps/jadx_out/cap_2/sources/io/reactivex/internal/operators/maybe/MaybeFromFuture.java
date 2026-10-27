package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeFromFuture<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public MaybeFromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            r0.timeout = r2
            r0.unit = r4
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r7) {
            r6 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r7.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 != 0) goto L5b
            long r1 = r6.timeout     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L22
            java.util.concurrent.Future<? extends T> r1 = r6.future     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
            java.lang.Object r1 = r1.get()     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
            goto L2a
        L1c:
            r1 = move-exception
            goto L3a
        L1e:
            r1 = move-exception
            goto L44
        L20:
            r1 = move-exception
            goto L52
        L22:
            java.util.concurrent.Future<? extends T> r3 = r6.future     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
            java.util.concurrent.TimeUnit r4 = r6.unit     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
            java.lang.Object r1 = r3.get(r1, r4)     // Catch: java.util.concurrent.TimeoutException -> L1c java.util.concurrent.ExecutionException -> L1e java.lang.InterruptedException -> L20
        L2a:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L5b
            if (r1 != 0) goto L36
            r7.onComplete()
            return
        L36:
            r7.onSuccess(r1)
            return
        L3a:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L5b
            r7.onError(r1)
            goto L5b
        L44:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L5b
            java.lang.Throwable r0 = r1.getCause()
            r7.onError(r0)
            goto L5b
        L52:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L5b
            r7.onError(r1)
        L5b:
            return
    }
}
