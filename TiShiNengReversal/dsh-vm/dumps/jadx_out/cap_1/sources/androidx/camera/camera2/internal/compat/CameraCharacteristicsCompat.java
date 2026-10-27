package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraCharacteristicsCompat {

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;

    @androidx.annotation.NonNull
    private final java.lang.String mCameraId;

    @androidx.annotation.Nullable
    private androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat mStreamConfigurationMapCompat;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("this")
    private final java.util.Map<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object> mValuesCache;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CameraCharacteristicsCompatImpl {
        @androidx.annotation.Nullable
        <T> T get(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics.Key<T> r1);

        @androidx.annotation.NonNull
        java.util.Set<java.lang.String> getPhysicalCameraIds();

        @androidx.annotation.NonNull
        android.hardware.camera2.CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mValuesCache = r0
            r0 = 0
            r2.mStreamConfigurationMapCompat = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1b
            androidx.camera.camera2.internal.compat.CameraCharacteristicsApi28Impl r0 = new androidx.camera.camera2.internal.compat.CameraCharacteristicsApi28Impl
            r0.<init>(r3)
            r2.mCameraCharacteristicsImpl = r0
            goto L22
        L1b:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl r0 = new androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl
            r0.<init>(r3)
            r2.mCameraCharacteristicsImpl = r0
        L22:
            r2.mCameraId = r4
            return
    }

    private boolean isKeyNonCacheable(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics.Key<?> r2) {
            r1 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat toCameraCharacteristicsCompat(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics r1, @androidx.annotation.NonNull java.lang.String r2) {
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = new androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public <T> T get(@androidx.annotation.NonNull android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
            r2 = this;
            boolean r0 = r2.isKeyNonCacheable(r3)
            if (r0 == 0) goto Ld
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r2.mCameraCharacteristicsImpl
            java.lang.Object r3 = r0.get(r3)
            return r3
        Ld:
            monitor-enter(r2)
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r0 = r2.mValuesCache     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r3 = move-exception
            goto L29
        L1a:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r2.mCameraCharacteristicsImpl     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L27
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r1 = r2.mValuesCache     // Catch: java.lang.Throwable -> L18
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L18
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r1.mCameraCharacteristicsImpl
            java.util.Set r0 = r0.getPhysicalCameraIds()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
            r3 = this;
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r3.mStreamConfigurationMapCompat
            if (r0 != 0) goto L2f
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.AssertionError -> L24
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.AssertionError -> L24
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0     // Catch: java.lang.AssertionError -> L24
            if (r0 == 0) goto L1c
            androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r1 = new androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector
            java.lang.String r2 = r3.mCameraId
            r1.<init>(r2)
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.toStreamConfigurationMapCompat(r0, r1)
            r3.mStreamConfigurationMapCompat = r0
            goto L2f
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "StreamConfigurationMap is null!"
            r0.<init>(r1)
            throw r0
        L24:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L2f:
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = r3.mStreamConfigurationMapCompat
            return r0
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCharacteristics toCameraCharacteristics() {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r1.mCameraCharacteristicsImpl
            android.hardware.camera2.CameraCharacteristics r0 = r0.unwrap()
            return r0
    }
}
