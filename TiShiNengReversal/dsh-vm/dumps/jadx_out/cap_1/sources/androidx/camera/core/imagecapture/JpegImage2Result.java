package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class JpegImage2Result implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> {
    public JpegImage2Result() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.ImageProxy apply2(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> r7) throws androidx.camera.core.ImageCaptureException {
            r6 = this;
            java.lang.Object r0 = r7.getData()
            androidx.camera.core.ImageProxy r0 = (androidx.camera.core.ImageProxy) r0
            androidx.camera.core.ImageInfo r1 = r0.getImageInfo()
            androidx.camera.core.impl.TagBundle r1 = r1.getTagBundle()
            androidx.camera.core.ImageInfo r2 = r0.getImageInfo()
            long r2 = r2.getTimestamp()
            int r4 = r7.getRotationDegrees()
            android.graphics.Matrix r5 = r7.getSensorToBufferTransform()
            androidx.camera.core.ImageInfo r1 = androidx.camera.core.ImmutableImageInfo.create(r1, r2, r4, r5)
            androidx.camera.core.SettableImageProxy r2 = new androidx.camera.core.SettableImageProxy
            android.util.Size r3 = r7.getSize()
            r2.<init>(r0, r3, r1)
            android.graphics.Rect r7 = r7.getCropRect()
            r2.setCropRect(r7)
            return r2
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.ImageProxy apply(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.processing.Packet r1 = (androidx.camera.core.processing.Packet) r1
            androidx.camera.core.ImageProxy r1 = r0.apply2(r1)
            return r1
    }
}
