package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_JpegBytes2Disk_In extends androidx.camera.core.imagecapture.JpegBytes2Disk.In {
    private final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions;
    private final androidx.camera.core.processing.Packet<byte[]> packet;

    AutoValue_JpegBytes2Disk_In(androidx.camera.core.processing.Packet<byte[]> r1, androidx.camera.core.ImageCapture.OutputFileOptions r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            r0.packet = r1
            if (r2 == 0) goto Lc
            r0.outputFileOptions = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null outputFileOptions"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null packet"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.JpegBytes2Disk.In
            r2 = 0
            if (r1 == 0) goto L24
            androidx.camera.core.imagecapture.JpegBytes2Disk$In r5 = (androidx.camera.core.imagecapture.JpegBytes2Disk.In) r5
            androidx.camera.core.processing.Packet<byte[]> r1 = r4.packet
            androidx.camera.core.processing.Packet r3 = r5.getPacket()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r4.outputFileOptions
            androidx.camera.core.ImageCapture$OutputFileOptions r5 = r5.getOutputFileOptions()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    @androidx.annotation.NonNull
    androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.outputFileOptions
            return r0
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    @androidx.annotation.NonNull
    androidx.camera.core.processing.Packet<byte[]> getPacket() {
            r1 = this;
            androidx.camera.core.processing.Packet<byte[]> r0 = r1.packet
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.camera.core.processing.Packet<byte[]> r0 = r2.packet
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r2.outputFileOptions
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "In{packet="
            r0.append(r1)
            androidx.camera.core.processing.Packet<byte[]> r1 = r2.packet
            r0.append(r1)
            java.lang.String r1 = ", outputFileOptions="
            r0.append(r1)
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r2.outputFileOptions
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
