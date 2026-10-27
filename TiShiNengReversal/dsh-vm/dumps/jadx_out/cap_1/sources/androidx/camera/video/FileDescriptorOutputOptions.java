package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FileDescriptorOutputOptions extends androidx.camera.video.OutputOptions {
    private final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal mFileDescriptorOutputOptionsInternal;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.FileDescriptorOutputOptions, androidx.camera.video.FileDescriptorOutputOptions.Builder> {
        private final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r2) {
                r1 = this;
                androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal$Builder r0 = new androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal$Builder
                r0.<init>()
                r1.<init>(r0)
                java.lang.String r0 = "File descriptor can't be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                androidx.camera.video.OutputOptions$OutputOptionsInternal$Builder<?> r0 = r1.mRootInternalBuilder
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal$Builder r0 = (androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder) r0
                r1.mInternalBuilder = r0
                r0.setParcelFileDescriptor(r2)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public androidx.camera.video.FileDescriptorOutputOptions build() {
                r2 = this;
                androidx.camera.video.FileDescriptorOutputOptions r0 = new androidx.camera.video.FileDescriptorOutputOptions
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal$Builder r1 = r2.mInternalBuilder
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions build() {
                r1 = this;
                androidx.camera.video.FileDescriptorOutputOptions r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setDurationLimitMillis(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setDurationLimitMillis(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setFileSizeLimit(@androidx.annotation.IntRange(from = 0) long r1) {
                r0 = this;
                java.lang.Object r1 = super.setFileSizeLimit(r1)
                return r1
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                java.lang.Object r1 = super.setLocation(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class FileDescriptorOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.auto.value.AutoValue.Builder
        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder> {
            Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            abstract androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build();

            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            @androidx.annotation.NonNull
            /* bridge */ /* synthetic */ androidx.camera.video.OutputOptions.OutputOptionsInternal build() {
                    r1 = this;
                    androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r1.build()
                    return r0
            }

            @androidx.annotation.NonNull
            abstract androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r1);
        }

        FileDescriptorOutputOptionsInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        abstract android.os.ParcelFileDescriptor getParcelFileDescriptor();
    }

    FileDescriptorOutputOptions(@androidx.annotation.NonNull androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mFileDescriptorOutputOptionsInternal = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.camera.video.FileDescriptorOutputOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r1.mFileDescriptorOutputOptionsInternal
            androidx.camera.video.FileDescriptorOutputOptions r2 = (androidx.camera.video.FileDescriptorOutputOptions) r2
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r2 = r2.mFileDescriptorOutputOptionsInternal
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public android.os.ParcelFileDescriptor getParcelFileDescriptor() {
            r1 = this;
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r1.mFileDescriptorOutputOptionsInternal
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r1.mFileDescriptorOutputOptionsInternal
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r3.mFileDescriptorOutputOptionsInternal
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileDescriptorOutputOptionsInternal"
            java.lang.String r2 = "FileDescriptorOutputOptions"
            java.lang.String r0 = r0.replaceFirst(r1, r2)
            return r0
    }
}
