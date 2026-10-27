package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkManagerImpl extends androidx.work.WorkManager {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final java.lang.String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private static final java.lang.String TAG = null;
    private static androidx.work.impl.WorkManagerImpl sDefaultInstance;
    private static androidx.work.impl.WorkManagerImpl sDelegatedInstance;
    private static final java.lang.Object sLock = null;
    private androidx.work.Configuration mConfiguration;
    private android.content.Context mContext;
    private boolean mForceStopRunnableCompleted;
    private androidx.work.impl.utils.PreferenceUtils mPreferenceUtils;
    private androidx.work.impl.Processor mProcessor;
    private volatile androidx.work.multiprocess.RemoteWorkManager mRemoteWorkManager;
    private android.content.BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;



    static {
            java.lang.String r0 = "WorkManagerImpl"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.WorkManagerImpl.TAG = r0
            r0 = 0
            androidx.work.impl.WorkManagerImpl.sDelegatedInstance = r0
            androidx.work.impl.WorkManagerImpl.sDefaultInstance = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.work.impl.WorkManagerImpl.sLock = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.work.Configuration r4, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r5) {
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            int r1 = androidx.work.R.bool.workmanager_test_configuration
            boolean r0 = r0.getBoolean(r1)
            r2.<init>(r3, r4, r5, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull androidx.work.Configuration r12, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r13, @androidx.annotation.NonNull androidx.work.impl.WorkDatabase r14) {
            r10 = this;
            r10.<init>()
            android.content.Context r0 = r11.getApplicationContext()
            androidx.work.Logger$LogcatLogger r1 = new androidx.work.Logger$LogcatLogger
            int r2 = r12.getMinimumLoggingLevel()
            r1.<init>(r2)
            androidx.work.Logger.setLogger(r1)
            java.util.List r8 = r10.createSchedulers(r0, r12, r13)
            androidx.work.impl.Processor r3 = new androidx.work.impl.Processor
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r9 = r3
            r3 = r10
            r3.internalInit(r4, r5, r6, r7, r8, r9)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.Configuration r2, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r3, @androidx.annotation.NonNull androidx.work.impl.WorkDatabase r4, @androidx.annotation.NonNull java.util.List<androidx.work.impl.Scheduler> r5, @androidx.annotation.NonNull androidx.work.impl.Processor r6) {
            r0 = this;
            r0.<init>()
            r0.internalInit(r1, r2, r3, r4, r5, r6)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.work.Configuration r4, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r5, boolean r6) {
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            androidx.work.impl.utils.SerialExecutor r1 = r5.getBackgroundExecutor()
            androidx.work.impl.WorkDatabase r6 = androidx.work.impl.WorkDatabase.create(r0, r1, r6)
            r2.<init>(r3, r4, r5, r6)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @java.lang.Deprecated
    public static androidx.work.impl.WorkManagerImpl getInstance() {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDelegatedInstance     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            goto Lf
        Lb:
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.work.impl.WorkManagerImpl getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = getInstance()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L2a
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L20
            boolean r1 = r2 instanceof androidx.work.Configuration.Provider     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            r1 = r2
            androidx.work.Configuration$Provider r1 = (androidx.work.Configuration.Provider) r1     // Catch: java.lang.Throwable -> L20
            androidx.work.Configuration r1 = r1.getWorkManagerConfiguration()     // Catch: java.lang.Throwable -> L20
            initialize(r2, r1)     // Catch: java.lang.Throwable -> L20
            androidx.work.impl.WorkManagerImpl r1 = getInstance(r2)     // Catch: java.lang.Throwable -> L20
            goto L2a
        L20:
            r2 = move-exception
            goto L2c
        L22:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r1
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void initialize(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.work.Configuration r5) {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDelegatedInstance     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            androidx.work.impl.WorkManagerImpl r1 = new androidx.work.impl.WorkManagerImpl     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor r2 = new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.getTaskExecutor()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl.sDefaultInstance = r1     // Catch: java.lang.Throwable -> L14
        L30:
            androidx.work.impl.WorkManagerImpl r4 = androidx.work.impl.WorkManagerImpl.sDefaultInstance     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl.sDelegatedInstance = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    private void internalInit(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.Configuration r2, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r3, @androidx.annotation.NonNull androidx.work.impl.WorkDatabase r4, @androidx.annotation.NonNull java.util.List<androidx.work.impl.Scheduler> r5, @androidx.annotation.NonNull androidx.work.impl.Processor r6) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            r0.mConfiguration = r2
            r0.mWorkTaskExecutor = r3
            r0.mWorkDatabase = r4
            r0.mSchedulers = r5
            r0.mProcessor = r6
            androidx.work.impl.utils.PreferenceUtils r2 = new androidx.work.impl.utils.PreferenceUtils
            r2.<init>(r4)
            r0.mPreferenceUtils = r2
            r2 = 0
            r0.mForceStopRunnableCompleted = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L2f
            boolean r2 = androidx.work.impl.a.a(r1)
            if (r2 != 0) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot initialize WorkManager in direct boot mode"
            r1.<init>(r2)
            throw r1
        L2f:
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r0.mWorkTaskExecutor
            androidx.work.impl.utils.ForceStopRunnable r3 = new androidx.work.impl.utils.ForceStopRunnable
            r3.<init>(r1, r0)
            r2.executeOnBackgroundThread(r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDelegate(@androidx.annotation.Nullable androidx.work.impl.WorkManagerImpl r1) {
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl.sDelegatedInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private void tryInitializeMultiProcessSupport() {
            r6 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "androidx.work.multiprocess.RemoteWorkManagerClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L28
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L28
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L28
            java.lang.Class<androidx.work.impl.WorkManagerImpl> r5 = androidx.work.impl.WorkManagerImpl.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.Throwable -> L28
            android.content.Context r4 = r6.mContext     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L28
            r3[r1] = r4     // Catch: java.lang.Throwable -> L28
            r3[r0] = r6     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L28
            androidx.work.multiprocess.RemoteWorkManager r2 = (androidx.work.multiprocess.RemoteWorkManager) r2     // Catch: java.lang.Throwable -> L28
            r6.mRemoteWorkManager = r2     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r2 = move-exception
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.WorkManagerImpl.TAG
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r0[r1] = r2
            java.lang.String r1 = "Unable to initialize multi-process support"
            r3.debug(r4, r1, r0)
            return
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.WorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r3, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r4) {
            r1 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            r0.<init>(r1, r2, r3, r4)
            return r0
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "beginUniqueWork needs at least one OneTimeWorkRequest."
            r2.<init>(r3)
            throw r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.WorkContinuation beginWith(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            r0.<init>(r1, r2)
            return r0
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "beginWith needs at least one OneTimeWorkRequest."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation cancelAllWork() {
            r2 = this;
            androidx.work.impl.utils.CancelWorkRunnable r0 = androidx.work.impl.utils.CancelWorkRunnable.forAll(r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            r1.executeOnBackgroundThread(r0)
            androidx.work.Operation r0 = r0.getOperation()
            return r0
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation cancelAllWorkByTag(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forTag(r2, r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            r0.executeOnBackgroundThread(r2)
            androidx.work.Operation r2 = r2.getOperation()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation cancelUniqueWork(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 1
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forName(r2, r1, r0)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            r0.executeOnBackgroundThread(r2)
            androidx.work.Operation r2 = r2.getOperation()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation cancelWorkById(@androidx.annotation.NonNull java.util.UUID r2) {
            r1 = this;
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forId(r2, r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            r0.executeOnBackgroundThread(r2)
            androidx.work.Operation r2 = r2.getOperation()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public android.app.PendingIntent createCancelPendingIntent(@androidx.annotation.NonNull java.util.UUID r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            java.lang.String r4 = r4.toString()
            android.content.Intent r4 = androidx.work.impl.foreground.SystemForegroundDispatcher.createCancelWorkIntent(r0, r4)
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastS()
            if (r0 == 0) goto L13
            r0 = 167772160(0xa000000, float:6.162976E-33)
            goto L15
        L13:
            r0 = 134217728(0x8000000, float:3.85186E-34)
        L15:
            android.content.Context r1 = r3.mContext
            r2 = 0
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r1, r2, r4, r0)
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.List<androidx.work.impl.Scheduler> createSchedulers(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.work.Configuration r4, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r5) {
            r2 = this;
            androidx.work.impl.Scheduler r0 = androidx.work.impl.Schedulers.createBestAvailableBackgroundScheduler(r3, r2)
            androidx.work.impl.background.greedy.GreedyScheduler r1 = new androidx.work.impl.background.greedy.GreedyScheduler
            r1.<init>(r3, r4, r5, r2)
            r3 = 2
            androidx.work.impl.Scheduler[] r3 = new androidx.work.impl.Scheduler[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.work.ExistingPeriodicWorkPolicy r3, @androidx.annotation.NonNull androidx.work.PeriodicWorkRequest r4) {
            r1 = this;
            androidx.work.ExistingPeriodicWorkPolicy r0 = androidx.work.ExistingPeriodicWorkPolicy.KEEP
            if (r3 != r0) goto L7
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.KEEP
            goto L9
        L7:
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.REPLACE
        L9:
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation enqueue(@androidx.annotation.NonNull java.util.List<? extends androidx.work.WorkRequest> r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L10
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            r0.<init>(r1, r2)
            androidx.work.Operation r2 = r0.enqueue()
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "enqueue needs at least one WorkRequest."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation enqueueUniquePeriodicWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingPeriodicWorkPolicy r2, @androidx.annotation.NonNull androidx.work.PeriodicWorkRequest r3) {
            r0 = this;
            androidx.work.impl.WorkContinuationImpl r1 = r0.createWorkContinuationForUniquePeriodicWork(r1, r2, r3)
            androidx.work.Operation r1 = r1.enqueue()
            return r1
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r3, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r4) {
            r1 = this;
            androidx.work.impl.WorkContinuationImpl r0 = new androidx.work.impl.WorkContinuationImpl
            r0.<init>(r1, r2, r3, r4)
            androidx.work.Operation r2 = r0.enqueue()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.Configuration getConfiguration() {
            r1 = this;
            androidx.work.Configuration r0 = r1.mConfiguration
            return r0
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Long> getLastCancelAllTimeMillis() {
            r4 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.PreferenceUtils r1 = r4.mPreferenceUtils
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r4.mWorkTaskExecutor
            androidx.work.impl.WorkManagerImpl$1 r3 = new androidx.work.impl.WorkManagerImpl$1
            r3.<init>(r4, r0, r1)
            r2.executeOnBackgroundThread(r3)
            return r0
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
            r1 = this;
            androidx.work.impl.utils.PreferenceUtils r0 = r1.mPreferenceUtils
            androidx.lifecycle.LiveData r0 = r0.getLastCancelAllTimeMillisLiveData()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.PreferenceUtils getPreferenceUtils() {
            r1 = this;
            androidx.work.impl.utils.PreferenceUtils r0 = r1.mPreferenceUtils
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.Processor getProcessor() {
            r1 = this;
            androidx.work.impl.Processor r0 = r1.mProcessor
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.multiprocess.RemoteWorkManager getRemoteWorkManager() {
            r3 = this;
            androidx.work.multiprocess.RemoteWorkManager r0 = r3.mRemoteWorkManager
            if (r0 != 0) goto L2d
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            androidx.work.multiprocess.RemoteWorkManager r1 = r3.mRemoteWorkManager     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r3.tryInitializeMultiProcessSupport()     // Catch: java.lang.Throwable -> L27
            androidx.work.multiprocess.RemoteWorkManager r1 = r3.mRemoteWorkManager     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            androidx.work.Configuration r1 = r3.mConfiguration     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.getDefaultProcessName()     // Catch: java.lang.Throwable -> L27
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            goto L29
        L1f:
            java.lang.String r1 = "Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L27:
            r1 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
        L2d:
            androidx.work.multiprocess.RemoteWorkManager r0 = r3.mRemoteWorkManager
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.List<androidx.work.impl.Scheduler> getSchedulers() {
            r1 = this;
            java.util.List<androidx.work.impl.Scheduler> r0 = r1.mSchedulers
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.WorkDatabase getWorkDatabase() {
            r1 = this;
            androidx.work.impl.WorkDatabase r0 = r1.mWorkDatabase
            return r0
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> getWorkInfoById(@androidx.annotation.NonNull java.util.UUID r2) {
            r1 = this;
            androidx.work.impl.utils.StatusRunnable r2 = androidx.work.impl.utils.StatusRunnable.forUUID(r1, r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r0.execute(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getFuture()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData(@androidx.annotation.NonNull java.util.UUID r3) {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            java.lang.String r3 = r3.toString()
            java.util.List r3 = java.util.Collections.singletonList(r3)
            androidx.lifecycle.LiveData r3 = r0.getWorkStatusPojoLiveDataForIds(r3)
            androidx.work.impl.WorkManagerImpl$2 r0 = new androidx.work.impl.WorkManagerImpl$2
            r0.<init>(r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            androidx.lifecycle.LiveData r3 = androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(@androidx.annotation.NonNull androidx.work.WorkQuery r2) {
            r1 = this;
            androidx.work.impl.utils.StatusRunnable r2 = androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec(r1, r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r0.execute(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getFuture()
            return r2
    }

    androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosById(@androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            androidx.lifecycle.LiveData r3 = r0.getWorkStatusPojoLiveDataForIds(r3)
            androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec$WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> r0 = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            androidx.lifecycle.LiveData r3 = androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTag(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.work.impl.utils.StatusRunnable r2 = androidx.work.impl.utils.StatusRunnable.forTag(r1, r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r0.execute(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getFuture()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagLiveData(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            androidx.lifecycle.LiveData r3 = r0.getWorkStatusPojoLiveDataForTag(r3)
            androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec$WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> r0 = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            androidx.lifecycle.LiveData r3 = androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWork(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.work.impl.utils.StatusRunnable r2 = androidx.work.impl.utils.StatusRunnable.forUniqueWork(r1, r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r0.execute(r2)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getFuture()
            return r2
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkLiveData(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            androidx.lifecycle.LiveData r3 = r0.getWorkStatusPojoLiveDataForName(r3)
            androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec$WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> r0 = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            androidx.lifecycle.LiveData r3 = androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData(@androidx.annotation.NonNull androidx.work.WorkQuery r3) {
            r2 = this;
            androidx.work.impl.WorkDatabase r0 = r2.mWorkDatabase
            androidx.work.impl.model.RawWorkInfoDao r0 = r0.rawWorkInfoDao()
            androidx.sqlite.db.SupportSQLiteQuery r3 = androidx.work.impl.utils.RawQueries.workQueryToRawQuery(r3)
            androidx.lifecycle.LiveData r3 = r0.getWorkInfoPojosLiveData(r3)
            androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec$WorkInfoPojo>, java.util.List<androidx.work.WorkInfo>> r0 = androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            androidx.lifecycle.LiveData r3 = androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(r3, r0, r1)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.TaskExecutor getWorkTaskExecutor() {
            r1 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.mWorkTaskExecutor
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onForceStopRunnableCompleted() {
            r2 = this;
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            r1 = 1
            r2.mForceStopRunnableCompleted = r1     // Catch: java.lang.Throwable -> L11
            android.content.BroadcastReceiver$PendingResult r1 = r2.mRescheduleReceiverResult     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r1.finish()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r2.mRescheduleReceiverResult = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.NonNull
    public androidx.work.Operation pruneWork() {
            r2 = this;
            androidx.work.impl.utils.PruneWorkRunnable r0 = new androidx.work.impl.utils.PruneWorkRunnable
            r0.<init>(r2)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.mWorkTaskExecutor
            r1.executeOnBackgroundThread(r0)
            androidx.work.Operation r0 = r0.getOperation()
            return r0
    }

    public void rescheduleEligibleWork() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.content.Context r0 = r3.getApplicationContext()
            androidx.work.impl.background.systemjob.SystemJobScheduler.cancelAll(r0)
        Ld:
            androidx.work.impl.WorkDatabase r0 = r3.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()
            r0.resetScheduledState()
            androidx.work.Configuration r0 = r3.getConfiguration()
            androidx.work.impl.WorkDatabase r1 = r3.getWorkDatabase()
            java.util.List r2 = r3.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r0, r1, r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setReschedulePendingResult(@androidx.annotation.NonNull android.content.BroadcastReceiver.PendingResult r3) {
            r2 = this;
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.sLock
            monitor-enter(r0)
            r2.mRescheduleReceiverResult = r3     // Catch: java.lang.Throwable -> L10
            boolean r1 = r2.mForceStopRunnableCompleted     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r3.finish()     // Catch: java.lang.Throwable -> L10
            r3 = 0
            r2.mRescheduleReceiverResult = r3     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void startWork(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.startWork(r2, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void startWork(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable androidx.work.WorkerParameters.RuntimeExtras r4) {
            r2 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.mWorkTaskExecutor
            androidx.work.impl.utils.StartWorkRunnable r1 = new androidx.work.impl.utils.StartWorkRunnable
            r1.<init>(r2, r3, r4)
            r0.executeOnBackgroundThread(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void stopForegroundWork(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r3.mWorkTaskExecutor
            androidx.work.impl.utils.StopWorkRunnable r1 = new androidx.work.impl.utils.StopWorkRunnable
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.executeOnBackgroundThread(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void stopWork(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r3.mWorkTaskExecutor
            androidx.work.impl.utils.StopWorkRunnable r1 = new androidx.work.impl.utils.StopWorkRunnable
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.executeOnBackgroundThread(r1)
            return
    }
}
