package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoEncoderInfoImpl extends androidx.camera.video.internal.encoder.EncoderInfoImpl implements androidx.camera.video.internal.encoder.VideoEncoderInfo {
    private final android.media.MediaCodecInfo.VideoCapabilities mVideoCapabilities;

    VideoEncoderInfoImpl(@androidx.annotation.NonNull android.media.MediaCodecInfo r1, @androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            r0 = this;
            r0.<init>(r1, r2)
            android.media.MediaCodecInfo$CodecCapabilities r1 = r0.mCodecCapabilities
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            java.util.Objects.requireNonNull(r1)
            r0.mVideoCapabilities = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderInfoImpl from(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderConfig r2) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            androidx.camera.video.internal.encoder.VideoEncoderInfoImpl r0 = new androidx.camera.video.internal.encoder.VideoEncoderInfoImpl
            android.media.MediaCodecInfo r1 = androidx.camera.video.internal.encoder.EncoderInfoImpl.findCodecAndGetCodecInfo(r2)
            java.lang.String r2 = r2.getMimeType()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.IllegalArgumentException toIllegalArgumentException(@androidx.annotation.NonNull java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L7
            java.lang.IllegalArgumentException r1 = (java.lang.IllegalArgumentException) r1
            return r1
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            int r0 = r0.getHeightAlignment()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedBitrateRange() {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            android.util.Range r0 = r0.getBitrateRange()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedHeights() {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            android.util.Range r0 = r0.getSupportedHeights()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int r2) {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities     // Catch: java.lang.Throwable -> L7
            android.util.Range r2 = r0.getSupportedHeightsFor(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.IllegalArgumentException r2 = toIllegalArgumentException(r2)
            throw r2
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedWidths() {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            android.util.Range r0 = r0.getSupportedWidths()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int r2) {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities     // Catch: java.lang.Throwable -> L7
            android.util.Range r2 = r0.getSupportedWidthsFor(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.IllegalArgumentException r2 = toIllegalArgumentException(r2)
            throw r2
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            int r0 = r0.getWidthAlignment()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int r2, int r3) {
            r1 = this;
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.mVideoCapabilities
            boolean r2 = r0.isSizeSupported(r2, r3)
            return r2
    }
}
