package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<O> implements java.lang.Runnable {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    F function;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AsyncTransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends O>> {
        AsyncTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        com.google.common.util.concurrent.ListenableFuture<? extends O> doTransform(com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl I r3) throws java.lang.Exception {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r3 = r2.apply(r3)
                java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                com.google.common.base.Preconditions.checkNotNull(r3, r0, r2)
                return r3
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.util.concurrent.AsyncFunction r1 = (com.google.common.util.concurrent.AsyncFunction) r1
                com.google.common.util.concurrent.ListenableFuture r1 = r0.doTransform(r1, r2)
                return r1
        }

        void setResult(com.google.common.util.concurrent.ListenableFuture<? extends O> r1) {
                r0 = this;
                r0.setFuture(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.setResult(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.base.Function<? super I, ? extends O>, O> {
        TransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, com.google.common.base.Function<? super I, ? extends O> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        O doTransform(com.google.common.base.Function<? super I, ? extends O> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl I r2) {
                r0 = this;
                java.lang.Object r1 = r1.apply(r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                java.lang.Object r1 = r0.doTransform(r1, r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void setResult(@org.checkerframework.checker.nullness.compatqual.NullableDecl O r1) {
                r0 = this;
                r0.set(r1)
                return
        }
    }

    AbstractTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, F r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.inputFuture = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.function = r1
            return
    }

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> r1, com.google.common.base.Function<? super I, ? extends O> r2, java.util.concurrent.Executor r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.AbstractTransformFuture$TransformFuture r0 = new com.google.common.util.concurrent.AbstractTransformFuture$TransformFuture
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(r3, r0)
            r1.addListener(r0, r2)
            return r0
    }

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> r1, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> r2, java.util.concurrent.Executor r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.util.concurrent.AbstractTransformFuture$AsyncTransformFuture r0 = new com.google.common.util.concurrent.AbstractTransformFuture$AsyncTransformFuture
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(r3, r0)
            r1.addListener(r0, r2)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r1.inputFuture
            r1.maybePropagateCancellationTo(r0)
            r0 = 0
            r1.inputFuture = r0
            r1.function = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    @com.google.errorprone.annotations.ForOverride
    abstract T doTransform(F r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl I r2) throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
            r5 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r5.inputFuture
            F r1 = r5.function
            java.lang.String r2 = super.pendingToString()
            if (r0 == 0) goto L21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "inputFuture=["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "], "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            if (r1 == 0) goto L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "function=["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L3f:
            if (r2 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L51:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r6.inputFuture
            F r1 = r6.function
            boolean r2 = r6.isCancelled()
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            r2 = r2 | r5
            if (r1 != 0) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            r2 = r2 | r3
            if (r2 == 0) goto L18
            return
        L18:
            r2 = 0
            r6.inputFuture = r2
            boolean r3 = r0.isCancelled()
            if (r3 == 0) goto L25
            r6.setFuture(r0)
            return
        L25:
            java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Error -> L3e java.lang.RuntimeException -> L43 java.util.concurrent.ExecutionException -> L48 java.util.concurrent.CancellationException -> L51
            java.lang.Object r0 = r6.doTransform(r1, r0)     // Catch: java.lang.Throwable -> L33
            r6.function = r2
            r6.setResult(r0)
            return
        L33:
            r0 = move-exception
            r6.setException(r0)     // Catch: java.lang.Throwable -> L3a
            r6.function = r2
            return
        L3a:
            r0 = move-exception
            r6.function = r2
            throw r0
        L3e:
            r0 = move-exception
            r6.setException(r0)
            return
        L43:
            r0 = move-exception
            r6.setException(r0)
            return
        L48:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            r6.setException(r0)
            return
        L51:
            r6.cancel(r4)
            return
    }

    @com.google.errorprone.annotations.ForOverride
    abstract void setResult(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1);
}
