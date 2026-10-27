package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final java.lang.String TAG = "SequentialExecutor";
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.GuardedBy("mQueue")
    final java.util.Deque<java.lang.Runnable> mQueue;
    private final androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker mWorker;

    @androidx.annotation.GuardedBy("mQueue")
    long mWorkerRunCount;

    @androidx.annotation.GuardedBy("mQueue")
    androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState mWorkerRunningState;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class QueueWorker implements java.lang.Runnable {
        final /* synthetic */ androidx.camera.core.impl.utils.executor.SequentialExecutor this$0;

        QueueWorker(androidx.camera.core.impl.utils.executor.SequentialExecutor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void workOnQueue() {
                r9 = this;
                r0 = 0
                r1 = 0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = r9.this$0     // Catch: java.lang.Throwable -> L49
                java.util.Deque<java.lang.Runnable> r2 = r2.mQueue     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.mWorkerRunningState     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L3e
            L1c:
                r0 = move-exception
                goto L63
            L1e:
                long r5 = r0.mWorkerRunCount     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.mWorkerRunCount = r5     // Catch: java.lang.Throwable -> L1c
                r0.mWorkerRunningState = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = r9.this$0     // Catch: java.lang.Throwable -> L1c
                java.util.Deque<java.lang.Runnable> r3 = r3.mQueue     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = r9.this$0     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r0 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                androidx.camera.core.Logger.e(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L6e:
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r4.workOnQueue()     // Catch: java.lang.Error -> L4
                return
            L4:
                r0 = move-exception
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = r4.this$0
                java.util.Deque<java.lang.Runnable> r1 = r1.mQueue
                monitor-enter(r1)
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = r4.this$0     // Catch: java.lang.Throwable -> L12
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L12
                r2.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
            L12:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum WorkerRunningState extends java.lang.Enum<androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState> {
        private static final /* synthetic */ androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState[] $VALUES = null;
        public static final androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState IDLE = null;
        public static final androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState QUEUED = null;
        public static final androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState QUEUING = null;
        public static final androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState RUNNING = null;

        private static /* synthetic */ androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState[] $values() {
                r0 = 4
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState[] r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState[r0]
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE = r0
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "QUEUING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING = r0
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "QUEUED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED = r0
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState
                java.lang.String r1 = "RUNNING"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING = r0
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState[] r0 = $values()
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.$VALUES = r0
                return
        }

        WorkerRunningState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState> r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = (androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState) r1
                return r1
        }

        public static androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState[] values() {
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState[] r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState[] r0 = (androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState[]) r0
                return r0
        }
    }

    SequentialExecutor(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mQueue = r0
            androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker
            r0.<init>(r2)
            r2.mWorker = r0
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE
            r2.mWorkerRunningState = r0
            r0 = 0
            r2.mWorkerRunCount = r0
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            r2.mExecutor = r3
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r8) {
            r7 = this;
            androidx.core.util.Preconditions.checkNotNull(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue
            monitor-enter(r0)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.mWorkerRunCount     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$1 r1 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$1     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.mQueue     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r8 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.mWorkerRunningState = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.mExecutor     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker r5 = r7.mWorker     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.mWorkerRunningState
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue
            monitor-enter(r0)
            long r5 = r7.mWorkerRunCount     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.mWorkerRunningState = r2     // Catch: java.lang.Throwable -> L3e
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
            java.util.Deque<java.lang.Runnable> r2 = r7.mQueue
            monitor-enter(r2)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.mWorkerRunningState     // Catch: java.lang.Throwable -> L55
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.mQueue     // Catch: java.lang.Throwable -> L55
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
            java.util.Deque<java.lang.Runnable> r1 = r7.mQueue     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
    }
}
