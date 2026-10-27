package androidx.work.impl.constraints.trackers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Trackers {
    private static androidx.work.impl.constraints.trackers.Trackers sInstance;
    private androidx.work.impl.constraints.trackers.BatteryChargingTracker mBatteryChargingTracker;
    private androidx.work.impl.constraints.trackers.BatteryNotLowTracker mBatteryNotLowTracker;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker mNetworkStateTracker;
    private androidx.work.impl.constraints.trackers.StorageNotLowTracker mStorageNotLowTracker;

    private Trackers(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker
            r0.<init>(r2, r3)
            r1.mBatteryChargingTracker = r0
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker
            r0.<init>(r2, r3)
            r1.mBatteryNotLowTracker = r0
            androidx.work.impl.constraints.trackers.NetworkStateTracker r0 = new androidx.work.impl.constraints.trackers.NetworkStateTracker
            r0.<init>(r2, r3)
            r1.mNetworkStateTracker = r0
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker
            r0.<init>(r2, r3)
            r1.mStorageNotLowTracker = r0
            return
    }

    @androidx.annotation.NonNull
    public static synchronized androidx.work.impl.constraints.trackers.Trackers getInstance(android.content.Context r2, androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            java.lang.Class<androidx.work.impl.constraints.trackers.Trackers> r0 = androidx.work.impl.constraints.trackers.Trackers.class
            monitor-enter(r0)
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.sInstance     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            androidx.work.impl.constraints.trackers.Trackers r1 = new androidx.work.impl.constraints.trackers.Trackers     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            androidx.work.impl.constraints.trackers.Trackers.sInstance = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            androidx.work.impl.constraints.trackers.Trackers r2 = androidx.work.impl.constraints.trackers.Trackers.sInstance     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @androidx.annotation.VisibleForTesting
    public static synchronized void setInstance(@androidx.annotation.NonNull androidx.work.impl.constraints.trackers.Trackers r1) {
            java.lang.Class<androidx.work.impl.constraints.trackers.Trackers> r0 = androidx.work.impl.constraints.trackers.Trackers.class
            monitor-enter(r0)
            androidx.work.impl.constraints.trackers.Trackers.sInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.constraints.trackers.BatteryChargingTracker getBatteryChargingTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = r1.mBatteryChargingTracker
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.constraints.trackers.BatteryNotLowTracker getBatteryNotLowTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = r1.mBatteryNotLowTracker
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.constraints.trackers.NetworkStateTracker getNetworkStateTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.NetworkStateTracker r0 = r1.mNetworkStateTracker
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.impl.constraints.trackers.StorageNotLowTracker getStorageNotLowTracker() {
            r1 = this;
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = r1.mStorageNotLowTracker
            return r0
    }
}
