package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface AllowlistConfig<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    java.lang.String getBundledAllowlistAssetPath();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isRunConfigCompatibleWithOptions(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull OptionsT r2);

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean shouldCheckGenericGpuAllowlist(@androidx.annotation.NonNull java.lang.String r1);
}
