package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ProcessCameraProviderWrapper {
    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    androidx.camera.core.Camera bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1, @androidx.annotation.NonNull androidx.camera.core.CameraSelector r2, @androidx.annotation.NonNull androidx.camera.core.UseCaseGroup r3);

    boolean hasCamera(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) throws androidx.camera.core.CameraInfoUnavailableException;

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown();

    void unbind(@androidx.annotation.NonNull androidx.camera.core.UseCase... r1);

    void unbindAll();
}
