package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AudioStats {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final double AUDIO_AMPLITUDE_NONE = 0.0d;
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_MUTED = 5;
    public static final int AUDIO_STATE_SOURCE_ERROR = 4;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;
    private static final java.util.Set<java.lang.Integer> ERROR_STATES = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface AudioState {
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r6 = 0
            r3[r6] = r2
            r2 = 1
            r3[r2] = r4
            r3[r1] = r5
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.video.AudioStats.ERROR_STATES = r0
            return
    }

    AudioStats() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.AudioStats of(int r1, @androidx.annotation.Nullable java.lang.Throwable r2, double r3) {
            androidx.camera.video.AutoValue_AudioStats r0 = new androidx.camera.video.AutoValue_AudioStats
            r0.<init>(r1, r3, r2)
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.video.ExperimentalAudioApi.class})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public double getAudioAmplitude() {
            r2 = this;
            int r0 = r2.getAudioState()
            r1 = 1
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            double r0 = r2.getAudioAmplitudeInternal()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    abstract double getAudioAmplitudeInternal();

    public abstract int getAudioState();

    @androidx.annotation.Nullable
    public abstract java.lang.Throwable getErrorCause();

    public boolean hasAudio() {
            r1 = this;
            int r0 = r1.getAudioState()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean hasError() {
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = androidx.camera.video.AudioStats.ERROR_STATES
            int r1 = r2.getAudioState()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
