package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_MediaSpec extends androidx.camera.video.MediaSpec {
    private final androidx.camera.video.AudioSpec audioSpec;
    private final int outputFormat;
    private final androidx.camera.video.VideoSpec videoSpec;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.AutoValue_MediaSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.MediaSpec.Builder {
        private androidx.camera.video.AudioSpec audioSpec;
        private java.lang.Integer outputFormat;
        private androidx.camera.video.VideoSpec videoSpec;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(androidx.camera.video.MediaSpec r2) {
                r1 = this;
                r1.<init>()
                androidx.camera.video.VideoSpec r0 = r2.getVideoSpec()
                r1.videoSpec = r0
                androidx.camera.video.AudioSpec r0 = r2.getAudioSpec()
                r1.audioSpec = r0
                int r2 = r2.getOutputFormat()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.outputFormat = r2
                return
        }

        /* synthetic */ Builder(androidx.camera.video.MediaSpec r1, androidx.camera.video.AutoValue_MediaSpec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public androidx.camera.video.MediaSpec build() {
                r5 = this;
                androidx.camera.video.VideoSpec r0 = r5.videoSpec
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " videoSpec"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                androidx.camera.video.AudioSpec r0 = r5.audioSpec
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " audioSpec"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r5.outputFormat
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " outputFormat"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L58
                androidx.camera.video.AutoValue_MediaSpec r0 = new androidx.camera.video.AutoValue_MediaSpec
                androidx.camera.video.VideoSpec r1 = r5.videoSpec
                androidx.camera.video.AudioSpec r2 = r5.audioSpec
                java.lang.Integer r3 = r5.outputFormat
                int r3 = r3.intValue()
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L58:
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

        @Override // androidx.camera.video.MediaSpec.Builder
        androidx.camera.video.AudioSpec getAudioSpec() {
                r2 = this;
                androidx.camera.video.AudioSpec r0 = r2.audioSpec
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Property \"audioSpec\" has not been set"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        androidx.camera.video.VideoSpec getVideoSpec() {
                r2 = this;
                androidx.camera.video.VideoSpec r0 = r2.videoSpec
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Property \"videoSpec\" has not been set"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public androidx.camera.video.MediaSpec.Builder setAudioSpec(androidx.camera.video.AudioSpec r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.audioSpec = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null audioSpec"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public androidx.camera.video.MediaSpec.Builder setOutputFormat(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.outputFormat = r1
                return r0
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public androidx.camera.video.MediaSpec.Builder setVideoSpec(androidx.camera.video.VideoSpec r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.videoSpec = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null videoSpec"
                r2.<init>(r0)
                throw r2
        }
    }

    private AutoValue_MediaSpec(androidx.camera.video.VideoSpec r1, androidx.camera.video.AudioSpec r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.videoSpec = r1
            r0.audioSpec = r2
            r0.outputFormat = r3
            return
    }

    /* synthetic */ AutoValue_MediaSpec(androidx.camera.video.VideoSpec r1, androidx.camera.video.AudioSpec r2, int r3, androidx.camera.video.AutoValue_MediaSpec.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.MediaSpec
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.video.MediaSpec r5 = (androidx.camera.video.MediaSpec) r5
            androidx.camera.video.VideoSpec r1 = r4.videoSpec
            androidx.camera.video.VideoSpec r3 = r5.getVideoSpec()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            androidx.camera.video.AudioSpec r1 = r4.audioSpec
            androidx.camera.video.AudioSpec r3 = r5.getAudioSpec()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            int r1 = r4.outputFormat
            int r5 = r5.getOutputFormat()
            if (r1 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // androidx.camera.video.MediaSpec
    @androidx.annotation.NonNull
    public androidx.camera.video.AudioSpec getAudioSpec() {
            r1 = this;
            androidx.camera.video.AudioSpec r0 = r1.audioSpec
            return r0
    }

    @Override // androidx.camera.video.MediaSpec
    public int getOutputFormat() {
            r1 = this;
            int r0 = r1.outputFormat
            return r0
    }

    @Override // androidx.camera.video.MediaSpec
    @androidx.annotation.NonNull
    public androidx.camera.video.VideoSpec getVideoSpec() {
            r1 = this;
            androidx.camera.video.VideoSpec r0 = r1.videoSpec
            return r0
    }

    public int hashCode() {
            r3 = this;
            androidx.camera.video.VideoSpec r0 = r3.videoSpec
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.video.AudioSpec r2 = r3.audioSpec
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.outputFormat
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.video.MediaSpec
    public androidx.camera.video.MediaSpec.Builder toBuilder() {
            r2 = this;
            androidx.camera.video.AutoValue_MediaSpec$Builder r0 = new androidx.camera.video.AutoValue_MediaSpec$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MediaSpec{videoSpec="
            r0.append(r1)
            androidx.camera.video.VideoSpec r1 = r2.videoSpec
            r0.append(r1)
            java.lang.String r1 = ", audioSpec="
            r0.append(r1)
            androidx.camera.video.AudioSpec r1 = r2.audioSpec
            r0.append(r1)
            java.lang.String r1 = ", outputFormat="
            r0.append(r1)
            int r1 = r2.outputFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
