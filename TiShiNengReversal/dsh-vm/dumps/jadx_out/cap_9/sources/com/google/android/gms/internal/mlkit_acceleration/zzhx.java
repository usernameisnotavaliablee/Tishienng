package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhx extends com.google.android.gms.internal.mlkit_acceleration.zzbk {
    public zzhx() {
            r0 = this;
            r0.<init>()
            return
    }

    public final byte zzf() {
            r3 = this;
            r0 = 6
            int r0 = r3.zza(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.zzb
            int r2 = r3.zza
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            return r0
        L11:
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

    public final com.google.android.gms.internal.mlkit_acceleration.zzhw zzi(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzhw r0 = new com.google.android.gms.internal.mlkit_acceleration.zzhw
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

    public final com.google.android.gms.internal.mlkit_acceleration.zzhw zzj(java.lang.String r18) {
            r17 = this;
            r0 = r17
            r1 = 8
            int r1 = r0.zza(r1)
            if (r1 == 0) goto L87
            int r1 = r0.zzb(r1)
            java.nio.ByteBuffer r3 = r0.zzb
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r18
            byte[] r4 = r5.getBytes(r4)
            int r5 = r1 + (-4)
            int r5 = r3.getInt(r5)
            r7 = 0
        L1f:
            if (r5 == 0) goto L84
            int r8 = r5 / 2
            int r9 = r7 + r8
            int r9 = r9 * 4
            int r9 = r9 + r1
            int r10 = r3.getInt(r9)
            int r9 = r9 + r10
            int r10 = r3.capacity()
            int r10 = r10 - r9
            int r11 = r3.capacity()
            int r11 = r11 - r10
            int r10 = r3.getInt(r11)
            int r12 = r11 + 4
            int r12 = r12 - r10
            short r10 = r3.getShort(r12)
            int r10 = r10 + r11
            int r11 = r3.getInt(r10)
            int r10 = r10 + r11
            int r11 = r3.getInt(r10)
            int r12 = r4.length
            int r13 = java.lang.Math.min(r11, r12)
            r14 = 0
        L52:
            if (r14 >= r13) goto L6c
            int r15 = r10 + 4
            int r15 = r15 + r14
            r16 = 0
            byte r2 = r3.get(r15)
            r6 = r4[r14]
            if (r2 == r6) goto L69
            byte r2 = r3.get(r15)
            r6 = r4[r14]
            int r2 = r2 - r6
            goto L70
        L69:
            int r14 = r14 + 1
            goto L52
        L6c:
            r16 = 0
            int r2 = r11 - r12
        L70:
            if (r2 <= 0) goto L74
            r5 = r8
            goto L1f
        L74:
            if (r2 >= 0) goto L7b
            int r8 = r8 + 1
            int r7 = r7 + r8
            int r5 = r5 - r8
            goto L1f
        L7b:
            com.google.android.gms.internal.mlkit_acceleration.zzhw r1 = new com.google.android.gms.internal.mlkit_acceleration.zzhw
            r1.<init>()
            r1.zze(r9, r3)
            return r1
        L84:
            r16 = 0
            return r16
        L87:
            r16 = 0
            return r16
    }
}
