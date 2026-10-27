package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ImmutableZoomState implements androidx.camera.core.ZoomState {
    public ImmutableZoomState() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.ZoomState create(float r1, float r2, float r3, float r4) {
            androidx.camera.core.internal.AutoValue_ImmutableZoomState r0 = new androidx.camera.core.internal.AutoValue_ImmutableZoomState
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.ZoomState create(@androidx.annotation.NonNull androidx.camera.core.ZoomState r4) {
            androidx.camera.core.internal.AutoValue_ImmutableZoomState r0 = new androidx.camera.core.internal.AutoValue_ImmutableZoomState
            float r1 = r4.getZoomRatio()
            float r2 = r4.getMaxZoomRatio()
            float r3 = r4.getMinZoomRatio()
            float r4 = r4.getLinearZoom()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();
}
