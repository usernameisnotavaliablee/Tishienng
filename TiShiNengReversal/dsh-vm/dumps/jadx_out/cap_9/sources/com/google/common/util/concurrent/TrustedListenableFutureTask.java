package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class TrustedListenableFutureTask<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.util.concurrent.RunnableFuture<V> {
    private volatile com.google.common.util.concurrent.InterruptibleTask<?> task;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class TrustedFutureInterruptibleAsyncTask extends com.google.common.util.concurrent.InterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;
        final /* synthetic */ com.google.common.util.concurrent.TrustedListenableFutureTask this$0;

        TrustedFutureInterruptibleAsyncTask(com.google.common.util.concurrent.TrustedListenableFutureTask r1, com.google.common.util.concurrent.AsyncCallable<V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.AsyncCallable r1 = (com.google.common.util.concurrent.AsyncCallable) r1
                r0.callable = r1
                return
        }

        void afterRanInterruptibly(com.google.common.util.concurrent.ListenableFuture<V> r1, java.lang.Throwable r2) {
                r0 = this;
                if (r2 != 0) goto L8
                com.google.common.util.concurrent.TrustedListenableFutureTask r2 = r0.this$0
                r2.setFuture(r1)
                return
            L8:
                com.google.common.util.concurrent.TrustedListenableFutureTask r1 = r0.this$0
                r1.setException(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ void afterRanInterruptibly(java.lang.Object r1, java.lang.Throwable r2) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.afterRanInterruptibly(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
                r3 = this;
                com.google.common.util.concurrent.AsyncCallable<V> r0 = r3.callable
                com.google.common.util.concurrent.ListenableFuture r0 = r0.call()
                java.lang.String r1 = "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                com.google.common.util.concurrent.AsyncCallable<V> r2 = r3.callable
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r1, r2)
                com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ java.lang.Object runInterruptibly() throws java.lang.Exception {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture r0 = r1.runInterruptibly()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
                r1 = this;
                com.google.common.util.concurrent.AsyncCallable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class TrustedFutureInterruptibleTask extends com.google.common.util.concurrent.InterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;
        final /* synthetic */ com.google.common.util.concurrent.TrustedListenableFutureTask this$0;

        TrustedFutureInterruptibleTask(com.google.common.util.concurrent.TrustedListenableFutureTask r1, java.util.concurrent.Callable<V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptibly(V r1, java.lang.Throwable r2) {
                r0 = this;
                if (r2 != 0) goto L8
                com.google.common.util.concurrent.TrustedListenableFutureTask r2 = r0.this$0
                r2.set(r1)
                return
            L8:
                com.google.common.util.concurrent.TrustedListenableFutureTask r1 = r0.this$0
                r1.setException(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        V runInterruptibly() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    TrustedListenableFutureTask(com.google.common.util.concurrent.AsyncCallable<V> r2) {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask
            r0.<init>(r1, r2)
            r1.task = r0
            return
    }

    TrustedListenableFutureTask(java.util.concurrent.Callable<V> r2) {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask
            r0.<init>(r1, r2)
            r1.task = r0
            return
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(com.google.common.util.concurrent.AsyncCallable<V> r1) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r0.<init>(r1)
            return r0
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.lang.Runnable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            java.util.concurrent.Callable r1 = java.util.concurrent.Executors.callable(r1, r2)
            r0.<init>(r1)
            return r0
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.util.concurrent.Callable<V> r1) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = new com.google.common.util.concurrent.TrustedListenableFutureTask
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
            r1 = this;
            super.afterDone()
            boolean r0 = r1.wasInterrupted()
            if (r0 == 0) goto L10
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto L10
            r0.interruptTask()
        L10:
            r0 = 0
            r1.task = r0
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
            r3 = this;
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r3.task
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "task=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1b:
            java.lang.String r0 = super.pendingToString()
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r1 = this;
            com.google.common.util.concurrent.InterruptibleTask<?> r0 = r1.task
            if (r0 == 0) goto L7
            r0.run()
        L7:
            r0 = 0
            r1.task = r0
            return
    }
}
