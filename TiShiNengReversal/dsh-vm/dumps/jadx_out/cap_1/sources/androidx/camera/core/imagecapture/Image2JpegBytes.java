package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Image2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {
    private final androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector mJpegMetadataCorrector;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class In {
        In() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.imagecapture.Image2JpegBytes.In of(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> r1, int r2) {
                androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In r0 = new androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In
                r0.<init>(r1, r2)
                return r0
        }

        abstract int getJpegQuality();

        abstract androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getPacket();
    }

    Image2JpegBytes(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector r0 = new androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector
            r0.<init>(r2)
            r1.mJpegMetadataCorrector = r0
            return
    }

    private static androidx.camera.core.impl.utils.Exif extractExif(@androidx.annotation.NonNull byte[] r3) throws androidx.camera.core.ImageCaptureException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> La
            r0.<init>(r3)     // Catch: java.io.IOException -> La
            androidx.camera.core.impl.utils.Exif r3 = androidx.camera.core.impl.utils.Exif.createFromInputStream(r0)     // Catch: java.io.IOException -> La
            return r3
        La:
            r3 = move-exception
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            r1 = 0
            java.lang.String r2 = "Failed to extract Exif from YUV-generated JPEG"
            r0.<init>(r1, r2, r3)
            throw r0
    }

    private androidx.camera.core.processing.Packet<byte[]> processJpegImage(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Image2JpegBytes.In r11) {
            r10 = this;
            androidx.camera.core.processing.Packet r11 = r11.getPacket()
            androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector r0 = r10.mJpegMetadataCorrector
            java.lang.Object r1 = r11.getData()
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1
            byte[] r2 = r0.jpegImageToJpegByteArray(r1)
            androidx.camera.core.impl.utils.Exif r3 = r11.getExif()
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.getSize()
            android.graphics.Rect r6 = r11.getCropRect()
            int r7 = r11.getRotationDegrees()
            android.graphics.Matrix r8 = r11.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r9 = r11.getCameraCaptureResult()
            r4 = 256(0x100, float:3.59E-43)
            androidx.camera.core.processing.Packet r11 = androidx.camera.core.processing.Packet.of(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    private androidx.camera.core.processing.Packet<byte[]> processYuvImage(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Image2JpegBytes.In r13) throws androidx.camera.core.ImageCaptureException {
            r12 = this;
            androidx.camera.core.processing.Packet r0 = r13.getPacket()
            java.lang.Object r1 = r0.getData()
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1
            android.graphics.Rect r2 = r0.getCropRect()
            int r13 = r13.getJpegQuality()     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> L50
            int r3 = r0.getRotationDegrees()     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> L50
            byte[] r4 = androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(r1, r2, r13, r3)     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> L50
            androidx.camera.core.impl.utils.Exif r5 = extractExif(r4)
            android.util.Size r7 = new android.util.Size
            int r13 = r2.width()
            int r1 = r2.height()
            r7.<init>(r13, r1)
            android.graphics.Rect r8 = new android.graphics.Rect
            int r13 = r2.width()
            int r1 = r2.height()
            r3 = 0
            r8.<init>(r3, r3, r13, r1)
            int r9 = r0.getRotationDegrees()
            android.graphics.Matrix r13 = r0.getSensorToBufferTransform()
            android.graphics.Matrix r10 = androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(r13, r2)
            androidx.camera.core.impl.CameraCaptureResult r11 = r0.getCameraCaptureResult()
            r6 = 256(0x100, float:3.59E-43)
            androidx.camera.core.processing.Packet r13 = androidx.camera.core.processing.Packet.of(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L50:
            r0 = move-exception
            r13 = r0
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            r1 = 1
            java.lang.String r2 = "Failed to encode the image to JPEG."
            r0.<init>(r1, r2, r13)
            throw r0
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<byte[]> apply2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Image2JpegBytes.In r5) throws androidx.camera.core.ImageCaptureException {
            r4 = this;
            androidx.camera.core.processing.Packet r0 = r5.getPacket()     // Catch: java.lang.Throwable -> L22
            int r0 = r0.getFormat()     // Catch: java.lang.Throwable -> L22
            r1 = 35
            if (r0 == r1) goto L3b
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L24
            androidx.camera.core.processing.Packet r0 = r4.processJpegImage(r5)     // Catch: java.lang.Throwable -> L22
        L14:
            androidx.camera.core.processing.Packet r5 = r5.getPacket()
            java.lang.Object r5 = r5.getData()
            androidx.camera.core.ImageProxy r5 = (androidx.camera.core.ImageProxy) r5
            r5.close()
            return r0
        L22:
            r0 = move-exception
            goto L40
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "Unexpected format: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L22
            r2.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L3b:
            androidx.camera.core.processing.Packet r0 = r4.processYuvImage(r5)     // Catch: java.lang.Throwable -> L22
            goto L14
        L40:
            androidx.camera.core.processing.Packet r5 = r5.getPacket()
            java.lang.Object r5 = r5.getData()
            androidx.camera.core.ImageProxy r5 = (androidx.camera.core.ImageProxy) r5
            r5.close()
            throw r0
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<byte[]> apply(@androidx.annotation.NonNull androidx.camera.core.imagecapture.Image2JpegBytes.In r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.imagecapture.Image2JpegBytes$In r1 = (androidx.camera.core.imagecapture.Image2JpegBytes.In) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
