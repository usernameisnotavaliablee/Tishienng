package androidx.camera.view.transform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.view.TransformExperimental
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OutputTransform {

    @androidx.annotation.NonNull
    final android.graphics.Matrix mMatrix;

    @androidx.annotation.NonNull
    final android.util.Size mViewPortSize;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public OutputTransform(@androidx.annotation.NonNull android.graphics.Matrix r1, @androidx.annotation.NonNull android.util.Size r2) {
            r0 = this;
            r0.<init>()
            r0.mMatrix = r1
            r0.mViewPortSize = r2
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.Matrix getMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrix
            return r0
    }

    @androidx.annotation.NonNull
    android.util.Size getViewPortSize() {
            r1 = this;
            android.util.Size r0 = r1.mViewPortSize
            return r0
    }
}
