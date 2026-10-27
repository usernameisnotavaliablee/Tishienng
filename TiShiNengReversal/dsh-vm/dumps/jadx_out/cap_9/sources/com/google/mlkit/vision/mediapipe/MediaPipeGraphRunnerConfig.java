package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class MediaPipeGraphRunnerConfig {
    public MediaPipeGraphRunnerConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig create(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull java.util.List<java.lang.String> r9, @androidx.annotation.NonNull java.util.List<java.lang.String> r10, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r11, @androidx.annotation.Nullable java.util.Map<java.lang.String, com.google.mlkit.vision.mediapipe.MediaPipeInput> r12) {
            com.google.mlkit.vision.mediapipe.zza r0 = new com.google.mlkit.vision.mediapipe.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    abstract com.google.mlkit.common.sdkinternal.MlKitContext zza();

    abstract java.lang.String zzb();

    abstract java.util.List zzc();

    abstract java.util.List zzd();

    @androidx.annotation.Nullable
    abstract java.util.Map zze();

    @androidx.annotation.Nullable
    abstract java.util.Map zzf();
}
