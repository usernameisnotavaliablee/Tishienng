package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;
    private final androidx.camera.video.OutputOptions.OutputOptionsInternal mOutputOptionsInternal;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class Builder<T extends androidx.camera.video.OutputOptions, B> {
        final androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        Builder(@androidx.annotation.NonNull androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<?> r3) {
                r2 = this;
                r2.<init>()
                r2.mRootInternalBuilder = r3
                r0 = 0
                r3.setFileSizeLimit(r0)
                r3.setDurationLimitMillis(r0)
                return
        }

        @androidx.annotation.NonNull
        abstract T build();

        @androidx.annotation.NonNull
        public B setDurationLimitMillis(@androidx.annotation.IntRange(from = 0) long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r1 = "The specified duration limit can't be negative."
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r3.mRootInternalBuilder
                r0.setDurationLimitMillis(r4)
                return r3
        }

        @androidx.annotation.NonNull
        public B setFileSizeLimit(@androidx.annotation.IntRange(from = 0) long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r1 = "The specified file size limit can't be negative."
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r3.mRootInternalBuilder
                r0.setFileSizeLimit(r4)
                return r3
        }

        @androidx.annotation.NonNull
        public B setLocation(@androidx.annotation.Nullable android.location.Location r8) {
                r7 = this;
                if (r8 == 0) goto L46
                double r0 = r8.getLatitude()
                r2 = -4587338432941916160(0xc056800000000000, double:-90.0)
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 < 0) goto L20
                double r0 = r8.getLatitude()
                r2 = 4636033603912859648(0x4056800000000000, double:90.0)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 > 0) goto L20
                r0 = 1
                goto L21
            L20:
                r0 = 0
            L21:
                java.lang.String r1 = "Latitude must be in the range [-90, 90]"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                double r0 = r8.getLongitude()
                r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 < 0) goto L41
                double r0 = r8.getLongitude()
                r2 = 4640537203540230144(0x4066800000000000, double:180.0)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 > 0) goto L41
                r4 = 1
            L41:
                java.lang.String r0 = "Longitude must be in the range [-180, 180]"
                androidx.core.util.Preconditions.checkArgument(r4, r0)
            L46:
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r7.mRootInternalBuilder
                r0.setLocation(r8)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class OutputOptionsInternal {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static abstract class Builder<B> {
            Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            abstract androidx.camera.video.OutputOptions.OutputOptionsInternal build();

            @androidx.annotation.NonNull
            abstract B setDurationLimitMillis(@androidx.annotation.IntRange(from = 0) long r1);

            @androidx.annotation.NonNull
            abstract B setFileSizeLimit(@androidx.annotation.IntRange(from = 0) long r1);

            @androidx.annotation.NonNull
            abstract B setLocation(@androidx.annotation.Nullable android.location.Location r1);
        }

        OutputOptionsInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.IntRange(from = 0)
        abstract long getDurationLimitMillis();

        @androidx.annotation.IntRange(from = 0)
        abstract long getFileSizeLimit();

        @androidx.annotation.Nullable
        abstract android.location.Location getLocation();
    }

    OutputOptions(@androidx.annotation.NonNull androidx.camera.video.OutputOptions.OutputOptionsInternal r1) {
            r0 = this;
            r0.<init>()
            r0.mOutputOptionsInternal = r1
            return
    }

    @androidx.annotation.IntRange(from = 0)
    public long getDurationLimitMillis() {
            r2 = this;
            androidx.camera.video.OutputOptions$OutputOptionsInternal r0 = r2.mOutputOptionsInternal
            long r0 = r0.getDurationLimitMillis()
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public long getFileSizeLimit() {
            r2 = this;
            androidx.camera.video.OutputOptions$OutputOptionsInternal r0 = r2.mOutputOptionsInternal
            long r0 = r0.getFileSizeLimit()
            return r0
    }

    @androidx.annotation.Nullable
    public android.location.Location getLocation() {
            r1 = this;
            androidx.camera.video.OutputOptions$OutputOptionsInternal r0 = r1.mOutputOptionsInternal
            android.location.Location r0 = r0.getLocation()
            return r0
    }
}
