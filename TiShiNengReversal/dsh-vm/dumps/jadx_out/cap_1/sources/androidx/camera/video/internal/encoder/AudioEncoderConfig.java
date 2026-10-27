package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AudioEncoderConfig implements androidx.camera.video.internal.encoder.EncoderConfig {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.video.internal.encoder.AudioEncoderConfig autoBuild();

        @androidx.annotation.NonNull
        public androidx.camera.video.internal.encoder.AudioEncoderConfig build() {
                r3 = this;
                androidx.camera.video.internal.encoder.AudioEncoderConfig r0 = r3.autoBuild()
                java.lang.String r1 = r0.getMimeType()
                java.lang.String r2 = "audio/mp4a-latm"
                boolean r1 = java.util.Objects.equals(r1, r2)
                if (r1 == 0) goto L20
                int r1 = r0.getProfile()
                r2 = -1
                if (r1 == r2) goto L18
                goto L20
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Encoder mime set to AAC, but no AAC profile was provided."
                r0.<init>(r1)
                throw r0
            L20:
                return r0
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setBitrate(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setChannelCount(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setInputTimebase(@androidx.annotation.NonNull androidx.camera.core.impl.Timebase r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setMimeType(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setProfile(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setSampleRate(int r1);
    }

    AudioEncoderConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder builder() {
            androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig$Builder r0 = new androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig$Builder
            r0.<init>()
            r1 = -1
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r0 = r0.setProfile(r1)
            return r0
    }

    public abstract int getBitrate();

    public abstract int getChannelCount();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public abstract java.lang.String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract int getSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public android.media.MediaFormat toMediaFormat() {
            r3 = this;
            java.lang.String r0 = r3.getMimeType()
            int r1 = r3.getSampleRate()
            int r2 = r3.getChannelCount()
            android.media.MediaFormat r0 = android.media.MediaFormat.createAudioFormat(r0, r1, r2)
            java.lang.String r1 = "bitrate"
            int r2 = r3.getBitrate()
            r0.setInteger(r1, r2)
            int r1 = r3.getProfile()
            r2 = -1
            if (r1 == r2) goto L3f
            java.lang.String r1 = r3.getMimeType()
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L36
            java.lang.String r1 = "aac-profile"
            int r2 = r3.getProfile()
            r0.setInteger(r1, r2)
            return r0
        L36:
            java.lang.String r1 = "profile"
            int r2 = r3.getProfile()
            r0.setInteger(r1, r2)
        L3f:
            return r0
    }
}
