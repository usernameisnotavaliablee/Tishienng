package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhh extends com.google.android.gms.internal.mlkit_acceleration.zzdv implements com.google.android.gms.internal.mlkit_acceleration.zzfb {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzhh zzb = null;
    private com.google.android.gms.internal.mlkit_acceleration.zzea zzd;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = new com.google.android.gms.internal.mlkit_acceleration.zzhh
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb = r0
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzhh> r1 = com.google.android.gms.internal.mlkit_acceleration.zzhh.class
            com.google.android.gms.internal.mlkit_acceleration.zzdv.zzK(r1, r0)
            return
    }

    private zzhh() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = com.google.android.gms.internal.mlkit_acceleration.zzdv.zzE()
            r1.zzd = r0
            return
    }

    static /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzhh zza() {
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzhh zzb() {
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzhh zzc(java.io.InputStream r1, com.google.android.gms.internal.mlkit_acceleration.zzdi r2) throws java.io.IOException {
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = com.google.android.gms.internal.mlkit_acceleration.zzdv.zzC(r0, r1, r2)
            com.google.android.gms.internal.mlkit_acceleration.zzhh r1 = (com.google.android.gms.internal.mlkit_acceleration.zzhh) r1
            return r1
    }

    public final java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzdv
    protected final java.lang.Object zzo(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            r3 = 1
            if (r2 == 0) goto L36
            r4 = 2
            if (r2 == r4) goto L22
            r3 = 3
            if (r2 == r3) goto L1c
            r3 = 4
            r4 = 0
            if (r2 == r3) goto L16
            r3 = 5
            if (r2 == r3) goto L13
            return r4
        L13:
            com.google.android.gms.internal.mlkit_acceleration.zzhh r2 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb
            return r2
        L16:
            com.google.android.gms.internal.mlkit_acceleration.zzhg r2 = new com.google.android.gms.internal.mlkit_acceleration.zzhg
            r2.<init>(r4)
            return r2
        L1c:
            com.google.android.gms.internal.mlkit_acceleration.zzhh r2 = new com.google.android.gms.internal.mlkit_acceleration.zzhh
            r2.<init>()
            return r2
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r4 = "zzd"
            r0 = 0
            r2[r0] = r4
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzhk> r4 = com.google.android.gms.internal.mlkit_acceleration.zzhk.class
            r2[r3] = r4
            com.google.android.gms.internal.mlkit_acceleration.zzhh r3 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb
            java.lang.String r4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_acceleration.zzdv.zzH(r3, r4, r2)
            return r2
        L36:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }
}
