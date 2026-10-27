package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Provider {
        @androidx.annotation.NonNull
        androidx.camera.core.impl.CameraFactory newInstance(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraThreadConfig r2, @androidx.annotation.Nullable androidx.camera.core.CameraSelector r3) throws androidx.camera.core.InitializationException;
    }

    @androidx.annotation.NonNull
    java.util.Set<java.lang.String> getAvailableCameraIds();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraInternal getCamera(@androidx.annotation.NonNull java.lang.String r1) throws androidx.camera.core.CameraUnavailableException;

    @androidx.annotation.NonNull
    androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator();

    @androidx.annotation.Nullable
    java.lang.Object getCameraManager();
}
