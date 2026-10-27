package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface AccelerationLogger<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>> {
    @com.google.android.gms.common.annotation.KeepForSdk
    void logAccelerationInfraError(@androidx.annotation.NonNull com.google.mlkit.acceleration.internal.AccelerationInfraException r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    void logBenchmarkPipelineError(@androidx.annotation.NonNull OptionsT r1, @androidx.annotation.Nullable java.lang.Throwable r2);

    @com.google.android.gms.common.annotation.KeepForSdk
    void logBenchmarkResult(@androidx.annotation.NonNull OptionsT r1, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.MiniBenchmarkResult r2);
}
