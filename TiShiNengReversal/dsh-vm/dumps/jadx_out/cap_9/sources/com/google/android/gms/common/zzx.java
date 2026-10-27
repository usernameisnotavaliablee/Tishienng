package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzx {
    private static final com.google.android.gms.common.zzx zze = null;
    final boolean zza;

    @javax.annotation.Nullable
    final java.lang.String zzb;

    @javax.annotation.Nullable
    final java.lang.Throwable zzc;
    final int zzd;

    static {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r4 = 0
            r5 = 0
            r1 = 1
            r2 = 3
            r3 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.zzx.zze = r0
            return
    }

    private zzx(boolean r1, int r2, int r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r2
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    /* synthetic */ zzx(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5, com.google.android.gms.common.zzw r6) {
            r0 = this;
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 1
            r4 = 5
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzx zzb() {
            com.google.android.gms.common.zzx r0 = com.google.android.gms.common.zzx.zze
            return r0
    }

    static com.google.android.gms.common.zzx zzc(@androidx.annotation.NonNull java.lang.String r6) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r3 = 5
            r5 = 0
            r1 = 0
            r2 = 1
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    static com.google.android.gms.common.zzx zzd(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.Throwable r7) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r2 = 1
            r3 = 5
            r1 = 0
            r4 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    static com.google.android.gms.common.zzx zzf(int r6) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r4 = 0
            r5 = 0
            r1 = 1
            r3 = 1
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    static com.google.android.gms.common.zzx zzg(int r6, int r7, @androidx.annotation.NonNull java.lang.String r8, @javax.annotation.Nullable java.lang.Throwable r9) {
            com.google.android.gms.common.zzx r0 = new com.google.android.gms.common.zzx
            r1 = 0
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @javax.annotation.Nullable
    java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    final void zze() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L18
            java.lang.String r0 = "GoogleCertificatesRslt"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L18
            java.lang.Throwable r0 = r2.zzc
            if (r0 == 0) goto L15
            r2.zza()
            return
        L15:
            r2.zza()
        L18:
            return
    }
}
