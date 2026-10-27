package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SerialExecutor implements java.util.concurrent.Executor {
    private volatile java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mLock;
    private final java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor.Task> mTasks;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Task implements java.lang.Runnable {
        final java.lang.Runnable mRunnable;
        final androidx.work.impl.utils.SerialExecutor mSerialExecutor;

        Task(@androidx.annotation.NonNull androidx.work.impl.utils.SerialExecutor r1, @androidx.annotation.NonNull java.lang.Runnable r2) {
                r0 = this;
                r0.<init>()
                r0.mSerialExecutor = r1
                r0.mRunnable = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Runnable r0 = r2.mRunnable     // Catch: java.lang.Throwable -> Lb
                r0.run()     // Catch: java.lang.Throwable -> Lb
                androidx.work.impl.utils.SerialExecutor r0 = r2.mSerialExecutor
                r0.scheduleNext()
                return
            Lb:
                r0 = move-exception
                androidx.work.impl.utils.SerialExecutor r1 = r2.mSerialExecutor
                r1.scheduleNext()
                throw r0
        }
    }

    public SerialExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.mTasks = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L15
            androidx.work.impl.utils.SerialExecutor$Task r2 = new androidx.work.impl.utils.SerialExecutor$Task     // Catch: java.lang.Throwable -> L15
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r4 = r3.mActive     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L17
            r3.scheduleNext()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public java.util.concurrent.Executor getDelegatedExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    public boolean hasPendingTasks() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r2.mTasks     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
            r1 = r1 ^ 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    void scheduleNext() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutor$Task> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L17
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L17
            r3.mActive = r1     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L17
            java.lang.Runnable r2 = r3.mActive     // Catch: java.lang.Throwable -> L17
            r1.execute(r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
