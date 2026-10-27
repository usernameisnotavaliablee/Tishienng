package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraCharacteristicsApi28Impl extends androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl {
    private static final java.lang.String TAG = "CameraCharacteristicsImpl";

    CameraCharacteristicsApi28Impl(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
            r3 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r3.mCameraCharacteristics     // Catch: java.lang.Exception -> L7
            java.util.Set r0 = r0.getPhysicalCameraIds()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = "CameraCharacteristicsImpl"
            java.lang.String r2 = "CameraCharacteristics.getPhysicalCameraIds throws an exception."
            androidx.camera.core.Logger.e(r1, r2, r0)
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }
}
