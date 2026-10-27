package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final java.util.logging.Logger log = null;
    private final java.util.concurrent.Executor executor;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private final java.util.Deque<java.lang.Runnable> queue;
    private final com.google.common.util.concurrent.SequentialExecutor.QueueWorker worker;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private long workerRunCount;

    @com.google.errorprone.annotations.concurrent.GuardedBy("queue")
    private com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState workerRunningState;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class QueueWorker implements java.lang.Runnable {
        final /* synthetic */ com.google.common.util.concurrent.SequentialExecutor this$0;

        private QueueWorker(com.google.common.util.concurrent.SequentialExecutor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ QueueWorker(com.google.common.util.concurrent.SequentialExecutor r1, com.google.common.util.concurrent.SequentialExecutor.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void workOnQueue() {
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = r8.this$0     // Catch: java.lang.Throwable -> L51
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.access$100(r2)     // Catch: java.lang.Throwable -> L51
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.SequentialExecutor r0 = r8.this$0     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L46
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L46
            L20:
                r0 = move-exception
                goto L6f
            L22:
                com.google.common.util.concurrent.SequentialExecutor r0 = r8.this$0     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor r0 = r8.this$0     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.SequentialExecutor r3 = r8.this$0     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.access$100(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L47
                com.google.common.util.concurrent.SequentialExecutor r0 = r8.this$0     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L46
                goto L18
            L46:
                return
            L47:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L51
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L51 java.lang.RuntimeException -> L53
                goto L2
            L51:
                r0 = move-exception
                goto L71
            L53:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L51
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L51
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
                r6.<init>()     // Catch: java.lang.Throwable -> L51
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L51
                r6.append(r3)     // Catch: java.lang.Throwable -> L51
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L51
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L51
                goto L2
            L6f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L51
            L71:
                if (r1 == 0) goto L7a
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L7a:
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r4.workOnQueue()     // Catch: java.lang.Error -> L4
                return
            L4:
                r0 = move-exception
                com.google.common.util.concurrent.SequentialExecutor r1 = r4.this$0
                java.util.Deque r1 = com.google.common.util.concurrent.SequentialExecutor.access$100(r1)
                monitor-enter(r1)
                com.google.common.util.concurrent.SequentialExecutor r2 = r4.this$0     // Catch: java.lang.Throwable -> L15
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L15
                com.google.common.util.concurrent.SequentialExecutor.access$202(r2, r3)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                throw r0
            L15:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum WorkerRunningState extends java.lang.Enum<com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState> {
        private static final /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[] $VALUES = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState IDLE = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState QUEUED = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState QUEUING = null;
        public static final com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState RUNNING = null;

        static {
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE = r0
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r3 = "QUEUING"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING = r1
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r5 = "QUEUED"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED = r3
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r5 = new com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState
                java.lang.String r7 = "RUNNING"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING = r5
                r7 = 4
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r7 = new com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.$VALUES = r7
                return
        }

        WorkerRunningState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState> r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = (com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState) r1
                return r1
        }

        public static com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[] values() {
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState[] r0 = (com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.SequentialExecutor> r0 = com.google.common.util.concurrent.SequentialExecutor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.SequentialExecutor.log = r0
            return
    }

    SequentialExecutor(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.queue = r0
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE
            r2.workerRunningState = r0
            r0 = 0
            r2.workerRunCount = r0
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r0 = new com.google.common.util.concurrent.SequentialExecutor$QueueWorker
            r1 = 0
            r0.<init>(r2, r1)
            r2.worker = r0
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            r2.executor = r3
            return
    }

    static /* synthetic */ java.util.Deque access$100(com.google.common.util.concurrent.SequentialExecutor r0) {
            java.util.Deque<java.lang.Runnable> r0 = r0.queue
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState access$200(com.google.common.util.concurrent.SequentialExecutor r0) {
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r0.workerRunningState
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState access$202(com.google.common.util.concurrent.SequentialExecutor r0, com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState r1) {
            r0.workerRunningState = r1
            return r1
    }

    static /* synthetic */ long access$308(com.google.common.util.concurrent.SequentialExecutor r4) {
            long r0 = r4.workerRunCount
            r2 = 1
            long r2 = r2 + r0
            r4.workerRunCount = r2
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$400() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.SequentialExecutor.log
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r8) {
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.queue
            monitor-enter(r0)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.workerRunningState     // Catch: java.lang.Throwable -> L6d
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.workerRunCount     // Catch: java.lang.Throwable -> L6d
            com.google.common.util.concurrent.SequentialExecutor$1 r1 = new com.google.common.util.concurrent.SequentialExecutor$1     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.queue     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r8 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.workerRunningState = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.executor     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r5 = r7.worker     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.workerRunningState
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.queue
            monitor-enter(r0)
            long r5 = r7.workerRunCount     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.workerRunningState     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.workerRunningState = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.queue
            monitor-enter(r2)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.workerRunningState     // Catch: java.lang.Throwable -> L55
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.queue     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.queue     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
    }
}
