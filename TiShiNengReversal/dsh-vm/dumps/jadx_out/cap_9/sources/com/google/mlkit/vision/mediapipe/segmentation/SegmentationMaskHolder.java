package com.google.mlkit.vision.mediapipe.segmentation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SegmentationMaskHolder {
    private final java.nio.ByteBuffer zza;
    private final int zzb;
    private final int zzc;

    @com.google.android.gms.common.annotation.KeepForSdk
    public SegmentationMaskHolder(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.nio.ByteBuffer getBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getHeight() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getWidth() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
