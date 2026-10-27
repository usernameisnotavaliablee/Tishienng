package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final android.net.Uri collectionUri;
    private final android.content.ContentResolver contentResolver;
    private final android.content.ContentValues contentValues;
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final android.location.Location location;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private android.net.Uri collectionUri;
        private android.content.ContentResolver contentResolver;
        private android.content.ContentValues contentValues;
        private java.lang.Long durationLimitMillis;
        private java.lang.Long fileSizeLimit;
        private android.location.Location location;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build() {
                r12 = this;
                java.lang.Long r0 = r12.fileSizeLimit
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " fileSizeLimit"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r12.durationLimitMillis
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " durationLimitMillis"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                android.content.ContentResolver r0 = r12.contentResolver
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " contentResolver"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                android.net.Uri r0 = r12.collectionUri
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " collectionUri"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                android.content.ContentValues r0 = r12.contentValues
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " contentValues"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L8c
                androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal r2 = new androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal
                java.lang.Long r0 = r12.fileSizeLimit
                long r3 = r0.longValue()
                java.lang.Long r0 = r12.durationLimitMillis
                long r5 = r0.longValue()
                android.location.Location r7 = r12.location
                android.content.ContentResolver r8 = r12.contentResolver
                android.net.Uri r9 = r12.collectionUri
                android.content.ContentValues r10 = r12.contentValues
                r11 = 0
                r2.<init>(r3, r5, r7, r8, r9, r10, r11)
                return r2
            L8c:
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

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.OutputOptions.OutputOptionsInternal build() {
                r1 = this;
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(android.net.Uri r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.collectionUri = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null collectionUri"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(android.content.ContentResolver r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.contentResolver = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null contentResolver"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(android.content.ContentValues r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.contentValues = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null contentValues"
                r2.<init>(r0)
                throw r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setDurationLimitMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.durationLimitMillis = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setDurationLimitMillis(long r1) {
                r0 = this;
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r1 = r0.setDurationLimitMillis(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.fileSizeLimit = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long r1) {
                r0 = this;
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r1 = r0.setFileSizeLimit(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                r0.location = r1
                return r0
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setLocation(@androidx.annotation.Nullable android.location.Location r1) {
                r0 = this;
                androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal$Builder r1 = r0.setLocation(r1)
                return r1
        }
    }

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long r1, long r3, @androidx.annotation.Nullable android.location.Location r5, android.content.ContentResolver r6, android.net.Uri r7, android.content.ContentValues r8) {
            r0 = this;
            r0.<init>()
            r0.fileSizeLimit = r1
            r0.durationLimitMillis = r3
            r0.location = r5
            r0.contentResolver = r6
            r0.collectionUri = r7
            r0.contentValues = r8
            return
    }

    /* synthetic */ AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long r1, long r3, android.location.Location r5, android.content.ContentResolver r6, android.net.Uri r7, android.content.ContentValues r8, androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.AnonymousClass1 r9) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6, r7, r8)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
            r2 = 0
            if (r1 == 0) goto L59
            androidx.camera.video.MediaStoreOutputOptions$MediaStoreOutputOptionsInternal r8 = (androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) r8
            long r3 = r7.fileSizeLimit
            long r5 = r8.getFileSizeLimit()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            long r3 = r7.durationLimitMillis
            long r5 = r8.getDurationLimitMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            android.location.Location r1 = r7.location
            if (r1 != 0) goto L2a
            android.location.Location r1 = r8.getLocation()
            if (r1 != 0) goto L59
            goto L34
        L2a:
            android.location.Location r3 = r8.getLocation()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
        L34:
            android.content.ContentResolver r1 = r7.contentResolver
            android.content.ContentResolver r3 = r8.getContentResolver()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            android.net.Uri r1 = r7.collectionUri
            android.net.Uri r3 = r8.getCollectionUri()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            android.content.ContentValues r1 = r7.contentValues
            android.content.ContentValues r8 = r8.getContentValues()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L59
            return r0
        L59:
            return r2
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @androidx.annotation.NonNull
    android.net.Uri getCollectionUri() {
            r1 = this;
            android.net.Uri r0 = r1.collectionUri
            return r0
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @androidx.annotation.NonNull
    android.content.ContentResolver getContentResolver() {
            r1 = this;
            android.content.ContentResolver r0 = r1.contentResolver
            return r0
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @androidx.annotation.NonNull
    android.content.ContentValues getContentValues() {
            r1 = this;
            android.content.ContentValues r0 = r1.contentValues
            return r0
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
            android.content.ContentResolver r2 = r7.contentResolver
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            android.net.Uri r2 = r7.collectionUri
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            android.content.ContentValues r0 = r7.contentValues
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MediaStoreOutputOptionsInternal{fileSizeLimit="
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
            java.lang.String r1 = ", contentResolver="
            r0.append(r1)
            android.content.ContentResolver r1 = r3.contentResolver
            r0.append(r1)
            java.lang.String r1 = ", collectionUri="
            r0.append(r1)
            android.net.Uri r1 = r3.collectionUri
            r0.append(r1)
            java.lang.String r1 = ", contentValues="
            r0.append(r1)
            android.content.ContentValues r1 = r3.contentValues
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
