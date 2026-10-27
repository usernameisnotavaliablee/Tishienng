package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AudioSpec {

    @androidx.annotation.NonNull
    public static final android.util.Range<java.lang.Integer> BITRATE_RANGE_AUTO = null;
    public static final int CHANNEL_COUNT_AUTO = -1;
    public static final int CHANNEL_COUNT_MONO = 1;
    public static final int CHANNEL_COUNT_NONE = 0;
    public static final int CHANNEL_COUNT_STEREO = 2;
    public static final androidx.camera.video.AudioSpec NO_AUDIO = null;

    @androidx.annotation.NonNull
    public static final android.util.Range<java.lang.Integer> SAMPLE_RATE_RANGE_AUTO = null;
    public static final int SOURCE_AUTO = -1;
    public static final int SOURCE_CAMCORDER = 5;
    public static final int SOURCE_FORMAT_AUTO = -1;
    public static final int SOURCE_FORMAT_PCM_16BIT = 2;

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
        public abstract androidx.camera.video.AudioSpec build();

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.AudioSpec.Builder setBitrate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.AudioSpec.Builder setChannelCount(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.AudioSpec.Builder setSampleRate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.AudioSpec.Builder setSource(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.AudioSpec.Builder setSourceFormat(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ChannelCount {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface Source {
    }

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.<init>(r2, r3)
            androidx.camera.video.AudioSpec.BITRATE_RANGE_AUTO = r0
            android.util.Range r0 = new android.util.Range
            r0.<init>(r2, r3)
            androidx.camera.video.AudioSpec.SAMPLE_RATE_RANGE_AUTO = r0
            androidx.camera.video.AudioSpec$Builder r0 = builder()
            androidx.camera.video.AudioSpec$Builder r0 = r0.setChannelCount(r1)
            androidx.camera.video.AudioSpec r0 = r0.build()
            androidx.camera.video.AudioSpec.NO_AUDIO = r0
            return
    }

    AudioSpec() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.AudioSpec.Builder builder() {
            androidx.camera.video.AutoValue_AudioSpec$Builder r0 = new androidx.camera.video.AutoValue_AudioSpec$Builder
            r0.<init>()
            r1 = -1
            androidx.camera.video.AudioSpec$Builder r0 = r0.setSourceFormat(r1)
            androidx.camera.video.AudioSpec$Builder r0 = r0.setSource(r1)
            androidx.camera.video.AudioSpec$Builder r0 = r0.setChannelCount(r1)
            android.util.Range<java.lang.Integer> r1 = androidx.camera.video.AudioSpec.BITRATE_RANGE_AUTO
            androidx.camera.video.AudioSpec$Builder r0 = r0.setBitrate(r1)
            android.util.Range<java.lang.Integer> r1 = androidx.camera.video.AudioSpec.SAMPLE_RATE_RANGE_AUTO
            androidx.camera.video.AudioSpec$Builder r0 = r0.setSampleRate(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract android.util.Range<java.lang.Integer> getBitrate();

    public abstract int getChannelCount();

    @androidx.annotation.NonNull
    public abstract android.util.Range<java.lang.Integer> getSampleRate();

    public abstract int getSource();

    public abstract int getSourceFormat();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.AudioSpec.Builder toBuilder();
}
