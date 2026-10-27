package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraCaptureSessionCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl {
    CameraCaptureSessionCompatApi28Impl(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r1.mCameraCaptureSession
            int r2 = r0.captureBurstRequests(r2, r3, r4)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r1.mCameraCaptureSession
            int r2 = r0.captureSingleRequest(r2, r3, r4)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r1.mCameraCaptureSession
            int r2 = r0.setRepeatingBurstRequests(r2, r3, r4)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r1.mCameraCaptureSession
            int r2 = r0.setSingleRepeatingRequest(r2, r3, r4)
            return r2
    }
}
