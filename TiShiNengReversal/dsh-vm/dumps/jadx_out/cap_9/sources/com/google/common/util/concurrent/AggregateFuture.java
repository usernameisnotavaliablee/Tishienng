package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AggregateFuture<InputT, OutputT> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT> {
    private static final java.util.logging.Logger logger = null;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private com.google.common.util.concurrent.AggregateFuture<InputT, OutputT>.RunningState runningState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class RunningState extends com.google.common.util.concurrent.AggregateFutureState implements java.lang.Runnable {
        private final boolean allMustSucceed;
        private final boolean collectsValues;
        private com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures;
        final /* synthetic */ com.google.common.util.concurrent.AggregateFuture this$0;


        RunningState(com.google.common.util.concurrent.AggregateFuture r1, com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r2, boolean r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                int r1 = r2.size()
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.ImmutableCollection r1 = (com.google.common.collect.ImmutableCollection) r1
                r0.futures = r1
                r0.allMustSucceed = r3
                r0.collectsValues = r4
                return
        }

        static /* synthetic */ com.google.common.collect.ImmutableCollection access$000(com.google.common.util.concurrent.AggregateFuture.RunningState r0) {
                com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r0.futures
                return r0
        }

        static /* synthetic */ void access$100(com.google.common.util.concurrent.AggregateFuture.RunningState r0) {
                r0.init()
                return
        }

        static /* synthetic */ void access$200(com.google.common.util.concurrent.AggregateFuture.RunningState r0, int r1, java.util.concurrent.Future r2) {
                r0.handleOneInputDone(r1, r2)
                return
        }

        static /* synthetic */ void access$300(com.google.common.util.concurrent.AggregateFuture.RunningState r0) {
                r0.decrementCountAndMaybeComplete()
                return
        }

        private void decrementCountAndMaybeComplete() {
                r3 = this;
                int r0 = r3.decrementRemainingAndGet()
                if (r0 < 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                java.lang.String r2 = "Less than 0 remaining futures"
                com.google.common.base.Preconditions.checkState(r1, r2)
                if (r0 != 0) goto L13
                r3.processCompleted()
            L13:
                return
        }

        private void handleException(java.lang.Throwable r6) {
                r5 = this;
                com.google.common.base.Preconditions.checkNotNull(r6)
                boolean r0 = r5.allMustSucceed
                r1 = 1
                if (r0 == 0) goto L1e
                com.google.common.util.concurrent.AggregateFuture r0 = r5.this$0
                boolean r0 = r0.setException(r6)
                if (r0 == 0) goto L15
                r5.releaseResourcesAfterFailure()
            L13:
                r2 = 1
                goto L20
            L15:
                java.util.Set r2 = r5.getOrInitSeenExceptions()
                boolean r2 = com.google.common.util.concurrent.AggregateFuture.access$400(r2, r6)
                goto L20
            L1e:
                r0 = 0
                goto L13
            L20:
                boolean r3 = r6 instanceof java.lang.Error
                boolean r4 = r5.allMustSucceed
                r0 = r0 ^ r1
                r0 = r0 & r4
                r0 = r0 & r2
                r0 = r0 | r3
                if (r0 == 0) goto L3a
                if (r3 == 0) goto L2f
                java.lang.String r0 = "Input Future failed with Error"
                goto L31
            L2f:
                java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
            L31:
                java.util.logging.Logger r1 = com.google.common.util.concurrent.AggregateFuture.access$500()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                r1.log(r2, r0, r6)
            L3a:
                return
        }

        private void handleOneInputDone(int r4, java.util.concurrent.Future<? extends InputT> r5) {
                r3 = this;
                boolean r0 = r3.allMustSucceed
                r1 = 0
                if (r0 != 0) goto L18
                com.google.common.util.concurrent.AggregateFuture r0 = r3.this$0
                boolean r0 = r0.isDone()
                if (r0 == 0) goto L18
                com.google.common.util.concurrent.AggregateFuture r0 = r3.this$0
                boolean r0 = r0.isCancelled()
                if (r0 == 0) goto L16
                goto L18
            L16:
                r0 = 0
                goto L19
            L18:
                r0 = 1
            L19:
                java.lang.String r2 = "Future was done before all dependencies completed"
                com.google.common.base.Preconditions.checkState(r0, r2)
                boolean r0 = r5.isDone()     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                java.lang.String r2 = "Tried to set value from future which is not done"
                com.google.common.base.Preconditions.checkState(r0, r2)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                boolean r0 = r3.allMustSucceed     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                if (r0 == 0) goto L4f
                boolean r0 = r5.isCancelled()     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                if (r0 == 0) goto L41
                com.google.common.util.concurrent.AggregateFuture r4 = r3.this$0     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                r5 = 0
                com.google.common.util.concurrent.AggregateFuture.access$602(r4, r5)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                com.google.common.util.concurrent.AggregateFuture r4 = r3.this$0     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                r4.cancel(r1)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                return
            L3d:
                r4 = move-exception
                goto L63
            L3f:
                r4 = move-exception
                goto L67
            L41:
                java.lang.Object r5 = com.google.common.util.concurrent.Futures.getDone(r5)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                boolean r0 = r3.collectsValues     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                if (r0 == 0) goto L6e
                boolean r0 = r3.allMustSucceed     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                r3.collectOneValue(r0, r4, r5)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                return
            L4f:
                boolean r0 = r3.collectsValues     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                if (r0 == 0) goto L6e
                boolean r0 = r5.isCancelled()     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                if (r0 != 0) goto L6e
                boolean r0 = r3.allMustSucceed     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                java.lang.Object r5 = com.google.common.util.concurrent.Futures.getDone(r5)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                r3.collectOneValue(r0, r4, r5)     // Catch: java.lang.Throwable -> L3d java.util.concurrent.ExecutionException -> L3f
                return
            L63:
                r3.handleException(r4)
                goto L6e
            L67:
                java.lang.Throwable r4 = r4.getCause()
                r3.handleException(r4)
            L6e:
                return
        }

        private void init() {
                r5 = this;
                com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc
                r5.handleAllCompleted()
                return
            Lc:
                boolean r0 = r5.allMustSucceed
                if (r0 == 0) goto L33
                com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                r1 = 0
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L4d
                java.lang.Object r2 = r0.next()
                com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
                int r3 = r1 + 1
                com.google.common.util.concurrent.AggregateFuture$RunningState$1 r4 = new com.google.common.util.concurrent.AggregateFuture$RunningState$1
                r4.<init>(r5, r1, r2)
                java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r2.addListener(r4, r1)
                r1 = r3
                goto L17
            L33:
                com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r5.futures
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            L39:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4d
                java.lang.Object r1 = r0.next()
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r1.addListener(r5, r2)
                goto L39
            L4d:
                return
        }

        private void processCompleted() {
                r4 = this;
                boolean r0 = r4.collectsValues
                boolean r1 = r4.allMustSucceed
                r1 = r1 ^ 1
                r0 = r0 & r1
                if (r0 == 0) goto L23
                com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> r0 = r4.futures
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                r1 = 0
            L10:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L23
                java.lang.Object r2 = r0.next()
                com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
                int r3 = r1 + 1
                r4.handleOneInputDone(r1, r2)
                r1 = r3
                goto L10
            L23:
                r4.handleAllCompleted()
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState
        final void addInitialException(java.util.Set<java.lang.Throwable> r2) {
                r1 = this;
                com.google.common.util.concurrent.AggregateFuture r0 = r1.this$0
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L11
                com.google.common.util.concurrent.AggregateFuture r0 = r1.this$0
                java.lang.Throwable r0 = r0.tryInternalFastPathGetFailure()
                com.google.common.util.concurrent.AggregateFuture.access$400(r2, r0)
            L11:
                return
        }

        abstract void collectOneValue(boolean r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl InputT r3);

        abstract void handleAllCompleted();

        void interruptTask() {
                r0 = this;
                return
        }

        @com.google.errorprone.annotations.ForOverride
        @com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper
        void releaseResourcesAfterFailure() {
                r1 = this;
                r0 = 0
                r1.futures = r0
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r0 = this;
                r0.decrementCountAndMaybeComplete()
                return
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AggregateFuture> r0 = com.google.common.util.concurrent.AggregateFuture.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AggregateFuture.logger = r0
            return
    }

    AggregateFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$400(java.util.Set r0, java.lang.Throwable r1) {
            boolean r0 = addCausalChain(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$500() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AggregateFuture.logger
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.AggregateFuture.RunningState access$602(com.google.common.util.concurrent.AggregateFuture r0, com.google.common.util.concurrent.AggregateFuture.RunningState r1) {
            r0.runningState = r1
            return r1
    }

    private static boolean addCausalChain(java.util.Set<java.lang.Throwable> r1, java.lang.Throwable r2) {
        L0:
            if (r2 == 0) goto Lf
            boolean r0 = r1.add(r2)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            r1 = 1
            return r1
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
            r4 = this;
            super.afterDone()
            com.google.common.util.concurrent.AggregateFuture<InputT, OutputT>$RunningState r0 = r4.runningState
            if (r0 == 0) goto L37
            r1 = 0
            r4.runningState = r1
            com.google.common.collect.ImmutableCollection r1 = com.google.common.util.concurrent.AggregateFuture.RunningState.access$000(r0)
            boolean r2 = r4.wasInterrupted()
            if (r2 == 0) goto L17
            r0.interruptTask()
        L17:
            boolean r0 = r4.isCancelled()
            if (r1 == 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r0 = r0 & r3
            if (r0 == 0) goto L37
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r1.cancel(r2)
            goto L27
        L37:
            return
    }

    final void init(com.google.common.util.concurrent.AggregateFuture<InputT, OutputT>.RunningState r1) {
            r0 = this;
            r0.runningState = r1
            com.google.common.util.concurrent.AggregateFuture.RunningState.access$100(r1)
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
            r3 = this;
            com.google.common.util.concurrent.AggregateFuture<InputT, OutputT>$RunningState r0 = r3.runningState
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.common.collect.ImmutableCollection r0 = com.google.common.util.concurrent.AggregateFuture.RunningState.access$000(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "futures=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L23:
            return r1
    }
}
