package androidx.work.impl.constraints.trackers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends androidx.work.impl.constraints.trackers.ConstraintTracker<T> {
    private static final java.lang.String TAG = null;
    private final android.content.BroadcastReceiver mBroadcastReceiver;


    static {
            java.lang.String r0 = "BrdcstRcvrCnstrntTrckr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG = r0
            return
    }

    public BroadcastReceiverConstraintTracker(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1 r1 = new androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1
            r1.<init>(r0)
            r0.mBroadcastReceiver = r1
            return
    }

    public abstract android.content.IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(android.content.Context r1, @androidx.annotation.NonNull android.content.Intent r2);

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "%s: registering receiver"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            android.content.Context r0 = r5.mAppContext
            android.content.BroadcastReceiver r1 = r5.mBroadcastReceiver
            android.content.IntentFilter r2 = r5.getIntentFilter()
            r0.registerReceiver(r1, r2)
            return
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.TAG
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "%s: unregistering receiver"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r2, r3)
            android.content.Context r0 = r5.mAppContext
            android.content.BroadcastReceiver r1 = r5.mBroadcastReceiver
            r0.unregisterReceiver(r1)
            return
    }
}
