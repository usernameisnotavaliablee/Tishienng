package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ForceStopRunnable implements java.lang.Runnable {

    @androidx.annotation.VisibleForTesting
    static final java.lang.String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final long BACKOFF_DURATION_MS = 300;

    @androidx.annotation.VisibleForTesting
    static final int MAX_ATTEMPTS = 3;
    private static final java.lang.String TAG = null;
    private static final long TEN_YEARS = 0;
    private final android.content.Context mContext;
    private int mRetryCount;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final java.lang.String TAG = null;

        static {
                java.lang.String r0 = "ForceStopRunnable$Rcvr"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.TAG = r0
                return
        }

        public BroadcastReceiver() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.content.Intent r5) {
                r3 = this;
                if (r5 == 0) goto L1f
                java.lang.String r5 = r5.getAction()
                java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L1f
                androidx.work.Logger r5 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Rescheduling alarm that keeps track of force-stops."
                r5.verbose(r0, r2, r1)
                androidx.work.impl.utils.ForceStopRunnable.setAlarm(r4)
            L1f:
                return
        }
    }

    static {
            java.lang.String r0 = "ForceStopRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.ForceStopRunnable.TAG = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 3650(0xe42, double:1.8033E-320)
            long r0 = r0.toMillis(r1)
            androidx.work.impl.utils.ForceStopRunnable.TEN_YEARS = r0
            return
    }

    public ForceStopRunnable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            r0.mWorkManager = r2
            r1 = 0
            r0.mRetryCount = r1
            return
    }

    @androidx.annotation.VisibleForTesting
    static android.content.Intent getIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r2 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r1.<init>(r3, r2)
            r0.setComponent(r1)
            java.lang.String r3 = "ACTION_FORCE_STOP_RESCHEDULE"
            r0.setAction(r3)
            return r0
    }

    private static android.app.PendingIntent getPendingIntent(android.content.Context r2, int r3) {
            android.content.Intent r0 = getIntent(r2)
            r1 = -1
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r1, r0, r3)
            return r2
    }

    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    static void setAlarm(android.content.Context r5) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastS()
            if (r1 == 0) goto L11
            r1 = 167772160(0xa000000, float:6.162976E-33)
            goto L13
        L11:
            r1 = 134217728(0x8000000, float:3.85186E-34)
        L13:
            android.app.PendingIntent r5 = getPendingIntent(r5, r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = androidx.work.impl.utils.ForceStopRunnable.TEN_YEARS
            long r1 = r1 + r3
            if (r0 == 0) goto L24
            r3 = 0
            r0.setExact(r3, r1, r5)
        L24:
            return
    }

    @androidx.annotation.VisibleForTesting
    public boolean cleanUp() {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L10
            android.content.Context r0 = r11.mContext
            androidx.work.impl.WorkManagerImpl r1 = r11.mWorkManager
            boolean r0 = androidx.work.impl.background.systemjob.SystemJobScheduler.reconcileJobs(r0, r1)
            goto L11
        L10:
            r0 = 0
        L11:
            androidx.work.impl.WorkManagerImpl r1 = r11.mWorkManager
            androidx.work.impl.WorkDatabase r1 = r1.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r3 = r1.workSpecDao()
            androidx.work.impl.model.WorkProgressDao r4 = r1.workProgressDao()
            r1.beginTransaction()
            java.util.List r5 = r3.getRunningWork()     // Catch: java.lang.Throwable -> L31
            r6 = 1
            if (r5 == 0) goto L33
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto L33
            r7 = 1
            goto L34
        L31:
            r0 = move-exception
            goto L69
        L33:
            r7 = 0
        L34:
            if (r7 == 0) goto L59
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L31
        L3a:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L59
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L31
            androidx.work.impl.model.WorkSpec r8 = (androidx.work.impl.model.WorkSpec) r8     // Catch: java.lang.Throwable -> L31
            androidx.work.WorkInfo$State r9 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = r8.id     // Catch: java.lang.Throwable -> L31
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L31
            r3.setState(r9, r10)     // Catch: java.lang.Throwable -> L31
            java.lang.String r8 = r8.id     // Catch: java.lang.Throwable -> L31
            r9 = -1
            r3.markWorkSpecScheduled(r8, r9)     // Catch: java.lang.Throwable -> L31
            goto L3a
        L59:
            r4.deleteAll()     // Catch: java.lang.Throwable -> L31
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31
            r1.endTransaction()
            if (r7 != 0) goto L68
            if (r0 == 0) goto L67
            goto L68
        L67:
            return r2
        L68:
            return r6
        L69:
            r1.endTransaction()
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    public void forceStopRunnable() {
            r5 = this;
            boolean r0 = r5.cleanUp()
            boolean r1 = r5.shouldRescheduleWorkers()
            r2 = 0
            if (r1 == 0) goto L27
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.String r3 = "Rescheduling Workers."
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r0.debug(r1, r3, r4)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            r0.rescheduleEligibleWork()
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            androidx.work.impl.utils.PreferenceUtils r0 = r0.getPreferenceUtils()
            r0.setNeedsReschedule(r2)
            return
        L27:
            boolean r1 = r5.isForceStopped()
            if (r1 == 0) goto L40
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.String r3 = "Application was force-stopped, rescheduling."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.debug(r1, r3, r2)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            r0.rescheduleEligibleWork()
            return
        L40:
            if (r0 == 0) goto L64
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.String r3 = "Found unfinished work, scheduling it."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.debug(r1, r3, r2)
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager
            androidx.work.Configuration r0 = r0.getConfiguration()
            androidx.work.impl.WorkManagerImpl r1 = r5.mWorkManager
            androidx.work.impl.WorkDatabase r1 = r1.getWorkDatabase()
            androidx.work.impl.WorkManagerImpl r2 = r5.mWorkManager
            java.util.List r2 = r2.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r0, r1, r2)
        L64:
            return
    }

    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.VisibleForTesting
    public boolean isForceStopped() {
            r6 = this;
            r0 = 1
            r1 = 0
            boolean r2 = androidx.core.os.BuildCompat.isAtLeastS()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            if (r2 == 0) goto Lb
            r2 = 570425344(0x22000000, float:1.7347235E-18)
            goto Ld
        Lb:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
        Ld:
            android.content.Context r3 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            android.app.PendingIntent r2 = getPendingIntent(r3, r2)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            r4 = 30
            if (r3 < r4) goto L55
            if (r2 == 0) goto L23
            r2.cancel()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            goto L23
        L1f:
            r2 = move-exception
            goto L5e
        L21:
            r2 = move-exception
            goto L5e
        L23:
            android.content.Context r2 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            r3 = 0
            java.util.List r2 = androidx.work.impl.utils.a.a(r2, r3, r1, r1)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            if (r2 == 0) goto L5d
            boolean r3 = r2.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            if (r3 != 0) goto L5d
            r3 = 0
        L3b:
            int r4 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            if (r3 >= r4) goto L5d
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            android.app.ApplicationExitInfo r4 = androidx.work.impl.utils.b.a(r4)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            int r4 = androidx.work.impl.utils.c.a(r4)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            r5 = 10
            if (r4 != r5) goto L52
            return r0
        L52:
            int r3 = r3 + 1
            goto L3b
        L55:
            if (r2 != 0) goto L5d
            android.content.Context r2 = r6.mContext     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            setAlarm(r2)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.SecurityException -> L21
            return r0
        L5d:
            return r1
        L5e:
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Throwable[] r5 = new java.lang.Throwable[r0]
            r5[r1] = r2
            java.lang.String r1 = "Ignoring exception"
            r3.warning(r4, r1, r5)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public boolean multiProcessChecks() {
            r6 = this;
            androidx.work.impl.WorkManagerImpl r0 = r6.mWorkManager
            androidx.work.Configuration r0 = r0.getConfiguration()
            java.lang.String r1 = r0.getDefaultProcessName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.String r4 = "The default process name was not specified."
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.debug(r1, r4, r3)
            return r2
        L20:
            android.content.Context r1 = r6.mContext
            boolean r0 = androidx.work.impl.utils.ProcessUtils.isDefaultProcess(r1, r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.utils.ForceStopRunnable.TAG
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r5
            java.lang.String r5 = "Is default app process = %s"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r1.debug(r4, r2, r3)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r10 = this;
            boolean r0 = r10.multiProcessChecks()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Lc
        L6:
            androidx.work.impl.WorkManagerImpl r0 = r10.mWorkManager
            r0.onForceStopRunnableCompleted()
            return
        Lc:
            android.content.Context r0 = r10.mContext     // Catch: java.lang.Throwable -> L23
            androidx.work.impl.WorkDatabasePathHelper.migrateDatabase(r0)     // Catch: java.lang.Throwable -> L23
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "Performing cleanup operations."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L23
            r0.debug(r1, r2, r4)     // Catch: java.lang.Throwable -> L23
            r10.forceStopRunnable()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteAccessPermException -> L26 android.database.sqlite.SQLiteConstraintException -> L28 android.database.sqlite.SQLiteTableLockedException -> L2a android.database.sqlite.SQLiteDatabaseLockedException -> L2c android.database.sqlite.SQLiteDatabaseCorruptException -> L2e android.database.sqlite.SQLiteCantOpenDatabaseException -> L30
            goto L6
        L23:
            r0 = move-exception
            goto L96
        L26:
            r0 = move-exception
            goto L31
        L28:
            r0 = move-exception
            goto L31
        L2a:
            r0 = move-exception
            goto L31
        L2c:
            r0 = move-exception
            goto L31
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            int r1 = r10.mRetryCount     // Catch: java.lang.Throwable -> L23
            r2 = 1
            int r1 = r1 + r2
            r10.mRetryCount = r1     // Catch: java.lang.Throwable -> L23
            r4 = 3
            if (r1 < r4) goto L6c
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            androidx.work.Logger r4 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L23
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L23
            r6[r3] = r0     // Catch: java.lang.Throwable -> L23
            r4.error(r5, r1, r6)     // Catch: java.lang.Throwable -> L23
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L23
            androidx.work.impl.WorkManagerImpl r0 = r10.mWorkManager     // Catch: java.lang.Throwable -> L23
            androidx.work.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L23
            androidx.work.InitializationExceptionHandler r0 = r0.getExceptionHandler()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L6b
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = "Routing exception to the specified exception handler"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L23
            r2[r3] = r4     // Catch: java.lang.Throwable -> L23
            r1.debug(r5, r6, r2)     // Catch: java.lang.Throwable -> L23
            r0.handleException(r4)     // Catch: java.lang.Throwable -> L23
            goto L6
        L6b:
            throw r4     // Catch: java.lang.Throwable -> L23
        L6c:
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L23
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = androidx.work.impl.utils.ForceStopRunnable.TAG     // Catch: java.lang.Throwable -> L23
            java.lang.String r9 = "Retrying after %s"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            r5[r3] = r4     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = java.lang.String.format(r9, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L23
            r2[r3] = r0     // Catch: java.lang.Throwable -> L23
            r1.debug(r8, r4, r2)     // Catch: java.lang.Throwable -> L23
            int r0 = r10.mRetryCount     // Catch: java.lang.Throwable -> L23
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L23
            long r0 = r0 * r6
            r10.sleep(r0)     // Catch: java.lang.Throwable -> L23
            goto Lc
        L96:
            androidx.work.impl.WorkManagerImpl r1 = r10.mWorkManager
            r1.onForceStopRunnableCompleted()
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    boolean shouldRescheduleWorkers() {
            r1 = this;
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManager
            androidx.work.impl.utils.PreferenceUtils r0 = r0.getPreferenceUtils()
            boolean r0 = r0.getNeedsReschedule()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public void sleep(long r1) {
            r0 = this;
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L3
        L3:
            return
    }
}
