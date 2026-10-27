package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkTimer {
    private static final java.lang.String TAG = null;
    private final java.util.concurrent.ThreadFactory mBackgroundThreadFactory;
    private final java.util.concurrent.ScheduledExecutorService mExecutorService;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> mListeners;
    final java.lang.Object mLock;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> mTimerMap;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@androidx.annotation.NonNull java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class WorkTimerRunnable implements java.lang.Runnable {
        static final java.lang.String TAG = "WrkTimerRunnable";
        private final java.lang.String mWorkSpecId;
        private final androidx.work.impl.utils.WorkTimer mWorkTimer;

        WorkTimerRunnable(@androidx.annotation.NonNull androidx.work.impl.utils.WorkTimer r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mWorkTimer = r1
                r0.mWorkSpecId = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                androidx.work.impl.utils.WorkTimer r0 = r7.mWorkTimer
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.work.impl.utils.WorkTimer r1 = r7.mWorkTimer     // Catch: java.lang.Throwable -> L27
                java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r1 = r1.mTimerMap     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L27
                androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = (androidx.work.impl.utils.WorkTimer.WorkTimerRunnable) r1     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L29
                androidx.work.impl.utils.WorkTimer r1 = r7.mWorkTimer     // Catch: java.lang.Throwable -> L27
                java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r1 = r1.mListeners     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L27
                androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener r1 = (androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener) r1     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L42
                java.lang.String r2 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L27
                r1.onTimeLimitExceeded(r2)     // Catch: java.lang.Throwable -> L27
                goto L42
            L27:
                r1 = move-exception
                goto L44
            L29:
                androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = "WrkTimerRunnable"
                java.lang.String r3 = "Timer with %s is already marked as complete."
                java.lang.String r4 = r7.mWorkSpecId     // Catch: java.lang.Throwable -> L27
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L27
                r6 = 0
                r5[r6] = r4     // Catch: java.lang.Throwable -> L27
                java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L27
                java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L27
                r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L27
            L42:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L44:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                throw r1
        }
    }

    static {
            java.lang.String r0 = "WorkTimer"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkTimer.TAG = r0
            return
    }

    public WorkTimer() {
            r2 = this;
            r2.<init>()
            androidx.work.impl.utils.WorkTimer$1 r0 = new androidx.work.impl.utils.WorkTimer$1
            r0.<init>(r2)
            r2.mBackgroundThreadFactory = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mTimerMap = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mListeners = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.mLock = r1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            r2.mExecutorService = r0
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public java.util.concurrent.ScheduledExecutorService getExecutorService() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.mExecutorService
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public synchronized java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> getListeners() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r0 = r1.mListeners     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public synchronized java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> getTimerMap() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r0 = r1.mTimerMap     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void onDestroy() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.mExecutorService
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = r1.mExecutorService
            r0.shutdownNow()
        Ld:
            return
    }

    public void startTimer(@androidx.annotation.NonNull java.lang.String r7, long r8, @androidx.annotation.NonNull androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener r10) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = androidx.work.impl.utils.WorkTimer.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "Starting timer for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L35
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L35
            r6.stopTimer(r7)     // Catch: java.lang.Throwable -> L35
            androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = new androidx.work.impl.utils.WorkTimer$WorkTimerRunnable     // Catch: java.lang.Throwable -> L35
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L35
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r2 = r6.mTimerMap     // Catch: java.lang.Throwable -> L35
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L35
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r2 = r6.mListeners     // Catch: java.lang.Throwable -> L35
            r2.put(r7, r10)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ScheduledExecutorService r7 = r6.mExecutorService     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L35
            r7.schedule(r1, r8, r10)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r7
    }

    public void stopTimer(@androidx.annotation.NonNull java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$WorkTimerRunnable> r1 = r6.mTimerMap     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.remove(r7)     // Catch: java.lang.Throwable -> L2a
            androidx.work.impl.utils.WorkTimer$WorkTimerRunnable r1 = (androidx.work.impl.utils.WorkTimer.WorkTimerRunnable) r1     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = androidx.work.impl.utils.WorkTimer.TAG     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "Stopping timer for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch: java.lang.Throwable -> L2a
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener> r1 = r6.mListeners     // Catch: java.lang.Throwable -> L2a
            r1.remove(r7)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r7 = move-exception
            goto L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }
}
