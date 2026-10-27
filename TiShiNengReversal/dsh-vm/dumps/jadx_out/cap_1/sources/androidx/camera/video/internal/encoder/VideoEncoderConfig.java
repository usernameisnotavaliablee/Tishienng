package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VideoEncoderConfig implements androidx.camera.video.internal.encoder.EncoderConfig {
    private static final int VIDEO_COLOR_FORMAT_DEFAULT = 2130708361;
    private static final int VIDEO_INTRA_FRAME_INTERVAL_DEFAULT = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig build();

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setBitrate(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setColorFormat(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setDataSpace(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderDataSpace r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setFrameRate(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setIFrameInterval(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setInputTimebase(@androidx.annotation.NonNull androidx.camera.core.impl.Timebase r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setMimeType(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setProfile(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setResolution(@androidx.annotation.NonNull android.util.Size r1);
    }

    VideoEncoderConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder builder() {
            androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig$Builder r0 = new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig$Builder
            r0.<init>()
            r1 = -1
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setProfile(r1)
            r1 = 1
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setIFrameInterval(r1)
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setColorFormat(r1)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r1 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setDataSpace(r1)
            return r0
    }

    public abstract int getBitrate();

    public abstract int getColorFormat();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.internal.encoder.VideoEncoderDataSpace getDataSpace();

    public abstract int getFrameRate();

    public abstract int getIFrameInterval();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public abstract java.lang.String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    @androidx.annotation.NonNull
    public abstract android.util.Size getResolution();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public android.media.MediaFormat toMediaFormat() {
            r4 = this;
            android.util.Size r0 = r4.getResolution()
            java.lang.String r1 = r4.getMimeType()
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r1, r2, r0)
            java.lang.String r1 = "color-format"
            int r2 = r4.getColorFormat()
            r0.setInteger(r1, r2)
            java.lang.String r1 = "bitrate"
            int r2 = r4.getBitrate()
            r0.setInteger(r1, r2)
            java.lang.String r1 = "frame-rate"
            int r2 = r4.getFrameRate()
            r0.setInteger(r1, r2)
            java.lang.String r1 = "i-frame-interval"
            int r2 = r4.getIFrameInterval()
            r0.setInteger(r1, r2)
            int r1 = r4.getProfile()
            r2 = -1
            if (r1 == r2) goto L48
            java.lang.String r1 = "profile"
            int r2 = r4.getProfile()
            r0.setInteger(r1, r2)
        L48:
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r1 = r4.getDataSpace()
            int r2 = r1.getStandard()
            if (r2 == 0) goto L5b
            java.lang.String r2 = "color-standard"
            int r3 = r1.getStandard()
            r0.setInteger(r2, r3)
        L5b:
            int r2 = r1.getTransfer()
            if (r2 == 0) goto L6a
            java.lang.String r2 = "color-transfer"
            int r3 = r1.getTransfer()
            r0.setInteger(r2, r3)
        L6a:
            int r2 = r1.getRange()
            if (r2 == 0) goto L79
            java.lang.String r2 = "color-range"
            int r1 = r1.getRange()
            r0.setInteger(r2, r1)
        L79:
            return r0
    }
}
