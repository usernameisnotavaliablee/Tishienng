package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza extends com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    @androidx.annotation.Nullable
    private final java.util.Map zze;

    @androidx.annotation.Nullable
    private final java.util.Map zzf;

    zza(com.google.mlkit.common.sdkinternal.MlKitContext r1, java.lang.String r2, java.util.List r3, java.util.List r4, @androidx.annotation.Nullable java.util.Map r5, @androidx.annotation.Nullable java.util.Map r6) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L30
            r0.zza = r1
            if (r2 == 0) goto L28
            r0.zzb = r2
            if (r3 == 0) goto L20
            r0.zzc = r3
            if (r4 == 0) goto L18
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null outputStreamNameList"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null inputFrameStreamNameList"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null graphConfigPath"
            r1.<init>(r2)
            throw r1
        L30:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null mlKitContext"
            r1.<init>(r2)
            throw r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
            r2 = 0
            if (r1 == 0) goto L67
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r5 = (com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig) r5
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r4.zza
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
            java.util.List r1 = r4.zzc
            java.util.List r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
            java.util.List r1 = r4.zzd
            java.util.List r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
            java.util.Map r1 = r4.zze
            if (r1 != 0) goto L46
            java.util.Map r1 = r5.zze()
            if (r1 != 0) goto L67
            goto L50
        L46:
            java.util.Map r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
        L50:
            java.util.Map r1 = r4.zzf
            if (r1 != 0) goto L5b
            java.util.Map r5 = r5.zzf()
            if (r5 != 0) goto L67
            goto L66
        L5b:
            java.util.Map r5 = r5.zzf()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L66
            goto L67
        L66:
            return r0
        L67:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r4.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r4.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.util.List r2 = r4.zzc
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.util.List r2 = r4.zzd
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.util.Map r2 = r4.zze
            r3 = 0
            if (r2 != 0) goto L2c
            r2 = 0
            goto L30
        L2c:
            int r2 = r2.hashCode()
        L30:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map r1 = r4.zzf
            if (r1 != 0) goto L3a
            goto L3e
        L3a:
            int r3 = r1.hashCode()
        L3e:
            r0 = r0 ^ r3
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            java.util.Map r0 = r7.zzf
            java.util.Map r1 = r7.zze
            java.util.List r2 = r7.zzd
            java.util.List r3 = r7.zzc
            com.google.mlkit.common.sdkinternal.MlKitContext r4 = r7.zza
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "MediaPipeGraphRunnerConfig{mlKitContext="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", graphConfigPath="
            r5.append(r4)
            java.lang.String r4 = r7.zzb
            r5.append(r4)
            java.lang.String r4 = ", inputFrameStreamNameList="
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ", outputStreamNameList="
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = ", assetRegistry="
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = ", inputSidePackets="
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = "}"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    final com.google.mlkit.common.sdkinternal.MlKitContext zza() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r1.zza
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    final java.util.List zzc() {
            r1 = this;
            java.util.List r0 = r1.zzc
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    final java.util.List zzd() {
            r1 = this;
            java.util.List r0 = r1.zzd
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    @androidx.annotation.Nullable
    final java.util.Map zze() {
            r1 = this;
            java.util.Map r0 = r1.zze
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    @androidx.annotation.Nullable
    final java.util.Map zzf() {
            r1 = this;
            java.util.Map r0 = r1.zzf
            return r0
    }
}
