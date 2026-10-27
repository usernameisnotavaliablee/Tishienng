package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractFuture<V> implements io.netty.util.concurrent.Future<V> {
    public AbstractFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r2 = this;
            r2.await()
            java.lang.Throwable r0 = r2.cause()
            if (r0 != 0) goto Le
            java.lang.Object r0 = r2.getNow()
            return r0
        Le:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L15
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            throw r0
        L15:
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public V get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            boolean r1 = r0.await(r1, r3)
            if (r1 == 0) goto L1e
            java.lang.Throwable r1 = r0.cause()
            if (r1 != 0) goto L11
            java.lang.Object r1 = r0.getNow()
            return r1
        L11:
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L18
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            throw r1
        L18:
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r2.<init>(r1)
            throw r2
        L1e:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            r1.<init>()
            throw r1
    }
}
