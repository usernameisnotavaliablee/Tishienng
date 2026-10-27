package androidx.camera.camera2.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CameraEventCallback {
    public CameraEventCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onDeInitSession() {
            r0 = this;
            return
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.CaptureConfig onDisableSession() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.CaptureConfig onEnableSession() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.CaptureConfig onInitSession() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.CaptureConfig onRepeating() {
            r1 = this;
            r0 = 0
            return r0
    }
}
