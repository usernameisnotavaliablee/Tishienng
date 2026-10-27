package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ImageInfo {
    int getRotationDegrees();

    @androidx.annotation.NonNull
    android.graphics.Matrix getSensorToBufferTransformMatrix();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    void populateExifData(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r1);
}
