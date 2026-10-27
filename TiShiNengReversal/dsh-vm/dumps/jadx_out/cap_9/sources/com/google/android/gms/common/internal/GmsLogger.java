package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GmsLogger {
    private final java.lang.String zza;

    @androidx.annotation.Nullable
    private final java.lang.String zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "log tag cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            int r0 = r7.length()
            r1 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r5 = 1
            r3[r5] = r2
            if (r0 > r1) goto L1e
            r4 = 1
        L1e:
            java.lang.String r0 = "tag \"%s\" is longer than the %d character maximum"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r0, r3)
            r6.zza = r7
            r7 = 0
            if (r8 == 0) goto L2e
            int r0 = r8.length()
            if (r0 > 0) goto L2f
        L2e:
            r8 = r7
        L2f:
            r6.zzb = r8
            return
    }

    private final java.lang.String zza(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    @com.google.errorprone.annotations.FormatMethod
    private final java.lang.String zzb(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLog(int r2) {
            r1 = this;
            java.lang.String r0 = r1.zza
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLogPii() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r1 = 3
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 3
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r1 = 6
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 6
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.errorprone.annotations.FormatMethod
    public void efmt(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull @com.google.errorprone.annotations.FormatString java.lang.String r2, @androidx.annotation.NonNull java.lang.Object... r3) {
            r0 = this;
            r1 = 6
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zzb(r2, r3)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r1 = 4
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 4
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r1 = 2
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 2
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zza(r2)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.errorprone.annotations.FormatMethod
    public void wfmt(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull @com.google.errorprone.annotations.FormatString java.lang.String r2, @androidx.annotation.NonNull java.lang.Object... r3) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto La
            r0.zzb(r2, r3)
        La:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wtf(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = this;
            r1 = 7
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto Ld
            r0.zza(r2)
            r0.zza(r2)
        Ld:
            return
    }
}
