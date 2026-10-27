package androidx.camera.video.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api24Impl {
    private Api24Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.DoNotInline
    public static int getClientAudioSessionId(@androidx.annotation.NonNull android.media.AudioRecordingConfiguration r0) {
            int r0 = r0.getClientAudioSessionId()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static int getTimestamp(@androidx.annotation.NonNull android.media.AudioRecord r0, @androidx.annotation.NonNull android.media.AudioTimestamp r1, int r2) {
            int r0 = r0.getTimestamp(r1, r2)
            return r0
    }
}
