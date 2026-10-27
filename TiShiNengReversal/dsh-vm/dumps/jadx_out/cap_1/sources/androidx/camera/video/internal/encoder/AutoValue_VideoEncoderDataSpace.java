package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_VideoEncoderDataSpace extends androidx.camera.video.internal.encoder.VideoEncoderDataSpace {
    private final int range;
    private final int standard;
    private final int transfer;

    AutoValue_VideoEncoderDataSpace(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.standard = r1
            r0.transfer = r2
            r0.range = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.internal.encoder.VideoEncoderDataSpace
            r2 = 0
            if (r1 == 0) goto L24
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r5 = (androidx.camera.video.internal.encoder.VideoEncoderDataSpace) r5
            int r1 = r4.standard
            int r3 = r5.getStandard()
            if (r1 != r3) goto L24
            int r1 = r4.transfer
            int r3 = r5.getTransfer()
            if (r1 != r3) goto L24
            int r1 = r4.range
            int r5 = r5.getRange()
            if (r1 != r5) goto L24
            return r0
        L24:
            return r2
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getRange() {
            r1 = this;
            int r0 = r1.range
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getStandard() {
            r1 = this;
            int r0 = r1.standard
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getTransfer() {
            r1 = this;
            int r0 = r1.transfer
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.standard
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.transfer
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.range
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoEncoderDataSpace{standard="
            r0.append(r1)
            int r1 = r2.standard
            r0.append(r1)
            java.lang.String r1 = ", transfer="
            r0.append(r1)
            int r1 = r2.transfer
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            int r1 = r2.range
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
