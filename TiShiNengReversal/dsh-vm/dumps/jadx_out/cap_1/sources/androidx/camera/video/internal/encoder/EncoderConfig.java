package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface EncoderConfig {
    public static final int CODEC_PROFILE_NONE = -1;

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Timebase getInputTimebase();

    @androidx.annotation.NonNull
    java.lang.String getMimeType();

    int getProfile();

    @androidx.annotation.NonNull
    android.media.MediaFormat toMediaFormat() throws androidx.camera.video.internal.encoder.InvalidConfigException;
}
