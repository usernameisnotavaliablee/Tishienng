package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Packet<T> extends androidx.camera.core.processing.Packet<T> {
    private final androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult;
    private final android.graphics.Rect cropRect;
    private final T data;
    private final androidx.camera.core.impl.utils.Exif exif;
    private final int format;
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransform;
    private final android.util.Size size;

    AutoValue_Packet(T r1, @androidx.annotation.Nullable androidx.camera.core.impl.utils.Exif r2, int r3, android.util.Size r4, android.graphics.Rect r5, int r6, android.graphics.Matrix r7, androidx.camera.core.impl.CameraCaptureResult r8) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L3e
            r0.data = r1
            r0.exif = r2
            r0.format = r3
            if (r4 == 0) goto L36
            r0.size = r4
            if (r5 == 0) goto L2e
            r0.cropRect = r5
            r0.rotationDegrees = r6
            if (r7 == 0) goto L26
            r0.sensorToBufferTransform = r7
            if (r8 == 0) goto L1e
            r0.cameraCaptureResult = r8
            return
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cameraCaptureResult"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null sensorToBufferTransform"
            r1.<init>(r2)
            throw r1
        L2e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cropRect"
            r1.<init>(r2)
            throw r1
        L36:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null size"
            r1.<init>(r2)
            throw r1
        L3e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null data"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.processing.Packet
            r2 = 0
            if (r1 == 0) goto L6d
            androidx.camera.core.processing.Packet r5 = (androidx.camera.core.processing.Packet) r5
            T r1 = r4.data
            java.lang.Object r3 = r5.getData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
            androidx.camera.core.impl.utils.Exif r1 = r4.exif
            if (r1 != 0) goto L22
            androidx.camera.core.impl.utils.Exif r1 = r5.getExif()
            if (r1 != 0) goto L6d
            goto L2c
        L22:
            androidx.camera.core.impl.utils.Exif r3 = r5.getExif()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
        L2c:
            int r1 = r4.format
            int r3 = r5.getFormat()
            if (r1 != r3) goto L6d
            android.util.Size r1 = r4.size
            android.util.Size r3 = r5.getSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
            android.graphics.Rect r1 = r4.cropRect
            android.graphics.Rect r3 = r5.getCropRect()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
            int r1 = r4.rotationDegrees
            int r3 = r5.getRotationDegrees()
            if (r1 != r3) goto L6d
            android.graphics.Matrix r1 = r4.sensorToBufferTransform
            android.graphics.Matrix r3 = r5.getSensorToBufferTransform()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
            androidx.camera.core.impl.CameraCaptureResult r1 = r4.cameraCaptureResult
            androidx.camera.core.impl.CameraCaptureResult r5 = r5.getCameraCaptureResult()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L6d
            return r0
        L6d:
            return r2
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.cameraCaptureResult
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.cropRect
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.NonNull
    public T getData() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.utils.Exif getExif() {
            r1 = this;
            androidx.camera.core.impl.utils.Exif r0 = r1.exif
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    public int getFormat() {
            r1 = this;
            int r0 = r1.format
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    public int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.NonNull
    public android.graphics.Matrix getSensorToBufferTransform() {
            r1 = this;
            android.graphics.Matrix r0 = r1.sensorToBufferTransform
            return r0
    }

    @Override // androidx.camera.core.processing.Packet
    @androidx.annotation.NonNull
    public android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.size
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.data
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.impl.utils.Exif r2 = r3.exif
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            int r2 = r2.hashCode()
        L16:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.format
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.size
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Rect r2 = r3.cropRect
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.rotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r2 = r3.sensorToBufferTransform
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.CameraCaptureResult r1 = r3.cameraCaptureResult
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Packet{data="
            r0.append(r1)
            T r1 = r2.data
            r0.append(r1)
            java.lang.String r1 = ", exif="
            r0.append(r1)
            androidx.camera.core.impl.utils.Exif r1 = r2.exif
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            int r1 = r2.format
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            android.util.Size r1 = r2.size
            r0.append(r1)
            java.lang.String r1 = ", cropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.cropRect
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", sensorToBufferTransform="
            r0.append(r1)
            android.graphics.Matrix r1 = r2.sensorToBufferTransform
            r0.append(r1)
            java.lang.String r1 = ", cameraCaptureResult="
            r0.append(r1)
            androidx.camera.core.impl.CameraCaptureResult r1 = r2.cameraCaptureResult
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
