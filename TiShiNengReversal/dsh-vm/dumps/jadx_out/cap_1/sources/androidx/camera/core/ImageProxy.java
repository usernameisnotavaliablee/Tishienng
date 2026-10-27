package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageProxy extends java.lang.AutoCloseable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PlaneProxy {
        @androidx.annotation.NonNull
        java.nio.ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    @androidx.annotation.NonNull
    android.graphics.Rect getCropRect();

    int getFormat();

    int getHeight();

    @androidx.annotation.Nullable
    @androidx.camera.core.ExperimentalGetImage
    android.media.Image getImage();

    @androidx.annotation.NonNull
    androidx.camera.core.ImageInfo getImageInfo();

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"ArrayReturn"})
    androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(@androidx.annotation.Nullable android.graphics.Rect r1);

    @androidx.annotation.NonNull
    android.graphics.Bitmap toBitmap();
}
