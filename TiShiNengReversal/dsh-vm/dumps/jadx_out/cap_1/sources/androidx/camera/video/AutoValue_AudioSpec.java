package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AudioSpec extends androidx.camera.video.AudioSpec {
    private final android.util.Range<java.lang.Integer> bitrate;
    private final int channelCount;
    private final android.util.Range<java.lang.Integer> sampleRate;
    private final int source;
    private final int sourceFormat;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.AutoValue_AudioSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.AudioSpec.Builder {
        private android.util.Range<java.lang.Integer> bitrate;
        private java.lang.Integer channelCount;
        private android.util.Range<java.lang.Integer> sampleRate;
        private java.lang.Integer source;
        private java.lang.Integer sourceFormat;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(androidx.camera.video.AudioSpec r2) {
                r1 = this;
                r1.<init>()
                android.util.Range r0 = r2.getBitrate()
                r1.bitrate = r0
                int r0 = r2.getSourceFormat()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.sourceFormat = r0
                int r0 = r2.getSource()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.source = r0
                android.util.Range r0 = r2.getSampleRate()
                r1.sampleRate = r0
                int r2 = r2.getChannelCount()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.channelCount = r2
                return
        }

        /* synthetic */ Builder(androidx.camera.video.AudioSpec r1, androidx.camera.video.AutoValue_AudioSpec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec build() {
                r9 = this;
                android.util.Range<java.lang.Integer> r0 = r9.bitrate
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " bitrate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r9.sourceFormat
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " sourceFormat"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r9.source
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " source"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                android.util.Range<java.lang.Integer> r0 = r9.sampleRate
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " sampleRate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                java.lang.Integer r0 = r9.channelCount
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " channelCount"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L8e
                androidx.camera.video.AutoValue_AudioSpec r2 = new androidx.camera.video.AutoValue_AudioSpec
                android.util.Range<java.lang.Integer> r3 = r9.bitrate
                java.lang.Integer r0 = r9.sourceFormat
                int r4 = r0.intValue()
                java.lang.Integer r0 = r9.source
                int r5 = r0.intValue()
                android.util.Range<java.lang.Integer> r6 = r9.sampleRate
                java.lang.Integer r0 = r9.channelCount
                int r7 = r0.intValue()
                r8 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r2
            L8e:
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

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec.Builder setBitrate(android.util.Range<java.lang.Integer> r2) {
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

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec.Builder setChannelCount(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.channelCount = r1
                return r0
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec.Builder setSampleRate(android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.sampleRate = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null sampleRate"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec.Builder setSource(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.source = r1
                return r0
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public androidx.camera.video.AudioSpec.Builder setSourceFormat(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.sourceFormat = r1
                return r0
        }
    }

    private AutoValue_AudioSpec(android.util.Range<java.lang.Integer> r1, int r2, int r3, android.util.Range<java.lang.Integer> r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.bitrate = r1
            r0.sourceFormat = r2
            r0.source = r3
            r0.sampleRate = r4
            r0.channelCount = r5
            return
    }

    /* synthetic */ AutoValue_AudioSpec(android.util.Range r1, int r2, int r3, android.util.Range r4, int r5, androidx.camera.video.AutoValue_AudioSpec.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.AudioSpec
            r2 = 0
            if (r1 == 0) goto L3c
            androidx.camera.video.AudioSpec r5 = (androidx.camera.video.AudioSpec) r5
            android.util.Range<java.lang.Integer> r1 = r4.bitrate
            android.util.Range r3 = r5.getBitrate()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            int r1 = r4.sourceFormat
            int r3 = r5.getSourceFormat()
            if (r1 != r3) goto L3c
            int r1 = r4.source
            int r3 = r5.getSource()
            if (r1 != r3) goto L3c
            android.util.Range<java.lang.Integer> r1 = r4.sampleRate
            android.util.Range r3 = r5.getSampleRate()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            int r1 = r4.channelCount
            int r5 = r5.getChannelCount()
            if (r1 != r5) goto L3c
            return r0
        L3c:
            return r2
    }

    @Override // androidx.camera.video.AudioSpec
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getBitrate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
            r1 = this;
            int r0 = r1.channelCount
            return r0
    }

    @Override // androidx.camera.video.AudioSpec
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSampleRate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.sampleRate
            return r0
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
            r1 = this;
            int r0 = r1.source
            return r0
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
            r1 = this;
            int r0 = r1.sourceFormat
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.util.Range<java.lang.Integer> r0 = r3.bitrate
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.sourceFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.source
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range<java.lang.Integer> r2 = r3.sampleRate
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.channelCount
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.video.AudioSpec
    public androidx.camera.video.AudioSpec.Builder toBuilder() {
            r2 = this;
            androidx.camera.video.AutoValue_AudioSpec$Builder r0 = new androidx.camera.video.AutoValue_AudioSpec$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioSpec{bitrate="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", sourceFormat="
            r0.append(r1)
            int r1 = r2.sourceFormat
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            int r1 = r2.source
            r0.append(r1)
            java.lang.String r1 = ", sampleRate="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.sampleRate
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
