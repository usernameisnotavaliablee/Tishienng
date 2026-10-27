package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SurfaceProcessorInternal extends androidx.camera.core.SurfaceProcessor {
    void release();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(@androidx.annotation.IntRange(from = 0, to = 100) int r1, @androidx.annotation.IntRange(from = 0, to = 359) int r2);
}
