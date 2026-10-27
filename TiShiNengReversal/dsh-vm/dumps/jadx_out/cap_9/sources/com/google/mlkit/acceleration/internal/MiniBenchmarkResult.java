package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class MiniBenchmarkResult {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int STABLE = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int UNKNOWN = 0;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int UNSTABLE = 2;

    public MiniBenchmarkResult() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract float getCorrectnessScore();

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract int getRunLatencyMs();

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract int getStabilityStatus();

    public abstract boolean zza();
}
