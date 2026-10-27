package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AudioSettings {
    public static final java.util.List<java.lang.Integer> COMMON_SAMPLE_RATES = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract androidx.camera.video.internal.audio.AudioSettings autoBuild();

        @androidx.annotation.NonNull
        public final androidx.camera.video.internal.audio.AudioSettings build() {
                r4 = this;
                androidx.camera.video.internal.audio.AudioSettings r0 = r4.autoBuild()
                int r1 = r0.getAudioSource()
                java.lang.String r2 = ""
                r3 = -1
                if (r1 != r3) goto L1e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " audioSource"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L1e:
                int r1 = r0.getSampleRate()
                if (r1 > 0) goto L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " sampleRate"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L35:
                int r1 = r0.getChannelCount()
                if (r1 > 0) goto L4c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " channelCount"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L4c:
                int r1 = r0.getAudioFormat()
                if (r1 != r3) goto L63
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = " audioFormat"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L63:
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L6a
                return r0
            L6a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Required settings missing or non-positive:"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setAudioFormat(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setAudioSource(int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setChannelCount(@androidx.annotation.IntRange(from = 1) int r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setSampleRate(@androidx.annotation.IntRange(from = 1) int r1);
    }

    static {
            r0 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 4800(0x12c0, float:6.726E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 6
            java.lang.Integer[] r6 = new java.lang.Integer[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            java.util.List r0 = java.util.Arrays.asList(r6)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            androidx.camera.video.internal.audio.AudioSettings.COMMON_SAMPLE_RATES = r0
            return
    }

    AudioSettings() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"Range"})
    public static androidx.camera.video.internal.audio.AudioSettings.Builder builder() {
            androidx.camera.video.internal.audio.AutoValue_AudioSettings$Builder r0 = new androidx.camera.video.internal.audio.AutoValue_AudioSettings$Builder
            r0.<init>()
            r1 = -1
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setAudioSource(r1)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setSampleRate(r1)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setChannelCount(r1)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setAudioFormat(r1)
            return r0
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
            r2 = this;
            int r0 = r2.getAudioFormat()
            int r1 = r2.getChannelCount()
            int r0 = androidx.camera.video.internal.audio.AudioUtils.getBytesPerFrame(r0, r1)
            return r0
    }

    @androidx.annotation.IntRange(from = 1)
    public abstract int getChannelCount();

    @androidx.annotation.IntRange(from = 1)
    public abstract int getSampleRate();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.internal.audio.AudioSettings.Builder toBuilder();
}
