package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Bitmap2JpegBytes_In extends androidx.camera.core.imagecapture.Bitmap2JpegBytes.In {
    private final int jpegQuality;
    private final androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet;

    AutoValue_Bitmap2JpegBytes_In(androidx.camera.core.processing.Packet<android.graphics.Bitmap> r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.packet = r1
            r0.jpegQuality = r2
            return
        La:
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
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.core.imagecapture.Bitmap2JpegBytes$In r5 = (androidx.camera.core.imagecapture.Bitmap2JpegBytes.In) r5
            androidx.camera.core.processing.Packet<android.graphics.Bitmap> r1 = r4.packet
            androidx.camera.core.processing.Packet r3 = r5.getPacket()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            int r1 = r4.jpegQuality
            int r5 = r5.getJpegQuality()
            if (r1 != r5) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    int getJpegQuality() {
            r1 = this;
            int r0 = r1.jpegQuality
            return r0
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    androidx.camera.core.processing.Packet<android.graphics.Bitmap> getPacket() {
            r1 = this;
            androidx.camera.core.processing.Packet<android.graphics.Bitmap> r0 = r1.packet
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.camera.core.processing.Packet<android.graphics.Bitmap> r0 = r2.packet
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.jpegQuality
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "In{packet="
            r0.append(r1)
            androidx.camera.core.processing.Packet<android.graphics.Bitmap> r1 = r2.packet
            r0.append(r1)
            java.lang.String r1 = ", jpegQuality="
            r0.append(r1)
            int r1 = r2.jpegQuality
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
