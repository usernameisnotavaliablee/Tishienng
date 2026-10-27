package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MediaPipeGraphRunner {
    private final com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig zza;

    @androidx.annotation.Nullable
    private com.google.mlkit.vision.mediapipe.zzg zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    static {
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public MediaPipeGraphRunner(@androidx.annotation.NonNull com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.zzc = r2
            return
    }

    private final void zza() throws com.google.mlkit.common.MlKitException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L10
            com.google.mlkit.vision.mediapipe.zzg r0 = r3.zzb
            if (r0 != 0) goto Lf
            r3.load()
        Lf:
            return
        L10:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "close() already called, can't send any more inputs."
            r2 = 13
            r0.<init>(r1, r2)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void close() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            r1 = 1
            r0.set(r1)
            com.google.mlkit.vision.mediapipe.zzg r0 = r2.zzb
            if (r0 == 0) goto L10
            r0.zzc()
            r0 = 0
            r2.zzb = r0
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void load() throws com.google.mlkit.common.MlKitException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L1e
            com.google.mlkit.vision.mediapipe.zzg r0 = r3.zzb
            if (r0 != 0) goto L1d
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r0 = r3.zza
            com.google.mlkit.vision.mediapipe.zzg r1 = new com.google.mlkit.vision.mediapipe.zzg
            r1.<init>(r0)
            r3.zzb = r1
            r1.zzd()
            com.google.mlkit.vision.mediapipe.zzg r0 = r3.zzb
            r0.zze()
        L1d:
            return
        L1e:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "close() already called, can't call load()."
            r2 = 13
            r0.<init>(r1, r2)
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <ResultT> ResultT run(@androidx.annotation.NonNull java.util.List<com.google.mlkit.vision.mediapipe.MediaPipeInput> r3, @androidx.annotation.NonNull com.google.mlkit.vision.mediapipe.Converter<ResultT> r4) throws com.google.mlkit.common.MlKitException {
            r2 = this;
            r2.zza()
            java.lang.String r0 = "MediaPipeGraphRunner#run"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zziq r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziq.zze(r0)
            r0.zzb()
            com.google.mlkit.vision.mediapipe.zzg r1 = r2.zzb     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1c
            com.google.mlkit.vision.mediapipe.zzg r1 = (com.google.mlkit.vision.mediapipe.zzg) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r1.zza(r3, r4)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return r3
        L1c:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r4 = move-exception
            r3.addSuppressed(r4)
        L25:
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void sendToInputStream(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.mlkit.vision.mediapipe.MediaPipeInput r3) throws com.google.mlkit.common.MlKitException {
            r1 = this;
            r1.zza()
            com.google.mlkit.vision.mediapipe.zzg r0 = r1.zzb
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.mlkit.vision.mediapipe.zzg r0 = (com.google.mlkit.vision.mediapipe.zzg) r0
            r0.zzf(r2, r3)
            return
    }
}
