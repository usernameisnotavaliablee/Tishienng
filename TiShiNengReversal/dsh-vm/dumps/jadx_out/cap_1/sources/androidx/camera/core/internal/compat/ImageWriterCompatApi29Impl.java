package androidx.camera.core.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static android.media.ImageWriter newInstance(@androidx.annotation.NonNull android.view.Surface r0, @androidx.annotation.IntRange(from = 1) int r1, int r2) {
            android.media.ImageWriter r0 = android.media.ImageWriter.newInstance(r0, r1, r2)
            return r0
    }
}
