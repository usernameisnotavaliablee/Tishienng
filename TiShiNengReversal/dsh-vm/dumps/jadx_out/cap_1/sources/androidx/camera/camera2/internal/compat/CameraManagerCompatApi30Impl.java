package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(30)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraManagerCompatApi30Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl {
    CameraManagerCompatApi30Impl(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r1 = this;
            android.hardware.camera2.CameraManager r0 = r1.mCameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L7
            java.util.Set r0 = r0.getConcurrentCameraIds()     // Catch: android.hardware.camera2.CameraAccessException -> L7
            return r0
        L7:
            r0 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(r0)
            throw r0
    }
}
