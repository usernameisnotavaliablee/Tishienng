package com.google.common.util.concurrent;

import java.lang.Throwable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractCatchingFuture<V, X extends java.lang.Throwable, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.lang.Runnable {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    java.lang.Class<X> exceptionType;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    F fallback;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    com.google.common.util.concurrent.ListenableFuture<? extends V> inputFuture;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AsyncCatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, com.google.common.util.concurrent.ListenableFuture<? extends V>> {
        AsyncCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        com.google.common.util.concurrent.ListenableFuture<? extends V> doFallback(com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r2, X r3) throws java.lang.Exception {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r3 = r2.apply(r3)
                java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                com.google.common.base.Preconditions.checkNotNull(r3, r0, r2)
                return r3
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object r1, java.lang.Throwable r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.util.concurrent.AsyncFunction r1 = (com.google.common.util.concurrent.AsyncFunction) r1
                com.google.common.util.concurrent.ListenableFuture r1 = r0.doFallback(r1, r2)
                return r1
        }

        void setResult(com.google.common.util.concurrent.ListenableFuture<? extends V> r1) {
                r0 = this;
                r0.setFuture(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.setResult(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.base.Function<? super X, ? extends V>, V> {
        CatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.base.Function<? super X, ? extends V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V doFallback(com.google.common.base.Function<? super X, ? extends V> r1, X r2) throws java.lang.Exception {
                r0 = this;
                java.lang.Object r1 = r1.apply(r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object r1, java.lang.Throwable r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                java.lang.Object r1 = r0.doFallback(r1, r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        void setResult(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
                r0 = this;
                r0.set(r1)
                return
        }
    }

    AbstractCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, F r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.inputFuture = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.exceptionType = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            r0.fallback = r1
            return
    }

    static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.base.Function<? super X, ? extends V> r3, java.util.concurrent.Executor r4) {
            com.google.common.util.concurrent.AbstractCatchingFuture$CatchingFuture r0 = new com.google.common.util.concurrent.AbstractCatchingFuture$CatchingFuture
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(r4, r0)
            r1.addListener(r0, r2)
            return r0
    }

    static <X extends java.lang.Throwable, V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r3, java.util.concurrent.Executor r4) {
            com.google.common.util.concurrent.AbstractCatchingFuture$AsyncCatchingFuture r0 = new com.google.common.util.concurrent.AbstractCatchingFuture$AsyncCatchingFuture
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(r4, r0)
            r1.addListener(r0, r2)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r1.inputFuture
            r1.maybePropagateCancellationTo(r0)
            r0 = 0
            r1.inputFuture = r0
            r1.exceptionType = r0
            r1.fallback = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    @com.google.errorprone.annotations.ForOverride
    abstract T doFallback(F r1, X r2) throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r6.inputFuture
            java.lang.Class<X extends java.lang.Throwable> r1 = r6.exceptionType
            F r2 = r6.fallback
            java.lang.String r3 = super.pendingToString()
            if (r0 == 0) goto L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "inputFuture=["
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "], "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L25
        L23:
            java.lang.String r0 = ""
        L25:
            if (r1 == 0) goto L4b
            if (r2 == 0) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "exceptionType=["
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "], fallback=["
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L4b:
            if (r3 == 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            return r0
        L5d:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r7.inputFuture
            java.lang.Class<X extends java.lang.Throwable> r1 = r7.exceptionType
            F r2 = r7.fallback
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = 1
        L16:
            r3 = r3 | r5
            boolean r4 = r7.isCancelled()
            r3 = r3 | r4
            if (r3 == 0) goto L1f
            return
        L1f:
            r3 = 0
            r7.inputFuture = r3
            java.lang.Object r4 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.ExecutionException -> L2c
            r5 = r4
            r4 = r3
            goto L38
        L29:
            r4 = move-exception
        L2a:
            r5 = r3
            goto L38
        L2c:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L2a
        L38:
            if (r4 != 0) goto L3e
            r7.set(r5)
            return
        L3e:
            boolean r1 = com.google.common.util.concurrent.Platform.isInstanceOfThrowableClass(r4, r1)
            if (r1 != 0) goto L48
            r7.setFuture(r0)
            return
        L48:
            java.lang.Object r0 = r7.doFallback(r2, r4)     // Catch: java.lang.Throwable -> L54
            r7.exceptionType = r3
            r7.fallback = r3
            r7.setResult(r0)
            return
        L54:
            r0 = move-exception
            r7.setException(r0)     // Catch: java.lang.Throwable -> L5d
            r7.exceptionType = r3
            r7.fallback = r3
            return
        L5d:
            r0 = move-exception
            r7.exceptionType = r3
            r7.fallback = r3
            throw r0
    }

    @com.google.errorprone.annotations.ForOverride
    abstract void setResult(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1);
}
