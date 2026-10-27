package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface EncoderCallback {
    public static final androidx.camera.video.internal.encoder.EncoderCallback EMPTY = null;


    static {
            androidx.camera.video.internal.encoder.EncoderCallback$1 r0 = new androidx.camera.video.internal.encoder.EncoderCallback$1
            r0.<init>()
            androidx.camera.video.internal.encoder.EncoderCallback.EMPTY = r0
            return
    }

    void onEncodeError(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodeException r1);

    void onEncodePaused();

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r1);

    void onOutputConfigUpdate(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.OutputConfig r1);
}
