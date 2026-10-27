package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RunConfig<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>> {
    private final com.google.mlkit.acceleration.internal.PipelineId zza;
    private final com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zzb;
    private final java.lang.String zzc;
    private final boolean zzd;

    @androidx.annotation.Nullable
    private final com.google.mlkit.acceleration.internal.MiniBenchmarkResult zze;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>> {
        private com.google.mlkit.acceleration.internal.PipelineId zza;
        private com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zzb;
        private java.lang.String zzc;
        private boolean zzd;

        @androidx.annotation.Nullable
        private com.google.mlkit.acceleration.internal.MiniBenchmarkResult zze;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* bridge */ /* synthetic */ com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zza(com.google.mlkit.acceleration.internal.RunConfig.Builder r0) {
                com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r0 = r0.zzb
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.mlkit.acceleration.internal.MiniBenchmarkResult zzb(com.google.mlkit.acceleration.internal.RunConfig.Builder r0) {
                com.google.mlkit.acceleration.internal.MiniBenchmarkResult r0 = r0.zze
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.mlkit.acceleration.internal.PipelineId zzc(com.google.mlkit.acceleration.internal.RunConfig.Builder r0) {
                com.google.mlkit.acceleration.internal.PipelineId r0 = r0.zza
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzd(com.google.mlkit.acceleration.internal.RunConfig.Builder r0) {
                java.lang.String r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zze(com.google.mlkit.acceleration.internal.RunConfig.Builder r0) {
                boolean r0 = r0.zzd
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.RunConfig<OptionsT> build() {
                r2 = this;
                com.google.mlkit.acceleration.internal.RunConfig r0 = new com.google.mlkit.acceleration.internal.RunConfig
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.RunConfig.Builder<OptionsT> setBaseOptions(@androidx.annotation.NonNull OptionsT r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.RunConfig.Builder<OptionsT> setConfigName(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.RunConfig.Builder<OptionsT> setMiniBenchmarkRequired(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.mlkit.acceleration.internal.RunConfig.Builder<OptionsT> setMiniBenchmarkResult(@androidx.annotation.Nullable com.google.mlkit.acceleration.internal.MiniBenchmarkResult r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.acceleration.internal.RunConfig.Builder<OptionsT> setPipelineId(@androidx.annotation.NonNull com.google.mlkit.acceleration.internal.PipelineId r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    /* synthetic */ RunConfig(com.google.mlkit.acceleration.internal.RunConfig.Builder r1, com.google.mlkit.acceleration.internal.zzv r2) {
            r0 = this;
            r0.<init>()
            com.google.mlkit.acceleration.internal.PipelineId r2 = com.google.mlkit.acceleration.internal.RunConfig.Builder.zzc(r1)
            r0.zza = r2
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = com.google.mlkit.acceleration.internal.RunConfig.Builder.zza(r1)
            r0.zzb = r2
            java.lang.String r2 = com.google.mlkit.acceleration.internal.RunConfig.Builder.zzd(r1)
            r0.zzc = r2
            boolean r2 = com.google.mlkit.acceleration.internal.RunConfig.Builder.zze(r1)
            r0.zzd = r2
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r1 = com.google.mlkit.acceleration.internal.RunConfig.Builder.zzb(r1)
            r0.zze = r1
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RunConfig"
            com.google.android.gms.internal.mlkit_acceleration.zzt r0 = com.google.android.gms.internal.mlkit_acceleration.zzu.zza(r0)
            java.lang.String r1 = "configName"
            java.lang.String r2 = r3.zzc
            r0.zza(r1, r2)
            java.lang.String r1 = "miniBenchmarkResult"
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r2 = r3.zze
            r0.zza(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zza() {
            r1 = this;
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r0 = r1.zzb
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zzb() {
            r3 = this;
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r0 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 0
            java.lang.Object r0 = r0.cloneWithRunConfigAssigned(r1, r2)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r0 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r0
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.mlkit.acceleration.internal.MiniBenchmarkResult zzc() {
            r1 = this;
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r0 = r1.zze
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.mlkit.acceleration.internal.RunConfig.Builder zzd() {
            r2 = this;
            com.google.mlkit.acceleration.internal.RunConfig$Builder r0 = new com.google.mlkit.acceleration.internal.RunConfig$Builder
            r0.<init>()
            com.google.mlkit.acceleration.internal.PipelineId r1 = r2.zza
            r0.setPipelineId(r1)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r1 = r2.zzb
            r0.setBaseOptions(r1)
            java.lang.String r1 = r2.zzc
            r0.setConfigName(r1)
            boolean r1 = r2.zzd
            r0.setMiniBenchmarkRequired(r1)
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r1 = r2.zze
            r0.setMiniBenchmarkResult(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final boolean zzf() {
            r2 = this;
            java.lang.String r0 = "default_config"
            java.lang.String r1 = r2.zzc
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
