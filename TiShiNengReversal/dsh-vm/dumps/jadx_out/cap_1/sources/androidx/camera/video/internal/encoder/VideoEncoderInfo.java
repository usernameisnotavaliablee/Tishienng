package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface VideoEncoderInfo extends androidx.camera.video.internal.encoder.EncoderInfo {
    int getHeightAlignment();

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getSupportedBitrateRange();

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getSupportedHeights();

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getSupportedHeightsFor(int r1);

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getSupportedWidths();

    @androidx.annotation.NonNull
    android.util.Range<java.lang.Integer> getSupportedWidthsFor(int r1);

    int getWidthAlignment();

    boolean isSizeSupported(int r1, int r2);
}
