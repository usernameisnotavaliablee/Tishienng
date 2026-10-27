package androidx.work.impl.background.systemalarm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SystemAlarmScheduler implements androidx.work.impl.Scheduler {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext;

    static {
            java.lang.String r0 = "SystemAlarmScheduler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.SystemAlarmScheduler.TAG = r0
            return
    }

    public SystemAlarmScheduler(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            return
    }

    private void scheduleWorkSpec(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r6) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmScheduler.TAG
            java.lang.String r2 = r6.id
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Scheduling work with workSpecId %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            android.content.Context r0 = r5.mContext
            java.lang.String r6 = r6.id
            android.content.Intent r6 = androidx.work.impl.background.systemalarm.CommandHandler.createScheduleWorkIntent(r0, r6)
            android.content.Context r0 = r5.mContext
            r0.startService(r6)
            return
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.content.Intent r2 = androidx.work.impl.background.systemalarm.CommandHandler.createStopWorkIntent(r0, r2)
            android.content.Context r0 = r1.mContext
            r0.startService(r2)
            return
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.scheduleWorkSpec(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }
}
