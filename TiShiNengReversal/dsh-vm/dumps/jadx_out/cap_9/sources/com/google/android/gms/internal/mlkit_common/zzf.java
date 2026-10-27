package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzf {
    private final com.google.android.gms.internal.mlkit_common.zzac zza;
    private java.lang.Boolean zzb;

    private zzf() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzac r0 = new com.google.android.gms.internal.mlkit_common.zzac
            r0.<init>()
            r1.zza = r0
            return
    }

    /* synthetic */ zzf(com.google.android.gms.internal.mlkit_common.zze r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzac r1 = new com.google.android.gms.internal.mlkit_common.zzac
            r1.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zza(com.google.android.gms.internal.mlkit_common.zzk r3) {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            java.lang.String r1 = "Must call internal() or external() before appending rules."
            com.google.android.gms.internal.mlkit_common.zzt.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzac r0 = r2.zza
            r0.zzb(r3)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzb() {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "A SourcePolicy can only set internal() or external() once."
            com.google.android.gms.internal.mlkit_common.zzt.zze(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zzb = r0
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzc() {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "A SourcePolicy can only set internal() or external() once."
            com.google.android.gms.internal.mlkit_common.zzt.zze(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.zzb = r0
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzh zzd() {
            r5 = this;
            java.lang.Boolean r0 = r5.zzb
            java.lang.String r1 = "Must call internal() or external() when building a SourcePolicy."
            com.google.android.gms.internal.mlkit_common.zzt.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzh r0 = new com.google.android.gms.internal.mlkit_common.zzh
            java.lang.Boolean r1 = r5.zzb
            boolean r1 = r1.booleanValue()
            com.google.android.gms.internal.mlkit_common.zzac r2 = r5.zza
            com.google.android.gms.internal.mlkit_common.zzaf r2 = r2.zzc()
            r3 = 0
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            return r0
    }
}
