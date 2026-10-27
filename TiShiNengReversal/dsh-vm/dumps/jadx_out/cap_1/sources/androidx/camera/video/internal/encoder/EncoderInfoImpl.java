package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class EncoderInfoImpl implements androidx.camera.video.internal.encoder.EncoderInfo {
    protected final android.media.MediaCodecInfo.CodecCapabilities mCodecCapabilities;
    private final android.media.MediaCodecInfo mMediaCodecInfo;

    EncoderInfoImpl(@androidx.annotation.NonNull android.media.MediaCodecInfo r4, @androidx.annotation.NonNull java.lang.String r5) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            r3 = this;
            r3.<init>()
            r3.mMediaCodecInfo = r4
            android.media.MediaCodecInfo$CodecCapabilities r4 = r4.getCapabilitiesForType(r5)     // Catch: java.lang.RuntimeException -> Lf
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.RuntimeException -> Lf
            r3.mCodecCapabilities = r4     // Catch: java.lang.RuntimeException -> Lf
            return
        Lf:
            r4 = move-exception
            androidx.camera.video.internal.encoder.InvalidConfigException r0 = new androidx.camera.video.internal.encoder.InvalidConfigException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to get CodecCapabilities for mime: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    @androidx.annotation.NonNull
    static android.media.MediaCodecInfo findCodecAndGetCodecInfo(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderConfig r1) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            androidx.camera.video.internal.workaround.EncoderFinder r0 = new androidx.camera.video.internal.workaround.EncoderFinder
            r0.<init>()
            android.media.MediaFormat r1 = r1.toMediaFormat()
            android.media.MediaCodec r1 = r0.findEncoder(r1)
            android.media.MediaCodecInfo r0 = r1.getCodecInfo()
            r1.release()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @androidx.annotation.NonNull
    public java.lang.String getName() {
            r1 = this;
            android.media.MediaCodecInfo r0 = r1.mMediaCodecInfo
            java.lang.String r0 = r0.getName()
            return r0
    }
}
