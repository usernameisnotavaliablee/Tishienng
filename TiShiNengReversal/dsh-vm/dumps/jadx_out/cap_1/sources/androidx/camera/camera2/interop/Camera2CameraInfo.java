package androidx.camera.camera2.interop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.camera2.interop.ExperimentalCamera2Interop
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CameraInfo {
    private static final java.lang.String TAG = "Camera2CameraInfo";
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCamera2CameraInfoImpl;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public Camera2CameraInfo(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraInfoImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mCamera2CameraInfoImpl = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static android.hardware.camera2.CameraCharacteristics extractCameraCharacteristics(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r2) {
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2
            androidx.camera.core.impl.CameraInfoInternal r2 = r2.getImplementation()
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl
            java.lang.String r1 = "CameraInfo does not contain any Camera2 information."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r2 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r2
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r2.getCameraCharacteristicsCompat()
            android.hardware.camera2.CameraCharacteristics r2 = r2.toCameraCharacteristics()
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.interop.Camera2CameraInfo from(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r2) {
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2
            androidx.camera.core.impl.CameraInfoInternal r2 = r2.getImplementation()
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl
            java.lang.String r1 = "CameraInfo doesn't contain Camera2 implementation."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r2 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r2
            androidx.camera.camera2.interop.Camera2CameraInfo r2 = r2.getCamera2CameraInfo()
            return r2
    }

    @androidx.annotation.Nullable
    public <T> T getCameraCharacteristic(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics.Key<T> r2) {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = r1.mCamera2CameraInfoImpl
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r0.getCameraCharacteristicsCompat()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = r1.mCamera2CameraInfoImpl
            java.util.Map r0 = r0.getCameraCharacteristicsMap()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getCameraId() {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r0 = r1.mCamera2CameraInfoImpl
            java.lang.String r0 = r0.getCameraId()
            return r0
    }
}
