package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureResultImageInfo implements androidx.camera.core.ImageInfo {
    private final androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;

    public CameraCaptureResultImageInfo(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraCaptureResult = r1
            return
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mCameraCaptureResult
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.TagBundle getTagBundle() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mCameraCaptureResult
            androidx.camera.core.impl.TagBundle r0 = r0.getTagBundle()
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    public long getTimestamp() {
            r2 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r2.mCameraCaptureResult
            long r0 = r0.getTimestamp()
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r2) {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mCameraCaptureResult
            r0.populateExifData(r2)
            return
    }
}
