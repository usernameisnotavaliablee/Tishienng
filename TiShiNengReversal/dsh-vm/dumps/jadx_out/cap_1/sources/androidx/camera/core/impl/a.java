package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class a {
    @androidx.annotation.NonNull
    public static android.hardware.camera2.CaptureResult a(androidx.camera.core.impl.CameraCaptureResult r0) {
            androidx.camera.core.impl.CameraCaptureResult r0 = androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult.create()
            android.hardware.camera2.CaptureResult r0 = r0.getCaptureResult()
            return r0
    }

    public static void b(androidx.camera.core.impl.CameraCaptureResult r0, @androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r1) {
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = r0.getFlashState()
            r1.setFlashState(r0)
            return
    }
}
