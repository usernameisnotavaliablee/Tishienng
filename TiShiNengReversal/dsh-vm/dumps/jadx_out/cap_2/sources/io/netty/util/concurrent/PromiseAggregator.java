package io.netty.util.concurrent;

import io.netty.util.concurrent.Future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class PromiseAggregator<V, F extends io.netty.util.concurrent.Future<V>> implements io.netty.util.concurrent.GenericFutureListener<F> {
    private final io.netty.util.concurrent.Promise<?> aggregatePromise;
    private final boolean failPending;
    private java.util.Set<io.netty.util.concurrent.Promise<V>> pendingPromises;

    public PromiseAggregator(io.netty.util.concurrent.Promise<java.lang.Void> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public PromiseAggregator(io.netty.util.concurrent.Promise<java.lang.Void> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.aggregatePromise = r1
            r0.failPending = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "aggregatePromise"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.SafeVarargs
    public final io.netty.util.concurrent.PromiseAggregator<V, F> add(io.netty.util.concurrent.Promise<V>... r5) {
            r4 = this;
            if (r5 == 0) goto L33
            int r0 = r5.length
            if (r0 != 0) goto L6
            return r4
        L6:
            monitor-enter(r4)
            java.util.Set<io.netty.util.concurrent.Promise<V>> r0 = r4.pendingPromises     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L1b
            int r0 = r5.length     // Catch: java.lang.Throwable -> L11
            r1 = 1
            if (r0 <= r1) goto L13
            int r0 = r5.length     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r5 = move-exception
            goto L31
        L13:
            r0 = 2
        L14:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L11
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r4.pendingPromises = r1     // Catch: java.lang.Throwable -> L11
        L1b:
            int r0 = r5.length     // Catch: java.lang.Throwable -> L11
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2f
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L24
            goto L2c
        L24:
            java.util.Set<io.netty.util.concurrent.Promise<V>> r3 = r4.pendingPromises     // Catch: java.lang.Throwable -> L11
            r3.add(r2)     // Catch: java.lang.Throwable -> L11
            r2.addListener(r4)     // Catch: java.lang.Throwable -> L11
        L2c:
            int r1 = r1 + 1
            goto L1d
        L2f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return r4
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r5
        L33:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "promises"
            r5.<init>(r0)
            throw r5
    }

    @Override // io.netty.util.concurrent.GenericFutureListener
    public synchronized void operationComplete(F r3) throws java.lang.Exception {
            r2 = this;
            monitor-enter(r2)
            java.util.Set<io.netty.util.concurrent.Promise<V>> r0 = r2.pendingPromises     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r0 != 0) goto Le
            io.netty.util.concurrent.Promise<?> r3 = r2.aggregatePromise     // Catch: java.lang.Throwable -> Lc
            r3.setSuccess(r1)     // Catch: java.lang.Throwable -> Lc
            goto L47
        Lc:
            r3 = move-exception
            goto L49
        Le:
            r0.remove(r3)     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r3.isSuccess()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L3a
            java.lang.Throwable r3 = r3.cause()     // Catch: java.lang.Throwable -> Lc
            io.netty.util.concurrent.Promise<?> r0 = r2.aggregatePromise     // Catch: java.lang.Throwable -> Lc
            r0.setFailure(r3)     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r2.failPending     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L47
            java.util.Set<io.netty.util.concurrent.Promise<V>> r0 = r2.pendingPromises     // Catch: java.lang.Throwable -> Lc
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc
        L2a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lc
            io.netty.util.concurrent.Promise r1 = (io.netty.util.concurrent.Promise) r1     // Catch: java.lang.Throwable -> Lc
            r1.setFailure(r3)     // Catch: java.lang.Throwable -> Lc
            goto L2a
        L3a:
            java.util.Set<io.netty.util.concurrent.Promise<V>> r3 = r2.pendingPromises     // Catch: java.lang.Throwable -> Lc
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L47
            io.netty.util.concurrent.Promise<?> r3 = r2.aggregatePromise     // Catch: java.lang.Throwable -> Lc
            r3.setSuccess(r1)     // Catch: java.lang.Throwable -> Lc
        L47:
            monitor-exit(r2)
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }
}
