package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AudioEncoderConfig extends androidx.camera.video.internal.encoder.AudioEncoderConfig {
    private final int bitrate;
    private final int channelCount;
    private final androidx.camera.core.impl.Timebase inputTimebase;
    private final java.lang.String mimeType;
    private final int profile;
    private final int sampleRate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder {
        private java.lang.Integer bitrate;
        private java.lang.Integer channelCount;
        private androidx.camera.core.impl.Timebase inputTimebase;
        private java.lang.String mimeType;
        private java.lang.Integer profile;
        private java.lang.Integer sampleRate;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        androidx.camera.video.internal.encoder.AudioEncoderConfig autoBuild() {
                r10 = this;
                java.lang.String r0 = r10.mimeType
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " mimeType"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r10.profile
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " profile"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                androidx.camera.core.impl.Timebase r0 = r10.inputTimebase
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " inputTimebase"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                java.lang.Integer r0 = r10.bitrate
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " bitrate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                java.lang.Integer r0 = r10.sampleRate
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " sampleRate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                java.lang.Integer r0 = r10.channelCount
                if (r0 != 0) goto L80
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " channelCount"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L80:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto La9
                androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig r2 = new androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig
                java.lang.String r3 = r10.mimeType
                java.lang.Integer r0 = r10.profile
                int r4 = r0.intValue()
                androidx.camera.core.impl.Timebase r5 = r10.inputTimebase
                java.lang.Integer r0 = r10.bitrate
                int r6 = r0.intValue()
                java.lang.Integer r0 = r10.sampleRate
                int r7 = r0.intValue()
                java.lang.Integer r0 = r10.channelCount
                int r8 = r0.intValue()
                r9 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            La9:
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

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setBitrate(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.bitrate = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setChannelCount(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.channelCount = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.inputTimebase = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null inputTimebase"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setMimeType(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.mimeType = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null mimeType"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setProfile(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.profile = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setSampleRate(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.sampleRate = r1
                return r0
        }
    }

    private AutoValue_AudioEncoderConfig(java.lang.String r1, int r2, androidx.camera.core.impl.Timebase r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.mimeType = r1
            r0.profile = r2
            r0.inputTimebase = r3
            r0.bitrate = r4
            r0.sampleRate = r5
            r0.channelCount = r6
            return
    }

    /* synthetic */ AutoValue_AudioEncoderConfig(java.lang.String r1, int r2, androidx.camera.core.impl.Timebase r3, int r4, int r5, int r6, androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.internal.encoder.AudioEncoderConfig
            r2 = 0
            if (r1 == 0) goto L44
            androidx.camera.video.internal.encoder.AudioEncoderConfig r5 = (androidx.camera.video.internal.encoder.AudioEncoderConfig) r5
            java.lang.String r1 = r4.mimeType
            java.lang.String r3 = r5.getMimeType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            int r1 = r4.profile
            int r3 = r5.getProfile()
            if (r1 != r3) goto L44
            androidx.camera.core.impl.Timebase r1 = r4.inputTimebase
            androidx.camera.core.impl.Timebase r3 = r5.getInputTimebase()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            int r1 = r4.bitrate
            int r3 = r5.getBitrate()
            if (r1 != r3) goto L44
            int r1 = r4.sampleRate
            int r3 = r5.getSampleRate()
            if (r1 != r3) goto L44
            int r1 = r4.channelCount
            int r5 = r5.getChannelCount()
            if (r1 != r5) goto L44
            return r0
        L44:
            return r2
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
            r1 = this;
            int r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
            r1 = this;
            int r0 = r1.channelCount
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Timebase getInputTimebase() {
            r1 = this;
            androidx.camera.core.impl.Timebase r0 = r1.inputTimebase
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mimeType
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
            r1 = this;
            int r0 = r1.profile
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getSampleRate() {
            r1 = this;
            int r0 = r1.sampleRate
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.mimeType
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.profile
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.Timebase r2 = r3.inputTimebase
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.bitrate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.sampleRate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.channelCount
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioEncoderConfig{mimeType="
            r0.append(r1)
            java.lang.String r1 = r2.mimeType
            r0.append(r1)
            java.lang.String r1 = ", profile="
            r0.append(r1)
            int r1 = r2.profile
            r0.append(r1)
            java.lang.String r1 = ", inputTimebase="
            r0.append(r1)
            androidx.camera.core.impl.Timebase r1 = r2.inputTimebase
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            int r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", sampleRate="
            r0.append(r1)
            int r1 = r2.sampleRate
            r0.append(r1)
            java.lang.String r1 = ", channelCount="
            r0.append(r1)
            int r1 = r2.channelCount
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
