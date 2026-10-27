package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs();

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SessionConfig getSessionConfig();

    void issueCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> open(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r3);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release(boolean r1);

    void setSessionConfig(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r1);

    void setStreamUseCaseMap(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r1);
}
