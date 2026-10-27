package androidx.camera.camera2.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraCaptureResultConverter {
    private Camera2CameraCaptureResultConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.hardware.camera2.CaptureFailure getCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r1) {
            boolean r0 = r1 instanceof androidx.camera.camera2.internal.Camera2CameraCaptureFailure
            if (r0 == 0) goto Lb
            androidx.camera.camera2.internal.Camera2CameraCaptureFailure r1 = (androidx.camera.camera2.internal.Camera2CameraCaptureFailure) r1
            android.hardware.camera2.CaptureFailure r1 = r1.getCaptureFailure()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    public static android.hardware.camera2.CaptureResult getCaptureResult(@androidx.annotation.Nullable androidx.camera.core.impl.CameraCaptureResult r1) {
            boolean r0 = r1 instanceof androidx.camera.camera2.internal.Camera2CameraCaptureResult
            if (r0 == 0) goto Lb
            androidx.camera.camera2.internal.Camera2CameraCaptureResult r1 = (androidx.camera.camera2.internal.Camera2CameraCaptureResult) r1
            android.hardware.camera2.CaptureResult r1 = r1.getCaptureResult()
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
