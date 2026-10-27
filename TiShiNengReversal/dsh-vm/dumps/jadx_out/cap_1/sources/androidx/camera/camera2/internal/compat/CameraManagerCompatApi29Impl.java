package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraManagerCompatApi29Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl {
    CameraManagerCompatApi29Impl(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(@androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L7
            android.hardware.camera2.CameraCharacteristics r2 = r0.getCameraCharacteristics(r2)     // Catch: android.hardware.camera2.CameraAccessException -> L7
            return r2
        L7:
            r2 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r4) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L6
            r0.openCamera(r2, r3, r4)     // Catch: android.hardware.camera2.CameraAccessException -> L6
            return
        L6:
            r2 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r2 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r2)
            throw r2
    }
}
