package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ProcessingInput2Packet implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> {
    ProcessingInput2Packet() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> createPacket(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r6, @androidx.annotation.Nullable androidx.camera.core.impl.utils.Exif r7, @androidx.annotation.NonNull androidx.camera.core.ImageProxy r8) {
            android.graphics.Rect r2 = r6.getCropRect()
            int r3 = r6.getRotationDegrees()
            android.graphics.Matrix r4 = r6.getSensorToBufferTransform()
            androidx.camera.core.impl.CameraCaptureResult r5 = getCameraCaptureResult(r8)
            r1 = r7
            r0 = r8
            androidx.camera.core.processing.Packet r6 = androidx.camera.core.processing.Packet.of(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> createPacketWithHalRotation(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r9, @androidx.annotation.NonNull androidx.camera.core.impl.utils.Exif r10, @androidx.annotation.NonNull androidx.camera.core.ImageProxy r11) {
            android.util.Size r0 = new android.util.Size
            int r1 = r11.getWidth()
            int r2 = r11.getHeight()
            r0.<init>(r1, r2)
            int r1 = r9.getRotationDegrees()
            int r2 = r10.getRotation()
            int r1 = r1 - r2
            android.util.Size r4 = getRotatedSize(r1, r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r5 = 0
            r2.<init>(r5, r5, r3, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r3 = r4.getWidth()
            float r3 = (float) r3
            int r6 = r4.getHeight()
            float r6 = (float) r6
            r0.<init>(r5, r5, r3, r6)
            android.graphics.Matrix r0 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r2, r0, r1)
            android.graphics.Rect r1 = r9.getCropRect()
            android.graphics.Rect r5 = getUpdatedCropRect(r1, r0)
            int r6 = r10.getRotation()
            android.graphics.Matrix r9 = r9.getSensorToBufferTransform()
            android.graphics.Matrix r7 = getUpdatedTransform(r9, r0)
            androidx.camera.core.impl.CameraCaptureResult r8 = getCameraCaptureResult(r11)
            r3 = r10
            r2 = r11
            androidx.camera.core.processing.Packet r9 = androidx.camera.core.processing.Packet.of(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r0) {
            androidx.camera.core.ImageInfo r0 = r0.getImageInfo()
            androidx.camera.core.internal.CameraCaptureResultImageInfo r0 = (androidx.camera.core.internal.CameraCaptureResultImageInfo) r0
            androidx.camera.core.impl.CameraCaptureResult r0 = r0.getCameraCaptureResult()
            return r0
    }

    private static android.util.Size getRotatedSize(int r1, android.util.Size r2) {
            int r1 = androidx.camera.core.impl.utils.TransformUtils.within360(r1)
            boolean r1 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r1)
            if (r1 == 0) goto L18
            android.util.Size r1 = new android.util.Size
            int r0 = r2.getHeight()
            int r2 = r2.getWidth()
            r1.<init>(r0, r2)
            return r1
        L18:
            return r2
    }

    @androidx.annotation.NonNull
    private static android.graphics.Rect getUpdatedCropRect(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r2.mapRect(r0)
            r0.sort()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.round(r1)
            return r1
    }

    @androidx.annotation.NonNull
    private static android.graphics.Matrix getUpdatedTransform(@androidx.annotation.NonNull android.graphics.Matrix r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r0.postConcat(r2)
            return r0
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.InputPacket r5) throws androidx.camera.core.ImageCaptureException {
            r4 = this;
            androidx.camera.core.ImageProxy r0 = r5.getImageProxy()
            androidx.camera.core.imagecapture.ProcessingRequest r5 = r5.getProcessingRequest()
            int r1 = r0.getFormat()
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L2d
            androidx.camera.core.impl.utils.Exif r1 = androidx.camera.core.impl.utils.Exif.createFromImageProxy(r0)     // Catch: java.io.IOException -> L23
            androidx.camera.core.ImageProxy$PlaneProxy[] r2 = r0.getPlanes()     // Catch: java.io.IOException -> L23
            r3 = 0
            r2 = r2[r3]     // Catch: java.io.IOException -> L23
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch: java.io.IOException -> L23
            r2.rewind()     // Catch: java.io.IOException -> L23
            goto L2e
        L23:
            r5 = move-exception
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            r1 = 1
            java.lang.String r2 = "Failed to extract EXIF data."
            r0.<init>(r1, r2, r5)
            throw r0
        L2d:
            r1 = 0
        L2e:
            androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r2 = androidx.camera.core.imagecapture.ImagePipeline.EXIF_ROTATION_AVAILABILITY
            boolean r2 = r2.shouldUseExifOrientation(r0)
            if (r2 == 0) goto L40
            java.lang.String r2 = "JPEG image must have exif."
            androidx.core.util.Preconditions.checkNotNull(r1, r2)
            androidx.camera.core.processing.Packet r5 = createPacketWithHalRotation(r5, r1, r0)
            return r5
        L40:
            androidx.camera.core.processing.Packet r5 = createPacket(r5, r1, r0)
            return r5
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.InputPacket r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.imagecapture.ProcessingNode$InputPacket r1 = (androidx.camera.core.imagecapture.ProcessingNode.InputPacket) r1
            androidx.camera.core.processing.Packet r1 = r0.apply2(r1)
            return r1
    }
}
