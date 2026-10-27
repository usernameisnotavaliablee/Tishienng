package com.google.mlkit.vision.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface PoseDetector extends com.google.mlkit.vision.interfaces.Detector<com.google.mlkit.vision.pose.Pose> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    void close();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> closeWithTask();

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<java.lang.Void> getInitTask();

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<com.google.mlkit.vision.pose.Pose> process(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r1);

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<com.google.mlkit.vision.pose.Pose> process(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r1);
}
