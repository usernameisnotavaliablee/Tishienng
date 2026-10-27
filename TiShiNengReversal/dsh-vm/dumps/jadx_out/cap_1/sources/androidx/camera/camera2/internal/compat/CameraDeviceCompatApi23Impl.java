package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraDeviceCompatApi23Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl {
    CameraDeviceCompatApi23Impl(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl create(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r2, @androidx.annotation.NonNull android.os.Handler r3) {
            androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl r0 = new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 r1 = new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r5) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r4 = this;
            android.hardware.camera2.CameraDevice r0 = r4.mCameraDevice
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.checkPreconditions(r0, r5)
            androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper r0 = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper
            java.util.concurrent.Executor r1 = r5.getExecutor()
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = r5.getStateCallback()
            r0.<init>(r1, r2)
            java.util.List r1 = r5.getOutputConfigurations()
            java.util.List r1 = androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.unpackSurfaces(r1)
            java.lang.Object r2 = r4.mImplParams
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 r2 = (androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) r2
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 r2 = (androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) r2
            android.os.Handler r2 = r2.mCompatHandler
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r3 = r5.getInputConfiguration()
            if (r3 == 0) goto L3d
            java.lang.Object r5 = r3.unwrap()     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            android.hardware.camera2.params.InputConfiguration r5 = (android.hardware.camera2.params.InputConfiguration) r5     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            androidx.core.util.Preconditions.checkNotNull(r5)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            android.hardware.camera2.CameraDevice r3 = r4.mCameraDevice     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r3.createReprocessableCaptureSession(r5, r1, r0, r2)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            return
        L3b:
            r5 = move-exception
            goto L50
        L3d:
            int r5 = r5.getSessionType()     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r3 = 1
            if (r5 != r3) goto L4a
            android.hardware.camera2.CameraDevice r5 = r4.mCameraDevice     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r5.createConstrainedHighSpeedCaptureSession(r1, r0, r2)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            return
        L4a:
            android.hardware.camera2.CameraDevice r5 = r4.mCameraDevice     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            r4.createBaseCaptureSession(r5, r1, r0, r2)     // Catch: android.hardware.camera2.CameraAccessException -> L3b
            return
        L50:
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r5 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r5)
            throw r5
    }
}
