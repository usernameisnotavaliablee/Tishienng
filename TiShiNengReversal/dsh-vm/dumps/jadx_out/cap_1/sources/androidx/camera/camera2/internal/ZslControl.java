package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ZslControl {
    void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r1);

    @androidx.annotation.Nullable
    androidx.camera.core.ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean r1);

    void setZslDisabledByUserCaseConfig(boolean r1);
}
