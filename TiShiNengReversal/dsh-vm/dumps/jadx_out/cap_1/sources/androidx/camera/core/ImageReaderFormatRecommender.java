package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageReaderFormatRecommender {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class FormatCombo {
        FormatCombo() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo create(int r1, int r2) {
                androidx.camera.core.AutoValue_ImageReaderFormatRecommender_FormatCombo r0 = new androidx.camera.core.AutoValue_ImageReaderFormatRecommender_FormatCombo
                r0.<init>(r1, r2)
                return r0
        }

        abstract int imageAnalysisFormat();

        abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo chooseCombo() {
            r0 = 256(0x100, float:3.59E-43)
            r1 = 35
            androidx.camera.core.ImageReaderFormatRecommender$FormatCombo r0 = androidx.camera.core.ImageReaderFormatRecommender.FormatCombo.create(r0, r1)
            return r0
    }
}
