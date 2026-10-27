package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class UidVerifier {
    private UidVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isGooglePlayServicesUid(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r3 = uidHasPackageName(r2, r3, r0)
            if (r3 != 0) goto L9
            goto L22
        L9:
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            r1 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c
            com.google.android.gms.common.GoogleSignatureVerifier r2 = com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r2)
            boolean r2 = r2.isGooglePublicSignedPackage(r3)
            return r2
        L1c:
            java.lang.String r2 = "UidVerifier"
            r3 = 3
            android.util.Log.isLoggable(r2, r3)
        L22:
            r2 = 0
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(19)
    public static boolean uidHasPackageName(@androidx.annotation.NonNull android.content.Context r0, int r1, @androidx.annotation.NonNull java.lang.String r2) {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            boolean r0 = r0.zza(r1, r2)
            return r0
    }
}
