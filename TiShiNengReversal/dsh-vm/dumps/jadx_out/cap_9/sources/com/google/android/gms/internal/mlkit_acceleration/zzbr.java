package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbr extends com.google.android.gms.internal.mlkit_acceleration.zzbx {
    private java.lang.String zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    zzbr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbx
    public final com.google.android.gms.internal.mlkit_acceleration.zzbx zza(int r1) {
            r0 = this;
            r0.zzb = r1
            byte r1 = r0.zzd
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbx
    public final com.google.android.gms.internal.mlkit_acceleration.zzbx zzb(int r1) {
            r0 = this;
            r0.zzc = r1
            byte r1 = r0.zzd
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbx
    public final com.google.android.gms.internal.mlkit_acceleration.zzbx zzc(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbx
    public final com.google.android.gms.internal.mlkit_acceleration.zzby zzd() {
            r5 = this;
            byte r0 = r5.zzd
            r1 = 3
            if (r0 != r1) goto L15
            java.lang.String r0 = r5.zza
            if (r0 != 0) goto La
            goto L15
        La:
            com.google.android.gms.internal.mlkit_acceleration.zzbt r1 = new com.google.android.gms.internal.mlkit_acceleration.zzbt
            int r2 = r5.zzb
            int r3 = r5.zzc
            r4 = 0
            r1.<init>(r0, r2, r3, r4)
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.zza
            if (r1 != 0) goto L23
            java.lang.String r1 = " rendererName"
            r0.append(r1)
        L23:
            byte r1 = r5.zzd
            r1 = r1 & 1
            if (r1 != 0) goto L2e
            java.lang.String r1 = " majorVersion"
            r0.append(r1)
        L2e:
            byte r1 = r5.zzd
            r1 = r1 & 2
            if (r1 != 0) goto L39
            java.lang.String r1 = " minorVersion"
            r0.append(r1)
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
