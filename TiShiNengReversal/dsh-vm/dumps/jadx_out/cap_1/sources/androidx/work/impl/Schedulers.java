package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Schedulers {
    public static final java.lang.String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "Schedulers"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.Schedulers.TAG = r0
            return
    }

    private Schedulers() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.work.impl.Scheduler createBestAvailableBackgroundScheduler(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L20
            androidx.work.impl.background.systemjob.SystemJobScheduler r0 = new androidx.work.impl.background.systemjob.SystemJobScheduler
            r0.<init>(r4, r5)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r5 = androidx.work.impl.background.systemjob.SystemJobService.class
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(r4, r5, r3)
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.Schedulers.TAG
            java.lang.String r1 = "Created SystemJobScheduler and enabled SystemJobService"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r4.debug(r5, r1, r2)
            return r0
        L20:
            androidx.work.impl.Scheduler r5 = tryCreateGcmBasedScheduler(r4)
            if (r5 != 0) goto L3d
            androidx.work.impl.background.systemalarm.SystemAlarmScheduler r5 = new androidx.work.impl.background.systemalarm.SystemAlarmScheduler
            r5.<init>(r4)
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r0 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(r4, r0, r3)
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.Schedulers.TAG
            java.lang.String r1 = "Created SystemAlarmScheduler"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r4.debug(r0, r1, r2)
        L3d:
            return r5
    }

    public static void schedule(@androidx.annotation.NonNull androidx.work.Configuration r6, @androidx.annotation.NonNull androidx.work.impl.WorkDatabase r7, java.util.List<androidx.work.impl.Scheduler> r8) {
            if (r8 == 0) goto La9
            int r0 = r8.size()
            if (r0 != 0) goto La
            goto La9
        La:
            androidx.work.impl.model.WorkSpecDao r0 = r7.workSpecDao()
            r7.beginTransaction()
            int r6 = r6.getMaxSchedulerLimit()     // Catch: java.lang.Throwable -> L41
            java.util.List r6 = r0.getEligibleWorkForScheduling(r6)     // Catch: java.lang.Throwable -> L41
            r1 = 200(0xc8, float:2.8E-43)
            java.util.List r1 = r0.getAllEligibleWorkSpecsForScheduling(r1)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L43
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L41
            if (r2 <= 0) goto L43
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r4 = r6.iterator()     // Catch: java.lang.Throwable -> L41
        L2f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L41
            androidx.work.impl.model.WorkSpec r5 = (androidx.work.impl.model.WorkSpec) r5     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.id     // Catch: java.lang.Throwable -> L41
            r0.markWorkSpecScheduled(r5, r2)     // Catch: java.lang.Throwable -> L41
            goto L2f
        L41:
            r6 = move-exception
            goto La5
        L43:
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L41
            r7.endTransaction()
            if (r6 == 0) goto L77
            int r7 = r6.size()
            if (r7 <= 0) goto L77
            int r7 = r6.size()
            androidx.work.impl.model.WorkSpec[] r7 = new androidx.work.impl.model.WorkSpec[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            androidx.work.impl.model.WorkSpec[] r6 = (androidx.work.impl.model.WorkSpec[]) r6
            java.util.Iterator r7 = r8.iterator()
        L61:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r7.next()
            androidx.work.impl.Scheduler r0 = (androidx.work.impl.Scheduler) r0
            boolean r2 = r0.hasLimitedSchedulingSlots()
            if (r2 == 0) goto L61
            r0.schedule(r6)
            goto L61
        L77:
            if (r1 == 0) goto La9
            int r6 = r1.size()
            if (r6 <= 0) goto La9
            int r6 = r1.size()
            androidx.work.impl.model.WorkSpec[] r6 = new androidx.work.impl.model.WorkSpec[r6]
            java.lang.Object[] r6 = r1.toArray(r6)
            androidx.work.impl.model.WorkSpec[] r6 = (androidx.work.impl.model.WorkSpec[]) r6
            java.util.Iterator r7 = r8.iterator()
        L8f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La9
            java.lang.Object r8 = r7.next()
            androidx.work.impl.Scheduler r8 = (androidx.work.impl.Scheduler) r8
            boolean r0 = r8.hasLimitedSchedulingSlots()
            if (r0 != 0) goto L8f
            r8.schedule(r6)
            goto L8f
        La5:
            r7.endTransaction()
            throw r6
        La9:
            return
    }

    @androidx.annotation.Nullable
    private static androidx.work.impl.Scheduler tryCreateGcmBasedScheduler(@androidx.annotation.NonNull android.content.Context r7) {
            java.lang.String r0 = "androidx.work.impl.background.gcm.GcmScheduler"
            r1 = 1
            r2 = 0
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r2] = r5     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            r4[r2] = r7     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L32
            androidx.work.impl.Scheduler r7 = (androidx.work.impl.Scheduler) r7     // Catch: java.lang.Throwable -> L32
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = androidx.work.impl.Schedulers.TAG     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "Created %s"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            r6[r2] = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L32
            r3.debug(r4, r0, r5)     // Catch: java.lang.Throwable -> L32
            return r7
        L32:
            r7 = move-exception
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.Schedulers.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r1[r2] = r7
            java.lang.String r7 = "Unable to create GCM Scheduler"
            r0.debug(r3, r7, r1)
            r7 = 0
            return r7
    }
}
