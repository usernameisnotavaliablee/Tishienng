package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class JpegBytes2Image implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> {
    private static final int MAX_IMAGES = 2;

    public JpegBytes2Image() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply2(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<byte[]> r9) throws androidx.camera.core.ImageCaptureException {
            r8 = this;
            androidx.camera.core.SafeCloseImageReaderProxy r0 = new androidx.camera.core.SafeCloseImageReaderProxy
            android.util.Size r1 = r9.getSize()
            int r1 = r1.getWidth()
            android.util.Size r2 = r9.getSize()
            int r2 = r2.getHeight()
            r3 = 256(0x100, float:3.59E-43)
            r4 = 2
            androidx.camera.core.impl.ImageReaderProxy r1 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(r1, r2, r3, r4)
            r0.<init>(r1)
            java.lang.Object r1 = r9.getData()
            byte[] r1 = (byte[]) r1
            androidx.camera.core.ImageProxy r1 = androidx.camera.core.ImageProcessingUtil.convertJpegBytesToImage(r0, r1)
            r0.safeClose()
            java.util.Objects.requireNonNull(r1)
            r2 = r1
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2
            androidx.camera.core.impl.utils.Exif r3 = r9.getExif()
            java.util.Objects.requireNonNull(r3)
            android.graphics.Rect r4 = r9.getCropRect()
            int r5 = r9.getRotationDegrees()
            android.graphics.Matrix r6 = r9.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r7 = r9.getCameraCaptureResult()
            androidx.camera.core.processing.Packet r9 = androidx.camera.core.processing.Packet.of(r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<byte[]> r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.processing.Packet r1 = (androidx.camera.core.processing.Packet) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
