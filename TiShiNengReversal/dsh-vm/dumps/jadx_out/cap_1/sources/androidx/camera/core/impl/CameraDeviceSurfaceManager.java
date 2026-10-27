package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraDeviceSurfaceManager {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Provider {
        @androidx.annotation.NonNull
        androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable java.lang.Object r2, @androidx.annotation.NonNull java.util.Set<java.lang.String> r3) throws androidx.camera.core.InitializationException;
    }

    @androidx.annotation.NonNull
    android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecs(int r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r3, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r4);

    @androidx.annotation.Nullable
    androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull android.util.Size r4);
}
