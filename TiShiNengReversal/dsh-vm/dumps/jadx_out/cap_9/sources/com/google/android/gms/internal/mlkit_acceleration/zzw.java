package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzw extends com.google.android.gms.internal.mlkit_acceleration.zzad {
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzx zza;

    zzw(com.google.android.gms.internal.mlkit_acceleration.zzx r1, com.google.android.gms.internal.mlkit_acceleration.zzaf r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzad
    final int zzc(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzad
    final int zzd(int r8) {
            r7 = this;
            java.lang.CharSequence r0 = r7.zzb
            int r1 = r0.length()
            if (r8 < 0) goto L21
            if (r8 <= r1) goto Lb
            goto L21
        Lb:
            if (r8 >= r1) goto L1f
            com.google.android.gms.internal.mlkit_acceleration.zzx r2 = r7.zza
            char r3 = r0.charAt(r8)
            com.google.android.gms.internal.mlkit_acceleration.zzp r2 = r2.zza
            boolean r2 = r2.zza(r3)
            if (r2 == 0) goto L1c
            return r8
        L1c:
            int r8 = r8 + 1
            goto Lb
        L1f:
            r8 = -1
            return r8
        L21:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.String r5 = "index"
            if (r8 < 0) goto L5b
            if (r1 >= 0) goto L43
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "negative size: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L43:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r5
            r6[r4] = r8
            r6[r2] = r1
            java.lang.String r8 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r8 = com.google.android.gms.internal.mlkit_acceleration.zzag.zza(r8, r6)
            goto L6b
        L5b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r1[r4] = r8
            java.lang.String r8 = "%s (%s) must not be negative"
            java.lang.String r8 = com.google.android.gms.internal.mlkit_acceleration.zzag.zza(r8, r1)
        L6b:
            r0.<init>(r8)
            throw r0
    }
}
