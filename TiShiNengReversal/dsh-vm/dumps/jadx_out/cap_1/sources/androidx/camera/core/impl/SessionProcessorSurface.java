package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SessionProcessorSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final int mOutputConfigId;
    private final android.view.Surface mSurface;

    public SessionProcessorSurface(@androidx.annotation.NonNull android.view.Surface r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mSurface = r1
            r0.mOutputConfigId = r2
            return
    }

    public int getOutputConfigId() {
            r1 = this;
            int r0 = r1.mOutputConfigId
            return r0
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
