package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhw extends com.google.android.gms.internal.mlkit_acceleration.zzbk {
    public zzhw() {
            r0 = this;
            r0.<init>()
            return
    }

    public final int zzf() {
            r1 = this;
            r0 = 6
            int r0 = r1.zza(r0)
            if (r0 == 0) goto Lc
            int r0 = r1.zzc(r0)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final int zzg() {
            r1 = this;
            r0 = 8
            int r0 = r1.zza(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.zzc(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final java.lang.String zzh() {
            r2 = this;
            r0 = 4
            int r0 = r2.zza(r0)
            if (r0 == 0) goto Lf
            int r1 = r2.zza
            int r0 = r0 + r1
            java.lang.String r0 = r2.zzd(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzhu zzi(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzhu r0 = new com.google.android.gms.internal.mlkit_acceleration.zzhu
            r0.<init>()
            r1 = 8
            int r1 = r2.zza(r1)
            if (r1 == 0) goto L21
            int r1 = r2.zzb(r1)
            int r3 = r3 * 4
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r2.zzb
            int r3 = r3.getInt(r1)
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r2.zzb
            r0.zze(r1, r3)
            return r0
        L21:
            r3 = 0
            return r3
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzhx zzj(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzhx r0 = new com.google.android.gms.internal.mlkit_acceleration.zzhx
            r0.<init>()
            r1 = 6
            int r1 = r2.zza(r1)
            if (r1 == 0) goto L20
            int r1 = r2.zzb(r1)
            int r3 = r3 * 4
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r2.zzb
            int r3 = r3.getInt(r1)
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r2.zzb
            r0.zze(r1, r3)
            return r0
        L20:
            r3 = 0
            return r3
    }
}
