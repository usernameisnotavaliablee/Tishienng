package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EnqueueRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = null;
    private final androidx.work.impl.OperationImpl mOperation;
    private final androidx.work.impl.WorkContinuationImpl mWorkContinuation;

    static {
            java.lang.String r0 = "EnqueueRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.EnqueueRunnable.TAG = r0
            return
    }

    public EnqueueRunnable(@androidx.annotation.NonNull androidx.work.impl.WorkContinuationImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkContinuation = r1
            androidx.work.impl.OperationImpl r1 = new androidx.work.impl.OperationImpl
            r1.<init>()
            r0.mOperation = r1
            return
    }

    private static boolean enqueueContinuation(@androidx.annotation.NonNull androidx.work.impl.WorkContinuationImpl r5) {
            java.util.Set r0 = androidx.work.impl.WorkContinuationImpl.prerequisitesFor(r5)
            androidx.work.impl.WorkManagerImpl r1 = r5.getWorkManagerImpl()
            java.util.List r2 = r5.getWork()
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r3 = r5.getName()
            androidx.work.ExistingWorkPolicy r4 = r5.getExistingWorkPolicy()
            boolean r0 = enqueueWorkWithPrerequisites(r1, r2, r0, r3, r4)
            r5.markEnqueued()
            return r0
    }

    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r20, @androidx.annotation.NonNull java.util.List<? extends androidx.work.WorkRequest> r21, java.lang.String[] r22, java.lang.String r23, androidx.work.ExistingWorkPolicy r24) {
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r0.getWorkDatabase()
            r7 = 1
            if (r1 == 0) goto L18
            int r9 = r1.length
            if (r9 <= 0) goto L18
            r9 = 1
            goto L19
        L18:
            r9 = 0
        L19:
            if (r9 == 0) goto L5f
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L20:
            if (r11 >= r10) goto L62
            r15 = r1[r11]
            r16 = 0
            androidx.work.impl.model.WorkSpecDao r8 = r6.workSpecDao()
            androidx.work.impl.model.WorkSpec r8 = r8.getWorkSpec(r15)
            if (r8 != 0) goto L47
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.EnqueueRunnable.TAG
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r16] = r15
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.error(r1, r2, r4)
            return r3
        L47:
            androidx.work.WorkInfo$State r8 = r8.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r8 != r15) goto L4f
            r15 = 1
            goto L50
        L4f:
            r15 = 0
        L50:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r8 != r15) goto L57
            r14 = 1
            goto L5c
        L57:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r8 != r15) goto L5c
            r13 = 1
        L5c:
            int r11 = r11 + 1
            goto L20
        L5f:
            r12 = 1
            r13 = 0
            r14 = 0
        L62:
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L14e
            if (r9 != 0) goto L14e
            androidx.work.impl.model.WorkSpecDao r10 = r6.workSpecDao()
            java.util.List r10 = r10.getWorkSpecIdAndStatesForName(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L14e
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND
            if (r3 == r11) goto L80
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r11) goto L82
        L80:
            r11 = 0
            goto Lc9
        L82:
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.KEEP
            if (r3 != r11) goto La2
            java.util.Iterator r3 = r10.iterator()
        L8a:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto La2
            java.lang.Object r11 = r3.next()
            androidx.work.impl.model.WorkSpec$IdAndState r11 = (androidx.work.impl.model.WorkSpec.IdAndState) r11
            androidx.work.WorkInfo$State r11 = r11.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r11 == r15) goto La0
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r11 != r15) goto L8a
        La0:
            r11 = 0
            return r11
        La2:
            r11 = 0
            androidx.work.impl.utils.CancelWorkRunnable r3 = androidx.work.impl.utils.CancelWorkRunnable.forName(r2, r0, r11)
            r3.run()
            androidx.work.impl.model.WorkSpecDao r3 = r6.workSpecDao()
            java.util.Iterator r10 = r10.iterator()
        Lb2:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto Lc4
            java.lang.Object r15 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r15 = (androidx.work.impl.model.WorkSpec.IdAndState) r15
            java.lang.String r15 = r15.id
            r3.delete(r15)
            goto Lb2
        Lc4:
            r17 = r6
            r3 = 1
            goto L151
        Lc9:
            androidx.work.impl.model.DependencyDao r9 = r6.dependencyDao()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        Ld6:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L111
            java.lang.Object r16 = r10.next()
            r7 = r16
            androidx.work.impl.model.WorkSpec$IdAndState r7 = (androidx.work.impl.model.WorkSpec.IdAndState) r7
            java.lang.String r11 = r7.id
            boolean r11 = r9.hasDependents(r11)
            if (r11 != 0) goto L10a
            androidx.work.WorkInfo$State r11 = r7.state
            r17 = r6
            androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r11 != r6) goto Lf6
            r6 = 1
            goto Lf7
        Lf6:
            r6 = 0
        Lf7:
            r6 = r6 & r12
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.FAILED
            if (r11 != r12) goto Lfe
            r14 = 1
            goto L103
        Lfe:
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.CANCELLED
            if (r11 != r12) goto L103
            r13 = 1
        L103:
            java.lang.String r7 = r7.id
            r15.add(r7)
            r12 = r6
            goto L10c
        L10a:
            r17 = r6
        L10c:
            r6 = r17
            r7 = 1
            r11 = 0
            goto Ld6
        L111:
            r17 = r6
            androidx.work.ExistingWorkPolicy r6 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r6) goto L13e
            if (r13 != 0) goto L11b
            if (r14 == 0) goto L13e
        L11b:
            androidx.work.impl.model.WorkSpecDao r3 = r17.workSpecDao()
            java.util.List r6 = r3.getWorkSpecIdAndStatesForName(r2)
            java.util.Iterator r6 = r6.iterator()
        L127:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L139
            java.lang.Object r7 = r6.next()
            androidx.work.impl.model.WorkSpec$IdAndState r7 = (androidx.work.impl.model.WorkSpec.IdAndState) r7
            java.lang.String r7 = r7.id
            r3.delete(r7)
            goto L127
        L139:
            java.util.List r15 = java.util.Collections.EMPTY_LIST
            r3 = 0
            r13 = 0
            goto L13f
        L13e:
            r3 = r14
        L13f:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r6 = r1.length
            if (r6 <= 0) goto L14a
            r9 = 1
            goto L14b
        L14a:
            r9 = 0
        L14b:
            r14 = r3
        L14c:
            r3 = 0
            goto L151
        L14e:
            r17 = r6
            goto L14c
        L151:
            java.util.Iterator r6 = r21.iterator()
        L155:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L215
            java.lang.Object r7 = r6.next()
            androidx.work.WorkRequest r7 = (androidx.work.WorkRequest) r7
            androidx.work.impl.model.WorkSpec r10 = r7.getWorkSpec()
            if (r9 == 0) goto L180
            if (r12 != 0) goto L180
            if (r14 == 0) goto L174
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            r10.state = r11
        L16f:
            r21 = r3
            r18 = r4
            goto L191
        L174:
            if (r13 == 0) goto L17b
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            r10.state = r11
            goto L16f
        L17b:
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.BLOCKED
            r10.state = r11
            goto L16f
        L180:
            boolean r11 = r10.isPeriodic()
            if (r11 != 0) goto L189
            r10.periodStartTime = r4
            goto L16f
        L189:
            r21 = r3
            r18 = r4
            r3 = 0
            r10.periodStartTime = r3
        L191:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L19f
            r4 = 25
            if (r3 > r4) goto L19f
            tryDelegateConstrainedWorkSpec(r10)
            goto L1ae
        L19f:
            r4 = 22
            if (r3 > r4) goto L1ae
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = usesScheduler(r0, r3)
            if (r3 == 0) goto L1ae
            tryDelegateConstrainedWorkSpec(r10)
        L1ae:
            androidx.work.WorkInfo$State r3 = r10.state
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.ENQUEUED
            if (r3 != r4) goto L1b6
            r3 = 1
            goto L1b8
        L1b6:
            r3 = r21
        L1b8:
            androidx.work.impl.model.WorkSpecDao r4 = r17.workSpecDao()
            r4.insertWorkSpec(r10)
            if (r9 == 0) goto L1da
            int r4 = r1.length
            r5 = 0
        L1c3:
            if (r5 >= r4) goto L1da
            r10 = r1[r5]
            androidx.work.impl.model.Dependency r11 = new androidx.work.impl.model.Dependency
            java.lang.String r15 = r7.getStringId()
            r11.<init>(r15, r10)
            androidx.work.impl.model.DependencyDao r10 = r17.dependencyDao()
            r10.insertDependency(r11)
            int r5 = r5 + 1
            goto L1c3
        L1da:
            java.util.Set r4 = r7.getTags()
            java.util.Iterator r4 = r4.iterator()
        L1e2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1ff
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            androidx.work.impl.model.WorkTagDao r10 = r17.workTagDao()
            androidx.work.impl.model.WorkTag r11 = new androidx.work.impl.model.WorkTag
            java.lang.String r15 = r7.getStringId()
            r11.<init>(r5, r15)
            r10.insert(r11)
            goto L1e2
        L1ff:
            if (r8 != 0) goto L211
            androidx.work.impl.model.WorkNameDao r4 = r17.workNameDao()
            androidx.work.impl.model.WorkName r5 = new androidx.work.impl.model.WorkName
            java.lang.String r7 = r7.getStringId()
            r5.<init>(r2, r7)
            r4.insert(r5)
        L211:
            r4 = r18
            goto L155
        L215:
            r21 = r3
            return r21
    }

    private static boolean processContinuation(@androidx.annotation.NonNull androidx.work.impl.WorkContinuationImpl r7) {
            java.util.List r0 = r7.getParents()
            r1 = 0
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()
            androidx.work.impl.WorkContinuationImpl r3 = (androidx.work.impl.WorkContinuationImpl) r3
            boolean r4 = r3.isEnqueued()
            if (r4 != 0) goto L24
            boolean r3 = processContinuation(r3)
            r2 = r2 | r3
            goto Lc
        L24:
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.utils.EnqueueRunnable.TAG
            java.lang.String r6 = ", "
            java.util.List r3 = r3.getIds()
            java.lang.String r3 = android.text.TextUtils.join(r6, r3)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r3
            java.lang.String r3 = "Already enqueued work ids (%s)."
            java.lang.String r3 = java.lang.String.format(r3, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r1]
            r4.warning(r5, r3, r6)
            goto Lc
        L45:
            r1 = r2
        L46:
            boolean r7 = enqueueContinuation(r7)
            r7 = r7 | r1
            return r7
    }

    private static void tryDelegateConstrainedWorkSpec(androidx.work.impl.model.WorkSpec r5) {
            androidx.work.Constraints r0 = r5.constraints
            java.lang.String r1 = r5.workerClassName
            java.lang.Class<androidx.work.impl.workers.ConstraintTrackingWorker> r2 = androidx.work.impl.workers.ConstraintTrackingWorker.class
            java.lang.String r3 = r2.getName()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L38
            boolean r3 = r0.requiresBatteryNotLow()
            if (r3 != 0) goto L1c
            boolean r0 = r0.requiresStorageNotLow()
            if (r0 == 0) goto L38
        L1c:
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            androidx.work.Data r3 = r5.input
            androidx.work.Data$Builder r3 = r0.putAll(r3)
            java.lang.String r4 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            r3.putString(r4, r1)
            java.lang.String r1 = r2.getName()
            r5.workerClassName = r1
            androidx.work.Data r0 = r0.build()
            r5.input = r0
        L38:
            return
    }

    private static boolean usesScheduler(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L25
            java.util.List r2 = r2.getSchedulers()     // Catch: java.lang.ClassNotFoundException -> L25
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L25
        Ld:
            boolean r1 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L25
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L25
            androidx.work.impl.Scheduler r1 = (androidx.work.impl.Scheduler) r1     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L25
            boolean r1 = r3.isAssignableFrom(r1)     // Catch: java.lang.ClassNotFoundException -> L25
            if (r1 == 0) goto Ld
            r2 = 1
            return r2
        L25:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public boolean addToDatabase() {
            r2 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r2.mWorkContinuation
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            r0.beginTransaction()
            androidx.work.impl.WorkContinuationImpl r1 = r2.mWorkContinuation     // Catch: java.lang.Throwable -> L1a
            boolean r1 = processContinuation(r1)     // Catch: java.lang.Throwable -> L1a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            r0.endTransaction()
            return r1
        L1a:
            r1 = move-exception
            r0.endTransaction()
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.work.Operation getOperation() {
            r1 = this;
            androidx.work.impl.OperationImpl r0 = r1.mOperation
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.hasCycles()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 != 0) goto L2c
            boolean r0 = r5.addToDatabase()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            androidx.work.impl.WorkContinuationImpl r0 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L22
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()     // Catch: java.lang.Throwable -> L22
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(r0, r2, r1)     // Catch: java.lang.Throwable -> L22
            r5.scheduleWorkInBackground()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L3f
        L24:
            androidx.work.impl.OperationImpl r0 = r5.mOperation     // Catch: java.lang.Throwable -> L22
            androidx.work.Operation$State$SUCCESS r1 = androidx.work.Operation.SUCCESS     // Catch: java.lang.Throwable -> L22
            r0.setState(r1)     // Catch: java.lang.Throwable -> L22
            return
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "WorkContinuation has cycles (%s)"
            androidx.work.impl.WorkContinuationImpl r3 = r5.mWorkContinuation     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r4 = 0
            r1[r4] = r3     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L3f:
            androidx.work.impl.OperationImpl r1 = r5.mOperation
            androidx.work.Operation$State$FAILURE r2 = new androidx.work.Operation$State$FAILURE
            r2.<init>(r0)
            r1.setState(r2)
            return
    }

    @androidx.annotation.VisibleForTesting
    public void scheduleWorkInBackground() {
            r3 = this;
            androidx.work.impl.WorkContinuationImpl r0 = r3.mWorkContinuation
            androidx.work.impl.WorkManagerImpl r0 = r0.getWorkManagerImpl()
            androidx.work.Configuration r1 = r0.getConfiguration()
            androidx.work.impl.WorkDatabase r2 = r0.getWorkDatabase()
            java.util.List r0 = r0.getSchedulers()
            androidx.work.impl.Schedulers.schedule(r1, r2, r0)
            return
    }
}
