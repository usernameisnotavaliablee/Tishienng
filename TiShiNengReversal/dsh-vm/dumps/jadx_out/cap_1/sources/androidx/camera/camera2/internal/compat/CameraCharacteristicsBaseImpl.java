package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraCharacteristicsBaseImpl implements androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {

    @androidx.annotation.NonNull
    protected final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;

    CameraCharacteristicsBaseImpl(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraCharacteristics = r1
            return
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @androidx.annotation.Nullable
    public <T> T get(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics.Key<T> r2) {
            r1 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r1.mCameraCharacteristics
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCharacteristics unwrap() {
            r1 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r1.mCameraCharacteristics
            return r0
    }
}
