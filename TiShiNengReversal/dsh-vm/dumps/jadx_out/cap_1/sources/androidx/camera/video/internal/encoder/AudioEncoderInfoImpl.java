package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AudioEncoderInfoImpl extends androidx.camera.video.internal.encoder.EncoderInfoImpl implements androidx.camera.video.internal.encoder.AudioEncoderInfo {
    private final android.media.MediaCodecInfo.AudioCapabilities mAudioCapabilities;

    AudioEncoderInfoImpl(@androidx.annotation.NonNull android.media.MediaCodecInfo r1, @androidx.annotation.NonNull java.lang.String r2) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            r0 = this;
            r0.<init>(r1, r2)
            android.media.MediaCodecInfo$CodecCapabilities r1 = r0.mCodecCapabilities
            android.media.MediaCodecInfo$AudioCapabilities r1 = r1.getAudioCapabilities()
            java.util.Objects.requireNonNull(r1)
            r0.mAudioCapabilities = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.AudioEncoderInfoImpl from(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.AudioEncoderConfig r2) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            androidx.camera.video.internal.encoder.AudioEncoderInfoImpl r0 = new androidx.camera.video.internal.encoder.AudioEncoderInfoImpl
            android.media.MediaCodecInfo r1 = androidx.camera.video.internal.encoder.EncoderInfoImpl.findCodecAndGetCodecInfo(r2)
            java.lang.String r2 = r2.getMimeType()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getBitrateRange() {
            r1 = this;
            android.media.MediaCodecInfo$AudioCapabilities r0 = r1.mAudioCapabilities
            android.util.Range r0 = r0.getBitrateRange()
            return r0
    }
}
