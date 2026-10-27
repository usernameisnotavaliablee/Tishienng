package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_VideoEncoderConfig extends androidx.camera.video.internal.encoder.VideoEncoderConfig {
    private final int IFrameInterval;
    private final int bitrate;
    private final int colorFormat;
    private final androidx.camera.video.internal.encoder.VideoEncoderDataSpace dataSpace;
    private final int frameRate;
    private final androidx.camera.core.impl.Timebase inputTimebase;
    private final java.lang.String mimeType;
    private final int profile;
    private final android.util.Size resolution;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder {
        private java.lang.Integer IFrameInterval;
        private java.lang.Integer bitrate;
        private java.lang.Integer colorFormat;
        private androidx.camera.video.internal.encoder.VideoEncoderDataSpace dataSpace;
        private java.lang.Integer frameRate;
        private androidx.camera.core.impl.Timebase inputTimebase;
        private java.lang.String mimeType;
        private java.lang.Integer profile;
        private android.util.Size resolution;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig build() {
                r13 = this;
                java.lang.String r0 = r13.mimeType
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " mimeType"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r13.profile
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " profile"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                androidx.camera.core.impl.Timebase r0 = r13.inputTimebase
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " inputTimebase"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                android.util.Size r0 = r13.resolution
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " resolution"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                java.lang.Integer r0 = r13.colorFormat
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " colorFormat"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = r13.dataSpace
                if (r0 != 0) goto L80
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " dataSpace"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L80:
                java.lang.Integer r0 = r13.frameRate
                if (r0 != 0) goto L95
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " frameRate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L95:
                java.lang.Integer r0 = r13.IFrameInterval
                if (r0 != 0) goto Laa
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " IFrameInterval"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            Laa:
                java.lang.Integer r0 = r13.bitrate
                if (r0 != 0) goto Lbf
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " bitrate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            Lbf:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto Lf2
                androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig r2 = new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig
                java.lang.String r3 = r13.mimeType
                java.lang.Integer r0 = r13.profile
                int r4 = r0.intValue()
                androidx.camera.core.impl.Timebase r5 = r13.inputTimebase
                android.util.Size r6 = r13.resolution
                java.lang.Integer r0 = r13.colorFormat
                int r7 = r0.intValue()
                androidx.camera.video.internal.encoder.VideoEncoderDataSpace r8 = r13.dataSpace
                java.lang.Integer r0 = r13.frameRate
                int r9 = r0.intValue()
                java.lang.Integer r0 = r13.IFrameInterval
                int r10 = r0.intValue()
                java.lang.Integer r0 = r13.bitrate
                int r11 = r0.intValue()
                r12 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r2
            Lf2:
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

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setBitrate(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.bitrate = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setColorFormat(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.colorFormat = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setDataSpace(androidx.camera.video.internal.encoder.VideoEncoderDataSpace r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.dataSpace = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null dataSpace"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setFrameRate(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.frameRate = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setIFrameInterval(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.IFrameInterval = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase r2) {
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

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setMimeType(java.lang.String r2) {
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

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setProfile(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.profile = r1
                return r0
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setResolution(android.util.Size r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.resolution = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null resolution"
                r2.<init>(r0)
                throw r2
        }
    }

    private AutoValue_VideoEncoderConfig(java.lang.String r1, int r2, androidx.camera.core.impl.Timebase r3, android.util.Size r4, int r5, androidx.camera.video.internal.encoder.VideoEncoderDataSpace r6, int r7, int r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.mimeType = r1
            r0.profile = r2
            r0.inputTimebase = r3
            r0.resolution = r4
            r0.colorFormat = r5
            r0.dataSpace = r6
            r0.frameRate = r7
            r0.IFrameInterval = r8
            r0.bitrate = r9
            return
    }

    /* synthetic */ AutoValue_VideoEncoderConfig(java.lang.String r1, int r2, androidx.camera.core.impl.Timebase r3, android.util.Size r4, int r5, androidx.camera.video.internal.encoder.VideoEncoderDataSpace r6, int r7, int r8, int r9, androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.internal.encoder.VideoEncoderConfig
            r2 = 0
            if (r1 == 0) goto L64
            androidx.camera.video.internal.encoder.VideoEncoderConfig r5 = (androidx.camera.video.internal.encoder.VideoEncoderConfig) r5
            java.lang.String r1 = r4.mimeType
            java.lang.String r3 = r5.getMimeType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r4.profile
            int r3 = r5.getProfile()
            if (r1 != r3) goto L64
            androidx.camera.core.impl.Timebase r1 = r4.inputTimebase
            androidx.camera.core.impl.Timebase r3 = r5.getInputTimebase()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            android.util.Size r1 = r4.resolution
            android.util.Size r3 = r5.getResolution()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r4.colorFormat
            int r3 = r5.getColorFormat()
            if (r1 != r3) goto L64
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r1 = r4.dataSpace
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r3 = r5.getDataSpace()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r4.frameRate
            int r3 = r5.getFrameRate()
            if (r1 != r3) goto L64
            int r1 = r4.IFrameInterval
            int r3 = r5.getIFrameInterval()
            if (r1 != r3) goto L64
            int r1 = r4.bitrate
            int r5 = r5.getBitrate()
            if (r1 != r5) goto L64
            return r0
        L64:
            return r2
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getBitrate() {
            r1 = this;
            int r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getColorFormat() {
            r1 = this;
            int r0 = r1.colorFormat
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.encoder.VideoEncoderDataSpace getDataSpace() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = r1.dataSpace
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getFrameRate() {
            r1 = this;
            int r0 = r1.frameRate
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getIFrameInterval() {
            r1 = this;
            int r0 = r1.IFrameInterval
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Timebase getInputTimebase() {
            r1 = this;
            androidx.camera.core.impl.Timebase r0 = r1.inputTimebase
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @androidx.annotation.NonNull
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mimeType
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
            r1 = this;
            int r0 = r1.profile
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    @androidx.annotation.NonNull
    public android.util.Size getResolution() {
            r1 = this;
            android.util.Size r0 = r1.resolution
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
            android.util.Size r2 = r3.resolution
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.colorFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r2 = r3.dataSpace
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.frameRate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.IFrameInterval
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.bitrate
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoEncoderConfig{mimeType="
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
            java.lang.String r1 = ", resolution="
            r0.append(r1)
            android.util.Size r1 = r2.resolution
            r0.append(r1)
            java.lang.String r1 = ", colorFormat="
            r0.append(r1)
            int r1 = r2.colorFormat
            r0.append(r1)
            java.lang.String r1 = ", dataSpace="
            r0.append(r1)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r1 = r2.dataSpace
            r0.append(r1)
            java.lang.String r1 = ", frameRate="
            r0.append(r1)
            int r1 = r2.frameRate
            r0.append(r1)
            java.lang.String r1 = ", IFrameInterval="
            r0.append(r1)
            int r1 = r2.IFrameInterval
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            int r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
