package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CheckReturnValue
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PackageSignatureVerifier {

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    static volatile com.google.android.gms.common.zzac zza;

    @androidx.annotation.Nullable
    private static com.google.android.gms.common.zzad zzb;

    public PackageSignatureVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.gms.common.zzad zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.PackageSignatureVerifier> r0 = com.google.android.gms.common.PackageSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.zzad r1 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.common.zzad r1 = new com.google.android.gms.common.zzad     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.common.PackageSignatureVerifier.zzb = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.google.android.gms.common.zzad r2 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5) {
            r3 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r4)
            zza(r4)
            boolean r1 = com.google.android.gms.common.zzn.zzf()
            if (r1 == 0) goto L62
            r1 = 1
            if (r1 == r0) goto L13
            java.lang.String r1 = "-0"
            goto L15
        L13:
            java.lang.String r1 = "-1"
        L15:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            if (r2 == 0) goto L34
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            java.lang.String r2 = com.google.android.gms.common.zzac.zzb(r2)
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            com.google.android.gms.common.zzac r4 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.zzac.zza(r4)
            return r4
        L34:
            zza(r4)
            r4 = 0
            com.google.android.gms.common.zzx r4 = com.google.android.gms.common.zzn.zzc(r5, r0, r4, r4)
            boolean r0 = r4.zza
            if (r0 == 0) goto L54
            int r4 = r4.zzd
            com.google.android.gms.common.zzac r0 = new com.google.android.gms.common.zzac
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zzd(r5, r4)
            r0.<init>(r1, r4)
            com.google.android.gms.common.PackageSignatureVerifier.zza = r0
            com.google.android.gms.common.zzac r4 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.zzac.zza(r4)
            return r4
        L54:
            java.lang.String r0 = r4.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r4.zzb
            java.lang.Throwable r4 = r4.zzc
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zza(r5, r0, r4)
            return r4
        L62:
            com.google.android.gms.common.zzae r4 = new com.google.android.gms.common.zzae
            r4.<init>()
            throw r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            com.google.android.gms.common.PackageVerificationResult r0 = r1.queryPackageSignatureVerified(r2, r3)     // Catch: java.lang.SecurityException -> L8
            r0.zzb()     // Catch: java.lang.SecurityException -> L8
            return r0
        L8:
            com.google.android.gms.common.PackageVerificationResult r2 = r1.queryPackageSignatureVerified(r2, r3)
            r2.zzc()
            return r2
    }
}
