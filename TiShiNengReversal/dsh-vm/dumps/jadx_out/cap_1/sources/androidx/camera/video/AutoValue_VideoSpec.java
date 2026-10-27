package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_VideoSpec extends androidx.camera.video.VideoSpec {
    private final int aspectRatio;
    private final android.util.Range<java.lang.Integer> bitrate;
    private final android.util.Range<java.lang.Integer> frameRate;
    private final androidx.camera.video.QualitySelector qualitySelector;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.AutoValue_VideoSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.VideoSpec.Builder {
        private java.lang.Integer aspectRatio;
        private android.util.Range<java.lang.Integer> bitrate;
        private android.util.Range<java.lang.Integer> frameRate;
        private androidx.camera.video.QualitySelector qualitySelector;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(androidx.camera.video.VideoSpec r2) {
                r1 = this;
                r1.<init>()
                androidx.camera.video.QualitySelector r0 = r2.getQualitySelector()
                r1.qualitySelector = r0
                android.util.Range r0 = r2.getFrameRate()
                r1.frameRate = r0
                android.util.Range r0 = r2.getBitrate()
                r1.bitrate = r0
                int r2 = r2.getAspectRatio()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.aspectRatio = r2
                return
        }

        /* synthetic */ Builder(androidx.camera.video.VideoSpec r1, androidx.camera.video.AutoValue_VideoSpec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public androidx.camera.video.VideoSpec build() {
                r8 = this;
                androidx.camera.video.QualitySelector r0 = r8.qualitySelector
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " qualitySelector"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                android.util.Range<java.lang.Integer> r0 = r8.frameRate
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " frameRate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                android.util.Range<java.lang.Integer> r0 = r8.bitrate
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " bitrate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                java.lang.Integer r0 = r8.aspectRatio
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " aspectRatio"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L6f
                androidx.camera.video.AutoValue_VideoSpec r2 = new androidx.camera.video.AutoValue_VideoSpec
                androidx.camera.video.QualitySelector r3 = r8.qualitySelector
                android.util.Range<java.lang.Integer> r4 = r8.frameRate
                android.util.Range<java.lang.Integer> r5 = r8.bitrate
                java.lang.Integer r0 = r8.aspectRatio
                int r6 = r0.intValue()
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L6f:
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

        @Override // androidx.camera.video.VideoSpec.Builder
        androidx.camera.video.VideoSpec.Builder setAspectRatio(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.aspectRatio = r1
                return r0
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public androidx.camera.video.VideoSpec.Builder setBitrate(android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.bitrate = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null bitrate"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public androidx.camera.video.VideoSpec.Builder setFrameRate(android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.frameRate = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null frameRate"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public androidx.camera.video.VideoSpec.Builder setQualitySelector(androidx.camera.video.QualitySelector r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.qualitySelector = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null qualitySelector"
                r2.<init>(r0)
                throw r2
        }
    }

    private AutoValue_VideoSpec(androidx.camera.video.QualitySelector r1, android.util.Range<java.lang.Integer> r2, android.util.Range<java.lang.Integer> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.qualitySelector = r1
            r0.frameRate = r2
            r0.bitrate = r3
            r0.aspectRatio = r4
            return
    }

    /* synthetic */ AutoValue_VideoSpec(androidx.camera.video.QualitySelector r1, android.util.Range r2, android.util.Range r3, int r4, androidx.camera.video.AutoValue_VideoSpec.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.VideoSpec
            r2 = 0
            if (r1 == 0) goto L38
            androidx.camera.video.VideoSpec r5 = (androidx.camera.video.VideoSpec) r5
            androidx.camera.video.QualitySelector r1 = r4.qualitySelector
            androidx.camera.video.QualitySelector r3 = r5.getQualitySelector()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            android.util.Range<java.lang.Integer> r1 = r4.frameRate
            android.util.Range r3 = r5.getFrameRate()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            android.util.Range<java.lang.Integer> r1 = r4.bitrate
            android.util.Range r3 = r5.getBitrate()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            int r1 = r4.aspectRatio
            int r5 = r5.getAspectRatio()
            if (r1 != r5) goto L38
            return r0
        L38:
            return r2
    }

    @Override // androidx.camera.video.VideoSpec
    int getAspectRatio() {
            r1 = this;
            int r0 = r1.aspectRatio
            return r0
    }

    @Override // androidx.camera.video.VideoSpec
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getBitrate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.video.VideoSpec
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getFrameRate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.frameRate
            return r0
    }

    @Override // androidx.camera.video.VideoSpec
    @androidx.annotation.NonNull
    public androidx.camera.video.QualitySelector getQualitySelector() {
            r1 = this;
            androidx.camera.video.QualitySelector r0 = r1.qualitySelector
            return r0
    }

    public int hashCode() {
            r3 = this;
            androidx.camera.video.QualitySelector r0 = r3.qualitySelector
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.util.Range<java.lang.Integer> r2 = r3.frameRate
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range<java.lang.Integer> r2 = r3.bitrate
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.aspectRatio
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.video.VideoSpec
    public androidx.camera.video.VideoSpec.Builder toBuilder() {
            r2 = this;
            androidx.camera.video.AutoValue_VideoSpec$Builder r0 = new androidx.camera.video.AutoValue_VideoSpec$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoSpec{qualitySelector="
            r0.append(r1)
            androidx.camera.video.QualitySelector r1 = r2.qualitySelector
            r0.append(r1)
            java.lang.String r1 = ", frameRate="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.frameRate
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", aspectRatio="
            r0.append(r1)
            int r1 = r2.aspectRatio
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
