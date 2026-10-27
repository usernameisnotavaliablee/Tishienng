package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageCaptureControl {
    @androidx.annotation.MainThread
    void lockFlashMode();

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitStillCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r1);

    @androidx.annotation.MainThread
    void unlockFlashMode();
}
