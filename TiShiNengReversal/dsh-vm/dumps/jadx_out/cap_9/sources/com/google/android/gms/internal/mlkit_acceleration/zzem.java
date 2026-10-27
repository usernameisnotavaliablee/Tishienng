package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzem extends com.google.android.gms.internal.mlkit_acceleration.zzeo {
    private zzem() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzem(com.google.android.gms.internal.mlkit_acceleration.zzel r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final java.util.List zza(java.lang.Object r3, long r4) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r3, r4)
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L1d
            int r1 = r0.size()
            if (r1 != 0) goto L15
            r1 = 10
            goto L16
        L15:
            int r1 = r1 + r1
        L16:
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = r0.zzd(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r3, r4, r0)
        L1d:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final void zzb(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r1, r2)
            com.google.android.gms.internal.mlkit_acceleration.zzea r1 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r1
            r1.zzb()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final void zzc(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r5, r7)
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r0
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r6, r7)
            com.google.android.gms.internal.mlkit_acceleration.zzea r6 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r6
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L26
            if (r2 <= 0) goto L26
            boolean r3 = r0.zzc()
            if (r3 != 0) goto L23
            int r2 = r2 + r1
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = r0.zzd(r2)
        L23:
            r0.addAll(r6)
        L26:
            if (r1 > 0) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r5, r7, r6)
            return
    }
}
