package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzb extends com.google.mlkit.acceleration.internal.zzn {
    private boolean zza;
    private int zzb;
    private float zzc;
    private int zzd;
    private byte zze;

    zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.acceleration.internal.zzn
    public final com.google.mlkit.acceleration.internal.zzn zza(float r1) {
            r0 = this;
            r0.zzc = r1
            byte r1 = r0.zze
            r1 = r1 | 4
            byte r1 = (byte) r1
            r0.zze = r1
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.zzn
    public final com.google.mlkit.acceleration.internal.zzn zzb(boolean r1) {
            r0 = this;
            r0.zza = r1
            byte r1 = r0.zze
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zze = r1
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.zzn
    public final com.google.mlkit.acceleration.internal.zzn zzc(int r1) {
            r0 = this;
            r0.zzd = r1
            byte r1 = r0.zze
            r1 = r1 | 8
            byte r1 = (byte) r1
            r0.zze = r1
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.zzn
    public final com.google.mlkit.acceleration.internal.zzn zzd(int r1) {
            r0 = this;
            r0.zzb = r1
            byte r1 = r0.zze
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zze = r1
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.zzn
    public final com.google.mlkit.acceleration.internal.MiniBenchmarkResult zze() {
            r8 = this;
            byte r0 = r8.zze
            r1 = 15
            if (r0 == r1) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r1 = r8.zze
            r1 = r1 & 1
            if (r1 != 0) goto L16
            java.lang.String r1 = " logged"
            r0.append(r1)
        L16:
            byte r1 = r8.zze
            r1 = r1 & 2
            if (r1 != 0) goto L21
            java.lang.String r1 = " stabilityStatus"
            r0.append(r1)
        L21:
            byte r1 = r8.zze
            r1 = r1 & 4
            if (r1 != 0) goto L2c
            java.lang.String r1 = " correctnessScore"
            r0.append(r1)
        L2c:
            byte r1 = r8.zze
            r1 = r1 & 8
            if (r1 != 0) goto L37
            java.lang.String r1 = " runLatencyMs"
            r0.append(r1)
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L47:
            com.google.mlkit.acceleration.internal.AutoValue_MiniBenchmarkResult r2 = new com.google.mlkit.acceleration.internal.AutoValue_MiniBenchmarkResult
            boolean r3 = r8.zza
            int r4 = r8.zzb
            float r5 = r8.zzc
            int r6 = r8.zzd
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }
}
