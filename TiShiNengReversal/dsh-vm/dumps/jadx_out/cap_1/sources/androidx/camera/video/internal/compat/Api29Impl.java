package androidx.camera.video.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api29Impl {
    private Api29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.DoNotInline
    public static android.media.AudioRecordingConfiguration getActiveRecordingConfiguration(@androidx.annotation.NonNull android.media.AudioRecord r0) {
            android.media.AudioRecordingConfiguration r0 = r0.getActiveRecordingConfiguration()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static boolean isClientSilenced(@androidx.annotation.NonNull android.media.AudioRecordingConfiguration r0) {
            boolean r0 = r0.isClientSilenced()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static void registerAudioRecordingCallback(@androidx.annotation.NonNull android.media.AudioRecord r0, @androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.media.AudioManager.AudioRecordingCallback r2) {
            r0.registerAudioRecordingCallback(r1, r2)
            return
    }

    @androidx.annotation.DoNotInline
    public static void unregisterAudioRecordingCallback(@androidx.annotation.NonNull android.media.AudioRecord r0, @androidx.annotation.NonNull android.media.AudioManager.AudioRecordingCallback r1) {
            r0.unregisterAudioRecordingCallback(r1)
            return
    }
}
