package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbt extends com.google.android.gms.internal.mlkit_acceleration.zzby {
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;

    /* synthetic */ zzbt(java.lang.String r1, int r2, int r3, com.google.android.gms.internal.mlkit_acceleration.zzbs r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzby
            r2 = 0
            if (r1 == 0) goto L28
            com.google.android.gms.internal.mlkit_acceleration.zzby r5 = (com.google.android.gms.internal.mlkit_acceleration.zzby) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            int r1 = r4.zzb
            int r3 = r5.zza()
            if (r1 != r3) goto L28
            int r1 = r4.zzc
            int r5 = r5.zzb()
            if (r1 != r5) goto L28
            return r0
        L28:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.zzb
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.zzc
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GpuInfo{rendererName="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", majorVersion="
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", minorVersion="
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzby
    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzby
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzby
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
