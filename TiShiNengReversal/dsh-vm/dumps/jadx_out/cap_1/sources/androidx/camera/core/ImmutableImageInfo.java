package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ImmutableImageInfo implements androidx.camera.core.ImageInfo {
    public ImmutableImageInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.ImageInfo create(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r6, long r7, int r9, @androidx.annotation.NonNull android.graphics.Matrix r10) {
            androidx.camera.core.AutoValue_ImmutableImageInfo r0 = new androidx.camera.core.AutoValue_ImmutableImageInfo
            r1 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public abstract android.graphics.Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r2) {
            r1 = this;
            int r0 = r1.getRotationDegrees()
            r2.setOrientationDegrees(r0)
            return
    }
}
