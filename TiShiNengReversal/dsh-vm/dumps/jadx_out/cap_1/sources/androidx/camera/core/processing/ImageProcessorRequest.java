package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageProcessorRequest implements androidx.camera.core.ImageProcessor.Request {

    @androidx.annotation.NonNull
    private final androidx.camera.core.ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mImageProxy = r1
            r0.mOutputFormat = r2
            return
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    @androidx.annotation.NonNull
    public androidx.camera.core.ImageProxy getInputImage() {
            r1 = this;
            androidx.camera.core.ImageProxy r0 = r1.mImageProxy
            return r0
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
            r1 = this;
            int r0 = r1.mOutputFormat
            return r0
    }
}
