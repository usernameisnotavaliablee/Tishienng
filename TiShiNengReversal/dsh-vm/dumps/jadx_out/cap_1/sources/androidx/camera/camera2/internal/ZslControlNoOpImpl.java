package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ZslControlNoOpImpl implements androidx.camera.camera2.internal.ZslControl {
    public ZslControlNoOpImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r1) {
            r0 = this;
            return
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy dequeueImageFromBuffer() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByFlashMode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByFlashMode(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean r1) {
            r0 = this;
            return
    }
}
