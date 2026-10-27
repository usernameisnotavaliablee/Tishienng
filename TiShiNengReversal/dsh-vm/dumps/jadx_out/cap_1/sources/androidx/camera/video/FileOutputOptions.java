package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FileOutputOptions extends androidx.camera.video.OutputOptions {
    private final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal mFileOutputOptionsInternal;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.FileOutputOptions, androidx.camera.video.FileOutputOptions.Builder> {
        private final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(@androidx.annotation.NonNull java.io.File r2) {
                r1 = this;
                androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal$Builder r0 = new androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal$Builder
                r0.<init>()
                r1.<init>(r0)
                java.lang.String r0 = "File can't be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r1.mRootInternalBuilder
                androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal$Builder r0 = (androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder) r0
                r1.mInternalBuilder = r0
                r0.setFile(r2)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.FileOutputOptions build() {
                r2 = this;
                androidx.camera.video.FileOutputOptions r0 = new androidx.camera.video.FileOutputOptions
                androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal$Builder r1 = r2.mInternalBuilder
                androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions build() {
                r1 = this;
                androidx.camera.video.FileOutputOptions r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setDurationLimitMillis(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setDurationLimitMillis(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setFileSizeLimit(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setFileSizeLimit(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                java.lang.Object r1 = super.setLocation(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class FileOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.auto.value.AutoValue.Builder
        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder> {
            Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            abstract androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal build();

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            /* bridge */ /* synthetic */ androidx.camera.video.OutputOptions.OutputOptionsInternal build() {
                    r1 = this;
                    androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r0 = r1.build()
                    return r0
            }

            @androidx.annotation.NonNull
            abstract androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder setFile(@androidx.annotation.NonNull java.io.File r1);
        }

        FileOutputOptionsInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        abstract java.io.File getFile();
    }

    FileOutputOptions(@androidx.annotation.NonNull androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mFileOutputOptionsInternal = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.camera.video.FileOutputOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r0 = r1.mFileOutputOptionsInternal
            androidx.camera.video.FileOutputOptions r2 = (androidx.camera.video.FileOutputOptions) r2
            androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r2 = r2.mFileOutputOptionsInternal
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public java.io.File getFile() {
            r1 = this;
            androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r0 = r1.mFileOutputOptionsInternal
            java.io.File r0 = r0.getFile()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r0 = r1.mFileOutputOptionsInternal
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            androidx.camera.video.FileOutputOptions$FileOutputOptionsInternal r0 = r3.mFileOutputOptionsInternal
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileOutputOptionsInternal"
            java.lang.String r2 = "FileOutputOptions"
            java.lang.String r0 = r0.replaceFirst(r1, r2)
            return r0
    }
}
