package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzgd {
    zzgd() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract int zza(java.lang.Object r1);

    abstract int zzb(java.lang.Object r1);

    abstract java.lang.Object zzc(java.lang.Object r1);

    abstract java.lang.Object zzd(java.lang.Object r1);

    abstract java.lang.Object zze(java.lang.Object r1, java.lang.Object r2);

    abstract java.lang.Object zzf();

    abstract java.lang.Object zzg(java.lang.Object r1);

    abstract void zzh(java.lang.Object r1, int r2, int r3);

    abstract void zzi(java.lang.Object r1, int r2, long r3);

    abstract void zzj(java.lang.Object r1, int r2, java.lang.Object r3);

    abstract void zzk(java.lang.Object r1, int r2, com.google.android.gms.internal.mlkit_acceleration.zzcs r3);

    abstract void zzl(java.lang.Object r1, int r2, long r3);

    abstract void zzm(java.lang.Object r1);

    abstract void zzn(java.lang.Object r1, java.lang.Object r2);

    abstract void zzo(java.lang.Object r1, java.lang.Object r2);

    abstract void zzp(java.lang.Object r1, com.google.android.gms.internal.mlkit_acceleration.zzgv r2) throws java.io.IOException;

    final boolean zzq(java.lang.Object r8, com.google.android.gms.internal.mlkit_acceleration.zzfl r9) throws java.io.IOException {
            r7 = this;
            int r0 = r9.zzd()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L60
            if (r0 == r2) goto L58
            r3 = 2
            if (r0 == r3) goto L50
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L28
            if (r0 == r3) goto L26
            r3 = 5
            if (r0 != r3) goto L21
            int r9 = r9.zzf()
            r7.zzh(r8, r1, r9)
            return r2
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzec r8 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r8
        L26:
            r8 = 0
            return r8
        L28:
            java.lang.Object r0 = r7.zzf()
            int r4 = r1 << 3
        L2e:
            int r5 = r9.zzc()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L3d
            boolean r5 = r7.zzq(r0, r9)
            if (r5 != 0) goto L2e
        L3d:
            r3 = r3 | r4
            int r9 = r9.zzd()
            if (r3 != r9) goto L4b
            r7.zzg(r0)
            r7.zzj(r8, r1, r0)
            return r2
        L4b:
            com.google.android.gms.internal.mlkit_acceleration.zzed r8 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzb()
            throw r8
        L50:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r9 = r9.zzp()
            r7.zzk(r8, r1, r9)
            return r2
        L58:
            long r3 = r9.zzk()
            r7.zzi(r8, r1, r3)
            return r2
        L60:
            long r3 = r9.zzl()
            r7.zzl(r8, r1, r3)
            return r2
    }

    abstract boolean zzr(com.google.android.gms.internal.mlkit_acceleration.zzfl r1);
}
