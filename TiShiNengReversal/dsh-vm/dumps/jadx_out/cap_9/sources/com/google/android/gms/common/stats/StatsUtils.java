package com.google.android.gms.common.stats;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class StatsUtils {
    public StatsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getEventKey(@androidx.annotation.NonNull android.os.PowerManager.WakeLock r4, @androidx.annotation.NonNull java.lang.String r5) {
            int r0 = android.os.Process.myPid()
            long r0 = (long) r0
            int r4 = java.lang.System.identityHashCode(r4)
            long r2 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r0 = r0 | r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r0 != r1) goto L1b
            java.lang.String r5 = ""
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            return r4
    }
}
