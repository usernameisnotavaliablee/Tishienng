package androidx.camera.core.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraCoordinator {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface CameraOperatingMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int r1, int r2);
    }

    void addListener(@androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener r1);

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    @androidx.annotation.NonNull
    java.util.List<java.util.List<androidx.camera.core.CameraSelector>> getConcurrentCameraSelectors();

    @androidx.annotation.Nullable
    java.lang.String getPairedConcurrentCameraId(@androidx.annotation.NonNull java.lang.String r1);

    void removeListener(@androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener r1);

    void setActiveConcurrentCameraInfos(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r1);

    void setCameraOperatingMode(int r1);

    void shutdown();
}
