package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class JpegBytes2CroppedBitmap implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    JpegBytes2CroppedBitmap() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private android.graphics.Bitmap createCroppedBitmap(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull android.graphics.Rect r4) throws androidx.camera.core.ImageCaptureException {
            r2 = this;
            int r0 = r3.length     // Catch: java.io.IOException -> L10
            r1 = 0
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r3, r1, r0, r1)     // Catch: java.io.IOException -> L10
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap r3 = r3.decodeRegion(r4, r0)
            return r3
        L10:
            r3 = move-exception
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException
            r0 = 1
            java.lang.String r1 = "Failed to decode JPEG."
            r4.<init>(r0, r1, r3)
            throw r4
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply2(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<byte[]> r9) throws androidx.camera.core.ImageCaptureException {
            r8 = this;
            android.graphics.Rect r0 = r9.getCropRect()
            java.lang.Object r1 = r9.getData()
            byte[] r1 = (byte[]) r1
            android.graphics.Bitmap r2 = r8.createCroppedBitmap(r1, r0)
            androidx.camera.core.impl.utils.Exif r3 = r9.getExif()
            java.util.Objects.requireNonNull(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r2.getWidth()
            int r5 = r2.getHeight()
            r6 = 0
            r4.<init>(r6, r6, r1, r5)
            int r5 = r9.getRotationDegrees()
            android.graphics.Matrix r1 = r9.getSensorToBufferTransform()
            android.graphics.Matrix r6 = androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(r1, r0)
            androidx.camera.core.impl.CameraCaptureResult r7 = r9.getCameraCaptureResult()
            androidx.camera.core.processing.Packet r9 = androidx.camera.core.processing.Packet.of(r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<byte[]> r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.processing.Packet r1 = (androidx.camera.core.processing.Packet) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
