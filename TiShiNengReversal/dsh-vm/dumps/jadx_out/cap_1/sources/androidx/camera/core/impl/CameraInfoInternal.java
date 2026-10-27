package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraInfoInternal extends androidx.camera.core.CameraInfo {
    void addSessionCaptureCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2);

    @androidx.annotation.NonNull
    java.lang.String getCameraId();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    androidx.camera.core.CameraSelector getCameraSelector();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.EncoderProfilesProvider getEncoderProfilesProvider();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraInfoInternal getImplementation();

    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> getSupportedHighResolutions(int r1);

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> getSupportedResolutions(int r1);

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Timebase getTimebase();

    void removeSessionCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r1);
}
