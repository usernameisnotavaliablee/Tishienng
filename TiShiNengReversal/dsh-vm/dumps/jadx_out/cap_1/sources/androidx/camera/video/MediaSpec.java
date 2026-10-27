package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class MediaSpec {
    private static final int AAC_DEFAULT_PROFILE = 2;
    private static final java.lang.String AUDIO_ENCODER_MIME_MPEG4_DEFAULT = "audio/mp4a-latm";
    private static final java.lang.String AUDIO_ENCODER_MIME_WEBM_DEFAULT = "audio/vorbis";
    public static final int OUTPUT_FORMAT_AUTO = -1;
    public static final int OUTPUT_FORMAT_MPEG_4 = 0;
    public static final int OUTPUT_FORMAT_WEBM = 1;
    private static final java.lang.String VIDEO_ENCODER_MIME_MPEG4_DEFAULT = "video/avc";
    private static final java.lang.String VIDEO_ENCODER_MIME_WEBM_DEFAULT = "video/x-vnd.on2.vp8";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.MediaSpec build();

        @androidx.annotation.NonNull
        public androidx.camera.video.MediaSpec.Builder configureAudio(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.AudioSpec.Builder> r2) {
                r1 = this;
                androidx.camera.video.AudioSpec r0 = r1.getAudioSpec()
                androidx.camera.video.AudioSpec$Builder r0 = r0.toBuilder()
                r2.accept(r0)
                androidx.camera.video.AudioSpec r2 = r0.build()
                r1.setAudioSpec(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.MediaSpec.Builder configureVideo(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.video.VideoSpec.Builder> r2) {
                r1 = this;
                androidx.camera.video.VideoSpec r0 = r1.getVideoSpec()
                androidx.camera.video.VideoSpec$Builder r0 = r0.toBuilder()
                r2.accept(r0)
                androidx.camera.video.VideoSpec r2 = r0.build()
                r1.setVideoSpec(r2)
                return r1
        }

        @android.annotation.SuppressLint({"KotlinPropertyAccess"})
        abstract androidx.camera.video.AudioSpec getAudioSpec();

        @android.annotation.SuppressLint({"KotlinPropertyAccess"})
        abstract androidx.camera.video.VideoSpec getVideoSpec();

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.MediaSpec.Builder setAudioSpec(@androidx.annotation.NonNull androidx.camera.video.AudioSpec r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.MediaSpec.Builder setOutputFormat(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.MediaSpec.Builder setVideoSpec(@androidx.annotation.NonNull androidx.camera.video.VideoSpec r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface OutputFormat {
    }

    MediaSpec() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.MediaSpec.Builder builder() {
            androidx.camera.video.AutoValue_MediaSpec$Builder r0 = new androidx.camera.video.AutoValue_MediaSpec$Builder
            r0.<init>()
            r1 = -1
            androidx.camera.video.MediaSpec$Builder r0 = r0.setOutputFormat(r1)
            androidx.camera.video.AudioSpec$Builder r1 = androidx.camera.video.AudioSpec.builder()
            androidx.camera.video.AudioSpec r1 = r1.build()
            androidx.camera.video.MediaSpec$Builder r0 = r0.setAudioSpec(r1)
            androidx.camera.video.VideoSpec$Builder r1 = androidx.camera.video.VideoSpec.builder()
            androidx.camera.video.VideoSpec r1 = r1.build()
            androidx.camera.video.MediaSpec$Builder r0 = r0.setVideoSpec(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.lang.String outputFormatToAudioMime(int r1) {
            r0 = 1
            if (r1 == r0) goto L6
            java.lang.String r1 = "audio/mp4a-latm"
            return r1
        L6:
            java.lang.String r1 = "audio/vorbis"
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static int outputFormatToAudioProfile(int r1) {
            java.lang.String r1 = outputFormatToAudioMime(r1)
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 == 0) goto Le
            r1 = 2
            return r1
        Le:
            r1 = -1
            return r1
    }

    static int outputFormatToMuxerFormat(int r1) {
            r0 = 1
            if (r1 == r0) goto L5
            r1 = 0
            return r1
        L5:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.lang.String outputFormatToVideoMime(int r1) {
            r0 = 1
            if (r1 == r0) goto L7
            java.lang.String r1 = "video/avc"
            return r1
        L7:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.AudioSpec getAudioSpec();

    public abstract int getOutputFormat();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.VideoSpec getVideoSpec();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.MediaSpec.Builder toBuilder();
}
