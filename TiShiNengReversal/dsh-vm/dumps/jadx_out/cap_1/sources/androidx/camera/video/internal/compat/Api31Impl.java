package androidx.camera.video.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(31)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api31Impl {
    private Api31Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.DoNotInline
    public static android.util.Range<java.lang.Integer>[] getInputChannelCountRanges(@androidx.annotation.NonNull android.media.MediaCodecInfo.AudioCapabilities r0) {
            android.util.Range[] r0 = r0.getInputChannelCountRanges()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static int getMinInputChannelCount(@androidx.annotation.NonNull android.media.MediaCodecInfo.AudioCapabilities r0) {
            int r0 = r0.getMinInputChannelCount()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static void setContext(@androidx.annotation.NonNull android.media.AudioRecord.Builder r0, @androidx.annotation.NonNull android.content.Context r1) {
            r0.setContext(r1)
            return
    }
}
