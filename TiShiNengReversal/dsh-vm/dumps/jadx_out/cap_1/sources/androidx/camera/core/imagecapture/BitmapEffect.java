package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BitmapEffect implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    private final androidx.camera.core.processing.InternalImageProcessor mProcessor;

    BitmapEffect(androidx.camera.core.processing.InternalImageProcessor r1) {
            r0 = this;
            r0.<init>()
            r0.mProcessor = r1
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply2(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<android.graphics.Bitmap> r10) throws androidx.camera.core.ImageCaptureException {
            r9 = this;
            androidx.camera.core.processing.InternalImageProcessor r0 = r9.mProcessor
            androidx.camera.core.processing.ImageProcessorRequest r1 = new androidx.camera.core.processing.ImageProcessorRequest
            androidx.camera.core.imagecapture.RgbaImageProxy r2 = new androidx.camera.core.imagecapture.RgbaImageProxy
            r2.<init>(r10)
            r3 = 1
            r1.<init>(r2, r3)
            androidx.camera.core.ImageProcessor$Response r0 = r0.safeProcess(r1)
            androidx.camera.core.ImageProxy r0 = r0.getOutputImage()
            java.util.Objects.requireNonNull(r0)
            r1 = r0
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r1.getPlanes()
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            android.graphics.Bitmap r3 = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(r1, r2, r0)
            androidx.camera.core.impl.utils.Exif r4 = r10.getExif()
            java.util.Objects.requireNonNull(r4)
            android.graphics.Rect r5 = r10.getCropRect()
            int r6 = r10.getRotationDegrees()
            android.graphics.Matrix r7 = r10.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r8 = r10.getCameraCaptureResult()
            androidx.camera.core.processing.Packet r10 = androidx.camera.core.processing.Packet.of(r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<android.graphics.Bitmap> r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.processing.Packet r1 = (androidx.camera.core.processing.Packet) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
