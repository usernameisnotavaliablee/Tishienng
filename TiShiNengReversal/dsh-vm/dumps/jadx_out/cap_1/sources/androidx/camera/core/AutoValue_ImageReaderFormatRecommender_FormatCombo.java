package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends androidx.camera.core.ImageReaderFormatRecommender.FormatCombo {
    private final int imageAnalysisFormat;
    private final int imageCaptureFormat;

    AutoValue_ImageReaderFormatRecommender_FormatCombo(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.imageCaptureFormat = r1
            r0.imageAnalysisFormat = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
            r2 = 0
            if (r1 == 0) goto L1c
            androidx.camera.core.ImageReaderFormatRecommender$FormatCombo r5 = (androidx.camera.core.ImageReaderFormatRecommender.FormatCombo) r5
            int r1 = r4.imageCaptureFormat
            int r3 = r5.imageCaptureFormat()
            if (r1 != r3) goto L1c
            int r1 = r4.imageAnalysisFormat
            int r5 = r5.imageAnalysisFormat()
            if (r1 != r5) goto L1c
            return r0
        L1c:
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.imageCaptureFormat
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.imageAnalysisFormat
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    int imageAnalysisFormat() {
            r1 = this;
            int r0 = r1.imageAnalysisFormat
            return r0
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    int imageCaptureFormat() {
            r1 = this;
            int r0 = r1.imageCaptureFormat
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FormatCombo{imageCaptureFormat="
            r0.append(r1)
            int r1 = r2.imageCaptureFormat
            r0.append(r1)
            java.lang.String r1 = ", imageAnalysisFormat="
            r0.append(r1)
            int r1 = r2.imageAnalysisFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
