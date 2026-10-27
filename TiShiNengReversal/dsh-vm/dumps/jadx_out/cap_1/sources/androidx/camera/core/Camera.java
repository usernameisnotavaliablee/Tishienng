package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Camera {
    @androidx.annotation.NonNull
    androidx.camera.core.CameraControl getCameraControl();

    @androidx.annotation.NonNull
    androidx.camera.core.CameraInfo getCameraInfo();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    androidx.camera.core.impl.CameraConfig getExtendedConfig();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    boolean isUseCasesCombinationSupported(@androidx.annotation.NonNull androidx.camera.core.UseCase... r1);

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    void setExtendedConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r1);
}
