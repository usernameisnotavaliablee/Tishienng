package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioSettingsDefaultResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.audio.AudioSettings> {
    private static final java.lang.String TAG = "DefAudioResolver";
    private final androidx.camera.video.AudioSpec mAudioSpec;

    public AudioSettingsDefaultResolver(@androidx.annotation.NonNull androidx.camera.video.AudioSpec r1) {
            r0 = this;
            r0.<init>()
            r0.mAudioSpec = r1
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.audio.AudioSettings get() {
            r8 = this;
            androidx.camera.video.AudioSpec r0 = r8.mAudioSpec
            int r0 = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioSource(r0)
            androidx.camera.video.AudioSpec r1 = r8.mAudioSpec
            int r1 = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioSourceFormat(r1)
            androidx.camera.video.AudioSpec r2 = r8.mAudioSpec
            int r2 = r2.getChannelCount()
            r3 = -1
            java.lang.String r4 = "DefAudioResolver"
            if (r2 != r3) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Using fallback AUDIO channel count: "
            r2.append(r3)
            r3 = 1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r4, r2)
            r2 = 1
            goto L42
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Using supplied AUDIO channel count: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r4, r3)
        L42:
            androidx.camera.video.AudioSpec r3 = r8.mAudioSpec
            android.util.Range r3 = r3.getSampleRate()
            android.util.Range<java.lang.Integer> r5 = androidx.camera.video.AudioSpec.SAMPLE_RATE_RANGE_AUTO
            boolean r5 = r5.equals(r3)
            java.lang.String r6 = "Hz"
            if (r5 == 0) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Using fallback AUDIO sample rate: "
            r3.append(r5)
            r5 = 44100(0xac44, float:6.1797E-41)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r4, r3)
            goto L92
        L6d:
            java.lang.Comparable r5 = r3.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = androidx.camera.video.internal.config.AudioConfigUtil.selectSampleRateOrNearestSupported(r3, r2, r1, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "Using AUDIO sample rate resolved from AudioSpec: "
            r3.append(r7)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            androidx.camera.core.Logger.d(r4, r3)
        L92:
            androidx.camera.video.internal.audio.AudioSettings$Builder r3 = androidx.camera.video.internal.audio.AudioSettings.builder()
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r3.setAudioSource(r0)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setAudioFormat(r1)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setChannelCount(r2)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setSampleRate(r5)
            androidx.camera.video.internal.audio.AudioSettings r0 = r0.build()
            return r0
    }

    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.video.internal.audio.AudioSettings get() {
            r1 = this;
            androidx.camera.video.internal.audio.AudioSettings r0 = r1.get()
            return r0
    }
}
