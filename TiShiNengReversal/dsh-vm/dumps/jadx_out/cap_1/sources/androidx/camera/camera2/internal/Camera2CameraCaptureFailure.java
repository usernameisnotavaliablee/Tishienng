package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraCaptureFailure extends androidx.camera.core.impl.CameraCaptureFailure {
    private final android.hardware.camera2.CaptureFailure mCaptureFailure;

    public Camera2CameraCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure.Reason r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mCaptureFailure = r2
            return
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CaptureFailure getCaptureFailure() {
            r1 = this;
            android.hardware.camera2.CaptureFailure r0 = r1.mCaptureFailure
            return r0
    }
}
