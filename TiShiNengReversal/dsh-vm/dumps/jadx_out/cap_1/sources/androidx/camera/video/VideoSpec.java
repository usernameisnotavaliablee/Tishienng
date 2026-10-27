package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VideoSpec {

    @androidx.annotation.NonNull
    public static final android.util.Range<java.lang.Integer> BITRATE_RANGE_AUTO = null;

    @androidx.annotation.NonNull
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_AUTO = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.video.QualitySelector QUALITY_SELECTOR_AUTO = null;

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
        public abstract androidx.camera.video.VideoSpec build();

        @androidx.annotation.NonNull
        abstract androidx.camera.video.VideoSpec.Builder setAspectRatio(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.VideoSpec.Builder setBitrate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.VideoSpec.Builder setFrameRate(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.VideoSpec.Builder setQualitySelector(@androidx.annotation.NonNull androidx.camera.video.QualitySelector r1);
    }

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.<init>(r2, r3)
            androidx.camera.video.VideoSpec.FRAME_RATE_RANGE_AUTO = r0
            android.util.Range r0 = new android.util.Range
            r0.<init>(r2, r3)
            androidx.camera.video.VideoSpec.BITRATE_RANGE_AUTO = r0
            androidx.camera.video.Quality r0 = androidx.camera.video.Quality.FHD
            r2 = 3
            androidx.camera.video.Quality[] r2 = new androidx.camera.video.Quality[r2]
            r2[r1] = r0
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.HD
            r3 = 1
            r2[r3] = r1
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.SD
            r3 = 2
            r2[r3] = r1
            java.util.List r1 = java.util.Arrays.asList(r2)
            androidx.camera.video.FallbackStrategy r0 = androidx.camera.video.FallbackStrategy.higherQualityOrLowerThan(r0)
            androidx.camera.video.QualitySelector r0 = androidx.camera.video.QualitySelector.fromOrderedList(r1, r0)
            androidx.camera.video.VideoSpec.QUALITY_SELECTOR_AUTO = r0
            return
    }

    VideoSpec() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.VideoSpec.Builder builder() {
            androidx.camera.video.AutoValue_VideoSpec$Builder r0 = new androidx.camera.video.AutoValue_VideoSpec$Builder
            r0.<init>()
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.VideoSpec.QUALITY_SELECTOR_AUTO
            androidx.camera.video.VideoSpec$Builder r0 = r0.setQualitySelector(r1)
            android.util.Range<java.lang.Integer> r1 = androidx.camera.video.VideoSpec.FRAME_RATE_RANGE_AUTO
            androidx.camera.video.VideoSpec$Builder r0 = r0.setFrameRate(r1)
            android.util.Range<java.lang.Integer> r1 = androidx.camera.video.VideoSpec.BITRATE_RANGE_AUTO
            androidx.camera.video.VideoSpec$Builder r0 = r0.setBitrate(r1)
            r1 = -1
            androidx.camera.video.VideoSpec$Builder r0 = r0.setAspectRatio(r1)
            return r0
    }

    abstract int getAspectRatio();

    @androidx.annotation.NonNull
    public abstract android.util.Range<java.lang.Integer> getBitrate();

    @androidx.annotation.NonNull
    public abstract android.util.Range<java.lang.Integer> getFrameRate();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.QualitySelector getQualitySelector();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.VideoSpec.Builder toBuilder();
}
