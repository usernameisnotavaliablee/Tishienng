package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ExecutionSequencer {
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.Object>> ref;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum RunningState extends java.lang.Enum<com.google.common.util.concurrent.ExecutionSequencer.RunningState> {
        private static final /* synthetic */ com.google.common.util.concurrent.ExecutionSequencer.RunningState[] $VALUES = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState CANCELLED = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState NOT_RUN = null;
        public static final com.google.common.util.concurrent.ExecutionSequencer.RunningState STARTED = null;

        static {
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r1 = "NOT_RUN"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN = r0
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r3 = "CANCELLED"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED = r1
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r3 = new com.google.common.util.concurrent.ExecutionSequencer$RunningState
                java.lang.String r5 = "STARTED"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.STARTED = r3
                r5 = 3
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r5 = new com.google.common.util.concurrent.ExecutionSequencer.RunningState[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.common.util.concurrent.ExecutionSequencer.RunningState.$VALUES = r5
                return
        }

        RunningState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.ExecutionSequencer.RunningState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.ExecutionSequencer$RunningState> r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.ExecutionSequencer$RunningState r1 = (com.google.common.util.concurrent.ExecutionSequencer.RunningState) r1
                return r1
        }

        public static com.google.common.util.concurrent.ExecutionSequencer.RunningState[] values() {
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.ExecutionSequencer$RunningState[] r0 = (com.google.common.util.concurrent.ExecutionSequencer.RunningState[]) r0
                return r0
        }
    }

    private ExecutionSequencer() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateFuture(r1)
            r0.<init>(r1)
            r2.ref = r0
            return
    }

    public static com.google.common.util.concurrent.ExecutionSequencer create() {
            com.google.common.util.concurrent.ExecutionSequencer r0 = new com.google.common.util.concurrent.ExecutionSequencer
            r0.<init>()
            return r0
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.ExecutionSequencer$1 r0 = new com.google.common.util.concurrent.ExecutionSequencer$1
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r1.submitAsync(r0, r3)
            return r2
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submitAsync(com.google.common.util.concurrent.AsyncCallable<T> r8, java.util.concurrent.Executor r9) {
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            com.google.common.util.concurrent.ExecutionSequencer$RunningState r0 = com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN
            r4.<init>(r0)
            com.google.common.util.concurrent.ExecutionSequencer$2 r0 = new com.google.common.util.concurrent.ExecutionSequencer$2
            r0.<init>(r7, r4, r8)
            com.google.common.util.concurrent.SettableFuture r5 = com.google.common.util.concurrent.SettableFuture.create()
            java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.Object>> r8 = r7.ref
            java.lang.Object r8 = r8.getAndSet(r5)
            r6 = r8
            com.google.common.util.concurrent.ListenableFuture r6 = (com.google.common.util.concurrent.ListenableFuture) r6
            com.google.common.util.concurrent.ExecutionSequencer$3 r8 = new com.google.common.util.concurrent.ExecutionSequencer$3
            r8.<init>(r7, r6, r9)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.submitAsync(r0, r8)
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.common.util.concurrent.Futures.nonCancellationPropagating(r2)
            com.google.common.util.concurrent.ExecutionSequencer$4 r0 = new com.google.common.util.concurrent.ExecutionSequencer$4
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r8 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r3.addListener(r0, r8)
            java.util.concurrent.Executor r8 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r0, r8)
            return r3
    }
}
