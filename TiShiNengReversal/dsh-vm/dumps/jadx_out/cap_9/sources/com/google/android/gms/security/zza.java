package com.google.android.gms.security;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza extends android.os.AsyncTask {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.security.ProviderInstaller.ProviderInstallListener zzb;

    zza(android.content.Context r1, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            android.content.Context r1 = r0.zza     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Ld com.google.android.gms.common.GooglePlayServicesRepairableException -> Lf
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(r1)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Ld com.google.android.gms.common.GooglePlayServicesRepairableException -> Lf
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            r1 = move-exception
            goto L18
        L11:
            int r1 = r1.errorCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L20
        L18:
            int r1 = r1.getConnectionStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L20:
            return r1
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object r5) {
            r4 = this;
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            if (r0 != 0) goto Le
            com.google.android.gms.security.ProviderInstaller$ProviderInstallListener r5 = r4.zzb
            r5.onProviderInstalled()
            return
        Le:
            android.content.Context r0 = r4.zza
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.security.ProviderInstaller.zza()
            int r2 = r5.intValue()
            java.lang.String r3 = "pi"
            android.content.Intent r0 = r1.getErrorResolutionIntent(r0, r2, r3)
            com.google.android.gms.security.ProviderInstaller$ProviderInstallListener r1 = r4.zzb
            int r5 = r5.intValue()
            r1.onProviderInstallFailed(r5, r0)
            return
    }
}
