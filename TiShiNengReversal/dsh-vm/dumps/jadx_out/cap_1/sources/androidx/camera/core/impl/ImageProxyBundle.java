package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageProxyBundle {
    @androidx.annotation.NonNull
    java.util.List<java.lang.Integer> getCaptureIds();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int r1);
}
