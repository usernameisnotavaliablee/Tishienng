package androidx.camera.core.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(@androidx.annotation.NonNull android.media.ImageWriter r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.close(r3)
            return
        La:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to call close() on API "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". Version 23 or higher required."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public static android.media.Image dequeueInputImage(@androidx.annotation.NonNull android.media.ImageWriter r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.media.Image r3 = androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.dequeueInputImage(r3)
            return r3
        Lb:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to call dequeueInputImage() on API "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ". Version 23 or higher required."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public static android.media.ImageWriter newInstance(@androidx.annotation.NonNull android.view.Surface r2, @androidx.annotation.IntRange(from = 1) int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.media.ImageWriter r2 = androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.newInstance(r2, r3)
            return r2
        Lb:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Unable to call newInstance(Surface, int) on API "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ". Version 23 or higher required."
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    public static android.media.ImageWriter newInstance(@androidx.annotation.NonNull android.view.Surface r2, @androidx.annotation.IntRange(from = 1) int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.media.ImageWriter r2 = androidx.camera.core.internal.compat.ImageWriterCompatApi29Impl.newInstance(r2, r3, r4)
            return r2
        Lb:
            r1 = 26
            if (r0 < r1) goto L14
            android.media.ImageWriter r2 = androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.newInstance(r2, r3, r4)
            return r2
        L14:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to call newInstance(Surface, int, int) on API "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ". Version 26 or higher required."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void queueInputImage(@androidx.annotation.NonNull android.media.ImageWriter r2, @androidx.annotation.NonNull android.media.Image r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.queueInputImage(r2, r3)
            return
        La:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Unable to call queueInputImage() on API "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ". Version 23 or higher required."
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }
}
