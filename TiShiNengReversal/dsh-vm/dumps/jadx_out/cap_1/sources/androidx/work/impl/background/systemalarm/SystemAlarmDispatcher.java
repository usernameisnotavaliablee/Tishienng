package androidx.work.impl.background.systemalarm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SystemAlarmDispatcher implements androidx.work.impl.ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final java.lang.String KEY_START_ID = "KEY_START_ID";
    private static final java.lang.String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final java.lang.String TAG = null;
    final androidx.work.impl.background.systemalarm.CommandHandler mCommandHandler;

    @androidx.annotation.Nullable
    private androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener mCompletedListener;
    final android.content.Context mContext;
    android.content.Intent mCurrentIntent;
    final java.util.List<android.content.Intent> mIntents;
    private final android.os.Handler mMainHandler;
    private final androidx.work.impl.Processor mProcessor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;
    private final androidx.work.impl.utils.WorkTimer mWorkTimer;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AddRunnable implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
        private final android.content.Intent mIntent;
        private final int mStartId;

        AddRunnable(@androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r1, @androidx.annotation.NonNull android.content.Intent r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.mDispatcher = r1
                r0.mIntent = r2
                r0.mStartId = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r3.mDispatcher
                android.content.Intent r1 = r3.mIntent
                int r2 = r3.mStartId
                r0.add(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DequeueAndCheckForCompletion implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(@androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r1) {
                r0 = this;
                r0.<init>()
                r0.mDispatcher = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r1.mDispatcher
                r0.dequeueAndCheckForCompletion()
                return
        }
    }

    static {
            java.lang.String r0 = "SystemAlarmDispatcher"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG = r0
            return
    }

    SystemAlarmDispatcher(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    SystemAlarmDispatcher(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable androidx.work.impl.Processor r4, @androidx.annotation.Nullable androidx.work.impl.WorkManagerImpl r5) {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getApplicationContext()
            r2.mContext = r0
            androidx.work.impl.background.systemalarm.CommandHandler r1 = new androidx.work.impl.background.systemalarm.CommandHandler
            r1.<init>(r0)
            r2.mCommandHandler = r1
            androidx.work.impl.utils.WorkTimer r0 = new androidx.work.impl.utils.WorkTimer
            r0.<init>()
            r2.mWorkTimer = r0
            if (r5 == 0) goto L1a
            goto L1e
        L1a:
            androidx.work.impl.WorkManagerImpl r5 = androidx.work.impl.WorkManagerImpl.getInstance(r3)
        L1e:
            r2.mWorkManager = r5
            if (r4 == 0) goto L23
            goto L27
        L23:
            androidx.work.impl.Processor r4 = r5.getProcessor()
        L27:
            r2.mProcessor = r4
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r5.getWorkTaskExecutor()
            r2.mTaskExecutor = r3
            r4.addExecutionListener(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mIntents = r3
            r3 = 0
            r2.mCurrentIntent = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r2.mMainHandler = r3
            return
    }

    private void assertMainThread() {
            r2 = this;
            android.os.Handler r0 = r2.mMainHandler
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Needs to be invoked on the main thread."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.MainThread
    private boolean hasIntentWithAction(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            r3.assertMainThread()
            java.util.List<android.content.Intent> r0 = r3.mIntents
            monitor-enter(r0)
            java.util.List<android.content.Intent> r1 = r3.mIntents     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r2.getAction()     // Catch: java.lang.Throwable -> L25
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto Lc
            r4 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r4 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r4
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @androidx.annotation.MainThread
    private void processCommand() {
            r3 = this;
            r3.assertMainThread()
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "ProcessCommand"
            android.os.PowerManager$WakeLock r0 = androidx.work.impl.utils.WakeLocks.newWakeLock(r0, r1)
            r0.acquire()     // Catch: java.lang.Throwable -> L20
            androidx.work.impl.WorkManagerImpl r1 = r3.mWorkManager     // Catch: java.lang.Throwable -> L20
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L20
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$1 r2 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$1     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            r1.executeOnBackgroundThread(r2)     // Catch: java.lang.Throwable -> L20
            r0.release()
            return
        L20:
            r1 = move-exception
            r0.release()
            throw r1
    }

    @androidx.annotation.MainThread
    public boolean add(@androidx.annotation.NonNull android.content.Intent r8, int r9) {
            r7 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG
            java.lang.String r2 = "Adding command %s (%s)"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r8
            r6 = 1
            r4[r6] = r3
            java.lang.String r2 = java.lang.String.format(r2, r4)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.debug(r1, r2, r3)
            r7.assertMainThread()
            java.lang.String r0 = r8.getAction()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L37
            androidx.work.Logger r8 = androidx.work.Logger.get()
            java.lang.String r9 = "Unknown command. Ignoring"
            java.lang.Throwable[] r0 = new java.lang.Throwable[r5]
            r8.warning(r1, r9, r0)
            return r5
        L37:
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r0 = r7.hasIntentWithAction(r0)
            if (r0 == 0) goto L48
            return r5
        L48:
            java.lang.String r0 = "KEY_START_ID"
            r8.putExtra(r0, r9)
            java.util.List<android.content.Intent> r9 = r7.mIntents
            monitor-enter(r9)
            java.util.List<android.content.Intent> r0 = r7.mIntents     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            java.util.List<android.content.Intent> r1 = r7.mIntents     // Catch: java.lang.Throwable -> L61
            r1.add(r8)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L63
            r7.processCommand()     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r8 = move-exception
            goto L65
        L63:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            return r6
        L65:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            throw r8
    }

    @androidx.annotation.MainThread
    void dequeueAndCheckForCompletion() {
            r7 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG
            java.lang.String r2 = "Checking if commands are complete."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.debug(r1, r2, r4)
            r7.assertMainThread()
            java.util.List<android.content.Intent> r0 = r7.mIntents
            monitor-enter(r0)
            android.content.Intent r2 = r7.mCurrentIntent     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L4c
            androidx.work.Logger r2 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "Removing command %s"
            android.content.Intent r5 = r7.mCurrentIntent     // Catch: java.lang.Throwable -> L42
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L42
            r6[r3] = r5     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L42
            r2.debug(r1, r4, r5)     // Catch: java.lang.Throwable -> L42
            java.util.List<android.content.Intent> r2 = r7.mIntents     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L42
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L42
            android.content.Intent r4 = r7.mCurrentIntent     // Catch: java.lang.Throwable -> L42
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            r2 = 0
            r7.mCurrentIntent = r2     // Catch: java.lang.Throwable -> L42
            goto L4c
        L42:
            r1 = move-exception
            goto L88
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Dequeue-d command is not the first."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L42
        L4c:
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r7.mTaskExecutor     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.utils.SerialExecutor r2 = r2.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.background.systemalarm.CommandHandler r4 = r7.mCommandHandler     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4.hasPendingCommands()     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L7b
            java.util.List<android.content.Intent> r4 = r7.mIntents     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L7b
            boolean r2 = r2.hasPendingTasks()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L7b
            androidx.work.Logger r2 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "No more commands & intents."
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L42
            r2.debug(r1, r4, r3)     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$CommandsCompletedListener r1 = r7.mCompletedListener     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L86
            r1.onAllCommandsCompleted()     // Catch: java.lang.Throwable -> L42
            goto L86
        L7b:
            java.util.List<android.content.Intent> r1 = r7.mIntents     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L86
            r7.processCommand()     // Catch: java.lang.Throwable -> L42
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
    }

    androidx.work.impl.Processor getProcessor() {
            r1 = this;
            androidx.work.impl.Processor r0 = r1.mProcessor
            return r0
    }

    androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
            r1 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mTaskExecutor
            return r0
    }

    androidx.work.impl.WorkManagerImpl getWorkManager() {
            r1 = this;
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManager
            return r0
    }

    androidx.work.impl.utils.WorkTimer getWorkTimer() {
            r1 = this;
            androidx.work.impl.utils.WorkTimer r0 = r1.mWorkTimer
            return r0
    }

    void onDestroy() {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG
            r2 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Destroying SystemAlarmDispatcher"
            r0.debug(r1, r3, r2)
            androidx.work.impl.Processor r0 = r4.mProcessor
            r0.removeExecutionListener(r4)
            androidx.work.impl.utils.WorkTimer r0 = r4.mWorkTimer
            r0.onDestroy()
            r0 = 0
            r4.mCompletedListener = r0
            return
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@androidx.annotation.NonNull java.lang.String r3, boolean r4) {
            r2 = this;
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r0 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable
            android.content.Context r1 = r2.mContext
            android.content.Intent r3 = androidx.work.impl.background.systemalarm.CommandHandler.createExecutionCompletedIntent(r1, r3, r4)
            r4 = 0
            r0.<init>(r2, r3, r4)
            r2.postOnMainThread(r0)
            return
    }

    void postOnMainThread(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mMainHandler
            r0.post(r2)
            return
    }

    void setCompletedListener(@androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener r4) {
            r3 = this;
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$CommandsCompletedListener r0 = r3.mCompletedListener
            if (r0 == 0) goto L13
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = "A completion listener for SystemAlarmDispatcher already exists."
            r4.error(r0, r2, r1)
            return
        L13:
            r3.mCompletedListener = r4
            return
    }
}
