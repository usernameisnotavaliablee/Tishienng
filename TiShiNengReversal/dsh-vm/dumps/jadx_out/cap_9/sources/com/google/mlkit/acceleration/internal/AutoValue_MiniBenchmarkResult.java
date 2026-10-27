package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class AutoValue_MiniBenchmarkResult extends com.google.mlkit.acceleration.internal.MiniBenchmarkResult {
    private final boolean zza;
    private final int zzb;
    private final float zzc;
    private final int zzd;

    /* synthetic */ AutoValue_MiniBenchmarkResult(boolean r1, int r2, float r3, int r4, com.google.mlkit.acceleration.internal.zzc r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.acceleration.internal.MiniBenchmarkResult
            r2 = 0
            if (r1 == 0) goto L34
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r5 = (com.google.mlkit.acceleration.internal.MiniBenchmarkResult) r5
            boolean r1 = r4.zza
            boolean r3 = r5.zza()
            if (r1 != r3) goto L34
            int r1 = r4.zzb
            int r3 = r5.getStabilityStatus()
            if (r1 != r3) goto L34
            float r1 = r4.zzc
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getCorrectnessScore()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L34
            int r1 = r4.zzd
            int r5 = r5.getRunLatencyMs()
            if (r1 != r5) goto L34
            return r0
        L34:
            return r2
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public float getCorrectnessScore() {
            r1 = this;
            float r0 = r1.zzc
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getRunLatencyMs() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getStabilityStatus() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 1
            boolean r1 = r4.zza
            if (r0 == r1) goto L8
            r0 = 1237(0x4d5, float:1.733E-42)
            goto La
        L8:
            r0 = 1231(0x4cf, float:1.725E-42)
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r4.zzb
            float r3 = r4.zzc
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = java.lang.Float.floatToIntBits(r3)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r4.zzd
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MiniBenchmarkResult{logged="
            r0.append(r1)
            boolean r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", stabilityStatus="
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", correctnessScore="
            r0.append(r1)
            float r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = ", runLatencyMs="
            r0.append(r1)
            int r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkResult
    public final boolean zza() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
