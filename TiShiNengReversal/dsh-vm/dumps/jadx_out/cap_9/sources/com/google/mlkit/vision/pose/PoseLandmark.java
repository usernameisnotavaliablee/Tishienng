package com.google.mlkit.vision.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseLandmark {
    public static final int LEFT_ANKLE = 27;
    public static final int LEFT_EAR = 7;
    public static final int LEFT_ELBOW = 13;
    public static final int LEFT_EYE = 2;
    public static final int LEFT_EYE_INNER = 1;
    public static final int LEFT_EYE_OUTER = 3;
    public static final int LEFT_FOOT_INDEX = 31;
    public static final int LEFT_HEEL = 29;
    public static final int LEFT_HIP = 23;
    public static final int LEFT_INDEX = 19;
    public static final int LEFT_KNEE = 25;
    public static final int LEFT_MOUTH = 9;
    public static final int LEFT_PINKY = 17;
    public static final int LEFT_SHOULDER = 11;
    public static final int LEFT_THUMB = 21;
    public static final int LEFT_WRIST = 15;
    public static final int NOSE = 0;
    public static final int RIGHT_ANKLE = 28;
    public static final int RIGHT_EAR = 8;
    public static final int RIGHT_ELBOW = 14;
    public static final int RIGHT_EYE = 5;
    public static final int RIGHT_EYE_INNER = 4;
    public static final int RIGHT_EYE_OUTER = 6;
    public static final int RIGHT_FOOT_INDEX = 32;
    public static final int RIGHT_HEEL = 30;
    public static final int RIGHT_HIP = 24;
    public static final int RIGHT_INDEX = 20;
    public static final int RIGHT_KNEE = 26;
    public static final int RIGHT_MOUTH = 10;
    public static final int RIGHT_PINKY = 18;
    public static final int RIGHT_SHOULDER = 12;
    public static final int RIGHT_THUMB = 22;
    public static final int RIGHT_WRIST = 16;

    @com.google.mlkit.vision.pose.PoseLandmark.LandmarkType
    private final int zza;
    private final com.google.mlkit.vision.common.PointF3D zzb;
    private final android.graphics.PointF zzc;
    private final float zzd;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface LandmarkType {
    }

    PoseLandmark(@com.google.mlkit.vision.pose.PoseLandmark.LandmarkType int r2, @androidx.annotation.NonNull com.google.mlkit.vision.common.PointF3D r3, float r4) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            android.graphics.PointF r2 = new android.graphics.PointF
            float r0 = r3.getX()
            float r3 = r3.getY()
            r2.<init>(r0, r3)
            r1.zzc = r2
            r1.zzd = r4
            return
    }

    public float getInFrameLikelihood() {
            r1 = this;
            float r0 = r1.zzd
            return r0
    }

    @com.google.mlkit.vision.pose.PoseLandmark.LandmarkType
    public int getLandmarkType() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.PointF getPosition() {
            r1 = this;
            android.graphics.PointF r0 = r1.zzc
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.mlkit.vision.common.PointF3D getPosition3D() {
            r1 = this;
            com.google.mlkit.vision.common.PointF3D r0 = r1.zzb
            return r0
    }
}
