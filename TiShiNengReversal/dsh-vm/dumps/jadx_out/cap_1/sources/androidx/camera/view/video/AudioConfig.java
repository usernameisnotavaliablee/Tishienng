package androidx.camera.view.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AudioConfig {

    @androidx.annotation.NonNull
    public static final androidx.camera.view.video.AudioConfig AUDIO_DISABLED = null;
    private final boolean mIsAudioEnabled;

    static {
            androidx.camera.view.video.AudioConfig r0 = new androidx.camera.view.video.AudioConfig
            r1 = 0
            r0.<init>(r1)
            androidx.camera.view.video.AudioConfig.AUDIO_DISABLED = r0
            return
    }

    AudioConfig(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mIsAudioEnabled = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public static androidx.camera.view.video.AudioConfig create(boolean r1) {
            androidx.camera.view.video.AudioConfig r0 = new androidx.camera.view.video.AudioConfig
            r0.<init>(r1)
            return r0
    }

    public boolean getAudioEnabled() {
            r1 = this;
            boolean r0 = r1.mIsAudioEnabled
            return r0
    }
}
