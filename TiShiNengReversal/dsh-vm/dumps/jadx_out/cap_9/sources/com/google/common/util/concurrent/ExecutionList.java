package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ExecutionList {
    private static final java.util.logging.Logger log = null;

    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private boolean executed;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair runnables;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class RunnableExecutorPair {
        final java.util.concurrent.Executor executor;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair next;
        final java.lang.Runnable runnable;

        RunnableExecutorPair(java.lang.Runnable r1, java.util.concurrent.Executor r2, com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair r3) {
                r0 = this;
                r0.<init>()
                r0.runnable = r1
                r0.executor = r2
                r0.next = r3
                return
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ExecutionList> r0 = com.google.common.util.concurrent.ExecutionList.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ExecutionList.log = r0
            return
    }

    public ExecutionList() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.ExecutionList.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = " with executor "
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = r3.toString()
            r1.log(r2, r5, r0)
            return
    }

    public void add(java.lang.Runnable r3, java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            monitor-enter(r2)
            boolean r0 = r2.executed     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = new com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair     // Catch: java.lang.Throwable -> L1a
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r2.runnables     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L1a
            r2.runnables = r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r3 = move-exception
            goto L21
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            executeListener(r3, r4)
            return
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public void execute() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.executed     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L28
        L9:
            r0 = 1
            r3.executed = r0     // Catch: java.lang.Throwable -> L7
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = r3.runnables     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r3.runnables = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
        L12:
            if (r0 == 0) goto L1b
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r2 = r0.next
            r0.next = r1
            r1 = r0
            r0 = r2
            goto L12
        L1b:
            if (r1 == 0) goto L27
            java.lang.Runnable r0 = r1.runnable
            java.util.concurrent.Executor r2 = r1.executor
            executeListener(r0, r2)
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r1.next
            goto L1b
        L27:
            return
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r0
    }
}
