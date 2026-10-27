package com.google.mlkit.vision.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Detector<DetectionResultT> extends java.io.Closeable, androidx.lifecycle.LifecycleObserver {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_BARCODE_SCANNING = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_DOCUMENT_DETECTION = 10;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_FACE_DETECTION = 2;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_IMAGE_CAPTIONING = 9;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_IMAGE_LABELING = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_OBJECT_DETECTION = 5;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_POSE_DETECTION = 6;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_SEGMENTATION = 7;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_SELFIE_FACE_DETECTION = 8;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_SUBJECT_SEGMENTATION = 11;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int TYPE_TEXT_RECOGNITION = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface DetectorType {
    }

    @com.google.mlkit.vision.interfaces.Detector.DetectorType
    @com.google.android.gms.common.annotation.KeepForSdk
    int getDetectorType();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.graphics.Bitmap r1, int r2);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.media.Image r1, int r2);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull android.media.Image r1, int r2, @androidx.annotation.NonNull android.graphics.Matrix r3);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<DetectionResultT> process(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5);
}
