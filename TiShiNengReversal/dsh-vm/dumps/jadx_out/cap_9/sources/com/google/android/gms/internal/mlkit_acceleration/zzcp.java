package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzcp extends com.google.android.gms.internal.mlkit_acceleration.zzco {
    protected final byte[] zza;

    zzcp(byte[] r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.mlkit_acceleration.zzcs
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r8.zzd()
            r3 = r9
            com.google.android.gms.internal.mlkit_acceleration.zzcs r3 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r3
            int r3 = r3.zzd()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r8.zzd()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r1 = r9 instanceof com.google.android.gms.internal.mlkit_acceleration.zzcp
            if (r1 == 0) goto L9e
            com.google.android.gms.internal.mlkit_acceleration.zzcp r9 = (com.google.android.gms.internal.mlkit_acceleration.zzcp) r9
            int r1 = r8.zzk()
            int r3 = r9.zzk()
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r1 != r3) goto L34
            goto L35
        L34:
            return r2
        L35:
            int r1 = r8.zzd()
            int r3 = r9.zzd()
            if (r1 > r3) goto L80
            int r3 = r9.zzd()
            if (r1 > r3) goto L5d
            byte[] r3 = r8.zza
            byte[] r4 = r9.zza
            r9.zzc()
            r9 = 0
            r5 = 0
        L4e:
            if (r9 >= r1) goto L5c
            r6 = r3[r9]
            r7 = r4[r5]
            if (r6 == r7) goto L57
            return r2
        L57:
            int r9 = r9 + 1
            int r5 = r5 + 1
            goto L4e
        L5c:
            return r0
        L5d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r9 = r9.zzd()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ran off end of other: 0, "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L80:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            int r0 = r8.zzd()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Length too large: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
        L9e:
            boolean r9 = r9.equals(r8)
            return r9
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    public byte zza(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    byte zzb(int r2) {
            r1 = this;
            byte[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    protected int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    public int zzd() {
            r1 = this;
            byte[] r0 = r1.zza
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    protected final int zze(int r2, int r3, int r4) {
            r1 = this;
            byte[] r3 = r1.zza
            r0 = 0
            int r2 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb(r2, r3, r0, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    public final com.google.android.gms.internal.mlkit_acceleration.zzcs zzf(int r3, int r4) {
            r2 = this;
            int r3 = r2.zzd()
            r0 = 0
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzj(r0, r4, r3)
            if (r3 != 0) goto Le
            com.google.android.gms.internal.mlkit_acceleration.zzcs r3 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb
            return r3
        Le:
            byte[] r4 = r2.zza
            com.google.android.gms.internal.mlkit_acceleration.zzcm r1 = new com.google.android.gms.internal.mlkit_acceleration.zzcm
            r1.<init>(r4, r0, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    protected final java.lang.String zzg(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            int r1 = r4.zzd()
            byte[] r2 = r4.zza
            r3 = 0
            r0.<init>(r2, r3, r1, r5)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    final void zzh(com.google.android.gms.internal.mlkit_acceleration.zzci r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzd()
            com.google.android.gms.internal.mlkit_acceleration.zzda r4 = (com.google.android.gms.internal.mlkit_acceleration.zzda) r4
            byte[] r1 = r3.zza
            r2 = 0
            r4.zzc(r1, r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcs
    public final boolean zzi() {
            r3 = this;
            int r0 = r3.zzd()
            byte[] r1 = r3.zza
            r2 = 0
            boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zzf(r1, r2, r0)
            return r0
    }
}
