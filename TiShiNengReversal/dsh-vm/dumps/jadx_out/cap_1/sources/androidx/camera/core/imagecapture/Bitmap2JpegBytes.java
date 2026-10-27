package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class Bitmap2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class In {
        In() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.imagecapture.Bitmap2JpegBytes.In of(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<android.graphics.Bitmap> r1, int r2) {
                androidx.camera.core.imagecapture.AutoValue_Bitmap2JpegBytes_In r0 = new androidx.camera.core.imagecapture.AutoValue_Bitmap2JpegBytes_In
                r0.<init>(r1, r2)
                return r0
        }

        abstract int getJpegQuality();

        abstract androidx.camera.core.processing.Packet<android.graphics.Bitmap> getPacket();
    }

    Bitmap2JpegBytes() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<byte[]> apply2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Bitmap2JpegBytes.In r13) throws androidx.camera.core.ImageCaptureException {
            r12 = this;
            androidx.camera.core.processing.Packet r0 = r13.getPacket()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.lang.Object r2 = r0.getData()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
            int r13 = r13.getJpegQuality()
            r2.compress(r3, r13, r1)
            byte[] r4 = r1.toByteArray()
            androidx.camera.core.impl.utils.Exif r5 = r0.getExif()
            java.util.Objects.requireNonNull(r5)
            android.util.Size r7 = r0.getSize()
            android.graphics.Rect r8 = r0.getCropRect()
            int r9 = r0.getRotationDegrees()
            android.graphics.Matrix r10 = r0.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r11 = r0.getCameraCaptureResult()
            r6 = 256(0x100, float:3.59E-43)
            androidx.camera.core.processing.Packet r13 = androidx.camera.core.processing.Packet.of(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<byte[]> apply(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Bitmap2JpegBytes.In r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.imagecapture.Bitmap2JpegBytes$In r1 = (androidx.camera.core.imagecapture.Bitmap2JpegBytes.In) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
