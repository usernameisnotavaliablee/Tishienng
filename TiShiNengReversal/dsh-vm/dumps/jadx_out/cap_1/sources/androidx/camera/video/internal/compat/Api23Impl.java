package androidx.camera.video.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api23Impl {
    private Api23Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    @androidx.annotation.DoNotInline
    public static android.media.AudioRecord build(@androidx.annotation.NonNull android.media.AudioRecord.Builder r0) {
            android.media.AudioRecord r0 = r0.build()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.DoNotInline
    public static android.media.AudioRecord.Builder createAudioRecordBuilder() {
            android.media.AudioRecord$Builder r0 = new android.media.AudioRecord$Builder
            r0.<init>()
            return r0
    }

    @androidx.annotation.DoNotInline
    public static void setAudioFormat(@androidx.annotation.NonNull android.media.AudioRecord.Builder r0, @androidx.annotation.NonNull android.media.AudioFormat r1) {
            r0.setAudioFormat(r1)
            return
    }

    @androidx.annotation.DoNotInline
    public static void setAudioSource(@androidx.annotation.NonNull android.media.AudioRecord.Builder r0, int r1) {
            r0.setAudioSource(r1)
            return
    }

    @androidx.annotation.DoNotInline
    public static void setBufferSizeInBytes(@androidx.annotation.NonNull android.media.AudioRecord.Builder r0, int r1) {
            r0.setBufferSizeInBytes(r1)
            return
    }
}
