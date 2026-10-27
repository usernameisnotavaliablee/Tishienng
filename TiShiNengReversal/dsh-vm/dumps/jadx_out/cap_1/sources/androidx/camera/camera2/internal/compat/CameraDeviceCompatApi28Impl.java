package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraDeviceCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl {
    CameraDeviceCompatApi28Impl(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r2) {
            r1 = this;
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.hardware.camera2.CameraDevice r2 = (android.hardware.camera2.CameraDevice) r2
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            java.lang.Object r2 = r2.unwrap()
            android.hardware.camera2.params.SessionConfiguration r2 = (android.hardware.camera2.params.SessionConfiguration) r2
            androidx.core.util.Preconditions.checkNotNull(r2)
            android.hardware.camera2.CameraDevice r0 = r1.mCameraDevice     // Catch: android.hardware.camera2.CameraAccessException -> Lf
            r0.createCaptureSession(r2)     // Catch: android.hardware.camera2.CameraAccessException -> Lf
            return
        Lf:
            r2 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }
}
