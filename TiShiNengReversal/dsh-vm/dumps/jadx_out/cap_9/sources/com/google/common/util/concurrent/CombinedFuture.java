package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class CombinedFuture<V> extends com.google.common.util.concurrent.AggregateFuture<java.lang.Object, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AsyncCallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;
        final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        public AsyncCallableInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, com.google.common.util.concurrent.AsyncCallable<V> r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.util.concurrent.AsyncCallable r1 = (com.google.common.util.concurrent.AsyncCallable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r3.thrownByExecute = r0
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

        void setValue(com.google.common.util.concurrent.ListenableFuture<V> r2) {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                r0.setFuture(r2)
                return
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* bridge */ /* synthetic */ void setValue(java.lang.Object r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.setValue(r1)
                return
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
    private final class CallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;
        final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        public CallableInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, java.util.concurrent.Callable<V> r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                r0.callable = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        V runInterruptibly() throws java.lang.Exception {
                r1 = this;
                r0 = 0
                r1.thrownByExecute = r0
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.Object r0 = r0.call()
                return r0
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void setValue(V r2) {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                r0.set(r2)
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
                r1 = this;
                java.util.concurrent.Callable<V> r0 = r1.callable
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class CombinedFutureInterruptibleTask<T> extends com.google.common.util.concurrent.InterruptibleTask<T> {
        private final java.util.concurrent.Executor listenerExecutor;
        final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;
        boolean thrownByExecute;

        public CombinedFutureInterruptibleTask(com.google.common.util.concurrent.CombinedFuture r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.thrownByExecute = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                r0.listenerExecutor = r1
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptibly(T r1, java.lang.Throwable r2) {
                r0 = this;
                if (r2 == 0) goto L21
                boolean r1 = r2 instanceof java.util.concurrent.ExecutionException
                if (r1 == 0) goto L10
                com.google.common.util.concurrent.CombinedFuture r1 = r0.this$0
                java.lang.Throwable r2 = r2.getCause()
                r1.setException(r2)
                return
            L10:
                boolean r1 = r2 instanceof java.util.concurrent.CancellationException
                if (r1 == 0) goto L1b
                com.google.common.util.concurrent.CombinedFuture r1 = r0.this$0
                r2 = 0
                r1.cancel(r2)
                return
            L1b:
                com.google.common.util.concurrent.CombinedFuture r1 = r0.this$0
                r1.setException(r2)
                return
            L21:
                r0.setValue(r1)
                return
        }

        final void execute() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.listenerExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> L6
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
                return
            L6:
                r0 = move-exception
                boolean r1 = r2.thrownByExecute
                if (r1 == 0) goto L10
                com.google.common.util.concurrent.CombinedFuture r1 = r2.this$0
                r1.setException(r0)
            L10:
                return
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                boolean r0 = r0.isDone()
                return r0
        }

        abstract void setValue(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class CombinedFutureRunningState extends com.google.common.util.concurrent.AggregateFuture<java.lang.Object, V>.RunningState {
        private com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask task;
        final /* synthetic */ com.google.common.util.concurrent.CombinedFuture this$0;

        CombinedFutureRunningState(com.google.common.util.concurrent.CombinedFuture r2, com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> r3, boolean r4, com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask r5) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                r1.task = r5
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        void collectOneValue(boolean r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r0 = this;
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        void handleAllCompleted() {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture$CombinedFutureInterruptibleTask r0 = r1.task
                if (r0 == 0) goto L8
                r0.execute()
                return
            L8:
                com.google.common.util.concurrent.CombinedFuture r0 = r1.this$0
                boolean r0 = r0.isDone()
                com.google.common.base.Preconditions.checkState(r0)
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        void interruptTask() {
                r1 = this;
                com.google.common.util.concurrent.CombinedFuture$CombinedFutureInterruptibleTask r0 = r1.task
                if (r0 == 0) goto L7
                r0.interruptTask()
            L7:
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        void releaseResourcesAfterFailure() {
                r1 = this;
                super.releaseResourcesAfterFailure()
                r0 = 0
                r1.task = r0
                return
        }
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> r3, boolean r4, java.util.concurrent.Executor r5, com.google.common.util.concurrent.AsyncCallable<V> r6) {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.CombinedFuture$CombinedFutureRunningState r0 = new com.google.common.util.concurrent.CombinedFuture$CombinedFutureRunningState
            com.google.common.util.concurrent.CombinedFuture$AsyncCallableInterruptibleTask r1 = new com.google.common.util.concurrent.CombinedFuture$AsyncCallableInterruptibleTask
            r1.<init>(r2, r6, r5)
            r0.<init>(r2, r3, r4, r1)
            r2.init(r0)
            return
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> r3, boolean r4, java.util.concurrent.Executor r5, java.util.concurrent.Callable<V> r6) {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.CombinedFuture$CombinedFutureRunningState r0 = new com.google.common.util.concurrent.CombinedFuture$CombinedFutureRunningState
            com.google.common.util.concurrent.CombinedFuture$CallableInterruptibleTask r1 = new com.google.common.util.concurrent.CombinedFuture$CallableInterruptibleTask
            r1.<init>(r2, r6, r5)
            r0.<init>(r2, r3, r4, r1)
            r2.init(r0)
            return
    }
}
