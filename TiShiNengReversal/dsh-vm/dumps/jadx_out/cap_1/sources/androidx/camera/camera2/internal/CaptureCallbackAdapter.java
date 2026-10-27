package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CaptureCallbackAdapter extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    private final androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;

    CaptureCallbackAdapter(androidx.camera.core.impl.CameraCaptureCallback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.mCameraCaptureCallback = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cameraCaptureCallback is null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r4) {
            r1 = this;
            super.onCaptureCompleted(r2, r3, r4)
            java.lang.Object r2 = r3.getTag()
            if (r2 == 0) goto L13
            boolean r3 = r2 instanceof androidx.camera.core.impl.TagBundle
            java.lang.String r0 = "The tagBundle object from the CaptureResult is not a TagBundle object."
            androidx.core.util.Preconditions.checkArgument(r3, r0)
            androidx.camera.core.impl.TagBundle r2 = (androidx.camera.core.impl.TagBundle) r2
            goto L17
        L13:
            androidx.camera.core.impl.TagBundle r2 = androidx.camera.core.impl.TagBundle.emptyBundle()
        L17:
            androidx.camera.core.impl.CameraCaptureCallback r3 = r1.mCameraCaptureCallback
            androidx.camera.camera2.internal.Camera2CameraCaptureResult r0 = new androidx.camera.camera2.internal.Camera2CameraCaptureResult
            r0.<init>(r2, r4)
            r3.onCaptureCompleted(r0)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r3) {
            r0 = this;
            super.onCaptureFailed(r1, r2, r3)
            androidx.camera.core.impl.CameraCaptureFailure r1 = new androidx.camera.core.impl.CameraCaptureFailure
            androidx.camera.core.impl.CameraCaptureFailure$Reason r2 = androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR
            r1.<init>(r2)
            androidx.camera.core.impl.CameraCaptureCallback r2 = r0.mCameraCaptureCallback
            r2.onCaptureFailed(r1)
            return
    }
}
