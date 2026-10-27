package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CaptureCallbackContainer extends androidx.camera.core.impl.CameraCaptureCallback {
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback mCaptureCallback;

    private CaptureCallbackContainer(android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.mCaptureCallback = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "captureCallback is null"
            r2.<init>(r0)
            throw r2
    }

    static androidx.camera.camera2.internal.CaptureCallbackContainer create(android.hardware.camera2.CameraCaptureSession.CaptureCallback r1) {
            androidx.camera.camera2.internal.CaptureCallbackContainer r0 = new androidx.camera.camera2.internal.CaptureCallbackContainer
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    android.hardware.camera2.CameraCaptureSession.CaptureCallback getCaptureCallback() {
            r1 = this;
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r1.mCaptureCallback
            return r0
    }
}
