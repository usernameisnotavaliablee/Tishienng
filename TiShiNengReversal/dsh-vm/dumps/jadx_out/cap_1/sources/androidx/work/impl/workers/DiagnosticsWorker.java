package androidx.work.impl.workers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DiagnosticsWorker extends androidx.work.Worker {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "DiagnosticsWrkr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.workers.DiagnosticsWorker.TAG = r0
            return
    }

    public DiagnosticsWorker(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String workSpecRow(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.Integer r6, @androidx.annotation.NonNull java.lang.String r7) {
            java.lang.String r0 = r4.id
            java.lang.String r1 = r4.workerClassName
            androidx.work.WorkInfo$State r4 = r4.state
            java.lang.String r4 = r4.name()
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r6
            r6 = 3
            r2[r6] = r4
            r4 = 4
            r2[r4] = r5
            r4 = 5
            r2[r4] = r7
            java.lang.String r4 = "\n%s\t %s\t %s\t %s\t %s\t %s\t"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            return r4
    }

    @androidx.annotation.NonNull
    private static java.lang.String workSpecRows(@androidx.annotation.NonNull androidx.work.impl.model.WorkNameDao r6, @androidx.annotation.NonNull androidx.work.impl.model.WorkTagDao r7, @androidx.annotation.NonNull androidx.work.impl.model.SystemIdInfoDao r8, @androidx.annotation.NonNull java.util.List<androidx.work.impl.model.WorkSpec> r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto Le
            java.lang.String r1 = "Job Id"
            goto L10
        Le:
            java.lang.String r1 = "Alarm Id"
        L10:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.util.Iterator r9 = r9.iterator()
        L23:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r9.next()
            androidx.work.impl.model.WorkSpec r1 = (androidx.work.impl.model.WorkSpec) r1
            java.lang.String r2 = r1.id
            androidx.work.impl.model.SystemIdInfo r2 = r8.getSystemIdInfo(r2)
            if (r2 == 0) goto L3e
            int r2 = r2.systemId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r3 = r1.id
            java.util.List r3 = r6.getNamesForWorkSpecId(r3)
            java.lang.String r4 = r1.id
            java.util.List r4 = r7.getTagsForWorkSpecId(r4)
            java.lang.String r5 = ","
            java.lang.String r3 = android.text.TextUtils.join(r5, r3)
            java.lang.String r4 = android.text.TextUtils.join(r5, r4)
            java.lang.String r1 = workSpecRow(r1, r3, r2, r4)
            r0.append(r1)
            goto L23
        L5d:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // androidx.work.Worker
    @androidx.annotation.NonNull
    public androidx.work.ListenableWorker.Result doWork() {
            r11 = this;
            android.content.Context r0 = r11.getApplicationContext()
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r1 = r0.workSpecDao()
            androidx.work.impl.model.WorkNameDao r2 = r0.workNameDao()
            androidx.work.impl.model.WorkTagDao r3 = r0.workTagDao()
            androidx.work.impl.model.SystemIdInfoDao r0 = r0.systemIdInfoDao()
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            r7 = 1
            long r6 = r6.toMillis(r7)
            long r4 = r4 - r6
            java.util.List r4 = r1.getRecentlyCompletedWork(r4)
            java.util.List r5 = r1.getRunningWork()
            r6 = 200(0xc8, float:2.8E-43)
            java.util.List r1 = r1.getAllEligibleWorkSpecsForScheduling(r6)
            r6 = 0
            if (r4 == 0) goto L5a
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L5a
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r8 = androidx.work.impl.workers.DiagnosticsWorker.TAG
            java.lang.String r9 = "Recently completed work:\n\n"
            java.lang.Throwable[] r10 = new java.lang.Throwable[r6]
            r7.info(r8, r9, r10)
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r4 = workSpecRows(r2, r3, r0, r4)
            java.lang.Throwable[] r9 = new java.lang.Throwable[r6]
            r7.info(r8, r4, r9)
        L5a:
            if (r5 == 0) goto L7c
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L7c
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.workers.DiagnosticsWorker.TAG
            java.lang.String r8 = "Running work:\n\n"
            java.lang.Throwable[] r9 = new java.lang.Throwable[r6]
            r4.info(r7, r8, r9)
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = workSpecRows(r2, r3, r0, r5)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r6]
            r4.info(r7, r5, r8)
        L7c:
            if (r1 == 0) goto L9e
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L9e
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.workers.DiagnosticsWorker.TAG
            java.lang.String r7 = "Enqueued work:\n\n"
            java.lang.Throwable[] r8 = new java.lang.Throwable[r6]
            r4.info(r5, r7, r8)
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = workSpecRows(r2, r3, r0, r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r6]
            r4.info(r5, r0, r1)
        L9e:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success()
            return r0
    }
}
