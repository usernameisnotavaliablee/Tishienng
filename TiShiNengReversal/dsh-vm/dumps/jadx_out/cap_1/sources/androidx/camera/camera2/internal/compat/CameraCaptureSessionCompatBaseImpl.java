package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraCaptureSessionCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    final android.hardware.camera2.CameraCaptureSession mCameraCaptureSession;
    final java.lang.Object mObject;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CameraCaptureSessionCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        CameraCaptureSessionCompatParamsApi21(@androidx.annotation.NonNull android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.mCompatHandler = r1
                return
        }
    }

    CameraCaptureSessionCompatBaseImpl(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.hardware.camera2.CameraCaptureSession r1 = (android.hardware.camera2.CameraCaptureSession) r1
            r0.mCameraCaptureSession = r1
            r0.mObject = r2
            return
    }

    static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2, @androidx.annotation.NonNull android.os.Handler r3) {
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 r1 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.mObject
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 r3 = (androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) r3
            android.hardware.camera2.CameraCaptureSession r4 = r1.mCameraCaptureSession
            android.os.Handler r3 = r3.mCompatHandler
            int r2 = r4.captureBurst(r2, r0, r3)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.mObject
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 r3 = (androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) r3
            android.hardware.camera2.CameraCaptureSession r4 = r1.mCameraCaptureSession
            android.os.Handler r3 = r3.mCompatHandler
            int r2 = r4.capture(r2, r0, r3)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.mObject
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 r3 = (androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) r3
            android.hardware.camera2.CameraCaptureSession r4 = r1.mCameraCaptureSession
            android.os.Handler r3 = r3.mCompatHandler
            int r2 = r4.setRepeatingBurst(r2, r0, r3)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r4) throws android.hardware.camera2.CameraAccessException {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.mObject
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 r3 = (androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) r3
            android.hardware.camera2.CameraCaptureSession r4 = r1.mCameraCaptureSession
            android.os.Handler r3 = r3.mCompatHandler
            int r2 = r4.setRepeatingRequest(r2, r0, r3)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCaptureSession unwrap() {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r1.mCameraCaptureSession
            return r0
    }
}
