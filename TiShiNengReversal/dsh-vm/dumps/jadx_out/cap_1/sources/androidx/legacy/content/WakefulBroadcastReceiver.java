package androidx.legacy.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks = r0
            r0 = 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r0
            return
    }

    public WakefulBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean completeWakefulIntent(android.content.Intent r3) {
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1 = 0
            int r3 = r3.getIntExtra(r0, r1)
            if (r3 != 0) goto La
            return r1
        La:
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L1e
            android.os.PowerManager$WakeLock r1 = (android.os.PowerManager.WakeLock) r1     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r1 == 0) goto L20
            r1.release()     // Catch: java.lang.Throwable -> L1e
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r3 = move-exception
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    public static android.content.ComponentName startWakefulService(android.content.Context r5, android.content.Intent r6) {
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r0)
            int r1 = androidx.legacy.content.WakefulBroadcastReceiver.mNextId     // Catch: java.lang.Throwable -> Lf
            int r2 = r1 + 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r2     // Catch: java.lang.Throwable -> Lf
            r3 = 1
            if (r2 > 0) goto L11
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r5 = move-exception
            goto L4f
        L11:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r6.putExtra(r2, r1)     // Catch: java.lang.Throwable -> Lf
            android.content.ComponentName r6 = r5.startService(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L1f
            r5 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L1f:
            java.lang.String r2 = "power"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> Lf
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "androidx.core:wake:"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r6.flattenToShortString()     // Catch: java.lang.Throwable -> Lf
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r3, r2)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r5.setReferenceCounted(r2)     // Catch: java.lang.Throwable -> Lf
            r2 = 60000(0xea60, double:2.9644E-319)
            r5.acquire(r2)     // Catch: java.lang.Throwable -> Lf
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r6
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }
}
