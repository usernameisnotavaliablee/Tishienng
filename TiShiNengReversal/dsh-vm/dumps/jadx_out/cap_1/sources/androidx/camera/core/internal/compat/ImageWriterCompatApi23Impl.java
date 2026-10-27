package androidx.camera.core.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageWriterCompatApi23Impl {
    private ImageWriterCompatApi23Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    static void close(android.media.ImageWriter r0) {
            r0.close()
            return
    }

    @androidx.annotation.NonNull
    static android.media.Image dequeueInputImage(@androidx.annotation.NonNull android.media.ImageWriter r0) {
            android.media.Image r0 = r0.dequeueInputImage()
            return r0
    }

    @androidx.annotation.NonNull
    static android.media.ImageWriter newInstance(@androidx.annotation.NonNull android.view.Surface r0, @androidx.annotation.IntRange(from = 1) int r1) {
            android.media.ImageWriter r0 = android.media.ImageWriter.newInstance(r0, r1)
            return r0
    }

    static void queueInputImage(@androidx.annotation.NonNull android.media.ImageWriter r0, @androidx.annotation.NonNull android.media.Image r1) {
            r0.queueInputImage(r1)
            return
    }
}
