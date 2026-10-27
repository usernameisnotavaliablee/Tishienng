package com.google.android.gms.common.stats;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class WakeLockTracker {
    private static final com.google.android.gms.common.stats.WakeLockTracker zza = null;

    static {
            com.google.android.gms.common.stats.WakeLockTracker r0 = new com.google.android.gms.common.stats.WakeLockTracker
            r0.<init>()
            com.google.android.gms.common.stats.WakeLockTracker.zza = r0
            return
    }

    public WakeLockTracker() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.stats.WakeLockTracker getInstance() {
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.google.android.gms.common.stats.WakeLockTracker.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerAcquireEvent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.Intent r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.lang.String r5, int r6, @androidx.annotation.NonNull java.lang.String r7) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerDeadlineEvent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, int r5, @androidx.annotation.NonNull java.util.List<java.lang.String> r6, boolean r7, long r8) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerEvent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6, int r7, @androidx.annotation.NonNull java.util.List<java.lang.String> r8) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerEvent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6, int r7, @androidx.annotation.NonNull java.util.List<java.lang.String> r8, long r9) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void registerReleaseEvent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.Intent r2) {
            r0 = this;
            return
    }
}
