package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PackageVerificationResult {
    private final java.lang.String zza;
    private final boolean zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;

    @javax.annotation.Nullable
    private final java.lang.Throwable zzd;

    private PackageVerificationResult(java.lang.String r1, int r2, boolean r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.PackageVerificationResult zza(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7, @javax.annotation.Nullable java.lang.Throwable r8) {
            com.google.android.gms.common.PackageVerificationResult r0 = new com.google.android.gms.common.PackageVerificationResult
            r2 = 1
            r3 = 0
            r1 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.PackageVerificationResult zzd(@androidx.annotation.NonNull java.lang.String r6, int r7) {
            com.google.android.gms.common.PackageVerificationResult r0 = new com.google.android.gms.common.PackageVerificationResult
            r4 = 0
            r5 = 0
            r3 = 1
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zzb
            if (r0 != 0) goto L20
            java.lang.String r0 = r3.zzc
            java.lang.Throwable r1 = r3.zzd
            java.lang.String r2 = "PackageVerificationRslt: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            if (r1 == 0) goto L1a
            java.lang.SecurityException r2 = new java.lang.SecurityException
            r2.<init>(r0, r1)
            throw r2
        L1a:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L20:
            return
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
