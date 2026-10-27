package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MediaStoreOutputOptions extends androidx.camera.video.OutputOptions {

    @androidx.annotation.NonNull
    public static final android.content.ContentValues EMPTY_CONTENT_VALUES = null;
    private final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mMediaStoreOutputOptionsInternal;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.MediaStoreOutputOptions, androidx.camera.video.MediaStoreOutputOptions.Builder> {
        private final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(@androidx.annotation.NonNull android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3) {
                r1 = this;
                androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal$Builder r0 = new androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal$Builder
                r0.<init>()
                r1.<init>(r0)
                java.lang.String r0 = "Content resolver can't be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Collection Uri can't be null."
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r1.mRootInternalBuilder
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r0 = (androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder) r0
                r1.mInternalBuilder = r0
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r2 = r0.setContentResolver(r2)
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r2 = r2.setCollectionUri(r3)
                android.content.ContentValues r3 = androidx.camera.video.MediaStoreOutputOptions.EMPTY_CONTENT_VALUES
                r2.setContentValues(r3)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.MediaStoreOutputOptions build() {
                r2 = this;
                androidx.camera.video.MediaStoreOutputOptions r0 = new androidx.camera.video.MediaStoreOutputOptions
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r1 = r2.mInternalBuilder
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions build() {
                r1 = this;
                androidx.camera.video.MediaStoreOutputOptions r0 = r1.build()
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.video.MediaStoreOutputOptions.Builder setContentValues(@androidx.annotation.NonNull android.content.ContentValues r2) {
                r1 = this;
                java.lang.String r0 = "Content values can't be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r0 = r1.mInternalBuilder
                r0.setContentValues(r2)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setDurationLimitMillis(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setDurationLimitMillis(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setFileSizeLimit(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setFileSizeLimit(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                java.lang.Object r1 = super.setLocation(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class MediaStoreOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.auto.value.AutoValue.Builder
        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder> {
            Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build();

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            /* bridge */ /* synthetic */ androidx.camera.video.OutputOptions.OutputOptionsInternal build() {
                    r1 = this;
                    androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.build()
                    return r0
            }

            @androidx.annotation.NonNull
            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(@androidx.annotation.NonNull android.net.Uri r1);

            @androidx.annotation.NonNull
            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(@androidx.annotation.NonNull android.content.ContentResolver r1);

            @androidx.annotation.NonNull
            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(@androidx.annotation.NonNull android.content.ContentValues r1);
        }

        MediaStoreOutputOptionsInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        abstract android.net.Uri getCollectionUri();

        @androidx.annotation.NonNull
        abstract android.content.ContentResolver getContentResolver();

        @androidx.annotation.NonNull
        abstract android.content.ContentValues getContentValues();
    }

    static {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            androidx.camera.video.MediaStoreOutputOptions.EMPTY_CONTENT_VALUES = r0
            return
    }

    MediaStoreOutputOptions(@androidx.annotation.NonNull androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mMediaStoreOutputOptionsInternal = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.camera.video.MediaStoreOutputOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.mMediaStoreOutputOptionsInternal
            androidx.camera.video.MediaStoreOutputOptions r2 = (androidx.camera.video.MediaStoreOutputOptions) r2
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r2 = r2.mMediaStoreOutputOptionsInternal
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public android.net.Uri getCollectionUri() {
            r1 = this;
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.mMediaStoreOutputOptionsInternal
            android.net.Uri r0 = r0.getCollectionUri()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.ContentResolver getContentResolver() {
            r1 = this;
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.mMediaStoreOutputOptionsInternal
            android.content.ContentResolver r0 = r0.getContentResolver()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.ContentValues getContentValues() {
            r1 = this;
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.mMediaStoreOutputOptionsInternal
            android.content.ContentValues r0 = r0.getContentValues()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.mMediaStoreOutputOptionsInternal
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r3.mMediaStoreOutputOptionsInternal
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MediaStoreOutputOptionsInternal"
            java.lang.String r2 = "MediaStoreOutputOptions"
            java.lang.String r0 = r0.replaceFirst(r1, r2)
            return r0
    }
}
