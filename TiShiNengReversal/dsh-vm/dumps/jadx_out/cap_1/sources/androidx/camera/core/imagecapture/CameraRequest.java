package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraRequest {
    private final androidx.camera.core.imagecapture.TakePictureCallback mCallback;
    private final java.util.List<androidx.camera.core.impl.CaptureConfig> mCaptureConfigs;

    public CameraRequest(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r1, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureCallback r2) {
            r0 = this;
            r0.<init>()
            r0.mCaptureConfigs = r1
            r0.mCallback = r2
            return
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r1.mCaptureConfigs
            return r0
    }

    boolean isAborted() {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            boolean r0 = r0.isAborted()
            return r0
    }
}
