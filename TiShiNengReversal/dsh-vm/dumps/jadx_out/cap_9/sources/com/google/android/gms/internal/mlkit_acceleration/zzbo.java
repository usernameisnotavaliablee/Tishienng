package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbo extends com.google.android.gms.internal.mlkit_acceleration.zzbv {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;

    zzbo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbv
    public final com.google.android.gms.internal.mlkit_acceleration.zzbv zza(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbv
    public final com.google.android.gms.internal.mlkit_acceleration.zzbv zzb(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.zzc = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null device"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbv
    public final com.google.android.gms.internal.mlkit_acceleration.zzbv zzc(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.zzd = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null manufacturer"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbv
    public final com.google.android.gms.internal.mlkit_acceleration.zzbv zzd(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.zzb = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null model"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbv
    public final com.google.android.gms.internal.mlkit_acceleration.zzbw zze() {
            r6 = this;
            java.lang.String r1 = r6.zza
            if (r1 == 0) goto L18
            java.lang.String r2 = r6.zzb
            if (r2 == 0) goto L18
            java.lang.String r3 = r6.zzc
            if (r3 == 0) goto L18
            java.lang.String r4 = r6.zzd
            if (r4 != 0) goto L11
            goto L18
        L11:
            com.google.android.gms.internal.mlkit_acceleration.zzbq r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbq
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.zza
            if (r1 != 0) goto L26
            java.lang.String r1 = " androidSdkVersion"
            r0.append(r1)
        L26:
            java.lang.String r1 = r6.zzb
            if (r1 != 0) goto L2f
            java.lang.String r1 = " model"
            r0.append(r1)
        L2f:
            java.lang.String r1 = r6.zzc
            if (r1 != 0) goto L38
            java.lang.String r1 = " device"
            r0.append(r1)
        L38:
            java.lang.String r1 = r6.zzd
            if (r1 != 0) goto L41
            java.lang.String r1 = " manufacturer"
            r0.append(r1)
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
