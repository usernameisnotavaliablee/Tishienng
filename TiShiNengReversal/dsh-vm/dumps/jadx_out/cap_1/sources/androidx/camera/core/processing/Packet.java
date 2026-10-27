package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Packet<T> {
    public Packet() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.processing.Packet<android.graphics.Bitmap> of(@androidx.annotation.NonNull android.graphics.Bitmap r9, @androidx.annotation.NonNull androidx.camera.core.impl.utils.Exif r10, @androidx.annotation.NonNull android.graphics.Rect r11, int r12, @androidx.annotation.NonNull android.graphics.Matrix r13, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r14) {
            androidx.camera.core.processing.AutoValue_Packet r0 = new androidx.camera.core.processing.AutoValue_Packet
            android.util.Size r4 = new android.util.Size
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r4.<init>(r1, r2)
            r3 = 42
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> of(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r7, @androidx.annotation.Nullable androidx.camera.core.impl.utils.Exif r8, @androidx.annotation.NonNull android.graphics.Rect r9, int r10, @androidx.annotation.NonNull android.graphics.Matrix r11, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r12) {
            android.util.Size r2 = new android.util.Size
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            r2.<init>(r0, r1)
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            androidx.camera.core.processing.Packet r7 = of(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> of(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r10, @androidx.annotation.Nullable androidx.camera.core.impl.utils.Exif r11, @androidx.annotation.NonNull android.util.Size r12, @androidx.annotation.NonNull android.graphics.Rect r13, int r14, @androidx.annotation.NonNull android.graphics.Matrix r15, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r16) {
            int r0 = r10.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto Ld
            java.lang.String r0 = "JPEG image must have Exif."
            androidx.core.util.Preconditions.checkNotNull(r11, r0)
        Ld:
            androidx.camera.core.processing.AutoValue_Packet r1 = new androidx.camera.core.processing.AutoValue_Packet
            int r4 = r10.getFormat()
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.processing.Packet<byte[]> of(@androidx.annotation.NonNull byte[] r9, @androidx.annotation.NonNull androidx.camera.core.impl.utils.Exif r10, int r11, @androidx.annotation.NonNull android.util.Size r12, @androidx.annotation.NonNull android.graphics.Rect r13, int r14, @androidx.annotation.NonNull android.graphics.Matrix r15, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r16) {
            androidx.camera.core.processing.AutoValue_Packet r0 = new androidx.camera.core.processing.AutoValue_Packet
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult();

    @androidx.annotation.NonNull
    public abstract android.graphics.Rect getCropRect();

    @androidx.annotation.NonNull
    public abstract T getData();

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.impl.utils.Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @androidx.annotation.NonNull
    public abstract android.graphics.Matrix getSensorToBufferTransform();

    @androidx.annotation.NonNull
    public abstract android.util.Size getSize();

    public boolean hasCropping() {
            r2 = this;
            android.graphics.Rect r0 = r2.getCropRect()
            android.util.Size r1 = r2.getSize()
            boolean r0 = androidx.camera.core.impl.utils.TransformUtils.hasCropping(r0, r1)
            return r0
    }
}
