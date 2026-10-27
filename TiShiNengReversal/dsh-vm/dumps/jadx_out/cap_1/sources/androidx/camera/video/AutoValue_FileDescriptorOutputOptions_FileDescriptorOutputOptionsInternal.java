package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal extends androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final android.location.Location location;
    private final android.os.ParcelFileDescriptor parcelFileDescriptor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private java.lang.Long durationLimitMillis;
        private java.lang.Long fileSizeLimit;
        private android.location.Location location;
        private android.os.ParcelFileDescriptor parcelFileDescriptor;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build() {
                r10 = this;
                java.lang.Long r0 = r10.fileSizeLimit
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " fileSizeLimit"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r10.durationLimitMillis
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " durationLimitMillis"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                android.os.ParcelFileDescriptor r0 = r10.parcelFileDescriptor
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " parcelFileDescriptor"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L5e
                androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal r2 = new androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal
                java.lang.Long r0 = r10.fileSizeLimit
                long r3 = r0.longValue()
                java.lang.Long r0 = r10.durationLimitMillis
                long r5 = r0.longValue()
                android.location.Location r7 = r10.location
                android.os.ParcelFileDescriptor r8 = r10.parcelFileDescriptor
                r9 = 0
                r2.<init>(r3, r5, r7, r8, r9)
                return r2
            L5e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.OutputOptions.OutputOptionsInternal build() {
                r1 = this;
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r0 = r1.build()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setDurationLimitMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.durationLimitMillis = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setDurationLimitMillis(long r1) {
                r0 = this;
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal$Builder r1 = r0.setDurationLimitMillis(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.fileSizeLimit = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long r1) {
                r0 = this;
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal$Builder r1 = r0.setFileSizeLimit(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                r0.location = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal$Builder r1 = r0.setLocation(r1)
                return r1
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(android.os.ParcelFileDescriptor r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.parcelFileDescriptor = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null parcelFileDescriptor"
                r2.<init>(r0)
                throw r2
        }
    }

    private AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(long r1, long r3, @androidx.annotation.Nullable android.location.Location r5, android.os.ParcelFileDescriptor r6) {
            r0 = this;
            r0.<init>()
            r0.fileSizeLimit = r1
            r0.durationLimitMillis = r3
            r0.location = r5
            r0.parcelFileDescriptor = r6
            return
    }

    /* synthetic */ AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(long r1, long r3, android.location.Location r5, android.os.ParcelFileDescriptor r6, androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
            r2 = 0
            if (r1 == 0) goto L41
            androidx.camera.video.FileDescriptorOutputOptions$FileDescriptorOutputOptionsInternal r8 = (androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) r8
            long r3 = r7.fileSizeLimit
            long r5 = r8.getFileSizeLimit()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L41
            long r3 = r7.durationLimitMillis
            long r5 = r8.getDurationLimitMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L41
            android.location.Location r1 = r7.location
            if (r1 != 0) goto L2a
            android.location.Location r1 = r8.getLocation()
            if (r1 != 0) goto L41
            goto L34
        L2a:
            android.location.Location r3 = r8.getLocation()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
        L34:
            android.os.ParcelFileDescriptor r1 = r7.parcelFileDescriptor
            android.os.ParcelFileDescriptor r8 = r8.getParcelFileDescriptor()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L41
            return r0
        L41:
            return r2
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @androidx.annotation.IntRange(from = 0)
    long getDurationLimitMillis() {
            r2 = this;
            long r0 = r2.durationLimitMillis
            return r0
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @androidx.annotation.IntRange(from = 0)
    long getFileSizeLimit() {
            r2 = this;
            long r0 = r2.fileSizeLimit
            return r0
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @androidx.annotation.Nullable
    android.location.Location getLocation() {
            r1 = this;
            android.location.Location r0 = r1.location
            return r0
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    @androidx.annotation.NonNull
    android.os.ParcelFileDescriptor getParcelFileDescriptor() {
            r1 = this;
            android.os.ParcelFileDescriptor r0 = r1.parcelFileDescriptor
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.fileSizeLimit
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.durationLimitMillis
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r2 = (int) r3
            r1 = r1 ^ r2
            int r1 = r1 * r0
            android.location.Location r2 = r7.location
            if (r2 != 0) goto L1d
            r2 = 0
            goto L21
        L1d:
            int r2 = r2.hashCode()
        L21:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            android.os.ParcelFileDescriptor r0 = r7.parcelFileDescriptor
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileDescriptorOutputOptionsInternal{fileSizeLimit="
            r0.append(r1)
            long r1 = r3.fileSizeLimit
            r0.append(r1)
            java.lang.String r1 = ", durationLimitMillis="
            r0.append(r1)
            long r1 = r3.durationLimitMillis
            r0.append(r1)
            java.lang.String r1 = ", location="
            r0.append(r1)
            android.location.Location r1 = r3.location
            r0.append(r1)
            java.lang.String r1 = ", parcelFileDescriptor="
            r0.append(r1)
            android.os.ParcelFileDescriptor r1 = r3.parcelFileDescriptor
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
