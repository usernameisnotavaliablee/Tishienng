package com.google.mlkit.vision.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseDetection {
    private PoseDetection() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.vision.pose.PoseDetector getClient(@androidx.annotation.NonNull com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1) {
            java.lang.String r0 = "PoseDetectorOptionsBase can not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            com.google.mlkit.vision.pose.internal.PoseDetectorImpl r1 = com.google.mlkit.vision.pose.internal.PoseDetectorImpl.newInstance(r1)
            return r1
    }
}
