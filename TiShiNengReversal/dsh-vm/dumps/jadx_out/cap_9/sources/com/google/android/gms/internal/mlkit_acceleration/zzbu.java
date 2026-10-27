package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbu {
    public zzbu() {
            r1 = this;
            r1.<init>()
            return
    }

    static void zza(java.util.Map r2, com.google.android.gms.internal.mlkit_acceleration.zzhv r3) {
            r0 = 0
        L1:
            int r1 = r3.zzf()
            if (r0 >= r1) goto L11
            com.google.android.gms.internal.mlkit_acceleration.zzhx r1 = r3.zzh(r0)
            zzb(r1, r2)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    private static void zzb(com.google.android.gms.internal.mlkit_acceleration.zzhx r7, java.util.Map r8) {
            java.lang.String r0 = r7.zzh()
            boolean r0 = r8.containsKey(r0)
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            java.lang.String r0 = r7.zzh()
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            byte r2 = r7.zzf()
            r3 = 0
            if (r2 != 0) goto L2c
            com.google.android.gms.internal.mlkit_acceleration.zzhw r7 = r7.zzj(r0)
            if (r7 == 0) goto L59
            r1.add(r7)
            goto L59
        L2c:
            r2 = 0
        L2d:
            int r4 = r7.zzg()
            if (r2 >= r4) goto L59
            com.google.android.gms.internal.mlkit_acceleration.zzhw r4 = r7.zzi(r2)
            byte r5 = r7.zzf()
            r6 = 1
            if (r5 != r6) goto L49
            java.lang.String r5 = r4.zzh()
            int r5 = r0.compareTo(r5)
            if (r5 < 0) goto L56
            goto L53
        L49:
            java.lang.String r5 = r4.zzh()
            int r5 = r0.compareTo(r5)
            if (r5 > 0) goto L56
        L53:
            r1.add(r4)
        L56:
            int r2 = r2 + 1
            goto L2d
        L59:
            java.util.Iterator r7 = r1.iterator()
        L5d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r7.next()
            com.google.android.gms.internal.mlkit_acceleration.zzhw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzhw) r0
            r1 = 0
        L6a:
            int r2 = r0.zzg()
            if (r1 >= r2) goto L82
            com.google.android.gms.internal.mlkit_acceleration.zzhu r2 = r0.zzi(r1)
            java.lang.String r4 = r2.zzg()
            java.lang.String r2 = r2.zzf()
            r8.put(r4, r2)
            int r1 = r1 + 1
            goto L6a
        L82:
            r1 = 0
        L83:
            int r2 = r0.zzf()
            if (r1 >= r2) goto L5d
            com.google.android.gms.internal.mlkit_acceleration.zzhx r2 = r0.zzj(r1)
            zzb(r2, r8)
            int r1 = r1 + 1
            goto L83
        L93:
            return
    }
}
