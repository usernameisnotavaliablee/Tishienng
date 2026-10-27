package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final java.lang.String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int a(int r2, java.lang.Integer r3, java.lang.Integer r4) {
            int r0 = r3.intValue()
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            int r1 = r4.intValue()
            int r1 = r1 - r2
            int r2 = java.lang.Math.abs(r1)
            int r0 = r0 - r2
            if (r0 != 0) goto L25
            int r2 = r3.intValue()
            int r3 = r4.intValue()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = java.lang.Math.signum(r2)
        L23:
            int r2 = (int) r2
            return r2
        L25:
            float r2 = (float) r0
            float r2 = java.lang.Math.signum(r2)
            goto L23
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.AudioEncoderConfig resolveAudioEncoderConfig(@androidx.annotation.NonNull androidx.camera.video.internal.config.AudioMimeInfo r7, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r8, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r9, @androidx.annotation.NonNull androidx.camera.video.AudioSpec r10) {
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r6 = r7.getCompatibleAudioProfile()
            if (r6 == 0) goto L17
            androidx.camera.video.internal.config.AudioEncoderConfigAudioProfileResolver r0 = new androidx.camera.video.internal.config.AudioEncoderConfigAudioProfileResolver
            java.lang.String r1 = r7.getMimeType()
            int r2 = r7.getProfile()
            r3 = r8
            r5 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L2c
        L17:
            r3 = r8
            r5 = r9
            r4 = r10
            androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver r1 = new androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver
            java.lang.String r2 = r7.getMimeType()
            int r7 = r7.getProfile()
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r1
        L2c:
            java.lang.Object r7 = r0.get()
            androidx.camera.video.internal.encoder.AudioEncoderConfig r7 = (androidx.camera.video.internal.encoder.AudioEncoderConfig) r7
            return r7
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.config.AudioMimeInfo resolveAudioMimeInfo(@androidx.annotation.NonNull androidx.camera.video.MediaSpec r8, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r9) {
            int r0 = r8.getOutputFormat()
            java.lang.String r0 = androidx.camera.video.MediaSpec.outputFormatToAudioMime(r0)
            int r1 = r8.getOutputFormat()
            int r1 = androidx.camera.video.MediaSpec.outputFormatToAudioProfile(r1)
            if (r9 == 0) goto Lca
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r2 = r9.getDefaultAudioProfile()
            if (r2 == 0) goto Lca
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r9 = r9.getDefaultAudioProfile()
            java.lang.String r2 = r9.getMediaType()
            int r3 = r9.getProfile()
            java.lang.String r4 = "audio/none"
            boolean r4 = java.util.Objects.equals(r2, r4)
            java.lang.String r5 = ")]"
            java.lang.String r6 = "AudioConfigUtil"
            java.lang.String r7 = "(profile: "
            if (r4 == 0) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            goto Lca
        L51:
            int r8 = r8.getOutputFormat()
            r4 = -1
            if (r8 != r4) goto L78
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            r1 = r3
            goto Lcb
        L78:
            boolean r8 = java.util.Objects.equals(r0, r2)
            if (r8 == 0) goto L9f
            if (r1 != r3) goto L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            goto Lcb
        L9f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: "
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r9 = "), chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
        Lca:
            r9 = 0
        Lcb:
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = androidx.camera.video.internal.config.AudioMimeInfo.builder(r0)
            java.lang.Object r8 = r8.setProfile(r1)
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = (androidx.camera.video.internal.config.AudioMimeInfo.Builder) r8
            if (r9 == 0) goto Lda
            r8.setCompatibleAudioProfile(r9)
        Lda:
            androidx.camera.video.internal.config.AudioMimeInfo r8 = r8.build()
            return r8
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.audio.AudioSettings resolveAudioSettings(@androidx.annotation.NonNull androidx.camera.video.internal.config.AudioMimeInfo r1, @androidx.annotation.NonNull androidx.camera.video.AudioSpec r2) {
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r1 = r1.getCompatibleAudioProfile()
            if (r1 == 0) goto Lc
            androidx.camera.video.internal.config.AudioSettingsAudioProfileResolver r0 = new androidx.camera.video.internal.config.AudioSettingsAudioProfileResolver
            r0.<init>(r2, r1)
            goto L11
        Lc:
            androidx.camera.video.internal.config.AudioSettingsDefaultResolver r0 = new androidx.camera.video.internal.config.AudioSettingsDefaultResolver
            r0.<init>(r2)
        L11:
            java.lang.Object r1 = r0.get()
            androidx.camera.video.internal.audio.AudioSettings r1 = (androidx.camera.video.internal.audio.AudioSettings) r1
            return r1
    }

    static int resolveAudioSource(@androidx.annotation.NonNull androidx.camera.video.AudioSpec r3) {
            int r3 = r3.getSource()
            r0 = -1
            java.lang.String r1 = "AudioConfigUtil"
            if (r3 != r0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Using default AUDIO source: "
            r3.append(r0)
            r0 = 5
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r1, r3)
            return r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Using provided AUDIO source: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            return r3
    }

    static int resolveAudioSourceFormat(@androidx.annotation.NonNull androidx.camera.video.AudioSpec r3) {
            int r3 = r3.getSourceFormat()
            r0 = -1
            java.lang.String r1 = "AudioConfigUtil"
            if (r3 != r0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Using default AUDIO source format: "
            r3.append(r0)
            r0 = 2
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r1, r3)
            return r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Using provided AUDIO source format: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            return r3
    }

    static int scaleAndClampBitrate(int r7, int r8, int r9, int r10, int r11, android.util.Range<java.lang.Integer> r12) {
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r8, r9)
            android.util.Rational r1 = new android.util.Rational
            r1.<init>(r10, r11)
            double r2 = (double) r7
            double r4 = r0.doubleValue()
            double r2 = r2 * r4
            double r0 = r1.doubleValue()
            double r2 = r2 * r0
            int r0 = (int) r2
            java.lang.String r1 = "AudioConfigUtil"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r1)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L54
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r7
            r6[r4] = r8
            r6[r3] = r9
            r7 = 3
            r6[r7] = r10
            r7 = 4
            r6[r7] = r11
            r7 = 5
            r6[r7] = r2
            java.lang.String r7 = "Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d"
            java.lang.String r7 = java.lang.String.format(r7, r6)
            goto L56
        L54:
            java.lang.String r7 = ""
        L56:
            android.util.Range<java.lang.Integer> r8 = androidx.camera.video.AudioSpec.BITRATE_RANGE_AUTO
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L8d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r8 = r12.clamp(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r0 = r8.intValue()
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r1)
            if (r9 == 0) goto L8d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r12
            r7[r4] = r8
            java.lang.String r8 = "\nClamped to range %s -> %dbps"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L8d:
            androidx.camera.core.Logger.d(r1, r7)
            return r0
    }

    static int selectSampleRateOrNearestSupported(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r7, int r8, int r9, int r10) {
            r0 = 0
            r1 = 0
            r2 = r10
        L3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r7.contains(r3)
            java.lang.String r4 = "Sample rate "
            java.lang.String r5 = "AudioConfigUtil"
            if (r3 == 0) goto L3b
            boolean r3 = androidx.camera.video.internal.audio.AudioSource.isSettingsSupported(r2, r8, r9)
            if (r3 == 0) goto L18
            return r2
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "Hz is not supported by audio source with channel count "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " and source format "
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            androidx.camera.core.Logger.d(r5, r2)
            goto L55
        L3b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "Hz is not in target range "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            androidx.camera.core.Logger.d(r5, r2)
        L55:
            if (r0 != 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Trying common sample rates in proximity order to target "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = "Hz"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.Integer> r2 = androidx.camera.video.internal.audio.AudioSettings.COMMON_SAMPLE_RATES
            r0.<init>(r2)
            androidx.camera.video.internal.config.a r2 = new androidx.camera.video.internal.config.a
            r2.<init>(r10)
            java.util.Collections.sort(r0, r2)
        L7f:
            int r2 = r0.size()
            if (r1 >= r2) goto L96
            int r2 = r1 + 1
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6 = r2
            r2 = r1
            r1 = r6
            goto L3
        L96:
            java.lang.String r7 = "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz"
            androidx.camera.core.Logger.d(r5, r7)
            r7 = 44100(0xac44, float:6.1797E-41)
            return r7
    }
}
