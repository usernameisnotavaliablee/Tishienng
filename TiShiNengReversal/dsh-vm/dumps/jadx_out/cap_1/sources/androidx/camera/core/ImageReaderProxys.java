package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.ImageReaderProxy createIsolatedReader(int r0, int r1, int r2, int r3) {
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r1, r2, r3)
            androidx.camera.core.AndroidImageReaderProxy r1 = new androidx.camera.core.AndroidImageReaderProxy
            r1.<init>(r0)
            return r1
    }
}
