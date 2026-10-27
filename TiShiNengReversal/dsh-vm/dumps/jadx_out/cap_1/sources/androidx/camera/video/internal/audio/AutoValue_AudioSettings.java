package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AudioSettings extends androidx.camera.video.internal.audio.AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int channelCount;
    private final int sampleRate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.audio.AutoValue_AudioSettings$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.internal.audio.AudioSettings.Builder {
        private java.lang.Integer audioFormat;
        private java.lang.Integer audioSource;
        private java.lang.Integer channelCount;
        private java.lang.Integer sampleRate;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(androidx.camera.video.internal.audio.AudioSettings r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.getAudioSource()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.audioSource = r0
                int r0 = r2.getSampleRate()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.sampleRate = r0
                int r0 = r2.getChannelCount()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.channelCount = r0
                int r2 = r2.getAudioFormat()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.audioFormat = r2
                return
        }

        /* synthetic */ Builder(androidx.camera.video.internal.audio.AudioSettings r1, androidx.camera.video.internal.audio.AutoValue_AudioSettings.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        androidx.camera.video.internal.audio.AudioSettings autoBuild() {
                r8 = this;
                java.lang.Integer r0 = r8.audioSource
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " audioSource"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r8.sampleRate
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " sampleRate"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r8.channelCount
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " channelCount"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                java.lang.Integer r0 = r8.audioFormat
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " audioFormat"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L7b
                androidx.camera.video.internal.audio.AutoValue_AudioSettings r2 = new androidx.camera.video.internal.audio.AutoValue_AudioSettings
                java.lang.Integer r0 = r8.audioSource
                int r3 = r0.intValue()
                java.lang.Integer r0 = r8.sampleRate
                int r4 = r0.intValue()
                java.lang.Integer r0 = r8.channelCount
                int r5 = r0.intValue()
                java.lang.Integer r0 = r8.audioFormat
                int r6 = r0.intValue()
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L7b:
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

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public androidx.camera.video.internal.audio.AudioSettings.Builder setAudioFormat(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.audioFormat = r1
                return r0
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public androidx.camera.video.internal.audio.AudioSettings.Builder setAudioSource(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.audioSource = r1
                return r0
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public androidx.camera.video.internal.audio.AudioSettings.Builder setChannelCount(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.channelCount = r1
                return r0
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public androidx.camera.video.internal.audio.AudioSettings.Builder setSampleRate(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.sampleRate = r1
                return r0
        }
    }

    private AutoValue_AudioSettings(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.audioSource = r1
            r0.sampleRate = r2
            r0.channelCount = r3
            r0.audioFormat = r4
            return
    }

    /* synthetic */ AutoValue_AudioSettings(int r1, int r2, int r3, int r4, androidx.camera.video.internal.audio.AutoValue_AudioSettings.AnonymousClass1 r5) {
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
            boolean r1 = r5 instanceof androidx.camera.video.internal.audio.AudioSettings
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.video.internal.audio.AudioSettings r5 = (androidx.camera.video.internal.audio.AudioSettings) r5
            int r1 = r4.audioSource
            int r3 = r5.getAudioSource()
            if (r1 != r3) goto L2c
            int r1 = r4.sampleRate
            int r3 = r5.getSampleRate()
            if (r1 != r3) goto L2c
            int r1 = r4.channelCount
            int r3 = r5.getChannelCount()
            if (r1 != r3) goto L2c
            int r1 = r4.audioFormat
            int r5 = r5.getAudioFormat()
            if (r1 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
            r1 = this;
            int r0 = r1.audioFormat
            return r0
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
            r1 = this;
            int r0 = r1.audioSource
            return r0
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @androidx.annotation.IntRange(from = 1)
    public int getChannelCount() {
            r1 = this;
            int r0 = r1.channelCount
            return r0
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @androidx.annotation.IntRange(from = 1)
    public int getSampleRate() {
            r1 = this;
            int r0 = r1.sampleRate
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.audioSource
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.sampleRate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.channelCount
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.audioFormat
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public androidx.camera.video.internal.audio.AudioSettings.Builder toBuilder() {
            r2 = this;
            androidx.camera.video.internal.audio.AutoValue_AudioSettings$Builder r0 = new androidx.camera.video.internal.audio.AutoValue_AudioSettings$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioSettings{audioSource="
            r0.append(r1)
            int r1 = r2.audioSource
            r0.append(r1)
            java.lang.String r1 = ", sampleRate="
            r0.append(r1)
            int r1 = r2.sampleRate
            r0.append(r1)
            java.lang.String r1 = ", channelCount="
            r0.append(r1)
            int r1 = r2.channelCount
            r0.append(r1)
            java.lang.String r1 = ", audioFormat="
            r0.append(r1)
            int r1 = r2.audioFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
