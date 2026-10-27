package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureResults {
    private CameraCaptureResults() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.ImageInfo r1) {
            boolean r0 = r1 instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo
            if (r0 == 0) goto Lb
            androidx.camera.core.internal.CameraCaptureResultImageInfo r1 = (androidx.camera.core.internal.CameraCaptureResultImageInfo) r1
            androidx.camera.core.impl.CameraCaptureResult r1 = r1.getCameraCaptureResult()
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
