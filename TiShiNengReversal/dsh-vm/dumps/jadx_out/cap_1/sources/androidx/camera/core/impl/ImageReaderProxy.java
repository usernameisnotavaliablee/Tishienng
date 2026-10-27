package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageReaderProxy {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnImageAvailableListener {
        void onImageAvailable(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r1);
    }

    @androidx.annotation.Nullable
    androidx.camera.core.ImageProxy acquireLatestImage();

    @androidx.annotation.Nullable
    androidx.camera.core.ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    @androidx.annotation.Nullable
    android.view.Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2);
}
