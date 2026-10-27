package androidx.work.impl.diagnostics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "DiagnosticsRcvr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG = r0
            return
    }

    public DiagnosticsReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable android.content.Intent r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG
            java.lang.String r1 = "Requesting diagnostics"
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.debug(r0, r1, r3)
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)     // Catch: java.lang.IllegalStateException -> L1f
            java.lang.Class<androidx.work.impl.workers.DiagnosticsWorker> r6 = androidx.work.impl.workers.DiagnosticsWorker.class
            androidx.work.OneTimeWorkRequest r6 = androidx.work.OneTimeWorkRequest.from(r6)     // Catch: java.lang.IllegalStateException -> L1f
            r5.enqueue(r6)     // Catch: java.lang.IllegalStateException -> L1f
            return
        L1f:
            r5 = move-exception
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG
            r1 = 1
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r1[r2] = r5
            java.lang.String r5 = "WorkManager is not initialized"
            r6.error(r0, r5, r1)
            return
    }
}
