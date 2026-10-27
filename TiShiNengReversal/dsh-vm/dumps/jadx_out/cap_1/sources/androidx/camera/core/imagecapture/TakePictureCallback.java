package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface TakePictureCallback {
    boolean isAborted();

    @androidx.annotation.MainThread
    void onCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r1);

    @androidx.annotation.MainThread
    void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileResults r1);

    @androidx.annotation.MainThread
    void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1);

    @androidx.annotation.MainThread
    void onImageCaptured();

    @androidx.annotation.MainThread
    void onProcessFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r1);
}
