package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCaptureException extends java.lang.Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.mImageCaptureError = r1
            return
    }

    public int getImageCaptureError() {
            r1 = this;
            int r0 = r1.mImageCaptureError
            return r0
    }
}
