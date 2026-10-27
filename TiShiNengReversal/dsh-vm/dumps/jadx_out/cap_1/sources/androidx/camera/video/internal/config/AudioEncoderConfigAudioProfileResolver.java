package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioEncoderConfigAudioProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.AudioEncoderConfig> {
    private static final java.lang.String TAG = "AudioEncAdPrflRslvr";
    private final int mAudioProfile;
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy mAudioProfileProxy;
    private final androidx.camera.video.internal.audio.AudioSettings mAudioSettings;
    private final androidx.camera.video.AudioSpec mAudioSpec;
    private final androidx.camera.core.impl.Timebase mInputTimebase;
    private final java.lang.String mMimeType;

    public AudioEncoderConfigAudioProfileResolver(@androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r3, @androidx.annotation.NonNull androidx.camera.video.AudioSpec r4, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r5, @androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy r6) {
            r0 = this;
            r0.<init>()
            r0.mMimeType = r1
            r0.mAudioProfile = r2
            r0.mInputTimebase = r3
            r0.mAudioSpec = r4
            r0.mAudioSettings = r5
            r0.mAudioProfileProxy = r6
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.encoder.AudioEncoderConfig get() {
            r7 = this;
            java.lang.String r0 = "AudioEncAdPrflRslvr"
            java.lang.String r1 = "Using resolved AUDIO bitrate from AudioProfile"
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.video.AudioSpec r0 = r7.mAudioSpec
            android.util.Range r6 = r0.getBitrate()
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r0 = r7.mAudioProfileProxy
            int r1 = r0.getBitrate()
            androidx.camera.video.internal.audio.AudioSettings r0 = r7.mAudioSettings
            int r2 = r0.getChannelCount()
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r0 = r7.mAudioProfileProxy
            int r3 = r0.getChannels()
            androidx.camera.video.internal.audio.AudioSettings r0 = r7.mAudioSettings
            int r4 = r0.getSampleRate()
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r0 = r7.mAudioProfileProxy
            int r5 = r0.getSampleRate()
            int r0 = androidx.camera.video.internal.config.AudioConfigUtil.scaleAndClampBitrate(r1, r2, r3, r4, r5, r6)
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = androidx.camera.video.internal.encoder.AudioEncoderConfig.builder()
            java.lang.String r2 = r7.mMimeType
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = r1.setMimeType(r2)
            int r2 = r7.mAudioProfile
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = r1.setProfile(r2)
            androidx.camera.core.impl.Timebase r2 = r7.mInputTimebase
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = r1.setInputTimebase(r2)
            androidx.camera.video.internal.audio.AudioSettings r2 = r7.mAudioSettings
            int r2 = r2.getChannelCount()
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = r1.setChannelCount(r2)
            androidx.camera.video.internal.audio.AudioSettings r2 = r7.mAudioSettings
            int r2 = r2.getSampleRate()
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r1 = r1.setSampleRate(r2)
            androidx.camera.video.internal.encoder.AudioEncoderConfig$Builder r0 = r1.setBitrate(r0)
            androidx.camera.video.internal.encoder.AudioEncoderConfig r0 = r0.build()
            return r0
    }

    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.video.internal.encoder.AudioEncoderConfig get() {
            r1 = this;
            androidx.camera.video.internal.encoder.AudioEncoderConfig r0 = r1.get()
            return r0
    }
}
