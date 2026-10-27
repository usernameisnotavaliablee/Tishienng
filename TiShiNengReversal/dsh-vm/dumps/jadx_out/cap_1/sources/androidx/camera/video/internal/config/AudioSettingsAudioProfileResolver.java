package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioSettingsAudioProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.audio.AudioSettings> {
    private static final java.lang.String TAG = "AudioSrcAdPrflRslvr";
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy mAudioProfile;
    private final androidx.camera.video.AudioSpec mAudioSpec;

    public AudioSettingsAudioProfileResolver(@androidx.annotation.NonNull androidx.camera.video.AudioSpec r1, @androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy r2) {
            r0 = this;
            r0.<init>()
            r0.mAudioSpec = r1
            r0.mAudioProfile = r2
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
            androidx.camera.video.AudioSpec r3 = r8.mAudioSpec
            android.util.Range r3 = r3.getSampleRate()
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r4 = r8.mAudioProfile
            int r4 = r4.getChannels()
            r5 = -1
            java.lang.String r6 = "AudioSrcAdPrflRslvr"
            if (r2 != r5) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Resolved AUDIO channel count from AudioProfile: "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            androidx.camera.core.Logger.d(r6, r2)
            r2 = r4
            goto L5a
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = ", Resolved Channel Count: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = "]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            androidx.camera.core.Logger.d(r6, r4)
        L5a:
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r4 = r8.mAudioProfile
            int r4 = r4.getSampleRate()
            int r3 = androidx.camera.video.internal.config.AudioConfigUtil.selectSampleRateOrNearestSupported(r3, r2, r1, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Using resolved AUDIO sample rate or nearest supported from AudioProfile: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r7 = "Hz. [AudioProfile sample rate: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = "Hz]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            androidx.camera.core.Logger.d(r6, r4)
            androidx.camera.video.internal.audio.AudioSettings$Builder r4 = androidx.camera.video.internal.audio.AudioSettings.builder()
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r4.setAudioSource(r0)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setAudioFormat(r1)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setChannelCount(r2)
            androidx.camera.video.internal.audio.AudioSettings$Builder r0 = r0.setSampleRate(r3)
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
