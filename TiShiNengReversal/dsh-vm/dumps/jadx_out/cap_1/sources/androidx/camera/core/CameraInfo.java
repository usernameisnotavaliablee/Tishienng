package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraInfo {

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImplementationType {
    }

    @androidx.annotation.NonNull
    androidx.camera.core.CameraSelector getCameraSelector();

    @androidx.annotation.NonNull
    androidx.lifecycle.LiveData<androidx.camera.core.CameraState> getCameraState();

    @androidx.annotation.NonNull
    androidx.camera.core.ExposureState getExposureState();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    java.lang.String getImplementationType();

    @androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false)
    float getIntrinsicZoomRatio();

    int getLensFacing();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int r1);

    @androidx.annotation.NonNull
    java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges();

    @androidx.annotation.NonNull
    androidx.lifecycle.LiveData<java.lang.Integer> getTorchState();

    @androidx.annotation.NonNull
    androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState();

    boolean hasFlashUnit();

    boolean isFocusMeteringSupported(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r1);

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    boolean isPrivateReprocessingSupported();

    @androidx.camera.core.ExperimentalZeroShutterLag
    boolean isZslSupported();
}
