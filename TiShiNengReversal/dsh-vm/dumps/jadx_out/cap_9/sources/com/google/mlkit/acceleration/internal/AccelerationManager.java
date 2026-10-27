package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AccelerationManager<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>, InputT, ResultT> {
    private final com.google.mlkit.acceleration.internal.zza zza;
    private final com.google.mlkit.acceleration.internal.zzl zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected AccelerationManager(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.PipelineId r3, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.AllowlistConfig<OptionsT> r4, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.MiniBenchmarkConfig<OptionsT, InputT, ResultT> r5, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.AccelerationLogger<OptionsT> r6) {
            r1 = this;
            r1.<init>()
            com.google.mlkit.acceleration.internal.zza r0 = new com.google.mlkit.acceleration.internal.zza
            r0.<init>(r2, r3, r4, r6)
            r1.zza = r0
            com.google.mlkit.acceleration.internal.zzl r4 = new com.google.mlkit.acceleration.internal.zzl
            r4.<init>(r2, r3, r5, r6)
            r1.zzb = r4
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public OptionsT getBestConfiguredOptions(@androidx.annotation.NonNull OptionsT r6) {
            r5 = this;
            com.google.mlkit.acceleration.internal.zzl r0 = r5.zzb
            com.google.mlkit.acceleration.internal.zza r1 = r5.zza
            java.util.List r1 = r1.zza(r6)
            java.util.List r0 = r0.zza(r1)
            boolean r1 = r0.isEmpty()
            r2 = 3
            java.lang.String r3 = "AccelerationManager"
            r4 = 0
            if (r1 == 0) goto L22
            android.util.Log.isLoggable(r3, r2)
            java.lang.String r0 = "default_config"
            java.lang.Object r6 = r6.cloneWithRunConfigAssigned(r0, r4)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r6 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r6
            return r6
        L22:
            boolean r6 = android.util.Log.isLoggable(r3, r2)
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r0.get(r4)
            com.google.mlkit.acceleration.internal.RunConfig r6 = (com.google.mlkit.acceleration.internal.RunConfig) r6
            java.lang.String r6 = r6.zze()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "getBestConfiguredOptions: "
            r1.concat(r6)
        L3b:
            java.lang.Object r6 = r0.get(r4)
            com.google.mlkit.acceleration.internal.RunConfig r6 = (com.google.mlkit.acceleration.internal.RunConfig) r6
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r6 = r6.zzb()
            return r6
    }
}
