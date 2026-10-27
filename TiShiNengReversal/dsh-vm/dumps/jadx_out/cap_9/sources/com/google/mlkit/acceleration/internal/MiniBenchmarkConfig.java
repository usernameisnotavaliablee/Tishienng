package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface MiniBenchmarkConfig<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>, InputT, ResultT> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> closeDetector();

    @com.google.android.gms.common.annotation.KeepForSdk
    float getCorrectnessScore(@androidx.annotation.NonNull InputT r1, @androidx.annotation.NonNull ResultT r2, @androidx.annotation.NonNull ResultT r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    float getCorrectnessScoreThreshold();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    OptionsT getDefaultOptionsAsDecoder();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    java.util.List<android.util.Pair<InputT, ResultT>> getInputsWithExpectedResults(@androidx.annotation.NonNull OptionsT r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    int getLatencyBenchmarkRepetitionNumber();

    @com.google.android.gms.common.annotation.KeepForSdk
    int getMaxRetryCount();

    @com.google.android.gms.common.annotation.KeepForSdk
    int getTaskTimeoutSeconds();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    java.lang.Class<? extends com.google.mlkit.acceleration.internal.MiniBenchmarkWorker<OptionsT, InputT, ResultT>> getWorkerClass();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> initDetectorForCorrectnessBenchmark(@androidx.annotation.NonNull OptionsT r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> initDetectorForLatencyBenchmark(@androidx.annotation.NonNull OptionsT r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean requireDeviceIdle();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<ResultT> runDetector(@androidx.annotation.NonNull InputT r1);
}
