package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface VideoQualityQuirk extends androidx.camera.core.impl.Quirk {
    boolean isProblematicVideoQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r1, @androidx.annotation.NonNull androidx.camera.video.Quality r2);

    boolean workaroundBySurfaceProcessing();
}
