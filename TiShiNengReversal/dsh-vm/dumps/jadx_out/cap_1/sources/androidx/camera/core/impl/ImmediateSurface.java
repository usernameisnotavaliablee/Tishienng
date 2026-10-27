package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImmediateSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final android.view.Surface mSurface;

    public ImmediateSurface(@androidx.annotation.NonNull android.view.Surface r1) {
            r0 = this;
            r0.<init>()
            r0.mSurface = r1
            return
    }

    public ImmediateSurface(@androidx.annotation.NonNull android.view.Surface r1, @androidx.annotation.NonNull android.util.Size r2, int r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.mSurface = r1
            return
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
            r1 = this;
            android.view.Surface r0 = r1.mSurface
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
    }
}
