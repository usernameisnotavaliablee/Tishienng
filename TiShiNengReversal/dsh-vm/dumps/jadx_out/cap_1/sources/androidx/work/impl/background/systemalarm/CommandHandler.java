package androidx.work.impl.background.systemalarm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CommandHandler implements androidx.work.impl.ExecutionListener {
    static final java.lang.String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final java.lang.String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final java.lang.String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final java.lang.String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final java.lang.String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final java.lang.String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final java.lang.String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final java.lang.String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final java.lang.String TAG = null;
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final android.content.Context mContext;
    private final java.lang.Object mLock;
    private final java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> mPendingDelayMet;

    static {
            java.lang.String r0 = "CommandHandler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.CommandHandler.TAG = r0
            return
    }

    CommandHandler(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mPendingDelayMet = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    static android.content.Intent createConstraintsChangedIntent(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_CONSTRAINTS_CHANGED"
            r0.setAction(r2)
            return r0
    }

    static android.content.Intent createDelayMetIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_DELAY_MET"
            r0.setAction(r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            r0.putExtra(r2, r3)
            return r0
    }

    static android.content.Intent createExecutionCompletedIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, boolean r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_EXECUTION_COMPLETED"
            r0.setAction(r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "KEY_NEEDS_RESCHEDULE"
            r0.putExtra(r2, r4)
            return r0
    }

    static android.content.Intent createRescheduleIntent(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_RESCHEDULE"
            r0.setAction(r2)
            return r0
    }

    static android.content.Intent createScheduleWorkIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_SCHEDULE_WORK"
            r0.setAction(r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            r0.putExtra(r2, r3)
            return r0
    }

    static android.content.Intent createStopWorkIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "ACTION_STOP_WORK"
            r0.setAction(r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            r0.putExtra(r2, r3)
            return r0
    }

    private void handleConstraintsChanged(@androidx.annotation.NonNull android.content.Intent r5, int r6, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r7) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Handling constraints changed %s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.debug(r1, r5, r2)
            androidx.work.impl.background.systemalarm.ConstraintsCommandHandler r5 = new androidx.work.impl.background.systemalarm.ConstraintsCommandHandler
            android.content.Context r0 = r4.mContext
            r5.<init>(r0, r6, r7)
            r5.handleConstraintsChanged()
            return
    }

    private void handleDelayMet(@androidx.annotation.NonNull android.content.Intent r8, int r9, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r10) {
            r7 = this;
            android.os.Bundle r8 = r8.getExtras()
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            java.lang.String r1 = "KEY_WORKSPEC_ID"
            java.lang.String r8 = r8.getString(r1)     // Catch: java.lang.Throwable -> L3c
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = androidx.work.impl.background.systemalarm.CommandHandler.TAG     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "Handing delay met for %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            r6 = 0
            r5[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L3c
            r1.debug(r2, r3, r5)     // Catch: java.lang.Throwable -> L3c
            java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> r1 = r7.mPendingDelayMet     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L3e
            androidx.work.impl.background.systemalarm.DelayMetCommandHandler r1 = new androidx.work.impl.background.systemalarm.DelayMetCommandHandler     // Catch: java.lang.Throwable -> L3c
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2, r9, r8, r10)     // Catch: java.lang.Throwable -> L3c
            java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> r9 = r7.mPendingDelayMet     // Catch: java.lang.Throwable -> L3c
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L3c
            r1.handleProcessWork()     // Catch: java.lang.Throwable -> L3c
            goto L51
        L3c:
            r8 = move-exception
            goto L53
        L3e:
            androidx.work.Logger r9 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            r1[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = java.lang.String.format(r10, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.Throwable[] r10 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L3c
            r9.debug(r2, r8, r10)     // Catch: java.lang.Throwable -> L3c
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    private void handleExecutionCompleted(@androidx.annotation.NonNull android.content.Intent r7, int r8) {
            r6 = this;
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r1 = "KEY_WORKSPEC_ID"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "KEY_NEEDS_RESCHEDULE"
            boolean r0 = r0.getBoolean(r2)
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r7
            r7 = 1
            r4[r7] = r8
            java.lang.String r7 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r5]
            r2.debug(r3, r7, r8)
            r6.onExecuted(r1, r0)
            return
    }

    private void handleReschedule(@androidx.annotation.NonNull android.content.Intent r5, int r6, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r7) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            java.lang.String r5 = "Handling reschedule %s, %s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r0.debug(r1, r5, r6)
            androidx.work.impl.WorkManagerImpl r5 = r7.getWorkManager()
            r5.rescheduleEligibleWork()
            return
    }

    private void handleScheduleWorkIntent(@androidx.annotation.NonNull android.content.Intent r11, int r12, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r13) {
            r10 = this;
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r11
            java.lang.String r5 = "Handling schedule work for %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.debug(r1, r3, r5)
            androidx.work.impl.WorkManagerImpl r0 = r13.getWorkManager()
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            r0.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r3 = r0.workSpecDao()     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.model.WorkSpec r3 = r3.getWorkSpec(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Skipping scheduling "
            if (r3 != 0) goto L5c
            androidx.work.Logger r12 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r13.<init>()     // Catch: java.lang.Throwable -> L59
            r13.append(r5)     // Catch: java.lang.Throwable -> L59
            r13.append(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = " because it's no longer in the DB"
            r13.append(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.Throwable[] r13 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L59
            r12.warning(r1, r11, r13)     // Catch: java.lang.Throwable -> L59
            r0.endTransaction()
            return
        L59:
            r11 = move-exception
            goto Lea
        L5c:
            androidx.work.WorkInfo$State r6 = r3.state     // Catch: java.lang.Throwable -> L59
            boolean r6 = r6.isFinished()     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L85
            androidx.work.Logger r12 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r13.<init>()     // Catch: java.lang.Throwable -> L59
            r13.append(r5)     // Catch: java.lang.Throwable -> L59
            r13.append(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = "because it is finished."
            r13.append(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.Throwable[] r13 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L59
            r12.warning(r1, r11, r13)     // Catch: java.lang.Throwable -> L59
            r0.endTransaction()
            return
        L85:
            long r5 = r3.calculateNextRunTime()     // Catch: java.lang.Throwable -> L59
            boolean r3 = r3.hasConstraints()     // Catch: java.lang.Throwable -> L59
            r7 = 2
            if (r3 != 0) goto Lb3
            androidx.work.Logger r12 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "Setting up Alarms for %s at %s"
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L59
            r7[r4] = r11     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = java.lang.String.format(r3, r7)     // Catch: java.lang.Throwable -> L59
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L59
            r12.debug(r1, r2, r3)     // Catch: java.lang.Throwable -> L59
            android.content.Context r12 = r10.mContext     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.WorkManagerImpl r13 = r13.getWorkManager()     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.background.systemalarm.Alarms.setAlarm(r12, r13, r11, r5)     // Catch: java.lang.Throwable -> L59
            goto Le3
        Lb3:
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L59
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L59
            r7[r4] = r11     // Catch: java.lang.Throwable -> L59
            r7[r2] = r9     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = java.lang.String.format(r8, r7)     // Catch: java.lang.Throwable -> L59
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L59
            r3.debug(r1, r2, r4)     // Catch: java.lang.Throwable -> L59
            android.content.Context r1 = r10.mContext     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.WorkManagerImpl r2 = r13.getWorkManager()     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.background.systemalarm.Alarms.setAlarm(r1, r2, r11, r5)     // Catch: java.lang.Throwable -> L59
            android.content.Context r11 = r10.mContext     // Catch: java.lang.Throwable -> L59
            android.content.Intent r11 = createConstraintsChangedIntent(r11)     // Catch: java.lang.Throwable -> L59
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable r1 = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable     // Catch: java.lang.Throwable -> L59
            r1.<init>(r13, r11, r12)     // Catch: java.lang.Throwable -> L59
            r13.postOnMainThread(r1)     // Catch: java.lang.Throwable -> L59
        Le3:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L59
            r0.endTransaction()
            return
        Lea:
            r0.endTransaction()
            throw r11
    }

    private void handleStopWork(@androidx.annotation.NonNull android.content.Intent r6, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r7) {
            r5 = this;
            android.os.Bundle r6 = r6.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r6 = r6.getString(r0)
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.debug(r1, r2, r4)
            androidx.work.impl.WorkManagerImpl r0 = r7.getWorkManager()
            r0.stopWork(r6)
            android.content.Context r0 = r5.mContext
            androidx.work.impl.WorkManagerImpl r1 = r7.getWorkManager()
            androidx.work.impl.background.systemalarm.Alarms.cancelAlarm(r0, r1, r6)
            r7.onExecuted(r6, r3)
            return
    }

    private static boolean hasKeys(@androidx.annotation.Nullable android.os.Bundle r4, @androidx.annotation.NonNull java.lang.String... r5) {
            r0 = 0
            if (r4 == 0) goto L1c
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L1c
        La:
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L17
            return r0
        L17:
            int r2 = r2 + 1
            goto Lc
        L1a:
            r4 = 1
            return r4
        L1c:
            return r0
    }

    boolean hasPendingCommands() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> r1 = r2.mPendingDelayMet     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
            r1 = r1 ^ 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@androidx.annotation.NonNull java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> r1 = r2.mPendingDelayMet     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            androidx.work.impl.ExecutionListener r1 = (androidx.work.impl.ExecutionListener) r1     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r1.onExecuted(r3, r4)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @androidx.annotation.WorkerThread
    void onHandleIntent(@androidx.annotation.NonNull android.content.Intent r6, int r7, @androidx.annotation.NonNull androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r8) {
            r5 = this;
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L10
            r5.handleConstraintsChanged(r6, r7, r8)
            return
        L10:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c
            r5.handleReschedule(r6, r7, r8)
            return
        L1c:
            android.os.Bundle r1 = r6.getExtras()
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            java.lang.String[] r3 = new java.lang.String[]{r2}
            boolean r1 = hasKeys(r1, r3)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L47
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r0
            r8[r3] = r2
            java.lang.String r0 = "Invalid request for %s, requires %s."
            java.lang.String r8 = java.lang.String.format(r0, r8)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r4]
            r6.error(r7, r8, r0)
            return
        L47:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L53
            r5.handleScheduleWorkIntent(r6, r7, r8)
            return
        L53:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5f
            r5.handleDelayMet(r6, r7, r8)
            return
        L5f:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L6b
            r5.handleStopWork(r6, r8)
            return
        L6b:
            java.lang.String r8 = "ACTION_EXECUTION_COMPLETED"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L77
            r5.handleExecutionCompleted(r6, r7)
            return
        L77:
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.background.systemalarm.CommandHandler.TAG
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r6
            java.lang.String r6 = "Ignoring intent %s"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r4]
            r7.warning(r8, r6, r0)
            return
    }
}
