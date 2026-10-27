package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzy extends com.google.android.gms.internal.mlkit_acceleration.zzad {
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzz zza;

    zzy(com.google.android.gms.internal.mlkit_acceleration.zzz r1, com.google.android.gms.internal.mlkit_acceleration.zzaf r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzad
    public final int zzc(int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzz r0 = r1.zza
            java.lang.String r0 = r0.zza
            int r0 = r0.length()
            int r2 = r2 + r0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzad
    public final int zzd(int r7) {
            r6 = this;
            java.lang.CharSequence r0 = r6.zzb
            int r0 = r0.length()
            com.google.android.gms.internal.mlkit_acceleration.zzz r1 = r6.zza
            java.lang.String r1 = r1.zza
            int r1 = r1.length()
            int r0 = r0 - r1
        Lf:
            if (r7 > r0) goto L2d
            r2 = 0
        L12:
            if (r2 >= r1) goto L2c
            java.lang.CharSequence r3 = r6.zzb
            int r4 = r2 + r7
            com.google.android.gms.internal.mlkit_acceleration.zzz r5 = r6.zza
            java.lang.String r5 = r5.zza
            char r3 = r3.charAt(r4)
            char r4 = r5.charAt(r2)
            if (r3 == r4) goto L29
            int r7 = r7 + 1
            goto Lf
        L29:
            int r2 = r2 + 1
            goto L12
        L2c:
            return r7
        L2d:
            r7 = -1
            return r7
    }
}
